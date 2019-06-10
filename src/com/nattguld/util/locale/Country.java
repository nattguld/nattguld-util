package com.nattguld.util.locale;

import java.util.Objects;

import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public enum Country {
	
	ALAND_ISLANDS(261, "Aland Islands", "AX", "na"
			, new String[]{}
			, new Language[] {}),
	
	ALBANIA(262, "Albania", "AL", "Europe"
			, new String[]{"Berat", "Bulqizë", "Delvinë", "Devoll", "Dibër", "Durrës", "Elbasan", "Fier", "Gjirokastër", "Gramsh"
					, "Has", "Kavajë", "Kolonjë", "Korçë", "Krujë", "Kuçovë", "Kukës", "Kurbin", "Lezhë", "Librazhd", "Lushnjë"
					, "Malësi e Madhe", "Mallakastër", "Mat", "Mirditë", "Peqin", "Përmet", "Pogradec", "Pukë", "Sarandë", "Shkodër", "Skrapar", "Tepelenë", "Tiranë", "Tropojë", "Vlorë"}
			, new Language[] {Language.ALBANIAN}),
	
	ALGERIA(3, "Algeria", "DZ", "Africa"
			, new String[]{"Adrar", "Aïn Defla", "Aïn Témouchent", "Alger", "Annaba", "Batna", "Béchar", "Béjaïa", "Biskra"
					, "Blida", "Bordj Bou Arréridj", "Bouira", "Boumerdès", "Chlef", "Constantine", "Djelfa", "El Bayadh", "El Oued"
					, "El Tarf", "Ghardaïa", "Guelma", "Illizi", "Jijel", "Khenchela", "Laghouat", "Mascara", "Médéa", "Mila"
					, "Mostaganem", "Msila", "Naama", "Oran", "Ouargla", "Oum el Bouaghi", "Relizane", "Saïda", "Sétif", "Sidi Bel Abbès"
					, "Skikda", "Souk Ahras", "Tamanghasset", "Tébessa", "Tiaret", "Tindouf", "Tipaza", "Tissemsilt", "Tizi Ouzou", "Tlemcen"}
			, new Language[] {Language.ARABIC}),
	
	AMERICAN_SAMOA(4, "American Samoa", "AS", "north america"
			, new String[]{""}
			, new Language[] {}),
	
	ANDORRA(263, "Andorra", "AD", "Europe"
			, new String[]{"Andorra la Vella", "Canillo", "Encamp", "Escaldes-Engordany", "La Massana", "Ordino", "Sant Julià de Lòria"}
			, new Language[] {Language.CATALAN}),
	
	
	ANGOLA(264, "Angola", "AO", "Africa"
			, new String[]{"Bengo", "Benguela", "Bié", "Cabinda", "Cuando-Cubango", "Cuanza Norte", "Cuanza Sul", "Cunene", "Huambo"
					, "Huíla", "Luanda", "Lunda Norte", "Lunda Sul", "Malange", "Moxico", "Namibe", "Uíge", "Zaire"}
			, new Language[] {Language.PORTUGUESE}),
	
	ANGUILLA(265, "Anguilla", "AI", "South America"
			, new String[]{""}
			, new Language[] {}),
	
	ANTARCTICA(8, "Antarctica", "AQ", "Antarctica"
			, new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	ANTIGUA_AND_BARBUDA(355, "Antigua and Barbuda", "AG", "South America"
			, new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	ARGENTINA(10, "Argentina", "AR", "south america"
			, new String[]{"Buenos Aires", "Capital federal", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos"
					, "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan"
					, "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucumán"}
			, new Language[] {Language.SPANISH}),
	
	ARMENIA(266, "Armenia", "AM", "Asia"
			, new String[]{"Aragacotn", "Ararat", "Armavir", "Erevan", "Gegark'unik'", "Kotayk'", "Lory", "Širak", "Syunik'", "Tavuš", "Vayoc Jor"}
			, new Language[] {Language.ARMENIAN}),
	
	ARUBA(12, "Aruba", "AW", "South America"
			, new String[]{""}
			, new Language[] {}),
	
	AUSTRALIA(14, "Australia", "AU", "Oceania"
			, new String[]{"Australian Capital Territory", "New South Wales", "Northern Territory", "Queensland", "South Australia", "Tasmania", "Victoria", "Western Australia"}
			, new Language[] {Language.ENGLISH}),
	
	AUSTRIA(15, "Austria", "AT", "Europe"
			, new String[]{"Burgenland", "Kärnten", "Niederösterreich", "Oberösterreich", "Salzburg", "Steiermark", "Tirol", "Vorarlberg", "Wien"}
			, new Language[] {Language.GERMAN}),
	
	AZERBAIJAN(267, "Azerbaijan", "AZ", "asia"
			, new String[]{"Abseron", "Agcabädi", "Agdam", "Agdas", "Agstafa", "Agsu", "Äli Bayramli", "Astara", "Babäk", "Baki", "Balakän"
					, "Bärdä", "Beyläqan", "Biläsuvar", "Cäbrayil", "Cälilabab", "Culfa", "Daskäsän", "Däväçi", "Füzuli", "Gädäbäy", "Gäncä"
					, "Goranboy", "Göyçay", "Haciqabul", "Imisli", "Ismayilli", "Kälbäcär", "Kürdämir", "Laçin", "Länkäran", "Länkäran"
					, "Lerik", "Masalli", "Mingäçevir", "Naftalan", "Neftçala", "Oguz", "Ordubad", "Qäbälä", "Qax", "Qazax", "Qobustan"
					, "Quba", "Qubadli", "Qusar", "Saatli", "Sabirabad", "Sädäräk", "Sahbuz", "Säki", "Säki", "Salyan", "Samaxi", "Sämkir"
					, "Samux", "Särur", "Siyäzän", "Sumqayit", "Susa", "Susa", "Tärtär", "Tovuz", "Ucar", "Xaçmaz", "Xankändi", "Xanlar"
					, "Xizi", "Xocali", "Xocavänd", "Yardimli", "Yevlax", "Yevlax", "Zängilan", "Zaqatala", "Zärdab"}
			, new Language[] {Language.AZERBAIJANI}),
	
	BAHAMAS(17, "Bahamas", "BS", "South America"
			, new String[]{"Acklins and Crooked Islands", "Bimini", "Cat Island", "Exuma", "Freeport", "Fresh Creek", "Governor's Harbour"
					, "Green Turtle Cay", "Harbour Island", "High Rock", "Inagua", "Kemps Bay", "Long Island", "Marsh Harbour", "Mayaguana"
					, "New Providence", "Nicholls Town and Berry Islands", "Ragged Island", "Rock Sound", "Sandy Point", "San Salvador and Rum Cay"}
			, new Language[] {Language.ENGLISH}),
	
	BAHRAIN(356, "Bahrain", "BH", "asia"
			, new String[]{"Al Hadd", "Al Manamah", "Al Mintaqah al Gharbiyah", "Al Mintaqah al Wustá", "Al Mintaqah ash Shamaliyah", "Al Muharraq"
					, "Ar Rifa", "Jidd Hafs", "Madinat Hamad", "Madinat `Isá", "Mintaqat Juzur Hawar", "Sitrah"}
			, new Language[] {Language.ARABIC}),
	
	BANGLADESH(20, "Bangladesh", "BD", "asia"
			, new String[]{"Bagerhat zila", "Bandarban zila", "Barguna zila", "Barisal zila", "Bhola zila", "Bogra zila", "Brahmanbaria zila"
					, "Chandpur zila", "Chittagong zila", "Chuadanga zila", "Comilla zila", "Cox's Bazar zila", "Dhaka zila", "Dinajpur zila"
					, "Faridpur zila", "Feni zila", "Gaibandha zila", "Gazipur zila", "Gopalganj zila", "Habiganj zila", "Jaipurhat zila"
					, "Jamalpur zila", "Jessore zila", "Jhalakati zila", "Jhenaidah zila", "Khagrachari zila", "Khulna zila", "Kishoreganj zila"
					, "Kurigram zila", "Kushtia zila", "Lakshmipur zila", "Lalmonirhat zila", "Madaripur zila", "Magura zila", "Manikganj zila"
					, "Meherpur zila", "Moulvibazar zila", "Munshiganj zila", "Mymensingh zila", "Naogaon zila", "Narail zila", "Narayanganj zila"
					, "Narsingdi zila", "Natore zila", "Nawabganj zila", "Netrakona zila", "Nilphamari zila", "Noakhali zila", "Pabna zila"
					, "Panchagarh zila", "Patuakhali zila", "Pirojpur zila", "Rajbari zila", "Rajshahi zila", "Rangamati zila", "Rangpur zila"
					, "Satkhira zila", "Shariatpur zila", "Sherpur zila", "Sirajganj zila", "Sunamganj zila", "Sylhet zila", "Tangail zila", "Thakurgaon zila"}
			, new Language[] {Language.BANGLA}),
	
	BARBADOS(21, "Barbados", "BB", "South America"
			, new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	BELARUS(357, "Belarus", "BY", "Europe"
			, new String[]{"Brestskaya voblasts' (be) Brestskaya oblast' (ru)", "Homyel'skaya voblasts' (be) Gomel'skaya oblast' (ru)"
					, "Hrodzenskaya voblasts' (be) Grodnenskaya oblast' (ru)", "Mahilyowskaya voblasts' (be) Mogilevskaya oblast' (ru)"
					, "Minskaya voblasts' (be) Minskaya oblast' (ru)", "Vitsyebskaya voblasts' (be) Vitebskaya oblast' (ru)"}
			, new Language[] {Language.BELARUSIAN}),
	
	BELGIUM(24, "Belgium", "BE", "Europe"
			, new String[]{"Antwerpen (nl)", "Brabant Wallon (fr)", "Hainaut (fr)", "Liège (fr)", "Limburg (nl)", "Luxembourg (fr)"
					, "Namur (fr)", "Oost-Vlaanderen (nl)", "Vlaams Brabant (nl)", "West-Vlaanderen (nl)"}
			, new Language[] {Language.DUTCH, Language.FRENCH}),
	
	BELIZE(25, "Belize", "BZ", "South America"
			, new String[]{"Belize", "Cayo", "Corozal", "Orange Walk", "Stann Creek", "Toledo"}
			, new Language[] {Language.ENGLISH}),
	
	BENIN(358, "Benin", "BJ", "africa"
			, new String[]{"Alibori", "Atakora", "Atlantique", "Borgou", "Collines", "Donga", "Kouffo", "Littoral", "Mono", "Ouémé", "Plateau", "Zou"}
			, new Language[] {Language.FRENCH}),
	
	BERMUDA(27, "Bermuda", "BM", "South America"
			, new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	BHUTAN(268, "Bhutan", "BT", "asia"
			, new String[]{"Bumthang", "Chhukha", "Dagana", "Gasa", "Ha", "Lhuentse", "Monggar", "Paro", "Pemagatshel", "Punakha"
					, "Samdrup Jongkha", "Samtse", "Sarpang", "Thimphu", "Trashigang", "Trashi Yangtse", "Trongsa", "Tsirang", "Wangdue Phodrang", "Zhemgang"}
			, new Language[] {Language.NEPALI}),
	
	BOLIVIA(29, "Bolivia", "BO", "south america"
			, new String[]{"Chuquisaca", "Cochabamba", "El Beni", "La Paz", "Oruro", "Pando", "Potosí", "Santa Cruz", "Tarija"}
			, new Language[] {Language.SPANISH}),
	
	BOSNIA_AND_HERZEGOVINA(269, "Bosnia and Herzegovina", "BA", "Europe"
			, new String[]{"Federacija Bosna i Hercegovina", "Republika Srpska"}
			, new Language[] {Language.BOSNIAN, Language.CROATIAN, Language.SERBIAN}),
	
	BOTSWANA(270, "Botswana", "BW", "africa"
			, new String[]{"Central", "Ghanzi", "Kgalagadi", "Kgatleng", "Kweneng", "North-East", "North-West", "South-East", "Southern"}
			, new Language[] {Language.ENGLISH}),
	
	BOUVET_ISLAND(271, "Bouvet Island", "BV", "na"
			, new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	BRAZIL(33, "Brazil", "BR", "south america"
			, new String[]{"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão"
					, "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro"
					, "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"}
			, new Language[] {Language.PORTUGUESE}),
	
	BRITISH_INDIAN_OCEAN_TERRITORY(360, "British Indian Ocean Territory", "IO", "asia"
			, new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	BRITISH_VIRGIN_ISLANDS(350, "British Virgin Islands", "VG", "na"
			, new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	BRUNEI_DARUSSALAM(272, "Brunei Darussalam", "BN", "asia"
			, new String[]{"Belait", "Brunei-Muara", "Temburong", "Tutong"}
			, new Language[] {Language.MALAY}),
	
	BULGARIA(37, "Bulgaria", "BG", "europe"
			, new String[]{"Blagoevgrad", "Burgas", "Dobric", "Gabrovo", "Haskovo", "Jambol", "Kardžali", "Kjustendil"
					, "Lovec", "Montana", "Pazardžik", "Pernik", "Pleven", "Plovdiv", "Razgrad", "Ruse", "Silistra", "Sliven"
					, "Smoljan", "Sofija", "Sofija-Grad", "Stara Zagora", "Šumen", "Targovište", "Varna", "Veliko Tarnovo", "Vidin", "Vraca"}
			, new Language[] {Language.ENGLISH}),
	
	BURKINA_FASO(361, "Burkina Faso", "BF", "africa", new String[]{"Balé", "Bam", "Banwa", "Bazèga", "Bougouriba", "Boulgou", "Boulkiemdé"
			, "Comoé", "Ganzourgou", "Gnagna", "Gourma", "Houet", "Ioba", "Kadiogo", "Kénédougou", "Komondjari", "Kompienga", "Kossi", "Koulpélogo"
			, "Kouritenga", "Kourwéogo", "Léraba", "Loroum", "Mouhoun", "Nahouri", "Namentenga", "Nayala", "Noumbiel", "Oubritenga", "Oudalan"
			, "Passoré", "Poni", "Sanguié", "Sanmatenga", "Séno", "Sissili", "Soum", "Sourou", "Tapoa", "Tui", "Yagha", "Yatenga", "Ziro", "Zondoma", "Zoundwéogo"}
			, new Language[] {Language.ENGLISH}),
	
	BURUNDI(273, "Burundi", "BI", "africa", new String[]{"Bubanza", "Bujumbura", "Bururi", "Cankuzo", "Cibitoke", "Gitega", "Karuzi", "Kayanza"
			, "Kirundo", "Makamba", "Muramvya", "Muyinga", "Mwaro", "Ngozi", "Rutana", "Ruyigi"}
			, new Language[] {Language.FRENCH}),
	
	CAMBODIA(274, "Cambodia", "KH", "asia", new String[]{"Baat Dambang [Batdâmbâng]", "Banteay Mean Chey [Bântéay Méanchey]", "Kampong Chaam [Kâmpóng Cham]"
			, "Kampong Chhnang [Kâmpóng Chhnang]", "Kampong Spueu [Kâmpóng Spœ]", "Kampong Thum [Kâmpóng Thum]", "Kampot [Kâmpôt]", "Kandaal [Kândal]"
			, "Kaoh Kong [Kaôh Kong]", "Kracheh [Krâchéh]", "Krong Kaeb [Krong Kêb]", "Krong Pailin [Krong Pailin]", "Krong Preah Sihanouk [Krong Preah Sihanouk]"
			, "Mondol Kiri [Môndól Kiri]", "Otdar Mean Chey [Otdâr Méanchey] ", "Phnom Penh [Phnum Pénh]", "Pousaat [Pouthisat]", "Preah Vihear [Preah Vihéar]"
			, "Prey Veaeng [Prey Vêng]", "Rotanak Kiri [Rôtânôkiri]", "Siem Reab [Siemréab]", "Stueng Traeng [Stœng Trêng]", "Svaay Rieng [Svay Rieng]", "Taakaev [Takêv]"}
			, new Language[] {Language.KHMER}),
	
	CAMEROON(275, "Cameroon", "CM", "africa", new String[]{"Adamaoua", "Centre", "East", "Far North", "Littoral", "North", "North-West", "South", "South-West", "West"}
			, new Language[] {Language.ENGLISH, Language.FRENCH}),
	
	CANADA(43, "Canada", "CA", "North America", new String[]{"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador"
			, "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon Territory"}
			, new Language[] {Language.ENGLISH}),
	
	CAPE_VERDE(276, "Cape Verde", "CV", "africa", new String[]{"Boa Vista", "Brava", "Calheta de São Miguel", "Maio", "Mosteiros", "Paúl"
			, "Porto Novo", "Praia", "Ribeira Grande", "Sal", "Santa Catarina", "Santa Cruz", "São Domingos", "São Filipe", "São Nicolau", "São Vicente", "Tarrafal"}
			, new Language[] {Language.PORTUGUESE}),
	
	CAYMAN_ISLANDS(277, "Cayman Islands", "KY", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	CENTRAL_AFRICAN_REPUBLIC(278, "Central African Republic", "CF", "africa", new String[]{"Bamingui-Bangoran", "Bangui", "Basse-Kotto"
			, "Haute-Kotto", "Haut-Mbomou", "Kémo", "Lobaye", "Mambéré-Kadéï", "Mbomou", "Nana-Grébizi", "Nana-Mambéré", "Ombella-Mpoko"
			, "Ouaka", "Ouham", "Ouham-Pendé", "Sangha-Mbaéré", "Vakaga"}
			, new Language[] {Language.FRENCH}),
	
	CHAD(279, "Chad", "TD", "africa", new String[]{"Batha", "Biltine", "Borkou-Ennedi-Tibesti", "Chari-Baguirmi", "Guéra", "Kanem", "Lac"
			, "Logone-Occidental", "Logone-Oriental", "Mayo-Kébbi", "Moyen-Chari", "Ouaddaï", "Salamat", "Tandjilé"}
			, new Language[] {Language.FRENCH, Language.ARABIC}),
	
	CHILE(48, "Chile", "CL", "South America", new String[]{"Aisén del General Carlos Ibáñez del Campo", "Antofagasta", "Araucanía", "Atacama"
			, "Bío-Bío", "Coquimbo", "Libertador General Bernardo O'Higgins", "Los Lagos", "Magallanes", "Maule", "Región Metropolitana de Santiago", "Tarapacá", "Valparaíso"}
			, new Language[] {Language.SPANISH}),
	
	CHINA(49, "China", "CN", "Asia", new String[]{"Anhui", "Aomen (zh) ", "Beijing", "Chongqing", "Fujian", "Gansu", "Guangdong", "Guangxi"
			, "Guizhou", "Hainan", "Hebei", "Heilongjiang", "Henan", "Hubei", "Hunan", "Jiangsu", "Jiangxi", "Jilin", "Liaoning", "Neimenggu (zh) "
			, "Ningxia", "Qinghai", "Shaanxi", "Shandong", "Shanghai", "Shanxi", "Sichuan", "Taiwan ", "Tianjin", "Xianggang (zh) ", "Xinjiang", "Xizang", "Yunnan", "Zhejiang"}
			, new Language[] {Language.CHINESE_SIMPLIFIED}),
	
	COCOS_ISLANDS(281, "Cocos Islands", "CC", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	COLOMBIA(53, "Colombia", "CO", "south america", new String[]{"Amazonas", "Antioquia", "Arauca", "Atlántico", "Bolívar", "Boyacá", "Caldas"
			, "Caquetá", "Casanare", "Cauca", "Cesar", "Chocó", "Córdoba", "Cundinamarca", "Distrito Capital de Santa Fe de Bogotá", "Guainía"
			, "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindío", "Risaralda"
			, "San Andrés, Providencia y Santa Catalina", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupés", "Vichada"}
			, new Language[] {Language.SPANISH}),
	
	COMOROS(282, "Comoros", "KM", "na", new String[]{"Anjouan", "Grande Comore", "Mohéli"}
			, new Language[] {Language.ARABIC, Language.FRENCH}),
	
	THE_DEMOCRATIC_REPUBLIC_OF_CONGO(283, "Congo, democratic republic", "CD", "africa", new String[]{"Bandundu", "Bas-Congo", "Équateur"
			, "Kasai-Occidental", "Kasai-Oriental", "Katanga", "Kinshasa", "Maniema", "Nord-Kivu", "Orientale", "Sud-Kivu"}
			, new Language[] {Language.FRENCH}),
	
	CONGO(283, "Congo", "CG", "africa", new String[]{"Bouenza", "Brazzaville", "Cuvette", "Cuvette-Ouest", "Kouilou", "Lékoumou", "Likouala", "Niari", "Plateaux", "Pool", "Sangha"}
			, new Language[] {Language.FRENCH}),
	
	COOK_ISLANDS(284, "Cook Islands", "CK", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	COSTA_RICA(59, "Costa Rica", "CR", "South America", new String[]{"Alajuela", "Cartago", "Guanacaste", "Heredia", "Limón", "Puntarenas", "San José"}
			, new Language[] {Language.SPANISH}),
	
	CROATIA(61, "Croatia", "HR", "Europe", new String[]{"Bjelovarsko-bilogorska županija", "Brodsko-posavska županija"
			, "Dubrovacko-neretvanska županija", "Grad Zagreb", "Istarska županija", "Karlovacka županija", "Koprivnicko-križevacka županija"
			, "Krapinsko-zagorska županija", "Licko-senjska županija", "Medimurska županija", "Osjecko-baranjska županija"
			, "Požeško-slavonska županija", "Primorsko-goranska županija", "Šibensko-kninska županija", "Sisacko-moslavacka županija"
			, "Splitsko-dalmatinska županija", "Varaždinska županija", "Viroviticko-podravska županija", "Vukovarsko-srijemska županija"
			, "Zadarska županija", "Zagrebacka županija"}
			, new Language[] {Language.CROATIAN}),
	
	CUBA(62, "Cuba", "CU", "South America", new String[]{"Camagüey", "Ciego de Ávila", "Cienfuegos", "Ciudad de La Habana"
			, "Granma", "Guantánamo", "Holguín", "Isla de la Juventud", "La Habana", "Las Tunas", "Matanzas", "Pinar del Río"
			, "Sancti Spíritus", "Santiago de Cuba", "Villa Clara"}
			, new Language[] {Language.SPANISH}),
	
	CYPRUS(63, "Cyprus", "CY", "europe", new String[]{"Ammochostos", "Keryneia", "Larnaka", "Lefkosia", "Lemesos", "Pafos"}
			, new Language[] {Language.GREEK, Language.TURKISH}),
	
	CZECH_REPUBLIC(64, "Czech Republic", "CZ", "Europe", new String[]{"Jihoceský kraj", "Jihomoravský kraj ", "Karlovarský kraj"
			, "Královéhradecký kraj", "Liberecký kraj", "Moravskoslezský kraj", "Olomoucký kraj", "Pardubický kraj", "Plzenský kraj"
			, "Praha, hlavní mesto", "Stredoceský kraj", "Ústecký kraj ", "Vysocina", "Zlínský kraj"}
			, new Language[] {Language.CZECH}),
	
	DENMARK(65, "Denmark", "DK", "Europe", new String[]{"Århus", "Bornholm", "Frederiksberg", "Frederiksborg", "Fyn", "København"
			, "København", "Nordjylland", "Ribe", "Ringkøbing", "Roskilde", "Sønderjylland", "Storstrøm", "Vejle", "Vestsjælland", "Viborg"}
			, new Language[] {Language.DANISH}),
	
	DJIBOUTI(285, "Djibouti", "DJ", "africa", new String[]{"Ali Sabieh", "Dikhil", "Djibouti", "Obock", "Tadjoura"}
			, new Language[] {Language.FRENCH, Language.ARABIC}),
	
	DOMINICA(363, "Dominica", "DM", "South America", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	DOMINICAN_REPUBLIC(-1, "Dominican Republic", "DO", "North America", new String[] {}
			, new Language[] {Language.SPANISH}),
	
	ECUADOR(70, "Ecuador", "EC", "South America", new String[]{"Azuay", "Bolívar", "Cañar", "Carchi", "Chimborazo", "Cotopaxi"
			, "El Oro", "Esmeraldas", "Galápagos", "Guayas", "Imbabura", "Loja", "Los Ríos", "Manabí", "Morona-Santiago", "Napo"
			, "Orellana", "Pastaza", "Pichincha", "Sucumbíos", "Tungurahua", "Zamora-Chinchipe"}
			, new Language[] {Language.SPANISH}),
	
	EGYPT(71, "Egypt", "EG", "Africa", new String[]{"Ad Daqahliyah", "Al Bahr al Ahmar", "Al Buhayrah", "Al Fayyum", "Al Gharbiyah"
			, "Al Iskandariyah", "Al Ismahiliyah", "Al Jizah", "Al Minufiyah", "Al Minya", "Al Qahirah", "Al Qalyubiyah"
			, "Al Wadi al Jadid", "Ash Sharqiyah", "As Suways", "Aswan", "Asyut", "Bani Suwayf", "Bur Sahid", "Dumyat", "Janub Sina'"
			, "Kafr ash Shaykh", "Matruh", "Qina", "Shamal Sina'", "Suhaj"}
			, new Language[] {Language.ARABIC}),
	
	EL_SALVADOR(72, "El Salvador", "SV", "south america", new String[]{"Ahuachapán", "Cabañas", "Chalatenango", "Cuscatlán"
			, "La Libertad", "La Paz", "La Unión", "Morazán", "San Miguel", "San Salvador", "Santa Ana", "San Vicente", "Sonsonate", "Usulután"}
			, new Language[] {Language.SPANISH}),
	
	EQUATORIAL_GUINEA(364, "Equatorial Guinea", "GQ", "africa", new String[]{"Annobón", "Bioko Norte", "Bioko Sur", "Centro Sur"
			, "Kie-Ntem", "Litoral", "Región Continental", "Región Insular", "Wele-Nzás"}
			, new Language[] {Language.SPANISH, Language.FRENCH}),
	
	ERITREA(286, "Eritrea", "ER", "Africa", new String[]{"Anseba", "Debub", "Debubawi Keyih Bahri [Debub-Keih-Bahri]", "Gash-Barka"
			, "Maakel [Maekel]", "Semenawi Keyih Bahri [Semien-Keih-Bahri]"}
			, new Language[] {Language.ARABIC}),
	
	ESTONIA(75, "Estonia", "EE", "Europe", new String[]{"Harjumaa", "Hiiumaa", "Ida-Virumaa", "Järvamaa", "Jõgevamaa"
			, "Läänemaa", "Lääne-Virumaa", "Pärnumaa", "Põlvamaa", "Raplamaa", "Saaremaa", "Tartumaa", "Valgamaa", "Viljandimaa", "Võrumaa"}
			, new Language[] {Language.ESTONIAN, Language.RUSSIAN}),
	
	ETHIOPIA(287, "Ethiopia", "ET", "africa", new String[]{"Adis Abeba", "Afar", "Amara", "Binshangul Gumuz", "Dire Dawa"
			, "Gambela Hizboch", "Hareri Hizb", "Oromiya", "Sumale", "Tigray", "YeDebub Biheroch Bihereseboch na Hizboch"}
			, new Language[] {Language.SOMALI}),
	
	FAROE_ISLANDS(366, "Faroe Islands", "FO", "europe", new String[]{""}
			, new Language[] {Language.DANISH}),
	
	FIJI(80, "Fiji", "FJ", "na", new String[]{"Central", "Eastern", "Northern", "Rotuma", "Western"}
			, new Language[] {Language.ENGLISH}),
	
	FINLAND(81, "Finland", "FI", "Europe", new String[]{"Ahvenanmaan lääni", "Etelä-Suomen lääni", "Itä-Suomen lääni"
			, "Länsi-Suomen lääni", "Lapin lääni", "Oulun lääni"}
			, new Language[] {Language.FINNISH}),
	
	FRANCE(82, "France", "FR", "Europe", new String[]{"Ain", "Aisne", "Allier", "Alpes-de-Haute-Provence", "Alpes-Maritimes"
			, "Ardèche", "Ardennes", "Ariège", "Aube", "Aude", "Aveyron", "Bas-Rhin", "Bouches-du-Rhône", "Calvados"
			, "Cantal", "Charente", "Charente-Maritime", "Cher", "Corrèze", "Corse-du-Sud", "Côte-d'Or", "Côtes-d'Armor"
			, "Creuse", "Deux-Sèvres", "Dordogne", "Doubs", "Drôme", "Essonne", "Eure", "Eure-et-Loir", "Finistère", "Gard"
			, "Gers", "Gironde", "Haute-Corse", "Haute-Garonne", "Haute-Loire", "Haute-Marne", "Hautes-Alpes", "Haute-Saône"
			, "Haute-Savoie", "Hautes-Pyrénées", "Haute-Vienne", "Haut-Rhin", "Hauts-de-Seine", "Hérault", "Ille-et-Vilaine"
			, "Indre", "Indre-et-Loire", "Isère", "Jura", "Landes", "Loire", "Loire-Atlantique", "Loiret", "Loir-et-Cher"
			, "Lot", "Lot-et-Garonne", "Lozère", "Maine-et-Loire", "Manche", "Marne", "Mayenne", "Mayotte"
			, "Meurthe-et-Moselle", "Meuse", "Morbihan", "Moselle", "Nièvre", "Nord", "Nouvelle-Calédonie ", "Oise", "Orne", "Paris"
			, "Pas-de-Calais", "Polynésie française (see also separate entry under PF)", "Puy-de-Dôme", "Pyrénées-Atlantiques"
			, "Pyrénées-Orientales", "Rhône", "Saint-Pierre-et-Miquelon (see also separate entry under PM)", "Saône-et-Loire"
			, "Sarthe", "Savoie", "Seine-et-Marne", "Seine-Maritime", "Seine-Saint-Denis", "Somme", "Tarn", "Tarn-et-Garonne"
			, "Terres Australes Françaises (see also separate entry under TF)", "Territoire de Belfort", "Val-de-Marne", "Val-d'Oise"
			, "Var", "Vaucluse", "Vendée", "Vienne", "Vosges", "Wallis et Futuna (see also separate entry under WF)", "Yonne", "Yvelines"}
			, new Language[] {Language.FRENCH}),
	
	FRENCH_GUIANA(367, "French Guiana", "GF", "South America", new String[]{""}
			, new Language[] {Language.FRENCH}),
	
	FRENCH_POLYNESIA(368, "French Polynesia", "PF", "south america", new String[]{}
			, new Language[] {Language.FRENCH}),
	
	FRENCH_SOUTHERN_TERRITORIES(369, "French Southern Territories", "TF", "na", new String[]{""}
			, new Language[] {Language.FRENCH}),
	
	GABON(288, "Gabon", "GA", "africa", new String[]{"Estuaire", "Haut-Ogooué", "Moyen-Ogooué", "Ngounié", "Nyanga", "Ogooué-Ivindo"
			, "Ogooué-Lolo", "Ogooué-Maritime", "Woleu-Ntem"}
			, new Language[] {Language.FRENCH}),
	
	GAMBIA(400, "Gambia", "GM", "africa", new String[]{"Banjul", "Lower River", "MacCarthy Island", "North Bank", "Upper River", "Western"}
			, new Language[] {Language.ENGLISH}),
	
	GEORGIA(90, "Georgia", "GE", "asia", new String[]{"Abkhazia", "Ajaria", "Guria", "Imereti", "Kakheti", "Kvemo Kartli", "Mtskheta-Mtianeti"
			, "Racha-Lechkhumi [and] Kvemo Svaneti", "Samegrelo-Zemo Svaneti", "Samtskhe-Javakheti", "Shida Kartli", "Tbilisi"}
			, new Language[] {Language.GEORGIAN}),
	
	GERMANY(91, "Germany", "DE", "Europe", new String[]{"Baden-Württemberg", "Bayern", "Berlin", "Brandenburg", "Bremen", "Hamburg"
			, "Hessen", "Mecklenburg-Vorpommern", "Niedersachsen", "Nordrhein-Westfalen", "Rheinland-Pfalz", "Saarland", "Sachsen"
			, "Sachsen-Anhalt", "Schleswig-Holstein", "Thüringen"}
			, new Language[] {Language.GERMAN}),
	
	GHANA(289, "Ghana", "GH", "africa", new String[]{"Ashanti", "Brong-Ahafo", "Central", "Eastern", "Greater Accra", "Northern"
			, "Upper East", "Upper West", "Volta", "Western"}
			, new Language[] {Language.ENGLISH}),
	
	GIBRALTAR(290, "Gibraltar", "GI", "europe", new String[]{""}
			, new Language[] {Language.SPANISH, Language.ENGLISH}),
	
	GREECE(95, "Greece", "GR", "Europe", new String[]{"Achaïa", "Agio Oros", "Aitolia-Akarnania", "Argolis", "Arkadia", "Arta"
			, "Attiki", "Chalkidiki", "Chania", "Chios", "Dodekanisos", "Drama", "Evros", "Evrytania", "Evvoia", "Florina", "Fokis"
			, "Fthiotis", "Grevena", "Ileia", "Imathia", "Ioannina", "Irakleion", "Karditsa", "Kastoria", "Kavalla", "Kefallinia"
			, "Kerkyra", "Kilkis", "Korinthia", "Kozani", "Kyklades", "Lakonia", "Larisa", "Lasithion", "Lefkas", "Lesvos", "Magnisia"
			, "Messinia", "Pella", "Pieria", "Preveza", "Rethymnon", "Rodopi", "Samos", "Serrai", "Thesprotia", "Thessaloniki", "Trikala", "Voiotia", "Xanthi", "Zakynthos"}
			, new Language[] {Language.GREEK}),
	
	GREENLAND(291, "Greenland", "GL", "europe", new String[]{""}
			, new Language[] {Language.DANISH}),
	
	GRENADA(97, "Grenada", "GD", "South America", new String[]{"Carriacou", "Saint Andrew", "Saint David", "Saint George", "Saint John", "Saint Mark", "Saint Patrick"}
			, new Language[] {Language.ENGLISH}),
	
	GUADELOUPE(370, "Guadeloupe", "GP", "South America", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	GUAM(99, "Guam", "GU", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	GUATEMALA(100, "Guatemala", "GT", "South America", new String[]{"Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula"
			, "El Progreso", "Escuintla", "Guatemala", "Huehuetenango", "Izabal", "Jalapa", "Jutiapa", "Petén", "Quetzaltenango"
			, "Quiché", "Retalhuleu", "Sacatepéquez", "San Marcos", "Santa Rosa", "Sololá", "Suchitepéquez", "Totonicapán", "Zacapa"}
			, new Language[] {Language.SPANISH}),
	
	GUERNSEY(371, "Guernsey", "GG", "europe", new String[]{}
			, new Language[] {Language.ENGLISH}),
	
	GUINEA(292, "Guinea", "GN", "africa", new String[]{"Beyla", "Boffa", "Boké", "Coyah", "Dabola", "Dalaba", "Dinguiraye"
			, "Dubréka", "Faranah", "Forécariah", "Fria", "Gaoual", "Guékédou", "Kankan", "Kérouané", "Kindia", "Kissidougou"
			, "Koubia", "Koundara", "Kouroussa", "Labé", "Lélouma", "Lola", "Macenta", "Mali", "Mamou", "Mandiana", "Nzérékoré"
			, "Pita", "Siguiri", "Télimélé", "Tougué", "Yomou"}
			, new Language[] {Language.FRENCH}),
	
	GUINEA_BISSAU(372, "Guinea-Bissau", "GW", "africa", new String[]{"Bafatá", "Biombo", "Bissau", "Bolama", "Cacheu", "Gabú", "Oio", "Quinara", "Tombali"}
			, new Language[] {Language.PORTUGUESE}),
	
	GUYANA(293, "Guyana", "GY", "africa", new String[]{"Barima-Waini", "Cuyuni-Mazaruni", "Demerara-Mahaica", "East Berbice-Corentyne"
			, "Essequibo Islands-West Demerara", "Mahaica-Berbice", "Pomeroon-Supenaam", "Potaro-Siparuni", "Upper Demerara-Berbice", "Upper Takutu-Upper Essequibo"}
			, new Language[] {Language.ENGLISH}),
	
	HAITI(105, "Haiti", "HT", "South America", new String[]{"Artibonite", "Centre", "Grande-Anse", "Nord", "Nord-Est", "Nord-Ouest", "Ouest", "Sud", "Sud-Est"}
			, new Language[] {Language.FRENCH}),
	
	HOLY_SEE(374, "Holy See", "VA", "europe", new String[]{""}
			, new Language[] {Language.FRENCH}),
	
	HONDURAS(108, "Honduras", "HN", "South America", new String[]{"Atlántida", "Choluteca", "Colón", "Comayagua", "Copán", "Cortés"
			, "El Paraíso", "Francisco Morazán", "Gracias a Dios", "Intibucá", "Islas de la Bahía", "La Paz", "Lempira", "Ocotepeque"
			, "Olancho", "Santa Bárbara", "Valle", "Yoro"}
			, new Language[] {Language.SPANISH}),
	
	HONG_KONG(109, "Hong Kong", "HK", "asia", new String[]{}
			, new Language[] {Language.CHINESE_TRADITIONAL}),
	
	HUNGARY(111, "Hungary", "HU", "Europe", new String[]{"Bács-Kiskun", "Baranya", "Békés", "Békéscsaba", "Borsod-Abaúj-Zemplén"
			, "Budapest", "Csongrád", "Debrecen", "Dunaújváros", "Eger", "Fejér", "Gyor", "Gyor-Moson-Sopron", "Hajdú-Bihar", "Heves"
			, "Hódmezovásárhely", "Jász-Nagykun-Szolnok", "Kaposvár", "Kecskemét", "Komárom-Esztergom", "Miskolc", "Nagykanizsa", "Nógrád"
			, "Nyíregyháza", "Pécs", "Pest", "Salgótarján", "Somogy", "Sopron", "Szabolcs-Szatmár-Bereg", "Szeged", "Székesfehérvár"
			, "Szekszárd", "Szolnok", "Szombathely", "Tatabánya", "Tolna", "Vas", "Veszprém", "Veszprém", "Zala", "Zalaegerszeg"}
			, new Language[] {Language.HUNGARIAN}),
	
	ICELAND(112, "Iceland", "IS", "Europe", new String[]{"Austurland", "Höfuðborgarsvæði utan Reykjavíkur", "Norðurland eystra"
			, "Norðurland vestra", "Reykjavík", "Suðurland", "Suðurnes", "Vestfirðir", "Vesturland"}
			, new Language[] {Language.ICELANDIC}),
	
	INDIA(113, "India", "IN", "Asia", new String[]{"Andaman and Nicobar Islands", "Andhra Pradesh", "Arunachal Pradesh", "Assam"
			, "Bihar", "Chandigarh", "Chhattisgarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Goa", "Gujarat", "Haryana"
			, "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Lakshadweep", "Madhya Pradesh", "Maharashtra"
			, "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Pondicherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu"
			, "Tripura", "Uttaranchal", "Uttar Pradesh", "West Bengal"}
			, new Language[] {Language.HINDI}),
	
	INDONESIA(114, "Indonesia", "ID", "Asia", new String[]{"Aceh", "Bali", "Bangka Belitung", "Banten", "Bengkulu", "Gorontalo"
			, "Jakarta Raya", "Jambi", "Jawa Barat", "Jawa Tengah", "Jawa Timur", "Kalimantan Barat", "Kalimantan Selatan"
			, "Kalimantan Tengah", "Kalimantan Timur", "Lampung", "Maluku", "Maluku Utara", "Nusa Tenggara Barat", "Nusa Tenggara Timur"
			, "Papua", "Riau", "Sulawesi Selatan", "Sulawesi Tengah", "Sulawesi Tenggara", "Sulawesi Utara", "Sumatera Barat", "Sumatera Selatan", "Sumatera Utara", "Yogyakarta"}
			, new Language[] {Language.INDONESIAN}),
	
	IRAN(294, "Iran", "IR", "Asia", new String[]{"Ardabil", "Az¯arbayjan-e Gharbi", "Az¯arbayjan-e Sharqi", "Bushehr"
			, "Chahar Mah¸all va Bakhtiari", "Esfahan", "Fars", "Gilan", "Golestan", "Hamadan", "Hormozgan", "Ilam", "Kerman"
			, "Kermanshah", "Khorasan", "Khuzestan", "Kohkiluyeh va Buyer Ahmad", "Kordestan", "Lorestan", "Markazi", "Mazandaran"
			, "Qazvin", "Qom", "Semnan", "Sistan va Baluchestan", "Tehran", "Yazd", "Zanjan"}
			, new Language[] {Language.PERSIAN}),
	
	IRAQ(116, "Iraq", "IQ", "Asia", new String[]{"Al Anbar", "Al Basrah", "Al Muthanná", "Al Qadisiyah", "An Najaf", "Arbil"
			, "As Sulaymaniyah", "At Ta'mim", "Babil", "Baghdad", "Dahuk", "Dhi Qar", "Diyalá", "Karbala'", "Maysan", "Ninawá", "Salah ad Din", "Wasit"}
			, new Language[] {Language.ARABIC}),
	
	IRELAND(117, "Ireland", "IE", "Europe", new String[]{"Carlow", "Cavan", "Clare", "Cork", "Donegal", "Dublin", "Galway"
			, "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan"
			, "Offaly", "Roscommon", "Sligo", "Tipperary", "Waterford", "Westmeath", "Wexford", "Wicklow"}
			, new Language[] {Language.ENGLISH}),
	
	ISLE_OF_MAN(295, "Isle of Man", "IM", "Europe", new String[]{}
			, new Language[] {Language.ENGLISH}),
	
	ISRAEL(118, "Israel", "IL", "Asia", new String[]{"HaDarom", "HaMerkaz", "Ha Z_afon", "Hefa", "Tel-Aviv", "Yerushalayim"}
			, new Language[] {Language.HEBREW}),
	
	ITALY(119, "Italy", "IT", "Europe", new String[]{"Agrigento", "Alessandria", "Ancona", "Aosta", "Arezzo", "Ascoli Piceno"
			, "Asti", "Avellino", "Bari", "Belluno", "Benevento", "Bergamo", "Biella", "Bologna", "Bolzano", "Brescia", "Brindisi"
			, "Cagliari", "Caltanissetta", "Campobasso", "Caserta", "Catania", "Catanzaro", "Chieti", "Como", "Cosenza", "Cremona"
			, "Crotone", "Cuneo", "Enna", "Ferrara", "Firenze", "Foggia", "Forlì", "Frosinone ", "Genova", "Gorizia", "Grosseto"
			, "Imperia", "Isernia", "L'Aquila", "La Spezia", "Latina", "Lecce", "Lecco", "Livorno", "Lodi", "Lucca", "Macerata"
			, "Mantova", "Massa-Carrara", "Matera", "Messina", "Milano", "Modena", "Napoli", "Novara", "Nuoro", "Oristano", "Padova"
			, "Palermo", "Parma", "Pavia", "Perugia", "Pesaro e Urbino", "Pescara", "Piacenza", "Pisa", "Pistoia", "Pordenone"
			, "Potenza", "Prato", "Ragusa", "Ravenna", "Reggio Calabria", "Reggio Emilia", "Rieti", "Rimini", "Roma", "Rovigo"
			, "Salerno", "Sassari", "Savona", "Siena", "Siracusa", "Sondrio", "Taranto", "Teramo", "Terni", "Torino", "Trapani"
			, "Trento", "Treviso", "Trieste", "Udine", "Varese", "Venezia", "Verbano-Cusio-Ossola", "Vercelli", "Verona", "Vibo Valentia", "Vicenza", "Viterbo"}
			, new Language[] {Language.ITALIAN}),
	
	JAMAICA(120, "Jamaica", "JM", "South America", new String[]{"Clarendon", "Hanover", "Kingston", "Manchester", "Portland"
			, "Saint Andrew", "Saint Ann", "Saint Catherine", "Saint Elizabeth", "Saint James", "Saint Mary", "Saint Thomas", "Trelawny", "Westmoreland"}
			, new Language[] {Language.ENGLISH}),
	
	JAPAN(122, "Japan", "JP", "Asia", new String[]{"Aiti [Aichi]", "Akita", "Aomori", "Ehime", "Gihu [Gifu]", "Gunma"
			, "Hirosima [Hiroshima]", "Hokkaidô [Hokkaido]", "Hukui [Fukui]", "Hukuoka [Fukuoka]", "Hukusima [Fukushima]"
			, "Hyôgo [Hyogo]", "Ibaraki", "Isikawa [Ishikawa]", "Iwate", "Kagawa", "Kagosima [Kagoshima]", "Kanagawa"
			, "Kôti [Kochi]", "Kumamoto", "Kyôto [Kyoto]", "Mie", "Miyagi", "Miyazaki", "Nagano", "Nagasaki", "Nara", "Niigata"
			, "Ôita [Oita]", "Okayama", "Okinawa", "Ôsaka [Osaka]", "Saga", "Saitama", "Siga [Shiga]", "Simane [Shimane]"
			, "Sizuoka [Shizuoka]", "Tiba [Chiba]", "Tokusima [Tokushima]", "Tôkyô [Tokyo]", "Totigi [Tochigi]", "Tottori"
			, "Toyama", "Wakayama", "Yamagata", "Yamaguti [Yamaguchi]", "Yamanasi [Yamanashi]"}
			, new Language[] {Language.JAPANESE}),
	
	JERSEY(296, "Jersey", "JE", "na", new String[]{}
			, new Language[] {Language.ENGLISH}),
	
	JORDAN(126, "Jordan", "JO", "Asia", new String[]{"Ajlun", "Al Aqaba", "Al Balqa'", "Al Karak", "Al Mafraq", "Amman"
			, "At Tafilah", "Az Zarqa'", "Irbid", "Jarash", "Ma`an", "Madaba"}
			, new Language[] {Language.ARABIC}),
	
	KAZAKHSTAN(297, "Kazakhstan", "KZ", "Asia", new String[]{"Almaty", "Almaty oblysy", "Aqmola oblysy", "Aqtöbe oblysy"
			, "Astana", "Atyrau oblysy", "Batys Qazaqstan oblysy", "Mangghystau oblysy", "Ongtüstik Qazaqstan oblysy"
			, "Pavlodar oblysy", "Qaraghandy oblysy", "Qostanay oblysy", "Qyzylorda oblysy", "Shyghys Qazaqstan oblysy"
			, "Soltüstik Qazaqstan oblysy", "Zhambyl oblysy"}
			, new Language[] {Language.KAZAKH, Language.RUSSIAN}),
	
	KENYA(402, "Kenya", "KE", "africa", new String[]{"Central", "Coast", "Eastern", "Nairobi Municipality", "North-Eastern", "Nyanza", "Rift Valley", "Western"}
			, new Language[] {Language.ENGLISH, Language.SWAHILI}),
	
	KIRIBATI(298, "Kiribati", "KI", "na", new String[]{"Gilbert Islands", "Line Islands", "Phoenix Islands"}
			, new Language[] {Language.ENGLISH}),
	
	KUWAIT(134, "Kuwait", "KW", "asia", new String[]{"Al Ahmadi", "Al Farwaniyah", "Al Jahrah", "Al Kuwayt", "Hawalli"}
			, new Language[] {Language.ARABIC}),
	
	KYRGYZSTAN(300, "Kyrgyzstan", "KG", "asia", new String[]{"Batken", "Bishkek", "Chü", "Jalal-Abad", "Naryn", "Osh", "Talas", "Ysyk-Köl"}
			, new Language[] {Language.KYRGYZ, Language.RUSSIAN}),
	
	LATVIA(137, "Latvia", "LV", "Europe", new String[]{"Aizkraukles Aprinkis", "Aluksnes Aprinkis", "Balvu Aprinkis"
			, "Bauskas Aprinkis", "Cesu Aprinkis", "Daugavpils", "Daugavpils Aprinkis", "Dobeles Aprinkis", "Gulbenes Aprinkis"
			, "Jekabpils Aprinkis", "Jelgava", "Jelgavas Aprinkis", "Jurmala", "Kraslavas Aprinkis", "Kuldigas Aprinkis", "Liepaja"
			, "Liepajas Aprinkis", "Limbažu Aprinkis", "Ludzas Aprinkis", "Madonas Aprinkis", "Ogres Aprinkis", "Preilu Aprinkis"
			, "Rezekne", "Rezeknes Aprinkis", "Riga", "Rigas Aprinkis", "Saldus Aprinkis", "Talsu Aprinkis", "Tukuma Aprinkis"
			, "Valkas Aprinkis", "Valmieras Aprinkis", "Ventspils", "Ventspils Aprinkis"}
			, new Language[] {Language.LATVIAN, Language.RUSSIAN}),
	
	LEBANON(138, "Lebanon", "LB", "Asia", new String[]{"Beiroût", "El Béqaa", "Jabal Loubnâne", "Loubnâne ech Chemâli", "Loubnâne ej Jnoûbi", "Nabatîyé"}
			, new Language[] {Language.ARABIC}),
	
	LESOTHO(375, "Lesotho", "LS", "africa", new String[]{"Berea", "Butha-Buthe", "Leribe", "Mafeteng", "Maseru"
			, "Mohale's Hoek", "Mokhotlong", "Qacha's Nek", "Quthing", "Thaba-Tseka"}
			, new Language[] {Language.ZULU, Language.ENGLISH}),
	
	LIBERIA(302, "Liberia", "LR", "africa", new String[]{"Bomi", "Bong", "Grand Bassa", "Grand Cape Mount", "Grand Gedeh"
			, "Grand Kru", "Lofa", "Margibi", "Maryland", "Montserrado", "Nimba", "Rivercess", "Sinoe"}
			, new Language[] {Language.ENGLISH}),
	
	LIBYA(303, "Libya", "LY", "africa", new String[]{"Ajdabiya", "Al Butnan", "Al Hizam al Akhhar", "Al Jabal al Akhdar"
			, "Al Jifarah", "Al Jufrah", "Al Kufrah", "Al Marj", "Al Marqab", "Al Qatrun", "Al Qubbah", "Al Wahah"
			, "An Nuqat al Khams", "Ash Shati'", "Az Zawiyah", "Banghazi", "Bani Walid", "Darnah", "Ghadamis", "Gharyan"
			, "Ghat", "Jaghbub", "Misratah", "Mizdah", "Murzuq", "Nalut", "Sabha", "Sabratah Surman", "Surt", "Tajura' wa an Nawahi Arbah"
			, "Tarabulus", "Tarhunah-Masallatah", "Wadi al Hayat", "Yafran-Jadu"}
			, new Language[] {Language.ARABIC, Language.ITALIAN, Language.ENGLISH}),
	
	LIECHTENSTEIN(142, "Liechtenstein", "LI", "europe", new String[]{""}
			, new Language[] {Language.GERMAN}),
	
	LITHUANIA(143, "Lithuania", "LT", "Europe", new String[]{"Alytaus Apskritis", "Kauno Apskritis", "Klaipedos Apskritis"
			, "Marijampoles Apskritis", "Panevežio Apskritis", "Šiauliu Apskritis", "Taurages Apskritis", "Telšiu Apskritis", "Utenos Apskritis", "Vilniaus Apskritis"}
			, new Language[] {Language.LITHUANIAN, Language.RUSSIAN}),
	
	LUXEMBOURG(144, "Luxembourg", "LU", "Europe", new String[]{"Diekirch", "Grevenmacher", "Luxembourg (fr)"}
			, new Language[] {Language.FRENCH}),
	
	MACAO(145, "Macao", "MO", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	MACEDONIA(-1, "Macedonia", "MK", "Europe", new String[]{""}
			, new Language[] {Language.MACEDONIAN, Language.ALBANIAN}),
	
	MADAGASCAR(376, "Madagascar", "MG", "africa", new String[]{"Antananarivo", "Antsiranana", "Fianarantsoa", "Mahajanga", "Toamasina", "Toliara"}
			, new Language[] {Language.MALAGASY, Language.FRENCH}),
	
	MALAWI(304, "Malawi", "MW", "na", new String[]{"Balaka", "Blantyre", "Chikwawa", "Chiradzulu", "Chitipa", "Dedza"
			, "Dowa", "Karonga", "Kasungu", "Likoma Island", "Lilongwe", "Machinga", "Mangochi", "Mchinji", "Mulanje"
			, "Mwanza", "Mzimba", "Nkhata Bay", "Nkhotakota", "Nsanje", "Ntcheu", "Ntchisi", "Phalombe", "Rumphi", "Salima", "Thyolo", "Zomba"}
			, new Language[] {Language.ENGLISH}),
	
	MALAYSIA(149, "Malaysia", "MY", "Asia", new String[]{"Johor", "Kedah", "Kelantan", "Melaka", "Negeri Sembilan"
			, "Pahang", "Perak", "Perlis", "Pulau Pinang", "Sabah", "Sarawak", "Selangor", "Terengganu", "Wilayah Persekutuan Kuala Lumpur"
			, "Wilayah Persekutuan Labuan", "Wilayah Persekutuan Putrajaya"}
			, new Language[] {Language.MALAY}),
	
	MALDIVES(150, "Maldives", "MV", "na", new String[]{"Alif", "Baa", "Dhaalu", "Faafu", "Gaaf Alif", "Gaafu Dhaalu", "Gnaviyani"
			, "Haa Alif", "Haa Dhaalu", "Kaafu", "Laamu", "Lhaviyani", "Male", "Meemu", "Noonu", "Raa", "Seenu", "Shaviyani", "Thaa", "Vaavu"}
			, new Language[] {Language.ENGLISH}),
	
	MALI(305, "Mali", "ML", "africa", new String[]{"Bamako", "Gao", "Kayes", "Kidal", "Koulikoro", "Mopti", "Ségou", "Sikasso", "Tombouctou"}
			, new Language[] {Language.FRENCH}),
	
	MALTA(152, "Malta", "MT", "europe", new String[]{""}
			, new Language[] {Language.MALTESE}),
	
	MARSHALL_ISLANDS(377, "Marshall Islands", "MH", "na", new String[]{"Ailinglapalap", "Ailuk", "Arno", "Aur", "Ebon", "Eniwetok"
			, "Jaluit", "Kili", "Kwajalein", "Lae", "Lib", "Likiep", "Majuro", "Maloelap", "Mejit", "Mili", "Namorik", "Namu"
			, "Rongelap", "Ujae", "Ujelang", "Utirik", "Wotho", "Wotje"}
			, new Language[] {Language.ENGLISH}),
	
	MARTINIQUE(306, "Martinique", "MQ", "africa", new String[]{""}
			, new Language[] {Language.FRENCH}),
	
	MAURITANIA(307, "Mauritania", "MR", "africa", new String[]{"Adrar", "Assaba", "Brakna", "Dakhlet Nouâdhibou", "Gorgol", "Guidimaka"
			, "Hodh ech Chargui", "Hodh el Gharbi", "Inchiri", "Nouakchott", "Tagant", "Tiris Zemmour", "Trarza"}
			, new Language[] {Language.ARABIC}),
	
	MAURITIUS(308, "Mauritius", "MU", "africa", new String[]{"Agalega Islands", "Beau Bassin-Rose Hill", "Black River"
			, "Cargados Carajos Shoals [Saint Brandon Islands]", "Curepipe", "Flacq", "Grand Port", "Moka", "Pamplemousses"
			, "Plaines Wilhems", "Port Louis", "Port Louis", "Quatre Bornes", "Rivière du Rempart", "Rodrigues Island", "Savanne", "Vacoas-Phoenix"}
			, new Language[] {Language.HAITIAN_CREOLE}),
	
	MAYOTTE(309, "Mayotte", "YT", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	MEXICO(159, "Mexico", "MX", "North America", new String[]{"Aguascalientes", "Baja California", "Baja California Sur"
			, "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Distrito Federal", "Durango", "Guanajuato", "Guerrero"
			, "Hidalgo", "Jalisco", "México", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro"
			, "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas"}
			, new Language[] {Language.SPANISH}),
	
	MICRONESIA(310, "Micronesia", "FM", "na", new String[]{"Chuuk", "Kosrae", "Pohnpei", "Yap"}
			, new Language[] {Language.ENGLISH}),
	
	MOLDOVA(311, "Moldova", "MD", "Europe", new String[]{"Balti", "Cahul", "Chisinau", "Chisinau", "Edinet", "Gagauzia"
			+ ", Unitate Teritoriala Autonoma (UTAG)", "Lapusna", "Orhei", "Soroca", "Stînga Nistrului, unitatea teritoriala din", "Taraclia", "Tighina [Bender]", "Ungheni"}
			, new Language[] {Language.RUSSIAN}),
	
	MONACO(164, "Monaco", "MC", "europe", new String[]{""}
			, new Language[] {Language.FRENCH}),
			
	MONGOLIA(165, "Mongolia", "MN", "Asia", new String[]{"Arhangay", "Bayanhongor", "Bayan-Ölgiy", "Bulgan", "Darhan uul"
			, "Dornod", "Dornogovi", "Dundgovi", "Dzavhan", "Govi-Altay", "Govi-Sümber", "Hentiy", "Hovd", "Hövsgöl", "Ömnögovi"
			, "Orhon", "Övörhangay", "Selenge", "Sühbaatar", "Töv", "Ulaanbaatar", "Uvs"}
			, new Language[] {Language.MONGOLIAN}),
	
	MONTENEGRO(312, "Montenegro", "ME", "Europe", new String[]{}
			, new Language[] {Language.SERBIAN}),
	
	MONTSERRAT(313, "Montserrat", "MS", "na", new String[]{""}
			, new Language[] {Language.FRENCH}),
	
	MOROCCO(168, "Morocco", "MA", "Africa", new String[]{"Agadir", "Aït Baha", "Aït Melloul", "Al Haouz", "Al Hoceïma"
			, "Assa-Zag", "Azilal", "Beni Mellal", "Ben Slimane", "Berkane", "Boujdour (EH)", "Boulemane", "Casablanca [Dar el Beïda]"
			, "Chefchaouene", "Chichaoua", "El Hajeb", "El Jadida", "Errachidia", "Essaouira", "Es Smara (EH)", "Fès", "Figuig"
			, "Guelmim", "Ifrane", "Jerada", "Kelaat Sraghna", "Kénitra", "Khemisset", "Khenifra", "Khouribga", "Laayoune (EH)"
			, "Larache", "Marrakech", "Meknès", "Nador", "Ouarzazate", "Oued ed Dahab (EH)", "Oujda", "Rabat-Salé", "Safi"
			, "Sefrou", "Settat", "Sidi Kacem", "Tanger", "Tan-Tan", "Taounate", "Taroudannt", "Tata", "Taza", "Tétouan", "Tiznit"}
			, new Language[] {Language.ARABIC, Language.FRENCH}),
	
	MOZAMBIQUE(314, "Mozambique", "MZ", "africa", new String[]{"Cabo Delgado", "Gaza", "Inhambane", "Manica", "Maputo"
			, "Maputo", "Nampula", "Niassa", "Sofala", "Tete", "Zambézia"}
			, new Language[] {Language.PORTUGUESE}),
	
	MYANMAR(315, "Myanmar", "MM", "asia", new String[]{"Ayeyarwady", "Bago", "Chin", "Kachin", "Kayah", "Kayin"
			, "Magway", "Mandalay", "Mon", "Rakhine", "Sagaing", "Shan", "Tanintharyi", "Yangon"}
			, new Language[] {Language.BURMESE}),
	
	NAMIBIA(316, "Namibia", "NA", "africa", new String[]{"Caprivi", "Erongo", "Hardap", "Karas", "Khomas", "Kunene"
			, "Ohangwena", "Okavango", "Omaheke", "Omusati", "Oshana", "Oshikoto", "Otjozondjupa"}
			, new Language[] {Language.AFRIKAANS, Language.ENGLISH, Language.GERMAN}),
	
	NAURU(317, "Nauru", "NR", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	NEPAL(174, "Nepal", "NP", "Asia", new String[]{"Bagmati", "Bheri", "Dhawalagiri", "Gandaki", "Janakpur", "Karnali"
			, "Kosi [Koshi]", "Lumbini", "Mahakali", "Mechi", "Narayani", "Rapti", "Sagarmatha", "Seti"}
			, new Language[] {Language.NEPALI}),
	
	NETHERLANDS(175, "Netherlands", "NL", "Europe", new String[]{"Drenthe", "Flevoland", "Friesland", "Gelderland"
			, "Groningen", "Limburg", "Noord-Brabant", "Noord-Holland", "Overijssel", "Utrecht", "Zeeland", "Zuid-Holland"}
			, new Language[] {Language.DUTCH}),
	
	NEW_CALEDONIA(318, "New Caledonia", "NC", "na", new String[]{}
			, new Language[] {Language.ENGLISH}),
	
	NEW_ZEALAND(178, "New Zealand", "NZ", "Oceania", new String[]{"Auckland", "Bay of Plenty", "Canterbury", "Gisborne"
			, "Hawkes's Bay", "Manawatu-Wanganui", "Marlborough", "Nelson", "Northland", "Otago", "Southland", "Taranaki", "Tasman", "Waikato", "Wellington", "West Coast"}
			, new Language[] {Language.ENGLISH}),
	
	NICARAGUA(319, "Nicaragua", "NI", "south america", new String[]{"Atlántico Norte", "Atlántico Sur", "Boaco", "Carazo"
			, "Chinandega", "Chontales", "Estelí", "Granada", "Jinotega", "León", "Madriz", "Managua", "Masaya", "Matagalpa", "Nueva Segovia", "Río San Juan", "Rivas"}
			, new Language[] {Language.SPANISH}),
	
	NIGER(320, "Niger", "NE", "africa", new String[]{"Agadez", "Diffa", "Dosso", "Maradi", "Niamey", "Tahoua", "Tillabéri", "Zinder"}
			, new Language[] {Language.FRENCH}),
	
	NIGERIA(321, "Nigeria", "NG", "africa", new String[]{"Abia", "Abuja Capital Territory", "Adamawa", "Akwa Ibom", "Anambra"
			, "Bauchi", "Bayelsa", "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo", "Ekiti", "Enugu", "Gombe", "Imo"
			, "Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Kogi", "Kwara", "Lagos", "Nassarawa", "Niger", "Ogun", "Ondo"
			, "Osun", "Oyo", "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara"}
			, new Language[] {Language.ENGLISH}),
	
	NIUE(322, "Niue", "NU", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	NORFOLK_ISLAND(323, "Norfolk Island", "NF", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	NORTH_KOREA(299, "North Korea", "KP", "Asia", new String[]{"Chagang-do", "Hamgyongbuk-do", "Hamgyongnam-do", "Hwanghaebuk-do"
			, "Hwanghaenam-do", "Kaesong-si", "Kangwon-do", "Najin Sonbong-si", "Nampo-si", "Pyonganbuk-do", "Pyongannam-do", "Pyongyang-si", "Yanggang-do"}
			, new Language[] {Language.KOREAN}),
	
	NORTHERN_MARIANA_ISLANDS(378, "Northern Mariana Islands", "MP", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	NORWAY(185, "Norway", "NO", "Europe", new String[]{"Akershus", "Aust-Agder", "Buskerud", "Finnmark", "Hedmark"
			, "Hordaland", "Jan Mayen (Arctic Region) (See also country code SJ)", "Møre og Romsdal", "Nordland", "Nord-Trøndelag"
			, "Oppland", "Oslo", "Østfold", "Rogaland", "Sogn og Fjordane", "Sør-Trøndelag", "Svalbard (Arctic Region) (See also country code SJ)"
			, "Telemark", "Troms", "Vest-Agder", "Vestfold"}
			, new Language[] {Language.NORWEGIAN}),
	
	OMAN(324, "Oman", "OM", "Asia", new String[]{"Ad Dakhiliyah", "Al Batinah", "Al Janubiyah [Z¸ufar]", "Al Wustá"
			, "Ash Sharqiyah", "Az¸ Z¸?hirah", "Masqat", "Musandam"}
			, new Language[] {Language.ARABIC}),
	
	PAKISTAN(187, "Pakistan", "PK", "Asia", new String[]{"Azad Kashmir", "Baluchistan (en)", "Federally Administered Tribal Areas"
			, "Islamabad", "Northern Areas", "North-West Frontier", "Punjab", "Sind (en)"}
			, new Language[] {Language.ENGLISH, Language.URDU}),
	
	PALAU(325, "Palau", "PW", "na", new String[]{}
			, new Language[] {Language.ENGLISH}),
	
	PANAMA(190, "Panama", "PA", "south america", new String[]{"Bocas del Toro", "Chiriquí", "Coclé", "Colón", "Comarca de San Blas"
			, "Darién", "Herrera", "Los Santos", "Panamá", "Veraguas"}
			, new Language[] {Language.SPANISH}),
	
	PAPUA_NEW_GUINEA(326, "Papua New Guinea", "PG", "asia", new String[]{"Central", "Chimbu", "Eastern Highlands", "East New Britain"
			, "East Sepik", "Enga", "Gulf", "Madang", "Manus", "Milne Bay", "Morobe", "National Capital District (Port Moresby)"
			, "New Ireland", "Northern", "North Solomons", "Sandaun [West Sepik]", "Southern Highlands", "Western", "Western Highlands", "West New Britain"}
			, new Language[] {Language.ENGLISH}),
	
	PARAGUAY(193, "Paraguay", "PY", "south america", new String[]{"Alto Paraguay", "Alto Paraná", "Amambay", "Asunción", "Boquerón"
			, "Caaguazú", "Caazapá", "Canindeyú", "Central", "Concepción", "Cordillera", "Guairá", "Itapúa", "Misiones", "Ñeembucú"
			, "Paraguarí", "Presidente Hayes", "San Pedro"}
			, new Language[] {Language.SPANISH}),
	
	PERU(194, "Peru", "PE", "south america", new String[]{"Amazonas", "Ancash", "Apurímac", "Arequipa", "Ayacucho", "Cajamarca"
			, "Cuzco [Cusco]", "El Callao", "Huancavelica", "Huánuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto"
			, "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali"}
			, new Language[] {Language.SPANISH}),
	
	PHILIPPINES(195, "Philippines", "PH", "Asia", new String[]{"Abra", "Agusan del Norte", "Agusan del Sur", "Aklan", "Albay"
			, "Antique", "Apayao", "Aurora", "Basilan", "Bataan", "Batanes", "Batangas", "Benguet", "Biliran", "Bohol", "Bukidnon"
			, "Bulacan", "Cagayan", "Camarines Norte", "Camarines Sur", "Camiguin", "Capiz", "Catanduanes", "Cavite", "Cebu"
			, "Compostela Valley", "Davao del Norte", "Davao del Sur", "Davao Oriental", "Eastern Samar", "Guimaras", "Ifugao"
			, "Ilocos Norte", "Ilocos Sur", "Iloilo", "Isabela", "Kalinga", "Laguna", "Lanao del Norte", "Lanao del Sur"
			, "La Union", "Leyte", "Maguindanao", "Marinduque", "Masbate", "Mindoro Occidental", "Mindoro Oriental", "Misamis Occidental"
			, "Misamis Oriental", "Mountain Province", "Negros Occidental", "Negros Oriental", "North Cotabato", "Northern Samar"
			, "Nueva Ecija", "Nueva Vizcaya", "Palawan", "Pampanga", "Pangasinan", "Quezon", "Quirino", "Rizal", "Romblon", "Sarangani"
			, "Siquijor", "Sorsogon", "South Cotabato", "Southern Leyte", "Sultan Kudarat", "Sulu", "Surigao del Norte", "Surigao del Sur"
			, "Tarlac", "Tawi-Tawi", "Western Samar", "Zambales", "Zamboanga del Norte", "Zamboanga del Sur", "Zamboanga Sibuguey [Zamboanga Sibugay]"}
			, new Language[] {Language.FILIPINO, Language.ENGLISH}),
	
	PITCAIRN(380, "Pitcairn", "PN", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	POLAND(197, "Poland", "PL", "Europe", new String[]{"Dolnoslaskie", "Kujawsko-pomorskie", "Lódzkie", "Lubelskie", "Lubuskie"
			, "Malopolskie", "Mazowieckie", "Opolskie", "Podkarpackie", "Podlaskie", "Pomorskie", "Slaskie", "Swietokrzyskie"
			, "Warminsko-mazurskie", "Wielkopolskie", "Zachodniopomorskie"}
			, new Language[] {Language.POLISH}),
	
	PORTUGAL(198, "Portugal", "PT", "Europe", new String[]{"Aveiro", "Beja", "Braga", "Bragança", "Castelo Branco", "Coimbra"
			, "Évora", "Faro", "Guarda", "Leiria", "Lisboa", "Portalegre", "Porto", "Região Autónoma da Madeira", "Região Autónoma dos Açores"
			, "Santarém", "Setúbal", "Viana do Castelo", "Vila Real", "Viseu"}
			, new Language[] {Language.PORTUGUESE}),
	
	PUERTO_RICO(199, "Puerto Rico", "PR", "north america", new String[]{""}
			, new Language[] {Language.ENGLISH, Language.SPANISH}),
	
	QATAR(200, "Qatar", "QA", "asia", new String[]{"Ad Dawhah", "Al Ghuwayriyah", "Al Jumayliyah", "Al Khawr", "Al Wakrah"
			, "Ar Rayyan", "Jariyan al Batnah", "Madinat ash Shamal", "Umm Salal"}
			, new Language[] {Language.ARABIC}),
	
	ROMANIA(202, "Romania", "RO", "Europe", new String[]{"Alba", "Arad", "Arges", "Bacau", "Bihor", "Bistrita-Nasaud"
			, "Botosani", "Braila", "Brasov", "Bucuresti", "Buzau", "Calarasi", "Caras-Severin", "Cluj", "Constanta", "Covasna"
			, "Dâmbovita", "Dolj", "Galati", "Giurgiu", "Gorj", "Harghita", "Hunedoara", "Ialomita", "Iasi", "Ilfov", "Maramures"
			, "Mehedinti", "Mures", "Neamt", "Olt", "Prahova", "Salaj", "Satu Mare", "Sibiu", "Suceava", "Teleorman", "Timis", "Tulcea", "Vâlcea", "Vaslui", "Vrancea"}
			, new Language[] {Language.ROMANIAN}),
	
	RUSSIA(203, "Russia", "RU", "Europe", new String[]{"Adygeya, Respublika", "Aginskiy Buryatskiy avtonomnyy okrug"
			, "Altay, Respublika", "Altayskiy kray", "Amurskaya oblast'", "Arkhangel'skaya oblast'", "Astrakhanskaya oblast'"
			, "Bashkortostan, Respublika", "Belgorodskaya oblast'", "Bryanskaya oblast'", "Buryatiya, Respublika"
			, "Chechenskaya Respublika", "Chelyabinskaya oblast'", "Chitinskaya oblast'", "Chukotskiy avtonomnyy okrug"
			, "Chuvashskaya Respublika", "Dagestan, Respublika", "Evenkiyskiy avtonomnyy okrug", "Ingushskaya Respublika [Respublika Ingushetiya]"
			, "Irkutskaya oblast'", "Ivanovskaya oblast'", "Kabardino-Balkarskaya Respublika", "Kaliningradskaya oblast'", "Kalmykiya, Respublika"
			, "Kaluzhskaya oblast'", "Kamchatskaya oblast'", "Karachayevo-Cherkesskaya Respublika", "Kareliya, Respublika", "Kemerovskaya oblast'"
			, "Khabarovskiy kray", "Khakasiya, Respublika", "Khanty-Mansiyskiy avtonomnyy okrug", "Kirovskaya oblast'"
			, "Komi-Permyatskiy avtonomnyy okrug", "Komi, Respublika", "Koryakskiy avtonomnyy okrug", "Kostromskaya oblast'"
			, "Krasnodarskiy kray", "Krasnoyarskiy kray", "Kurganskaya oblast'", "Kurskaya oblast'", "Leningradskaya oblast'"
			, "Lipetskaya oblast'", "Magadanskaya oblast'", "Mariy El, Respublika", "Mordoviya, Respublika", "Moskovskaya oblast'"
			, "Moskva", "Murmanskaya oblast'", "Nenetskiy avtonomnyy okrug", "Nizhegorodskaya oblast'", "Novgorodskaya oblast'"
			, "Novosibirskaya oblast'", "Omskaya oblast'", "Orenburgskaya oblast'", "Orlovskaya oblast'", "Penzenskaya oblast'"
			, "Permskaya oblast'", "Primorskiy kray", "Pskovskaya oblast'", "Rostovskaya oblast'", "Ryazanskaya oblast'"
			, "Sakhalinskaya oblast'", "Sakha, Respublika [Yakutiya]", "Samarskaya oblast'", "Sankt-Peterburg", "Saratovskaya oblast'"
			, "Severnaya Osetiya, Respublika [Alaniya] [Respublika Severnaya Osetiya-Alaniya]", "Smolenskaya oblast'"
			, "Stavropol'skiy kray", "Sverdlovskaya oblast'", "Tambovskaya oblast'", "Tatarstan, Respublika"
			, "Taymyrskiy (Dolgano-Nenetskiy) avtonomnyy okrug", "Tomskaya oblast'", "Tul'skaya oblast'", "Tverskaya oblast'"
			, "Tyumenskaya oblast'", "Tyva, Respublika [Tuva]", "Udmurtskaya Respublika", "Ul'yanovskaya oblast'"
			, "Ust'-Ordynskiy Buryatskiy avtonomnyy okrug", "Vladimirskaya oblast'", "Volgogradskaya oblast'", "Vologodskaya oblast'"
			, "Voronezhskaya oblast'", "Yamalo-Nenetskiy avtonomnyy okrug", "Yaroslavskaya oblast'", "Yevreyskaya avtonomnaya oblast'"}
			, new Language[] {Language.RUSSIAN}),
	
	RUSSIAN_FEDERATION(203, "Russian Federation", "RU", "Europe", new String[]{"Adygeya, Respublika", "Aginskiy Buryatskiy avtonomnyy okrug"
			, "Altay, Respublika", "Altayskiy kray", "Amurskaya oblast'", "Arkhangel'skaya oblast'", "Astrakhanskaya oblast'"
			, "Bashkortostan, Respublika", "Belgorodskaya oblast'", "Bryanskaya oblast'", "Buryatiya, Respublika", "Chechenskaya Respublika"
			, "Chelyabinskaya oblast'", "Chitinskaya oblast'", "Chukotskiy avtonomnyy okrug", "Chuvashskaya Respublika", "Dagestan, Respublika"
			, "Evenkiyskiy avtonomnyy okrug", "Ingushskaya Respublika [Respublika Ingushetiya]", "Irkutskaya oblast'", "Ivanovskaya oblast'"
			, "Kabardino-Balkarskaya Respublika", "Kaliningradskaya oblast'", "Kalmykiya, Respublika", "Kaluzhskaya oblast'", "Kamchatskaya oblast'"
			, "Karachayevo-Cherkesskaya Respublika", "Kareliya, Respublika", "Kemerovskaya oblast'", "Khabarovskiy kray", "Khakasiya, Respublika"
			, "Khanty-Mansiyskiy avtonomnyy okrug", "Kirovskaya oblast'", "Komi-Permyatskiy avtonomnyy okrug", "Komi, Respublika", "Koryakskiy avtonomnyy okrug"
			, "Kostromskaya oblast'", "Krasnodarskiy kray", "Krasnoyarskiy kray", "Kurganskaya oblast'", "Kurskaya oblast'", "Leningradskaya oblast'"
			, "Lipetskaya oblast'", "Magadanskaya oblast'", "Mariy El, Respublika", "Mordoviya, Respublika", "Moskovskaya oblast'", "Moskva"
			, "Murmanskaya oblast'", "Nenetskiy avtonomnyy okrug", "Nizhegorodskaya oblast'", "Novgorodskaya oblast'", "Novosibirskaya oblast'"
			, "Omskaya oblast'", "Orenburgskaya oblast'", "Orlovskaya oblast'", "Penzenskaya oblast'", "Permskaya oblast'", "Primorskiy kray"
			, "Pskovskaya oblast'", "Rostovskaya oblast'", "Ryazanskaya oblast'", "Sakhalinskaya oblast'", "Sakha, Respublika [Yakutiya]"
			, "Samarskaya oblast'", "Sankt-Peterburg", "Saratovskaya oblast'", "Severnaya Osetiya, Respublika [Alaniya] [Respublika Severnaya Osetiya-Alaniya]"
			, "Smolenskaya oblast'", "Stavropol'skiy kray", "Sverdlovskaya oblast'", "Tambovskaya oblast'", "Tatarstan, Respublika"
			, "Taymyrskiy (Dolgano-Nenetskiy) avtonomnyy okrug", "Tomskaya oblast'", "Tul'skaya oblast'", "Tverskaya oblast'", "Tyumenskaya oblast'"
			, "Tyva, Respublika [Tuva]", "Udmurtskaya Respublika", "Ul'yanovskaya oblast'", "Ust'-Ordynskiy Buryatskiy avtonomnyy okrug"
			, "Vladimirskaya oblast'", "Volgogradskaya oblast'", "Vologodskaya oblast'", "Voronezhskaya oblast'", "Yamalo-Nenetskiy avtonomnyy okrug"
			, "Yaroslavskaya oblast'", "Yevreyskaya avtonomnaya oblast'"}
			, new Language[] {Language.RUSSIAN}),
	
	RWANDA(327, "Rwanda", "RW", "africa", new String[]{"Butare", "Byumba", "Cyangugu", "Gikongoro", "Gisenyi", "Gitarama", "Kibungo"
			, "Kibuye", "Kigali-Rural", "Kigali-Ville", "Mutara", "Ruhengeri"}
			, new Language[] {Language.FRENCH, Language.ENGLISH}),
	
	SAINT_KITTS_AND_NEVIS(384, "Saint Kitts and Nevis", "KN", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	SAINT_LUCIA(385, "Saint Lucia", "LC", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	SAINT_PIERRE_AND_MIQUELON(386, "Saint Pierre and Miquelon", "PM", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	SAMOA(210, "Samoa", "WS", "na", new String[]{"A'ana", "Aiga-i-le-Tai", "Atua", "Fa'asaleleaga", "Gaga'emauga", "Gagaifomauga"
			, "Palauli", "Satupa'itea", "Tuamasaga", "Va'a-o-Fonoti", "Vaisigano"}
			, new Language[] {Language.ENGLISH}),
	
	SAO_TOME_AND_PRINCIPE(388, "Sao Tome and Principe", "ST", "na", new String[]{"Príncipe", "São Tomé"}
			, new Language[] {Language.ENGLISH}),
	
	SAUDI_ARABIA(213, "Saudi Arabia", "SA", "Asia", new String[]{"Al Bahah", "Al Hudud ash Shamaliyah", "Al Jawf", "Al Madinah"
			, "Al Qasim", "Ar Riyah", "Ash Sharqiyah", "Asir", "Ha'il", "Jizan", "Makkah", "Najran", "Tabuk"}
			, new Language[] {Language.ARABIC}),
	
	SENEGAL(405, "Senegal", "SN", "africa", new String[]{"Dakar", "Diourbel", "Fatick", "Kaolack", "Kolda", "Louga", "Matam"
			, "Saint-Louis", "Tambacounda", "Thiès", "Ziguinchor"}
			, new Language[] {Language.FRENCH}),
	
	SERBIA(406, "Serbia", "RS", "Europe", new String[]{}
			, new Language[] {Language.SERBIAN}),
	
	SEYCHELLES(329, "Seychelles", "SC", "na", new String[]{""}
			, new Language[] {Language.HAITIAN_CREOLE}),
	
	SIERRA_LEONE(330, "Sierra Leone", "SL", "africa", new String[]{"Eastern", "Northern", "Southern", "Western Area (Freetown)"}
			, new Language[] {Language.ENGLISH}),
	
	SINGAPORE(219, "Singapore", "SG", "asia", new String[]{""}
			, new Language[] {Language.CHINESE_SIMPLIFIED, Language.CHINESE_TRADITIONAL}),
	
	SINT_MAARTEN(389, "Sint Maarten", "SX", "south america", new String[]{}
			, new Language[] {Language.ENGLISH}),
	
	SLOVAKIA(331, "Slovakia", "SK", "Europe", new String[]{"Banskobystrický kraj", "Bratislavský kraj", "Košický kraj"
			, "Nitriansky kraj", "Prešovský kraj", "Trenciansky kraj", "Trnavský kraj", "Žilinský kraj"}
			, new Language[] {Language.SLOVAK}),
	
	SLOVENIA(221, "Slovenia", "SI", "Europe", new String[]{"Ajdovšcina", "Beltinci", "Benedikt", "Bistrica ob Sotli"
			, "Bled", "Bloke", "Bohinj", "Borovnica", "Bovec", "Braslovce", "Brda", "Brežice", "Brezovica", "Cankova"
			, "Celje", "Cerklje na Gorenjskem", "Cerknica", "Cerkno", "Cerkvenjak", "Crenšovci", "Crna na Koroškem"
			, "Crnomelj", "Destrnik", "Divaca", "Dobje", "Dobrepolje", "Dobrna", "Dobrova-Polhov Gradec", "Dobrovnik"
			, "Dolenjske Toplice", "Dol pri Ljubljani", "Domžale", "Dornava", "Dravograd", "Duplek", "Gorenja vas-Poljane"
			, "Gorišnica", "Gornja Radgona", "Gornji Grad", "Gornji Petrovci", "Grad", "Grosuplje", "Hajdina", "Hoce-Slivnica"
			, "Hodoš", "Horjul", "Hrastnik", "Hrpelje-Kozina", "Idrija", "Ig", "Ilirska Bistrica", "Ivancna Gorica", "Izola"
			, "Jesenice", "Jezersko", "Juršinci", "Kamnik", "Kanal", "Kidricevo", "Kobarid", "Kobilje", "Kocevje", "Komen"
			, "Komenda", "Koper", "Kostel", "Kozje", "Kranj", "Kranjska Gora", "Križevci", "Krško", "Kungota", "Kuzma", "Laško"
			, "Lenart", "Lendava", "Litija", "Ljubljana", "Ljubno", "Ljutomer", "Logatec", "Loška dolina", "Loški Potok"
			, "Lovrenc na Pohorju", "Luce", "Lukovica", "Majšperk", "Maribor", "Markovci", "Medvode", "Mengeš", "Metlika"
			, "Mežica", "Miklavž na Dravskem polju", "Miren-Kostanjevica", "Mirna Pec", "Mislinja", "Moravce", "Moravske Toplice"
			, "Mozirje", "Murska Sobota", "Muta", "Naklo", "Nazarje", "Nova Gorica", "Novo mesto", "Odranci", "Oplotnica"
			, "Ormož", "Osilnica", "Pesnica", "Piran", "Pivka", "Podcetrtek", "Podlehnik", "Podvelka", "Polzela", "Postojna"
			, "Prebold", "Preddvor", "Prevalje", "Ptuj", "Puconci", "Race-Fram", "Radece", "Radenci", "Radlje ob Dravi"
			, "Radovljica", "Ravne na Koroškem", "Razkrižje", "Ribnica", "Ribnica na Pohorju", "Rogaška Slatina", "Rogašovci"
			, "Rogatec", "Ruše", "Šalovci", "Selnica ob Dravi", "Semic", "Šempeter-Vrtojba", "Šencur", "Šentilj", "Šentjernej"
			, "Šentjur pri Celju", "Sevnica", "Sežana", "Škocjan", "Škofja Loka", "Škofljica", "Slovenj Gradec"
			, "Slovenska Bistrica", "Slovenske Konjice", "Šmarje pri Jelšah", "Šmartno ob Paki", "Šmartno pri Litiji"
			, "Sodražica", "Solcava", "Šoštanj", "Starše", "Štore", "Sveta Ana", "Sveti Andraž v Slovenskih goricah"
			, "Sveti Jurij", "Tabor", "Tišina", "Tolmin", "Trbovlje", "Trebnje", "Trnovska vas", "Tržic", "Trzin"
			, "Turnišce", "Velenje", "Velika Polana", "Velike Lašce", "Veržej", "Videm", "Vipava", "Vitanje"
			, "Vodice", "Vojnik", "Vransko", "Vrhnika", "Vuzenica", "Zagorje ob Savi", "Žalec", "Zavrc", "Železniki"
			, "Žetale", "Žiri", "Žirovnica", "Zrece", "Žužemberk"}
			, new Language[] {Language.SLOVENIAN}),
	
	SOLOMON_ISLANDS(390, "Solomon Islands", "SB", "na", new String[]{"Capital Territory (Honiara)", "Central"
			, "Guadalcanal", "Isabel", "Makira", "Malaita", "Temotu", "Western"}
			, new Language[] {Language.ENGLISH}),
	
	SOMALIA(332, "Somalia", "SO", "africa", new String[]{"Awdal", "Bakool", "Banaadir", "Bari", "Bay", "Galguduud"
			, "Gedo", "Hiiraan", "Jubbada Dhexe", "Jubbada Hoose", "Mudug", "Nugaal", "Sanaag", "Shabeellaha Dhexe"
			, "Shabeellaha Hoose", "Sool", "Togdheer", "Woqooyi Galbeed"}
			, new Language[] {Language.SOMALI}),
	
	SOUTH_AFRICA(333, "South Africa", "ZA", "africa", new String[]{"Eastern Cape", "Free State", "Gauteng"
			, "Kwazulu-Natal", "Mpumalanga", "Northern Cape", "Northern Province", "North-West", "Western Cape"}
			, new Language[] {Language.ENGLISH, Language.ZULU, Language.AFRIKAANS}),
	
	SOUTH_KOREA(133, "South Korea", "KR", "Asia", new String[]{"Busan Gwang'yeogsi [Pusan-Kwangyokshi]"
			, "Chungcheongbugdo [Ch'ungch'ongbuk-do]", "Chungcheongnamdo [Ch'ungch'ongnam-do]", "Daegu Gwang'yeogsi [Taegu-Kwangyokshi]"
			, "Daejeon Gwang'yeogsi [Taejon-Kwangyokshi]", "Gang'weondo [Kang-won-do]", "Gwangju Gwang'yeogsi [Kwangju-Kwangyokshi]"
			, "Gyeonggido [Kyonggi-do]", "Gyeongsangbugdo [Kyongsangbuk-do]", "Gyeongsangnamdo [Kyongsangnam-do]"
			, "Incheon Gwang'yeogsi [Inch'n-Kwangyokshi]", "Jejudo [Cheju-do]", "Jeonrabugdo[Chollabuk-do]", "Jeonranamdo [Chollanam-do]"
			, "Seoul Teugbyeolsi [Seoul-T'ukpyolshi]", "Ulsan Gwang'yeogsi [Ulsan-Kwangyokshi]"}
			, new Language[] {Language.KOREAN}),
	
	SOUTH_SUDAN(392, "South Sudan", "SS", "africa", new String[]{}
			, new Language[] {Language.ENGLISH, Language.ARABIC}),
	
	SPAIN(226, "Spain", "ES", "Europe", new String[]{"A Coruña", "Álava", "Albacete", "Alicante", "Almería", "Asturias"
			, "Ávila", "Badajoz", "Baleares", "Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ceuta"
			, "Ciudad Real", "Córdoba", "Cuenca", "Girona", "Granada", "Guadalajara", "Guipúzcoa", "Huelva", "Huesca"
			, "Jaén", "La Rioja", "Las Palmas", "León", "Lleida", "Lugo", "Madrid", "Málaga", "Melilla", "Murcia"
			, "Navarra", "Ourense", "Palencia", "Pontevedra", "Salamanca", "Santa Cruz de Tenerife", "Segovia", "Sevilla"
			, "Soria", "Tarragona", "Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza"}
			, new Language[] {Language.SPANISH}),
	
	SUDAN(334, "Sudan", "SD", "africa", new String[]{"Ahali an Nil", "Al Bahr al Ahmar", "Al Buhayrat", "Al Jazirah"
			, "Al Khartum", "Al Qaharif", "Al Wahdah", "An Nil", "An Nil al Abyah", "An Nil al Azraq", "Ash Shamaliyah"
			, "Bahr al Jabal", "Gharb al Istiwa'iyah", "Gharb Bahr al Ghazal", "Gharb Darfur", "Gharb Kurdufan", "Janub Darfur"
			, "Janub Kurdufan", "Junqali", "Kassala", "Shamal Bahr al Ghazal", "Shamal Darfur", "Shamal Kurdufan", "Sharq al Istiwa'iyah", "Sinnar", "Warab"}
			, new Language[] {Language.ARABIC}),
	
	SURINAME(335, "Suriname", "SR", "south america", new String[]{"Brokopondo", "Commewijne", "Coronie", "Marowijne"
			, "Nickerie", "Para", "Paramaribo", "Saramacca", "Sipaliwini", "Wanica"}
			, new Language[] {Language.DUTCH}),
	
	SWAZILAND(394, "Swaziland", "SZ", "africa", new String[]{"Hhohho", "Lubombo", "Manzini", "Shiselweni"}
			, new Language[] {Language.SWAHILI, Language.ENGLISH}),
	
	SWEDEN(233, "Sweden", "SE", "Europe", new String[]{"Blekinge län [SE-10]", "Dalarnas län [SE-20]", "Gävleborgs län [SE-21]"
			, "Gotlands län [SE-09]", "Hallands län [SE-13]", "Jämtlands län [SE-23]", "Jönköpings län [SE-06]"
			, "Kalmar län [SE-08]", "Kronobergs län [SE-07]", "Norrbottens län [SE-25]", "Örebro län [SE-18]"
			, "Östergötlands län [SE-05]", "Skåne län [SE-12]", "Södermanlands län [SE-04]", "Stockholms län [SE-01]"
			, "Uppsala län [SE-03]", "Värmlands län [SE-17]", "Västerbottens län [SE-24]", "Västernorrlands län [SE-22]"
			, "Västmanlands län [SE-19]", "Västra Götalands län [SE-14]"}
			, new Language[] {Language.SWEDISH}),
	
	SWITZERLAND(234, "Switzerland", "CH", "Europe", new String[]{"Aargau (de)", "Appenzell Ausserrhoden (de)"
			, "Appenzell Innerrhoden (de)", "Basel-Landschaft (de)", "Basel-Stadt (de)", "Bern (de)", "Fribourg (fr)"
			, "Genève (fr)", "Glarus (de)", "Graubünden (de)", "Jura (fr)", "Luzern (de)", "Neuchâtel (fr)", "Nidwalden (de)"
			, "Obwalden (de)", "Sankt Gallen (de)", "Schaffhausen (de)", "Schwyz (de)", "Solothurn (de)", "Thurgau (de)"
			, "Ticino (it)", "Uri (de)", "Valais (fr)", "Vaud (fr)", "Zug (de)", "Zürich (de)"}
			, new Language[] {Language.GERMAN, Language.FRENCH}),
	
	SYRIA(336, "Syria", "SY", "Asia", new String[]{"Al Hasakah", "Al Ladhiqiyah", "Al Qunaytirah", "Ar Raqqah"
			, "As Suwayda'", "Darha", "Dayr az Zawr", "Dimashq", "Halab", "Hamah", "Hims", "Idlib", "Rif Dimashq", "Tartus"}
			, new Language[] {Language.ARABIC}),
	
	TAIWAN(236, "Taiwan", "TW", "asia", new String[]{"Changhua", "Chiayi", "Chiayi", "Hsinchu", "Hsinchu"
			, "Hualien", "Ilan", "Kaohsiung", "Kaohsiung", "Keelung", "Miaoli", "Nantou", "Penghu", "Pingtung"
			, "Taichung", "Taichung", "Tainan", "Tainan", "Taipei", "Taipei", "Taitung", "Taoyuan", "Yunlin"}
			, new Language[] {Language.CHINESE_SIMPLIFIED}),
	
	TAJIKISTAN(337, "Tajikistan", "TJ", "asia", new String[]{"Gorno-Badakhshan", "Khatlon", "Sughd"}
			, new Language[] {Language.TAJIK, Language.RUSSIAN}),
	
	TANZANIA(338, "Tanzania", "TZ", "africa", new String[]{"Arusha", "Dar es Salaam", "Dodoma", "Iringa", "Kagera"
			, "Kaskazini Pemba", "Kaskazini Unguja", "Kigoma", "Kilimanjaro", "Kusini Pemba", "Kusini Unguja", "Lindi"
			, "Manyara", "Mara", "Mbeya", "Mjini Magharibi", "Morogoro", "Mtwara", "Mwanza", "Pwani", "Rukwa", "Ruvuma"
			, "Shinyanga", "Singida", "Tabora", "Tanga"}
			, new Language[] {Language.SWAHILI, Language.ENGLISH}),
	
	THAILAND(239, "Thailand", "TH", "Asia", new String[]{"Amnat Charoen", "Ang Thong", "Buri Ram", "Chachoengsao"
			, "Chai Nat", "Chaiyaphum", "Chanthaburi", "Chiang Mai", "Chiang Rai", "Chon Buri", "Chumphon", "Kalasin"
			, "Kamphaeng Phet", "Kanchanaburi", "Khon Kaen", "Krabi", "Krung Thep Maha Nakhon [Bangkok]", "Lampang"
			, "Lamphun", "Loei", "Lop Buri", "Mae Hong Son", "Maha Sarakham", "Mukdahan", "Nakhon Nayok", "Nakhon Pathom"
			, "Nakhon Phanom", "Nakhon Ratchasima", "Nakhon Sawan", "Nakhon Si Thammarat", "Nan", "Narathiwat", "Nong Bua Lam Phu"
			, "Nong Khai", "Nonthaburi", "Pathum Thani", "Pattani", "Phangnga", "Phatthalung", "Phatthaya", "Phayao", "Phetchabun"
			, "Phetchaburi", "Phichit", "Phitsanulok", "Phrae", "Phra Nakhon Si Ayutthaya", "Phuket", "Prachin Buri", "Prachuap Khiri Khan"
			, "Ranong", "Ratchaburi", "Rayong", "Roi Et", "Sa Kaeo", "Sakon Nakhon", "Samut Prakan", "Samut Sakhon", "Samut Songkhram"
			, "Saraburi", "Satun", "Sing Buri", "Si Sa Ket", "Songkhla", "Sukhothai", "Suphan Buri", "Surat Thani", "Surin", "Tak"
			, "Trang", "Trat", "Ubon Ratchathani", "Udon Thani", "Uthai Thani", "Uttaradit", "Yala", "Yasothon"}
			, new Language[] {Language.THAI}),
	
	TOGO(340, "Togo", "TG", "africa", new String[]{"Centre", "Kara", "Maritime (Région)", "Plateaux", "Savannes"}
			, new Language[] {Language.FRENCH}),
	
	TOKELAU(341, "Tokelau", "TK", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	TONGA(342, "Tonga", "TO", "na", new String[]{}
			, new Language[] {Language.ENGLISH}),
	
	TRINIDAD_AND_TOBAGO(407, "Trinidad and Tobago", "TT", "south america", new String[]{"Arima", "Chaguanas", "Couva-Tabaquite-Talparo"
			, "Diego Martin", "Eastern Tobago", "Penal-Debe", "Point Fortin", "Port of Spain", "Princes Town", "Rio Claro-Mayaro"
			, "San Fernando", "Sangre Grande", "San Juan-Laventille", "Siparia", "Tunapuna-Piarco", "Western Tobago"}
			, new Language[] {Language.ENGLISH, Language.HINDI}),
	
	TUNISIA(343, "Tunisia", "TN", "africa", new String[]{"Béja", "Ben Arous", "Bizerte", "Gabès", "Gafsa", "Jendouba", "Kairouan"
			, "Kasserine", "Kebili", "L'Ariana", "Le Kef", "Mahdia", "Manouba", "Medenine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid"
			, "Siliana", "Sousse", "Tataouine", "Tozeur", "Tunis", "Zaghouan"}
			, new Language[] {Language.ARABIC, Language.FRENCH}),
	
	TURKEY(246, "Turkey", "TR", "Asia", new String[]{"Adana", "Adiyaman", "Afyon", "Agri", "Aksaray", "Amasya", "Ankara", "Antalya"
			, "Ardahan", "Artvin", "Aydin", "Balikesir", "Bartin", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur"
			, "Bursa", "Çanakkale", "Çankiri", "Çorum", "Denizli", "Diyarbakir", "Düzce", "Edirne", "Elazig", "Erzincan", "Erzurum"
			, "Eskisehir", "Gaziantep", "Giresun", "Gümüshane", "Hakkâri", "Hatay", "Içel", "Igdir", "Isparta", "Istanbul", "Izmir"
			, "Kahramanmaras", "Karabük", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kilis", "Kirikkale", "Kirklareli", "Kirsehir"
			, "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Mardin", "Mugla", "Mus", "Nevsehir", "Nigde", "Ordu", "Osmaniye"
			, "Rize", "Sakarya", "Samsun", "Sanliurfa", "Siirt", "Sinop", "Sirnak", "Sivas", "Tekirdag", "Tokat", "Trabzon", "Tunceli"
			, "Usak", "Van", "Yalova", "Yozgat", "Zonguldak"}
			, new Language[] {Language.TURKISH}),
	
	TURKMENISTAN(344, "Turkmenistan", "TM", "asia", new String[]{"Ahal", "Balkan", "Dasoguz", "Lebap", "Mary"}
			, new Language[] {Language.RUSSIAN}),
	
	TURKS_AND_CAICOS_ISLANDS(395, "Turks and Caicos Islands", "TC", "na", new String[]{""}
			, new Language[] {Language.TURKISH}),
	
	TUVALU(345, "Tuvalu", "TV", "na", new String[]{""}
			, new Language[] {Language.ENGLISH}),
	
	UGANDA(346, "Uganda", "UG", "africa", new String[]{"Adjumani", "Apac", "Arua", "Bugiri", "Bundibugyo", "Bushenyi", "Busia"
			, "Gulu", "Hoima", "Iganga", "Jinja", "Kabale", "Kabarole", "Kaberamaido", "Kalangala", "Kampala", "Kamuli", "Kamwenge"
			, "Kanungu", "Kapchorwa", "Kasese", "Katakwi", "Kayunga", "Kibaale", "Kiboga", "Kisoro", "Kitgum", "Kotido", "Kumi"
			, "Kyenjojo", "Lira", "Luwero", "Masaka", "Masindi", "Mayuge", "Mbale", "Mbarara", "Moroto", "Moyo", "Mpigi", "Mubende"
			, "Mukono", "Nakapiripirit", "Nakasongola", "Nebbi", "Ntungamo", "Pader", "Pallisa", "Rakai", "Rukungiri", "Sembabule"
			, "Sironko", "Soroti", "Tororo", "Wakiso", "Yumbe"}
			, new Language[] {Language.ENGLISH, Language.SWAHILI}),
	
	UKRAINE(251, "Ukraine", "UA", "Europe", new String[]{"Cherkas'ka Oblast'", "Chernihivs'ka Oblast'", "Chernivets'ka Oblast'"
			, "Dnipropetrovs'ka Oblast'", "Donets'ka Oblast'", "Ivano-Frankivs'ka Oblast'", "Kharkivs'ka Oblast'", "Khersons'ka Oblast'"
			, "Khmel'nyts'ka Oblast'", "Kirovohrads'ka Oblast'", "Kyïv", "Kyïvs'ka Oblast'", "Luhans'ka Oblast'", "L'vivs'ka Oblast'"
			, "Mykolaïvs'ka Oblast'", "Odes'ka Oblast'", "Poltavs'ka Oblast'", "Respublika Krym", "Rivnens'ka Oblast'", "Sevastopol'"
			, "Sums'ka Oblast'", "Ternopil's'ka Oblast'", "Vinnyts'ka Oblast'", "Volyns'ka Oblast'", "Zakarpats'ka Oblast'", "Zaporiz'ka Oblast'", "Zhytomyrs'ka Oblast'"}
			, new Language[] {Language.UKRAINIAN, Language.RUSSIAN}),
	
	UNITED_KINGDOM(253, "United Kingdom", "GB", "Europe", new String[]{"Aberdeen City", "Aberdeenshire", "Angus", "Antrim"
			, "Ards", "Argyll and Bute", "Armagh", "Ballymena", "Ballymoney", "Banbridge", "Barking and Dagenham", "Barnet"
			, "Barnsley", "Bath and North East Somerset", "Bedfordshire", "Belfast", "Bexley", "Birmingham", "Blackburn with Darwen"
			, "Blackpool", "Blaenau Gwent", "Bolton", "Bournemouth", "Bracknell Forest", "Bradford", "Brent"
			, "Bridgend [Pen-y-bont ar Ogwr GB-POG]", "Brighton and Hove", "Bristol, City of", "Bromley", "Buckinghamshire"
			, "Bury", "Caerphilly [Caerffili GB-CAF]", "Calderdale", "Cambridgeshire", "Camden", "Cardiff [Caerdydd GB-CRD]"
			, "Carmarthenshire [Sir Gaerfyrddin GB-GFY]", "Carrickfergus", "Castlereagh", "Ceredigion [Sir Ceredigion]"
			, "Cheshire", "Clackmannanshire", "Coleraine", "Conwy", "Cookstown", "Cornwall", "Coventry", "Craigavon"
			, "Croydon", "Cumbria", "Darlington", "Denbighshire [Sir Ddinbych GB-DDB]", "Derby", "Derbyshire", "Derry"
			, "Devon", "Doncaster", "Dorset", "Down", "Dudley", "Dumfries and Galloway", "Dundee City", "Dungannon"
			, "Durham", "Ealing", "East Ayrshire", "East Dunbartonshire", "East Lothian", "East Renfrewshire"
			, "East Riding of Yorkshire", "East Sussex", "Edinburgh, City of", "Eilean Siar", "Enfield", "Essex"
			, "Falkirk", "Fermanagh", "Fife", "Flintshire [Sir y Fflint GB-FFL]", "Gateshead", "Glasgow City"
			, "Gloucestershire", "Greenwich", "Guernsey [Guernesey]", "Gwynedd", "Hackney", "Halton", "Hammersmith and Fulham"
			, "Hampshire", "Haringey", "Harrow", "Hartlepool", "Havering", "Herefordshire, County of", "Hertfordshire"
			, "Highland", "Hillingdon", "Hounslow", "Inverclyde", "Isle of Anglesey [Sir Ynys Môn GB-YNM]", "Isle of Wight"
			, "Isles of Scilly", "Islington", "Jersey", "Kensington and Chelsea", "Kent", "Kingston upon Hull, City of"
			, "Kingston upon Thames", "Kirklees", "Knowsley", "Lambeth", "Lancashire", "Larne", "Leeds", "Leicester"
			, "Leicestershire", "Lewisham", "Limavady", "Lincolnshire", "Lisburn", "Liverpool", "London, City of", "Luton"
			, "Magherafelt", "Manchester", "Medway", "Merthyr Tydfil [Merthyr Tudful GB-MTU]", "Merton", "Middlesbrough"
			, "Midlothian", "Milton Keynes", "Monmouthshire [Sir Fynwy GB-FYN]", "Moray", "Moyle", "Neath Port Talbot [Castell-nedd Port Talbot GB-CTL]"
			, "Newcastle upon Tyne", "Newham", "Newport [Casnewydd GB-CNW]", "Newry and Mourne", "Newtownabbey", "Norfolk", "Northamptonshire"
			, "North Ayrshire", "North Down", "North East Lincolnshire", "North Lanarkshire", "North Lincolnshire", "North Somerset"
			, "North Tyneside", "Northumberland", "North Yorkshire", "Nottingham", "Nottinghamshire", "Oldham", "Omagh", "Orkney Islands"
			, "Oxfordshire", "Pembrokeshire [Sir Benfro GB-BNF]", "Perth and Kinross", "Peterborough", "Plymouth", "Poole"
			, "Portsmouth", "Powys", "Reading", "Redbridge", "Redcar and Cleveland", "Renfrewshire", "Rhondda, Cynon, Taff [Rhondda, Cynon,Taf]"
			, "Richmond upon Thames", "Rochdale", "Rotherham", "Rutland", "Salford", "Sandwell", "Scottish Borders, The"
			, "Sefton", "Sheffield", "Shetland Islands", "Shropshire", "Slough", "Solihull", "Somerset", "Southampton"
			, "South Ayrshire", "Southend-on-Sea", "South Gloucestershire", "South Lanarkshire", "South Tyneside", "Southwark"
			, "Staffordshire", "St. Helens", "Stirling", "Stockport", "Stockton-on-Tees", "Stoke-on-Trent", "Strabane"
			, "Suffolk", "Sunderland", "Surrey", "Sutton", "Swansea [Abertawe GB-ATA]", "Swindon", "Tameside", "Telford and Wrekin"
			, "Thurrock", "Torbay", "Torfaen [Tor-faen]", "Tower Hamlets", "Trafford", "Vale of Glamorgan, The [Bro Morgannwg GB-BMG]"
			, "Wakefield", "Walsall", "Waltham Forest", "Wandsworth", "Warrington", "Warwickshire", "West Berkshire", "West Dunbartonshire"
			, "West Lothian", "Westminster", "West Sussex", "Wigan", "Wiltshire", "Windsor and Maidenhead", "Wirral", "Wokingham"
			, "Wolverhampton", "Worcestershire", "Wrexham [Wrecsam GB-WRC]", "York"}
			, new Language[] {Language.ENGLISH}),
	
	UNITED_KINGDOM_ALT(253, "United Kingdom (Alt.)", "UK", "Europe", new String[]{"Aberdeen City", "Aberdeenshire", "Angus", "Antrim"
			, "Ards", "Argyll and Bute", "Armagh", "Ballymena", "Ballymoney", "Banbridge", "Barking and Dagenham", "Barnet"
			, "Barnsley", "Bath and North East Somerset", "Bedfordshire", "Belfast", "Bexley", "Birmingham", "Blackburn with Darwen"
			, "Blackpool", "Blaenau Gwent", "Bolton", "Bournemouth", "Bracknell Forest", "Bradford", "Brent"
			, "Bridgend [Pen-y-bont ar Ogwr GB-POG]", "Brighton and Hove", "Bristol, City of", "Bromley", "Buckinghamshire"
			, "Bury", "Caerphilly [Caerffili GB-CAF]", "Calderdale", "Cambridgeshire", "Camden", "Cardiff [Caerdydd GB-CRD]"
			, "Carmarthenshire [Sir Gaerfyrddin GB-GFY]", "Carrickfergus", "Castlereagh", "Ceredigion [Sir Ceredigion]"
			, "Cheshire", "Clackmannanshire", "Coleraine", "Conwy", "Cookstown", "Cornwall", "Coventry", "Craigavon"
			, "Croydon", "Cumbria", "Darlington", "Denbighshire [Sir Ddinbych GB-DDB]", "Derby", "Derbyshire", "Derry"
			, "Devon", "Doncaster", "Dorset", "Down", "Dudley", "Dumfries and Galloway", "Dundee City", "Dungannon"
			, "Durham", "Ealing", "East Ayrshire", "East Dunbartonshire", "East Lothian", "East Renfrewshire"
			, "East Riding of Yorkshire", "East Sussex", "Edinburgh, City of", "Eilean Siar", "Enfield", "Essex"
			, "Falkirk", "Fermanagh", "Fife", "Flintshire [Sir y Fflint GB-FFL]", "Gateshead", "Glasgow City"
			, "Gloucestershire", "Greenwich", "Guernsey [Guernesey]", "Gwynedd", "Hackney", "Halton", "Hammersmith and Fulham"
			, "Hampshire", "Haringey", "Harrow", "Hartlepool", "Havering", "Herefordshire, County of", "Hertfordshire"
			, "Highland", "Hillingdon", "Hounslow", "Inverclyde", "Isle of Anglesey [Sir Ynys Môn GB-YNM]", "Isle of Wight"
			, "Isles of Scilly", "Islington", "Jersey", "Kensington and Chelsea", "Kent", "Kingston upon Hull, City of"
			, "Kingston upon Thames", "Kirklees", "Knowsley", "Lambeth", "Lancashire", "Larne", "Leeds", "Leicester"
			, "Leicestershire", "Lewisham", "Limavady", "Lincolnshire", "Lisburn", "Liverpool", "London, City of", "Luton"
			, "Magherafelt", "Manchester", "Medway", "Merthyr Tydfil [Merthyr Tudful GB-MTU]", "Merton", "Middlesbrough"
			, "Midlothian", "Milton Keynes", "Monmouthshire [Sir Fynwy GB-FYN]", "Moray", "Moyle", "Neath Port Talbot [Castell-nedd Port Talbot GB-CTL]"
			, "Newcastle upon Tyne", "Newham", "Newport [Casnewydd GB-CNW]", "Newry and Mourne", "Newtownabbey", "Norfolk", "Northamptonshire"
			, "North Ayrshire", "North Down", "North East Lincolnshire", "North Lanarkshire", "North Lincolnshire", "North Somerset"
			, "North Tyneside", "Northumberland", "North Yorkshire", "Nottingham", "Nottinghamshire", "Oldham", "Omagh", "Orkney Islands"
			, "Oxfordshire", "Pembrokeshire [Sir Benfro GB-BNF]", "Perth and Kinross", "Peterborough", "Plymouth", "Poole"
			, "Portsmouth", "Powys", "Reading", "Redbridge", "Redcar and Cleveland", "Renfrewshire", "Rhondda, Cynon, Taff [Rhondda, Cynon,Taf]"
			, "Richmond upon Thames", "Rochdale", "Rotherham", "Rutland", "Salford", "Sandwell", "Scottish Borders, The"
			, "Sefton", "Sheffield", "Shetland Islands", "Shropshire", "Slough", "Solihull", "Somerset", "Southampton"
			, "South Ayrshire", "Southend-on-Sea", "South Gloucestershire", "South Lanarkshire", "South Tyneside", "Southwark"
			, "Staffordshire", "St. Helens", "Stirling", "Stockport", "Stockton-on-Tees", "Stoke-on-Trent", "Strabane"
			, "Suffolk", "Sunderland", "Surrey", "Sutton", "Swansea [Abertawe GB-ATA]", "Swindon", "Tameside", "Telford and Wrekin"
			, "Thurrock", "Torbay", "Torfaen [Tor-faen]", "Tower Hamlets", "Trafford", "Vale of Glamorgan, The [Bro Morgannwg GB-BMG]"
			, "Wakefield", "Walsall", "Waltham Forest", "Wandsworth", "Warrington", "Warwickshire", "West Berkshire", "West Dunbartonshire"
			, "West Lothian", "Westminster", "West Sussex", "Wigan", "Wiltshire", "Windsor and Maidenhead", "Wirral", "Wokingham"
			, "Wolverhampton", "Worcestershire", "Wrexham [Wrecsam GB-WRC]", "York"}
			, new Language[] {Language.ENGLISH}),
	
	UNITED_STATES(254, "United States", "US", "North America", new String[]{"Alabama", "Alaska", "American Samoa (see also separate entry under AS)"
			, "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia"
			, "Guam (see also separate entry under GU)", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky"
			, "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana"
			, "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota"
			, "Northern Mariana Islands (see also separate entry under MP)", "Ohio", "Oklahoma", "Oregon", "Pennsylvania"
			, "Puerto Rico (see also separate entry under PR)", "Rhode Island", "South Carolina", "South Dakota", "Tennessee"
			, "Texas", "United States Minor Outlying Islands (see also separate entry under UM)", "Utah", "Vermont", "Virginia"
			, "Virgin Islands, U.S. (see also separate entry under VI)", "Washington", "West Virginia", "Wisconsin", "Wyoming"}
			, new Language[] {Language.ENGLISH}),
	
	URUGUAY(347, "Uruguay", "UY", "south america", new String[]{"Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno"
			, "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysandú", "Río Negro", "Rivera", "Rocha", "Salto"
			, "San José", "Soriano", "Tacuarembó", "Treinta y Tres"}
			, new Language[] {Language.SPANISH}),
	
	UZBEKISTAN(348, "Uzbekistan", "UZ", "asia", new String[]{"Andijon", "Buxoro", "Farg'ona", "Jizzax", "Namangan", "Navoiy"
			, "Qashqadaryo", "Qoraqalpog'iston Respublikasi", "Samarqand", "Sirdaryo", "Surxondaryo", "Toshkent", "Toshkent", "Xorazm"}
			, new Language[] {Language.UZBEK}),
	
	VANUATU(349, "Vanuatu", "VU", "na", new String[]{"Malampa", "Pénama", "Sanma", "Shéfa", "Taféa", "Torba"}
			, new Language[] {Language.ENGLISH}),
	
	VENEZUELA(259, "Venezuela", "VE", "south america", new String[]{"Amazonas", "Anzoátegui", "Apure", "Aragua", "Barinas"
			, "Bolívar", "Carabobo", "Cojedes", "Delta Amacuro", "Dependencias Federales", "Distrito Federal", "Falcón", "Guárico"
			, "Lara", "Mérida", "Miranda", "Monagas", "Nueva Esparta", "Portuguesa", "Sucre", "Táchira", "Trujillo", "Vargas", "Yaracuy", "Zulia"}
			, new Language[] {Language.SPANISH}),
	
	VIETNAM(-1, "Vietnam", "VN", "asia", new String[] {}
			, new Language[] {Language.VIETNAMESE}),
	
	WESTERN_SAHARA(398, "Western Sahara", "EH", "Africa", new String[]{}
			, new Language[] {Language.ARABIC}),
	
	YEMEN(352, "Yemen", "YE", "Asia", new String[]{"Abyan", "Adan", "Al Bayha'", "Al Hudaydah", "Al Jawf", "Al Mahrah"
			, "Al Mahwit", "Dhamar", "Hahramawt", "Hajjah", "Ibb", "Lahij", "Ma'rib", "Sahdah", "Sanha'", "Shabwah", "Tahizz"}
			, new Language[] {Language.ARABIC}),
	
	ZAMBIA(353, "Zambia", "ZM", "africa", new String[]{"Central", "Copperbelt", "Eastern", "Luapula", "Lusaka", "Northern"
			, "North-Western", "Southern", "Western"}
			, new Language[] {Language.ENGLISH}),
	
	ZIMBABWE(354, "Zimbabwe", "ZW", "africa", new String[]{"Bulawayo", "Harare", "Manicaland", "Mashonaland Central"
			, "Mashonaland East", "Mashonaland West", "Masvingo", "Matabeleland North", "Matabeleland South", "Midlands"}
			, new Language[] {Language.ENGLISH});


	
	/**
	 * The country id.
	 */
	private final int id;
	
	/**
	 * The country name.
	 */
	private final String name;
	
    /*
     * The country code.
     */
    private final String code;
    
    /**
     * The continent of the country.
     */
    private final String continent;
    
    /**
     * The regions.
     */
    private final String[] regions;
    
    /**
     * The languages.
     */
    private final Language[] languages;
    
    
    /**
     * Creates a new country.
     * 
     * @param id The country id.
     * 
     * @param name The country name.
     * 
     * @param code The country code.
     * 
     * @param continent The continent of the country.
     * 
     * @param regions The regions.
     * 
     * @param languages The languages.
     */
    private Country(int id, String name, String code, String continent, String[] regions, Language[] languages) {
    	this.id = id;
    	this.name = name;
    	this.code = code;
    	this.continent = continent;
    	this.regions = regions;
    	this.languages = languages;
    }
    
    /**
     * Retrieves the country id.
     * 
     * @return The id.
     */
    public int getId() {
    	return id;
    }
    
    /**
     * Retrieves the country name.
     * 
     * @return The name.
     */
    public String getName() {
    	return name;
    }
    
    /**
     * Retrieves the cities.
     * 
     * @return The cities.
     */
    public String[] getRegions() {
    	return regions;
    }
    
    /**
     * Retrieves the continent of the country.
     * 
     * @return The continent.
     */
    public String getContinent() {
    	return continent;
    }
    
    /**
     * Retrieves the country code.
     * 
     * @return The code.
     */
    public String getCode() {
    	return code;
    }
    
    /**
     * Retrieves the languages.
     * 
     * @return The languages.
     */
    public Language[] getLanguages() {
    	return languages;
    }
    
    /**
     * Retrieves whether a country has a given language or not.
     * 
     * @param lang The language.
     * 
     * @return The result.
     */
    public boolean hasLanguage(Language lang) {
    	if (Objects.isNull(getLanguages()) || getLanguages().length <= 0) {
    		return false;
    	}
    	for (Language l : getLanguages()) {
    		if (l == lang) {
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * Retrieves a random language spoken in the country.
     * 
     * @return The language.
     */
    public Language getRandomLanguage() {
    	if (Objects.isNull(getLanguages()) || getLanguages().length <= 0) {
    		return Language.ENGLISH;
    	}
    	return getLanguages()[Maths.random(getLanguages().length)];
    }
    
    /**
     * Retrieves a random network code taken from the countries spoken languages.
     * 
     * @return The random network code.
     */
    public String getRandomNetworkCode() {
    	return getNetworkCode(getRandomLanguage());
    }
   
    /**
     * Retrieves the network code for a given country and language.
     * 
     * @param country The country.
     * 
     * @param language The language.
     * 
     * @return The network code.
     */
    public String getNetworkCode(Language language) {
    	return language.getCode() + "-" + getCode() + "," + language.getCode() + ";q=0.9";
    }
    
    /**
     * Retrieves a country by it's name.
     * 
     * @param name The name.
     * 
     * @return The country.
     */
    public static Country getCountryByName(String name) {
    	for (Country cr : Country.values()) {
    		if (cr.getName().equalsIgnoreCase(name)) {
    			return cr;
    		}
    	}
    	return null;
    }
    
    /**
     * Retrieves a country by it's code.
     * 
     * @param name The name.
     * 
     * @return The country.
     */
    public static Country getCountryByCode(String code) {
    	for (Country cr : Country.values()) {
    		if (cr.getCode().equalsIgnoreCase(code)) {
    			return cr;
    		}
    	}
    	return null;
    }
    
    @Override
    public String toString() {
    	return getName();
    }

}
