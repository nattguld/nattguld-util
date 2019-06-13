# nattguld-util
## About
General utility library handling:
- Chrono (date, time, timestamps, formatting, parsing, ...)
- Locales (country, language)
- Hashing
- File handling
- Generics
- Logging
- Maths operations
- Image Editing
- Various other handy functionalities

## Examples
### Converter
```java
String base64 = Converter.toBase64(File img);
String hex = bytesToHex(byte[] bytes);
```

### Misc
```java
Misc.openLink(String url);
Misc.sleep(long ms);
String mac = randomMACAddress();
```

### Chrono
```java
DateTime dt = new DateTime();
DateTime dt = new DateTime(int offset);
DateTime dt = new DateTime(long ms, int offset);
DateTime dt = new DateTime(long ms);
DateTime dt = new DateTime(long ms, ZoneId zoneId);
DateTime dt = new DateTime(LocalDateTime ldt, ZoneDateTime zdt);
DateTime dt = new DateTime(String input, String format);
//dt.isBefore(DateTime dt), dt.isAfter(DateTime dt), dt.isBetween(DT from, DT to), dt.isInRange(params), dt.getMilliseconds(), dt.getUnixMilliseconds(), dt.getSecond(), dt.getMinute(), dt.getHour(), dt.getDay(), dt.getMonth(), dt.getYear(), dt.getPeriodTillToday(), dt.isSameDay(DT), dt.isToday()

String s = DateTimeUtil.getCurrentTime(); //Locale format
String s = DateTimeUtil.getCurrentDate(); //Locale format
String s = DateTimeUtil.getCurrentDateTime(); //Locale format
String s = DateTimeUtil.formatTime(LocalDateTime ldt, String timeFormat);
String s = DateTimeUtil.formatDate(LocalDateTime ldt, String dateFormat);
String s = DateTimeUtil.formatDateTime(LocalDateTime ldt, String dateFormat, String timeFormat, Delimeter delimeter);
String s = DateTimeUtil.formatTime(LocalDateTime ldt);
String s = DateTimeUtil.formatDate(LocalDateTime ldt);
String s = DateTimeUtil.formatDateTime(LocalDateTime ldt);

Clock clock = DateTimeUtil.getDefaultClock();
Clock clock = DateTimeUtil.getClockForCountry(Country country);

DateFormat df = DateTimeUtil.getDefaultDateFormat();
DateFormat df = DateTimeUtil.getDateFormatForCountry(Country country);

//Formats can be built with the DateFormat & TimeFormat enum
DateFormat.getFormat(Delimeter delimeter);
TimeFormat.getFormat(Clock clock, Delimeter delimeter);

LocalDateTime parseTime(String input, String format);
LocalDateTime parseDate(String input, String format);
LocalDateTime parseDateTime(String input, String dateFormat, String timeFormat, Delimeter dateTimeDelimeter);
```

### Files
```java
FileContainer fc = new FileContainer(String dirPath); //See generics > container for methods

FileOperations.getSafeFileName(String fileName);
String ext = FileOperations.getExtension(File f);
File out = FileOperations.addRandomBytes(File in, File out);
FileOperations.deleteAllFile(File dir, boolean includeFolders);

File out = FileOperations.move(String inPath, String outPath);
File out = FileOperations.move(File in, File out);

File out = FileOperations.copy(String inPath, String outPath);
File out = FileOperations.copy(File in, File out);

String content = FileOperations.getContent(String filePath);
List<String> lines = FileOperations.read(String filePath);

FileOperations.write(String path, List<String> lines, boolean append);
FileOperations.write(String path, String[] lines, boolean append);
FileOperations.write(String path, String line, boolean append);

MimeType mt = MimeType.getByFile(File f);
MimeType mt = MimeType.getByFileExtension(String ext);
MimeType mt = MimeType.getByName(String mimeTypeName);
MimeType enum (isImage(), isVideo(), isText(), isAudio(), getName(), getFileExtension())
```

### Generics
```java
Attributes a = new Attributes();
a.put(String key, Object value);
boolean result = a.has(String key);
Object result = a.get(String key);
Object result = a.get(String key, Object defaultValue);
String result = a.getAsString(String key, String defaultValue);
//getAsBoolean(params), getAsChar(params), getAsByte(params), getAsFloat(params), getAsDouble(params), getAsInt(params), getAsLong(params)

Container<T> container = new Container<T>();
container.add(T element);
container.resetDeque();
T element = container.next();

CustomizableArrayList<T> list = new CustomizableArrayList<T>();
list.replace(T original, T newElement);
list.moveUp(T element);
list.moveDown(T element);

KeyValuePair<T, V> kvp = new KeyValuePair<>();
T key = kvp.getKey(); //getKeyAsString(), getKeyAsChar(), getKeyAsByte(), ...
V value = kvp.getValue(); //getValueAsString(), getValueAsChar(), ...
```

### Hashing
```java
String hash = Hasher.md5(File f);
String hash = Hasher.md5(String input);
String hash = Hasher
//TODO
```

### Locale
```java
Country cr = Country.BELGIUM;
String name = cr.getName();
String code = cr.getCode();
String continent = cr.getContinent();
String[] regions = cr.getRegions();
Language[] langs = cr.getLanguages();

boolean result = cr.hasLanguage(Language lang);
Country cr = Country.getCountryByName(String name);
Country cr = Country.getCountryByCode(String code);

String code = Language.getCode();
```

### Logging
```java
Logger logger = new Logger(String name);
logger.info(String msg);
logger.debug(String msg);
logger.warning(String msg);
logger.error(String msg);
logger.exception(Exception ex);
logger.dump(String fileName, String content);

Logger.setBaseDir(String path); //Writing log files to specified directory
Logger.setDebugging(boolean debug); //Won't display debug logs if turned off
```

### Maths
```java
float f = Maths.parseFloat(String value, float defaultValue); //parseDouble, parseInt, parseLong
boolean result = Maths.isInteger(String value); //isDouble, isLong, isFloat
int i = Maths.hexToInteger(String hex);
int random = Maths.random(int range);
int random = Maths.random(new Range(int min, int max);

Range range = new Range(int min, int max);
boolean result = range.isInRange();

int digit = Luhn.generateChecksumDigit(String number);
boolean valid = Luhn.isValid(String number);
```

### Text
```java
TextUtil.copyToClipboard(String input);
String out = TextUtil.capitalize(String input);
String out = TextUtil.capitalize(String input, String delimeter);
String out = TextUtil.randomString(int minSize, int maxSize, TextSeed... seeds);
//TextSeed.DIGITS, TextSeed.LOWERCASE, TextSeed.UPPERCASE, TextSeed.SYMBOLS
String out = TextUtil.spintax(String input);
boolean result = TextUtil.isLetters(String input);
boolean result = TextUtil.isDigits(String input);
```

### Image Editing
```java
File out = MediaOperations.pngToJpg(File in);
Dimension dim = MediaOperations.getScaledDimension(Dimension original, Dimension targetDim);
Dimension dim = MediaOperations.getCroppedDimension(Dimension original, AspectRatio.EXAMPLE);


ImageEditOperation op = new ImageResize(File in, File out, int width, int height, boolena keepAspectRatio);
ImageEditOperation op = new ImageTransform(File in, File out, AspectRation ratio);
ImageEditOperation op = new ImageWatermark(File in, File out, File watermark);
ImageEditOperation op = new TextWatermark(File in, File out, ScreenPosition wmPos, Font font, float fontSize, int transparency, Color color, String text);

File out = op.performOperation();

```
