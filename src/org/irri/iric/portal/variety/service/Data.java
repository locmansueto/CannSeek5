package org.irri.iric.portal.variety.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.irri.iric.portal.AppContext;

/**
 * Hard-coded variety-related data
 * 
 * @author LMansueto
 *
 */
public class Data {

	private static Map<String, String> mapSub2Color;
	private static Map<String, String> mapSub2General;

	/*
	 * public static Map<String, Double> getGWASPlot2() { Map map = getGWASPlot();
	 * Iterator<String> itPos=map.keySet().iterator(); Map newmap=new
	 * LinkedHashMap(); while(itPos.hasNext()) { String pos=itPos.next();
	 * newmap.put(pos, -Math.log10( ((double[])map.get(pos))[2] )); } return newmap;
	 * }
	 * 
	 * public static Map getGWASPlot() { Map mapCode2XY=new LinkedHashMap();
	 * mapCode2XY.put("1-2277402", new double[] {1,2277402,9.88073882883665E-06});
	 * mapCode2XY.put("1-6493052", new double[] {1,6493052,5.02846573455688E-06});
	 * mapCode2XY.put("1-6493618", new double[] {1,6493618,3.87907236007623E-06});
	 * mapCode2XY.put("1-10398472", new double[] {1,10398472,9.59045789329633E-06});
	 * mapCode2XY.put("1-25711083", new double[] {1,25711083,3.45212954379112E-06});
	 * mapCode2XY.put("2-7586113", new double[] {2,7586113,2.1217842983277E-06});
	 * mapCode2XY.put("2-10221889", new double[] {2,10221889,7.17251929446992E-06});
	 * mapCode2XY.put("2-15292058", new double[] {2,15292058,3.6959226370569E-06});
	 * mapCode2XY.put("3-1296231", new double[] {3,1296231,2.40737365284592E-06});
	 * mapCode2XY.put("3-1298956", new double[] {3,1298956,4.99728249462166E-06});
	 * mapCode2XY.put("3-30746040", new double[] {3,30746040,8.26615443423615E-06});
	 * mapCode2XY.put("3-30764871", new double[] {3,30764871,6.50912818514264E-06});
	 * mapCode2XY.put("3-30771427", new double[] {3,30771427,4.07415927165625E-06});
	 * mapCode2XY.put("3-30848584", new double[] {3,30848584,1.35380286438566E-06});
	 * mapCode2XY.put("3-30848878", new double[] {3,30848878,3.49194966567939E-06});
	 * mapCode2XY.put("3-30873473", new double[] {3,30873473,6.11351396492714E-06});
	 * mapCode2XY.put("3-30877580", new double[] {3,30877580,4.99088303313267E-06});
	 * mapCode2XY.put("3-30877594", new double[] {3,30877594,4.00068044932147E-06});
	 * mapCode2XY.put("3-30877642", new double[] {3,30877642,5.83949389393804E-06});
	 * mapCode2XY.put("3-30877727", new double[] {3,30877727,2.3497881943892E-06});
	 * mapCode2XY.put("3-30877908", new double[] {3,30877908,4.38589443506324E-06});
	 * mapCode2XY.put("3-30878082", new double[] {3,30878082,9.56436792328842E-06});
	 * mapCode2XY.put("3-30879584", new double[] {3,30879584,2.6700852104029E-06});
	 * mapCode2XY.put("3-30879588", new double[] {3,30879588,1.13075019341606E-06});
	 * mapCode2XY.put("3-30879670", new double[] {3,30879670,9.10030855264123E-06});
	 * mapCode2XY.put("3-30879693", new double[] {3,30879693,4.3259127931228E-06});
	 * mapCode2XY.put("3-30880326", new double[] {3,30880326,3.32196029767367E-06});
	 * mapCode2XY.put("3-30880353", new double[] {3,30880353,6.21943600752884E-06});
	 * mapCode2XY.put("3-30880375", new double[] {3,30880375,1.52583630559171E-06});
	 * mapCode2XY.put("3-30880440", new double[] {3,30880440,1.07862343421225E-06});
	 * mapCode2XY.put("3-30881095", new double[] {3,30881095,6.08765908663246E-06});
	 * mapCode2XY.put("3-30881152", new double[] {3,30881152,1.88737608547807E-06});
	 * mapCode2XY.put("3-30881408", new double[] {3,30881408,3.62486986916804E-06});
	 * mapCode2XY.put("3-30883347", new double[] {3,30883347,0.000003217854855986});
	 * mapCode2XY.put("3-30883514", new double[] {3,30883514,3.14829414403767E-06});
	 * mapCode2XY.put("3-30888044", new double[] {3,30888044,6.4460692352036E-06});
	 * mapCode2XY.put("3-30888406", new double[] {3,30888406,4.66224948651766E-06});
	 * mapCode2XY.put("3-30888545", new double[] {3,30888545,4.97068268709449E-06});
	 * mapCode2XY.put("3-30888903", new double[] {3,30888903,7.50989009369689E-07});
	 * mapCode2XY.put("3-30888909", new double[] {3,30888909,8.69039629704335E-07});
	 * mapCode2XY.put("3-30888931", new double[] {3,30888931,9.27750823585936E-06});
	 * mapCode2XY.put("3-30889100", new double[] {3,30889100,7.56341994795964E-07});
	 * mapCode2XY.put("3-30889148", new double[] {3,30889148,9.73477624885019E-06});
	 * mapCode2XY.put("3-30892408", new double[] {3,30892408,4.04171605480326E-07});
	 * mapCode2XY.put("3-30893537", new double[] {3,30893537,4.27930708687679E-06});
	 * mapCode2XY.put("3-30895167", new double[] {3,30895167,4.71905687460677E-06});
	 * mapCode2XY.put("3-30895902", new double[] {3,30895902,6.01400199568726E-06});
	 * mapCode2XY.put("3-30896858", new double[] {3,30896858,9.18072055508662E-07});
	 * mapCode2XY.put("3-30897061", new double[] {3,30897061,2.35613434010187E-06});
	 * mapCode2XY.put("3-30900976", new double[] {3,30900976,4.38697232084565E-06});
	 * mapCode2XY.put("3-30901715", new double[] {3,30901715,4.17203438616528E-06});
	 * mapCode2XY.put("3-30902635", new double[] {3,30902635,7.9905014012955E-06});
	 * mapCode2XY.put("3-30903687", new double[] {3,30903687,2.69845716995655E-06});
	 * mapCode2XY.put("3-30903789", new double[] {3,30903789,7.31705693717787E-07});
	 * mapCode2XY.put("3-30904403", new double[] {3,30904403,7.92671448340387E-07});
	 * mapCode2XY.put("3-30905647", new double[] {3,30905647,4.63128095805042E-06});
	 * mapCode2XY.put("3-30906314", new double[] {3,30906314,2.44722371369953E-06});
	 * mapCode2XY.put("3-30907399", new double[] {3,30907399,4.34447471687181E-06});
	 * mapCode2XY.put("3-30907659", new double[] {3,30907659,4.93654139713252E-06});
	 * mapCode2XY.put("3-30907731", new double[] {3,30907731,2.6543777178856E-06});
	 * mapCode2XY.put("3-30908162", new double[] {3,30908162,5.92558653235111E-06});
	 * mapCode2XY.put("3-30909244", new double[] {3,30909244,4.2768568686393E-06});
	 * mapCode2XY.put("3-30910345", new double[] {3,30910345,7.16750297798684E-06});
	 * mapCode2XY.put("3-30911375", new double[] {3,30911375,1.70728150344895E-06});
	 * mapCode2XY.put("3-30912247", new double[] {3,30912247,0.000008507868456119});
	 * mapCode2XY.put("3-30916368", new double[] {3,30916368,1.03314463167711E-06});
	 * mapCode2XY.put("3-30917396", new double[] {3,30917396,3.65917685787482E-06});
	 * mapCode2XY.put("3-30918828", new double[] {3,30918828,6.75938369438989E-06});
	 * mapCode2XY.put("3-30946890", new double[] {3,30946890,4.90306675771563E-06});
	 * mapCode2XY.put("3-30947802", new double[] {3,30947802,7.85934804344529E-06});
	 * mapCode2XY.put("3-30950848", new double[] {3,30950848,8.33505291977743E-06});
	 * mapCode2XY.put("3-30951588", new double[] {3,30951588,8.04739247898738E-06});
	 * mapCode2XY.put("3-30989437", new double[] {3,30989437,7.85430902086803E-06});
	 * mapCode2XY.put("3-30998792", new double[] {3,30998792,2.82838712937854E-06});
	 * mapCode2XY.put("3-30998810", new double[] {3,30998810,4.14380066500708E-07});
	 * mapCode2XY.put("3-31002241", new double[] {3,31002241,9.79384054028875E-08});
	 * mapCode2XY.put("3-31003895", new double[] {3,31003895,7.52010475695217E-08});
	 * mapCode2XY.put("3-31006533", new double[] {3,31006533,1.23519469520729E-08});
	 * mapCode2XY.put("3-31060144", new double[] {3,31060144,7.36863645326753E-06});
	 * mapCode2XY.put("3-31082955", new double[] {3,31082955,4.50579536148372E-08});
	 * mapCode2XY.put("3-31113461", new double[] {3,31113461,6.54494439301824E-06});
	 * mapCode2XY.put("3-31114867", new double[] {3,31114867,6.20053965433153E-06});
	 * mapCode2XY.put("3-31117319", new double[] {3,31117319,3.12922178555489E-06});
	 * mapCode2XY.put("3-31118362", new double[] {3,31118362,5.02090568739708E-06});
	 * mapCode2XY.put("3-31118421", new double[] {3,31118421,3.60887713429316E-06});
	 * mapCode2XY.put("3-31119023", new double[] {3,31119023,9.95006889462231E-06});
	 * mapCode2XY.put("3-31132863", new double[] {3,31132863,1.2182681966699E-07});
	 * mapCode2XY.put("3-31133164", new double[] {3,31133164,2.75687996365717E-06});
	 * mapCode2XY.put("3-31136883", new double[] {3,31136883,5.64878555549471E-06});
	 * mapCode2XY.put("3-31138042", new double[] {3,31138042,5.92103908071918E-06});
	 * mapCode2XY.put("3-31138659", new double[] {3,31138659,7.57506060381153E-06});
	 * mapCode2XY.put("3-31141832", new double[] {3,31141832,7.15268193230427E-06});
	 * mapCode2XY.put("3-31143394", new double[] {3,31143394,5.33852772763661E-06});
	 * mapCode2XY.put("3-31144548", new double[] {3,31144548,4.6326056149981E-06});
	 * mapCode2XY.put("3-31145335", new double[] {3,31145335,7.63618664614282E-06});
	 * mapCode2XY.put("3-31145854", new double[] {3,31145854,6.3291874681876E-06});
	 * mapCode2XY.put("3-31148561", new double[] {3,31148561,1.05123724251179E-08});
	 * mapCode2XY.put("3-31153608", new double[] {3,31153608,7.01391034672719E-06});
	 * mapCode2XY.put("3-31154025", new double[] {3,31154025,5.04853375705846E-06});
	 * mapCode2XY.put("3-31154052", new double[] {3,31154052,1.51577492984934E-06});
	 * mapCode2XY.put("3-31154867", new double[] {3,31154867,4.6423690321951E-06});
	 * mapCode2XY.put("3-31154951", new double[] {3,31154951,4.15992217710431E-06});
	 * mapCode2XY.put("3-31157245", new double[] {3,31157245,6.97808166484609E-06});
	 * mapCode2XY.put("3-31165005", new double[] {3,31165005,8.96645736085042E-06});
	 * mapCode2XY.put("3-31165468", new double[] {3,31165468,6.44627391482516E-06});
	 * mapCode2XY.put("3-31170010", new double[] {3,31170010,3.49346277390018E-06});
	 * mapCode2XY.put("3-31170206", new double[] {3,31170206,6.84301306450755E-06});
	 * mapCode2XY.put("3-31187930", new double[] {3,31187930,8.24179138499862E-06});
	 * mapCode2XY.put("3-31190447", new double[] {3,31190447,5.87210300415652E-06});
	 * mapCode2XY.put("3-31190700", new double[] {3,31190700,5.86892292715752E-06});
	 * mapCode2XY.put("3-31195593", new double[] {3,31195593,3.57430629693664E-06});
	 * mapCode2XY.put("3-31196121", new double[] {3,31196121,1.60949047053683E-06});
	 * mapCode2XY.put("3-31196276", new double[] {3,31196276,1.00894134681365E-07});
	 * mapCode2XY.put("3-31196653", new double[] {3,31196653,1.48923566875687E-06});
	 * mapCode2XY.put("3-31196658", new double[] {3,31196658,8.58750566336561E-07});
	 * mapCode2XY.put("3-31197665", new double[] {3,31197665,6.96189358848426E-06});
	 * mapCode2XY.put("3-31197686", new double[] {3,31197686,1.98754531271018E-06});
	 * mapCode2XY.put("3-31198754", new double[] {3,31198754,1.10643839497396E-09});
	 * mapCode2XY.put("3-31198798", new double[] {3,31198798,6.87288745615968E-06});
	 * mapCode2XY.put("3-31200951", new double[] {3,31200951,4.97862132769829E-06});
	 * mapCode2XY.put("3-31201876", new double[] {3,31201876,2.25276309872019E-06});
	 * mapCode2XY.put("3-31205170", new double[] {3,31205170,4.62189584376911E-06});
	 * mapCode2XY.put("3-31208734", new double[] {3,31208734,6.66441297467663E-06});
	 * mapCode2XY.put("3-31211296", new double[] {3,31211296,1.5457210808971E-08});
	 * mapCode2XY.put("3-31211842", new double[] {3,31211842,4.40219695817231E-06});
	 * mapCode2XY.put("3-31216245", new double[] {3,31216245,9.06407764660166E-06});
	 * mapCode2XY.put("3-31217575", new double[] {3,31217575,4.00192835068962E-06});
	 * mapCode2XY.put("3-31218200", new double[] {3,31218200,8.78536344360946E-06});
	 * mapCode2XY.put("3-31224089", new double[] {3,31224089,8.87091262502241E-06});
	 * mapCode2XY.put("3-31232614", new double[] {3,31232614,7.86335946757779E-06});
	 * mapCode2XY.put("3-31247218", new double[] {3,31247218,6.78475757841839E-06});
	 * mapCode2XY.put("3-31249963", new double[] {3,31249963,2.34292561313126E-06});
	 * mapCode2XY.put("3-31249972", new double[] {3,31249972,2.82050711824013E-06});
	 * mapCode2XY.put("3-31256576", new double[] {3,31256576,8.31646752463299E-08});
	 * mapCode2XY.put("3-31260068", new double[] {3,31260068,7.54963793089094E-06});
	 * mapCode2XY.put("3-31260107", new double[] {3,31260107,8.01351710345577E-06});
	 * mapCode2XY.put("3-31260147", new double[] {3,31260147,1.17619459060238E-06});
	 * mapCode2XY.put("3-31260346", new double[] {3,31260346,4.36133956120471E-06});
	 * mapCode2XY.put("3-31260359", new double[] {3,31260359,8.7204484251767E-06});
	 * mapCode2XY.put("3-31260485", new double[] {3,31260485,1.66266491184968E-06});
	 * mapCode2XY.put("3-31262208", new double[] {3,31262208,1.52513244065691E-06});
	 * mapCode2XY.put("3-31262213", new double[] {3,31262213,4.54374612850406E-06});
	 * mapCode2XY.put("3-31262460", new double[] {3,31262460,6.08801135210979E-06});
	 * mapCode2XY.put("3-31262990", new double[] {3,31262990,8.22305610930532E-06});
	 * mapCode2XY.put("3-31263163", new double[] {3,31263163,8.5762293174978E-06});
	 * mapCode2XY.put("3-31263287", new double[] {3,31263287,3.45162011522541E-06});
	 * mapCode2XY.put("3-31263457", new double[] {3,31263457,1.08779848513965E-06});
	 * mapCode2XY.put("3-31263502", new double[] {3,31263502,2.74645517319703E-06});
	 * mapCode2XY.put("3-31263554", new double[] {3,31263554,9.15314305675517E-06});
	 * mapCode2XY.put("3-31263558", new double[] {3,31263558,3.03241141160254E-06});
	 * mapCode2XY.put("3-31263601", new double[] {3,31263601,4.95950283857144E-06});
	 * mapCode2XY.put("3-31263604", new double[] {3,31263604,7.0065739711606E-06});
	 * mapCode2XY.put("3-31263865", new double[] {3,31263865,5.76880736598741E-06});
	 * mapCode2XY.put("3-31263882", new double[] {3,31263882,4.08726817162475E-06});
	 * mapCode2XY.put("3-31263911", new double[] {3,31263911,5.23108198531801E-06});
	 * mapCode2XY.put("3-31265274", new double[] {3,31265274,6.09024586863761E-06});
	 * mapCode2XY.put("3-31265462", new double[] {3,31265462,2.0557407544806E-06});
	 * mapCode2XY.put("3-31265469", new double[] {3,31265469,3.83367859538254E-06});
	 * mapCode2XY.put("3-31267180", new double[] {3,31267180,1.82782165364778E-06});
	 * mapCode2XY.put("3-31270390", new double[] {3,31270390,6.31673254675017E-06});
	 * mapCode2XY.put("3-31270724", new double[] {3,31270724,2.01584911721888E-06});
	 * mapCode2XY.put("3-31270743", new double[] {3,31270743,2.70526801082949E-06});
	 * mapCode2XY.put("3-31271289", new double[] {3,31271289,8.84257620203848E-06});
	 * mapCode2XY.put("3-31271568", new double[] {3,31271568,7.16632954383839E-07});
	 * mapCode2XY.put("3-31271654", new double[] {3,31271654,8.16855559277012E-06});
	 * mapCode2XY.put("3-31271881", new double[] {3,31271881,2.44520546535261E-06});
	 * mapCode2XY.put("3-31272190", new double[] {3,31272190,2.56385384466075E-06});
	 * mapCode2XY.put("3-31272551", new double[] {3,31272551,4.02752393009734E-06});
	 * mapCode2XY.put("3-31272700", new double[] {3,31272700,8.35731524151103E-06});
	 * mapCode2XY.put("3-31272701", new double[] {3,31272701,7.32377483555311E-06});
	 * mapCode2XY.put("3-31272745", new double[] {3,31272745,5.65778506692849E-06});
	 * mapCode2XY.put("3-31278551", new double[] {3,31278551,0.000008950400502224});
	 * mapCode2XY.put("3-31279423", new double[] {3,31279423,1.71026644155386E-06});
	 * mapCode2XY.put("3-31279480", new double[] {3,31279480,8.44164257206331E-06});
	 * mapCode2XY.put("3-31279531", new double[] {3,31279531,2.83997433404576E-06});
	 * mapCode2XY.put("3-31280029", new double[] {3,31280029,3.91492532655015E-07});
	 * mapCode2XY.put("3-31281109", new double[] {3,31281109,7.53013797970203E-06});
	 * mapCode2XY.put("3-31281363", new double[] {3,31281363,6.34014844256025E-06});
	 * mapCode2XY.put("3-31281382", new double[] {3,31281382,5.91873915833163E-06});
	 * mapCode2XY.put("3-31281692", new double[] {3,31281692,1.53071270134939E-06});
	 * mapCode2XY.put("3-31281694", new double[] {3,31281694,8.48814364406087E-07});
	 * mapCode2XY.put("3-31281732", new double[] {3,31281732,4.11530345640933E-06});
	 * mapCode2XY.put("3-31282979", new double[] {3,31282979,9.24216494867921E-06});
	 * mapCode2XY.put("3-31285008", new double[] {3,31285008,7.11108037339902E-06});
	 * mapCode2XY.put("3-31285071", new double[] {3,31285071,4.72255382977357E-06});
	 * mapCode2XY.put("3-31285112", new double[] {3,31285112,1.11045004343486E-06});
	 * mapCode2XY.put("3-31286421", new double[] {3,31286421,9.05685220274098E-06});
	 * mapCode2XY.put("3-31287306", new double[] {3,31287306,7.85230949612526E-06});
	 * mapCode2XY.put("3-31287954", new double[] {3,31287954,4.96900788117995E-06});
	 * mapCode2XY.put("3-31290410", new double[] {3,31290410,9.12678557785714E-06});
	 * mapCode2XY.put("3-31293610", new double[] {3,31293610,3.7579810026794E-06});
	 * mapCode2XY.put("3-31294520", new double[] {3,31294520,9.19783697026151E-06});
	 * mapCode2XY.put("3-31294542", new double[] {3,31294542,5.08944514398872E-06});
	 * mapCode2XY.put("3-31295898", new double[] {3,31295898,6.4650200984918E-06});
	 * mapCode2XY.put("3-31295928", new double[] {3,31295928,6.29271129598277E-06});
	 * mapCode2XY.put("3-31296372", new double[] {3,31296372,7.7675897407711E-06});
	 * mapCode2XY.put("3-31296974", new double[] {3,31296974,5.88388168095735E-06});
	 * mapCode2XY.put("3-31307891", new double[] {3,31307891,7.80489687354259E-06});
	 * mapCode2XY.put("3-31307970", new double[] {3,31307970,5.50729814060698E-06});
	 * mapCode2XY.put("3-31308441", new double[] {3,31308441,1.0860713153807E-06});
	 * mapCode2XY.put("3-31308554", new double[] {3,31308554,7.68423821882561E-06});
	 * mapCode2XY.put("3-31310340", new double[] {3,31310340,3.39293056482823E-06});
	 * mapCode2XY.put("3-31311098", new double[] {3,31311098,7.34772388386347E-06});
	 * mapCode2XY.put("3-31311292", new double[] {3,31311292,8.82907282897377E-06});
	 * mapCode2XY.put("3-31311296", new double[] {3,31311296,6.56032175725974E-06});
	 * mapCode2XY.put("4-3952657", new double[] {4,3952657,1.43341596552968E-06});
	 * mapCode2XY.put("4-7533897", new double[] {4,7533897,9.13733796046397E-07});
	 * mapCode2XY.put("4-7533900", new double[] {4,7533900,9.46991517583382E-06});
	 * mapCode2XY.put("4-7534430", new double[] {4,7534430,5.38232491462226E-06});
	 * mapCode2XY.put("4-7536462", new double[] {4,7536462,5.03364391420095E-07});
	 * mapCode2XY.put("4-7536511", new double[] {4,7536511,6.14017085453484E-06});
	 * mapCode2XY.put("4-7537750", new double[] {4,7537750,9.59559045577216E-06});
	 * mapCode2XY.put("5-23950107", new double[] {5,23950107,7.29162062634036E-06});
	 * mapCode2XY.put("5-29149584", new double[] {5,29149584,6.27754322865521E-06});
	 * mapCode2XY.put("6-2923874", new double[] {6,2923874,7.87775461908106E-06});
	 * mapCode2XY.put("6-2927622", new double[] {6,2927622,9.70105124966754E-06});
	 * mapCode2XY.put("6-2928178", new double[] {6,2928178,3.90765766546695E-06});
	 * mapCode2XY.put("6-2964616", new double[] {6,2964616,1.9646743746753E-06});
	 * mapCode2XY.put("6-2966119", new double[] {6,2966119,3.87641925819286E-06});
	 * mapCode2XY.put("6-3032599", new double[] {6,3032599,5.46391989178785E-06});
	 * mapCode2XY.put("6-4247965", new double[] {6,4247965,9.08931912166301E-06});
	 * mapCode2XY.put("6-4257088", new double[] {6,4257088,4.36998242722387E-06});
	 * mapCode2XY.put("6-4271152", new double[] {6,4271152,9.48155476703437E-06});
	 * mapCode2XY.put("6-4304979", new double[] {6,4304979,5.79321948134303E-06});
	 * mapCode2XY.put("6-9012862", new double[] {6,9012862,6.57948302494865E-06});
	 * mapCode2XY.put("6-9092000", new double[] {6,9092000,7.51231484665774E-06});
	 * mapCode2XY.put("6-9250710", new double[] {6,9250710,9.65377106626405E-06});
	 * mapCode2XY.put("6-9371896", new double[] {6,9371896,4.11295474933241E-07});
	 * mapCode2XY.put("6-9371897", new double[] {6,9371897,4.3235650103615E-07});
	 * mapCode2XY.put("6-9392677", new double[] {6,9392677,2.43561201719974E-08});
	 * mapCode2XY.put("6-11848448", new double[] {6,11848448,4.63870616579903E-07});
	 * mapCode2XY.put("7-312406", new double[] {7,312406,2.1953396582624E-06});
	 * mapCode2XY.put("7-312435", new double[] {7,312435,5.37540299090455E-06});
	 * mapCode2XY.put("7-312549", new double[] {7,312549,6.90785820408007E-06});
	 * mapCode2XY.put("7-312553", new double[] {7,312553,8.14151557541942E-06});
	 * mapCode2XY.put("7-14763186", new double[] {7,14763186,5.04490091312281E-06});
	 * mapCode2XY.put("7-15146924", new double[] {7,15146924,9.95679846778689E-06});
	 * mapCode2XY.put("7-29493663", new double[] {7,29493663,4.21679934610545E-06});
	 * mapCode2XY.put("7-29565269", new double[] {7,29565269,8.45746526391482E-06});
	 * mapCode2XY.put("7-29588038", new double[] {7,29588038,5.68505799059004E-06});
	 * mapCode2XY.put("7-29609371", new double[] {7,29609371,1.99145823091586E-06});
	 * mapCode2XY.put("7-29638596", new double[] {7,29638596,6.48205125479522E-06});
	 * mapCode2XY.put("7-29649046", new double[] {7,29649046,5.52507053220376E-06});
	 * mapCode2XY.put("7-29652496", new double[] {7,29652496,8.65440561053615E-06});
	 * mapCode2XY.put("7-29653678", new double[] {7,29653678,5.04375171449118E-06});
	 * mapCode2XY.put("7-29663629", new double[] {7,29663629,8.98291894737133E-06});
	 * mapCode2XY.put("7-29670032", new double[] {7,29670032,8.58249027455449E-06});
	 * mapCode2XY.put("7-29671796", new double[] {7,29671796,5.21141099123036E-06});
	 * mapCode2XY.put("8-1871881", new double[] {8,1871881,6.82221345849247E-06});
	 * mapCode2XY.put("8-16350110", new double[] {8,16350110,3.49328381066832E-06});
	 * mapCode2XY.put("8-16392770", new double[] {8,16392770,8.21984411378293E-06});
	 * mapCode2XY.put("8-16394260", new double[] {8,16394260,2.02661405901414E-06});
	 * mapCode2XY.put("8-16477093", new double[] {8,16477093,1.21648559355948E-06});
	 * mapCode2XY.put("9-5636912", new double[] {9,5636912,1.45665142117264E-06});
	 * mapCode2XY.put("9-16360979", new double[] {9,16360979,4.22462531919848E-06});
	 * mapCode2XY.put("9-16368694", new double[] {9,16368694,5.12980048030241E-06});
	 * mapCode2XY.put("9-16528347", new double[] {9,16528347,9.90824272900379E-06});
	 * mapCode2XY.put("11-11125320", new double[]
	 * {11,11125320,6.47613528055073E-08}); mapCode2XY.put("11-16450462", new
	 * double[] {11,16450462,8.18428386189126E-06}); mapCode2XY.put("12-21285228",
	 * new double[] {12,21285228,9.40449426609857E-06});
	 * mapCode2XY.put("12-22050691", new double[]
	 * {12,22050691,1.34261508686899E-06}); mapCode2XY.put("12-22052429", new
	 * double[] {12,22052429,1.43729463120199E-06}); mapCode2XY.put("12-22052550",
	 * new double[] {12,22052550,6.78748288279971E-06});
	 * mapCode2XY.put("12-22052618", new double[]
	 * {12,22052618,1.82633947413866E-06}); mapCode2XY.put("12-22063477", new
	 * double[] {12,22063477,6.69853105326485E-06}); mapCode2XY.put("12-22063658",
	 * new double[] {12,22063658,7.94315479279979E-06});
	 * mapCode2XY.put("12-22064020", new double[]
	 * {12,22064020,8.37180643174866E-06}); mapCode2XY.put("12-22069253", new
	 * double[] {12,22069253,5.99910167854333E-06}); mapCode2XY.put("12-22072260",
	 * new double[] {12,22072260,9.27940388071265E-06});
	 * 
	 * return mapCode2XY;
	 * 
	 * }
	 */
	public static String getSubpopulationColorV1(String subpop) {

		if (mapSub2Color == null) {
			mapSub2Color = new HashMap();

			mapSub2Color.put("none".toUpperCase(), "black");
			mapSub2Color.put("admx".toUpperCase(), "#006666");
			mapSub2Color.put("aus".toUpperCase(), "#CC7A52");
			mapSub2Color.put("trop/temp".toUpperCase(), "#FF33CC");
			mapSub2Color.put("inax".toUpperCase(), "#00CC99");
			mapSub2Color.put("temp".toUpperCase(), "#0066FF");
			mapSub2Color.put("aro".toUpperCase(), "#AD8533");
			mapSub2Color.put("trop".toUpperCase(), "#FF3300");
			mapSub2Color.put("japx".toUpperCase(), "#FFCC00");
			mapSub2Color.put("ind1".toUpperCase(), "#009900");
			mapSub2Color.put("ind3".toUpperCase(), "#99CC00");
			mapSub2Color.put("ind2".toUpperCase(), "#718C64");
			mapSub2Color.put("indx".toUpperCase(), "#A3FFA3");
			mapSub2Color.put("temp/trop".toUpperCase(), "#6600CC");
		}

		return mapSub2Color.get(subpop.trim().toUpperCase());
	}

	public static String getKgroupColor(int group) {
		String[] c = new String[] { "brown", "violet", "blue", "green", "yellow", "orange", "red", "#FF0000", "#FF4D00",
				"#FF9900", "#FFE500", "#CCFF00", "#80FF00", "#33FF00", "#00FF19" };
		return c[group - 1];

	}

	public static String getSubpopulationColor(String subpop) {

		if (mapSub2Color == null) {
			mapSub2Color = new HashMap();
			mapSub2Color.put("all".toUpperCase(), "black");
			mapSub2Color.put("none".toUpperCase(), "lightgray");
			/*
			mapSub2Color.put("ind1A".toUpperCase(), "#60e0c0");
			mapSub2Color.put("ind1B".toUpperCase(), "aquamarine");
			mapSub2Color.put("ind2".toUpperCase(), "#336622");
			mapSub2Color.put("ind3".toUpperCase(), "#339910");
			mapSub2Color.put("trop1".toUpperCase(), "steelblue");
			mapSub2Color.put("trop".toUpperCase(), "steelblue");
			mapSub2Color.put("trop2".toUpperCase(), "#2045c0");
			mapSub2Color.put("subtrop".toUpperCase(), "#2045c0");
			mapSub2Color.put("aro".toUpperCase(), "purple");
			mapSub2Color.put("temp".toUpperCase(), "lightskyblue");
			mapSub2Color.put("aus".toUpperCase(), "orange");
			mapSub2Color.put("admix".toUpperCase(), "gray");
			mapSub2Color.put("japx".toUpperCase(), "#acacfc");
			mapSub2Color.put("indx".toUpperCase(), "#9cbb9c");
			*/

			mapSub2Color.put("bldt".toUpperCase(),"magenta");
			mapSub2Color.put("basal cannabis".toUpperCase(),"#00ff01");
			mapSub2Color.put("drug".toUpperCase(),"red");
			mapSub2Color.put("drug type feral".toUpperCase(),"orange");
			mapSub2Color.put("drug-type".toUpperCase(),"red");
			mapSub2Color.put("hemp".toUpperCase(),"cyan");
			mapSub2Color.put("hemp-type".toUpperCase(),"blue");
			mapSub2Color.put("na".toUpperCase(),"white");
			mapSub2Color.put("nldt".toUpperCase(),"pink");
			mapSub2Color.put("type i".toUpperCase(),"darkred");
			mapSub2Color.put("type ii".toUpperCase(),"darkgreen");
			mapSub2Color.put("type iii".toUpperCase(),"darkblue");
			mapSub2Color.put("csativa".toUpperCase(),"gray");
					

			/*
			 * admixed #BEBEBE admixed-indica #AADDAA admixed-japonica #9BC0EB aromatic
			 * #A020F0 aus #EE9A00 indica #006400 temperate-japonica #499BD1
			 * tropical-japonica #3359D6
			 * 
			 * mapSub2Color.put("admixed".toUpperCase() , "gray");
			 * mapSub2Color.put("admixed-indica".toUpperCase() , "#9cbb9c");
			 * mapSub2Color.put("admixed-japonica".toUpperCase() , "#acacfc");
			 * mapSub2Color.put("aromatic".toUpperCase() , "purple");
			 * mapSub2Color.put("indica".toUpperCase() , "#60e0c0");
			 * mapSub2Color.put("temperate-japonica".toUpperCase() , "lightskyblue");
			 * mapSub2Color.put("tropical-japonica".toUpperCase() , "steelblue");
			 */
			mapSub2Color.put("admixed".toUpperCase(), "#BEBEBE");
			mapSub2Color.put("admixed-indica".toUpperCase(), "#AADDAA");
			mapSub2Color.put("admixed-japonica".toUpperCase(), "#9BC0EB");
			mapSub2Color.put("aromatic".toUpperCase(), "#A020F0");
			mapSub2Color.put("indica".toUpperCase(), "#006400");
			mapSub2Color.put("temperate-japonica".toUpperCase(), "#499BD1");
			mapSub2Color.put("tropical-japonica".toUpperCase(), "#3359D6");
		}
		if(mapSub2Color.containsKey(subpop.trim().toUpperCase()))
				return mapSub2Color.get(subpop.trim().toUpperCase());
		return "gray";
	}

	public static String getGeneralSubpopulation(String subpop) {

		if (mapSub2General == null) {
			mapSub2General = new HashMap();
			mapSub2General.put("ind1A".toUpperCase(), "all indica");
			mapSub2General.put("ind1B".toUpperCase(), "all indica");
			mapSub2General.put("ind2".toUpperCase(), "all indica");
			mapSub2General.put("ind3".toUpperCase(), "all indica");
			mapSub2General.put("trop1".toUpperCase(), "all japonica");
			mapSub2General.put("trop2".toUpperCase(), "all japonica");

			mapSub2General.put("trop".toUpperCase(), "all japonica");
			mapSub2General.put("subtrop".toUpperCase(), "all japonica");

			// mapSub2General.put("aro".toUpperCase() , "aro");
			mapSub2General.put("temp".toUpperCase(), "all japonica");
			mapSub2General.put("aus".toUpperCase(), "aus");
			// mapSub2General.put("admix".toUpperCase() , "admix");
			mapSub2General.put("japx".toUpperCase(), "all japonica");
			mapSub2General.put("indx".toUpperCase(), "all indica");

		}
		return mapSub2General.get(subpop.trim().toUpperCase());
	}

	public static Map get3kCoreMDSXY() {
		Map mapCode2XY = new HashMap();
		mapCode2XY = getXY1(mapCode2XY);
		mapCode2XY = getXY2(mapCode2XY);
		return mapCode2XY;
	}

	public static Map getHDRAMDSXY() {
		Map mapVaridMdsXY = new HashMap();

		mapVaridMdsXY.put(BigDecimal.valueOf(4436),
				new double[] { -0.0958256134398567, 0.0117673823673849, 0.0455789340937431, 0.00614040644974933 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4330),
				new double[] { -0.113925363600633, 0.00231474503634905, -0.0324794232318516, 0.0237764009118454 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3789),
				new double[] { 0.118432270970798, 0.0477252613998448, -0.0111765751272708, -0.00157994843109519 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3605),
				new double[] { -0.0921278938998133, 0.00208967622009928, 0.0356578596306418, -0.0250460999659368 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3507),
				new double[] { -0.0073544870676108, 0.0384220061129341, -0.0241810649414421, 0.0184402749259 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4451),
				new double[] { 0.0750127215447365, -0.0748213064781361, 0.0203361535135937, 0.0327292400415833 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3657),
				new double[] { 0.111448695673033, 0.0260698534280175, -0.00760415877789735, -0.00257737536129902 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3420),
				new double[] { -0.099734742467596, 0.00143518949120403, -0.041235820164243, 0.0261250302485516 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3137),
				new double[] { -0.0848297849690221, 0.0127076021859997, 0.0429326213481039, -0.0113163545187131 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3162),
				new double[] { 0.133722201624028, 0.00227175617159754, -0.00343608860736417, -0.0167645804513898 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3728),
				new double[] { -0.0955467021595876, 0.00709910452612362, 0.0352817603017075, -0.00563694743388054 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3040),
				new double[] { -0.0589822819061154, -0.0215636109238615, 0.000986488980002962, -0.000934129539973416 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3856),
				new double[] { -0.0936096600828828, 0.00954633095572121, 0.0380639945903342, -0.000819726887718996 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4217),
				new double[] { 0.123398183523374, 0.0459655261198942, -0.00514259002274394, 0.00908986377878 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3778),
				new double[] { 0.108681439492668, 0.0429587132174463, 0.0067916863151164, 0.0174555999615138 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3467),
				new double[] { -0.0805125661567098, 0.00831352738391645, 0.0394191390737493, -0.00332630626420807 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3681),
				new double[] { 0.114860365748933, -0.000809701963696757, 0.00265655019022609, 0.00946545352913387 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3123),
				new double[] { 0.106012601245783, -0.110387297407618, -0.00828349640221201, -0.0129500493952402 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4590),
				new double[] { 0.0935923855039364, -0.101479350125648, 0.0156488731798467, 0.0198548495109439 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3151),
				new double[] { 0.122508523552124, 0.0407708644808513, -0.0101474384558905, -0.0192768141232252 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4116),
				new double[] { 0.104166166294899, -0.0142017653097156, 0.0103848066878063, 0.0114663677167442 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3381),
				new double[] { -0.13586691898001, -0.00305493026490317, -0.0921356993069503, -0.0531820871329334 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3091),
				new double[] { 0.0581973812667283, -0.0995553220189082, -0.00603106924835665, -0.0150155694489151 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3240),
				new double[] { 0.12731302844777, 0.0387145492102501, 0.00268127877685828, 0.0231445892952551 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3474),
				new double[] { -0.0726026804578078, -0.00592317278614394, 0.0258972539423308, 0.00759004207915272 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4389),
				new double[] { -0.0791110406606195, 0.0111100180278868, 0.0369355485925447, 0.00822680765733396 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3719),
				new double[] { -0.0935228082598258, 0.00764367505569159, 0.043231648548536, -0.00284577132907405 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4374),
				new double[] { -0.0863386750290025, 0.00161145037417174, 0.0369807271922319, -0.0336582600801276 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3781),
				new double[] { 0.118415510890445, 0.0462424909466452, -0.000197364134537078, 0.0200887500381204 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3513),
				new double[] { -0.0921556419666763, -0.000551590958908064, 0.0330039595756534, -0.0418717215655599 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4480),
				new double[] { -0.121748813669617, 0.0020921295120778, -0.0429493560102661, -0.0349783257371015 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4310),
				new double[] { -0.106241797258923, -3.56707874096935E-05, -0.0381672020576741, 0.0404579113277846 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4135),
				new double[] { -0.0694278049810386, 0.0191736259854209, -0.0424872779614132, 0.0416274908873258 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4464),
				new double[] { -0.106469238801593, 0.00895501530836734, -0.0449983904814, 0.0316420751386017 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4559),
				new double[] { -0.0993242161653063, 0.00481795897729905, 0.00206845999554078, 0.0186656003306927 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3029),
				new double[] { -0.0864261768617804, -0.02045961266292, -0.027455414262179, 0.0131967112944248 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3626),
				new double[] { -0.113467632695759, 0.0021664548386302, -0.0303471971941945, 0.0314984337119244 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3205),
				new double[] { 0.120596819881342, 0.031513222715968, -0.00192174137875279, 0.00219118612934759 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4172),
				new double[] { 0.0881118649796039, -0.115323418729371, 0.00938641912130926, 0.00729434879781409 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3698),
				new double[] { -0.0763543135564074, 0.0111055099606188, 0.0405258459480152, -0.00591079358169384 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3936),
				new double[] { 0.0892192266839932, -0.119549517658937, 0.0025106416404014, 0.015867999611329 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3428),
				new double[] { -0.109489025321238, 0.00616883360215014, 0.0397872775721945, -0.0347715411415084 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4000),
				new double[] { 0.0412330300176844, 0.0478211182236917, 0.0144641034939422, 0.00693470722064872 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4563),
				new double[] { -0.0934652831741116, 0.00398702520974414, 0.00533643412329463, 0.00944422232202693 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3703),
				new double[] { -0.0811980307939457, 0.00617142548648997, 0.0452797361441703, 0.0023330304588902 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3656),
				new double[] { -0.0964418351626893, 0.00217129801084771, 0.0484883690232711, -0.0100015392161898 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3659),
				new double[] { 0.121945905339787, 0.0391342772479355, -0.00812301502950113, 0.00163680340733551 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4128),
				new double[] { 0.103019066019723, -0.0665067584486072, 0.00667044477307474, 0.0224911053965122 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3487),
				new double[] { -0.090406330628459, 0.000255255266061401, -0.00442760655931433, 0.0112080470783929 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4583),
				new double[] { -0.0950391748340672, 0.00726947487923013, 0.0102927860906764, 0.0172943895664962 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4020),
				new double[] { 0.129719613649169, 0.0491000587483526, -0.018898354156968, -0.0366832630754104 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3709),
				new double[] { -0.105192123655134, -0.0024289687239257, 0.0536216901246864, -0.047107346084966 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4133),
				new double[] { -0.110185878019852, 0.00965693130065083, 0.0101520576580032, 0.0191063018310771 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3245),
				new double[] { -0.0967418739684885, 0.0132251460022513, 0.0438029599635268, 0.0055948665771334 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4253),
				new double[] { 0.111742761736665, 0.0527003012471336, 0.00553483819058369, 0.0220302541375216 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4101),
				new double[] { -0.00343406134608629, 0.0058082775243205, 0.0240151903989874, 0.0178764413640722 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3330),
				new double[] { -0.108229913921348, 0.00536265947708657, -0.0284595121460926, 0.0242414919392762 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4510),
				new double[] { 0.102925234569247, -0.132532600222832, -0.0136876879632761, -0.0519760342697737 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3427),
				new double[] { -0.00169467795733253, 0.0224489398146705, -0.0276476797409348, -0.0374937517561695 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4445),
				new double[] { -0.0746381446932907, 0.0249841706802473, 0.0409770275460541, -0.000266946121815286 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3084),
				new double[] { 0.10496540354463, -0.136090000617295, -0.00191285116314742, -0.0260949780802724 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3263),
				new double[] { 0.117452383587247, 0.0409119201579064, -0.000765207096816138, 0.00464488428532167 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4513),
				new double[] { 0.0859526695338711, -0.118719989718116, 0.00938229769185998, 0.0305717676729965 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4465),
				new double[] { 0.100454649578009, 0.0441359656792032, -0.0364219145117764, -0.0771869083824481 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3530),
				new double[] { -0.10639881583075, 0.00475626450696951, 0.0225653937665607, -0.000444513129560966 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3224),
				new double[] { 0.118543223480285, 0.0480179245739915, 0.00367142529133541, 0.0158998147576359 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3668),
				new double[] { 0.0989480622665231, 0.0465607182675191, -0.00272785251632792, 0.0128657318146686 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3953),
				new double[] { 0.125196397899945, 0.0392248248014709, 0.00356649627890715, 0.0131967711826149 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3082),
				new double[] { 0.106575841995877, -0.138686017181207, 0.00205464111655785, -0.0229701561952895 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3375),
				new double[] { -0.126331277176797, -8.76907967903654E-05, -0.0727576990177952, -0.00867152219376449 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3855),
				new double[] { -0.0793075678710085, 0.00291922372871689, 0.0453894082186004, 0.00405455263378413 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4033),
				new double[] { -0.103793993720533, 0.00508612115842536, 0.0511185036160003, -0.0196025074434855 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3578),
				new double[] { -0.016788004395101, 0.0227481867813945, -0.0268214165368793, -0.0414357959099054 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3757),
				new double[] { 0.102008377124763, 0.0488640682047924, 0.00821962721181538, 0.023702059799058 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4361),
				new double[] { -0.115666539083104, -0.000643833609234779, -0.0453516029150883, 0.021900547455229 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3535),
				new double[] { -0.102099571357872, 0.0027836429500599, 0.0472699135520932, -0.0490227527344761 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3805),
				new double[] { -0.0991098634044226, 0.0019042523558692, -0.0079849023993886, -0.0038382097264067 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3250),
				new double[] { 0.116027627654116, 0.050931120713408, -0.00106227774470126, 0.0136324501565361 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4571),
				new double[] { -0.11170094750275, 0.00274932259783979, -0.0443251414625081, 0.024598337181995 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4114),
				new double[] { -0.10024214011491, 0.00386862522659808, 0.0201253956681143, 0.0146302660156281 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3610),
				new double[] { -0.0979235018230046, 0.0030097818988371, -0.00130008345956171, -0.0148788918148759 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3322),
				new double[] { -0.0809395522643857, 0.00955945919850013, 0.0232320345042701, -0.0129609635771744 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4325),
				new double[] { -0.117924592383299, 0.00206823058546256, -0.0529562889833336, 0.0282972290665477 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4237),
				new double[] { 0.115805998164429, 0.0484351358685173, 0.00581823570695406, 0.0256141361690503 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3560),
				new double[] { -0.0912014437228695, 0.00693570693616593, 0.0328500404777855, -0.00989720141267591 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3700),
				new double[] { -0.099937419928913, 0.00850459115407544, 0.0396664647461554, 0.00421502608030966 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4188),
				new double[] { 0.0337577056021341, -0.0998291072578802, 0.0111467396467661, 0.0284760982061542 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4553),
				new double[] { -0.0391321368333901, -0.0369906350795353, 0.0121413621798934, 0.0124022120673464 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3622),
				new double[] { -0.110958326408986, 0.000461995482942196, -0.0488774942502933, 0.0217908646719198 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4428),
				new double[] { -0.0937652708299642, 0.00384161107788352, 0.0472902496801622, 0.00432981075599885 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3754),
				new double[] { 0.109514812174017, 0.0453926582745049, 0.00264807563346547, 0.0159370124221338 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3830),
				new double[] { -0.104437166328189, 0.00243269883421805, 0.0491205740307589, -0.027932769383718 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3648),
				new double[] { 0.103347776636019, -0.0111787778119737, -0.00562144382221114, -0.0387391892933873 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4272),
				new double[] { 0.0626947940051525, 0.0415971339144668, -0.0171648673460603, 0.0155561730072237 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3847),
				new double[] { -0.0892955137826816, 0.00877173054354783, 0.0417364189170597, 0.0013757702612601 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3236),
				new double[] { 0.125721321781274, 0.0463869923650518, -0.00102539517724258, -0.00970057058990548 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3036),
				new double[] { -0.0375727758255344, -0.0364244656800485, -0.000122898311588168, -0.0158231824641126 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3978),
				new double[] { 0.102747330971709, -0.0795986893192201, 0.00998915699171588, 0.0387221213084896 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3430),
				new double[] { -0.126468172915074, -0.00585790024365334, -0.0514904846458171, -0.0580720609515077 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4054),
				new double[] { 0.0964360663654052, -0.131175805720714, -0.00245462163532628, -0.01856555931906 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3710),
				new double[] { -0.0978618068548161, 0.00720726120855743, 0.0411595130095106, -0.00586769386089977 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3043),
				new double[] { -0.0741353281818221, -0.0315388659777923, -0.0152334273628989, 0.0120312514762155 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3323),
				new double[] { -0.0906522218487857, 0.00505553755141835, 0.0342074598977457, -0.0200419778135496 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3027),
				new double[] { -0.0429740915845433, -0.0432204515404279, -0.0040332836986018, 0.00793490117842553 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3138),
				new double[] { 0.0969027635549154, 0.0390077695049862, -0.00858462007117984, -0.0301062841180631 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4295),
				new double[] { -0.101966366263258, -0.00370525033897381, -0.0330029921289826, 0.0310635336326579 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4077),
				new double[] { 0.123670730075426, 0.0499869812017772, 0.00106740878423903, 0.00979433265005085 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4322),
				new double[] { -0.113686292967531, 0.00162954733003523, -0.043699751418567, 0.0363021740361746 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4032),
				new double[] { 0.119331579439736, 0.0128876415321287, 0.000464618269704758, 0.00868599259115924 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3144),
				new double[] { 0.128778761798091, 0.0414445274260683, -0.0143291303121026, -0.0155317370284261 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3780),
				new double[] { 0.117546436333718, 0.0469982825414392, -0.000537951036726204, 0.0160913453267732 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3077),
				new double[] { 0.130844171225326, 0.0461275200752019, -0.00184855455999319, -0.00398393209259687 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3653),
				new double[] { 0.118754302874034, 0.0438677557711863, -0.00635832342001345, -0.0258399066526856 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4468),
				new double[] { 0.00180407000028547, -0.037014919724212, 0.020020065585082, -0.0324480533883706 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4502),
				new double[] { 0.119558287389654, 0.052374291016461, 0.00427999056806522, 0.0227772311806908 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4546),
				new double[] { 0.00773995354818447, 0.0338083984494265, 0.0339964342536064, 0.0153287929379864 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3353),
				new double[] { -0.110708537575322, 0.0026650734579059, -0.0438195332887391, 0.0291038880038811 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4193),
				new double[] { 0.0748599927305663, -0.0750609768521939, 0.0196814649785469, 0.0262927779491517 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4186),
				new double[] { 0.0956074994982721, -0.110565973931876, 0.015218101932172, 0.0369626294654411 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4063),
				new double[] { -0.113842715943295, -0.00096684014153651, -0.046122571997443, 0.0218508320496406 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4346),
				new double[] { -0.112429536817124, 0.00309105627590889, -0.041104026051159, 0.0369071551003252 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3884),
				new double[] { -0.073402754117927, 0.0126907413585746, 0.0336972110506072, -0.00136907509909669 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4482),
				new double[] { -0.111126502178638, -0.000447711236056832, -0.0462006708213925, 0.0169363203565043 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3889),
				new double[] { 0.0988504545451671, 0.0101392485486512, 0.00519390280281644, 0.0141380279604345 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4228),
				new double[] { 0.111496892376522, 0.0510214204097043, -0.00204295899626666, 0.022661735564162 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4501),
				new double[] { -0.117004101217799, 0.00575974802438412, -0.0488219424974817, 0.0356042881385988 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3722),
				new double[] { -0.0730541588537735, 0.0131723225814656, 0.0456137716637147, -0.0150429738166473 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3235),
				new double[] { -0.103587877676541, 0.0014560892148394, -0.0153636022104801, 0.0190586909475304 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3333),
				new double[] { -0.115611046373942, 0.00377113722679526, -0.0142915306554597, 0.00869597034510614 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3812),
				new double[] { -0.100735024728402, 0.0105345513800224, 0.0450563156271858, 0.00346569322211824 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3596),
				new double[] { -0.110854737938235, -0.00282585762418655, -0.0485488837139507, 0.0150340966406639 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4022),
				new double[] { 0.120722099873442, 0.0291262084781171, -0.0083310172899741, -0.0227508457334411 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4221),
				new double[] { 0.126378512993893, 0.0302253942961292, 0.00384063193628288, 0.0286475729311137 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3649),
				new double[] { 0.0846316052030951, -0.0186646935697305, -0.00406025783810237, -0.0321969543919046 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3736),
				new double[] { -0.102463324679301, 0.00526462074018531, 0.0469819109448737, -0.0146251335455201 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4360),
				new double[] { -0.119332160465214, 0.00123135775349529, -0.0432939442509241, 0.0362816537484057 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3885),
				new double[] { 0.117999954811785, 0.0499167600984877, 0.00692975786190554, 0.0227702849486947 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4388),
				new double[] { -0.100212019364493, 0.0111748905228239, 0.0381697747528451, 0.0156664468087742 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4403),
				new double[] { -0.0737266958905416, 0.013206528349675, 0.0422312414683411, 0.00834552378612731 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4471),
				new double[] { 0.0032997075996786, 0.0297484693053439, 0.0134894963049909, -0.0378720950574308 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4251),
				new double[] { 0.122131332748644, 0.0532378454019444, -0.00507841794174969, 0.00795734386127909 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3116),
				new double[] { 0.0817954255680506, -0.111292953303455, -0.00646776537546173, -0.00326347050143845 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3283),
				new double[] { 0.115937642069507, 0.0185478004185308, -0.00763532022892856, -0.0109798288379506 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4328),
				new double[] { -0.118944842985897, 0.00532069132820115, -0.0458465232354703, 0.0356193203842477 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4257),
				new double[] { 0.120560252191391, 0.0514207851396907, 0.00498875634654932, 0.021345042327015 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3400),
				new double[] { -0.104438203987888, 0.00558955144187064, -0.0239638695439283, 0.015817473307398 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3295),
				new double[] { 0.118668050778232, 0.0416587863617501, 0.00209916848516323, 0.0149658653175487 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4059),
				new double[] { -0.0857656059887121, -0.016023153218556, -0.0267586207748262, 0.0188685470460589 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3693),
				new double[] { 0.117592098207564, 0.0366398531184091, -0.00974554448611887, -0.034506382588925 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3273),
				new double[] { 0.128989801631734, 0.037000134303072, -0.0159518768664027, -0.0456384818167322 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4011),
				new double[] { 0.132141944938041, 0.0361460721050714, -0.0109741293596722, -0.0129618571042376 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4342),
				new double[] { -0.117444600814879, 0.00355316090016005, -0.0477968819220531, 0.0372149224582691 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3810),
				new double[] { -0.114939839637486, 0.00262196533224335, -0.0356585030212481, 0.0206497860469503 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3101),
				new double[] { 0.0881438345667465, -0.111602798091043, 0.00303411507979222, 0.0116486599699396 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4115),
				new double[] { -0.0911729329683882, 0.0131175128170367, 0.0124082049199504, 0.0218092165505276 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4184),
				new double[] { 0.0704769095071989, -0.106295023181247, 0.00608559763561034, 0.0044322058775277 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4499),
				new double[] { -0.113792937886168, 0.00612693365490837, -0.034353368482224, 0.0306005591611155 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3097),
				new double[] { 0.0943604088912499, -0.106284627017921, 0.014932733025296, 0.0145611704745559 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3362),
				new double[] { -0.111591545691112, 0.00237576288025864, -0.046008013088032, 0.0211632683621164 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4516),
				new double[] { 0.0809085743595778, -0.083531880389174, 0.00213428711748233, 0.00485727274148197 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4365),
				new double[] { -0.118149511425128, 0.00377492198109868, -0.0393215578395682, 0.0264700443907041 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3466),
				new double[] { -0.0913868457513283, 0.00742229817946254, 0.0456455408153227, -0.00256259693200369 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4046),
				new double[] { 0.0880271542252284, -0.11242196609542, 0.014264092715539, 0.0233063481758962 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4347),
				new double[] { -0.107801435645432, 0.00524650012831288, -0.0239422825066151, 0.0267084867324755 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3619),
				new double[] { -0.103438689809028, 0.00739668712323129, -0.00592356864951749, 0.0149014173330669 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3039),
				new double[] { -0.0336667086642763, -0.0399699463879144, -0.0071306428980402, -0.0308320873162186 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4147),
				new double[] { -0.0132429821265829, 0.0425132834340847, -0.0570079080820548, 0.0325115417262601 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3385),
				new double[] { -0.150846753675463, -0.00533639499210817, -0.124754618783852, -0.0719181355247465 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4268),
				new double[] { 0.115269167668697, 0.045524419071241, 0.0112731126381574, 0.0161598009962131 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3558),
				new double[] { -0.0883258065082617, 0.00555502629100994, 0.0317971045731025, -0.0188558620167878 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4369),
				new double[] { -0.0985040519829812, 0.00905345264261479, 0.0455258892967051, 0.00062427271652789 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3654),
				new double[] { -0.0926731230388434, 0.00838380818414008, 0.0377599275660858, -0.00445333146263156 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4069),
				new double[] { -0.0848707915077887, -0.000453047632850408, 0.0160165348056143, -0.0371440455164165 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3089),
				new double[] { 0.0832445626939119, -0.114469161504327, 0.00331080481735249, 0.0221370696837317 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3439),
				new double[] { 0.044971399392179, 0.0383168686073922, 0.0176978420977245, 0.00114578922120581 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3185),
				new double[] { 0.123705584572957, 0.00992544049981521, -0.00244943349809759, -0.0156896181710041 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4146),
				new double[] { -0.109080852322911, 0.00325320451903122, 0.00884829496479332, -0.00998220071824275 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4218),
				new double[] { 0.102995436173641, 0.0455099370018766, 0.00301258331340316, 0.0360386938788912 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3644),
				new double[] { -0.106825329767604, 0.00501608291763092, -0.00824765383873554, 0.0199333605038384 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4178),
				new double[] { 0.0921923505315254, -0.109305843298145, 0.0167948645596458, 0.0513690874368352 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4376),
				new double[] { -0.101813934660284, 0.00570749269956299, 0.0495420685726759, -0.0152272942123201 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4285),
				new double[] { -0.11023955242613, 0.00146357552919426, -0.0260139312107747, 0.0284955859954939 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3196),
				new double[] { 0.134555922805042, 0.0410380188755448, -0.00575275984119303, -0.0251354134040655 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3734),
				new double[] { -0.0974247698360736, 0.00567633344053796, 0.0501479305832831, -0.0157356032640218 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3111),
				new double[] { 0.0971017505003397, -0.104851406296174, 0.00398097038235, 0.0215052709623641 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3134),
				new double[] { 0.124467949947649, 0.0426664593815394, -0.00879307031976869, -0.0329239944085339 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4275),
				new double[] { 0.116160776373676, 0.0185097439855389, 0.00416753100941478, 0.0247161976542987 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4316),
				new double[] { -0.11105817658974, -0.00311680084637942, -0.0280035556511148, -0.000659783272035158 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4424),
				new double[] { -0.0998325855088292, 0.00958993247545178, 0.0491583853476619, 0.000960104960045361 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3249),
				new double[] { 0.113061409655966, 0.0466012439035582, 0.00673378006465823, 0.0210634694836889 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3911),
				new double[] { 0.118938452461923, 0.0359385042528556, -0.0023239645366215, 0.00725485307427275 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4087),
				new double[] { 0.115151617022182, 0.0315159412020783, -0.00561313786966139, -0.00680654231925801 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3770),
				new double[] { 0.119956536069867, 0.0448878429267764, 0.00302527452563654, 0.0163372714258744 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3973),
				new double[] { 0.0821529103494198, -0.102900658382358, 0.00282108662550686, 0.000358503889375354 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3900),
				new double[] { 0.117342207721175, 0.0471285304951335, 0.0022616848556605, 0.0176863123153519 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3408),
				new double[] { -0.101159378915787, 0.0078346014881914, 0.025960224663197, -0.0104178080369749 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3493),
				new double[] { -0.100442131046386, 0.00789313695091418, 0.0304924685190554, -0.00476089947812467 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4557),
				new double[] { -0.0825611108744582, 0.00638684758992668, 0.0415245083913676, 0.000865622235749226 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3340),
				new double[] { -0.116907852909523, -0.00260339915282677, -0.033115769297387, -0.0131338606167631 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3952),
				new double[] { 0.11257379308427, 0.0433974764307788, -0.000640044701692867, 0.0189424100661253 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4375),
				new double[] { -0.0952669041580127, 0.0114443966687083, 0.0458822669127436, -0.00559684403028139 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3278),
				new double[] { 0.113670892090059, 0.0340836919088205, -0.0102928251240344, -0.0263456607883583 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4263),
				new double[] { 0.13011057281069, 0.0327417185892782, 0.000814011689893738, 0.0155768112825433 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4509),
				new double[] { 0.0944871585384307, -0.116046951763538, 0.00464407711977749, 0.00965037466024883 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3344),
				new double[] { -0.110969496643815, -0.000242921749906232, -0.038158339150027, 0.030052287121907 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3790),
				new double[] { 0.116244750607577, 0.038080275671124, -0.00557309148733649, 0.00195549837836436 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3765),
				new double[] { 0.105689562578408, 0.0344400432427082, -0.00297832318535039, 0.0097618482243302 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3926),
				new double[] { 0.0976423757361359, -0.12985297308352, -0.00283823687190553, -0.0182338244922479 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3149),
				new double[] { 0.120937639581834, 0.0425106319580311, -0.00368194052912966, -0.00239167496308657 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3715),
				new double[] { 0.0508656049044292, 0.0364854919932293, 0.0194014168687945, -0.0124983403964228 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3852),
				new double[] { -0.0877930105935062, 0.00799632017000559, 0.0367640150549277, 0.00890882321417973 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3552),
				new double[] { -0.0915882480488284, 0.00207214105615366, 0.0314605114094445, -0.0432073875118355 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3516),
				new double[] { -0.0979544370038262, 0.00194568796124306, 0.0392017760057715, -0.0264653990567563 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3059),
				new double[] { -0.0912764673812651, -0.00313793443623724, -0.00846575844259671, 0.00275124941874651 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3766),
				new double[] { -0.100321434439642, -0.000936400068844445, 0.0435208830284291, -0.0332948803698467 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4121),
				new double[] { -0.0706938338481101, 0.0116396156833063, 0.0124284742186536, 0.0072080327449536 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3935),
				new double[] { 0.117475065080406, 0.0074268993713305, -0.0073017290655751, 0.00409802313040016 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3680),
				new double[] { 0.114430795278198, 0.041210327609625, -0.00599773340969553, 0.0218175333666393 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3511),
				new double[] { -0.0877776168174276, 0.00355544491696477, 0.0301109008726859, -0.0195419513165901 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4214),
				new double[] { 0.0903900273956112, -0.11971555829663, 0.00499917124617749, 0.0231985851181678 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4039),
				new double[] { 0.0994145207397754, -0.126110421019752, 0.00445777231139618, 0.000813647965660464 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4429),
				new double[] { -0.0918809145892196, 0.0133810658279056, 0.0468056315863082, 0.00129201058900339 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4370),
				new double[] { -0.0894387947972567, 0.0114139687596609, 0.0447326643957947, 0.00625561512018237 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4564),
				new double[] { -0.0959854552638982, 0.00973669493966445, 0.0152459868366878, 0.00686789587606983 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3987),
				new double[] { 0.104858606921621, -0.125440959445832, -0.0215656528176095, -0.0598109875457634 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3173),
				new double[] { 0.137020887297784, 0.015924550561656, -0.0149484991723558, -0.0535750492982508 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3500),
				new double[] { -0.0969032556987745, 0.00325048924975453, -0.0183150862967395, 0.00243495278329582 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4104),
				new double[] { -0.109744784825476, 0.0106677717017977, 0.000633205812561843, 0.0215658759621249 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3527),
				new double[] { 0.0173719763326893, 0.0360488173789215, 0.0275830870553847, 0.00332010491976176 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3338),
				new double[] { -0.113923715542447, 0.00514025041634895, -0.0418241295427212, 0.0348088721322928 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3850),
				new double[] { -0.0986210801566413, 0.00802182686105468, 0.048327998379772, 0.00120613500574642 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4209),
				new double[] { 0.0917996897552584, -0.106952245256776, 0.0131460035716011, 0.0300170867666672 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4416),
				new double[] { -0.109921704022699, 0.00455124542087446, 0.0206506365659762, -0.00644277745238479 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3314),
				new double[] { 0.116078829983012, 0.0243139992983651, 0.0014329360381482, -0.00239584790184305 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3368),
				new double[] { -0.144507328024099, -0.00577473589031496, -0.134167053303739, -0.102952089493139 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4474),
				new double[] { -0.109525649980671, 0.00539967682930679, -0.0169106347258608, -0.0116900330733555 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4293),
				new double[] { -0.116447747490224, 0.00218364607972273, -0.051809979287777, 0.0225315658473991 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3266),
				new double[] { 0.115542388519871, 0.04337787421508, 0.0054025036012706, 0.0157404905068785 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3194),
				new double[] { 0.135821209853385, 0.0288531817780593, -0.0161063221456399, -0.0454476254610463 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3965),
				new double[] { -0.0999260396142411, 0.00788851235663672, -0.00281571798728565, 0.0164520052929193 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3405),
				new double[] { -0.112613538336879, -2.65249286491982E-05, -0.0487554280424729, 0.0176398018968142 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4487),
				new double[] { 0.0888620320485672, -0.114040650101958, -0.00804963577454743, -0.0179000214227574 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4007),
				new double[] { 0.0877267405336321, 0.0407706791363194, 0.0063259452512108, 0.00757677427962847 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4065),
				new double[] { 0.0288478514007638, 0.0337117785494123, 0.000676791155760572, 0.0170229148932679 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3832),
				new double[] { -0.0865844497412465, 0.00207961153382245, 0.0243909081148619, -0.00314465323412309 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3386),
				new double[] { -0.130198227633102, -0.00482814936961733, -0.071083844293627, -0.0506267871518535 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3712),
				new double[] { -0.102273964095745, 0.00713528059771729, 0.0528165064376135, 0.00112062207847024 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3829),
				new double[] { -0.0974252379524761, 0.00672700087418806, 0.0374354650965859, -0.0126484313182688 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3944),
				new double[] { 0.129421775653333, 0.0463378089452532, -0.0118031038443358, -0.0281493564667467 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4329),
				new double[] { -0.113727791481316, 0.00440810521299064, -0.0419058579827234, 0.0324834912056091 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4461),
				new double[] { -0.106062688484055, -0.0031595967934127, -0.053963964642202, -4.18942745554044E-05 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4332),
				new double[] { -0.118563152325619, 0.0029630335941726, -0.0537241623513907, 0.032965960368979 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3565),
				new double[] { -0.101642215744316, 0.00141687187298309, 0.0410208340482536, -0.0207213283779189 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3676),
				new double[] { 0.114851823675348, 0.042836905872472, -0.00780854547808851, 0.00249548161065206 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3049),
				new double[] { -0.0309353303417911, -0.0522387815318398, -0.00114305158245732, -0.00924328582364533 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3222),
				new double[] { 0.125559567006203, 0.0154667005724125, -0.0126689694388849, -0.0137014966522229 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3485),
				new double[] { -0.0835682461248408, 0.00496361728289058, 0.031450373427926, 0.000998873227424831 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3796),
				new double[] { -0.090933555097883, 0.00720743162493409, 0.00892594717631967, 0.0133470740019128 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3352),
				new double[] { -0.0138217629176782, 0.0336371518232628, 0.0193284233434702, 0.0100054231092688 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4555),
				new double[] { -0.115058998876569, 0.00624557226445643, -0.045738832562962, 0.0281365432359045 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4336),
				new double[] { -0.110031553212455, 0.0039497299219906, -0.0227624120217373, 0.0303776441634623 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3563), new double[] { -0.0970331169629698, -0.00325405898522923,
				-0.00916825108397168, -0.000731969666087062 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3582),
				new double[] { -0.108377564315066, -0.000923245122761313, -0.0397414864258265, 0.0294947640267797 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4430),
				new double[] { -0.096435680411432, 0.00585238410283634, 0.0381851619939059, 0.00418955899547473 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3844),
				new double[] { -0.0570062974419652, 0.0208189194437454, 0.0476650099580297, 0.00987831675089961 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4006),
				new double[] { -0.0522949236135349, -0.0450363015193442, -0.0297481331974354, -0.0279467129625969 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3477),
				new double[] { -0.0936201341684089, -0.00326019904881986, 0.0125989536721456, 0.00162016803099808 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3041),
				new double[] { -0.0374560358924876, -0.041675563372356, -0.00686764150353009, -0.0336990807957278 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4411),
				new double[] { -0.0996377530636449, 0.0097858250558533, 0.0508001332579491, 0.00208209291934378 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3963),
				new double[] { -0.0116495446116207, 0.0316278905645317, 0.0188780306538625, 0.00525230858299349 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3841),
				new double[] { -0.101619709219731, 0.00988072367677183, 0.0478997286480258, 0.00752038291535791 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3839),
				new double[] { -0.0915059390631579, 0.0123391933566502, 0.0466742034782086, 0.00381499339438287 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4028),
				new double[] { 0.127784528032265, 0.0530156781411199, -0.00129877026643078, -0.0073155609062618 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4473),
				new double[] { -0.123772587421347, 0.00372145404936826, -0.0591000905452599, -0.031948339823862 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3986),
				new double[] { 0.0720227557745199, -0.118799094156599, -0.00507597258838146, -0.0292228248122265 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3367),
				new double[] { -0.124051042965983, 0.00391822662184025, -0.0864995939843846, -0.0310639640114397 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4080),
				new double[] { 0.117419974622388, 0.0288595171875781, 0.00604340510667488, 0.0117238908447926 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3711),
				new double[] { -0.0929416406627001, 0.00611927591317887, 0.0328882627492285, 0.0035349872539288 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3543),
				new double[] { -0.0982373602502833, -0.00341451759192386, -0.0180283877769931, -0.0172531156417851 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3678),
				new double[] { 0.125443084978273, 0.0448212099932785, -0.00298868252227499, -0.00145389766895386 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3341),
				new double[] { -0.122240952385814, 0.00249732636844353, -0.0622334679613854, 0.00508753758432161 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4279),
				new double[] { 0.109051916296904, 0.0488135543343497, -0.00257773856928465, -0.0119079268276979 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4518),
				new double[] { 0.0883923825523328, -0.104879343824205, 0.00889089499799299, 0.0151831154164208 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3287),
				new double[] { 0.10874517751832, 0.0238598153510894, 0.00532047661494628, 0.0217262174624401 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3210),
				new double[] { 0.110984864396193, 0.0400262534283524, 0.00167982453951956, 0.0135737665364345 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3075),
				new double[] { 0.113043398860835, -0.135355349497758, -0.0038948785987659, -0.0337417653092977 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4256),
				new double[] { 0.112747914640387, 0.0459891855399998, 0.00436603108240159, 0.0153602162740498 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3716),
				new double[] { -0.0789390306036952, 0.0114966133113605, 0.0354506838158908, -0.00395905761571062 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3694),
				new double[] { -0.0955411599990177, 0.0109110551458507, 0.0329240486782649, 0.00549700420433686 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4334),
				new double[] { -0.104912768692336, -0.00259008952509272, -0.0326420010735863, 0.0300669082008937 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3112),
				new double[] { 0.092537927910215, -0.114398343184586, -0.00132131016530682, 0.00632555595976945 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4010),
				new double[] { 0.118247758850289, 0.031341027154145, 0.0016757607311975, 0.0224262931935528 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4565),
				new double[] { -0.0959349351834048, 0.00426876189194916, -0.018196134215086, 0.0224738071724927 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4269),
				new double[] { 0.121958057805363, 0.0305748271434177, -0.00751776512585341, -0.00142689393286971 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4194),
				new double[] { 0.0847192449497083, -0.108062641081407, 0.0135002341487841, 0.0344626905335615 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4366),
				new double[] { -0.119174195711408, 0.00507348044237764, -0.0329915782294903, 0.0260273804227797 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3975),
				new double[] { 0.0614191977947982, -0.122110201116364, -0.00823440588836402, -0.0179216700325691 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3391),
				new double[] { -0.112194383198493, 0.00235528824959493, -0.0405170881933448, 0.0145091326087691 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4047),
				new double[] { 0.095150208566008, -0.132626156875635, 0.00660946419903064, -0.000921984408208553 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3462),
				new double[] { -0.101209526216155, 0.00692006230943573, 0.0454898413137665, 0.00102000579605171 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3984),
				new double[] { 0.0972514469479232, -0.112721400116742, 0.00679047394876265, 0.0170028391278318 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3903),
				new double[] { 0.120490579051862, 0.0280833610267058, -0.0106572376991127, -0.0199512630774504 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4327),
				new double[] { -0.111589755943637, 0.00141039858164669, -0.0364253313096189, 0.0233859316357094 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3271),
				new double[] { 0.128232171736986, 0.0265495063491899, -0.00525600537450494, -0.00994321545189771 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3107),
				new double[] { 0.0994581730576698, -0.133006655997753, -0.000156040026280801, -0.0170975475513461 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3090),
				new double[] { 0.134917786626235, 0.0235066449753822, -0.0219121033944922, -0.0585398307638546 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3929),
				new double[] { 0.109735519862453, 0.0517047381273016, 0.00521446400142301, 0.0114520127672206 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3601),
				new double[] { 0.0269792949010209, 0.0323743306954702, -0.00120752347445435, -0.00328931282582389 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3634),
				new double[] { -0.112669159592636, 0.00285885741246505, -0.0407775531271981, 0.0265684115845035 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4301),
				new double[] { -0.116039498632001, 0.0077703378451197, -0.0403813699900018, 0.0373651953828785 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3793),
				new double[] { 0.105006449018218, 0.0448299935782093, 0.00631762133800401, 0.0119812491391292 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3868),
				new double[] { -0.102751155302037, 0.00563088466980784, -0.0401422975898675, 0.0289510853417968 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3961),
				new double[] { -0.013596861553632, 0.0333061144885864, 0.0262524697862127, 0.00565780148997218 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4335),
				new double[] { -0.114547734775784, 0.00464890367821254, -0.0466782782182376, 0.0330392990927647 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3306),
				new double[] { 0.123469608059494, 0.0484580930378681, -0.02838139990428, -0.0446032528908792 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3642),
				new double[] { -0.0903644966460369, 0.0141415978560074, -0.0323653842034558, 0.0313315457353897 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3251),
				new double[] { 0.0233668887397713, 0.0250374191959963, -0.00194112133912344, 0.0160989465072127 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4536),
				new double[] { 0.118944797479664, 0.032440059416591, -0.0225137176482751, -0.0318862274535677 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3662),
				new double[] { -0.0913123142964468, 0.0046413944995644, 0.0460772062278168, 0.00291286015194412 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3510),
				new double[] { -0.084571164499882, 0.0050602457963697, 0.0303752406239436, -0.0138841266022658 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3488),
				new double[] { -0.101038994227891, -0.00236612262851995, -0.015157580532389, -0.0554778369838233 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3364),
				new double[] { -0.143647492005267, -0.00839678293392118, -0.102075440922625, -0.0354038953775788 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3159),
				new double[] { 0.123393849169445, -0.0048939480477678, -0.00254905958198618, -0.0108962583502344 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3863),
				new double[] { -0.0901598671212237, 0.00655489567481822, 0.0352064813130749, 0.00587619577437518 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3042),
				new double[] { -0.0190411018136013, -0.0556522594159528, 0.000856910518587564, -0.0255939784223518 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4420),
				new double[] { -0.0913733527123943, 0.00892689760238262, 0.0445735049884327, 0.00294164124236464 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3203),
				new double[] { 0.11966902735068, 0.0319659171963615, -0.00234601419746058, 0.0100256419745529 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4156),
				new double[] { -0.0113009341435994, -0.0274492641551047, 0.00165026000866268, 0.01754444671767 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4506),
				new double[] { 0.0770648705148079, -0.0887539731607567, 0.00645114769434057, 0.0226963634782894 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3252),
				new double[] { 0.116058018965397, 0.0462121092618285, -0.00540892626805049, 0.00838116083194558 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3690),
				new double[] { 0.0978208499087815, 0.00262256304688872, 0.00470188733395528, 0.0264802274144752 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3877),
				new double[] { 0.110334932942604, 0.0069982679548875, 0.00186680188250714, 0.0296240673937933 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3701),
				new double[] { -0.10031622756498, 0.00375703557748536, -0.000746333422030221, 0.0159399698100306 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4491),
				new double[] { -0.115506364779389, 0.00296415959919154, -0.050748556882906, 0.0259389054136584 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4206),
				new double[] { 0.0909266129100571, -0.0993431052524165, 0.0127912919303426, 0.0351351445011555 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4457),
				new double[] { -0.100529457896066, 0.0103268642240331, 0.0413371858970376, -0.0284127227628853 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4103),
				new double[] { -0.0984575156711904, 0.00411900204943802, 0.0161013192748289, 0.00390564597961307 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3886),
				new double[] { -0.0578277664782303, 0.0166467281187758, 0.0363376898981189, 0.00925466284076017 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4271),
				new double[] { 0.115306067248353, 0.0466297258158124, 0.00521678022587176, 0.0226779677723707 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3518),
				new double[] { -0.09621687685817, 0.00590504727816418, 0.0392704860003169, -0.0290859197124739 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3200),
				new double[] { 0.120400796695087, 0.0422504048023537, -0.00698770197911928, -0.0148238660766506 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4470),
				new double[] { -0.102323389718168, 0.00847788067105575, 0.041651889643272, -0.0371550237499323 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3916),
				new double[] { 0.0747796739462716, -0.0888161047025557, 0.0106395019739483, 0.0232938210842972 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3349),
				new double[] { -0.109029367500289, -0.00137004846033526, -0.0642348413590246, -0.0308728937271832 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3720),
				new double[] { 0.119023732151708, -0.0105852074965745, 0.000520150314576187, -0.00770163825141999 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3958),
				new double[] { 0.11147311495646, 0.000769211741716782, 0.000739480087694535, 0.0168738770618493 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3985),
				new double[] { 0.0870149460130117, -0.111224005000983, 0.0044443829816636, 0.0220221559562388 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3100),
				new double[] { 0.0930894747444054, -0.121780615030387, -0.0136806064819086, -0.0282899871112613 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4134),
				new double[] { -0.108796656081855, 0.00468370588480794, -0.0110341712306446, 0.0275522200237166 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3783),
				new double[] { 0.113734907144758, 0.0437279215450315, 0.000334372028939747, 0.0255633196173335 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4398),
				new double[] { -0.0939861006256113, 0.011664628253123, 0.0509084397000923, 0.00673067569313189 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3374),
				new double[] { -0.14718631995853, 0.000818708347991205, -0.108964794609253, -0.0458348095644733 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3321),
				new double[] { 0.105959624913564, 0.0471185392822932, -0.0258960626061876, -0.0499567330221993 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3822),
				new double[] { -0.101214289935986, 0.00522068247095984, 0.0149739825156716, 0.00626342479672073 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3175),
				new double[] { 0.118050199451174, 0.0128893182794774, -0.0117424184104089, -0.0301427231913431 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3305),
				new double[] { 0.119234698222466, 0.0428274276984288, 0.00056083713572523, 0.0277383780975064 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3753),
				new double[] { 0.0894160478470236, -0.00655871332965494, 0.00706926017768181, 0.0232767331011162 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4107),
				new double[] { 0.0967839835686316, -0.00769224617764187, 0.0129497864780473, 0.0335465958813989 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3999),
				new double[] { 0.123690537069728, 0.0408281647698765, -0.01707506762987, -0.0426221424643187 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4017),
				new double[] { -0.109122151039719, 0.00461695483015731, -0.0133277584142717, 0.0277397547260437 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3398),
				new double[] { -0.113794903544313, 0.00206060670081766, -0.0528582781622032, 0.0167687403431176 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4447),
				new double[] { -0.0778288134356478, 0.00998239875239463, 0.0409295787752407, -0.0366268137467698 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3540),
				new double[] { -0.129553579393531, -0.00227436259179858, -0.0523631255237797, -0.060185720698729 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4515),
				new double[] { 0.106949362207268, -0.141451514922432, -0.00033470988593853, -0.0319845592806761 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3031),
				new double[] { -0.0288477263362226, -0.0504190942077212, -0.00708803182159632, -0.00904083392449544 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3406),
				new double[] { -0.115844704884108, -0.000653640620992619, -0.0698593616660236, -0.009360646360289 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3103),
				new double[] { 0.099101881730459, -0.125074255172611, -0.0210921216321697, -0.0427866639100123 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4371),
				new double[] { -0.0866005025324083, 0.0135778261916924, 0.0416763166590942, 0.00646944125467339 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4337),
				new double[] { -0.106402045102794, 0.00432231022260197, -0.0433274013493113, 0.0317645444578572 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3531),
				new double[] { -0.10886564446635, 0.00297737447944985, -0.0488517187932198, 0.0224256826552975 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3545),
				new double[] { -0.108035918634039, -0.000737564961594654, -0.0244215723819629, -0.0410327285071639 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3587),
				new double[] { -0.114205034342927, 0.006729972118623, -0.00513381292670342, 0.00945977452793689 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4490),
				new double[] { 0.0968570894109864, 0.0419557183973696, -0.0134112517739252, -0.064397403898924 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3589),
				new double[] { -0.11320300834122, 0.00463313253353185, 0.0147506340930338, 0.00528768834900229 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3387),
				new double[] { 0.116742565461583, 0.0465676791111275, -0.0112595270245004, -0.0181020648281517 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4148),
				new double[] { -0.100505405721683, 0.012718250664129, -0.0140331469672166, 0.0265188073297623 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3141),
				new double[] { 0.126575639003401, 0.0431324143894827, -0.0157693488633322, -0.0389384654854308 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3504),
				new double[] { -0.0926755277106519, 0.00642494621682099, 0.0344157531718526, -0.020435409713842 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4274),
				new double[] { 0.1145910966565, 0.0452188048266847, -0.00278638248076104, 0.0251408702308721 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3524),
				new double[] { -0.114666384185053, -0.000213477301916677, -0.0268716366325336, -0.15342198566711 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4018),
				new double[] { -0.0868093205795812, 0.011764392460629, 0.0142923229896104, -0.00384209004552123 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3672),
				new double[] { 0.10938600373286, 0.040610299844221, -0.00963787815344961, 0.00361948530988663 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3559),
				new double[] { -0.0809805704307549, 0.00821240112700896, 0.0114779164121691, -0.00232968831401301 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3620),
				new double[] { -0.105691062459644, 0.00624580334339974, -0.0234426813912866, 0.0192614544267419 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4395),
				new double[] { -0.10117940127378, 0.00984429884698279, 0.0529722654390862, 0.00662065726809294 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4578),
				new double[] { 0.0821690093710757, -0.0863939898390111, -0.00129044525878055, -0.00264935933070384 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3939),
				new double[] { 0.121456119590473, 0.00930160090738043, -0.0189884024532303, -0.0312010363279542 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4514),
				new double[] { 0.0826275191536802, -0.0881427925214149, 0.00315216147443451, 0.0075173776953856 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3633),
				new double[] { -0.0874023106607573, 0.0122531586135776, 0.0365438357009466, 0.00115963911988221 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3277),
				new double[] { 0.123306189299085, 0.033580718213881, 0.00392577066798063, 0.0253133341050295 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4479),
				new double[] { -0.111932736640901, 0.00520759188388273, -0.0287432002781242, 0.00863838173673519 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4088),
				new double[] { 0.123368458322938, 0.0237285191228377, -0.00149988799409532, 0.000347783686159674 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4211),
				new double[] { 0.0894109084896564, -0.108574124167955, 0.0158797833845305, 0.0369115111060166 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4350),
				new double[] { -0.116781594724073, 0.00472719902483339, -0.0463483800047882, 0.0387531335034801 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4198),
				new double[] { 0.0926071800151104, -0.111805511498483, 0.0104542945166678, 0.0242843605630894 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3879),
				new double[] { -0.0209541594531587, -0.0378720936669481, 0.00894093033471441, 0.024567886854412 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4441),
				new double[] { -0.0953031074169609, 0.0125320979394529, 0.0489179185671589, -0.00190511949480567 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3382),
				new double[] { -0.120055221730943, 0.00339219400413071, -0.0754296218363212, -0.0197810372442537 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3854),
				new double[] { -0.0944050942055648, 0.00160208035731955, 0.0442266201689306, -0.00121865304587458 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3962),
				new double[] { -0.094070735512038, -0.0010677726592294, 0.0412191785919448, -0.0174531749098928 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3262),
				new double[] { 0.12597577172849, 0.0316230998777338, -0.019029078872494, -0.0427698575481717 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4577),
				new double[] { -0.131253319654151, -0.000822842894613404, -0.0669627683685629, 0.022329689866775 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4508),
				new double[] { 0.0816109639826828, -0.105390362747443, 0.00392204616601815, 0.013707519828555 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4497),
				new double[] { 0.11595359891063, 0.0418738957909132, -0.00497306459397696, -0.010654165036932 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3740),
				new double[] { 0.122210388922968, 0.025854480959107, 0.00414438638171275, 0.0133590815111905 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3432),
				new double[] { -0.101318851122782, 0.00238091894470981, 0.0119394337230207, -0.0624553384049302 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3950),
				new double[] { 0.120142757195984, 0.0465580120950695, -0.00779588141851704, -0.00861828894595433 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3695),
				new double[] { -0.0953641952597969, 0.00946243370603281, 0.0324163914323143, 0.00577687483521606 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4566),
				new double[] { -0.0988959617895558, 0.00302071877428543, -0.0258867654691116, 0.0184788749184519 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4313),
				new double[] { -0.11879804852628, 0.00498220240002108, -0.0486988418582668, 0.0344428792766169 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4029),
				new double[] { 0.0834130386162004, -0.131429004789842, -0.0103828323000813, -0.0314223336153418 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3121),
				new double[] { 0.0937794388376849, -0.116303857962813, 0.00751024365647309, 0.0255604630169965 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4177),
				new double[] { 0.083341252379966, -0.106181147996786, 0.0177220880666457, 0.0497529048101204 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3331),
				new double[] { -0.111817207597811, 0.00435255746750818, -0.0406334788175743, 0.0218424913984623 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3281),
				new double[] { -0.0934157288382932, 0.00447177453327737, 0.00501974269010724, 0.0031404770008719 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4554),
				new double[] { -0.00062846884498619, 0.0281734164822618, 0.0250151419842289, -0.000319970516807012 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3869),
				new double[] { -0.0904830765454282, 0.00664009693592321, 0.0353085454618607, -0.0172040326801544 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4551),
				new double[] { 0.105607210065211, 0.0360469868047984, -0.000569386407575861, 0.00301557941632367 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4452),
				new double[] { 0.108374358844529, 0.0322747592314303, 0.00530895592671049, 0.0237514663897217 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3937),
				new double[] { 0.103352442447404, 0.0463845601769871, -0.00682762839137156, 0.00304953435848475 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3409),
				new double[] { -0.0917414765350623, 0.000236156447248453, 0.0423879964404124, -0.0282766474968781 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3456),
				new double[] { 0.0376034198145282, 0.016383743172456, 0.0276517175384524, 0.0138231915631246 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3452),
				new double[] { -0.093884305574487, 0.00737352397031464, 0.0384179686526313, -0.00751810536901332 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3296),
				new double[] { 0.118675877988803, 0.0463504332963868, 0.00305931538985707, 0.0150532061880543 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3897),
				new double[] { 0.125273301143412, 0.0345538149889322, 0.0033345436647595, 0.0237820701777869 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4058),
				new double[] { 0.0840693365655762, -0.0102189721594047, 0.00693331558644037, -0.0170663961360357 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3904),
				new double[] { 0.0885987260001056, -0.00488004677456578, 0.00860134231438545, 0.0147171658835158 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4215),
				new double[] { 0.0912969155412064, -0.117279427838375, 0.00813506316107379, 0.0246343093796294 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3767),
				new double[] { 0.111547078149726, 0.0480721596206085, 0.00875867459915799, 0.0175686200482907 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3761),
				new double[] { 0.119439232180244, 0.0413018735632727, 0.00262850275138254, 0.0295034364467303 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3169),
				new double[] { 0.131145822200841, 0.0300183893444925, -0.00591696900700609, -0.0357612026380697 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3113),
				new double[] { 0.0713155576646267, -0.0953011240274715, 0.00589588251474445, 0.032448929564959 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3802),
				new double[] { -0.102023066345121, 0.00779423199279209, 0.0413114675301686, 0.00390108281528821 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4587),
				new double[] { 0.117904112965153, 0.0270010849937387, 0.00557739630728517, 0.0239819943629511 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3858),
				new double[] { -0.099905325397501, 0.00561071818749478, -0.00801879812312502, 0.0159412947428529 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3779),
				new double[] { 0.115942837848126, 0.0505941561962883, 9.45308927405748E-05, 0.0233388242952807 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4027),
				new double[] { 0.113961562343083, 0.0429310904602396, -0.0135287061085105, -0.0167672674003343 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4264),
				new double[] { 0.123207208136502, 0.0494648187861739, -0.0149128734705631, -0.00346171425615806 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3569),
				new double[] { -0.113902977995195, 0.00254205977934492, -0.0145609093090554, -0.0277957258510342 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3291),
				new double[] { 0.126217364837812, 0.037174284142022, -0.019147866519162, -0.0505703986806315 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3820),
				new double[] { -0.0944691177611968, 0.00526391964743174, 0.0399496362166048, -0.00206344989569413 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4319),
				new double[] { -0.114004190861169, 0.00282217961772222, -0.0399005585000755, 0.0222626012477717 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3319),
				new double[] { 0.135878039204063, 0.0171501828616991, -0.0237656365463429, -0.0567205306436192 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3972),
				new double[] { 0.0824724460904594, -0.109323602252439, 0.00609177156606256, 0.0241521386884452 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3268),
				new double[] { 0.116539606419631, 0.0409254292401459, -0.0050644806032001, 0.0170323822580289 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3536),
				new double[] { -0.0875247268318341, 0.0122115334855287, -0.0746107630151464, -0.0239818109055416 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4358),
				new double[] { -0.117387719988497, 0.00626896924570802, -0.0465397175954417, 0.0360245993474942 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4462),
				new double[] { -0.0866578919663415, 0.0100563315313356, 0.0267328245644529, -0.0326996799256153 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3238),
				new double[] { 0.121366853693691, 0.0490116677334075, 0.00405557440662175, 0.0240549623810029 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4037),
				new double[] { -0.0936522538697508, 0.00804449377029335, 0.0517675712608978, -0.0219859552776419 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4224),
				new double[] { 0.111580519006914, 0.0362016009225744, -0.00570183011875462, 0.00130395229308291 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3461),
				new double[] { -0.0922283162863311, 0.0123032736929323, 0.0438011189170494, -0.00914286476859725 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3057),
				new double[] { -0.0261366498518459, -0.0314731227005465, -0.0053324838726495, -0.0145954349894122 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3237),
				new double[] { 0.0959418629796882, 0.0389000529131505, -0.00551513028963958, -0.0185612746793493 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4003),
				new double[] { -0.0953234336410627, 0.00242438119666744, 0.0395472185019554, -0.0398156133724056 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3114),
				new double[] { 0.0875744205966163, -0.111588137164202, 0.00263824754455095, 0.0161298863718547 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3311),
				new double[] { 0.110038224859945, -0.00922973147516113, -0.0330138945102758, -0.0758878286350889 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3851),
				new double[] { -0.0861284995289239, 0.00715475317478737, 0.016921870962342, 0.0117015918769767 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3946),
				new double[] { 0.116011498661241, 0.0433944993896302, 0.00073553390703993, 0.0174711296907514 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4197),
				new double[] { 0.0781855473258477, -0.0684890723001704, 0.0173782158717584, 0.0340369906633254 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3572),
				new double[] { -0.0923217694921683, 0.000566879336375713, 0.00177747000778703, 0.00568126015431795 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3290),
				new double[] { 0.122600249589357, 0.0149423362584891, -0.012352790605129, -0.0276679743689585 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4386),
				new double[] { -0.0971739328842094, 0.0120919950552071, 0.0453173318775603, 0.00917244410182501 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4459),
				new double[] { -0.116309191178, 0.00581845003385861, -0.063889986066505, 0.0109534936303752 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3215),
				new double[] { 0.110235813958788, 0.0390948744204801, 0.00330477016101097, 0.0192206136827076 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4543),
				new double[] { 0.106922737860015, 0.0331846439907688, -0.01572400898881, -0.0329327547576226 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4139),
				new double[] { -0.103304864425009, 0.0097307251484488, 0.0183555965576241, 0.0144626894688707 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4270),
				new double[] { 0.115483397461701, 0.0505371694937628, 0.000908441014674081, 0.0233087627594627 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3243),
				new double[] { 0.111101521673798, 0.041354738124139, 0.00562567268595248, 0.0219553604091373 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3130),
				new double[] { -0.111215451808359, 0.00337880033135376, -0.0301515050723031, 0.0290353650870566 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3652),
				new double[] { 0.118631530873432, 0.0448772008887367, -0.00184051016064918, 0.0187914209725353 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3862),
				new double[] { -0.0877771246727378, 0.0152488802118331, 0.0145002738585068, 0.0180929993597793 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3152),
				new double[] { 0.120920223007612, 0.0417527199545628, -0.00198344080791152, 0.0127801747679414 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3564),
				new double[] { -0.0949644538454328, 0.00244419269827938, 0.0286859460591036, -0.052758567719357 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3187),
				new double[] { 0.136030014142598, 0.040596593937045, -0.0121583694618254, -0.0470844667096312 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3081),
				new double[] { 0.113011506138066, -0.129481405737622, -0.004543926407507, -0.0324045921124646 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3403),
				new double[] { -0.103094420096917, 0.00325650457121576, -0.0472524036572609, 0.0165595800761596 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4095),
				new double[] { 0.120170736859088, 0.0436513094749592, -0.0129649166228892, -0.0230286923619562 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4297),
				new double[] { -0.113476882434029, 0.00756837161450217, -0.0157584605225686, 0.0301467825021418 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3627),
				new double[] { -0.110234196955772, 0.000154716502305263, -0.0411756835990557, 0.0224471601117882 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4113),
				new double[] { 0.0298289156431679, -0.0277248941932153, 0.00203646421609071, 0.0395039312712976 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3887),
				new double[] { 0.0811651624100466, -0.00869282524480713, 0.00724278141066073, 0.0107300720129349 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3603),
				new double[] { -0.0880624413394186, 0.00984526465570185, 0.01421646438147, -0.0134054264391644 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4119),
				new double[] { 0.112259532649425, -0.0518613373912557, -0.00657120042369836, -0.0315984558103923 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3225),
				new double[] { 0.11374045400507, 0.0159770362700921, -0.00792458351072425, -0.00819036181995426 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3105),
				new double[] { 0.0916662409984303, -0.11708555939819, 0.00744487388120098, 0.0133101340297059 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3725),
				new double[] { -0.0940552610976531, 0.0076882426373473, 0.0410484531785995, 0.00146294954294832 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3614),
				new double[] { -0.0936848775465159, 0.00671711954029658, 0.0391977029257824, -0.0137647229438606 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4528),
				new double[] { 0.112105868213546, 0.0364878702585561, -0.00129112151899641, 0.0025696798376762 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3320),
				new double[] { 0.0822765983970543, 0.0550720031409815, -0.036836838597632, -0.0330908690391914 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3313),
				new double[] { 0.113189978708949, 0.0402096856343477, -0.000685666652237807, 0.00466988708936795 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3859),
				new double[] { -0.114135947801436, 0.00188083263416532, -0.0303545607767896, 0.0284490171507416 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3724),
				new double[] { -0.0667504710040873, 0.0153325056008708, 0.0449051333446828, -0.00216304383856678 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3440),
				new double[] { -0.109562394334661, 0.00323017299159852, -0.0107235057994001, 0.00656663132710611 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3896),
				new double[] { 0.110955932549962, 0.0452238627536603, -0.000183869397434297, -0.00462079475724966 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4201),
				new double[] { 0.0929517131645916, -0.119589399387177, 0.011342244786165, 0.0226295694467868 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4090),
				new double[] { 0.119597763019885, 0.0386933639567569, -0.024511464974548, -0.0467676483587037 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3874),
				new double[] { -0.10849510176188, 0.00325811298973837, -0.0373712104745078, 0.0333189901488324 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4262),
				new double[] { 0.134525467604014, 0.0406736208434576, -0.00599133833690319, -0.00893132559982097 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4589),
				new double[] { -0.103815752079027, 0.00166131921860305, -0.0158023942507142, 0.0191650452107805 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3759),
				new double[] { 0.115787211552603, 0.0434005417550853, 0.00427319060266317, 0.0247238817723456 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4151),
				new double[] { -0.113692290579768, 0.00669507616438987, 0.0228496802631845, 0.00398000614477818 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3882),
				new double[] { 0.110698766453873, 0.0402484178524538, -0.00667596828392055, 0.00996808626079849 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4493),
				new double[] { 0.108704242761785, 0.043272845457018, -0.0100085008952436, -0.00459604721580692 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4023),
				new double[] { 0.125420102330791, 0.0383144631585155, -0.0174529871527238, -0.0535604706414338 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3608),
				new double[] { -0.110768668514659, 0.00238104152716028, -0.0269951556096349, 0.0159284587303258 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4582),
				new double[] { -0.0915891899167846, 0.00663562846135111, 0.0054814485557564, 0.0182280297640667 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3688),
				new double[] { 0.115938643161563, 0.0498477549183533, -0.000563484764289454, 0.0221135642104425 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3624),
				new double[] { -0.0965448991834432, 0.00888971049098421, 0.0454320058729527, -0.0055146872040763 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3065),
				new double[] { -0.098103444021767, -0.00709732568930593, -0.00454749972532487, -0.0634170501861088 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4530),
				new double[] { 0.120201456682535, 0.046471645975644, -0.00784172510647766, -0.0100869350651349 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3254),
				new double[] { 0.118606532282451, 0.0425461262700599, -0.000458079348352322, -0.0062096253516425 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4043),
				new double[] { 0.0987164730664462, -0.123562359527149, 0.00638338566186093, 0.0022556313930361 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3297),
				new double[] { 0.136329652131706, 0.042816719205207, -0.0344871077002486, -0.0701064478162521 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4432),
				new double[] { -0.0946232948252767, 0.00532670816915275, 0.0456376312582315, 0.00773135319250816 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3758),
				new double[] { 0.0650562407856893, 0.0484917120715507, 0.02085177617316, 0.0202149176804015 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3132),
				new double[] { 0.123085009999953, 0.042328517022252, -0.0140777146541493, -0.0223369165466109 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3360),
				new double[] { -0.118844062716911, 0.00288853792645545, -0.0511941384658168, 0.0295394627789825 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3940),
				new double[] { 0.0897896483366738, -0.117848642337269, -0.00539118978438371, -0.00120030556854178 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4456),
				new double[] { -0.0984577602874284, 0.00105456640723986, 0.0313145745198554, -0.0555182273645506 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4164),
				new double[] { -0.0190394667782902, -0.0446435379221542, 0.00883182395452356, 0.0121878824862486 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3995),
				new double[] { 0.11445911034021, 0.0416553426038935, 0.00211238289433899, 0.0203597828238977 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3308),
				new double[] { 0.121635480254071, 0.0430194076818637, -0.0323138522261844, -0.0529656626274538 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3315),
				new double[] { 0.144822705634396, 0.018101615018778, -0.0177007564377262, -0.0337271309346771 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4372),
				new double[] { -0.0903508188968812, 0.00979901946717925, 0.0428424794157805, 0.00716304687442311 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4235),
				new double[] { 0.11340542076018, 0.0481368381371571, 0.00411781429306745, 0.022858323179491 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4034),
				new double[] { -0.101187946138082, -0.00328869760361548, 0.0522148185167811, -0.0336140591873307 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4060),
				new double[] { -0.0886815272451958, -0.0123434629393451, -0.035471327159305, 0.0176556356943268 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3498),
				new double[] { -0.0989535221691488, 0.00313123302800411, 0.0226151983958588, -0.0233785236853554 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4324),
				new double[] { -0.109968400219038, -0.00335472578128546, -0.0343833833243433, -0.0103372655098843 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3584),
				new double[] { -0.0911523095830879, 0.00264187025602431, 0.0113570461188828, 0.0077336570019749 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4108),
				new double[] { -0.0897933989322105, 0.0172145241674263, 0.0150780471273681, 0.0209394501911065 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4302),
				new double[] { -0.116251679499345, 0.00457814268932368, -0.0466902941444584, 0.0424692223710468 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4157),
				new double[] { -0.0475992084578466, -0.0357309201859108, 2.36357911437886E-05, -0.00598590460706338 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3769),
				new double[] { 0.106839974947154, 0.0531711747101253, 0.00761507526278419, 0.0259903741148677 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3086),
				new double[] { 0.103053413283864, -0.11409390090728, -0.0155790207863504, -0.0309572107914216 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4223),
				new double[] { 0.120659825597298, 0.0549736083489134, -0.0051345390630127, -0.00661764815591115 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4443),
				new double[] { -0.0965160285369852, 0.00669345399624386, 0.0323335886760576, -0.00421427553596257 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4535),
				new double[] { 0.117194552141364, -0.0051018334824579, -0.0129965250049361, -0.023113324486878 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4061),
				new double[] { -0.0547441548612778, -0.0135940995209487, -0.00682602181353815, -0.0252163680744754 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4236),
				new double[] { 0.118538983051258, 0.0357726525015589, 0.00328878869691503, 0.0274343361544977 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3501), new double[] { -0.0899518267467904, -0.000881067514702499,
				-0.00468770402322532, -0.00487884817524777 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3909),
				new double[] { 0.0185929626909524, 0.00631072080155527, 0.0360223461836626, 0.0115428143681616 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3128),
				new double[] { 0.0902918284206096, -0.115320774333798, 0.00823125185872554, 0.0203284866633859 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3157),
				new double[] { 0.111107601644598, 0.0497684270175131, -0.00285879690513262, -0.0107319370575822 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3934),
				new double[] { 0.0942448374636038, -0.123548404336684, 0.00683356898987981, 0.00569399769761484 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3030),
				new double[] { -0.0437446787648073, -0.0560048718453183, -0.000946618088113943, -0.0312000350069065 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4288),
				new double[] { -0.124493285477537, 0.00699172188010696, -0.0472999675551265, 0.0475969150298389 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3088),
				new double[] { 0.0885139370439881, -0.11635216018591, 0.00965963000588671, 0.00337788251475472 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3571),
				new double[] { -0.0875693262494293, 0.00819072691455625, 0.0381136108429645, 0.00567326287558949 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3658),
				new double[] { 0.11942123664298, 0.037935158241987, -0.0200385219301298, -0.0458999328879368 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3615),
				new double[] { -0.0945156138610974, 0.0047459860198135, -0.0312072137547684, 0.0197291248776511 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4126),
				new double[] { -0.11467970311839, 0.00700551971796646, 0.0207036643890548, 0.00262882482282306 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3717),
				new double[] { -0.0773560815192407, 0.0175130846479821, 0.0384207254222412, -0.00215239781420209 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4408),
				new double[] { -0.0882101763759768, 0.00514231304500522, 0.047255156503971, -0.00211069143294957 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4081),
				new double[] { 0.120382521165859, 0.0455261606126687, -0.00263888068724732, 0.0107068233464864 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3195),
				new double[] { 0.137116982534358, 0.032767982474758, -0.0061241093018492, -0.0153599352929995 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3679),
				new double[] { 0.116044591044635, 0.0440827309327196, -0.00410065850400334, -0.00953369456604757 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3575),
				new double[] { -0.0971430215954715, 0.00235460614613517, -0.0377869567590952, 0.018096533009776 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3482),
				new double[] { -0.0915619862818791, 0.0123021573314265, 0.0423037248910624, 0.000835677198790046 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3167),
				new double[] { 0.131164627095445, 0.0027433850810436, -0.00381943562135286, -0.0355688664326355 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3310),
				new double[] { 0.118297534021361, 0.0226731577181692, -0.00653465349318328, -0.0145098198600389 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3514),
				new double[] { -0.0924515323060431, 0.00208340353181126, 0.0340842706048463, -0.0464976778319371 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3826),
				new double[] { -0.0511843963982404, 0.0274510914512997, 0.0250975717191836, -2.12103749432053E-05 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3127),
				new double[] { 0.0889708747286802, -0.113483135862839, 0.00455562583864544, -0.0193767581366291 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4591),
				new double[] { -0.0955511164899711, 0.000695588273045575, 0.0171956498068056, 0.0130260239476613 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3835),
				new double[] { -0.085671045331787, 0.0110121664766192, 0.0391154876424763, 0.00795677543359089 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4345),
				new double[] { -0.120391563016672, 0.00424608704362437, -0.0426680106822314, 0.0434876434143791 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3459),
				new double[] { -0.0904317214423865, 0.00954126820977148, 0.00335901050600476, -0.00743890329106759 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4359),
				new double[] { -0.113070257122978, 0.00651520377329188, -0.0328855942356417, 0.0346560077279097 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4489),
				new double[] { 0.116087838648218, 0.0434091966317674, -0.00328617826934299, 0.00113304764019969 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3345),
				new double[] { -0.151822120231286, -0.00895423554363439, -0.125725036368389, -0.093315677155205 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3410),
				new double[] { -0.0807975447967795, 0.0156815323976141, 0.041005267404653, -0.0128699119107494 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3824),
				new double[] { -0.0963562338858722, 0.00133700177546683, 0.0392046435892748, -0.0412580118005244 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3431),
				new double[] { -0.124458750646666, 0.0010617522215311, -0.00993121096128786, -0.0467121541776643 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3836),
				new double[] { -0.0764402308285948, 0.0122375785222331, 0.0368707551149978, 0.0158539263763476 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3827),
				new double[] { -0.0915584747273179, 0.00979092820304842, 0.0489354575862417, -0.0113052815372295 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3372),
				new double[] { -0.127943657193844, 0.00210915370073153, -0.0953251223448727, -0.0495104091716034 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4125),
				new double[] { 0.00743381729752645, 0.0419935906896117, 0.0195195129005002, 0.0165563349818964 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3557),
				new double[] { -0.097091568881699, 0.00296699276395844, 0.0198838544493086, -0.037449637563735 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3326),
				new double[] { -0.100291721551286, 0.00767030227978576, -0.0473420373296641, 0.028795155089285 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3497),
				new double[] { -0.0808347276561714, 0.00508013576409358, 0.0182665533010385, -0.013922882411152 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3312),
				new double[] { 0.12212599700373, 0.0348540241357468, 0.00168172682075291, 0.0104587829190494 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3085),
				new double[] { 0.020698263974599, 0.00379454479482582, -0.0164673847608046, 0.0149288605092 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3846),
				new double[] { -0.101692868098646, 0.00545274096406798, -0.0116712257759597, 0.0205533494503864 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3871),
				new double[] { -0.107003623315117, 0.0028694786495259, -0.043053085570065, 0.0286671394287359 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4089),
				new double[] { 0.102243804428535, 0.0265623099105297, 0.00298685072879284, 0.0103689877747669 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3521),
				new double[] { -0.0977974299593858, 0.00440123632678948, -0.00794372024474583, -0.00345794627987893 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3401),
				new double[] { -0.112815330119734, 0.0040769352372682, -0.0460440820703286, 0.0282361682162371 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4005),
				new double[] { 0.115963062373729, 0.0327040860212576, -0.00284344798848938, 0.00457690775385093 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3261),
				new double[] { 0.126352293546315, 0.0301128943261328, -0.000893205684160896, 0.00715974265528428 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4379),
				new double[] { -0.0978010435561534, 0.00883150610470051, 0.0458898303952065, -0.0027876257012107 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3365),
				new double[] { -0.111761783989069, 0.00367642051848917, -0.0535626492184881, 0.0128642025078849 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4219),
				new double[] { 0.112103348245347, 0.0449993399135911, -0.00219691575873616, 0.019837923538593 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4145),
				new double[] { -0.0613181324885073, 0.0190821345026216, -0.00351689433220718, 0.0168957273232787 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3223),
				new double[] { 0.136524756175457, 0.0201614753363782, -0.00635478669157643, -0.0197082193280422 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3473),
				new double[] { -0.10811152554677, 0.0063790184867324, 0.000729949839894406, 0.00852889308999034 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3598),
				new double[] { -0.0961831206481886, 0.00536633786972145, 0.034205351021056, -0.0111885430057032 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3520),
				new double[] { -0.0868613336643077, 0.00377352127557459, -0.043755297956002, 0.00564099554616293 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3455),
				new double[] { -0.113184186944805, -0.00419820697780969, 0.0484571197028862, -0.0856528723949106 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3035),
				new double[] { -0.0140483369148493, -0.0575303384229993, 0.00519407228298037, -0.0289647350468983 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3930),
				new double[] { 0.132078633691705, 0.0490926859422079, -0.00734975862014153, -0.00749187614516992 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3666),
				new double[] { 0.135145698867635, 0.0310330740165126, -0.00427264647228892, -0.00311204901246277 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3048),
				new double[] { 0.0299216748434362, 0.0307273502030526, -0.0172870217512337, -0.000318998675859554 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4399),
				new double[] { -0.0928246914448, 0.0104071112248957, 0.0405622848426063, 0.00741399864401394 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4392),
				new double[] { -0.0982175173513618, 0.0124908334951298, 0.0321367899637229, 0.0113432284400363 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3685),
				new double[] { 0.0486806440812863, 0.0305133604904735, 0.0128911691095137, -0.0221876348897693 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3421),
				new double[] { -0.098113715260552, 0.00171809493525101, -0.0482546126504598, 0.0150320446521485 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3294),
				new double[] { 0.11545475712195, 0.0389030979165776, -0.00418663212049077, 0.00864379926695949 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3595),
				new double[] { -0.0977571988965349, 0.00704795581367847, 0.0410150431341139, -0.00675568335971887 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3060),
				new double[] { -0.0506387627930009, -0.0194648926730291, 0.00223490204301471, -0.00214791072167475 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3566),
				new double[] { -0.11392781070121, -0.00607319244384297, 0.028342074279847, -0.0851977057299435 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4241),
				new double[] { 0.115984146744301, 0.0505206111621391, 0.00724856539444134, 0.0282687780018595 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4161),
				new double[] { -0.0384080443207146, -0.0456801166166934, -0.00272387130363044, 0.00499933150742614 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4250),
				new double[] { 0.12012392800916, 0.0442863384904901, -0.0022593933168834, 0.0163635950404577 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3982),
				new double[] { 0.101777449928808, -0.127932591050485, 0.00429995512654033, -0.00511364571595205 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3220),
				new double[] { 0.117776312376014, 0.0338230007607945, -0.00454783028230451, -0.0229914262751411 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4415),
				new double[] { -0.0983534368673142, 0.0112508530878892, 0.0494150964427132, -0.00379221699015978 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3954),
				new double[] { 0.119033930318347, 0.0440901533593191, -0.00553605396307644, -0.00133662569006012 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3912),
				new double[] { 0.115091541402441, 0.046563223394022, -0.00245984712994633, 0.0130749890117022 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3842),
				new double[] { -0.100056500809278, 0.00752500313619075, 0.0491365763613571, -6.32049020213652E-05 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3078),
				new double[] { 0.0893503102649843, -0.117951406208335, 0.00200207437726281, 0.00880563202510923 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4463),
				new double[] { 0.114405851187495, 0.0369547263964925, -0.0130062654931939, -0.011046344240079 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4031),
				new double[] { 0.136459034234212, 0.0504085163465386, -0.00509363831608365, -0.00353285459373019 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3213),
				new double[] { 0.117664748231886, 0.0374912254361863, -0.00331947395771992, -0.00830240858395009 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3665),
				new double[] { 0.093926311756986, -0.0165320357428921, -0.021736639095554, -0.0585757819516634 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3593), new double[] { -0.0941216813259886, 0.00272728193269295,
				-0.000110215467856247, -2.66026761639563E-05 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3069),
				new double[] { 0.105683392718604, -0.0214870617808214, 0.00730669277929787, 0.0207578849087496 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3726),
				new double[] { -0.103885803307717, 0.000720929494775154, -0.00562319948965171, 0.000588688523376274 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3998),
				new double[] { 0.127245518584353, 0.0325434303131018, -0.0284621350961372, -0.065075714191695 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4521),
				new double[] { 0.116470106125881, 0.0429369782281793, 0.00112015758421023, 0.0168447981631473 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4277),
				new double[] { 0.121836255423023, 0.0434435373590973, -0.00230676402181059, 0.0118619552864647 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4454),
				new double[] { -0.095131643366096, 0.001901175249382, -0.00494205604810816, -0.0215366161959522 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3327),
				new double[] { -0.115584796131337, 0.00362267867847754, -0.0451992773683116, 0.0332828877073887 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4308),
				new double[] { -0.00236427990097297, 0.0415588803997247, 0.0446773557983269, 0.0158845616052972 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3056),
				new double[] { -0.0977794504235684, -0.00947882789858153, -0.0375333190286135, 0.0147842034841763 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4075),
				new double[] { 0.120265100248667, 0.0444033814332242, 2.71367281826694E-05, 0.0171467351438802 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4102),
				new double[] { -0.0912684702827345, 0.00567539599392193, 0.00310419519002851, 0.00989143513776456 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3168),
				new double[] { 0.123777058700912, 0.0128632914459084, -0.0158919841172876, -0.040401232135684 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4300),
				new double[] { -0.118124306644307, 0.00618440757936852, -0.0481957304291621, 0.0341590547833912 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4290),
				new double[] { -0.119073356385026, 0.00294292777483604, -0.0451869901056268, 0.0337716467793181 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3989),
				new double[] { 0.0900826824029462, -0.122282077917958, -0.0124258476520451, -0.0342947801418379 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3907),
				new double[] { 0.104638559737017, -0.00961804268757428, 0.0111862341356689, 0.0240656409283462 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3052),
				new double[] { -0.100598335421733, -0.0121898046078344, -0.0446053008893049, 0.00210826300603298 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4486),
				new double[] { 0.0873402545797428, -0.117139427585896, 0.00862236334035752, 0.0118034044139837 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4243),
				new double[] { 0.131995519381249, 0.0386244295189909, -0.0154513377941423, -0.0313835404736963 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3550),
				new double[] { -0.105212116390545, -0.000211153519004538, 0.015678001184945, -0.0802230005495899 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3304),
				new double[] { 0.113637061889911, 0.038115643899211, -0.0257267850798727, -0.0288280658713131 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3960),
				new double[] { -0.0617084257962789, 0.0143174749461577, 0.0357718483562224, -0.0014457988371974 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3050),
				new double[] { -0.115973214229908, -0.00248524088714973, -0.0531495950190395, 0.0120143774016517 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4576),
				new double[] { -0.118117516519129, 0.00496758333301943, -0.0414505718784509, 0.0384319474461556 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3126),
				new double[] { 0.0978420264612184, -0.0946017351810941, -0.00589935762365835, 0.00421806970123425 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3334),
				new double[] { -0.113702311551772, -0.000187887469307175, -0.0543387390143926, 0.0127856668939991 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4174),
				new double[] { 0.0866884577256873, -0.113509576346084, 0.00837086187560113, 0.0284085405905988 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3721),
				new double[] { -0.102407547304868, 0.00478424475371913, 0.0110568965341893, 0.0105475119615104 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3436),
				new double[] { -0.116767883808557, -0.00113948370600505, -0.0268032967007266, -0.0383864621569957 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3732),
				new double[] { -0.103359939680606, 0.000256711831897776, 0.0424682841783576, -0.0108516492880109 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4117),
				new double[] { -0.112158720489085, 0.00335054239088428, -0.0203818742998551, 0.0148029065107254 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4051),
				new double[] { 0.0879695741149431, -0.131953904062778, -0.00766077744785407, -0.0100297183117407 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3171),
				new double[] { 0.124202752831161, 0.0256600747716123, -0.013593324628241, -0.0282281457484709 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4423),
				new double[] { -0.0986456509539819, 0.00626382410226458, 0.0452518437630469, -0.0109996509150928 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3164),
				new double[] { 0.133709917441217, 0.0465331238756736, -0.0145206517271087, -0.041947524976502 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3629),
				new double[] { -0.111139526948362, 0.0016019145536485, -0.0387003329217239, 0.0264622241129033 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3092),
				new double[] { 0.107030367868072, -0.0275896377534467, -0.00214202723831104, -0.0177974761677593 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4438),
				new double[] { -0.0895932704004268, 0.0115460131185062, 0.0462321567318211, -0.00578340105208477 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3899),
				new double[] { 0.0865491738106675, 0.03776580201918, 0.0192460526116975, 0.021152956695171 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4525),
				new double[] { 0.115942481666674, 0.0465105057042884, -0.00219697567217569, 0.0114148354411139 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3745),
				new double[] { 0.115292235946872, 0.0439110925840648, 0.00227988554555414, 0.0106777874427937 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4427),
				new double[] { -0.0906008361602837, 0.0113107825874503, 0.0357961519721093, -0.00413062053763164 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3234),
				new double[] { 0.113284970562188, 0.0243976497008677, 0.0014582846740232, 0.0124897093319623 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3129),
				new double[] { 0.0832898482788798, -0.0859580462670891, 0.00799128687774434, -0.0198309918190887 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4127),
				new double[] { -0.110428859421194, 0.010642146534083, 0.00654337479281441, 0.0224562233802848 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4353),
				new double[] { -0.111945629826323, 0.00605003153013616, -0.0231027038912682, 0.0236140570844261 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3460),
				new double[] { -0.00655139818792862, 0.0311247639026041, 0.029647810334167, -0.0100242228274039 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3468),
				new double[] { -0.0948500072689212, 0.00469437578541709, -0.0109816397415859, 0.00824778952839923 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3383),
				new double[] { -0.136705665749592, -0.000265074857525541, -0.108122099159728, -0.0509752561777994 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3184),
				new double[] { 0.115748900082394, 0.0434128641733906, -0.00377394505362845, -0.00357812199181785 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3070),
				new double[] { 0.0912826529576203, -0.10703877731581, 0.0111142089486416, 0.0315030423607696 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3034),
				new double[] { -0.105322904606347, 0.0066474938543085, 0.0373942436430154, -0.0110023544295959 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3120),
				new double[] { 0.0792109331324115, -0.098414505382397, 0.000170274951411695, -0.0201858786036864 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3768),
				new double[] { 0.101436434682413, 0.05011702596622, 0.00358010250833116, 0.0181819110236758 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4165),
				new double[] { -0.0304437356693572, -0.0482443279383839, 2.61726778109881E-05, -0.00342393635299645 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3526),
				new double[] { -0.140507726807968, -0.0138400541689346, -0.105566593638276, -0.0914033071291626 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4383),
				new double[] { -0.0977790858043326, 0.0111955564507097, 0.048597904077883, 0.00519694023296849 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3154),
				new double[] { 0.118176480663806, 0.0385983692032275, -0.00378614872107714, -0.00616891439461664 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4326),
				new double[] { -0.116533421573915, 4.13513488129923E-05, -0.0430804655809363, 0.0199472910238393 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4585),
				new double[] { -0.104673107100931, 0.0056392286441839, -0.0392800715116179, 0.0328542762369288 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3838),
				new double[] { -0.0736074072163852, 0.014976722768993, 0.0400051913781439, 0.0058929236329699 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3376),
				new double[] { -0.116475337583489, 0.00457899518858491, -0.0542390148612465, 0.0195181308212555 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4450),
				new double[] { 0.118563628673775, 0.051704643180659, -0.00219524470549027, 0.00032480269946957 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3828),
				new double[] { -0.0961855425692859, 0.00710809924734707, 0.0266561391349082, 0.00349787319518521 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3870),
				new double[] { -0.119717247085747, -0.00353838222226405, -0.0882076362752459, -0.0351492502914478 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4200),
				new double[] { 0.0876450752951032, -0.104809619970628, 0.0144631369384385, 0.0407407567013815 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4496),
				new double[] { -0.0982032285805239, 0.0029127861369639, 0.0449477485517076, -0.00476097341554212 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3628),
				new double[] { -0.116163234833107, 0.00367610197041521, -0.0171954518960146, 0.025462471993495 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3180),
				new double[] { 0.0041887084583091, 0.036938107623879, 0.0402185423294362, -0.000173034133426942 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4012),
				new double[] { 0.111688401055302, 0.0379875593718592, -0.0121923040849328, -0.0247453346368425 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3102),
				new double[] { 0.111079693415346, -0.107064492264966, -0.0291680004825637, -0.0592461238953916 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3303),
				new double[] { 0.122952401941447, 0.037426497875304, -0.0269590493624846, -0.0400495499372591 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3146),
				new double[] { 0.128492391935506, 0.0437288910308782, -0.00153168794543711, -0.0088811730881962 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3442),
				new double[] { -0.0976759325089608, 0.00528614135763425, 0.0413850094423831, -0.0202741800637321 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4352),
				new double[] { -0.109491851355949, 0.000789811408541164, -0.0190977159155241, 0.0165766514692103 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4149),
				new double[] { -0.0976228590848826, 0.0144353817950041, 0.0266860365566227, 0.00687206165521669 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4227),
				new double[] { 0.109850661608396, 0.0481728648940637, -0.000995095615998703, 0.0256409805605891 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4458),
				new double[] { -0.089256815419719, 0.00123322167798868, 0.0352039523405454, -0.0243508152535036 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3448),
				new double[] { -0.108338072456414, 0.00568521871758112, -0.00366955107696738, -0.000400059029358432 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3976),
				new double[] { 0.0730463606624975, -0.0846484642224104, 0.0119723365113341, 0.0320193434041683 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3502),
				new double[] { -0.10616219484862, 0.00203299627765122, -0.0267984083407083, 0.0173785751147147 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4296),
				new double[] { -0.114241992979601, 0.00322822462125478, -0.0375812435808448, 0.0390957704312101 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4220),
				new double[] { 0.116616123054249, 0.0468940711699455, 0.000609661680008808, 0.0142368139455415 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3163),
				new double[] { -0.115475914901071, 0.00511236277547712, -0.0524728264459103, 0.0286749831338303 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3632),
				new double[] { -0.0985397425581135, 0.00932071511689553, 0.0228590180000598, 0.00933567441929239 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3109),
				new double[] { 0.0903669204572213, -0.11700502432591, 0.00741082900058982, 0.0201820213617839 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3170),
				new double[] { 0.138355622283763, 0.0407574945288411, -0.0185298573442376, -0.0327842023783476 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3599),
				new double[] { -0.0913415180257699, 0.00279543418145087, 0.0390442192856805, -0.0232742508834192 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4202),
				new double[] { 0.087810888295055, -0.109126159461683, 0.0164988195087563, 0.0401904080731321 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3423),
				new double[] { -0.10362502336915, 0.000816311827546121, 0.0454911940528239, -0.0516394557504511 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3451),
				new double[] { -0.0975133832799876, 0.0074902869918108, 0.0439609426188626, -0.0104720215444124 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3445),
				new double[] { -0.0964122607700689, 0.000571946561196423, 0.031826659988416, -0.0465990667737588 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3045),
				new double[] { -0.0234042250683659, -0.0286843319784627, -0.0157610395228274, -0.0372320079648438 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4542),
				new double[] { 0.114927858409136, 0.0432714019041944, -0.00241036676197571, 0.0105370848668909 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4333),
				new double[] { -0.115766006845298, 0.00551739987626106, -0.0455141885873316, 0.0383597567012248 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4355),
				new double[] { -0.114891847665571, 0.00551223564691949, -0.0355161097846969, 0.030435031977315 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3631),
				new double[] { -0.108480281136703, 0.00367220662971016, -0.0247480857386435, 0.0217127990997114 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4049),
				new double[] { 0.0978707722965701, -0.135027193545429, -0.0154819539675334, -0.0306786417724257 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4266),
				new double[] { 0.114791087137761, 0.0475963908059352, 0.00454765025892342, 0.0287250281418541 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4066),
				new double[] { -0.100588741996515, 0.00335432326225399, 0.0407036226702621, -0.00504635844366355 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4024),
				new double[] { 0.12242586619023, 0.0364856627420599, -0.00860962566073992, -0.0285680953693832 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3037),
				new double[] { -0.0997642161653682, -0.00590848711498817, -0.00719235889993059, -0.00287499167481834 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3618),
				new double[] { -0.0843830260716203, 0.0108467754791855, 0.0487945389930189, -0.00706718021412709 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3361),
				new double[] { -0.115856318327104, 0.00238341854171579, -0.0410595142820428, 0.0335161974826918 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4276),
				new double[] { 0.109013382861607, 0.0217481333163341, 0.00709640439529687, 0.00519183083170174 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3831),
				new double[] { -0.0965191556887766, -0.000189010885917775, 0.0248916036444499, -0.0313959848154036 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4004),
				new double[] { -0.0871127541618197, 0.00578081703535905, 0.0335280481164625, -0.0125740196504148 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3384),
				new double[] { -0.147076482777489, -0.00683284531933071, -0.109801062682355, -0.063358351262374 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3523),
				new double[] { -0.111177093495696, -0.00258446698023518, 0.045238764943864, -0.0499462782059266 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3233),
				new double[] { 0.128997328753609, 0.0201872619645134, -0.00602650401089943, -0.0168620219660541 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3795),
				new double[] { -0.0914927060885335, 0.00749105410987155, 0.00580583517136894, 0.0199991057827552 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3458),
				new double[] { -0.100205673041868, 0.00690881928500277, 0.0335578740956053, -0.0361499707834601 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4488),
				new double[] { 0.123514440355098, 0.0345072380047304, -0.0168533775070473, -0.0323620733952669 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4132),
				new double[] { -0.11036859488293, 0.00694107906726388, -0.0116611128330198, 0.0233418595491399 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4448),
				new double[] { -0.0611177634135029, 0.0200120314576653, 0.0365269219197475, -0.00703475073567886 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4129),
				new double[] { -0.0931825732007425, 0.00815408295413745, 0.00490508190299848, 0.0172274806097246 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3354),
				new double[] { -0.114912453191912, -0.000266221996748207, -0.0487044480361659, 0.0192919932882283 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3300),
				new double[] { 0.106518460378948, 0.0378430094637155, -0.000828085569982927, 0.0279759787452232 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4259),
				new double[] { 0.120943414390808, 0.0418369742020375, -0.00590610370511928, -0.00551371896579017 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4421),
				new double[] { -0.0948989135035548, 0.00744789387460509, 0.0458633510100984, -0.0102882682198316 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3906),
				new double[] { 0.124468703318274, 0.0336610760407728, -0.000354971912969169, 0.0172039268737312 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3465),
				new double[] { -0.0795432385155412, 0.00659091918820906, 0.030360202010423, -0.00995393321203439 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3165),
				new double[] { 0.12035013137041, -0.000868829392095136, -0.000775550902361786, -0.00281949015582789 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4317),
				new double[] { -0.116417322281247, -0.00176016756068131, -0.0370603980066389, -0.0107062846435968 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3388),
				new double[] { -0.0682015908337233, -0.027019106425649, -0.0301273570575776, -0.0724171393640747 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4042),
				new double[] { 0.102899464115557, -0.121023552132482, 0.00167913970502165, 0.000927091167816784 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3279),
				new double[] { 0.116291943166171, 0.037294931368137, -0.00187745622688229, 0.0245460738137289 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4413),
				new double[] { -0.0945138299015279, 0.00788064355659381, 0.0356061933088801, 0.00172711557085993 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3773),
				new double[] { -0.0951448400787324, 0.00189697681378127, -0.00447042195722386, 0.00842623336940975 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3051),
				new double[] { 0.117602165452583, 0.027920525386909, 0.00588077083935934, 0.017590160350299 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3801),
				new double[] { -0.113130055424367, 0.00530678321042711, -0.018370485126968, 0.0294242614471865 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3357),
				new double[] { -0.114188430372995, 0.00486551082583655, -0.042636877911423, 0.0327259101642775 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3286),
				new double[] { 0.123902582083985, 0.032447282278448, -0.00980699048913034, -0.00971528595668865 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3198),
				new double[] { 0.121173052739123, 0.0336903231223843, -0.00348304320204293, -0.0246792641549373 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3697),
				new double[] { -0.0997691760854186, 0.00588297693566824, 0.047485329646763, -0.012612044782667 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4094),
				new double[] { -0.114858876540441, -0.00345188412135542, -0.0517575608394209, -0.000262215350331675 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4534),
				new double[] { 0.135345778296701, 0.0121513303824017, -0.0302673571542634, -0.0801871964955205 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3080),
				new double[] { 0.10382932572504, -0.134140818968209, 0.0072160691120151, -0.0195298222758906 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4517),
				new double[] { 0.0868981588324236, -0.0793137560783556, -5.31429418818826E-05, -0.00232201808555477 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4527),
				new double[] { 0.110338137992869, 0.0416798038849048, 0.000687120072286075, 0.000722004875931976 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3881),
				new double[] { -0.0785094078438617, 0.0088590031176229, 0.025211360038469, 0.0115330281577543 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4592),
				new double[] { 0.0832916285884555, -0.105501707344665, 0.00600016238932691, 0.0316226457646122 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3968),
				new double[] { -0.0935580638208583, 0.00573076910906404, 0.0454954111088331, -0.00174701350714426 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3843),
				new double[] { -0.0999682290718455, 0.00631809245814467, 0.0437020944780618, -0.000366805261433001 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3785),
				new double[] { 0.111398941976433, 0.0432330814966728, -0.00181076549762702, 0.0155405710280777 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4453),
				new double[] { -0.109019504777052, 0.00117946701135459, -0.0503772164816561, 0.0148979079407678 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3643),
				new double[] { 0.090856005966088, 0.0477698827698514, -0.0127663317664407, 0.00975062067544507 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4540),
				new double[] { 0.0857950844229252, 0.0521382844485945, -0.0293279183819613, 0.00540342271121582 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3825),
				new double[] { -0.0638956203411295, 0.0102432580133351, 0.0412258899248559, -0.00292965584256506 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3390),
				new double[] { -0.116418874746451, 0.0041076611288763, -0.0458275290831526, 0.0300389074459004 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3840),
				new double[] { -0.0703624761998878, 0.0229144493722432, 0.0477944910478207, 0.00576751661762809 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4381),
				new double[] { -0.102425265599596, 0.00878193500093966, 0.0479800454479676, -0.00207920467718295 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3404),
				new double[] { 0.116700115433992, 0.0368296123159183, -0.0137401311248176, -0.0280740572095076 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3674),
				new double[] { 0.118321716824426, 0.0497673814386575, -0.000749848764103703, 0.0266136281143203 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4373),
				new double[] { -0.0925170340958376, 0.00730493740309533, 0.0358838271251923, 0.00202150511695888 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3399),
				new double[] { -0.0859309813962641, 0.0151769332332208, -0.0549010450393479, 0.0305012124132535 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4460),
				new double[] { -0.00500652772979185, -0.021742218312584, -0.0548006950563481, -0.052539938070414 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3528),
				new double[] { -0.0894959259823986, 0.00678270592235916, 0.032966413242923, -0.0121244264438301 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3980),
				new double[] { 0.0822921773464426, -0.100125598334299, 0.00863273799394849, 0.0190255525999125 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4245),
				new double[] { 0.113885314498794, 0.0460350208467335, -0.000176425321414612, 0.0171327025866836 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4195),
				new double[] { 0.092403018227236, -0.098772332176146, 0.011299658494926, 0.0205035715461443 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3949),
				new double[] { 0.12853331933756, 0.0376016493100279, -0.00812442268956724, 0.00162127800108249 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3807),
				new double[] { -0.0951647258651618, 0.00623855762539768, 0.0490724442178553, -0.00588594499925781 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3623),
				new double[] { -0.0935168410274387, 0.00609483836745427, 0.00707417010780805, 0.01187722762857 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4435),
				new double[] { -0.0920023484335801, 0.00605243972964644, 0.0427617590958983, 0.00609547029986857 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3218),
				new double[] { 0.101564183847952, 0.00294223922950117, -0.0219744139954096, -0.0148055637600946 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3613),
				new double[] { -0.0774514719618285, 0.0143430182296909, 0.0436540690965965, -0.00771419288065789 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4150),
				new double[] { 0.0953175094086776, -0.0312005264129898, 0.00984418092889171, 0.0248977737816356 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4544),
				new double[] { 0.0499940290172697, 0.0450254232341455, 0.0209935575098302, 0.0186149139139146 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4380),
				new double[] { -0.0959266480371597, 0.00708559994929642, 0.0443256445592376, -0.00331091867162657 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4025),
				new double[] { 0.116262575132088, 0.0400387041261455, -0.00709269908972753, -0.0123218240559399 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3044),
				new double[] { 0.0174975899468472, -0.0756416507950142, -0.00118820180332985, -0.00105050013233494 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3533),
				new double[] { -0.100092367134124, 0.00226993288398549, 0.0278469312612403, -0.0484057332197677 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3687),
				new double[] { 0.113356143367378, 0.0453012711656978, -0.0019476862441348, -0.00234587917728142 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3047),
				new double[] { -0.0443813017168895, -0.0482217495457386, -0.00642521966493315, -0.0297496423461836 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3343),
				new double[] { -0.131503301084749, -0.00604979335406479, -0.0987683321411877, -0.037273565250328 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4130),
				new double[] { -0.103667234235769, 0.0122034334838299, -0.0146136408045039, 0.0262226141540198 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4286),
				new double[] { -0.11704072433769, -0.000140088618406167, -0.0395129311460352, 0.0334140466927078 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3602),
				new double[] { 0.119412493681756, 0.048807277537932, 0.00166912444722615, 0.0146588286834083 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4550),
				new double[] { 0.105829323112137, 0.0447922129808564, -0.00122163727455326, 0.0250131394359014 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4231),
				new double[] { 0.0990874526151363, 0.0437264517437013, 0.00398661115338441, 0.0279418567284868 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3537),
				new double[] { -0.0923007297259556, 0.00631368135693692, 0.0340408279494432, -0.0301349484449118 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3422),
				new double[] { -0.0874755450555262, 0.00817610331746071, 0.00111298628282916, 0.0131225085650673 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4180),
				new double[] { 0.0837880615662818, -0.108004846124383, 0.0140812128654255, 0.0508120532409861 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3219),
				new double[] { 0.12341861465675, 0.03733744841446, -0.0102035708734347, -0.0225354244353518 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3866),
				new double[] { -0.0353265199034637, -0.0241859594078598, -0.0021484785241902, 0.00642728895851588 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4396),
				new double[] { -0.0755664421563633, -0.00312052327342243, 0.0406162482568875, 0.0150903239148489 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3282),
				new double[] { 0.111490600003143, 0.0505094015355806, 0.00482035144219255, 0.0308236257286903 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3204),
				new double[] { 0.111363197222711, 0.0374570103701265, 0.00446067625130774, 0.00284406727109902 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4205),
				new double[] { 0.0841472619240162, -0.0797893578487205, 0.0242352981602181, 0.0352371256914102 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3544),
				new double[] { -0.0917195479686648, 0.00463908584387542, 0.0345343061781799, -0.0214377963098762 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3094),
				new double[] { 0.091345139376339, -0.12137260915052, -0.004962332137392, -0.0046194564873834 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3777),
				new double[] { 0.112591731378636, 0.0431062280575332, 0.00338500265887121, 0.0222621379259117 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4120),
				new double[] { -0.110947243185932, 0.00438430911222334, -0.00847024730070266, 0.0185283811561407 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3573),
				new double[] { -0.10326802038022, 0.00183454914001688, 0.0313965934382711, 0.00125534614445681 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3150),
				new double[] { 0.121288438715018, 0.0430081106203182, -0.00103559743942224, -0.00435297224551139 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3943),
				new double[] { 0.123669458538786, 0.0160233559536643, -0.017539006925439, -0.0255752387548024 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3931),
				new double[] { 0.100267316674724, -0.125698652727399, 0.00013096598850661, -0.000951311564988481 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3062),
				new double[] { -0.0670058148863489, -0.0246031565406598, -0.021913545660113, -0.0142359693945697 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3307),
				new double[] { 0.123460066072508, 0.0315182287961587, -0.0166560289586652, -0.034010472201312 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3486),
				new double[] { -0.08931155176464, -0.0111554874763718, -0.0230070322795829, 0.0121319295468372 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4099),
				new double[] { -0.0948122390734947, 0.00702169745965724, 0.0508128119905068, 0.00234424881638365 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3630),
				new double[] { -0.108693301474874, 0.000187766214894498, -0.0332626397412721, 0.0228585897095882 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3480),
				new double[] { -0.0885173592639063, 0.00629253772862596, 0.00239404075199878, 0.00949233224478289 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4512),
				new double[] { 0.0642246000675112, -0.111826750686693, -0.00590932426129907, -0.0231010401842081 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4074),
				new double[] { 0.118297794595578, 0.0476353792691459, -0.00180265636109665, 0.0131807009218312 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4189),
				new double[] { 0.0877192991158633, -0.114403175545361, -0.00101658413001644, 0.0121251328387907 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3977),
				new double[] { 0.0827175499722453, -0.09313727524982, 0.000523632124731002, -0.039795321370478 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3449),
				new double[] { -0.0922568179535298, 0.00705909441936944, 0.0438024307360468, -0.00806036226701503 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3379),
				new double[] { -0.154797038878802, -0.0073478398330757, -0.130000497239702, -0.0867663559428754 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4503),
				new double[] { 0.109424985453409, 0.0529210618975173, -0.0135506276427503, -0.00165223147283357 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3260),
				new double[] { 0.124920238089055, 0.0278621127247911, 0.000783770018537678, 0.00396076708255062 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4417),
				new double[] { -0.0965525236616853, 0.0125158775550692, 0.0492446983708717, 0.00185247032624586 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4106),
				new double[] { -0.0996701554461998, 0.0116565642045711, 0.0286113222995542, 0.0146595577972887 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4110),
				new double[] { -0.105157505518122, 0.00871780195309661, 0.0110337097483154, 0.0211998235749025 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3922),
				new double[] { 0.102691011755493, -0.0913078209712793, -0.0162588768742071, -0.0384055753833233 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4339),
				new double[] { -0.114553328710509, 0.00224969310278002, -0.0443430422158941, 0.0294673174542458 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4267),
				new double[] { 0.117712380493758, 0.044432648009557, 0.00559514396865142, 0.02144721955364 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3747),
				new double[] { 0.123415117961599, 0.0248499473303254, -0.00990490220739933, -0.0172360759928024 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3369),
				new double[] { -0.116091215670726, 0.00217782639852282, -0.0615394611705315, 0.00674695040040749 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4287),
				new double[] { -0.124380287642858, 0.00578117187219749, -0.0446378931024937, 0.0479452577549652 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4246),
				new double[] { 0.106617708844261, 0.0495012650678965, 0.00477362199135813, 0.0201483376388539 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3752),
				new double[] { 0.114305471628699, 0.0449557299083477, -0.000321620671305143, -0.00370678512727009 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3864),
				new double[] { -0.0855722317007057, 0.00605680164915306, 0.0151220387428086, -0.000397987862219589 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4556),
				new double[] { -0.0712569218006157, -0.0274996629367886, -0.00693593235533242, 0.0280998255514384 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3392),
				new double[] { -0.111933518477219, 0.00277613185188149, -0.0395544260476473, 0.0223966892538929 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4511),
				new double[] { 0.0954786557492194, -0.129808451671705, -0.00959120067288118, -0.037514109313026 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4307),
				new double[] { -0.112878424485818, 0.00516186132228837, -0.0381014217091776, 0.0376978316081948 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3499),
				new double[] { -0.0762101842032111, 0.00663852436054517, 0.0181228242682258, -0.00608119540232286 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3274),
				new double[] { 0.125032074900109, 0.0421155755591633, -0.00217046176390217, -0.00778819479456142 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4073),
				new double[] { 0.132614231029681, 0.0386812418301453, -0.0001044929072493, 0.00715146822795846 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3920),
				new double[] { 0.0917982706733922, -0.106423855566713, 0.00540671684751841, 0.0234856399595572 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4378),
				new double[] { -0.0988641494271758, 0.00638581743998642, 0.044467756209526, 0.00626766298171736 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3181),
				new double[] { 0.11464318710905, 0.0448411841423654, -0.00154930650800772, -0.0257190636528952 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3104),
				new double[] { 0.083643981159696, -0.100198998835484, 0.00901031369477921, 0.000174530583067542 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3600),
				new double[] { -0.0952822030396083, -0.00918874970894042, 0.00867094769297101, -0.0280010767393757 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3981),
				new double[] { 0.0866167355639066, -0.127962636530649, -0.0109609635353465, -0.0233502058288487 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4226),
				new double[] { 0.107119999495401, 0.053812878510428, -0.00180157131076763, 0.0150280591994324 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3110),
				new double[] { 0.097616411342816, -0.115164097344453, 0.000878132070156438, -0.00493258916916824 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3723),
				new double[] { -0.0892818263708546, 0.0022527337154793, 0.0370578091741557, 0.00312304047025764 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4364),
				new double[] { -0.111531619576553, -0.00197425236981615, -0.0433525943858092, 0.0208649035853302 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4410),
				new double[] { -0.0962956087461085, 0.00803528155937818, 0.0336199599365653, -0.000706469671016732 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3288),
				new double[] { 0.122844656338163, 0.0225637657141238, -0.00952550473639131, -0.0261659276225432 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3122),
				new double[] { 0.112304027562578, 0.0327648592211549, 0.00468169687979188, 0.0198202970811756 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3782),
				new double[] { 0.106096469308992, 0.047375309059227, 0.00734507149565387, 0.0230775291984166 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3508),
				new double[] { -0.0962657390745882, 0.00778465146087334, 0.0373314200681485, -0.0261713385935298 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3140),
				new double[] { 0.129668036200164, 0.0419382951888439, -0.0180432330662139, -0.0417907352805722 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3454),
				new double[] { -0.0992308582422396, 0.00623547738244509, 0.0228428710610573, -0.00239735778584922 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4340),
				new double[] { -0.103165646892053, 0.0118589093985024, -0.0475415163164274, 0.0394465982153242 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3686),
				new double[] { 0.11883258807528, 0.000747283821093785, 0.00416704640432129, 0.00690606591783795 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3671),
				new double[] { 0.0995923892244177, -0.0218212698209311, -0.000201337367560062, -0.0340891160951015 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4303),
				new double[] { -0.116168095347382, 0.00629799595011634, -0.0435383321877754, 0.0399912561664554 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4437),
				new double[] { -0.0960361334451033, 0.00972770540001735, 0.0482801311697111, 0.00142548313437424 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3853),
				new double[] { -0.100199240665935, 0.00846761167770037, 0.047749715515238, 0.00236815210353269 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4162),
				new double[] { -0.0521674063304241, -0.0264471693103122, 0.00143142863470391, 0.018250718457402 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4384),
				new double[] { -0.0978743869719016, 0.0108208115456119, 0.0510004923806367, 0.00697763530845718 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3206),
				new double[] { 0.119465390417099, 0.0417864023806075, -0.00671952478493991, -0.00978054659804015 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4494),
				new double[] { -0.102262366353404, 0.00742716167121166, 0.0426512848654596, -0.0144621515071637 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3214),
				new double[] { 0.108345718568318, 0.00851432513451253, -0.006213760146885, 0.0113685081730423 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3397),
				new double[] { -0.10568393068006, 0.00532365154523913, -0.0463367893974615, 0.0247415693728629 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3875),
				new double[] { -0.106297064794269, 0.0104563110400177, 0.00672767606984585, 0.0204348621465359 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3917),
				new double[] { 0.10008421758215, -0.130156587361786, -8.12733181157072E-05, -0.000815181692879971 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4242),
				new double[] { 0.122301492830429, 0.0443864455318028, -0.00536875780745621, 0.00693717848302887 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3788),
				new double[] { 0.11902030700332, 0.038461287984917, -0.0028031853176915, -0.00168205421713848 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3443),
				new double[] { 0.0440631286515102, -0.0516372905352697, 0.0172575138011496, 0.00631805935989729 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3988),
				new double[] { 0.0915268222544726, -0.124037009749869, 0.00341885583418083, -0.0106382445807844 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4044),
				new double[] { 0.0989530913320192, -0.131662289408312, -0.00753152777872636, -0.0335917270114484 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4084),
				new double[] { 0.117160333476369, 0.0374351887045695, -0.00449865033684884, 0.000246739250114413 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4057),
				new double[] { 0.136610289575602, 0.015902928262238, -0.0127286907512507, -0.0267908624652102 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4299),
				new double[] { -0.10944812043272, 0.00432606016666913, -0.0360482319440909, 0.0319139935954742 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4529),
				new double[] { 0.075401928034441, 0.0448393162897143, 0.00701037482162667, 0.0127979627566342 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4109),
				new double[] { -0.0882988771744485, 0.0115466808619091, 0.0142129921064122, 0.0226825298131147 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3506),
				new double[] { -0.0950778146057611, 0.00180886131900915, 0.0379355627255441, -0.0209604892268178 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3267),
				new double[] { 0.120012552121356, 0.0400574146430221, -0.00408118850681114, -0.00882928996137313 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3064),
				new double[] { -0.0468864158021524, -0.0267718897998635, -0.0154788035515122, -0.0497813114042699 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3444),
				new double[] { -0.0987499814100917, 0.00411947121232992, 0.0363553443428607, -0.0291752815683948 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3117),
				new double[] { 0.0829870593856265, -0.117509717499213, -0.00464721799532255, 0.0051143768138916 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4284),
				new double[] { 0.112161251786787, 0.0519058228722894, -0.00152403927317198, 0.0111010006869394 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3891),
				new double[] { 0.0625644867905638, 0.0450345045117758, -0.00780687529476749, 0.00659486213826202 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3704),
				new double[] { -0.0694154948159517, 0.011958517860106, 0.0445066310090842, -0.0467214549252673 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4233),
				new double[] { 0.108077629729342, 0.0546702590490421, 0.0062922964862573, 0.0312714150198592 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3549),
				new double[] { -0.0879649448040559, 0.0012465285527307, 0.0298069319473474, -0.0231584289315804 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3945),
				new double[] { 0.124478030438634, 0.0175940454688143, 0.0024749715638701, 0.0176843279144004 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3026),
				new double[] { -0.121353297452146, -0.00241078956946271, -0.0567214399967946, 0.0181636359512781 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3063),
				new double[] { -0.0823219011503767, -0.0188410781734563, -0.030683708763542, 0.00496307757748293 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3221),
				new double[] { 0.126289722849825, 0.0319553769461237, -0.000451147179174663, -0.00595282359309715 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3901),
				new double[] { 0.118376207114368, 0.0308660298998338, 0.00786973640339365, 0.0201671353066524 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3786),
				new double[] { 0.110368870548197, 0.0535052905131395, 0.00261429756857606, 0.0195573830449819 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4397),
				new double[] { -0.0957751961620217, 0.00859639882528856, 0.0504840299673052, 0.00663060706707668 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3532),
				new double[] { -0.100537027450859, -0.000839041340004531, -0.010706667056073, -0.116142086233343 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3556),
				new double[] { -0.0857975998452968, 0.00918350376710836, 0.0365339699418239, -0.00141806228409127 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3959),
				new double[] { -0.103929598482973, -8.35952389375602E-05, -0.0372189599828397, 0.0277138394195347 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3373),
				new double[] { -0.141162851559046, -0.00930568279166355, -0.112299531399208, -0.0826749042171201 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4402),
				new double[] { -0.0860306988891831, 0.0111361871280982, 0.0452696261117694, 0.0110991375888614 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3817),
				new double[] { -0.0883808422463595, 0.0112599957929947, 0.0486992798967935, -0.00185204439540785 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3412),
				new double[] { -0.0956771974760325, 0.000591053145355401, 0.0269797202027249, -0.0363598373507164 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3798),
				new double[] { 0.0286069602491561, 0.0408352427111907, 0.0279845515032244, 0.0159285519319856 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4048),
				new double[] { 0.0858120160266485, -0.0939534354187445, 0.00355860207162359, -0.0335737947144975 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3667),
				new double[] { 0.115392069180934, 0.0456056788983664, -0.0112359689138858, -0.00574524124949452 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3098),
				new double[] { 0.0801277833559616, -0.107099619746913, 0.00468737613030564, -0.000162365803100376 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3845),
				new double[] { -0.0730720995827847, -0.0243141567628918, -0.0061343038896362, 0.026554376563249 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3350),
				new double[] { -0.114057112941161, 0.000481638956307569, -0.0589372914761117, 0.000914589086622732 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4002),
				new double[] { 0.118662334965834, 0.0258134638702886, -0.00358995635184624, 0.0109188982851437 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3682),
				new double[] { 0.125673642616672, 0.0422893057484786, -0.0130799956861703, -0.0161510805538565 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3095),
				new double[] { 0.0940545144144241, -0.116357554342673, 0.00614652487563417, -0.0124961824844408 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3538),
				new double[] { -0.101515199891718, 0.00196144394710074, 0.0457216011337693, -0.0427792716103942 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3241),
				new double[] { 0.118467184416004, 0.0454933990314847, 0.00160294077340564, 0.0218954835639727 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4412),
				new double[] { -0.0993024424241789, 0.00959849448365923, 0.046778282100222, -0.00650343730785539 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3143),
				new double[] { 0.129236296399308, 0.0411329198677999, -0.00894478182476686, -0.0367268513008256 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3174),
				new double[] { 0.119035688133329, 0.0294489727761094, -0.00753398130720213, -0.0104765368031087 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4166),
				new double[] { -0.0548424667454455, -0.0247777887422066, 0.00333811040560335, 0.0291865959750038 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4405),
				new double[] { -0.103608084698882, 0.00111994986876617, 0.0512784926205372, -0.0284842902557413 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3776),
				new double[] { 0.114872818828264, 0.0282030884546654, 0.00350763939601834, 0.0183547780032683 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3496),
				new double[] { -0.0859230346701621, 0.00896344918098834, 0.0384905253236402, 0.00356422917111298 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4283),
				new double[] { 0.109915349239432, 0.0463832998799342, -0.00355153784005695, 0.00434887637470858 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3087),
				new double[] { 0.108659941455537, -0.129608717423371, 0.00130185657356416, -0.0362442527878773 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3718),
				new double[] { -0.0902262930390433, 0.0130683872535793, 0.0412262822474012, -0.0122228667459163 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4552),
				new double[] { 0.135344144426272, 0.0170474903806571, -0.0119907152496993, -0.0294269235573365 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3067),
				new double[] { 0.0263287177889368, -0.0925547787037845, -0.00285830346304469, 0.0077367808879274 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3529),
				new double[] { -0.0985410112922322, 0.00318095170996908, 0.0405773295436825, -0.00292295083237318 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3363),
				new double[] { -0.115430109943268, 0.00536447757120698, -0.0340146180579138, 0.0333053321139084 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3744),
				new double[] { 0.118400956988986, 0.0206290647877743, -0.00851585291071367, -0.0178470310664631 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3393),
				new double[] { -0.114872327570189, 0.00363423762743414, -0.049011382587985, 0.0290225714045862 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3763),
				new double[] { 0.119558991379609, 0.0460478908977792, 0.00432684931754918, 0.0211818334999168 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4052),
				new double[] { 0.103789376111814, -0.138677796985842, -0.00980627649876014, -0.035261960339323 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4118),
				new double[] { 0.116010602118412, 0.0341963876225343, -0.00198952562906556, 0.00488692949781398 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3033),
				new double[] { 0.137471612258065, 0.0241701646512658, -0.0106230290440749, -0.0310875667494967 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4414),
				new double[] { -0.100536263744252, 0.0105435912547716, 0.0463266457619098, 0.000273960141787185 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4278),
				new double[] { 0.111304697267278, 0.0503264852441099, -0.000339982637781587, 0.0131273904659402 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3318),
				new double[] { 0.121363067396123, 0.0282015053573341, -0.00162686078205153, 0.0236151350766219 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4368),
				new double[] { -0.0978649143063172, 0.00970174212903962, 0.0365387690748069, 0.00146901081463899 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4545),
				new double[] { -0.0119707398366161, 0.0345616220495907, 0.0383631519233096, 0.0123272921472527 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3577),
				new double[] { -0.104159789336341, 0.00804964842217356, 0.0239098731514726, -0.00135585254729586 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4154),
				new double[] { -0.0988407832192461, 0.00574067886428046, 0.00553635492074552, -0.0182701870459151 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4475),
				new double[] { -0.0957376784748795, 0.0104996958832437, 0.0437573512710047, -0.0213207537894826 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4291),
				new double[] { -0.113588911853733, 0.00353933034080221, -0.0306889270941912, 0.0337316237579088 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3494),
				new double[] { -0.0869298125776113, 0.00488360415870331, 0.0341972533415007, -0.0128975181469049 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3270),
				new double[] { 0.121574334171578, 0.0408440800244403, -0.00535940951837072, -0.0144574864122392 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4400),
				new double[] { -0.0971348001204661, 0.00660644913202983, 0.0471948411500276, 0.00825230171783739 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3815),
				new double[] { -0.0956330244666193, 0.00850089066989305, 0.0341138467701165, 0.00576266514882736 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3489),
				new double[] { -0.00675415299094832, 0.0355579890159873, 0.0234489819697993, -0.00368123869086201 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4196),
				new double[] { 0.0890055074577423, -0.105867476410689, 0.00100468236556482, 0.0158436104881353 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3519),
				new double[] { 0.112435164797696, 0.0472460046390415, -0.00729890062840683, -0.00609193402037239 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3229),
				new double[] { 0.11411703067511, 0.0157269481349597, 0.00145523345584719, 0.0134436340904374 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4076),
				new double[] { 0.116632471585847, 0.0446455973502772, -0.00266982073197812, 0.00339033283760724 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3673),
				new double[] { 0.128672764496594, 0.0474218350109439, -0.00299297353671237, -0.00766188829571288 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3966),
				new double[] { -0.0938502337605798, 0.00305285918028451, 0.045884327739516, -0.00690122750083688 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4569),
				new double[] { -0.0901902525830518, 0.0118634542803516, 0.0136497598148883, 0.00944769123820616 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3119),
				new double[] { 0.00690173327191594, -0.047783511029972, -0.0698265070795971, -0.0847038490283839 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4280),
				new double[] { 0.129359770345255, 0.0510969140785433, -0.00111223169106551, 0.0133613155647324 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4348),
				new double[] { -0.0963359733047337, 0.00569929430270966, -0.0334681520450774, 0.0355866879307997 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4086),
				new double[] { 0.11606787701258, 0.0412158444130095, -0.00085102435179331, 0.00249003477329018 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3199),
				new double[] { 0.110872802276922, 0.0446208595308822, 0.00285242641629994, 0.0103269993314206 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3848),
				new double[] { -0.0920972807279737, 0.00613165891230508, 0.0352841119028208, 0.00176399492368083 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4312),
				new double[] { -0.115736836848613, 0.00198972748607103, -0.0530539050885527, 0.0166473836721634 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3808),
				new double[] { -0.0914000159791605, 0.00803129641980503, 0.0354252012411866, 0.00562696674198239 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4159),
				new double[] { -0.0509404942508678, -0.0275976718132833, 0.0015676961469044, 0.0205676672248285 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3216),
				new double[] { 0.124350187537256, 0.0414149769095137, -0.00837200916162027, -0.0323805577434955 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3592),
				new double[] { -0.09583380929549, 0.00278708250908486, 0.00951255619909229, 0.00488765042826003 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4442),
				new double[] { -0.10424275026711, 0.00470861326947556, 0.0482346644258849, -0.0287610050546968 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4169),
				new double[] { 0.0888650234464074, -0.113479638021583, 0.00998916193921885, 0.0318993606139905 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4580),
				new double[] { 0.11134556712846, 0.0223585890291728, 0.00226449843636931, 0.0286293232569555 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3472),
				new double[] { -0.0943688123187818, 0.00367243658542633, -0.00485163492131974, 0.00421338613465596 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3256),
				new double[] { 0.117906765735731, 0.0499431248123117, -0.00614951219966777, -0.00142055897302392 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3898),
				new double[] { 0.111488346783244, -0.00146815475383886, -0.00479792772559903, -0.0174535362317942 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4008),
				new double[] { 0.118511050983365, 0.0388911270163938, -0.0114262466736543, -0.0270475793587252 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3669),
				new double[] { 0.105585715076595, 0.0492518899621959, 0.0064209271287464, 0.0154207097348268 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3479),
				new double[] { -0.0913024195056861, 0.00537381507683841, 0.0316698875217228, -0.00369723331428031 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4124),
				new double[] { -0.0943240602352358, 0.0101572890510397, -0.0198235233220388, 0.0185397142755055 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4407),
				new double[] { -0.0969689964132261, 0.0065483560810902, 0.0467420510551951, -0.00139977684300556 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4030),
				new double[] { 0.117698203159731, -0.0264098353009484, 0.00113323402239025, -0.00848223734048002 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4140),
				new double[] { -0.03802768130345, -0.0352861691564051, 0.0190123472051655, 0.0232852948436881 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3902),
				new double[] { 0.116045695414542, 0.0535295602545162, -0.00131270841384835, 0.0191496697886389 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4070),
				new double[] { -0.1037183584986, -0.00111163342633497, 0.000720557610833678, -0.000546607235708219 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3878),
				new double[] { -0.0611017843868597, 0.0182683899074297, -0.0378800168366966, 0.0380807902950511 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3450),
				new double[] { -0.108129299731584, 0.000368942216800499, 0.00493905211219778, -0.0994950192367459 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4078),
				new double[] { 0.106222812661002, -0.00708774056052239, -0.0042220234988466, 0.0176058003287089 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3797),
				new double[] { -0.103254016322496, 0.000550395395682917, -0.0175923804530646, 0.0117458776996981 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3806),
				new double[] { -0.0943598700220536, 0.00448792759804838, 0.00255157235783589, 0.00963835343124159 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3708),
				new double[] { -0.0911781600058178, 0.0126640620835718, 0.0472902798043514, 0.00715201449110504 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4306),
				new double[] { -0.115331416146538, 0.0055166397003532, -0.0327917564067853, 0.035019653453553 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4258),
				new double[] { 0.126731580566881, 0.0387109265020866, 0.00198647800417322, 0.0156736862282026 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3073),
				new double[] { 0.0520760512256306, -0.112952565133599, -0.00313515008661733, -0.0132543645327971 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3299),
				new double[] { -0.00275705763655097, -0.0192977357660457, -0.03773269502971, 0.00205379313368222 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3484),
				new double[] { -0.0759795195178676, 0.00981927953781055, 0.0185807943911886, 0.00367162418526857 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3490),
				new double[] { -0.103697717429381, 0.0105899526507508, 0.00870766395646318, 0.0110853373723791 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3964),
				new double[] { -0.0978587926145071, 0.00455393272218159, 0.0326895672982025, -0.0126731521625294 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4260),
				new double[] { 0.120058674163301, 0.0448285383580344, -0.00382998824855545, -0.00546961128476878 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3253),
				new double[] { 0.121494906901065, 0.0388946543961091, -0.00995547976316272, -0.0171241223295878 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4152),
				new double[] { -0.107213058885389, -0.00488688599316607, -0.00310893156010956, -0.0312505033944651 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3645),
				new double[] { -0.0939160802553259, 0.00638196440373, 0.0451324178469674, 0.00472743239701147 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3441),
				new double[] { -0.0935147351815055, 0.00372358644514621, 0.0341552405571088, -0.0364517761163046 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3714),
				new double[] { -0.0709090540956506, 0.01606177591662, 0.049912390671971, 0.00433626966109316 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4579),
				new double[] { -0.0325715150365217, -0.0263900247032961, 0.0028758733852272, 0.0166338747520185 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4314),
				new double[] { -0.117041656629286, -0.00100260332050041, -0.048030252388821, 0.0207429037301459 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3913),
				new double[] { 0.103062139751685, -0.100781057616533, 0.00621886989806775, 0.0368047974922611 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4239),
				new double[] { 0.111603994421199, 0.0490095964728845, 0.00287468353936219, 0.033751958063009 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4404),
				new double[] { -0.0987618470124332, 0.00756812319666849, 0.0323709415165666, 0.00559749601062617 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3750),
				new double[] { 0.112472319906871, 0.0429552746672425, 0.002331067298002, 0.0220848009820045 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3189),
				new double[] { 0.108442493001104, 0.038625323133908, -0.001672037415911, -0.023129954973689 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3242),
				new double[] { 0.121368608281463, 0.0326667430219404, -0.00483268381455127, 0.0124028114510456 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3396),
				new double[] { -0.111467346153404, 0.00397397005123117, -0.0337357205652061, 0.0268670478019439 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3612),
				new double[] { -0.0975445837109008, 0.00765144606415534, 0.0263255336785529, 0.00527147278346049 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3730),
				new double[] { -0.0997196219729912, -0.00141738561153443, 0.0324144388705352, -0.0285369109544055 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3974),
				new double[] { 0.0598072448611611, -0.101502671530023, 0.00541343428526906, 0.0214122702712459 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4541),
				new double[] { 0.110985661036712, 0.0459073904567896, -0.00329858721422526, 0.0121780415312005 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3096),
				new double[] { 0.10031101823643, -0.115609419673026, 0.0106700915897, 0.0155613751976927 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4504),
				new double[] { 0.103790430820551, -0.139080703780697, -0.0210601295992499, -0.0576519737534501 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3924),
				new double[] { 0.115775243486417, 0.0232007048503202, 0.00184999419917884, 0.0254567083552035 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3293),
				new double[] { 0.111863495820498, 0.0160841921361349, 0.00234173681162539, 0.0221551082708484 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3074),
				new double[] { 0.0922115535305952, -0.1229523226498, 0.00493015246319332, 0.00405448657983714 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3118),
				new double[] { 0.0578795480383003, -0.0990060404235967, 0.00222478116612034, -4.20537564872381E-05 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3739),
				new double[] { 0.12027705187485, 0.0454529164715845, -0.00437645358310629, -0.00687637347386223 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3131),
				new double[] { 0.107572299093313, 0.0447436156353354, -0.00885780951018672, -0.000237734791990616 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4229),
				new double[] { 0.109908195116279, 0.0461823824759179, -0.000224692770680314, 0.0262755781660086 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4144),
				new double[] { 0.103619114051485, -0.0414484612157377, 0.00690322470952472, 0.0154454873974048 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4026),
				new double[] { 0.128217459518904, 0.011512910506348, -0.0138029903701681, -0.0395854119802217 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4238),
				new double[] { 0.118061410170792, 0.0487784817979561, 0.00579811775516643, 0.0322525296452429 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4575),
				new double[] { -0.117909909250792, 0.00288340112524963, -0.0522813526378259, 0.0247398369669233 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3437),
				new double[] { -0.0956997442304323, 0.00947086552229096, -0.00500734036235101, -0.0347203519875145 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4230),
				new double[] { 0.112774293979275, 0.047718554733313, 0.00625272029078571, 0.0346436364904421 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3371),
				new double[] { -0.119703124429072, -0.00238647416857693, -0.05188952276852, -0.0122718965233872 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3115),
				new double[] { 0.0883434679391393, -0.114774732456798, 0.00402279308849623, 0.010980092613072 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3794),
				new double[] { -0.0969083524391849, 0.00400933465537668, 0.0425295212149114, -0.000197802964287604 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3738),
				new double[] { 0.11273226981791, 0.0448235835371993, 0.00106740238169561, 0.0119776630804786 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3650),
				new double[] { 0.109948666519914, 0.0483971267126288, 0.00210075763578247, 0.0149039139370876 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3351),
				new double[] { -0.111949344122702, 0.0041742632296818, -0.0474584785968156, 0.030436016191981 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3346),
				new double[] { -0.152360469181919, -0.0115063185026626, -0.141295838880409, -0.123454492352665 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3177),
				new double[] { 0.132174963188993, 0.0133341661956052, -0.01041475897492, -0.029231938306707 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3956),
				new double[] { 0.116772212281856, 0.0389307923276652, -0.003447962515571, 0.0069458635236792 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3617),
				new double[] { -0.0954164893642756, 0.00816258750998562, 0.0404956054809225, -0.00330042201349448 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3751),
				new double[] { 0.106180240213221, 0.0101581179681237, 0.0012126033988652, -0.0153790830402915 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4040),
				new double[] { 0.127705596019698, 0.0285886514013527, -0.0112675260418541, -0.0320088012328267 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3791),
				new double[] { 0.113093222516081, 0.0483286626552237, 0.00174371624277854, 0.0194311805888274 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3928),
				new double[] { 0.0554001764190372, -0.108753242605947, -0.0194919903438772, 0.00865206759758418 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4038),
				new double[] { 0.125193399203986, -0.0497769427627048, -0.0206461138719663, -0.0512692030418825 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4440),
				new double[] { -0.104757013289224, 0.0128046404308563, 0.0319260808476906, 0.009881719175981 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3207),
				new double[] { 0.120514733451038, 0.0403935520608577, 0.000131178200563224, -0.0132403825665181 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4367),
				new double[] { -0.121666223235944, 0.00581494622874473, -0.0463408708350633, 0.0392509551913185 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4449),
				new double[] { -0.100792080099512, 0.0040699476455305, 0.0420487534171108, -0.00286288707652644 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3339),
				new double[] { -0.110091167756454, 0.00617395227059895, -0.0516185860921946, 0.0268034071212597 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4041),
				new double[] { 0.0801369961634345, -0.111980223944615, 0.00188909452552256, 0.00810745968167342 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3269),
				new double[] { 0.114550140395092, 0.0454557272798088, -0.00241670092218087, 0.00916872436336868 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3183),
				new double[] { 0.130980925722207, 0.0238187991763683, -0.0156917110211123, -0.0513693711188745 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3172),
				new double[] { 0.138750564072187, 0.0200884271338904, -0.00259583751613114, -0.00478151272610161 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4072),
				new double[] { 0.116586874028402, 0.00967664386205971, -0.00422485780112889, 0.00420040823797485 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3426),
				new double[] { -0.142544864565544, 0.00163840890737462, 0.0290688226306612, -0.102833257327287 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4199),
				new double[] { 0.0858954335114394, -0.095620017492576, 0.0185249278017749, 0.0378307760873815 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3833),
				new double[] { -0.0971044000780462, 0.00964984754044381, 0.0419329017576698, 0.00665861900569788 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3539),
				new double[] { -0.0930382816446889, 0.00283726044180571, -0.00276469316088434, 0.000266307904452496 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4203),
				new double[] { 0.0978049708696406, -0.126475213931132, 0.00285423615768592, -0.0102861884828548 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4035),
				new double[] { -0.110358010705677, -7.60703368245059E-05, 0.0579218779229568, -0.0461508001645742 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3108),
				new double[] { 0.117229835758287, 0.0399993334240225, 0.000581336719158666, 0.0215440632341336 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3265),
				new double[] { 0.132798056009734, 0.0174278602718051, -0.00864154739701239, -0.025627223508663 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3883),
				new double[] { -0.0653482940277274, 0.012860006908004, 0.0388087746506263, 0.00880212327083359 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3264),
				new double[] { 0.111579278970826, 0.0478861786399169, 0.00487206856784248, 0.0276506613193869 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3166),
				new double[] { 0.113194660672356, -0.0194193601054507, 0.000473874235797298, -0.0310341479928318 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4377),
				new double[] { -0.0588787520965764, 0.0171604283845517, 0.0258699162947576, -0.0149285076590293 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3574),
				new double[] { -0.0978857528227664, 0.0084177964989793, 0.00919661969908171, -0.00398336471439658 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3378),
				new double[] { -0.115401807368437, 0.00258504276299604, -0.05556173284442, 0.00936827957108752 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3640),
				new double[] { -0.111039480814809, 0.000626855191945999, -0.012202329166215, 0.0139979968779663 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3071),
				new double[] { 0.0852079065338183, -0.121056478498243, -0.00634113204693087, -0.0233336987041916 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3228),
				new double[] { 0.128013436731474, 0.0442171685049754, -0.00473419751056417, -0.00174916257858463 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4439),
				new double[] { -0.0971182932166584, 0.0105689638068386, 0.0414954432921296, 0.00229272998763307 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3208),
				new double[] { 0.126937233819134, 0.0471738699463319, 0.00325369310512684, 0.0167958303302461 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3464),
				new double[] { -0.115827311134052, 0.00132292948390025, -0.02049381490916, -0.00566198567815215 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4495),
				new double[] { -0.102380801684754, 0.00707188150688992, 0.0440458972079809, -0.023572401326826 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4281),
				new double[] { 0.120993272228484, 0.0492382833068276, -0.00159068044782136, 0.0210525779228185 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4254),
				new double[] { 0.116338623085239, 0.0481773614286251, 0.0044741626527279, 0.0249283136385919 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3447),
				new double[] { -0.0990088359671109, 0.004502127538007, 0.0392341735953371, -0.0306116693152571 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3453),
				new double[] { -0.0988127269023416, 0.00161837344786156, 0.0408362316901677, -0.00794116166869339 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4321),
				new double[] { -0.120065801043061, -0.000362984263544339, -0.051255536207628, 0.0207571876649908 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3435),
				new double[] { -0.101790506039618, 0.00338099182969789, -0.00329525077427457, -0.0245476386218658 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3425),
				new double[] { -0.0958365202399981, 0.00940945260459821, -0.00368616558212178, -0.0457190946798532 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3190),
				new double[] { 0.118850435973289, 0.0454862759402025, -0.00211284614703902, -0.00682328940701579 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3418),
				new double[] { -0.0933040232925501, 0.0124836460705474, 0.0469127605235056, 0.000863247965834031 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4478),
				new double[] { -0.117396932235652, 0.00709558399484656, -0.0531666923277021, 0.0264073891775935 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4273),
				new double[] { 0.11626582346656, 0.0435946644418918, -0.000144360874037544, 0.0254736594517611 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4485),
				new double[] { -0.0964158331882699, 0.0108440600831299, 0.0444252990214332, -0.00651215722436802 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3298),
				new double[] { 0.12226055413848, 0.0320437679129131, -0.0140401166690159, -0.00754319226600566 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4531),
				new double[] { 0.119127434876726, 0.0397698172516317, -0.0156305171982685, -0.033344334364866 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4289),
				new double[] { -0.1176346920775, 0.00276785572178412, -0.0361018272703067, 0.0427262807968234 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3809),
				new double[] { 0.117645102272984, 0.0508031335674355, 0.00318143797322674, 0.0223707845347952 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4446),
				new double[] { -0.0845321142178034, 0.009158034063388, 0.0497066992469723, -0.0145142033473863 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3478),
				new double[] { -0.0903539672593764, 0.00134300260745022, 0.000688612620165702, 0.0132886929451665 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3139),
				new double[] { 0.124900481726369, 0.0496968321586422, 0.00206999857545184, 0.00934686150881979 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3979),
				new double[] { 0.0945223536690892, -0.125450431883276, -0.000432605017963901, -0.014493918625193 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4574),
				new double[] { -0.118985743703195, 0.000925672540171689, -0.0581864579810955, 0.00971344294975535 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3616),
				new double[] { -0.106639882401269, 0.00280914039556269, -0.0219717766424971, 0.00804022215954586 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3813),
				new double[] { -0.098918644691856, 0.0102276289312474, 0.0200556931652059, 0.0155101142218414 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4141),
				new double[] { -0.116306334726553, 0.00359937660106979, -0.016128775493704, 0.0250919416844978 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3276),
				new double[] { 0.126347492204635, 0.0260034450257643, -0.00378439872705744, 0.00444305394312424 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4100),
				new double[] { 0.072860800265434, -0.0985705790739237, 0.0112299272181042, 0.0378105987349713 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3992),
				new double[] { 0.102704688717585, -0.117246175459968, 0.000191672477220798, -0.00143906984571894 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4137),
				new double[] { -0.106980669928753, 0.00553376314191946, -0.0163502473521116, 0.0162094774901253 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3583),
				new double[] { -0.0820078508828427, 0.00845811457818484, 0.0290427879237155, 0.00261517751239257 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4385),
				new double[] { -0.0742557528972692, 0.0157964258577098, 0.0302315223137122, 0.0167507299242668 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3492),
				new double[] { -0.101062065012922, -0.000545241066702869, 0.0410108250275656, -0.0282137381103861 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3892),
				new double[] { 0.0944473046402449, -0.0964100262368522, -0.000273132216210941, 0.0165414031283979 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3621),
				new double[] { -0.0865144887849924, 0.00921373632023768, 0.0445069041180859, -0.00296139724427174 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4183),
				new double[] { 0.0853300457166132, -0.109494954479538, 0.00319243001962571, 0.00390557911169211 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3905),
				new double[] { 0.124944588541784, 0.0314416409431673, -0.000604343026397687, 0.0141278207684517 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3546),
				new double[] { -0.0939635298836937, 0.00345280420481074, 0.0229994991878476, -0.0260334446304105 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4170),
				new double[] { 0.0889652662070355, -0.115390236370001, 0.0154824903045809, 0.0517204729035509 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3955),
				new double[] { 0.114402098137114, 0.0117416289335, 0.00275822408960728, 0.0134495835782663 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4055),
				new double[] { 0.0816004068788745, 0.0455263899160556, 0.015143048122317, 0.00362319799193438 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3771),
				new double[] { 0.113707346261109, 0.0420819647476499, 0.00308056054662041, 0.00547122848843659 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3547),
				new double[] { -0.101719563606976, 0.00301901188346264, 0.0385263806471354, -0.0413574079482635 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4349),
				new double[] { -0.104747535694877, 6.93793916947516E-05, -0.0234782973659723, 0.0204800912927345 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3814),
				new double[] { -0.0838130513628537, 0.00534050986599733, 0.0456670103807356, -0.00128411873696186 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3570),
				new double[] { -0.110700715130656, -0.00163571569222872, -0.025147184033737, -0.043712437074783 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3664),
				new double[] { 0.113743186700771, 0.0400407239781181, -0.00166431842649657, 0.018549230301558 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3209),
				new double[] { 0.129277002589084, 0.0397572066128642, -0.010687982183528, -0.0236569425747351 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3142),
				new double[] { 0.13210203824822, 0.048911635990867, -0.00904466736801106, -0.0263973716047999 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3226),
				new double[] { 0.130134128965687, 0.0403335016983518, -0.000310491709672904, 0.000212588948928421 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3356),
				new double[] { -0.110484071111811, 0.00356963027232868, -0.0250971176207439, 0.0224053739593051 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4354),
				new double[] { -0.109026305839676, 0.00209828107796522, -0.0402512560561195, 0.0275345171327054 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3942),
				new double[] { 0.121599541011418, 0.0351474377433722, -0.00966569476458935, -0.00726822679484572 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3515),
				new double[] { -0.108333521569792, 0.00155474086931519, -0.00977102193996017, -0.0166334002278861 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3328),
				new double[] { -0.104716714411073, -0.000864439713148424, -0.0352587204111761, 0.0105997746095117 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4481),
				new double[] { -0.103687548488347, -0.00472994268250351, -0.0416173510173708, -0.00885041964976841 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3948),
				new double[] { 0.118825355073067, 0.0435589009645882, -0.00504509524887905, -0.00133466308286038 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3696),
				new double[] { 0.111309851517426, 0.0456510950876683, -0.000407419478458487, 0.0202308288820568 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3469),
				new double[] { -0.106486124233606, 0.00952994948387429, -0.0143916389785096, 0.011936834876776 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4406),
				new double[] { -0.100567657634576, 0.000431283487272279, 0.0453014078600566, -0.0154228389214815 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3860),
				new double[] { -0.100076945461302, 0.00542283336829964, 0.0338019536237943, 0.00519220510916232 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4191),
				new double[] { 0.0888661265100963, -0.114392158567651, 0.00487185819919732, 0.0174980849648985 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3255),
				new double[] { 0.111100894790081, 0.0460101287612265, 0.000811327955473457, 0.0110582314955333 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3609),
				new double[] { -0.0812868231816771, 0.0109967489052994, 0.0344084192348335, -0.0193357683966789 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3419),
				new double[] { -0.0999868687584543, 0.00873361761325094, 0.0180231616697501, 0.0121392276264372 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3576),
				new double[] { -0.0948913722357513, -0.00318750903757367, -0.00882385278854924, -0.00574469314915689 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3125),
				new double[] { 0.104187379621352, 0.0388808857396472, 0.0106321709892827, 0.0263014842251237 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3925),
				new double[] { 0.0896410229904967, -0.115954755541071, 0.00707295305121186, 0.0256699591652341 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3247),
				new double[] { 0.122920553219207, 0.042799362933798, 0.0025468280945727, 0.017205654437771 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4357),
				new double[] { -0.115251183745805, 0.00404740840474061, -0.0429667902080342, 0.0350400058866018 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4393),
				new double[] { -0.092771963356249, 0.00826027945213889, 0.0430758917045585, 0.00564605533347399 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3145),
				new double[] { 0.120696099581706, 0.0436967938283803, -0.00503600057044532, -0.00900161317145524 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4560),
				new double[] { -0.0845325386565414, 0.0154261096005186, 0.0378108917316981, 0.00576521244384718 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3811),
				new double[] { -0.106567310875705, 0.0116116069625058, 0.032247742933767, 0.00433972465638654 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4394),
				new double[] { -0.097457416979754, 0.0101182126031508, 0.045325133364224, 0.00418780347853466 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3837),
				new double[] { -0.0807235437506593, 0.0107137619951778, 0.0375625881413831, 0.0108435527811912 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4163),
				new double[] { -0.0399847707864398, -0.044704207924353, -0.00604161319115148, 0.00375682606945545 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4548),
				new double[] { 0.112089511906583, 0.0281237551691337, 0.00606721389891042, 0.0115027628838101 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3292),
				new double[] { 0.117238865973901, 0.0440156122780493, 0.0060500071135785, 0.0220755626053495 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3637),
				new double[] { -0.110667494580692, 0.00235189187952362, -0.0390301194721761, 0.0301742848890853 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4248),
				new double[] { 0.110373480648539, 0.0229747253844301, 0.00219452463771931, 0.0258539761499756 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3908),
				new double[] { 0.11631860494715, 0.0499900680711454, 0.00120313998320852, 0.0219202574116103 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4390),
				new double[] { -0.104040989258178, 0.00791127190092033, 0.0491032230861124, 0.00484557646151659 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3389),
				new double[] { -0.148142257745621, -0.00860072750083826, -0.123469227773458, -0.0724296986129212 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4338),
				new double[] { -0.110587637678434, 0.00782401556113636, -0.025999604447843, 0.0341636284974845 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3342),
				new double[] { -0.14310509530452, -0.00959501072488217, -0.112475115130189, -0.0767811594266765 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4500),
				new double[] { -0.118443143615726, -0.00399186153785465, -0.0677376153773153, -0.00379170167540735 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3083),
				new double[] { 0.101619429467567, -0.128527099612302, -0.0152255891138794, -0.0421093438984604 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3046),
				new double[] { -0.0943899713220121, -0.00818116997471864, -0.00290347206517923, -0.0508395245312522 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3337),
				new double[] { -0.105624402760273, 0.000174148487425443, -0.0317067844611587, 0.0258555261309701 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4425),
				new double[] { -0.0965671192135448, 0.00659068222555523, 0.0470744625722875, -0.00575735357797462 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3932),
				new double[] { 0.111882705440243, 0.0430595800165133, -0.0221190389665561, -0.0600144976889715 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3230),
				new double[] { 0.123873057997743, 0.0427702535026073, -0.00539119609101286, -0.011163207638134 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4167),
				new double[] { -0.0412521121275725, -0.0363326017093233, 0.0048108272109307, 0.0180785315311753 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3093),
				new double[] { 0.0321699210242694, -0.0935794755633762, 0.0057763155900685, -0.0181075299418669 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3689),
				new double[] { 0.105809138615564, 0.0451484538407663, 0.00040284704666422, 0.0271150242700756 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3895),
				new double[] { 0.110384343596499, 0.0379105766340575, 0.000381865978050124, 0.0329424462455555 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3548),
				new double[] { 0.00403475499679821, 0.0156079839754566, 0.0261230606560545, -0.00144134254460765 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3646),
				new double[] { -0.112232507794201, 0.00700533240114753, -0.0323659713143808, 0.0335781490901068 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3212),
				new double[] { 0.115217109106049, 0.0405580770444489, -9.69468239013184E-05, 0.00594038282011735 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3470),
				new double[] { -0.0042402588142403, 0.0361818305666894, 0.0254095316448145, -0.00423781746974969 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3476),
				new double[] { -0.0993451955563328, 0.00358054002249609, -0.0436235695367894, 0.0242759739012952 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3380),
				new double[] { -0.161461262001221, -0.0139362754954549, -0.165926903597904, -0.155475896555487 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3429),
				new double[] { -0.117517359185998, 0.00469804354725517, -0.0495976569986768, -0.00476358142989838 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3872),
				new double[] { 0.109424054049103, 0.0331165632029658, -0.00429306912521792, 0.00789231945450046 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3407),
				new double[] { -0.0957552705922653, 0.00362409927135398, 0.0327852255873887, -0.0196919234936415 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3161),
				new double[] { -0.0470370928401763, 0.0161663752811639, -0.0431345692778287, 0.0274499358346381 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3370),
				new double[] { -0.1226196700996, -0.00795052235813482, -0.0159193614942539, -0.0959360055216189 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4507),
				new double[] { 0.102623264017232, -0.13924703147028, -0.0098858330034709, -0.0390153987273707 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4401),
				new double[] { -0.102807148945594, 0.00921525283784967, 0.0395250643481902, 0.010233152775398 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3784),
				new double[] { 0.110423827178642, 0.0498413861450277, 0.00898280386588923, 0.00690249717089285 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4045),
				new double[] { 0.10664894161394, -0.127828990053042, -0.00347738534787186, -0.0137017912420041 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4092),
				new double[] { 0.109705662302013, 0.0409894011706774, -0.0167725565998359, -0.0264467223990288 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3512),
				new double[] { -0.0901077399867348, 0.00325213326984769, 0.0384947326323387, -0.0180435472173836 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3713),
				new double[] { -0.0982556406130558, 0.00583843685275561, 0.0331599282433542, -0.0135110541639983 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3743),
				new double[] { 0.125302187602962, 0.0459619043849097, -0.0015893542187134, 0.0142623810447931 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4344),
				new double[] { -0.115943804963353, 0.00689607982954829, -0.0391706487408626, 0.0399894421584537 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4096),
				new double[] { 0.120675899966604, 0.0344898117297311, -0.0100153264031689, -0.0181637460423259 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3332),
				new double[] { -0.112932303882172, 0.00447679714305168, -0.0418744007070892, 0.0355327394978676 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4249),
				new double[] { 0.112579533758144, 0.0188422251644795, -0.00195743158082716, 0.0162506148298164 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4467),
				new double[] { -0.111326009584016, -0.000844733997424516, -0.0564022516424078, -0.00545968451381039 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3542),
				new double[] { -0.0948692429961065, 0.00818491314689437, -0.0487306256566632, -0.0229332698720122 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4476),
				new double[] { -0.115453441724025, 0.00723770279634405, -0.0408232730718299, 0.0213591079995288 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3675),
				new double[] { 0.100730324600867, 0.0172830485052719, 0.0141283225550811, 0.0231847702444157 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3192),
				new double[] { 0.123996663885422, 0.0333559680399363, -0.0003361783257798, 0.0207595376257001 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4498),
				new double[] { 0.0040882883302878, 0.00303079865702736, 0.0357077405183687, -0.0173908151607381 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3748),
				new double[] { 0.120486629496306, 0.0441430611680196, -0.00272973081920194, 0.00387124681484745 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3923),
				new double[] { 0.0802726630558184, -0.0813921982222562, 0.00457009241692633, 0.0277855756942562 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3329),
				new double[] { -0.101359710720581, 0.00655045908802876, -0.0457277704207352, 0.0244818167574427 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4208),
				new double[] { 0.0925842334597591, -0.105699999429293, 0.0151045493119433, 0.042894641903136 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4323),
				new double[] { -0.115904781852063, 0.00283374525297624, -0.0481398523533061, 0.0296600387963845 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4519),
				new double[] { 0.0379290671932245, -0.0872323530151891, -0.00737833442476513, -0.0157362955449843 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4561),
				new double[] { -0.10952029884794, 0.00488306359391103, 0.0192981331641224, 0.00870902638139985 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3865),
				new double[] { -0.0903632782713403, 0.00989185697417456, -0.0341741676538461, 0.0322256613580842 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3358),
				new double[] { -0.109492200500081, 0.00421624264738676, -0.0314768232693385, 0.026197619516593 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3951),
				new double[] { 0.115582526728141, 0.0444495313418733, -0.00591899725552426, 0.00069650676470785 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4213),
				new double[] { 0.0889724624891305, -0.108821400098547, 0.0149706593934184, 0.04100182080467 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3731),
				new double[] { -0.106356660828542, 0.00080686258001806, -0.00947644239078262, 0.00494145355925694 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3359),
				new double[] { -0.116846037155905, 0.00604797752455636, -0.0480051114952569, 0.0373761057453572 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3025),
				new double[] { 0.0121013065533725, 0.0326465207282146, 0.0348785955475396, -0.0247135581185606 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4469),
				new double[] { 0.0875967457545653, -0.109395597859773, -0.0157273754122342, -0.0194753150628833 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4019),
				new double[] { 0.104086420872626, 0.0417700717130923, -0.00575674713878353, 0.00173717508394777 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3818),
				new double[] { -0.0932635661392424, 0.00803325438714172, 0.0370323338118937, 0.00103856145937001 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3756),
				new double[] { 0.108352379881103, 0.0486500178002224, 0.0096419811711129, 0.0271725686507067 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4391),
				new double[] { -0.097008416881153, 0.0142387771924951, 0.0509712241231624, 0.00602147385051916 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3834),
				new double[] { -0.0897604838319101, 0.0128542498540325, 0.0445180499317702, 0.00512651640405343 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3551),
				new double[] { -0.107866756433574, -0.00703631190537491, -0.0225679927739263, -0.0792690558212822 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4505),
				new double[] { 0.0937539660096358, -0.117058066991431, -0.00189012613319775, 0.00342729999987807 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4013),
				new double[] { -0.113576361501601, -0.0043021927708534, -0.043478708633434, 0.0138176320995784 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4343),
				new double[] { -0.113686660181024, 0.00647263450040128, -0.0437015102988267, 0.0383542350903399 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3517),
				new double[] { -0.0855654808807304, 0.00200840360400239, 0.000603421386813764, -0.00967085180437442 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3604),
				new double[] { -0.0959128559785122, 0.0079104797019737, 0.0456588462896709, -0.0075579588496481 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3201),
				new double[] { 0.118803205034528, 0.0308434875006714, -0.00115220680829685, 0.00227027947638723 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3377),
				new double[] { -0.0978990857460085, 0.00263992168201893, 0.0136444016647375, -0.0779561215974446 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3857),
				new double[] { -0.0916385048549878, 0.0108040151346483, 0.0332547281477259, 0.00510599709322761 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4537),
				new double[] { 0.123950815603585, 0.0150246952385528, -0.00119823181661963, 0.00828907746930372 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4225),
				new double[] { 0.123306137273563, 0.0563873036455221, -0.00946450172832105, -0.00119823566171753 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4363),
				new double[] { -0.10948467891634, 0.00253121031861783, -0.0284263025927857, 0.0264013305461768 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4477),
				new double[] { -0.101068469802292, 0.0146729445284271, 0.0446869098859666, -0.0120378728194351 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4171),
				new double[] { 0.0889247753622261, -0.109485100704051, 0.0114708776217141, 0.048990821048681 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4093),
				new double[] { 0.118200361813333, 0.0421963455426915, -0.00161294928307175, 0.00695444451532467 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3772),
				new double[] { 0.113420387065661, -0.00162832440344003, 0.0088220290148513, 0.0122924115525794 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4212),
				new double[] { 0.0815473870103483, -0.0855782916012185, 0.000323354226017901, 0.0089726069473522 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3483),
				new double[] { 0.0961422116062478, 0.0413662784028413, 0.00230488899063763, 0.00596300200523973 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3416),
				new double[] { -0.103160860936801, -0.00269946080131928, 0.0421071062133833, -0.0557184101311121 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4085),
				new double[] { 0.118818359338243, 0.0389053925600921, -0.00493789996593367, -0.00342346446710678 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4418),
				new double[] { -0.106030131678993, -0.000126617310048982, 0.0496689364101062, -0.0398112505020944 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3890),
				new double[] { 0.118048201673223, 0.0386005616749807, 0.00276369751314419, 0.0265450347673441 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3156),
				new double[] { 0.113079857124149, 0.0421583508272959, -0.0063953685924566, -0.00635438328975819 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4572),
				new double[] { -0.118999681316238, 0.00169229578219726, -0.0557912284475365, 0.0191222569426432 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4098),
				new double[] { -0.122722689788072, -0.00168173796396995, -0.0609795118283672, 0.0193923063883617 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3541),
				new double[] { -0.100621305158915, -0.0015004177620673, 0.0381704979220984, -0.061099547097286 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3366),
				new double[] { -0.110531273408699, 0.00120341651560125, -0.0597815035617647, -0.00327066399286672 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4015),
				new double[] { -0.0681509550065925, 0.0125915024108254, 0.0436303504420234, -9.23312426208159E-05 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3803),
				new double[] { -0.103096248307848, 0.00645697969505201, 0.0513713451296687, 0.000801088467418134 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3586),
				new double[] { -0.117941546359711, 0.00414789789521061, -0.05033572933951, 0.0318176004699582 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4547),
				new double[] { 0.017448359765598, 0.0381092422844498, 0.0173851586605379, 0.0147308578432066 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4053),
				new double[] { 0.105656528664853, -0.0946067254196344, -0.00388388508588133, 0.00990880484991095 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4155),
				new double[] { -0.100301843076601, 0.0105360503673965, 0.0172294523278309, 0.0146605343658178 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3588),
				new double[] { -0.0951897979080851, 0.00230023610879271, 0.0414139005907889, -0.013091172267189 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3554),
				new double[] { -0.125028660983083, -0.0042764363442542, 0.0162006367630407, -0.131065510268715 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3301),
				new double[] { 0.114462735205231, 0.0491259867659044, -0.00852177407771616, 0.00830197380486953 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4179),
				new double[] { 0.0827030517151463, -0.107055647701111, 0.0092091236349552, 0.0523933688245735 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4558),
				new double[] { -0.0897552138404265, 0.00308605373420708, 0.00701512068272053, 0.0128719832840817 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4187),
				new double[] { 0.0900000229982607, -0.108131336992736, 0.0100646372115522, 0.0279953611432418 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4244),
				new double[] { 0.120117553825523, 0.0433741517398158, -0.00581360089760294, -0.0107164415529705 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3055),
				new double[] { -0.0389353671778298, -0.0303053722918298, 0.0016607899438768, 0.0138683731507305 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3058),
				new double[] { -0.035384541055875, -0.0331270038523678, -0.00747357447192455, -0.0215416744437221 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3028),
				new double[] { -0.0398218657978263, -0.056089959122432, -0.00447534157857767, -0.0234835414654762 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4247),
				new double[] { 0.118371316150747, 0.0483603385501901, 0.00634105362305, 0.0198282123894785 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3957),
				new double[] { -0.114101580387071, 0.00217044835746833, -0.0431841951461256, 0.0302599636571281 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4176),
				new double[] { 0.0821392427662431, -0.104005872678867, 0.0113929143877861, 0.0476890463940986 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3581),
				new double[] { -0.12492246650034, -0.0110268193626932, -0.0422945753110984, -0.0260065519359231 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3413),
				new double[] { -0.0656658619244533, 0.0132693925196512, 0.0282992379220325, -0.00904125257776806 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3135),
				new double[] { 0.118401354148168, 0.0496047398667432, -0.00143302722444738, 0.0105354796851971 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3394),
				new double[] { -0.0998398823873987, 0.00632760545155657, -0.0460095651358836, 0.0307790614259595 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3933),
				new double[] { 0.0834385102334131, -0.112509645960273, 0.00500287484934512, 0.020337499932357 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3211),
				new double[] { -0.0493741870650487, 0.021460121384986, -0.0786273841508703, -0.00815172726961297 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3663),
				new double[] { 0.0481051821940812, 0.00318837589698913, 0.0304955464225862, 0.0205716926920573 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4168),
				new double[] { 0.0988096125680089, -0.109442941293051, 0.0111526727611973, 0.028911419750813 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3239),
				new double[] { 0.111200247374806, 0.0454257272138017, 0.00112093602166246, 0.00930928113706376 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3446),
				new double[] { -0.0974398457079725, 0.00311420335521482, 0.0383243708047927, -0.0463484344447919 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4483),
				new double[] { -0.0892933075898107, 0.0123589527321867, 0.0353109015724734, -0.0114091366521761 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3819),
				new double[] { -0.0977460432946168, 0.00329520910785997, 0.0408256097736721, -0.0296309653798415 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3590),
				new double[] { -0.105919475454235, 0.00755670029991115, 0.00407351096372333, 0.00977309630979509 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4294),
				new double[] { -0.115730271160111, 0.00589986514984704, -0.0478926550626194, 0.0307891990638273 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3289),
				new double[] { 0.123284806805273, 0.0418081899264061, -0.00927832985300974, -0.00995861176730103 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3947),
				new double[] { 0.120014933318498, 0.0465711423059398, 0.000747967770933692, 0.00939744792698606 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3309),
				new double[] { 0.00523393469465876, -0.0372439187861243, -0.0810279220748645, -0.134602264730665 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3568),
				new double[] { -0.100902943862392, -0.0025491476242036, -0.0179547217117969, -0.0247460034352014 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3661),
				new double[] { 0.108917269412539, 0.0484242309625346, 0.00813994447757936, 0.0261272279962549 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4185),
				new double[] { 0.0946422148885414, -0.127457483820899, -0.00261991819247078, -0.0132620690650159 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3417),
				new double[] { -0.0608158472697366, 0.0228339188455466, 0.0381720711794191, 0.0160515060907296 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3415),
				new double[] { 0.0902365035447964, 0.022923279101017, -0.00675591216179786, 0.0113690495639428 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3799),
				new double[] { -0.094649954224563, 0.000223215902842499, 0.0170831051031219, 0.00868685065173915 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3915),
				new double[] { 0.0804408900630385, -0.106995823425615, 0.0115308461325811, 0.0332877233370601 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4036),
				new double[] { -0.0854681856316532, 0.00984220750127801, 0.0570634238696662, -0.040214025928675 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3061),
				new double[] { -0.0404794324905744, -0.0334714724631374, -0.00240252346756355, -0.00401590766428802 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3994),
				new double[] { 0.123503239669822, 0.0379072087730199, -0.0155826577879287, -0.0431179367944573 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4520),
				new double[] { 0.0574985359881405, -0.101040208146636, 0.00775454273932639, 0.0221437276721697 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4387),
				new double[] { -0.0919486397984981, 0.0104508519424531, 0.0452218454809346, 0.00193449022290621 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3217),
				new double[] { 0.120878130226184, 0.0426476822816408, -0.00975538947082271, -0.0229396677722899 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4222),
				new double[] { 0.124405256847691, 0.0530965194236467, 0.00466597266279231, 0.0370931722667792 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4050),
				new double[] { 0.0916348191996402, -0.118688005994822, -0.00494397093480108, -0.00236625299712072 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3742),
				new double[] { -0.0857538061722382, 0.00671912492951713, 0.0429419015807864, 0.00659197184601645 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3823),
				new double[] { -0.0885571259106775, 0.000943796904958116, 0.00964886448782226, -0.000658299936384248 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4524),
				new double[] { 0.119597777884071, 0.031433568375224, -0.00967011102347433, -0.0293834835591406 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3355),
				new double[] { -0.117940940772597, -0.00253818626253389, -0.0686020017306925, -0.0134119274562305 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4252),
				new double[] { 0.131114402952052, 0.0419503334985407, -0.0134572759740712, -0.0394454722277969 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3611),
				new double[] { -0.103095754370637, 0.00264900932673545, -0.00272437241576933, 0.0120477624790894 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3072),
				new double[] { 0.0974341859949299, -0.0197315682017023, 0.00184523589741594, 0.0196278703261606 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3148),
				new double[] { 0.113705238665678, 0.0425423304951627, -0.00382888744316047, 0.00729920245719555 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3534),
				new double[] { -0.111964046492917, 0.00426116835515508, 0.0287301832240508, -0.0831460150624571 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3433),
				new double[] { -0.106915634476553, 0.00294435726722742, 0.0473135351798595, -0.0251531307535078 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4309),
				new double[] { -0.119496070453781, 0.00572885496438969, -0.0444938531325557, 0.0423211760981928 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3244),
				new double[] { 0.12476779434095, 0.031394624713894, -0.00055686551291067, 0.00529013638151777 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3438),
				new double[] { -0.0227278260999477, 0.0224305876751406, -0.0026726223454239, 0.00927076617098368 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3054),
				new double[] { -0.0740514652407298, -0.0278276517604785, -0.0123986639543291, 0.0145518528567128 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3133),
				new double[] { 0.12823571868971, 0.0413914455280565, -0.00920703555133844, -0.0274095892628894 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4549),
				new double[] { 0.11849855762007, 0.043730660548218, 0.00156472369472348, 0.00912937514157656 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3597),
				new double[] { -0.113285968565459, 0.00137726486355927, -0.0217186656905635, 0.00964434579368888 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3491),
				new double[] { -0.0996487798823206, 0.00460299367437891, 0.0320820965819902, 0.0062144995421294 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3691),
				new double[] { 0.109653606264122, 0.0458211720772253, 0.00242379090776233, 0.0202628820050388 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3068),
				new double[] { 0.0503161378929018, -0.113753296743886, -0.00667596295475971, -0.0222196370809289 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3124),
				new double[] { 0.0997543408761084, -0.122919450609686, 0.00339546996238436, -0.0092489791821299 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3335),
				new double[] { -0.112112103659393, -0.00171067147115723, -0.0505436783244829, 0.0164085753839651 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4523),
				new double[] { 0.122015667716982, 0.0358345765376355, -0.00531660833283882, -0.00951675875658209 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3787),
				new double[] { 0.106253147343124, 0.0446058030023587, -0.00101878798639219, 0.0216432629374801 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3505),
				new double[] { -0.100131062640241, 0.00578897858495875, 0.0246909644628798, -0.0207491378142921 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3258),
				new double[] { 0.119759810151452, 0.034706034450721, 0.00101486945424464, 0.00499056375272432 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3746),
				new double[] { 0.117193811929147, 0.0472907926403972, -0.00237211264066666, 0.0304787297440732 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4356),
				new double[] { -0.11135723809742, 0.00350782023283042, -0.0411104917434192, 0.0320382119777298 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3670),
				new double[] { 0.0825783393578716, -0.0100697027186866, 0.00901380958637074, 0.0239458006129378 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3316),
				new double[] { 0.125176196814673, 0.0402712822374999, -0.00845059196921567, -0.0123585779286906 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3076),
				new double[] { 0.0579250040698418, -0.10970794283464, -0.000789825556827593, 0.00913165387819142 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4142),
				new double[] { -0.0749221444682631, 0.00489589511470423, 0.00517003293497598, 0.0100790519191491 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3555),
				new double[] { -0.0949874034045906, 0.00966937752618702, 0.0397269008090111, -0.0145710296194783 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3481),
				new double[] { -0.0801877035265522, 0.00720316800276449, 0.0193215946993103, -0.00407945819362529 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4071),
				new double[] { 0.132597603178748, 0.0262573657260566, -0.0113281194785431, -0.0374268473316903 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3639),
				new double[] { -0.117010149747356, 0.00594198126420221, -0.0463795343521721, 0.038773314288946 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3591),
				new double[] { -0.0972873274174533, 0.000326110268970771, 0.0300221908605634, -0.00641004464357794 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4190),
				new double[] { 0.0924800418003283, -0.121480270492548, 0.00497672525234986, 0.0132519277995762 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3849),
				new double[] { -0.0868633407636699, 0.00727468456708899, 0.040958732632639, 0.00485155639865774 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4261),
				new double[] { 0.107541413687841, 0.03900895758202, -0.000508420855393653, 0.00868986307782129 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3495),
				new double[] { -0.0995518385610241, 0.00427689038984887, -0.00365914731528411, 0.0114867956636546 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3910),
				new double[] { 0.100113976359384, -0.0125294256087907, 0.00226190297170431, -0.0148174160794731 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3969),
				new double[] { -0.0907517857349305, 0.00136392618549415, -0.00233559224339308, 0.0154429372424297 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3176),
				new double[] { 0.1303127918559, 0.0186147459898861, -0.00597900919808657, -0.00832794054608761 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3259),
				new double[] { 0.122330680261956, 0.0448748176721422, -0.00211142934333514, 0.00335942258918351 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3038),
				new double[] { -0.0568544164583148, -0.028852589675813, -0.0117221789759718, -0.0117990931118393 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4014),
				new double[] { -0.0952355403529659, 0.00535967905995466, 0.0476928937123452, -0.0186157324808134 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3764),
				new double[] { 0.123029195956241, 0.0426410454973252, -0.00807302827717089, 0.00292486024473644 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4123),
				new double[] { -0.109829703095782, 0.00348441717025814, -0.0100999663741529, 0.0170762978008765 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3660),
				new double[] { 0.122801587043537, 0.0453563498502615, 0.000757106365840484, -0.00691030317695649 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4318),
				new double[] { -0.120557760187358, -0.00368902137002104, -0.054561622959361, 0.0139452582040709 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3348),
				new double[] { -0.115779261809299, 0.00579209630572891, -0.029607736478693, 0.0273620983710508 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3066),
				new double[] { 0.102740160521824, -0.121899521343385, -0.00946060018085333, -0.0173514337455593 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3562),
				new double[] { -0.0932461558179149, 0.008171320793712, 0.0405039590391921, -0.00449740650275561 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4341),
				new double[] { -0.10936639393025, 0.0030747620519193, -0.0459455225556967, 0.0390653373946252 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3079),
				new double[] { 0.10837595415675, -0.140686041033556, -0.00234188438281035, -0.033116338011623 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3888),
				new double[] { 0.0100743966373864, -0.000941986686103673, 0.0381159296343615, 0.0174477125709458 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3938),
				new double[] { 0.116909472943041, 0.0470552438958293, -0.0102771386947254, -0.00303995070283894 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3232),
				new double[] { 0.132989182002495, 0.0256401548614229, -0.0119653201983677, -0.0353295263503573 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4143),
				new double[] { -0.0802478193260845, -0.0286681582441738, -0.0156243829762272, 0.0190387637663501 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3186),
				new double[] { 0.100399097151988, -0.0225147358880043, -0.000841469513323716, -0.0332871556181347 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4298),
				new double[] { -0.109321301404114, 0.00336795918554293, -0.0299927210318896, 0.0355130313250978 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3774),
				new double[] { 0.111447419007743, 0.0488753976803533, 0.00195118389103946, 0.0153663822757062 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3284),
				new double[] { 0.109934193827895, 0.0345681939455221, -0.000953077653840686, 0.0137914694502447 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3158),
				new double[] { 0.124210117199523, 0.0137681055442004, -0.00284319480277684, -0.00482464640402911 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3651),
				new double[] { 0.115051017566332, 0.0121517088498019, -0.00598176751515862, -0.0115865624064453 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4581),
				new double[] { 0.116511496624752, 0.0436935255538544, 0.00136445762109089, 0.0139917437225198 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3522),
				new double[] { -0.112560247723082, 0.0014688531212184, -0.00102744742650209, -0.0113724480605016 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3991),
				new double[] { 0.0935217072815429, -0.113391669994619, -0.00850088666943005, -0.0309978631933761 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3729),
				new double[] { -0.0984083247211425, 0.00383298350594238, 0.0296058738559685, -0.0157855200830807 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4422),
				new double[] { -0.0990028001294342, 0.00937354025861566, 0.0476387123025892, -0.00912989643498753 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4207),
				new double[] { 0.0813289811441117, -0.112716836353899, 0.0111442457474511, 0.0256655493330419 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3775),
				new double[] { 0.121887345891414, 0.0230922457400607, -0.0110849378495353, -0.00714287820046206 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3647),
				new double[] { 0.0898600541523516, 0.0119206051681437, 0.010463619362342, -0.00423275336574073 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4362),
				new double[] { -0.116291178356455, 0.00570191239583295, -0.0461854607061143, 0.0381229800872812 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3457),
				new double[] { -0.0950953109618294, 0.0026525088882236, 0.0277371403747545, -0.000884020235170356 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4586),
				new double[] { 0.112303302963479, 0.0454470035200672, 0.00248849198749505, 0.01892061793897 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3285),
				new double[] { 0.126752691553777, 0.0365980922773427, -0.0149977425433042, -0.0417123720484842 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3705),
				new double[] { -0.0748224692739254, 0.00869536253655439, 0.0225189439876525, 0.00553024735691293 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3471),
				new double[] { -0.0168650014520456, 0.0294146186889185, 0.0203542212220371, 0.00370577396576701 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3188),
				new double[] { 0.126616767794015, 0.0384917494475063, -0.0149890633289638, -0.0308603444687957 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3880),
				new double[] { -0.093595061754433, 0.0112943986143665, 0.044998369365204, 0.00263364180060541 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3861),
				new double[] { -0.0987714461464227, 0.0111753320031997, 0.0355835740834658, 0.00665142589011484 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3434),
				new double[] { -0.0882302498065521, 0.0109749453633557, 0.00432095041970956, 0.000983425477936916 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4538),
				new double[] { 0.129912126546095, 0.00904461245120578, -0.0103787987680845, -0.0271506104350321 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3257),
				new double[] { 0.125082595629451, 0.0537356720549529, 0.00156290171607071, 0.0295521014171147 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3997),
				new double[] { 0.110078299310216, 0.0479835127403475, -0.00425936263183706, 0.0154381667326545 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3178),
				new double[] { 0.123894791587045, 0.0215662472711999, -0.0081043865842523, -0.0276104675507012 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3684),
				new double[] { 0.11366336339021, 0.0440900361999012, -0.00474323437606559, 0.0146144534063173 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3594),
				new double[] { -0.104546414093561, 0.000798353966826259, 0.0561943349364612, -0.0363522416775494 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4311),
				new double[] { -0.117398527609126, 0.00661427892127105, -0.043240259046321, 0.0427812505607785 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3993),
				new double[] { 0.124565396384287, 0.0471648763766327, -0.014417810909257, -0.0344614819682383 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3525),
				new double[] { -0.110972446076478, 0.00258321049797288, 0.0206563665530495, -0.0668215766544913 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4419),
				new double[] { -0.0884541525528619, 0.00689585411555811, 0.0462919958545299, 0.00555902753881235 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4382),
				new double[] { -0.101021289692736, 0.00519552572182882, 0.0410642034005354, 0.00151341199973368 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3707),
				new double[] { -0.091268122046307, 0.00991093717149466, 0.0435672013284708, 0.00336803933044616 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4091),
				new double[] { 0.104166913344984, 0.0469859957523836, -0.000775208466072063, -0.00169031694711932 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3179),
				new double[] { -0.114598146676053, 0.000222695334111639, -0.0456374988706869, -0.0176639332441716 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4056),
				new double[] { 0.127567995082661, 0.0281079288663139, -0.00470673871661138, 0.000104175353463748 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4492),
				new double[] { 0.0901279496552706, -0.128938362835726, -0.00843454702319721, -0.0308161989231846 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3816),
				new double[] { 0.0737732118598649, -0.0115328144659534, 0.00572146820508062, -0.00367925104835763 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3579),
				new double[] { -0.0969193358536996, 0.000523617074035397, 0.0356797289300708, -0.0469907004927577 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3325),
				new double[] { 0.124355072619392, 0.0264339756700778, -0.0171124508235635, -0.0364638189256102 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4568),
				new double[] { -0.120242732050109, 0.00411798759595123, -0.0499262537563922, 0.0344423221278757 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3914),
				new double[] { 0.0984258658276741, -0.0969531357893326, 0.000818232039378119, 0.0276259633654607 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3625),
				new double[] { -0.111358533912327, 0.00606190569715441, -0.0221711250490528, 0.0233660683063128 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3227),
				new double[] { 0.105500964467125, 0.0420348942106875, -0.0174888514186623, -0.0103547700830191 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4533),
				new double[] { 0.111107424631184, 0.0373838611196068, -0.0142533017556358, -0.0527478305392065 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4216),
				new double[] { 0.116572589849883, 0.0531569404124796, 0.00298653112198386, 0.023790929951164 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4122),
				new double[] { -0.0994473700954101, 0.010426918154872, 0.0104537748245721, 0.00199331225840774 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4068),
				new double[] { -0.1054043088895, 0.00656526493167839, 0.0535968066441982, -0.0251043675984025 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3191),
				new double[] { 0.134264625514877, 0.0232674168308645, -0.0109776412072081, -0.0380111403227512 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3919),
				new double[] { 0.0956496454610331, -0.101363654773411, 0.000769656350630595, 0.0227778478179399 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3941),
				new double[] { 0.10614129398929, -0.0181800423271816, 0.00344992731423301, 0.0105261443157436 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3302),
				new double[] { 0.105950756194329, 0.0441568710366552, -0.0108484779377807, -0.00795772429143513 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3749),
				new double[] { -0.10957465946659, 0.00626878529880506, -0.0195692896964687, 0.0174290155593914 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4588),
				new double[] { 0.113494970316787, 0.0177746306681566, 0.00185780788935478, 0.025884951661825 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3760),
				new double[] { -0.0933314872330679, 0.000227208604398367, 0.0485244077737116, -0.00734875151436263 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3136),
				new double[] { 0.10940554425898, 0.0462397128502773, -0.00862450235047189, -0.00103292577982149 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3106),
				new double[] { 0.0987439848906761, -0.120969923094566, 0.00211878664631794, 0.00567039696308948 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4539),
				new double[] { 0.122086538468809, 0.0433211612956425, -0.0011687116939617, -0.00407030254807737 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4064),
				new double[] { -0.117648324879345, 0.00523312006809122, -0.0479160053665638, 0.0381372725452367 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3683),
				new double[] { 0.115121831638634, 0.0436617876849426, -0.00223872806673582, -0.0280002281425843 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4234),
				new double[] { 0.118468609934085, 0.046502591841582, 0.00102634399730824, 0.0182340205116621 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4522),
				new double[] { 0.116498305927337, 0.0430997723756611, -0.00272638844330006, 0.018130903648587 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4320),
				new double[] { -0.114153736010083, 4.57903527815741E-05, -0.0349994962131308, 0.0173258788937003 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4192),
				new double[] { 0.0887710399665171, -0.113143810108991, 0.0115304453825944, 0.0254051886745588 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3317),
				new double[] { 0.0574912673296435, -0.0945470044623068, 0.0104578308661697, 0.0311955650722054 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3053),
				new double[] { -0.0298969375607887, -0.0489666948077613, -0.00197411541069454, -0.0185335316573132 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4204),
				new double[] { 0.0853587844176431, -0.111637977873578, 0.0113675119090599, 0.0200885013336043 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4472),
				new double[] { 0.112568401508806, 0.0438827875067282, -0.0294729575345699, -0.0511404531731626 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3503),
				new double[] { 0.0249971911982234, 0.035761013670215, 0.0193774745392707, -0.0173746298847489 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3702),
				new double[] { -0.0902905617060306, 0.00423406625996634, 0.0510176064290681, -0.0276717771086904 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3921),
				new double[] { 0.0953393033280024, -0.1105019430613, 0.011146673791728, 0.0203569587110017 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4105),
				new double[] { -0.104754961041144, 0.0134491370755576, 0.0112356428453459, 0.0222201393190684 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3971),
				new double[] { -0.092515197674981, 0.00850907379091728, 0.0293687720421329, 0.00303922218139293 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4111),
				new double[] { -0.1001906471432, 0.00826285097671363, 0.000184271004676373, 0.0252635590503485 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3699),
				new double[] { -0.0943080104634607, 0.00956249620624761, 0.0398305126666947, -0.00688023994607811 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4282),
				new double[] { 0.121940615164303, 0.0450187772491858, 0.00154032288168494, 0.00776120974488982 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3894),
				new double[] { 0.111354859086201, 0.0485351142124083, 0.00875254359666026, 0.0186554228451169 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3641),
				new double[] { -0.107993153475395, 0.00674859683321289, -0.0199672164070082, 0.0233780091224362 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3567),
				new double[] { -0.102891975280034, 0.00131768406207958, 0.0203085297540863, -0.0711239425623591 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4175),
				new double[] { 0.0510551527567364, -0.100639504480558, 0.00820258925361971, 0.0364895752209264 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4232),
				new double[] { 0.10788847206256, 0.0158489551258995, 0.0118533713572226, 0.0356162302449089 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4009),
				new double[] { 0.115254001592066, 0.034565081924215, -0.0278059206543092, -0.0677003866037234 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3395),
				new double[] { -0.108111783989659, 0.00247217846983326, -0.0414224261120335, 0.0284492349273114 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3733),
				new double[] { -0.104824777782282, 0.00549122841504097, 0.0543427652690374, -0.0144020067403356 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3893),
				new double[] { 0.113609904025144, 0.0490285179953271, 0.00655910979966578, 0.0209159588172664 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3655),
				new double[] { 0.122146437532383, 0.0406151463145538, -0.00412346200496743, -0.0175192622216817 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3275),
				new double[] { 0.111545859743604, 0.0472183267473519, 0.00283029366287744, 0.0190221093042433 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3411),
				new double[] { -0.103391059701109, 0.00540906449255149, 0.0243750239035852, -0.0727769321835092 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3737),
				new double[] { -0.0905183469863478, 0.0114623927756567, 0.0446431670486279, -0.00308742974018999 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4131),
				new double[] { -0.0934338312247698, -0.00597887585938294, -0.0269360565176325, 0.0263809416778993 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4426),
				new double[] { -0.0946821796035236, 0.00858609162398147, 0.0472579914605545, -0.00359146082953736 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4158),
				new double[] { -0.0405427756212477, -0.0435849518847359, -0.0091113586743369, -0.00903711947369969 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3677),
				new double[] { 0.104392758716683, 0.0470426385785893, -0.0165153562021636, -0.0227889811048987 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3099),
				new double[] { 0.0948516247325449, -0.11417314183033, 0.00711969104977724, -0.00374263746404761 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3927),
				new double[] { 0.0891563302051233, -0.12284671851355, -0.000426971254874202, -0.0214240837348984 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3553),
				new double[] { -0.0968596414380415, -0.00563154174079002, 0.0093628140214844, -0.0143902940101818 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3867),
				new double[] { -0.109230145725845, 0.00425208042703568, -0.03361916308194, 0.0302596740983642 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3032),
				new double[] { 0.0308078144782111, -0.0909655627382942, 0.0104395519609466, 0.0154671815366166 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4573),
				new double[] { -0.116743636767895, 0.00379644008909291, -0.0538866069196206, 0.0157253233740319 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4097),
				new double[] { -0.109272349994598, 0.00571527080239984, -0.000451423693853715, -0.0256214582362822 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3990),
				new double[] { 0.0933879624180235, -0.126453844592936, -0.00685603921824609, -0.0294181710849956 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4240),
				new double[] { 0.110319759051367, 0.0448353820986303, 0.00430215502405176, 0.0242654349488198 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4434),
				new double[] { -0.0775509350086182, 0.0167059065248706, 0.0374917264748363, 0.0133609416829599 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4570),
				new double[] { -0.0935255319761113, 0.011860945083375, 0.0115959429889811, 0.00400710237971531 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3996),
				new double[] { 0.122785698837013, 0.0477058827587253, -0.00705724849752382, -0.0104632744390156 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3970),
				new double[] { -0.0910477866474839, 0.00316515490123345, 0.00494717075594369, 0.0102800437307904 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3160),
				new double[] { 0.123222774864138, 0.0309493568377793, -0.00780250216865647, -0.0147082316377414 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4331),
				new double[] { -0.120905996097012, -0.00320431151397759, -0.040338306131218, 0.013204870778352 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4305),
				new double[] { -0.113199959623205, 0.0027063645779123, -0.0410210847430741, 0.0379977182982401 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4138),
				new double[] { -0.110267371823247, 0.00814321773322611, -0.00195765910762936, 0.0251704903986065 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4181),
				new double[] { 0.0751514418007462, -0.102227805112177, 0.00500444523979853, 0.0290828083446932 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4001),
				new double[] { -0.100627909154496, 0.00373493636046949, 0.0298362002699, 0.00156479139112271 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4466),
				new double[] { -0.0938248296249176, 0.00395664533071213, 0.045402071983311, -0.00591287648399388 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3741),
				new double[] { 0.10961541895605, 0.019310823428036, 0.00389985637830232, 0.0287307412989913 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3324),
				new double[] { 0.121403024916383, 0.0348439999015857, -0.032321949339, -0.0516292391262079 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3800),
				new double[] { -0.00367982432699249, 0.00352455488744936, 0.00585059435167464, 0.00779072767246153 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4526),
				new double[] { 0.121860502030412, 0.0404666117012119, -0.00519223770424657, -0.00541004246260128 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3967),
				new double[] { -0.0940201856877438, 0.00654193797348732, 0.0453718281693155, -0.00392558217988757 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3509),
				new double[] { -0.0958998423069336, 0.00599689861993314, 0.039827468997937, -0.025704974067758 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4255),
				new double[] { 0.110908149997227, 0.0469223490996658, -0.00211868342971215, 0.00848883768665257 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3414),
				new double[] { -0.0531233187299988, 0.021016877499661, 0.0328364074814525, 0.00690344940337095 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3762),
				new double[] { 0.113423828211838, 0.0376362492047553, -0.00333186459284226, 0.0248164620815904 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3336),
				new double[] { -0.103246239029969, 0.00792268384063207, -0.0118954575941188, 0.015443510225671 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3475),
				new double[] { 0.081213406903394, 0.0435970309306761, 0.00181314782256859, 0.0110642568015899 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3983),
				new double[] { 0.0901378698483628, -0.110903228054924, 0.00269471544530945, 0.0028136596170446 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3272),
				new double[] { 0.110493518134378, 0.0393557835263222, -0.0054246864480271, 0.00927404405714874 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4160),
				new double[] { -0.0567877171168487, -0.0273196864823578, 0.00261883272512464, 0.0317729515575572 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4455),
				new double[] { 0.123701487956049, 0.0457151053818833, -0.0230850619728465, -0.041402850228968 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3402),
				new double[] { -0.112416664109854, 0.00470943307662057, -0.045785649867674, 0.033577356492305 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3692),
				new double[] { -0.0976764476946881, 0.00103781313571433, 0.04189761690306, -0.0450108920892413 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3804),
				new double[] { -0.0725936071896506, 0.0223988294820366, 0.0437112444358819, -0.00171077403430294 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4016),
				new double[] { -0.088035039767434, -0.00251042078029871, 0.0392800918838035, -0.0126583963923195 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4532),
				new double[] { 0.11236208863288, 0.0338592785877353, -0.0172226924419665, -0.0127679809429574 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4433),
				new double[] { -0.0977017043946078, 0.00693949785105478, 0.0493351650963324, -0.00188537930827787 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4079),
				new double[] { 0.112632652591751, 0.0461917906059718, -9.54580159089671E-05, 0.0138139101083459 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3155),
				new double[] { 0.126514619552283, 0.0439190445539543, 0.000677975106032244, 0.00574784568852768 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4136),
				new double[] { -0.101693820790064, 0.0056668619142939, -0.0176129128966179, 0.0255352967014434 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4083),
				new double[] { 0.116038827624356, 0.0342200381826687, -0.00680449626665793, -4.83204425062075E-05 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4484),
				new double[] { -0.0842168809516091, 0.00933080274738563, 0.0314347473423035, -0.0450411953105952 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3792),
				new double[] { 0.114289829783906, 0.0472311352985722, -0.00222948422778618, 0.00379242068707482 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3347),
				new double[] { -0.11053065484387, 0.00231912285930823, -0.0239224547812214, 0.0212774292599811 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3873),
				new double[] { 0.0891199812097848, -0.0880540272888605, -0.0012337750359263, 0.0280014503651683 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3202),
				new double[] { 0.128656613842886, 0.0373026140838708, -0.0107814395169589, -0.0252352523332863 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3606),
				new double[] { -0.0995646841408119, 0.00265332988614328, 0.0383874350541644, -0.0102679026449772 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3561),
				new double[] { -0.10489149431155, 0.00741957379468501, -0.0175992995690538, -0.062960069274912 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3580),
				new double[] { -0.108050763058219, 0.00218153358921555, 0.0432003172605357, -0.0145626953911201 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3197),
				new double[] { 0.128418484943353, 0.0264913386953932, -0.00180917523191131, -0.00253032469069545 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3918),
				new double[] { 0.0946204834129338, -0.123483096778033, 0.00256690377318642, 0.0199638185887234 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4351),
				new double[] { -0.11500813575674, 0.00459051501108003, -0.0470803180339826, 0.0299209489186693 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3463),
				new double[] { -0.112000875915601, 0.00282084741677062, -0.0188546855126422, 0.0160138084027356 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4067),
				new double[] { -0.0975992683874796, 0.00423678018803191, 0.0303769943899111, 0.00122998269324157 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3635),
				new double[] { -0.112841616925967, 0.0064229849183393, -0.0231925526300434, 0.0273738501365647 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3147),
				new double[] { 0.121963978487101, 0.0434809423704048, -0.0106607805381052, -0.00137709136060606 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4173),
				new double[] { 0.092582581294881, -0.109213542476457, 0.0138328696238931, 0.0326227057372202 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4265),
				new double[] { 0.118361268125235, 0.0447801193459052, 0.000015324361404533, 0.0201917100578609 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3585),
				new double[] { -0.0998514882343874, 0.00314531748135538, -0.00271405389548264, 0.00252473212760113 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4562),
				new double[] { -0.0917956608350491, 0.00666395157274029, 0.0143280809461319, 0.00669417191802095 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3280),
				new double[] { 0.127658928690371, 0.0335763890383116, -0.00780954021076111, -0.00842098112581463 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4153),
				new double[] { -0.100899229622909, 0.0084333480090769, 0.000492678590612764, 0.00562502436320706 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3636),
				new double[] { -0.100479456805496, 0.00915963648161906, -0.00856775421145547, 0.0124365259160117 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4210),
				new double[] { 0.0920870781639284, -0.108145212055738, 0.0125271647157622, 0.0334875598141779 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3193),
				new double[] { 0.127997751786482, 0.0338178861343622, -0.0099287544758032, -0.0240792683083038 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4584),
				new double[] { -0.0989380806442594, 0.00545205035765735, -0.0119037970583595, 0.0197493444145929 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3424),
				new double[] { -0.0954349592383071, 0.00604301680829014, 0.0402988058748487, 0.000884531205705886 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4409),
				new double[] { -0.0989733941096516, 0.00807671424718667, 0.046990811249439, -0.00618535767545242 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3706),
				new double[] { -0.0892837189872204, 0.0102294780002538, 0.0370057011139946, -0.00129775609071048 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4182),
				new double[] { 0.0709418749629192, -0.0779274637155678, 0.00918271352068509, 0.0322085122436168 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3638),
				new double[] { -0.108493474786666, 0.00375937187555373, -0.0260934404134969, 0.0197611831863508 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3821),
				new double[] { -0.0993850667439897, 0.00352819673830102, 0.0324947614675559, 0.00625174284603194 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3755),
				new double[] { 0.114742934407836, 0.0433589788801671, 0.00265696191316055, 0.012048300644636 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3246),
				new double[] { 0.0504167980955422, 0.0386031566114591, 0.0288760622827955, 0.0265951192376838 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3876),
				new double[] { -0.093860227393199, 0.0128130983046377, 0.0451017811779277, 0.00632104642629392 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3248),
				new double[] { 0.122362967415954, 0.0211234363145264, 0.004799732235222, 0.0284262827644498 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4021),
				new double[] { 0.104743875012753, 0.0428662171567311, -0.00758505745876749, 0.0164354776820197 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4082),
				new double[] { 0.122421983378664, 0.0347903237786322, -0.0104989793758751, -0.0140630509564912 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3182),
				new double[] { 0.108483491379754, 0.0364112260810937, -0.0185985499041436, -0.0499267189131071 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4304),
				new double[] { -0.113346694626143, 0.00494995982280668, -0.037428412011972, 0.0373022679327431 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3727),
				new double[] { -0.082689025549786, 0.0139178077531771, 0.0426708686263879, -0.00928917505213519 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3607),
				new double[] { -0.0976229640388872, 0.00495680053476357, 0.0394368883543326, -0.00106958780334903 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3231),
				new double[] { 0.13534837817092, 0.0224843703425227, -0.00280932471129805, 0.0126888503248072 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4112),
				new double[] { 0.101819705651995, -0.0285530768393604, 0.00951635243752296, 0.0366082117015304 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3735),
				new double[] { -0.102352168252054, 0.00242015015826168, 0.0455796464602957, -0.0110039865641728 });
		mapVaridMdsXY.put(BigDecimal.valueOf(3153),
				new double[] { 0.11991408792489, 0.0454760072308839, -0.0015753247204847, 0.00172413248448408 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4062),
				new double[] { -0.111705420852326, -0.00144855285187987, -0.0416340128744291, 0.0237925840966684 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4292),
				new double[] { -0.117509782365923, 0.00585388319614311, -0.0466994034616343, 0.0391145980833197 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4431),
				new double[] { -0.100994166979796, 0.00744173405854623, 0.0483524323911351, 0.000341333428647818 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4567),
				new double[] { -0.119620297874737, 0.00615984808632371, -0.0465742704158205, 0.0433606889079138 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4315),
				new double[] { -0.11568895236324, 0.00121172674949975, -0.0554434023809879, 0.0199952293736975 });
		mapVaridMdsXY.put(BigDecimal.valueOf(4444),
				new double[] { -0.100352781072794, 0.00481404894630752, 0.0485287994507246, -0.00607621280172674 });

		return mapVaridMdsXY;
	}

	private static Map getXY1(Map mapIrisid2MdsXY) {

		mapIrisid2MdsXY.put("IRIS_313-11254", new double[] { 0.0992362673402882, 0.0238542360392027 });
		mapIrisid2MdsXY.put("IRIS_313-11255", new double[] { 0.0886582875373711, 0.00777076617347057 });
		mapIrisid2MdsXY.put("IRIS_313-11256", new double[] { 0.108605336284732, 0.0101609073375719 });
		mapIrisid2MdsXY.put("IRIS_313-11257", new double[] { 0.0244477826898875, 0.0284398427507484 });
		mapIrisid2MdsXY.put("IRIS_313-11258", new double[] { -0.111432127643085, -0.026577015066982 });
		mapIrisid2MdsXY.put("IRIS_313-11259", new double[] { -0.156516298403593, -0.0203100372878527 });
		mapIrisid2MdsXY.put("IRIS_313-11260", new double[] { 0.0843092649765563, -0.00212620244946676 });
		mapIrisid2MdsXY.put("IRIS_313-11261", new double[] { 0.101346081886422, 0.0195149991059809 });
		mapIrisid2MdsXY.put("IRIS_313-11262", new double[] { 0.106239344671786, 0.00767061371558497 });
		mapIrisid2MdsXY.put("IRIS_313-11263", new double[] { 0.0514415850135202, 0.0242700079520641 });
		mapIrisid2MdsXY.put("IRIS_313-11264", new double[] { 0.104983673737735, 0.0168674902898432 });
		mapIrisid2MdsXY.put("IRIS_313-11265", new double[] { 0.0411510622819449, -0.17477123119322 });
		mapIrisid2MdsXY.put("IRIS_313-11266", new double[] { 0.105563130732139, 0.0218074019862687 });
		mapIrisid2MdsXY.put("IRIS_313-11267", new double[] { 0.1024063773248, 0.0132043118192823 });
		mapIrisid2MdsXY.put("IRIS_313-11268", new double[] { -0.146903778396441, -0.0247597837769144 });
		mapIrisid2MdsXY.put("IRIS_313-11269", new double[] { -0.0028285578002314, 0.0164934458514848 });
		mapIrisid2MdsXY.put("IRIS_313-11270", new double[] { -0.0760088242529112, 0.00623935186346357 });
		mapIrisid2MdsXY.put("IRIS_313-11271", new double[] { 0.103833819432788, 0.00907136404845447 });
		mapIrisid2MdsXY.put("IRIS_313-11272", new double[] { 0.0493755968795128, -0.179503609440694 });
		mapIrisid2MdsXY.put("IRIS_313-11273", new double[] { 0.114970341399172, 0.00729587191166188 });
		mapIrisid2MdsXY.put("IRIS_313-11274", new double[] { 0.0663324310559963, -0.133823230058509 });
		mapIrisid2MdsXY.put("IRIS_313-11275", new double[] { 0.0971797946195054, -0.00842720017430487 });
		mapIrisid2MdsXY.put("IRIS_313-11276", new double[] { 0.0609846580659265, 0.0226415531039571 });
		mapIrisid2MdsXY.put("IRIS_313-11277", new double[] { 0.0615572310931262, -0.158182851408715 });
		mapIrisid2MdsXY.put("IRIS_313-11278", new double[] { 0.104014224842969, 0.011512772167331 });
		mapIrisid2MdsXY.put("IRIS_313-11279", new double[] { 0.0672230019523377, 0.0204240888013887 });
		mapIrisid2MdsXY.put("IRIS_313-11280", new double[] { 0.0948990627461288, 0.0284898219677161 });
		mapIrisid2MdsXY.put("IRIS_313-11281", new double[] { 0.10059373588341, 0.0147052438909026 });
		mapIrisid2MdsXY.put("IRIS_313-11282", new double[] { 0.10216432883829, 0.00686255689662399 });
		mapIrisid2MdsXY.put("IRIS_313-11283", new double[] { 0.0858426851391968, 0.00984846233593872 });
		mapIrisid2MdsXY.put("IRIS_313-11284", new double[] { 0.0952659098081321, 0.015376452631828 });
		mapIrisid2MdsXY.put("IRIS_313-11285", new double[] { 0.0960419321534518, -0.00762213726094293 });
		mapIrisid2MdsXY.put("IRIS_313-11286", new double[] { 0.0775355078796772, -0.000173383025941232 });
		mapIrisid2MdsXY.put("IRIS_313-11287", new double[] { 0.102476225148278, 0.0181681911038404 });
		mapIrisid2MdsXY.put("IRIS_313-11288", new double[] { 0.0809656961419987, 0.00805670041922823 });
		mapIrisid2MdsXY.put("IRIS_313-11289", new double[] { -0.147540873451634, -0.0282008274514447 });
		mapIrisid2MdsXY.put("IRIS_313-11290", new double[] { -0.00839407656658293, 0.013155469067854 });
		mapIrisid2MdsXY.put("IRIS_313-11291", new double[] { 0.0332978389225373, -0.148889430941242 });
		mapIrisid2MdsXY.put("IRIS_313-11292", new double[] { 0.100212049954048, 0.0151541009121874 });
		mapIrisid2MdsXY.put("IRIS_313-11293", new double[] { -0.147065706904105, -0.0290348196294237 });
		mapIrisid2MdsXY.put("IRIS_313-11294", new double[] { 0.099511748193023, 0.0168965544358426 });
		mapIrisid2MdsXY.put("IRIS_313-11295", new double[] { 0.0144096315695689, -0.0113428149991069 });
		mapIrisid2MdsXY.put("IRIS_313-11296", new double[] { 0.101561665363604, 0.0123042546689151 });
		mapIrisid2MdsXY.put("IRIS_313-11297", new double[] { -0.17454357891061, -0.016778497114913 });
		mapIrisid2MdsXY.put("IRIS_313-11298", new double[] { 0.0267537353562469, -0.174420678654143 });
		mapIrisid2MdsXY.put("IRIS_313-11299", new double[] { 0.0905905840513492, 0.0190751725465264 });
		mapIrisid2MdsXY.put("IRIS_313-11300", new double[] { 0.0918581627386455, -0.0138715304699334 });
		mapIrisid2MdsXY.put("IRIS_313-11301", new double[] { 0.108290905695889, 0.0015145911406768 });
		mapIrisid2MdsXY.put("IRIS_313-11302", new double[] { 0.0942188833661367, -0.0347501864360302 });
		mapIrisid2MdsXY.put("IRIS_313-11303", new double[] { 0.100868874311944, -0.00210685722315894 });
		mapIrisid2MdsXY.put("IRIS_313-11304", new double[] { 0.0978651527560459, 0.0238754639749603 });
		mapIrisid2MdsXY.put("IRIS_313-11305", new double[] { 0.057216888992497, 0.023218068975456 });
		mapIrisid2MdsXY.put("IRIS_313-11306", new double[] { 0.0955417198313221, 0.0153331050010589 });
		mapIrisid2MdsXY.put("IRIS_313-11307", new double[] { 0.103184044796145, 0.0137609138296586 });
		mapIrisid2MdsXY.put("IRIS_313-11308", new double[] { 0.109521882872757, 0.0166045427877319 });
		mapIrisid2MdsXY.put("IRIS_313-11309", new double[] { 0.105814597751224, 0.0203660342998092 });
		mapIrisid2MdsXY.put("IRIS_313-11310", new double[] { 0.10292543540611, 0.00553782669540818 });
		mapIrisid2MdsXY.put("IRIS_313-11311", new double[] { -0.182573196603686, 0.00997033411548908 });
		mapIrisid2MdsXY.put("IRIS_313-11312", new double[] { 0.0899753238480635, 0.0267790909208632 });
		mapIrisid2MdsXY.put("IRIS_313-11313", new double[] { -0.17487591295625, 0.00389118686829874 });
		mapIrisid2MdsXY.put("IRIS_313-11314", new double[] { -0.190585118540428, 0.00706311165887834 });
		mapIrisid2MdsXY.put("IRIS_313-11315", new double[] { 0.0982158345065974, 0.0259163895611307 });
		mapIrisid2MdsXY.put("IRIS_313-11316", new double[] { 0.0912021218383688, 0.0269797392455183 });
		mapIrisid2MdsXY.put("IRIS_313-11317", new double[] { 0.103373805614759, 0.0233111063607223 });
		mapIrisid2MdsXY.put("IRIS_313-11318", new double[] { 0.0986606644225904, 0.0179961090303486 });
		mapIrisid2MdsXY.put("IRIS_313-11319", new double[] { 0.0924409332314054, 0.0194733113396712 });
		mapIrisid2MdsXY.put("IRIS_313-11320", new double[] { 0.0948819507833634, 0.0234218649164024 });
		mapIrisid2MdsXY.put("IRIS_313-11321", new double[] { 0.106853073894196, 0.0038266170585017 });
		mapIrisid2MdsXY.put("IRIS_313-11322", new double[] { 0.0307541108511872, -0.173766300387342 });
		mapIrisid2MdsXY.put("IRIS_313-11323", new double[] { 0.0493131377804982, -0.181205733302061 });
		mapIrisid2MdsXY.put("IRIS_313-11324", new double[] { 0.0477617293831794, -0.18187772611287 });
		mapIrisid2MdsXY.put("IRIS_313-11325", new double[] { 0.102447672469291, 0.00975219134610051 });
		mapIrisid2MdsXY.put("IRIS_313-11326", new double[] { 0.102951072432748, 0.0230039119175014 });
		mapIrisid2MdsXY.put("IRIS_313-11327", new double[] { 0.10161309273864, 0.0278617402825065 });
		mapIrisid2MdsXY.put("IRIS_313-11328", new double[] { -0.182423524050357, 0.00457588644346856 });
		mapIrisid2MdsXY.put("IRIS_313-11329", new double[] { -0.182635527951845, 0.0094036119866192 });
		mapIrisid2MdsXY.put("IRIS_313-11330", new double[] { 0.0945070545731907, 0.0293284580814296 });
		mapIrisid2MdsXY.put("IRIS_313-11331", new double[] { 0.104598565947386, 0.0242379828051875 });
		mapIrisid2MdsXY.put("IRIS_313-11334", new double[] { 0.105381002710351, 0.0174972825724479 });
		mapIrisid2MdsXY.put("IRIS_313-11335", new double[] { 0.0988674066038591, -0.00471628172600169 });
		mapIrisid2MdsXY.put("IRIS_313-11336", new double[] { -0.199142139796432, 0.0133417273204391 });
		mapIrisid2MdsXY.put("IRIS_313-11337", new double[] { -0.180673189018017, 0.0104250881243751 });
		mapIrisid2MdsXY.put("IRIS_313-11338", new double[] { 0.0991304417693853, 0.0191105624831268 });
		mapIrisid2MdsXY.put("IRIS_313-11339", new double[] { 0.102280017108369, -0.00294883859619071 });
		mapIrisid2MdsXY.put("IRIS_313-11340", new double[] { -0.180969999730094, 0.00604780629753381 });
		mapIrisid2MdsXY.put("IRIS_313-11341", new double[] { 0.10323107908842, 0.0223173071562255 });
		mapIrisid2MdsXY.put("IRIS_313-11342", new double[] { 0.0318474462606802, 0.0301449007169675 });
		mapIrisid2MdsXY.put("IRIS_313-11343", new double[] { 0.0955534143477055, 0.023436840477085 });
		mapIrisid2MdsXY.put("IRIS_313-11344", new double[] { 0.0975476682638601, 0.0103846083312109 });
		mapIrisid2MdsXY.put("IRIS_313-11345", new double[] { 0.0970332649759901, 0.0121341166978396 });
		mapIrisid2MdsXY.put("IRIS_313-11346", new double[] { 0.103558972700644, 0.0171357149203252 });
		mapIrisid2MdsXY.put("IRIS_313-11347", new double[] { 0.0974611250558079, 0.0183108980203863 });
		mapIrisid2MdsXY.put("IRIS_313-11348", new double[] { 0.0453148472948932, -0.175898795936193 });
		mapIrisid2MdsXY.put("IRIS_313-11349", new double[] { 0.109983386952853, 0.00693263771179036 });
		mapIrisid2MdsXY.put("IRIS_313-11350", new double[] { -0.122231149386779, -0.040622121256112 });
		mapIrisid2MdsXY.put("IRIS_313-11351", new double[] { 0.116582711097216, 0.00023438502884932 });
		mapIrisid2MdsXY.put("IRIS_313-11352", new double[] { -0.0905556143072225, 0.00239201355488794 });
		mapIrisid2MdsXY.put("IRIS_313-11353", new double[] { 0.0563363933045573, -0.16040630910495 });
		mapIrisid2MdsXY.put("IRIS_313-11354", new double[] { 0.0997064070906708, -0.00104866991950239 });
		mapIrisid2MdsXY.put("IRIS_313-11355", new double[] { 0.0774575161592476, -0.0507825556184642 });
		mapIrisid2MdsXY.put("IRIS_313-11356", new double[] { -0.1383042433478, -0.0439159830901041 });
		mapIrisid2MdsXY.put("IRIS_313-11357", new double[] { 0.104693050637121, 0.0169225128369711 });
		mapIrisid2MdsXY.put("IRIS_313-11358", new double[] { 0.111134201003711, 0.00666420580678212 });
		mapIrisid2MdsXY.put("IRIS_313-11359", new double[] { 0.104554748121185, 0.00604545923252686 });
		mapIrisid2MdsXY.put("IRIS_313-11360", new double[] { -0.122820704113851, -0.0228815072014422 });
		mapIrisid2MdsXY.put("IRIS_313-11361", new double[] { 0.107488361215814, -0.00337128085666532 });
		mapIrisid2MdsXY.put("IRIS_313-11362", new double[] { -0.130515894584353, -0.0472501332097594 });
		mapIrisid2MdsXY.put("IRIS_313-11363", new double[] { 0.105439770391472, 0.0069627672709741 });
		mapIrisid2MdsXY.put("IRIS_313-11364", new double[] { 0.0198532871045605, 0.00460133613099671 });
		mapIrisid2MdsXY.put("IRIS_313-11365", new double[] { 0.111736229958329, 0.00764965373462471 });
		mapIrisid2MdsXY.put("IRIS_313-11367", new double[] { 0.109573237675174, 0.00159980616635015 });
		mapIrisid2MdsXY.put("IRIS_313-11368", new double[] { 0.10440973955499, 0.0118128752144298 });
		mapIrisid2MdsXY.put("IRIS_313-11369", new double[] { 0.0996997985515308, 0.00442305783602615 });
		mapIrisid2MdsXY.put("IRIS_313-11370", new double[] { 0.108368579126805, 0.00129058081575819 });
		mapIrisid2MdsXY.put("IRIS_313-11371", new double[] { 0.0449483438510794, -0.17824112786373 });
		mapIrisid2MdsXY.put("IRIS_313-11372", new double[] { 0.106278093624275, -0.00256965590175038 });
		mapIrisid2MdsXY.put("IRIS_313-11373", new double[] { -0.140202419581927, -0.0389468553174881 });
		mapIrisid2MdsXY.put("IRIS_313-11374", new double[] { 0.0281913344478825, -0.172471914947514 });
		mapIrisid2MdsXY.put("IRIS_313-11375", new double[] { -0.0621302123456764, -0.019753597515657 });
		mapIrisid2MdsXY.put("IRIS_313-11376", new double[] { -0.191087345178528, 0.00354525023665341 });
		mapIrisid2MdsXY.put("IRIS_313-11377", new double[] { 0.092461782650904, 0.0167457959063077 });
		mapIrisid2MdsXY.put("IRIS_313-11379", new double[] { -0.178167165826699, 0.00576917285282753 });
		mapIrisid2MdsXY.put("IRIS_313-11380", new double[] { -0.0920040451956654, 0.0444912344675811 });
		mapIrisid2MdsXY.put("IRIS_313-11381", new double[] { 0.105840021026929, 0.0233572738820909 });
		mapIrisid2MdsXY.put("IRIS_313-11382", new double[] { 0.102743935060755, -0.000100490678594887 });
		mapIrisid2MdsXY.put("IRIS_313-11383", new double[] { 0.081280571732504, 0.0156866768356926 });
		mapIrisid2MdsXY.put("IRIS_313-11384", new double[] { 0.0756470901750607, 0.0180934449124456 });
		mapIrisid2MdsXY.put("IRIS_313-11385", new double[] { 0.103980478946468, 0.0110816783570373 });
		mapIrisid2MdsXY.put("IRIS_313-11386", new double[] { 0.105332589787557, 0.0246552266787533 });
		mapIrisid2MdsXY.put("IRIS_313-11387", new double[] { 0.0981308605069981, 0.00594837346321986 });
		mapIrisid2MdsXY.put("IRIS_313-11388", new double[] { 0.102956782216345, 0.023873491133253 });
		mapIrisid2MdsXY.put("IRIS_313-11389", new double[] { 0.105564011288813, 0.0214769057741673 });
		mapIrisid2MdsXY.put("IRIS_313-11390", new double[] { 0.105623109124596, 0.0249348871180673 });
		mapIrisid2MdsXY.put("IRIS_313-11391", new double[] { 0.103536796626855, 0.0213344816255016 });
		mapIrisid2MdsXY.put("IRIS_313-11392", new double[] { 0.109275537937729, 0.0159893445117582 });
		mapIrisid2MdsXY.put("IRIS_313-11393", new double[] { 0.106404029851467, 0.0265309393914531 });
		mapIrisid2MdsXY.put("IRIS_313-11394", new double[] { 0.106940401787195, 0.0158327057064777 });
		mapIrisid2MdsXY.put("IRIS_313-11395", new double[] { 0.095237799233643, 0.0193188466577391 });
		mapIrisid2MdsXY.put("IRIS_313-11396", new double[] { -0.176544820045577, 0.00915331494515381 });
		mapIrisid2MdsXY.put("IRIS_313-11397", new double[] { -0.179482375377864, 9.30951444409278E-06 });
		mapIrisid2MdsXY.put("IRIS_313-11398", new double[] { 0.105200739587609, 0.020513008139763 });
		mapIrisid2MdsXY.put("IRIS_313-11399", new double[] { 0.111341884312066, 0.00540699816756196 });
		mapIrisid2MdsXY.put("IRIS_313-11400", new double[] { 0.0960116036874169, 0.0114634806587824 });
		mapIrisid2MdsXY.put("IRIS_313-11401", new double[] { -0.141928376120455, -0.0272820980289131 });
		mapIrisid2MdsXY.put("IRIS_313-11402", new double[] { 0.104003295469782, 0.0120009871882011 });
		mapIrisid2MdsXY.put("IRIS_313-11403", new double[] { 0.0875051394214297, 0.0157052147272475 });
		mapIrisid2MdsXY.put("IRIS_313-11404", new double[] { 0.100892379084909, 0.017207124862706 });
		mapIrisid2MdsXY.put("IRIS_313-11405", new double[] { 0.0997257036850075, 0.0156318577763598 });
		mapIrisid2MdsXY.put("IRIS_313-11406", new double[] { 0.101345573381663, 0.0293782860536913 });
		mapIrisid2MdsXY.put("IRIS_313-11407", new double[] { 0.08939006515221, 0.00923371602238327 });
		mapIrisid2MdsXY.put("IRIS_313-11408", new double[] { 0.104180262877805, 0.0014142056873108 });
		mapIrisid2MdsXY.put("IRIS_313-11409", new double[] { 0.0905268929324872, -0.0151071091520433 });
		mapIrisid2MdsXY.put("IRIS_313-11410", new double[] { 0.0993963491833132, -0.00298990733730677 });
		mapIrisid2MdsXY.put("IRIS_313-11411", new double[] { 0.0968433167948321, -0.0128789244610892 });
		mapIrisid2MdsXY.put("IRIS_313-11413", new double[] { -0.0543572887434098, -0.141485046884117 });
		mapIrisid2MdsXY.put("IRIS_313-11414", new double[] { 0.103087489059222, -0.00695145912379806 });
		mapIrisid2MdsXY.put("IRIS_313-11415", new double[] { 0.0174232671659093, -0.0141369571543255 });
		mapIrisid2MdsXY.put("IRIS_313-11416", new double[] { 0.108522993253901, 0.0059498481892509 });
		mapIrisid2MdsXY.put("IRIS_313-11417", new double[] { -0.0202873437438625, -0.0284215391350628 });
		mapIrisid2MdsXY.put("IRIS_313-11418", new double[] { 0.109427248579639, -0.00039963361115503 });
		mapIrisid2MdsXY.put("IRIS_313-11419", new double[] { 0.0920938620522382, -0.00539068880687458 });
		mapIrisid2MdsXY.put("IRIS_313-11420", new double[] { 0.0939131097784928, -0.0173126743830475 });
		mapIrisid2MdsXY.put("IRIS_313-11421", new double[] { 0.0881451774560825, 1.47720447537257E-05 });
		mapIrisid2MdsXY.put("IRIS_313-11422", new double[] { 0.0851912017099968, 0.0179104479935164 });
		mapIrisid2MdsXY.put("IRIS_313-11423", new double[] { 0.0813099293966901, 0.0374860976148564 });
		mapIrisid2MdsXY.put("IRIS_313-11424", new double[] { -0.181609644519626, 0.00663345644963657 });
		mapIrisid2MdsXY.put("IRIS_313-11425", new double[] { -0.0620890113043016, 0.0377751811752213 });
		mapIrisid2MdsXY.put("IRIS_313-11426", new double[] { -0.186394542930658, 0.00383069608276841 });
		mapIrisid2MdsXY.put("IRIS_313-11427", new double[] { -0.188870950086598, 0.000826310386182704 });
		mapIrisid2MdsXY.put("IRIS_313-11428", new double[] { -0.19185568525307, 0.00785688825111553 });
		mapIrisid2MdsXY.put("IRIS_313-11429", new double[] { -0.185666516067338, 0.00647279500180818 });
		mapIrisid2MdsXY.put("IRIS_313-11431", new double[] { 0.0884196923456583, 0.0348771377467421 });
		mapIrisid2MdsXY.put("IRIS_313-11432", new double[] { 0.0807720968248353, -0.0628235168534998 });
		mapIrisid2MdsXY.put("IRIS_313-11433", new double[] { 0.0962728711971878, 0.015835934192439 });
		mapIrisid2MdsXY.put("IRIS_313-11434", new double[] { -0.187949779512212, 0.0112187208672601 });
		mapIrisid2MdsXY.put("IRIS_313-11435", new double[] { -0.191206772078167, 0.00738457779030626 });
		mapIrisid2MdsXY.put("IRIS_313-11436", new double[] { -0.18934672800179, 0.0097986953835249 });
		mapIrisid2MdsXY.put("IRIS_313-11437", new double[] { 0.0954576111865282, 0.0274629718719561 });
		mapIrisid2MdsXY.put("IRIS_313-11438", new double[] { 0.105409231852729, 0.0297331634175562 });
		mapIrisid2MdsXY.put("IRIS_313-11439", new double[] { -0.188097716413417, 0.0108094986881673 });
		mapIrisid2MdsXY.put("IRIS_313-11441", new double[] { -0.18230732711543, 0.00953839266963282 });
		mapIrisid2MdsXY.put("IRIS_313-11442", new double[] { 0.0988640597644784, 0.0164708767888678 });
		mapIrisid2MdsXY.put("IRIS_313-11443", new double[] { 0.102873845015875, 0.019371533792719 });
		mapIrisid2MdsXY.put("IRIS_313-11445", new double[] { 0.10184067425144, -0.00535161567030116 });
		mapIrisid2MdsXY.put("IRIS_313-11446", new double[] { 0.0994861327990055, -0.00494500456297709 });
		mapIrisid2MdsXY.put("IRIS_313-11447", new double[] { 0.106572164153484, 0.0186313276823496 });
		mapIrisid2MdsXY.put("IRIS_313-11448", new double[] { 0.0922736717223579, -0.0112425060067927 });
		mapIrisid2MdsXY.put("IRIS_313-11449", new double[] { 0.0819234942371058, -0.0443038485392041 });
		mapIrisid2MdsXY.put("IRIS_313-11451", new double[] { -0.12118929312463, -0.0481678581356739 });
		mapIrisid2MdsXY.put("IRIS_313-11452", new double[] { 0.0233380087179278, -0.13552468980062 });
		mapIrisid2MdsXY.put("IRIS_313-11453", new double[] { 0.0970130415629835, -0.022782524479092 });
		mapIrisid2MdsXY.put("IRIS_313-11454", new double[] { 0.0271930235407844, -0.172480631907054 });
		mapIrisid2MdsXY.put("IRIS_313-11455", new double[] { 0.0162871990557181, -0.177371186167108 });
		mapIrisid2MdsXY.put("IRIS_313-11456", new double[] { 0.0335470060210074, -0.158900848092831 });
		mapIrisid2MdsXY.put("IRIS_313-11458", new double[] { 0.0473467634849465, -0.185670897999781 });
		mapIrisid2MdsXY.put("IRIS_313-11460", new double[] { 0.107255696775974, -0.0373237348565625 });
		mapIrisid2MdsXY.put("IRIS_313-11461", new double[] { 0.113581178900287, -0.00780483445852654 });
		mapIrisid2MdsXY.put("IRIS_313-11462", new double[] { 0.0335312014019162, -0.158403630203227 });
		mapIrisid2MdsXY.put("IRIS_313-11463", new double[] { 0.0903170351014589, 0.0229112234796218 });
		mapIrisid2MdsXY.put("IRIS_313-11464", new double[] { -0.184520841443319, 0.00713151197631514 });
		mapIrisid2MdsXY.put("IRIS_313-11465", new double[] { -0.191960390951464, 0.00818098807605303 });
		mapIrisid2MdsXY.put("IRIS_313-11467", new double[] { 0.100226916112578, 0.0284502064245765 });
		mapIrisid2MdsXY.put("IRIS_313-11471", new double[] { 0.108040883580698, 0.016952155737878 });
		mapIrisid2MdsXY.put("IRIS_313-11472", new double[] { 0.101123747785345, 0.0234996064342891 });
		mapIrisid2MdsXY.put("IRIS_313-11473", new double[] { -0.196555243723533, 0.00464235244193669 });
		mapIrisid2MdsXY.put("IRIS_313-11476", new double[] { 0.0130152233745642, -0.119257141869609 });
		mapIrisid2MdsXY.put("IRIS_313-11477", new double[] { 0.0117476711834271, -0.172890197690229 });
		mapIrisid2MdsXY.put("IRIS_313-11478", new double[] { 0.0908865154867367, -0.064787050236986 });
		mapIrisid2MdsXY.put("IRIS_313-11479", new double[] { -0.16979257379412, 0.0160541903281857 });
		mapIrisid2MdsXY.put("IRIS_313-11480", new double[] { 0.0838446708185967, 0.0321421265531351 });
		mapIrisid2MdsXY.put("IRIS_313-11481", new double[] { 0.0394678074815112, -0.184255698795323 });
		mapIrisid2MdsXY.put("IRIS_313-11482", new double[] { 0.0560989942322463, -0.15413649464715 });
		mapIrisid2MdsXY.put("IRIS_313-11483", new double[] { 0.0433258336792348, -0.182235328610736 });
		mapIrisid2MdsXY.put("IRIS_313-11484", new double[] { 0.0645477085502325, -0.137949676460378 });
		mapIrisid2MdsXY.put("IRIS_313-11485", new double[] { 0.106142410975489, 0.0229077223739961 });
		mapIrisid2MdsXY.put("IRIS_313-11486", new double[] { 0.0855268555908121, -0.0644817858528711 });
		mapIrisid2MdsXY.put("IRIS_313-11487", new double[] { 0.103310390036838, -0.0223564047826956 });
		mapIrisid2MdsXY.put("IRIS_313-11489", new double[] { 0.0277361720790902, -0.117881410429361 });
		mapIrisid2MdsXY.put("IRIS_313-11490", new double[] { 0.104779167733923, 0.0173917046195619 });
		mapIrisid2MdsXY.put("IRIS_313-11491", new double[] { 0.105175479266285, -0.000217883829618225 });
		mapIrisid2MdsXY.put("IRIS_313-11492", new double[] { 0.0580517536257528, -0.178614602997621 });
		mapIrisid2MdsXY.put("IRIS_313-11493", new double[] { 0.103059786679845, 0.0213700457638176 });
		mapIrisid2MdsXY.put("IRIS_313-11494", new double[] { -0.193833199101991, 0.00561836015393001 });
		mapIrisid2MdsXY.put("IRIS_313-11495", new double[] { -0.178592773266825, 0.00713118503739439 });
		mapIrisid2MdsXY.put("IRIS_313-11496", new double[] { -0.179067668228075, 0.0105659214822202 });
		mapIrisid2MdsXY.put("IRIS_313-11497", new double[] { 0.0939807251724026, -0.0252505786401111 });
		mapIrisid2MdsXY.put("IRIS_313-11498", new double[] { -0.164321533108997, 0.0150108794094487 });
		mapIrisid2MdsXY.put("IRIS_313-11499", new double[] { -0.182593150723546, 0.0136868142246668 });
		mapIrisid2MdsXY.put("IRIS_313-11500", new double[] { 0.101614184744703, 0.0101426005798753 });
		mapIrisid2MdsXY.put("IRIS_313-11505", new double[] { 0.111588348637585, 0.00236573508583175 });
		mapIrisid2MdsXY.put("IRIS_313-11506", new double[] { 0.104813259953321, 0.0109631152246601 });
		mapIrisid2MdsXY.put("IRIS_313-11507", new double[] { 0.0855334783762876, 0.0233101061575528 });
		mapIrisid2MdsXY.put("IRIS_313-11508", new double[] { 0.110536361817757, 0.0206266277883201 });
		mapIrisid2MdsXY.put("IRIS_313-11509", new double[] { 0.097279493808849, 0.0242637411669697 });
		mapIrisid2MdsXY.put("IRIS_313-11510", new double[] { 0.0969755678259767, 0.0164196093337236 });
		mapIrisid2MdsXY.put("IRIS_313-11511", new double[] { -0.194793169801909, 0.00387698427669563 });
		mapIrisid2MdsXY.put("IRIS_313-11512", new double[] { 0.104250950480789, 0.0251573435673204 });
		mapIrisid2MdsXY.put("IRIS_313-11513", new double[] { 0.103589867116998, 0.0296148669624441 });
		mapIrisid2MdsXY.put("IRIS_313-11515", new double[] { 0.1036029176869, 0.0114197508611342 });
		mapIrisid2MdsXY.put("IRIS_313-11516", new double[] { 0.109717546818268, 0.0142613431848801 });
		mapIrisid2MdsXY.put("IRIS_313-11517", new double[] { 0.0963560959909182, 0.0245920297039803 });
		mapIrisid2MdsXY.put("IRIS_313-11521", new double[] { 0.0917136852185363, 0.020800672816364 });
		mapIrisid2MdsXY.put("IRIS_313-11522", new double[] { -0.206900038120001, 0.00538854364199775 });
		mapIrisid2MdsXY.put("IRIS_313-11523", new double[] { 0.106727970252526, 0.0193565621862623 });
		mapIrisid2MdsXY.put("IRIS_313-11524", new double[] { -0.18917409852354, 0.00587028617400571 });
		mapIrisid2MdsXY.put("IRIS_313-11525", new double[] { 0.101102618304212, 0.0266534062997221 });
		mapIrisid2MdsXY.put("IRIS_313-11526", new double[] { -0.188876060647655, 0.00608831515548853 });
		mapIrisid2MdsXY.put("IRIS_313-11527", new double[] { -0.193694407408363, 0.00751390026408101 });
		mapIrisid2MdsXY.put("IRIS_313-11528", new double[] { 0.103505087982241, 0.0266142696128712 });
		mapIrisid2MdsXY.put("IRIS_313-11530", new double[] { 0.109585654418328, 0.0239024731138231 });
		mapIrisid2MdsXY.put("IRIS_313-11532", new double[] { -0.185663303080898, 0.00887834540488144 });
		mapIrisid2MdsXY.put("IRIS_313-11534", new double[] { 0.0975049293830028, 0.0262729656739215 });
		mapIrisid2MdsXY.put("IRIS_313-11535", new double[] { 0.101785741352591, 0.026512875208899 });
		mapIrisid2MdsXY.put("IRIS_313-11536", new double[] { -0.210421670925293, 0.00525234863843072 });
		mapIrisid2MdsXY.put("IRIS_313-11537", new double[] { -0.197085541186377, 0.00999704246443857 });
		mapIrisid2MdsXY.put("IRIS_313-11538", new double[] { 0.0690092568402726, 0.0379541836744679 });
		mapIrisid2MdsXY.put("IRIS_313-11539", new double[] { -0.193153398098593, 0.0110664915360388 });
		mapIrisid2MdsXY.put("IRIS_313-11540", new double[] { -0.193400666504361, 0.00605741159360817 });
		mapIrisid2MdsXY.put("IRIS_313-11541", new double[] { 0.101962076249403, 0.0249410104940168 });
		mapIrisid2MdsXY.put("IRIS_313-11542", new double[] { -0.122385549926181, -0.0218596450253359 });
		mapIrisid2MdsXY.put("IRIS_313-11543", new double[] { 0.0995566707612399, 0.0223872613513377 });
		mapIrisid2MdsXY.put("IRIS_313-11544", new double[] { 0.109644338278911, 0.0114520797450545 });
		mapIrisid2MdsXY.put("IRIS_313-11545", new double[] { 0.108611152129061, 0.01184506694245 });
		mapIrisid2MdsXY.put("IRIS_313-11546", new double[] { 0.107251656172605, 0.0190378790239637 });
		mapIrisid2MdsXY.put("IRIS_313-11547", new double[] { 0.0858834087246766, 0.0270332440661158 });
		mapIrisid2MdsXY.put("IRIS_313-11548", new double[] { 0.100847231220387, 0.0202711806155063 });
		mapIrisid2MdsXY.put("IRIS_313-11549", new double[] { 0.100709308043783, 0.021558203910968 });
		mapIrisid2MdsXY.put("IRIS_313-11551", new double[] { 0.0894171122469076, 0.0103308967903742 });
		mapIrisid2MdsXY.put("IRIS_313-11554", new double[] { 0.105057630301409, 0.0211380002456168 });
		mapIrisid2MdsXY.put("IRIS_313-11555", new double[] { 0.110846830084634, 0.00822987969279909 });
		mapIrisid2MdsXY.put("IRIS_313-11556", new double[] { 0.0980350571060335, 0.0228779140149821 });
		mapIrisid2MdsXY.put("IRIS_313-11557", new double[] { 0.05263523046905, -0.173981340675911 });
		mapIrisid2MdsXY.put("IRIS_313-11558", new double[] { 0.102770401206663, 0.00741796455005793 });
		mapIrisid2MdsXY.put("IRIS_313-11561", new double[] { 0.106670842310513, -0.0180279445606179 });
		mapIrisid2MdsXY.put("IRIS_313-11563", new double[] { 0.0979247163198453, -0.0158347775416312 });
		mapIrisid2MdsXY.put("IRIS_313-11564", new double[] { -0.152691012697251, -0.0175524026579777 });
		mapIrisid2MdsXY.put("IRIS_313-11565", new double[] { 0.0983137942320221, -0.0220799855464996 });
		mapIrisid2MdsXY.put("IRIS_313-11566", new double[] { 0.109450092945961, -0.0046669471344719 });
		mapIrisid2MdsXY.put("IRIS_313-11567", new double[] { -0.135131837331427, -0.0448714413217205 });
		mapIrisid2MdsXY.put("IRIS_313-11568", new double[] { 0.100055672090919, 0.0181111052988745 });
		mapIrisid2MdsXY.put("IRIS_313-11570", new double[] { 0.0659919431969042, 0.0259770563450386 });
		mapIrisid2MdsXY.put("IRIS_313-11571", new double[] { -0.202803522814432, 0.0196827043933945 });
		mapIrisid2MdsXY.put("IRIS_313-11572", new double[] { 0.096363633483412, 0.0219632550540577 });
		mapIrisid2MdsXY.put("IRIS_313-11573", new double[] { 0.0978701729712438, 0.0147718213332974 });
		mapIrisid2MdsXY.put("IRIS_313-11574", new double[] { -0.205197291199964, 0.0165432628022446 });
		mapIrisid2MdsXY.put("IRIS_313-11575", new double[] { -0.20668495911763, 0.0103236974971997 });
		mapIrisid2MdsXY.put("IRIS_313-11576", new double[] { 0.0911992997687178, 0.0206140992404748 });
		mapIrisid2MdsXY.put("IRIS_313-11577", new double[] { 0.0991356133580768, 0.0185780426042859 });
		mapIrisid2MdsXY.put("IRIS_313-11578", new double[] { -0.205072859115719, 0.013805036027849 });
		mapIrisid2MdsXY.put("IRIS_313-11579", new double[] { 0.0881042426784669, 0.0178373222996608 });
		mapIrisid2MdsXY.put("IRIS_313-11580", new double[] { 0.0904107420495535, 0.0200679996091134 });
		mapIrisid2MdsXY.put("IRIS_313-11582", new double[] { -0.199771773843522, 0.0163943136710594 });
		mapIrisid2MdsXY.put("IRIS_313-11584", new double[] { -0.207453540984141, 0.0134818597413806 });
		mapIrisid2MdsXY.put("IRIS_313-11585", new double[] { 0.0881924311680418, 0.0241265850656327 });
		mapIrisid2MdsXY.put("IRIS_313-11586", new double[] { -0.208642724903868, 0.0137576126830833 });
		mapIrisid2MdsXY.put("IRIS_313-11588", new double[] { 0.0959972977149195, 0.0308939716979714 });
		mapIrisid2MdsXY.put("IRIS_313-11591", new double[] { -0.0149863501311136, 0.0388038409233507 });
		mapIrisid2MdsXY.put("IRIS_313-11594", new double[] { 0.109801161304414, 0.0223791598557792 });
		mapIrisid2MdsXY.put("IRIS_313-11595", new double[] { 0.00586868311658932, -0.164733183729366 });
		mapIrisid2MdsXY.put("IRIS_313-11596", new double[] { 0.0669399650837784, -0.0597418293392816 });
		mapIrisid2MdsXY.put("IRIS_313-11597", new double[] { 0.0952429260488789, -0.007182745160824 });
		mapIrisid2MdsXY.put("IRIS_313-11598", new double[] { 0.0870630878887035, -0.102831557610599 });
		mapIrisid2MdsXY.put("IRIS_313-11599", new double[] { 0.100309541712981, 0.0117047963034842 });
		mapIrisid2MdsXY.put("IRIS_313-11600", new double[] { 0.0971883866687657, 0.0025988659999213 });
		mapIrisid2MdsXY.put("IRIS_313-11602", new double[] { 0.0281722393345059, -0.166905904101232 });
		mapIrisid2MdsXY.put("IRIS_313-11603", new double[] { 0.0239980239263953, -0.180886524321968 });
		mapIrisid2MdsXY.put("IRIS_313-11604", new double[] { 0.0338265068550474, -0.173226475995181 });
		mapIrisid2MdsXY.put("IRIS_313-11606", new double[] { 0.0966228334229052, 0.00274953754442775 });
		mapIrisid2MdsXY.put("IRIS_313-11607", new double[] { 0.109772686977884, 0.000850940327393119 });
		mapIrisid2MdsXY.put("IRIS_313-11608", new double[] { 0.0900964055392271, 0.0272828717041902 });
		mapIrisid2MdsXY.put("IRIS_313-11609", new double[] { 0.103922509494852, 0.0263482946228148 });
		mapIrisid2MdsXY.put("IRIS_313-11610", new double[] { 0.093808971834271, 0.0257031056734185 });
		mapIrisid2MdsXY.put("IRIS_313-11611", new double[] { -0.167286547682339, 0.00671860534580001 });
		mapIrisid2MdsXY.put("IRIS_313-11615", new double[] { 0.108414045470402, 0.0137899331026286 });
		mapIrisid2MdsXY.put("IRIS_313-11616", new double[] { 0.0630363385543985, -0.0726509452623425 });
		mapIrisid2MdsXY.put("IRIS_313-11617", new double[] { 0.023599449672653, -0.135035691202264 });
		mapIrisid2MdsXY.put("IRIS_313-11618", new double[] { 0.0386398105926977, -0.151447827858539 });
		mapIrisid2MdsXY.put("IRIS_313-11619", new double[] { 0.0259702779401613, -0.163349758344421 });
		mapIrisid2MdsXY.put("IRIS_313-11620", new double[] { 0.0224757417259017, -0.146811084094207 });
		mapIrisid2MdsXY.put("IRIS_313-11621", new double[] { 0.103933143366427, 0.0227106012734343 });
		mapIrisid2MdsXY.put("IRIS_313-11622", new double[] { 0.101895239478136, 0.0166781537282155 });
		mapIrisid2MdsXY.put("IRIS_313-11623", new double[] { -0.191733284952148, 0.00878940639836446 });
		mapIrisid2MdsXY.put("IRIS_313-11624", new double[] { 0.103788836491504, 0.0183183457572556 });
		mapIrisid2MdsXY.put("IRIS_313-11625", new double[] { -0.0918840664706682, -0.0472681185064537 });
		mapIrisid2MdsXY.put("IRIS_313-11626", new double[] { -0.128107218248719, -0.0369403699125856 });
		mapIrisid2MdsXY.put("IRIS_313-11627", new double[] { -0.124682391693702, -0.044034767424136 });
		mapIrisid2MdsXY.put("IRIS_313-11628", new double[] { -0.00612911388220844, -0.0596008588229418 });
		mapIrisid2MdsXY.put("IRIS_313-11629", new double[] { 0.0374056814900726, -0.152265275653353 });
		mapIrisid2MdsXY.put("IRIS_313-11630", new double[] { -0.116940575491902, -0.0445728553670861 });
		mapIrisid2MdsXY.put("IRIS_313-11632", new double[] { -0.116876423983644, -0.0484132821647165 });
		mapIrisid2MdsXY.put("IRIS_313-11635", new double[] { 0.11091801443154, 0.0218224799385822 });
		mapIrisid2MdsXY.put("IRIS_313-11636", new double[] { 0.0460351867302968, -0.178528661779595 });
		mapIrisid2MdsXY.put("IRIS_313-11638", new double[] { 0.110486326239497, -0.00319308254654425 });
		mapIrisid2MdsXY.put("IRIS_313-11639", new double[] { 0.0972054277254885, 0.00937303780892079 });
		mapIrisid2MdsXY.put("IRIS_313-11640", new double[] { 0.108208447375232, -0.00885814499524752 });
		mapIrisid2MdsXY.put("IRIS_313-11641", new double[] { 0.106307022973374, 0.000131135225366467 });
		mapIrisid2MdsXY.put("IRIS_313-11642", new double[] { 0.10758704277288, 0.00110793488072869 });
		mapIrisid2MdsXY.put("IRIS_313-11643", new double[] { 0.0960658806405495, -0.0293475487288803 });
		mapIrisid2MdsXY.put("IRIS_313-11644", new double[] { 0.0957020586455719, -0.0204209165127319 });
		mapIrisid2MdsXY.put("IRIS_313-11645", new double[] { 0.105572092882335, -0.0205547468935555 });
		mapIrisid2MdsXY.put("IRIS_313-11646", new double[] { 0.114059950161332, 0.00352025545326266 });
		mapIrisid2MdsXY.put("IRIS_313-11647", new double[] { 0.100885111437974, -0.0154895732951703 });
		mapIrisid2MdsXY.put("IRIS_313-11648", new double[] { 0.108223992225013, -0.000928886541918903 });
		mapIrisid2MdsXY.put("IRIS_313-11650", new double[] { 0.0597578861131391, -0.00198977636083197 });
		mapIrisid2MdsXY.put("IRIS_313-11651", new double[] { -0.207959804870434, 0.0127559757223828 });
		mapIrisid2MdsXY.put("IRIS_313-11652", new double[] { -0.204659949315385, 0.0164243906187166 });
		mapIrisid2MdsXY.put("IRIS_313-11653", new double[] { -0.208034012855429, 0.0145161014438384 });
		mapIrisid2MdsXY.put("IRIS_313-11654", new double[] { -0.206741288987246, 0.0108330335402467 });
		mapIrisid2MdsXY.put("IRIS_313-11655", new double[] { -0.204396076926673, 0.015029878875513 });
		mapIrisid2MdsXY.put("IRIS_313-11656", new double[] { 0.0937329617562285, 0.0284101924310609 });
		mapIrisid2MdsXY.put("IRIS_313-11657", new double[] { 0.107018959697154, -0.0103260664288226 });
		mapIrisid2MdsXY.put("IRIS_313-11658", new double[] { -0.193168428282126, 0.00607614511676533 });
		mapIrisid2MdsXY.put("IRIS_313-11659", new double[] { -0.189945924051527, 0.00918581602074397 });
		mapIrisid2MdsXY.put("IRIS_313-11660", new double[] { -0.18780984020288, 0.00999805490142184 });
		mapIrisid2MdsXY.put("IRIS_313-11661", new double[] { -0.206472702717237, 0.0127914479169068 });
		mapIrisid2MdsXY.put("IRIS_313-11663", new double[] { 0.0830852019113374, -0.0823226206628529 });
		mapIrisid2MdsXY.put("IRIS_313-11664", new double[] { 0.106732805633547, 0.0236448448207506 });
		mapIrisid2MdsXY.put("IRIS_313-11665", new double[] { 0.10012110328028, 0.0194845728927903 });
		mapIrisid2MdsXY.put("IRIS_313-11666", new double[] { 0.0984580672130179, 0.0165960716104431 });
		mapIrisid2MdsXY.put("IRIS_313-11667", new double[] { 0.104572769930323, 0.0187556391240696 });
		mapIrisid2MdsXY.put("IRIS_313-11668", new double[] { 0.0944687325287181, 0.0185162691460529 });
		mapIrisid2MdsXY.put("IRIS_313-11669", new double[] { 0.0770256417499265, 0.0203562123639246 });
		mapIrisid2MdsXY.put("IRIS_313-11671", new double[] { 0.111359145927539, -0.025767543950984 });
		mapIrisid2MdsXY.put("IRIS_313-11672", new double[] { -0.207514403963221, 0.0129411588139735 });
		mapIrisid2MdsXY.put("IRIS_313-11673", new double[] { -0.185897329685276, 0.0089504296628263 });
		mapIrisid2MdsXY.put("IRIS_313-11674", new double[] { 0.109702502166519, 0.0168193768039573 });
		mapIrisid2MdsXY.put("IRIS_313-11676", new double[] { 0.100906206839184, 0.0247584264886908 });
		mapIrisid2MdsXY.put("IRIS_313-11677", new double[] { 0.102226140151035, 0.011638822425411 });
		mapIrisid2MdsXY.put("IRIS_313-11678", new double[] { 0.0993569645351895, 0.0268800180441782 });
		mapIrisid2MdsXY.put("IRIS_313-11679", new double[] { 0.109553507335665, 0.0283958412438267 });
		mapIrisid2MdsXY.put("IRIS_313-11680", new double[] { 0.109371526434832, 0.024425409278825 });
		mapIrisid2MdsXY.put("IRIS_313-11681", new double[] { 0.103847314048723, 0.00383477475489148 });
		mapIrisid2MdsXY.put("IRIS_313-11682", new double[] { 0.0988093565577061, 0.0264632390957056 });
		mapIrisid2MdsXY.put("IRIS_313-11683", new double[] { 0.110713459348633, 0.0238200327508842 });
		mapIrisid2MdsXY.put("IRIS_313-11684", new double[] { 0.112934017845253, 0.023592309365496 });
		mapIrisid2MdsXY.put("IRIS_313-11685", new double[] { 0.104834687137708, 0.0283570096769867 });
		mapIrisid2MdsXY.put("IRIS_313-11686", new double[] { 0.104955075129059, 0.028923641374957 });
		mapIrisid2MdsXY.put("IRIS_313-11687", new double[] { 0.113487773929413, 0.02340400176702 });
		mapIrisid2MdsXY.put("IRIS_313-11688", new double[] { 0.112270543920593, 0.0234198627532763 });
		mapIrisid2MdsXY.put("IRIS_313-11689", new double[] { -0.210333090924637, 0.0138808250066181 });
		mapIrisid2MdsXY.put("IRIS_313-11690", new double[] { -0.0623474797634007, 0.0205000494665391 });
		mapIrisid2MdsXY.put("IRIS_313-11691", new double[] { -0.198051971712709, 0.00396520783283592 });
		mapIrisid2MdsXY.put("IRIS_313-11692", new double[] { 0.100005365515622, 0.0195472131992462 });
		mapIrisid2MdsXY.put("IRIS_313-11693", new double[] { 0.0948445690483408, 0.0134159894416676 });
		mapIrisid2MdsXY.put("IRIS_313-11694", new double[] { 0.0888718344624364, 0.0140936901523882 });
		mapIrisid2MdsXY.put("IRIS_313-11695", new double[] { 0.0992839767828649, 0.0244503203070472 });
		mapIrisid2MdsXY.put("IRIS_313-11698", new double[] { -0.134307592962526, -0.0363058324373356 });
		mapIrisid2MdsXY.put("IRIS_313-11700", new double[] { 0.103288085227714, 0.0272622318930906 });
		mapIrisid2MdsXY.put("IRIS_313-11702", new double[] { -0.204662396711093, 0.0148018872884993 });
		mapIrisid2MdsXY.put("IRIS_313-11704", new double[] { 0.105472869680032, 0.00588202962229931 });
		mapIrisid2MdsXY.put("IRIS_313-11705", new double[] { 0.0980815518839487, 0.0276782922357576 });
		mapIrisid2MdsXY.put("IRIS_313-11706", new double[] { 0.0969888357760897, 0.0237653174034406 });
		mapIrisid2MdsXY.put("IRIS_313-11707", new double[] { 0.109530126679299, 0.0224602691267866 });
		mapIrisid2MdsXY.put("IRIS_313-11708", new double[] { 0.10887241253308, 0.0236616900930707 });
		mapIrisid2MdsXY.put("IRIS_313-11709", new double[] { 0.10896034493695, 0.0266392828928691 });
		mapIrisid2MdsXY.put("IRIS_313-11710", new double[] { 0.109998927452124, 0.0253308931827545 });
		mapIrisid2MdsXY.put("IRIS_313-11711", new double[] { 0.103679764087999, 0.027255998770124 });
		mapIrisid2MdsXY.put("IRIS_313-11712", new double[] { 0.0521976198343124, -0.176764751133764 });
		mapIrisid2MdsXY.put("IRIS_313-11713", new double[] { 0.0930382049064508, 0.0206852617993355 });
		mapIrisid2MdsXY.put("IRIS_313-11714", new double[] { 0.00875295640821296, 0.025115486417945 });
		mapIrisid2MdsXY.put("IRIS_313-11716", new double[] { 0.097943975130061, 0.0101440333490355 });
		mapIrisid2MdsXY.put("IRIS_313-11717", new double[] { 0.112699252496075, 0.0259848960312214 });
		mapIrisid2MdsXY.put("IRIS_313-11719", new double[] { 0.108556436804433, 0.0250278628876011 });
		mapIrisid2MdsXY.put("IRIS_313-11720", new double[] { 0.110550435291135, 0.0258365612899399 });
		mapIrisid2MdsXY.put("IRIS_313-11721", new double[] { 0.107463159433929, 0.0257125881178513 });
		mapIrisid2MdsXY.put("IRIS_313-11722", new double[] { 0.103022396965291, 0.0189950681215363 });
		mapIrisid2MdsXY.put("IRIS_313-11723", new double[] { 0.102668458595015, 0.00320980716119824 });
		mapIrisid2MdsXY.put("IRIS_313-11724", new double[] { 0.110402379965116, 0.0166770035451918 });
		mapIrisid2MdsXY.put("IRIS_313-11725", new double[] { -0.209003847728014, 0.0108928747368194 });
		mapIrisid2MdsXY.put("IRIS_313-11726", new double[] { 0.0953888659154746, 0.0245194596598068 });
		mapIrisid2MdsXY.put("IRIS_313-11727", new double[] { 0.102569771616695, 0.020310502815873 });
		mapIrisid2MdsXY.put("IRIS_313-11728", new double[] { 0.116433292860463, 0.0211994943752133 });
		mapIrisid2MdsXY.put("IRIS_313-11729", new double[] { 0.0952132492513214, 0.0226144492453523 });
		mapIrisid2MdsXY.put("IRIS_313-11730", new double[] { 0.101582619297311, 0.0284332734333085 });
		mapIrisid2MdsXY.put("IRIS_313-11731", new double[] { 0.101502727207317, 0.0268758922625055 });
		mapIrisid2MdsXY.put("IRIS_313-11732", new double[] { 0.0994219159311837, 0.0204434179123689 });
		mapIrisid2MdsXY.put("IRIS_313-11733", new double[] { 0.0963627369246178, 0.0244311388591023 });
		mapIrisid2MdsXY.put("IRIS_313-11734", new double[] { 0.102761260016687, 0.0160202693305792 });
		mapIrisid2MdsXY.put("IRIS_313-11735", new double[] { 0.0954318171575371, 0.0154296460309791 });
		mapIrisid2MdsXY.put("IRIS_313-11736", new double[] { -0.186967987190913, 0.00394913215945636 });
		mapIrisid2MdsXY.put("IRIS_313-11737", new double[] { 0.0317535146989412, -0.137497037471888 });
		mapIrisid2MdsXY.put("IRIS_313-11738", new double[] { 0.105507015766035, -0.00756768866969075 });
		mapIrisid2MdsXY.put("IRIS_313-11739", new double[] { -0.19002658666685, 0.0085976026801279 });
		mapIrisid2MdsXY.put("IRIS_313-11740", new double[] { 0.104942603274129, 0.0168158951821878 });
		mapIrisid2MdsXY.put("IRIS_313-11741", new double[] { 0.107145130223697, -0.0174596448496932 });
		mapIrisid2MdsXY.put("IRIS_313-11742", new double[] { 0.0443032188313183, -0.183476232186421 });
		mapIrisid2MdsXY.put("IRIS_313-11743", new double[] { -0.128272107543632, -0.0323847749912916 });
		mapIrisid2MdsXY.put("IRIS_313-11744", new double[] { 0.0956558728062667, 0.0240083621825654 });
		mapIrisid2MdsXY.put("IRIS_313-11745", new double[] { 0.104340430025033, 0.017289484203267 });
		mapIrisid2MdsXY.put("IRIS_313-11746", new double[] { 0.0986394903018611, 0.0232370018811503 });
		mapIrisid2MdsXY.put("IRIS_313-11747", new double[] { 0.107252472898897, 0.0183668635544671 });
		mapIrisid2MdsXY.put("IRIS_313-11748", new double[] { 0.0955826177824777, 0.0185508990211513 });
		mapIrisid2MdsXY.put("IRIS_313-11750", new double[] { 0.109561043880993, 0.022193596977632 });
		mapIrisid2MdsXY.put("IRIS_313-11751", new double[] { 0.0970706924406117, 0.0146329259355087 });
		mapIrisid2MdsXY.put("IRIS_313-11752", new double[] { 0.101542679584094, 0.0212936647534569 });
		mapIrisid2MdsXY.put("IRIS_313-11753", new double[] { 0.0959241533934657, 0.0135683685432168 });
		mapIrisid2MdsXY.put("IRIS_313-11754", new double[] { -0.0661710178204241, -0.0195423860125843 });
		mapIrisid2MdsXY.put("IRIS_313-11755", new double[] { -0.194152343093324, 0.00602700457438333 });
		mapIrisid2MdsXY.put("IRIS_313-11756", new double[] { -0.190032971015962, 0.00764951091527526 });
		mapIrisid2MdsXY.put("IRIS_313-11757", new double[] { 0.107545876823022, 0.0244247829704866 });
		mapIrisid2MdsXY.put("IRIS_313-11758", new double[] { 0.112345976369976, 0.00543451209139288 });
		mapIrisid2MdsXY.put("IRIS_313-11759", new double[] { -0.189788408890713, 0.00587972807760688 });
		mapIrisid2MdsXY.put("IRIS_313-11760", new double[] { 0.107456263634314, -0.00989378222292283 });
		mapIrisid2MdsXY.put("IRIS_313-11761", new double[] { 0.110303314721451, -0.0248578058025764 });
		mapIrisid2MdsXY.put("IRIS_313-11762", new double[] { 0.107897655351814, -0.00331216522674446 });
		mapIrisid2MdsXY.put("IRIS_313-11763", new double[] { 0.102787105024375, 0.0240018470079745 });
		mapIrisid2MdsXY.put("IRIS_313-11764", new double[] { 0.110116062202656, 0.0206605873927133 });
		mapIrisid2MdsXY.put("IRIS_313-11765", new double[] { -0.119782829171336, -0.0394694246845277 });
		mapIrisid2MdsXY.put("IRIS_313-11766", new double[] { 0.0404170795044633, -0.093016518551185 });
		mapIrisid2MdsXY.put("IRIS_313-11767", new double[] { 0.0235605094739031, -0.00367776170783214 });
		mapIrisid2MdsXY.put("IRIS_313-11772", new double[] { 0.0662431471025457, -0.0546457327427518 });
		mapIrisid2MdsXY.put("IRIS_313-11773", new double[] { 0.107198361955923, 0.0122394021295238 });
		mapIrisid2MdsXY.put("IRIS_313-11779", new double[] { 0.0977344499190649, 0.0300880576085923 });
		mapIrisid2MdsXY.put("IRIS_313-11780", new double[] { 0.0998825349192672, 0.0262937745440471 });
		mapIrisid2MdsXY.put("IRIS_313-11782", new double[] { 0.0923016222236068, -0.032499730879959 });
		mapIrisid2MdsXY.put("IRIS_313-11783", new double[] { 0.109951550990302, 0.0137685334154379 });
		mapIrisid2MdsXY.put("IRIS_313-11784", new double[] { 0.0820742505825304, 0.0297005845415278 });
		mapIrisid2MdsXY.put("IRIS_313-11785", new double[] { 0.096534578783309, 0.0272363973075402 });
		mapIrisid2MdsXY.put("IRIS_313-11786", new double[] { 0.115719348401637, 0.0272656894321541 });
		mapIrisid2MdsXY.put("IRIS_313-11787", new double[] { 0.108139518784978, -0.000605860781362584 });
		mapIrisid2MdsXY.put("IRIS_313-11788", new double[] { -0.199308170468135, 0.0134577952262999 });
		mapIrisid2MdsXY.put("IRIS_313-11789", new double[] { 0.100481837578973, -0.0233359307593566 });
		mapIrisid2MdsXY.put("IRIS_313-11790", new double[] { -0.171524268917295, 0.0103677296248087 });
		mapIrisid2MdsXY.put("IRIS_313-11791", new double[] { 0.058531279290951, -0.0436761957440922 });
		mapIrisid2MdsXY.put("IRIS_313-11792", new double[] { -0.191981323464802, 0.0118096147780325 });
		mapIrisid2MdsXY.put("IRIS_313-11793", new double[] { 0.0930736828204374, -0.0351592318446378 });
		mapIrisid2MdsXY.put("IRIS_313-11794", new double[] { 0.103365146280038, -0.0225221573374739 });
		mapIrisid2MdsXY.put("IRIS_313-11795", new double[] { 0.100753554391482, 0.0217256739861872 });
		mapIrisid2MdsXY.put("IRIS_313-11796", new double[] { 0.105071281803006, 0.0110326554411642 });
		mapIrisid2MdsXY.put("IRIS_313-11797", new double[] { 0.0926204489474161, 0.0220722102591347 });
		mapIrisid2MdsXY.put("IRIS_313-11798", new double[] { 0.10355953043603, 0.0248360686511502 });
		mapIrisid2MdsXY.put("IRIS_313-11799", new double[] { 0.102032722010966, 0.0184075607110862 });
		mapIrisid2MdsXY.put("IRIS_313-11800", new double[] { -0.208390750116599, 0.012273054744005 });
		mapIrisid2MdsXY.put("IRIS_313-11801", new double[] { 0.11345446316762, 0.0176632217276693 });
		mapIrisid2MdsXY.put("IRIS_313-11802", new double[] { 0.0994164720409324, 0.0128794177204313 });
		mapIrisid2MdsXY.put("IRIS_313-11803", new double[] { -0.205616120427902, 0.014774232467026 });
		mapIrisid2MdsXY.put("IRIS_313-11804", new double[] { 0.1002472892557, 0.0167398844320318 });
		mapIrisid2MdsXY.put("IRIS_313-11805", new double[] { 0.103828616756305, 0.0189367620996077 });
		mapIrisid2MdsXY.put("IRIS_313-11806", new double[] { 0.0978266206015989, 0.0160303493389978 });
		mapIrisid2MdsXY.put("IRIS_313-11807", new double[] { 0.0716387463354706, 0.0269609200849835 });
		mapIrisid2MdsXY.put("IRIS_313-11808", new double[] { 0.0576134341765916, 0.0336952220147536 });
		mapIrisid2MdsXY.put("IRIS_313-11809", new double[] { 0.0324523522113182, -0.175786101771519 });
		mapIrisid2MdsXY.put("IRIS_313-11810", new double[] { 0.105866923905373, 0.0208732653219183 });
		mapIrisid2MdsXY.put("IRIS_313-11811", new double[] { 0.10433823092446, -0.0136228822154221 });
		mapIrisid2MdsXY.put("IRIS_313-11812", new double[] { 0.110698965880316, 0.0292862687306559 });
		mapIrisid2MdsXY.put("IRIS_313-11813", new double[] { 0.109751023363859, 0.00856288891268085 });
		mapIrisid2MdsXY.put("IRIS_313-11814", new double[] { 0.10718607399548, 0.0236370321804248 });
		mapIrisid2MdsXY.put("IRIS_313-11815", new double[] { 0.106682526506151, 0.026898620687972 });
		mapIrisid2MdsXY.put("IRIS_313-11816", new double[] { 0.0988063196251115, 0.00955518301988952 });
		mapIrisid2MdsXY.put("IRIS_313-11817", new double[] { 0.105320623441927, 0.0223920610190907 });
		mapIrisid2MdsXY.put("IRIS_313-11818", new double[] { 0.0952839657340893, 0.00809814542582242 });
		mapIrisid2MdsXY.put("IRIS_313-11819", new double[] { 0.113881449932008, 0.0221300492408268 });
		mapIrisid2MdsXY.put("IRIS_313-11820", new double[] { 0.102077767933317, 0.0262933458765993 });
		mapIrisid2MdsXY.put("IRIS_313-11821", new double[] { 0.107182382564122, -0.00571361403669755 });
		mapIrisid2MdsXY.put("IRIS_313-11822", new double[] { 0.108434467131623, 0.00102212666716139 });
		mapIrisid2MdsXY.put("IRIS_313-11823", new double[] { 0.108260775329816, -0.00249517013908488 });
		mapIrisid2MdsXY.put("IRIS_313-11824", new double[] { 0.110066842064074, 0.00148506697132948 });
		mapIrisid2MdsXY.put("IRIS_313-11825", new double[] { -0.127952660035022, -0.0469896043704174 });
		mapIrisid2MdsXY.put("IRIS_313-11826", new double[] { -0.139620151259216, -0.0356140979578167 });
		mapIrisid2MdsXY.put("IRIS_313-11827", new double[] { 0.103636678999952, -0.00588821880856425 });
		mapIrisid2MdsXY.put("IRIS_313-11828", new double[] { 0.107051742520133, -0.00551638089413687 });
		mapIrisid2MdsXY.put("IRIS_313-11829", new double[] { -0.209802429040048, 0.0123246952345524 });
		mapIrisid2MdsXY.put("IRIS_313-11830", new double[] { 0.104731612123464, 0.0268442827943924 });
		mapIrisid2MdsXY.put("IRIS_313-11831", new double[] { -0.199681952480657, 0.010970035238249 });
		mapIrisid2MdsXY.put("IRIS_313-11832", new double[] { -0.191787885858912, 0.00945845846983069 });
		mapIrisid2MdsXY.put("IRIS_313-11833", new double[] { 0.103883422021548, 0.0310475942333981 });
		mapIrisid2MdsXY.put("IRIS_313-11834", new double[] { -0.190543162317858, 0.00734813537104222 });
		mapIrisid2MdsXY.put("IRIS_313-11835", new double[] { 0.104217548764769, 0.0249847906517247 });
		mapIrisid2MdsXY.put("IRIS_313-11836", new double[] { 0.108689986980733, 0.0245721635434299 });
		mapIrisid2MdsXY.put("IRIS_313-11837", new double[] { 0.0994177620048265, 0.0263205587249857 });
		mapIrisid2MdsXY.put("IRIS_313-11838", new double[] { 0.10231962841748, 0.023843753384731 });
		mapIrisid2MdsXY.put("IRIS_313-11839", new double[] { 0.103436695613216, 0.0295505472979969 });
		mapIrisid2MdsXY.put("IRIS_313-11840", new double[] { 0.100571741319618, 0.0224437398741871 });
		mapIrisid2MdsXY.put("IRIS_313-11841", new double[] { 0.107254317723898, 0.0250648200617709 });
		mapIrisid2MdsXY.put("IRIS_313-11842", new double[] { 0.105320535302236, 0.0228951825231543 });
		mapIrisid2MdsXY.put("IRIS_313-11843", new double[] { 0.112564634971082, 0.0225263763752842 });
		mapIrisid2MdsXY.put("IRIS_313-11844", new double[] { 0.104278422002553, 0.0290951306737583 });
		mapIrisid2MdsXY.put("IRIS_313-11845", new double[] { -0.195431656596251, 0.0102146752069418 });
		mapIrisid2MdsXY.put("IRIS_313-11846", new double[] { -0.184324723258445, 0.0120866376783837 });
		mapIrisid2MdsXY.put("IRIS_313-11848", new double[] { 0.105861009772701, 0.025251425270957 });
		mapIrisid2MdsXY.put("IRIS_313-11849", new double[] { 0.0954857577651127, 0.0255563484408304 });
		mapIrisid2MdsXY.put("IRIS_313-11850", new double[] { 0.105725207944986, 0.0230073099630842 });
		mapIrisid2MdsXY.put("IRIS_313-11851", new double[] { -0.194788477646886, 0.00848497394936634 });
		mapIrisid2MdsXY.put("IRIS_313-11852", new double[] { 0.0982142742322773, 0.0124319245407424 });
		mapIrisid2MdsXY.put("IRIS_313-11853", new double[] { 0.0991100751344513, 0.013418601731114 });
		mapIrisid2MdsXY.put("IRIS_313-11854", new double[] { 0.101212032720652, 0.017795022315725 });
		mapIrisid2MdsXY.put("IRIS_313-11855", new double[] { 0.0912437723477427, 0.0162542761884269 });
		mapIrisid2MdsXY.put("IRIS_313-11856", new double[] { 0.0971994229933304, 0.00982457787390704 });
		mapIrisid2MdsXY.put("IRIS_313-11857", new double[] { 0.0963747721058396, 0.0159732154920066 });
		mapIrisid2MdsXY.put("IRIS_313-11858", new double[] { 0.0974785197745791, 0.0244302229933629 });
		mapIrisid2MdsXY.put("IRIS_313-11859", new double[] { 0.10179575018551, 0.0153672312045922 });
		mapIrisid2MdsXY.put("IRIS_313-11860", new double[] { 0.10203755253608, 0.0209098645693869 });
		mapIrisid2MdsXY.put("IRIS_313-11861", new double[] { 0.0979219068428184, 0.0175790559184185 });
		mapIrisid2MdsXY.put("IRIS_313-11862", new double[] { 0.0887293214926555, 0.0230430418223596 });
		mapIrisid2MdsXY.put("IRIS_313-11863", new double[] { 0.089815498047785, 0.0196015447429418 });
		mapIrisid2MdsXY.put("IRIS_313-11865", new double[] { 0.0903082564135499, 0.0202645352930333 });
		mapIrisid2MdsXY.put("IRIS_313-11866", new double[] { 0.101897157388362, 0.0170406691764606 });
		mapIrisid2MdsXY.put("IRIS_313-11867", new double[] { 0.106718608781358, 0.0154777366686094 });
		mapIrisid2MdsXY.put("IRIS_313-11868", new double[] { 0.0944772145023043, 0.0194436146978012 });
		mapIrisid2MdsXY.put("IRIS_313-11869", new double[] { 0.098219979838049, 0.0219071002174763 });
		mapIrisid2MdsXY.put("IRIS_313-11870", new double[] { 0.0967020406375396, 0.0130739107116877 });
		mapIrisid2MdsXY.put("IRIS_313-11871", new double[] { 0.0955713159043663, 0.0181193105483949 });
		mapIrisid2MdsXY.put("IRIS_313-11872", new double[] { 0.0713185493382218, 0.0115103751377915 });
		mapIrisid2MdsXY.put("IRIS_313-11875", new double[] { -0.210215247136581, 0.0151976852276353 });
		mapIrisid2MdsXY.put("IRIS_313-11876", new double[] { 0.0521198740172482, 0.019592968020693 });
		mapIrisid2MdsXY.put("IRIS_313-11877", new double[] { 0.101157693056674, 0.0150006728163586 });
		mapIrisid2MdsXY.put("IRIS_313-11878", new double[] { 0.0983448098211337, 0.008972232091805 });
		mapIrisid2MdsXY.put("IRIS_313-11881", new double[] { 0.089083976436547, 0.0172277237070999 });
		mapIrisid2MdsXY.put("IRIS_313-11882", new double[] { 0.0926725512777871, 0.0157016372766636 });
		mapIrisid2MdsXY.put("IRIS_313-11884", new double[] { 0.0985043711349373, 0.0159762850245018 });
		mapIrisid2MdsXY.put("IRIS_313-11885", new double[] { 0.0969055781716579, 0.012390798613428 });
		mapIrisid2MdsXY.put("IRIS_313-11886", new double[] { 0.103212316558354, 0.0178589485935478 });
		mapIrisid2MdsXY.put("IRIS_313-11887", new double[] { 0.104796667319583, 0.0250223038728266 });
		mapIrisid2MdsXY.put("IRIS_313-11888", new double[] { 0.0307210459611061, -0.169182512228226 });
		mapIrisid2MdsXY.put("IRIS_313-11889", new double[] { 0.0888464745466379, -0.0085940743099041 });
		mapIrisid2MdsXY.put("IRIS_313-11890", new double[] { -0.199163118726848, 0.0159517624504249 });
		mapIrisid2MdsXY.put("IRIS_313-11892", new double[] { -0.194234741258318, 0.00901761137403988 });
		mapIrisid2MdsXY.put("IRIS_313-11893", new double[] { 0.0935156724812242, 0.0155897070207976 });
		mapIrisid2MdsXY.put("IRIS_313-11894", new double[] { 0.0949253445438308, 0.0156659282417264 });
		mapIrisid2MdsXY.put("IRIS_313-11895", new double[] { 0.103203851652303, 0.0224833590386404 });
		mapIrisid2MdsXY.put("IRIS_313-11896", new double[] { 0.111117407893465, 0.0252426911891593 });
		mapIrisid2MdsXY.put("IRIS_313-11897", new double[] { -0.194974945091146, 0.0089967380207964 });
		mapIrisid2MdsXY.put("IRIS_313-11898", new double[] { 0.09671525435275, 0.0208200815811651 });
		mapIrisid2MdsXY.put("IRIS_313-11899", new double[] { 0.0988244561940577, 0.0125474288940073 });
		mapIrisid2MdsXY.put("IRIS_313-11900", new double[] { -0.200408359408544, 0.0139657315168203 });
		mapIrisid2MdsXY.put("IRIS_313-11901", new double[] { 0.102714447340737, 0.0293210429856231 });
		mapIrisid2MdsXY.put("IRIS_313-11902", new double[] { 0.107874336736942, 0.0276961810676508 });
		mapIrisid2MdsXY.put("IRIS_313-11903", new double[] { -0.182682742352262, 0.00877777307320967 });
		mapIrisid2MdsXY.put("IRIS_313-11904", new double[] { 0.0966044605263894, 0.0256985305215519 });
		mapIrisid2MdsXY.put("IRIS_313-11905", new double[] { 0.0975236032571057, 0.0283161353587703 });
		mapIrisid2MdsXY.put("IRIS_313-11906", new double[] { -0.177809720544641, 0.00962414320069743 });
		mapIrisid2MdsXY.put("IRIS_313-11907", new double[] { -0.186718101343888, 0.00797981117297072 });
		mapIrisid2MdsXY.put("IRIS_313-11908", new double[] { -0.206324747084611, 0.0117754561614768 });
		mapIrisid2MdsXY.put("IRIS_313-11909", new double[] { 0.0917887793832844, 0.015325282111933 });
		mapIrisid2MdsXY.put("IRIS_313-11910", new double[] { 0.0971843897944885, 0.0136064710152332 });
		mapIrisid2MdsXY.put("IRIS_313-11911", new double[] { 0.0947685267836688, 0.0111229105683115 });
		mapIrisid2MdsXY.put("IRIS_313-11912", new double[] { 0.105699809348629, 0.0166563834300547 });
		mapIrisid2MdsXY.put("IRIS_313-11913", new double[] { -0.184232444898466, 0.00497879516215281 });
		mapIrisid2MdsXY.put("IRIS_313-11914", new double[] { 0.0830183338797084, -0.0450665415150824 });
		mapIrisid2MdsXY.put("IRIS_313-11915", new double[] { -0.190513153187343, 0.00727807792511421 });
		mapIrisid2MdsXY.put("IRIS_313-11916", new double[] { 0.0917350501030856, -0.0121165731296087 });
		mapIrisid2MdsXY.put("IRIS_313-11917", new double[] { 0.0250398193800178, -0.167749192149131 });
		mapIrisid2MdsXY.put("IRIS_313-11918", new double[] { 0.103893176453793, -0.00105988839488627 });
		mapIrisid2MdsXY.put("IRIS_313-11919", new double[] { 0.102410192291801, -0.00335024081012652 });
		mapIrisid2MdsXY.put("IRIS_313-11920", new double[] { 0.109010189332186, 0.0116422876668648 });
		mapIrisid2MdsXY.put("IRIS_313-11921", new double[] { 0.105799661334247, 0.0262638954284585 });
		mapIrisid2MdsXY.put("IRIS_313-11922", new double[] { -0.203497894757078, 0.0113812758885225 });
		mapIrisid2MdsXY.put("IRIS_313-11923", new double[] { -0.194059586237861, 0.012320770360363 });
		mapIrisid2MdsXY.put("IRIS_313-11924", new double[] { -0.202498416384928, 0.0104777314267776 });
		mapIrisid2MdsXY.put("IRIS_313-11925", new double[] { 0.105120357726845, 0.0185272725982792 });
		mapIrisid2MdsXY.put("IRIS_313-11926", new double[] { -0.197124713908618, 0.0117212460157528 });
		mapIrisid2MdsXY.put("IRIS_313-11927", new double[] { 0.098218772336673, 0.0259671946370931 });
		mapIrisid2MdsXY.put("IRIS_313-11928", new double[] { -0.180659957899715, 0.00656691867085579 });
		mapIrisid2MdsXY.put("IRIS_313-11929", new double[] { -0.181229309744547, 0.00920527860991316 });
		mapIrisid2MdsXY.put("IRIS_313-11930", new double[] { 0.0251377443607946, 0.0214521127585549 });
		mapIrisid2MdsXY.put("IRIS_313-11931", new double[] { -0.209116480142195, 0.00980140980756321 });
		mapIrisid2MdsXY.put("IRIS_313-11932", new double[] { 0.0897898185805911, -0.0317093173363303 });
		mapIrisid2MdsXY.put("IRIS_313-11934", new double[] { 0.083370528224784, 0.0169386344545526 });
		mapIrisid2MdsXY.put("IRIS_313-11935", new double[] { 0.109472939759026, 0.0252071695155713 });
		mapIrisid2MdsXY.put("IRIS_313-11936", new double[] { 0.103720975646497, 0.0240169061470432 });
		mapIrisid2MdsXY.put("IRIS_313-11937", new double[] { 0.0996348918211542, 0.0187823899562024 });
		mapIrisid2MdsXY.put("IRIS_313-11938", new double[] { 0.108165310830873, 0.010812228405957 });
		mapIrisid2MdsXY.put("IRIS_313-11939", new double[] { 0.107695616830965, 0.0246728424974 });
		mapIrisid2MdsXY.put("IRIS_313-11940", new double[] { 0.107897333758255, 0.0140802782626744 });
		mapIrisid2MdsXY.put("IRIS_313-11941", new double[] { 0.10240113277659, 0.0287736869609872 });
		mapIrisid2MdsXY.put("IRIS_313-11943", new double[] { 0.104245864110309, 0.0161150527392854 });
		mapIrisid2MdsXY.put("IRIS_313-11944", new double[] { 0.101639955606337, 0.0186514592793208 });
		mapIrisid2MdsXY.put("IRIS_313-11945", new double[] { 0.103027892274013, -0.00211040807964401 });
		mapIrisid2MdsXY.put("IRIS_313-11946", new double[] { -0.191176079182341, 0.00646646224481253 });
		mapIrisid2MdsXY.put("IRIS_313-11947", new double[] { 0.103702599998911, 0.0171853374542148 });
		mapIrisid2MdsXY.put("IRIS_313-11948", new double[] { 0.0884083191527007, 0.0174719336685841 });
		mapIrisid2MdsXY.put("IRIS_313-11949", new double[] { 0.0991323276640234, 0.0107993401375099 });
		mapIrisid2MdsXY.put("IRIS_313-11950", new double[] { 0.0996967025514387, 0.0181854418381202 });
		mapIrisid2MdsXY.put("IRIS_313-11951", new double[] { 0.0960987211790882, 0.0196008750955776 });
		mapIrisid2MdsXY.put("IRIS_313-11952", new double[] { 0.0938741860607305, 0.018572172418923 });
		mapIrisid2MdsXY.put("IRIS_313-11953", new double[] { 0.0929178030200687, 0.0191555248359087 });
		mapIrisid2MdsXY.put("IRIS_313-11954", new double[] { 0.0990047539504131, 0.0198997081972117 });
		mapIrisid2MdsXY.put("IRIS_313-11955", new double[] { 0.0986439302570547, 0.0214665692737553 });
		mapIrisid2MdsXY.put("IRIS_313-11956", new double[] { -0.0723393465846777, 0.0112058786356555 });
		mapIrisid2MdsXY.put("IRIS_313-11957", new double[] { 0.0932825696863341, 0.0113385836707542 });
		mapIrisid2MdsXY.put("IRIS_313-11958", new double[] { 0.104394173716513, 0.00899633530842508 });
		mapIrisid2MdsXY.put("IRIS_313-11959", new double[] { 0.101720292685012, 0.020221312103094 });
		mapIrisid2MdsXY.put("IRIS_313-11960", new double[] { 0.0982891124320819, 0.0162105698965769 });
		mapIrisid2MdsXY.put("IRIS_313-11961", new double[] { 0.0988683696638018, 0.0279844468401335 });
		mapIrisid2MdsXY.put("IRIS_313-11962", new double[] { 0.109156753175659, 0.024173676619222 });
		mapIrisid2MdsXY.put("IRIS_313-11963", new double[] { 0.0504369300460311, -0.183017523783588 });
		mapIrisid2MdsXY.put("IRIS_313-11964", new double[] { 0.112061760544453, -0.00195790769582895 });
		mapIrisid2MdsXY.put("IRIS_313-11965", new double[] { 0.0993494924095075, 0.0183508203398871 });
		mapIrisid2MdsXY.put("IRIS_313-11966", new double[] { 0.0965825009244247, 0.0194328301416219 });
		mapIrisid2MdsXY.put("IRIS_313-11967", new double[] { 0.0938396180292055, 0.0228625951068854 });
		mapIrisid2MdsXY.put("IRIS_313-11968", new double[] { 0.0997185628797443, 0.0223432323090174 });
		mapIrisid2MdsXY.put("IRIS_313-11969", new double[] { 0.109012156779969, -0.016568454697898 });
		mapIrisid2MdsXY.put("IRIS_313-11970", new double[] { -0.186313744052527, 0.00563598711414648 });
		mapIrisid2MdsXY.put("IRIS_313-11971", new double[] { -0.174338542952623, 0.00961589554378967 });
		mapIrisid2MdsXY.put("IRIS_313-11973", new double[] { -0.209007168024427, 0.00998738975526455 });
		mapIrisid2MdsXY.put("IRIS_313-11974", new double[] { 0.100586361535761, 0.0266035341541898 });
		mapIrisid2MdsXY.put("IRIS_313-11975", new double[] { 0.101452381006719, 0.0140481176460229 });
		mapIrisid2MdsXY.put("IRIS_313-11976", new double[] { 0.0966191427024108, 0.0270335480795786 });
		mapIrisid2MdsXY.put("IRIS_313-11977", new double[] { 0.107775794965077, 0.0133362361185511 });
		mapIrisid2MdsXY.put("IRIS_313-11978", new double[] { 0.095771319908702, 0.0287726971845844 });
		mapIrisid2MdsXY.put("IRIS_313-11979", new double[] { 0.0947975652269346, 0.0220331013731465 });
		mapIrisid2MdsXY.put("IRIS_313-11980", new double[] { 0.0934554311448141, 0.0193547149928863 });
		mapIrisid2MdsXY.put("IRIS_313-11981", new double[] { -0.208698413257991, 0.0123406237549691 });
		mapIrisid2MdsXY.put("IRIS_313-11982", new double[] { 0.0371120192426279, -0.168745876844528 });
		mapIrisid2MdsXY.put("IRIS_313-11983", new double[] { 0.107997741053834, 0.0115616816962307 });
		mapIrisid2MdsXY.put("IRIS_313-11984", new double[] { -0.205470660656128, 0.0135055353448417 });
		mapIrisid2MdsXY.put("IRIS_313-11985", new double[] { 0.0965007046257368, 0.0209230335759494 });
		mapIrisid2MdsXY.put("IRIS_313-11986", new double[] { 0.0947314795433883, 0.0212212705817762 });
		mapIrisid2MdsXY.put("IRIS_313-11987", new double[] { 0.0872823556068794, 0.0312558647831393 });
		mapIrisid2MdsXY.put("IRIS_313-11988", new double[] { 0.109653801447459, 0.00936576482540977 });
		mapIrisid2MdsXY.put("IRIS_313-11989", new double[] { 0.102777544358912, 0.0182110229749875 });
		mapIrisid2MdsXY.put("IRIS_313-11990", new double[] { 0.0865867050807811, 0.0287579049275934 });
		mapIrisid2MdsXY.put("IRIS_313-11991", new double[] { 0.107956631922002, 0.0243150781603275 });
		mapIrisid2MdsXY.put("IRIS_313-11992", new double[] { 0.104096493813537, 0.0257333808995347 });
		mapIrisid2MdsXY.put("IRIS_313-11993", new double[] { 0.0957459218969689, 0.0125029204068344 });
		mapIrisid2MdsXY.put("IRIS_313-11994", new double[] { -0.184416782528513, 0.00836770836890083 });
		mapIrisid2MdsXY.put("IRIS_313-11995", new double[] { -0.18421973636392, 0.00978435582024201 });
		mapIrisid2MdsXY.put("IRIS_313-11996", new double[] { 0.0960203067303612, 0.0179285731877981 });
		mapIrisid2MdsXY.put("IRIS_313-11997", new double[] { 0.108142380270199, 0.0267495517706553 });
		mapIrisid2MdsXY.put("IRIS_313-11998", new double[] { 0.103336588311448, 0.0210357307737005 });
		mapIrisid2MdsXY.put("IRIS_313-11999", new double[] { 0.110513886445453, 0.0200308010325364 });
		mapIrisid2MdsXY.put("IRIS_313-12000", new double[] { 0.110553836994013, 0.0263078685439926 });
		mapIrisid2MdsXY.put("IRIS_313-12002", new double[] { 0.0265565675889885, -0.178996733320756 });
		mapIrisid2MdsXY.put("IRIS_313-12003", new double[] { -0.209199528631183, 0.0109997535093673 });
		mapIrisid2MdsXY.put("IRIS_313-12004", new double[] { -0.0986319245179425, -0.0241004372004682 });
		mapIrisid2MdsXY.put("IRIS_313-12005", new double[] { 0.0983276833026927, 0.0265857392030527 });
		mapIrisid2MdsXY.put("IRIS_313-12006", new double[] { -0.177252272993598, 0.00821698757891531 });
		mapIrisid2MdsXY.put("IRIS_313-12007", new double[] { 0.0981923960506694, 0.0248183072563323 });
		mapIrisid2MdsXY.put("IRIS_313-12009", new double[] { 0.103426057568273, 0.0202360831407661 });
		mapIrisid2MdsXY.put("IRIS_313-12010", new double[] { 0.0985548538077752, 0.0149998485631023 });
		mapIrisid2MdsXY.put("IRIS_313-12011", new double[] { 0.0866989880462249, 0.018173140533879 });
		mapIrisid2MdsXY.put("IRIS_313-12012", new double[] { 0.0938461868066094, 0.0178387946194558 });
		mapIrisid2MdsXY.put("IRIS_313-12013", new double[] { 0.0944943827867262, -0.00953419641133272 });
		mapIrisid2MdsXY.put("IRIS_313-12014", new double[] { 0.106580225041856, 0.00181992630359277 });
		mapIrisid2MdsXY.put("IRIS_313-12015", new double[] { 0.106382002338259, -0.0185669155929732 });
		mapIrisid2MdsXY.put("IRIS_313-12016", new double[] { 0.0731375883517126, 0.00804105422993402 });
		mapIrisid2MdsXY.put("IRIS_313-12017", new double[] { 0.098341746230381, 0.0179791954084444 });
		mapIrisid2MdsXY.put("IRIS_313-12018", new double[] { -0.190287992256992, 0.0074596311960179 });
		mapIrisid2MdsXY.put("IRIS_313-12021", new double[] { -0.191807522134032, 0.00985891500191992 });
		mapIrisid2MdsXY.put("IRIS_313-12024", new double[] { 0.107618730479018, 0.0227504130582342 });
		mapIrisid2MdsXY.put("IRIS_313-12027", new double[] { 0.0805927370947951, 0.0244863803903383 });
		mapIrisid2MdsXY.put("IRIS_313-12028", new double[] { 0.103963352031556, 0.0190263025222207 });
		mapIrisid2MdsXY.put("IRIS_313-12029", new double[] { -0.196604698178103, 0.00930079788841348 });
		mapIrisid2MdsXY.put("IRIS_313-12030", new double[] { -0.0973860875909698, 0.0184641663567831 });
		mapIrisid2MdsXY.put("IRIS_313-12031", new double[] { -0.19532157459998, 0.00813661393686534 });
		mapIrisid2MdsXY.put("IRIS_313-12033", new double[] { 0.102128834292938, 0.0167565717458472 });
		mapIrisid2MdsXY.put("IRIS_313-12036", new double[] { 0.110507559696108, 0.0228053730013997 });
		mapIrisid2MdsXY.put("IRIS_313-12037", new double[] { 0.113724897829025, 0.0222318681151551 });
		mapIrisid2MdsXY.put("IRIS_313-12038", new double[] { 0.104645791852051, 0.0241021152278365 });
		mapIrisid2MdsXY.put("IRIS_313-12039", new double[] { 0.102695777461833, 0.0249705326206811 });
		mapIrisid2MdsXY.put("IRIS_313-12040", new double[] { 0.108718184802394, 0.0213214820694707 });
		mapIrisid2MdsXY.put("IRIS_313-12041", new double[] { 0.10997991611203, 0.0248095319484784 });
		mapIrisid2MdsXY.put("IRIS_313-12042", new double[] { 0.105598101104559, 0.0258003228889467 });
		mapIrisid2MdsXY.put("IRIS_313-12043", new double[] { 0.106543551450922, 0.0237428216947233 });
		mapIrisid2MdsXY.put("IRIS_313-12044", new double[] { 0.113448362223113, 0.0217617647877702 });
		mapIrisid2MdsXY.put("IRIS_313-12045", new double[] { -0.187715359855543, 0.00972565613859887 });
		mapIrisid2MdsXY.put("IRIS_313-12046", new double[] { 0.0978371255115764, 0.0274647781587925 });
		mapIrisid2MdsXY.put("IRIS_313-12047", new double[] { 0.0965367362648585, 0.0271655435970091 });
		mapIrisid2MdsXY.put("IRIS_313-12048", new double[] { 0.101051646083626, 0.0246577385982992 });
		mapIrisid2MdsXY.put("IRIS_313-12049", new double[] { 0.0971642374420435, 0.0263440565375791 });
		mapIrisid2MdsXY.put("IRIS_313-12050", new double[] { 0.0956514700841584, 0.0218958771235419 });
		mapIrisid2MdsXY.put("IRIS_313-12051", new double[] { -0.18251119692167, 0.00863000207312183 });
		mapIrisid2MdsXY.put("IRIS_313-12052", new double[] { 0.0869263317768768, -0.034429235898027 });
		mapIrisid2MdsXY.put("IRIS_313-12053", new double[] { 0.0929640491512402, 0.0243418072145301 });
		mapIrisid2MdsXY.put("IRIS_313-12054", new double[] { -0.198286559355144, 0.0159264817017908 });
		mapIrisid2MdsXY.put("IRIS_313-12055", new double[] { 0.0388415310404491, -0.1431334933593 });
		mapIrisid2MdsXY.put("IRIS_313-12057", new double[] { 0.0838100512042838, 0.0192594033877624 });
		mapIrisid2MdsXY.put("IRIS_313-12058", new double[] { 0.110541348496815, 0.022252495735377 });
		mapIrisid2MdsXY.put("IRIS_313-12059", new double[] { -0.209014876345968, 0.00678565747413981 });
		mapIrisid2MdsXY.put("IRIS_313-12060", new double[] { -0.207944168001118, 0.0049704266069229 });
		mapIrisid2MdsXY.put("IRIS_313-12061", new double[] { -0.206207210315626, 0.00916404761335519 });
		mapIrisid2MdsXY.put("IRIS_313-12063", new double[] { -0.199250967143399, 0.00756550067859244 });
		mapIrisid2MdsXY.put("IRIS_313-12065", new double[] { 0.0655796558362684, -0.086994432505731 });
		mapIrisid2MdsXY.put("IRIS_313-12066", new double[] { 0.108860964064346, 0.0234615678809532 });
		mapIrisid2MdsXY.put("IRIS_313-12067", new double[] { 0.0947343037740959, 0.018071360241997 });
		mapIrisid2MdsXY.put("IRIS_313-12068", new double[] { -0.181542889619309, 0.00750020678878117 });
		mapIrisid2MdsXY.put("IRIS_313-12069", new double[] { -0.184098615229462, 0.0101954594976811 });
		mapIrisid2MdsXY.put("IRIS_313-12070", new double[] { -0.180342534630414, 0.00551281398822843 });
		mapIrisid2MdsXY.put("IRIS_313-12071", new double[] { -0.201144783840365, 0.0100809037514933 });
		mapIrisid2MdsXY.put("IRIS_313-12072", new double[] { 0.0948765277199039, 0.0233064287695471 });
		mapIrisid2MdsXY.put("IRIS_313-12073", new double[] { -0.183227160102474, 0.00676610742825927 });
		mapIrisid2MdsXY.put("IRIS_313-12074", new double[] { -0.151296921634192, -0.0139199538376125 });
		mapIrisid2MdsXY.put("IRIS_313-12076", new double[] { -0.200739114434035, 0.00905118277075484 });
		mapIrisid2MdsXY.put("IRIS_313-12077", new double[] { -0.199460693352665, 0.00777517094290251 });
		mapIrisid2MdsXY.put("IRIS_313-12078", new double[] { 0.0981068467366916, 0.0204234730662067 });
		mapIrisid2MdsXY.put("IRIS_313-12079", new double[] { 0.0981125410876354, 0.0306900867639024 });
		mapIrisid2MdsXY.put("IRIS_313-12080", new double[] { 0.0965344574873094, 0.030982418400932 });
		mapIrisid2MdsXY.put("IRIS_313-12081", new double[] { 0.106884257517856, 0.0181240818356859 });
		mapIrisid2MdsXY.put("IRIS_313-12082", new double[] { 0.081625403330963, -0.0310785809834177 });
		mapIrisid2MdsXY.put("IRIS_313-12083", new double[] { 0.0933975144804917, -0.0348673148171095 });
		mapIrisid2MdsXY.put("IRIS_313-12093", new double[] { 0.103390043201513, 0.0221100402127177 });
		mapIrisid2MdsXY.put("IRIS_313-12094", new double[] { -0.127957874645896, -0.0415963984682623 });
		mapIrisid2MdsXY.put("IRIS_313-12096", new double[] { 0.103168339982148, 0.00436484047535156 });
		mapIrisid2MdsXY.put("IRIS_313-12097", new double[] { 0.113616898488658, 0.0219638350137065 });
		mapIrisid2MdsXY.put("IRIS_313-12101", new double[] { 0.110335914379725, 0.0222625670572986 });
		mapIrisid2MdsXY.put("IRIS_313-12102", new double[] { 0.0991927516957201, 0.0249826014861436 });
		mapIrisid2MdsXY.put("IRIS_313-12108", new double[] { -0.183100079499212, 0.00544035929073858 });
		mapIrisid2MdsXY.put("IRIS_313-12109", new double[] { 0.106330127512282, 0.0222696348124149 });
		mapIrisid2MdsXY.put("IRIS_313-12118", new double[] { 0.0945905236991383, -0.0320211998131895 });
		mapIrisid2MdsXY.put("IRIS_313-12121", new double[] { 0.109600678508501, 0.0242696562543454 });
		mapIrisid2MdsXY.put("IRIS_313-12127", new double[] { 0.10307023909541, 0.0260181173099952 });
		mapIrisid2MdsXY.put("IRIS_313-12128", new double[] { 0.103730844037159, 0.0321203906963957 });
		mapIrisid2MdsXY.put("IRIS_313-12129", new double[] { -0.193349208673552, 0.011623777745704 });
		mapIrisid2MdsXY.put("IRIS_313-12130", new double[] { 0.101115500048002, 0.0256180718949742 });
		mapIrisid2MdsXY.put("IRIS_313-12131", new double[] { 0.109985060919424, 0.0277160289284238 });
		mapIrisid2MdsXY.put("IRIS_313-12133", new double[] { 0.0936081202969041, 0.0259185317069372 });
		mapIrisid2MdsXY.put("IRIS_313-12134", new double[] { -0.194073074395732, 0.0115009937469314 });
		mapIrisid2MdsXY.put("IRIS_313-12135", new double[] { 0.0979229249709107, 0.0177995946228171 });
		mapIrisid2MdsXY.put("IRIS_313-12138", new double[] { 0.104872182388956, 0.0197924108743942 });
		mapIrisid2MdsXY.put("IRIS_313-12139", new double[] { 0.0268871334895339, -0.161229976682639 });
		mapIrisid2MdsXY.put("IRIS_313-12141", new double[] { 0.0485227289165173, -0.180226791414883 });
		mapIrisid2MdsXY.put("IRIS_313-12142", new double[] { 0.104735785914834, 0.0237116498350621 });
		mapIrisid2MdsXY.put("IRIS_313-12143", new double[] { 0.114889736115446, 0.0130324684394134 });
		mapIrisid2MdsXY.put("IRIS_313-12144", new double[] { -0.183284277248926, 0.00971966742062325 });
		mapIrisid2MdsXY.put("IRIS_313-12146", new double[] { 0.0980941190405681, 0.0084046987802284 });
		mapIrisid2MdsXY.put("IRIS_313-12147", new double[] { 0.105501053366079, 0.0206038712628546 });
		mapIrisid2MdsXY.put("IRIS_313-12148", new double[] { 0.0929318440769469, 0.0287886433383262 });
		mapIrisid2MdsXY.put("IRIS_313-12151", new double[] { 0.108222766347472, 0.0216412681059521 });
		mapIrisid2MdsXY.put("IRIS_313-12152", new double[] { 0.102596731321933, 0.0298007319217956 });
		mapIrisid2MdsXY.put("IRIS_313-12161", new double[] { 0.112752678719821, 0.0235802349041404 });
		mapIrisid2MdsXY.put("IRIS_313-12164", new double[] { -0.180270324315873, 0.00720901335322162 });
		mapIrisid2MdsXY.put("IRIS_313-12180", new double[] { 0.105252861839344, 0.0201497494333854 });
		mapIrisid2MdsXY.put("IRIS_313-12182", new double[] { 0.0990625495074046, 0.0199995208530103 });
		mapIrisid2MdsXY.put("IRIS_313-12183", new double[] { 0.0203086506961163, -0.140611696412504 });
		mapIrisid2MdsXY.put("IRIS_313-12185", new double[] { 0.096141472094145, 0.0239870317241223 });
		mapIrisid2MdsXY.put("IRIS_313-12186", new double[] { 0.0651895279292777, 0.00985207585508893 });
		mapIrisid2MdsXY.put("IRIS_313-12187", new double[] { 0.101050510051616, 0.0170490908316362 });
		mapIrisid2MdsXY.put("IRIS_313-12188", new double[] { 0.102957403163517, 0.0294057696588956 });
		mapIrisid2MdsXY.put("IRIS_313-12190", new double[] { 0.100746737310858, 0.0171379001945568 });
		mapIrisid2MdsXY.put("IRIS_313-12193", new double[] { 0.102225474878871, 0.0257183420820192 });
		mapIrisid2MdsXY.put("IRIS_313-12194", new double[] { 0.0865729523037271, 0.0292637379273542 });
		mapIrisid2MdsXY.put("IRIS_313-12200", new double[] { -0.198442149108205, 0.0128008337984037 });
		mapIrisid2MdsXY.put("IRIS_313-12207", new double[] { 0.0991044707218084, 0.014400003338145 });
		mapIrisid2MdsXY.put("IRIS_313-12210", new double[] { 0.0958554738574225, 0.0171164990314505 });
		mapIrisid2MdsXY.put("IRIS_313-12217", new double[] { -0.210221298300176, 0.0088550598915054 });
		mapIrisid2MdsXY.put("IRIS_313-12220", new double[] { 0.110993698510782, 0.0216943397971153 });
		mapIrisid2MdsXY.put("IRIS_313-12221", new double[] { 0.101978000695942, 0.0224931837401152 });
		mapIrisid2MdsXY.put("IRIS_313-12222", new double[] { 0.0993994464772519, 0.0150714005025488 });
		mapIrisid2MdsXY.put("IRIS_313-12224", new double[] { 0.104449704275805, 0.0252458878223165 });
		mapIrisid2MdsXY.put("IRIS_313-12225", new double[] { 0.105301620663992, 0.0225385584515363 });
		mapIrisid2MdsXY.put("IRIS_313-12226", new double[] { -0.199696659301153, 0.00943601119978862 });
		mapIrisid2MdsXY.put("IRIS_313-12227", new double[] { -0.19351239455614, 0.0128305183942221 });
		mapIrisid2MdsXY.put("IRIS_313-12228", new double[] { -0.199642737153105, 0.0099664916071649 });
		mapIrisid2MdsXY.put("IRIS_313-12229", new double[] { 0.106179688481432, 0.0257741665479153 });
		mapIrisid2MdsXY.put("IRIS_313-12231", new double[] { 0.100810919847373, 0.023669259448767 });
		mapIrisid2MdsXY.put("IRIS_313-12232", new double[] { 0.0918578332023823, 0.0292223531412671 });
		mapIrisid2MdsXY.put("IRIS_313-12234", new double[] { 0.103752189771101, 0.0308148925924816 });
		mapIrisid2MdsXY.put("IRIS_313-12236", new double[] { 0.0986305438914708, 0.0145869471749845 });
		mapIrisid2MdsXY.put("IRIS_313-12237", new double[] { 0.0918462400422734, 0.0199141836291013 });
		mapIrisid2MdsXY.put("IRIS_313-12240", new double[] { 0.0992538959682883, 0.0262864517196366 });
		mapIrisid2MdsXY.put("IRIS_313-12241", new double[] { -0.186455844848766, 0.00837726200767115 });
		mapIrisid2MdsXY.put("IRIS_313-12242", new double[] { -0.201410333249882, 0.008482074431423 });
		mapIrisid2MdsXY.put("IRIS_313-12244", new double[] { -0.185794291639817, 0.00544510268436789 });
		mapIrisid2MdsXY.put("IRIS_313-12246", new double[] { 0.0999058410806742, 0.0265593437468808 });
		mapIrisid2MdsXY.put("IRIS_313-12247", new double[] { 0.0969517114862721, 0.0227473455993322 });
		mapIrisid2MdsXY.put("IRIS_313-12249", new double[] { 0.101145504861948, 0.0117430113015416 });
		mapIrisid2MdsXY.put("IRIS_313-12251", new double[] { 0.116767991070143, 0.0179798892827819 });
		mapIrisid2MdsXY.put("IRIS_313-12252", new double[] { -0.19433669650968, 0.010737485382069 });
		mapIrisid2MdsXY.put("IRIS_313-12254", new double[] { -0.198456987732825, 0.0125239800896369 });
		mapIrisid2MdsXY.put("IRIS_313-12257", new double[] { -0.197868671036405, 0.0126944081251852 });
		mapIrisid2MdsXY.put("IRIS_313-12258", new double[] { -0.199724915394354, 0.0108321824820216 });
		mapIrisid2MdsXY.put("IRIS_313-12259", new double[] { 0.108322992955647, 0.0266335101073786 });
		mapIrisid2MdsXY.put("IRIS_313-12260", new double[] { 0.0955408707917057, 0.0247415159622294 });
		mapIrisid2MdsXY.put("IRIS_313-12261", new double[] { 0.108670946906656, 0.028497280286881 });
		mapIrisid2MdsXY.put("IRIS_313-12262", new double[] { -0.200021634746795, 0.0116711740711267 });
		mapIrisid2MdsXY.put("IRIS_313-12263", new double[] { 0.104246924476731, 0.0284819974783437 });
		mapIrisid2MdsXY.put("IRIS_313-12265", new double[] { -0.19803460520143, 0.00972687335725888 });
		mapIrisid2MdsXY.put("IRIS_313-12266", new double[] { -0.19985576944115, 0.00555257610266031 });
		mapIrisid2MdsXY.put("IRIS_313-12268", new double[] { 0.105466981613879, 0.0246867801726781 });
		mapIrisid2MdsXY.put("IRIS_313-12269", new double[] { 0.112365903915155, 0.00968624207467849 });
		mapIrisid2MdsXY.put("IRIS_313-12270", new double[] { 0.102809791424234, 0.020891430289396 });
		mapIrisid2MdsXY.put("IRIS_313-12271", new double[] { -0.189879532034413, 0.00600370994719739 });
		mapIrisid2MdsXY.put("IRIS_313-12272", new double[] { -0.190417829744159, 0.0057294189274739 });
		mapIrisid2MdsXY.put("IRIS_313-12273", new double[] { 0.0950590331741867, 0.0175579196392311 });
		mapIrisid2MdsXY.put("IRIS_313-12275", new double[] { 0.0938207008855209, 0.0198040994333416 });
		mapIrisid2MdsXY.put("IRIS_313-12278", new double[] { 0.0867138336028829, -0.0260210869340308 });
		mapIrisid2MdsXY.put("IRIS_313-12279", new double[] { -0.185803319519771, 0.010101943113414 });
		mapIrisid2MdsXY.put("IRIS_313-12280", new double[] { 0.105789220259705, 0.00936766117617179 });
		mapIrisid2MdsXY.put("IRIS_313-12281", new double[] { -0.190580829465707, 0.0154258619880384 });
		mapIrisid2MdsXY.put("IRIS_313-12282", new double[] { 0.0946870001189732, -0.00269434591486498 });
		mapIrisid2MdsXY.put("IRIS_313-12283", new double[] { 0.101590176949792, -0.00488415522728007 });
		mapIrisid2MdsXY.put("IRIS_313-12284", new double[] { 0.0864908289717035, -0.0572511196755696 });
		mapIrisid2MdsXY.put("IRIS_313-12285", new double[] { -0.177904272266038, 0.00537998498182851 });
		mapIrisid2MdsXY.put("IRIS_313-12286", new double[] { 0.110168692560498, 0.0196986143652572 });
		mapIrisid2MdsXY.put("IRIS_313-12287", new double[] { 0.100901635344018, 0.0330727764982558 });
		mapIrisid2MdsXY.put("IRIS_313-12288", new double[] { 0.103534593114658, 0.0204545359204659 });
		mapIrisid2MdsXY.put("IRIS_313-12289", new double[] { -0.199955227972141, 0.00789710117234459 });
		mapIrisid2MdsXY.put("IRIS_313-12290", new double[] { 0.0981738073441166, 0.0244670777909968 });
		mapIrisid2MdsXY.put("IRIS_313-12291", new double[] { 0.1120246537118, 0.0197754777936211 });
		mapIrisid2MdsXY.put("IRIS_313-12292", new double[] { 0.100648851967924, 0.021016240626356 });
		mapIrisid2MdsXY.put("IRIS_313-12296", new double[] { 0.0991340340004547, 0.0221490289551697 });
		mapIrisid2MdsXY.put("IRIS_313-12297", new double[] { 0.0896795462757816, 0.0166287154338964 });
		mapIrisid2MdsXY.put("IRIS_313-12299", new double[] { -0.181525035374262, 0.0117175816382596 });
		mapIrisid2MdsXY.put("IRIS_313-12300", new double[] { 0.106467973139105, 0.0175505645651421 });
		mapIrisid2MdsXY.put("IRIS_313-12301", new double[] { 0.0939471058914425, 0.0194407395741449 });
		mapIrisid2MdsXY.put("IRIS_313-12302", new double[] { 0.0983717460140046, 0.0224914331161646 });
		mapIrisid2MdsXY.put("IRIS_313-12303", new double[] { 0.100855007030311, 0.0190123100516321 });
		mapIrisid2MdsXY.put("IRIS_313-12305", new double[] { 0.0992963833345522, 0.0212885488302781 });
		mapIrisid2MdsXY.put("IRIS_313-12307", new double[] { -0.204392577234223, 0.0133434608791084 });
		mapIrisid2MdsXY.put("IRIS_313-12308", new double[] { 0.101066646798807, 0.0284865071008286 });
		mapIrisid2MdsXY.put("IRIS_313-12309", new double[] { 0.0990784043345359, 0.026096134880679 });
		mapIrisid2MdsXY.put("IRIS_313-12311", new double[] { -0.202039440398614, 0.0113702248824039 });
		mapIrisid2MdsXY.put("IRIS_313-12312", new double[] { -0.199015832213809, 0.00864683462932321 });
		mapIrisid2MdsXY.put("IRIS_313-12313", new double[] { -0.190196507201685, 0.0080945044844909 });
		mapIrisid2MdsXY.put("IRIS_313-12319", new double[] { 0.0915151025555072, 0.0299809300124947 });
		mapIrisid2MdsXY.put("IRIS_313-12321", new double[] { -0.195880069641059, 0.007149224241386 });
		mapIrisid2MdsXY.put("IRIS_313-12322", new double[] { -0.197910651743284, 0.0129174436509493 });
		mapIrisid2MdsXY.put("IRIS_313-12323", new double[] { -0.200312917846006, 0.0110331513264336 });
		mapIrisid2MdsXY.put("IRIS_313-12324", new double[] { -0.200122960117077, 0.0107070870213988 });
		mapIrisid2MdsXY.put("IRIS_313-12325", new double[] { 0.10463434083157, -0.0017995580154845 });
		mapIrisid2MdsXY.put("IRIS_313-12329", new double[] { 0.0921093791178248, 0.0127443214641561 });
		mapIrisid2MdsXY.put("IRIS_313-12330", new double[] { -0.196220471737051, 0.00734574202685041 });
		mapIrisid2MdsXY.put("IRIS_313-12332", new double[] { -0.199595364782796, 0.0106865252079866 });
		mapIrisid2MdsXY.put("IRIS_313-12334", new double[] { 0.0990391843287505, 0.0263053743869988 });
		mapIrisid2MdsXY.put("IRIS_313-12336", new double[] { -0.201764247348554, 0.00858796892385423 });
		mapIrisid2MdsXY.put("IRIS_313-12337", new double[] { -0.199051587277989, 0.0114223053735761 });
		mapIrisid2MdsXY.put("IRIS_313-12340", new double[] { -0.202085605414077, 0.0126264559742938 });
		mapIrisid2MdsXY.put("IRIS_313-12341", new double[] { -0.199758844523908, 0.0111876644188998 });
		mapIrisid2MdsXY.put("IRIS_313-12342", new double[] { -0.197682207644307, 0.00830825160311041 });
		mapIrisid2MdsXY.put("IRIS_313-12344", new double[] { -0.197691876864767, 0.0116204920067597 });
		mapIrisid2MdsXY.put("IRIS_313-12345", new double[] { -0.184257910393508, 0.0112456412712353 });
		mapIrisid2MdsXY.put("IRIS_313-12346", new double[] { -0.195769477616924, 0.0136732421129279 });
		mapIrisid2MdsXY.put("IRIS_313-12347", new double[] { -0.20058122030829, 0.0080410236733132 });
		mapIrisid2MdsXY.put("IRIS_313-12348", new double[] { -0.20054339273239, 0.0107064487698695 });
		mapIrisid2MdsXY.put("IRIS_313-12349", new double[] { -0.200689646624499, 0.00853015644304743 });
		mapIrisid2MdsXY.put("IRIS_313-12350", new double[] { -0.198583576537045, 0.00895663072770603 });
		mapIrisid2MdsXY.put("IRIS_313-12351", new double[] { -0.199740538250053, 0.0105781662322504 });
		mapIrisid2MdsXY.put("IRIS_313-12352", new double[] { -0.197324292102802, 0.00959843994459494 });
		mapIrisid2MdsXY.put("IRIS_313-12353", new double[] { -0.203702183130814, 0.0107877868460796 });
		mapIrisid2MdsXY.put("IRIS_313-12354", new double[] { 0.102530834927045, 0.0292837544865836 });
		mapIrisid2MdsXY.put("IRIS_313-12355", new double[] { 0.107134197795243, 0.0253115573006614 });
		mapIrisid2MdsXY.put("IRIS_313-15896", new double[] { 0.0910176150828223, 0.0148221260454492 });
		mapIrisid2MdsXY.put("IRIS_313-15897", new double[] { 0.0986875232817776, 0.0224383868077462 });
		mapIrisid2MdsXY.put("IRIS_313-15898", new double[] { 0.101448819322142, 0.0194135819114862 });
		mapIrisid2MdsXY.put("IRIS_313-15899", new double[] { 0.0846363279725884, 0.00897624540846486 });
		mapIrisid2MdsXY.put("IRIS_313-15900", new double[] { 0.101819926849958, 0.0233215976976697 });
		mapIrisid2MdsXY.put("IRIS_313-15901", new double[] { 0.0835839344467489, 0.0197893708895195 });
		mapIrisid2MdsXY.put("IRIS_313-15902", new double[] { 0.0821209553249969, 0.0204714953212429 });
		mapIrisid2MdsXY.put("IRIS_313-15903", new double[] { 0.0693192744231874, -0.0431306959050511 });
		mapIrisid2MdsXY.put("IRIS_313-15904", new double[] { -0.210234099880324, 0.00880257064152073 });
		mapIrisid2MdsXY.put("IRIS_313-15905", new double[] { -0.177533028369369, 0.0125081842293743 });
		mapIrisid2MdsXY.put("IRIS_313-15906", new double[] { 0.050327686227126, 0.0273918452589416 });
		mapIrisid2MdsXY.put("IRIS_313-15907", new double[] { -0.183499128100718, 0.0144564569115176 });
		mapIrisid2MdsXY.put("IRIS_313-15908", new double[] { 0.0350497726551607, -0.18697403621189 });
		mapIrisid2MdsXY.put("IRIS_313-15909", new double[] { -0.118022101212342, -0.0769397552936257 });
		mapIrisid2MdsXY.put("IRIS_313-15910", new double[] { -0.183078542499905, 0.0140445321855504 });
		return mapIrisid2MdsXY;
	}

	private static Map getXY2(Map mapIrisid2MdsXY) {

		mapIrisid2MdsXY.put("B001", new double[] { -0.185443673140274, 0.0231882997866092 });
		mapIrisid2MdsXY.put("B002", new double[] { -0.198911610423992, 0.0173256393452419 });
		mapIrisid2MdsXY.put("B003", new double[] { -0.198096825013833, 0.0130387380484253 });
		mapIrisid2MdsXY.put("B004", new double[] { -0.210670634965393, 0.0113801892753273 });
		mapIrisid2MdsXY.put("B005", new double[] { -0.210075987313636, 0.0119807170287406 });
		mapIrisid2MdsXY.put("B006", new double[] { 0.107978020853618, 0.0220597026646959 });
		mapIrisid2MdsXY.put("B007", new double[] { 0.106093033147708, 0.0166394271243104 });
		mapIrisid2MdsXY.put("B008", new double[] { -0.209538028728959, 0.012233735327435 });
		mapIrisid2MdsXY.put("B009", new double[] { 0.0962826344864722, 0.0171637687066376 });
		mapIrisid2MdsXY.put("B010", new double[] { 0.0937149556708763, 0.0151806927925415 });
		mapIrisid2MdsXY.put("B011", new double[] { 0.102882149446974, -0.00663432300852035 });
		mapIrisid2MdsXY.put("B012", new double[] { 0.0785796989267942, 0.00101449667576002 });
		mapIrisid2MdsXY.put("B013", new double[] { 0.0467790919204787, 0.0291532463441433 });
		mapIrisid2MdsXY.put("B014", new double[] { -0.166483173944097, 0.035597762751005 });
		mapIrisid2MdsXY.put("B015", new double[] { 0.0986243032102184, 0.0140032341048119 });
		mapIrisid2MdsXY.put("B016", new double[] { -0.210696083414513, 0.00726668440046434 });
		mapIrisid2MdsXY.put("B017", new double[] { -0.205632194603612, 0.007657829232308 });
		mapIrisid2MdsXY.put("B018", new double[] { -0.188956212294771, 0.0116828529563228 });
		mapIrisid2MdsXY.put("B019", new double[] { 0.099514075361526, 0.0199423449756079 });
		mapIrisid2MdsXY.put("B020", new double[] { -0.0283581091984259, 0.0365864042281761 });
		mapIrisid2MdsXY.put("B021", new double[] { 0.0881440230201855, 0.0205780396752913 });
		mapIrisid2MdsXY.put("B023", new double[] { -0.169085418463328, 0.0313518819135295 });
		mapIrisid2MdsXY.put("B024", new double[] { 0.0905908328451044, 0.0168179392962085 });
		mapIrisid2MdsXY.put("B025", new double[] { -0.18290779797039, 0.016365340792895 });
		mapIrisid2MdsXY.put("B026", new double[] { 0.102750756929183, -0.00655454226372884 });
		mapIrisid2MdsXY.put("B027", new double[] { 0.098919465077377, 0.0245632368052795 });
		mapIrisid2MdsXY.put("B028", new double[] { 0.0903483313778402, 0.0199649962457188 });
		mapIrisid2MdsXY.put("B029", new double[] { 0.0649210787944973, 0.0258677403113402 });
		mapIrisid2MdsXY.put("B030", new double[] { 0.0988077239214505, 0.0159636139534186 });
		mapIrisid2MdsXY.put("B031", new double[] { 0.109209449613955, -0.00196413022868713 });
		mapIrisid2MdsXY.put("B032", new double[] { 0.104197410071456, 0.0188889707898269 });
		mapIrisid2MdsXY.put("B033", new double[] { 0.0981454412060598, 0.023218493401007 });
		mapIrisid2MdsXY.put("B034", new double[] { -0.209956527167863, 0.00837020141825092 });
		mapIrisid2MdsXY.put("B035", new double[] { 0.0714423330983736, 0.0253890722910251 });
		mapIrisid2MdsXY.put("B036", new double[] { -0.199086201087326, 0.0111493118843746 });
		mapIrisid2MdsXY.put("B037", new double[] { -0.159699818294806, 0.0311812323958481 });
		mapIrisid2MdsXY.put("B038", new double[] { -0.203277693650324, 0.0132117754165224 });
		mapIrisid2MdsXY.put("B039", new double[] { -0.00291999443016833, 0.047794032583206 });
		mapIrisid2MdsXY.put("B040", new double[] { 0.103901828981284, 0.015101504071505 });
		mapIrisid2MdsXY.put("B043", new double[] { -0.193419346358634, 0.00784088873079456 });
		mapIrisid2MdsXY.put("B044", new double[] { 0.0460886019107876, 0.0199690069288663 });
		mapIrisid2MdsXY.put("B045", new double[] { -0.210431127956027, 0.01040481041988 });
		mapIrisid2MdsXY.put("B046", new double[] { -0.210165044832437, 0.0121430018538785 });
		mapIrisid2MdsXY.put("B047", new double[] { -0.105940016323363, 0.0533916793987048 });
		mapIrisid2MdsXY.put("B048", new double[] { 0.098028461764416, 0.00875836298298946 });
		mapIrisid2MdsXY.put("B049", new double[] { 0.00761546621278264, -0.126651829631952 });
		mapIrisid2MdsXY.put("B051", new double[] { 0.0901067537344187, 0.0192298353322563 });
		mapIrisid2MdsXY.put("B052", new double[] { 0.0781743587290466, -0.0530544367662067 });
		mapIrisid2MdsXY.put("B053", new double[] { -0.168229757704899, 0.0238961682035536 });
		mapIrisid2MdsXY.put("B054", new double[] { -0.192717466176034, 0.0105272033353034 });
		mapIrisid2MdsXY.put("B055", new double[] { -0.163975070326453, 0.0263814672465919 });
		mapIrisid2MdsXY.put("B056", new double[] { -0.199574466349399, 0.0170465526823447 });
		mapIrisid2MdsXY.put("B057", new double[] { -0.199817462415413, 0.0193006700470107 });
		mapIrisid2MdsXY.put("B058", new double[] { 0.0956249489370757, 0.0236165198022325 });
		mapIrisid2MdsXY.put("B059", new double[] { 0.0965722381428026, 0.0155229034239527 });
		mapIrisid2MdsXY.put("B060", new double[] { 0.0981497489672275, 0.0207263989582415 });
		mapIrisid2MdsXY.put("B061", new double[] { 0.0989769535656087, 0.0182875325948748 });
		mapIrisid2MdsXY.put("B062", new double[] { 0.0921507378827328, 0.0188880451218522 });
		mapIrisid2MdsXY.put("B063", new double[] { 0.0895262566530167, 0.022729577123661 });
		mapIrisid2MdsXY.put("B064", new double[] { 0.0936110958128261, 0.0181978537539071 });
		mapIrisid2MdsXY.put("B065", new double[] { 0.0989511897988343, 0.0201090253522378 });
		mapIrisid2MdsXY.put("B066", new double[] { -0.205285825423525, 0.011045197373401 });
		mapIrisid2MdsXY.put("B067", new double[] { 0.100203706698237, 0.0182946702828785 });
		mapIrisid2MdsXY.put("B068", new double[] { -0.210024267256012, 0.00901643783206031 });
		mapIrisid2MdsXY.put("B069", new double[] { -0.187157932028286, 0.0176994958549629 });
		mapIrisid2MdsXY.put("B070", new double[] { -0.198077997533868, 0.01116207824184 });
		mapIrisid2MdsXY.put("B071", new double[] { -0.20077262238272, 0.0188149768699547 });
		mapIrisid2MdsXY.put("B072", new double[] { 0.0484651791579104, 0.0286761117508497 });
		mapIrisid2MdsXY.put("B073", new double[] { 0.0924982109848089, 0.0207143194598178 });
		mapIrisid2MdsXY.put("B074", new double[] { 0.0902441922140037, 0.0222459888538844 });
		mapIrisid2MdsXY.put("B075", new double[] { 0.0895612127439911, 0.0231297037040965 });
		mapIrisid2MdsXY.put("B076", new double[] { 0.0962249915559432, 0.0242128559715849 });
		mapIrisid2MdsXY.put("B077", new double[] { -0.196922667021252, 0.0189873002735671 });
		mapIrisid2MdsXY.put("B079", new double[] { 0.10279310798546, 0.0138097449101893 });
		mapIrisid2MdsXY.put("B081", new double[] { 0.0942165306951733, 0.0193270510517995 });
		mapIrisid2MdsXY.put("B082", new double[] { 0.0870495571568592, 0.0255727034892265 });
		mapIrisid2MdsXY.put("B083", new double[] { 0.101758415223485, 0.0230541124178884 });
		mapIrisid2MdsXY.put("B084", new double[] { -0.0941531700738532, 0.0440112044016423 });
		mapIrisid2MdsXY.put("B085", new double[] { 0.0944681750336846, 0.0253086912814526 });
		mapIrisid2MdsXY.put("B086", new double[] { -0.0793697434478718, 0.0353677823824511 });
		mapIrisid2MdsXY.put("B087", new double[] { 0.0873312798780863, 0.0112168491383576 });
		mapIrisid2MdsXY.put("B088", new double[] { 0.0718461698897466, 0.0252069067537108 });
		mapIrisid2MdsXY.put("B089", new double[] { 0.0865805520952603, 0.0162773929102584 });
		mapIrisid2MdsXY.put("B090", new double[] { 0.0807715695150345, 0.0100998488931106 });
		mapIrisid2MdsXY.put("B091", new double[] { 0.0927355942933161, -0.00229598052957432 });
		mapIrisid2MdsXY.put("B092", new double[] { 0.0900450377244223, 0.0229010318267725 });
		mapIrisid2MdsXY.put("B093", new double[] { 0.0739725298047185, 0.0135449065111398 });
		mapIrisid2MdsXY.put("B094", new double[] { 0.096664161358284, 0.0139351953220109 });
		mapIrisid2MdsXY.put("B095", new double[] { 0.103945399769379, 0.0192059056997693 });
		mapIrisid2MdsXY.put("B096", new double[] { 0.0953714238569952, 0.0187924083917171 });
		mapIrisid2MdsXY.put("B097", new double[] { 0.103002171875713, 0.014689087096294 });
		mapIrisid2MdsXY.put("B100", new double[] { -0.206236124204138, 0.0122101899533682 });
		mapIrisid2MdsXY.put("B101", new double[] { -0.158971398798147, 0.0391007031157019 });
		mapIrisid2MdsXY.put("B102", new double[] { -0.207310912635014, 0.00791351624625421 });
		mapIrisid2MdsXY.put("B103", new double[] { -0.189797899690676, 0.0187175592641185 });
		mapIrisid2MdsXY.put("B104", new double[] { 0.0984691069046734, 0.0202128005942335 });
		mapIrisid2MdsXY.put("B105", new double[] { 0.088822201504229, 0.0245405444330642 });
		mapIrisid2MdsXY.put("B106", new double[] { 0.100038078555352, 0.0156971156516015 });
		mapIrisid2MdsXY.put("B107", new double[] { 0.103158099178584, 0.0182108154096668 });
		mapIrisid2MdsXY.put("B108", new double[] { 0.093176849723521, 0.00419847621619487 });
		mapIrisid2MdsXY.put("B109", new double[] { -0.188849113693622, 0.00786846734596453 });
		mapIrisid2MdsXY.put("B110", new double[] { -0.19801811452238, 0.0166490921832768 });
		mapIrisid2MdsXY.put("B111", new double[] { -0.199524865366205, 0.0153676506229761 });
		mapIrisid2MdsXY.put("B112", new double[] { 0.0947868263690924, 0.0197287895542394 });
		mapIrisid2MdsXY.put("B113", new double[] { 0.0979527054731382, 0.0249205117240234 });
		mapIrisid2MdsXY.put("B114", new double[] { 0.0968670518769186, 0.0236616938640193 });
		mapIrisid2MdsXY.put("B115", new double[] { 0.0966183918973016, 0.0262421800332188 });
		mapIrisid2MdsXY.put("B116", new double[] { 0.102564220969403, 0.0103618364126345 });
		mapIrisid2MdsXY.put("B117", new double[] { -0.203295640278463, 0.0147040859270733 });
		mapIrisid2MdsXY.put("B118", new double[] { 0.0898583412194564, 0.0298499951107958 });
		mapIrisid2MdsXY.put("B119", new double[] { 0.0878740389830757, 0.0226210513623623 });
		mapIrisid2MdsXY.put("B120", new double[] { 0.092928560301029, 0.0278605651649179 });
		mapIrisid2MdsXY.put("B121", new double[] { 0.0955983906217683, 0.0191127269938493 });
		mapIrisid2MdsXY.put("B122", new double[] { -0.203868682840463, 0.0129599379178135 });
		mapIrisid2MdsXY.put("B123", new double[] { 0.0776141789868067, 0.0312333573886675 });
		mapIrisid2MdsXY.put("B124", new double[] { -0.12813799529818, 0.0470921621459764 });
		mapIrisid2MdsXY.put("B125", new double[] { 0.0837664012171239, 0.0261432871426044 });
		mapIrisid2MdsXY.put("B126", new double[] { 0.0855109449730873, 0.0234028862608105 });
		mapIrisid2MdsXY.put("B127", new double[] { 0.0881182472644221, 0.0228071732048143 });
		mapIrisid2MdsXY.put("B128", new double[] { 0.0364003936654923, 0.0337615379343738 });
		mapIrisid2MdsXY.put("B129", new double[] { 0.0890637374871311, 0.0233814945084891 });
		mapIrisid2MdsXY.put("B130", new double[] { 0.0715266574892484, 0.0232610801339518 });
		mapIrisid2MdsXY.put("B131", new double[] { 0.0903107023871778, 0.0210346743852098 });
		mapIrisid2MdsXY.put("B132", new double[] { 0.0577175607849774, 0.0287257946348826 });
		mapIrisid2MdsXY.put("B133", new double[] { 0.0810965543890872, 0.0131670320174837 });
		mapIrisid2MdsXY.put("B134", new double[] { -0.201844414559223, 0.00965738724273237 });
		mapIrisid2MdsXY.put("B135", new double[] { 0.0874498475255625, 0.0233746210810336 });
		mapIrisid2MdsXY.put("B136", new double[] { -0.202887649392102, 0.0111806654900584 });
		mapIrisid2MdsXY.put("B137", new double[] { 0.0753332507186297, 0.0306800016750667 });
		mapIrisid2MdsXY.put("B138", new double[] { 0.0719308068607098, 0.0258415520400547 });
		mapIrisid2MdsXY.put("B139", new double[] { 0.0640890336320366, 0.0318192143353443 });
		mapIrisid2MdsXY.put("B140", new double[] { 0.093083574756642, 0.0213679754629869 });
		mapIrisid2MdsXY.put("B141", new double[] { -0.0461089625047164, 0.0460149391365603 });
		mapIrisid2MdsXY.put("B142", new double[] { -0.0991122809136809, 0.0438123223024471 });
		mapIrisid2MdsXY.put("B143", new double[] { -0.115033036653729, 0.0423021295519792 });
		mapIrisid2MdsXY.put("B144", new double[] { -0.177858341971697, 0.0190280193641758 });
		mapIrisid2MdsXY.put("B145", new double[] { 0.058577328648435, 0.0259208179356793 });
		mapIrisid2MdsXY.put("B146", new double[] { 0.0908169046995335, 0.0304771376153945 });
		mapIrisid2MdsXY.put("B147", new double[] { 0.0673912203839339, 0.0233330686017367 });
		mapIrisid2MdsXY.put("B148", new double[] { -0.201863707676437, 0.0122777303887002 });
		mapIrisid2MdsXY.put("B149", new double[] { 0.0982541624244208, 0.0234751890172377 });
		mapIrisid2MdsXY.put("B150", new double[] { 0.0753339084481828, 0.0264027727623454 });
		mapIrisid2MdsXY.put("B151", new double[] { 0.0900068125309112, 0.02219080053201 });
		mapIrisid2MdsXY.put("B152", new double[] { -0.128390869870415, 0.0379494152660854 });
		mapIrisid2MdsXY.put("B153", new double[] { 0.0707635188680622, 0.0305207773227659 });
		mapIrisid2MdsXY.put("B154", new double[] { -0.195133786339742, 0.021230850036243 });
		mapIrisid2MdsXY.put("B155", new double[] { 0.0568305956918036, 0.0272545902812439 });
		mapIrisid2MdsXY.put("B156", new double[] { 0.0952011470927376, 0.0174246809040175 });
		mapIrisid2MdsXY.put("B157", new double[] { 0.0960187286050814, 0.0204018302615621 });
		mapIrisid2MdsXY.put("B158", new double[] { -0.0515716286622152, 0.0467164646765381 });
		mapIrisid2MdsXY.put("B159", new double[] { 0.0909974601374114, 0.0287049147471957 });
		mapIrisid2MdsXY.put("B160", new double[] { -0.210561254865052, 0.011593956217671 });
		mapIrisid2MdsXY.put("B161", new double[] { -0.206540314522973, 0.0106471620757141 });
		mapIrisid2MdsXY.put("B162", new double[] { -0.205592681275066, 0.0163898657494824 });
		mapIrisid2MdsXY.put("B163", new double[] { 0.0837791777542399, 0.0141919693646689 });
		mapIrisid2MdsXY.put("B164", new double[] { 0.0345869889090312, -0.131807129389326 });
		mapIrisid2MdsXY.put("B165", new double[] { 0.0853681044320555, 0.0175713578579295 });
		mapIrisid2MdsXY.put("B166", new double[] { -0.210020453564968, 0.0101148290779942 });
		mapIrisid2MdsXY.put("B167", new double[] { -0.210548807204573, 0.0109261113028009 });
		mapIrisid2MdsXY.put("B168", new double[] { -0.198529237812231, 0.0139585516879424 });
		mapIrisid2MdsXY.put("B169", new double[] { -0.209995729639486, 0.01252741197794 });
		mapIrisid2MdsXY.put("B170", new double[] { -0.20666967240225, 0.0123764120275329 });
		mapIrisid2MdsXY.put("B171", new double[] { -0.209387404715394, 0.0128903426888781 });
		mapIrisid2MdsXY.put("B173", new double[] { -0.00839505700435957, 0.00905910967438046 });
		mapIrisid2MdsXY.put("B176", new double[] { 0.0430683519682387, 0.0273683319736816 });
		mapIrisid2MdsXY.put("B179", new double[] { -0.210096253103072, 0.00678139010885311 });
		mapIrisid2MdsXY.put("B180", new double[] { 0.105659442440254, 0.0160366423190908 });
		mapIrisid2MdsXY.put("B181", new double[] { 0.0752170498807735, 0.0310048329277519 });
		mapIrisid2MdsXY.put("B182", new double[] { -0.210565234570066, 0.0116491366347833 });
		mapIrisid2MdsXY.put("B183", new double[] { -0.208542058334796, 0.0132804966823696 });
		mapIrisid2MdsXY.put("B184", new double[] { 0.0690409862699746, 0.0220586309612888 });
		mapIrisid2MdsXY.put("B185", new double[] { 0.0886359580829539, 0.0166572727953778 });
		mapIrisid2MdsXY.put("B187", new double[] { 0.0861473154966479, 8.06197919742579E-05 });
		mapIrisid2MdsXY.put("B188", new double[] { -0.193259051071614, 0.00768525814818349 });
		mapIrisid2MdsXY.put("B189", new double[] { -0.193752070192525, 0.00702700879810617 });
		mapIrisid2MdsXY.put("B190", new double[] { -0.188593534290503, 0.01028064353702 });
		mapIrisid2MdsXY.put("B191", new double[] { -0.188238060081931, 0.0140530223001334 });
		mapIrisid2MdsXY.put("B192", new double[] { -0.0428256737270638, 0.0113278340146779 });
		mapIrisid2MdsXY.put("B193", new double[] { 0.0892217365601044, 0.0308685549006286 });
		mapIrisid2MdsXY.put("B194", new double[] { 0.0937286577411319, 0.0328104872648121 });
		mapIrisid2MdsXY.put("B195", new double[] { 0.0902718483564313, 0.0239859428098705 });
		mapIrisid2MdsXY.put("B196", new double[] { -0.180679086737073, 0.0199343754622511 });
		mapIrisid2MdsXY.put("B197", new double[] { 0.10375024102737, 0.0113744412821757 });
		mapIrisid2MdsXY.put("B198", new double[] { 0.0890212450221195, 0.0133887108877388 });
		mapIrisid2MdsXY.put("B199", new double[] { -0.201409346740596, 0.0120291171290178 });
		mapIrisid2MdsXY.put("B200", new double[] { 0.0881083992672846, 0.0226176608127976 });
		mapIrisid2MdsXY.put("B201", new double[] { 0.0741208415650177, 0.0314774356530042 });
		mapIrisid2MdsXY.put("B202", new double[] { 0.0682556921442837, 0.029226436844874 });
		mapIrisid2MdsXY.put("B203", new double[] { 0.0741367988849202, 0.0255721940309045 });
		mapIrisid2MdsXY.put("B204", new double[] { -0.210900701152322, 0.010160043980479 });
		mapIrisid2MdsXY.put("B205", new double[] { -0.207058642539666, 0.0086130665972589 });
		mapIrisid2MdsXY.put("B207", new double[] { 0.0798537148683141, 0.0243548134852996 });
		mapIrisid2MdsXY.put("B208", new double[] { 0.100191316428129, 0.0167685543208881 });
		mapIrisid2MdsXY.put("B210", new double[] { 0.0906589946275876, 0.0114607225534191 });
		mapIrisid2MdsXY.put("B212", new double[] { -0.184485720049036, 0.00888524186055024 });
		mapIrisid2MdsXY.put("B213", new double[] { 0.0917582584918855, 0.0184218297136254 });
		mapIrisid2MdsXY.put("B214", new double[] { 0.0968715487512509, 0.0298238861034029 });
		mapIrisid2MdsXY.put("B215", new double[] { -0.207720155042822, 0.0134941448633933 });
		mapIrisid2MdsXY.put("B216", new double[] { 0.0852871798284, 0.00901948963548017 });
		mapIrisid2MdsXY.put("B217", new double[] { 0.0964904952271719, 0.0289590187920033 });
		mapIrisid2MdsXY.put("B218", new double[] { -0.20836459575536, 0.0133115105554572 });
		mapIrisid2MdsXY.put("B219", new double[] { 0.0949579845112146, 0.0194014301140086 });
		mapIrisid2MdsXY.put("B221", new double[] { 0.0742735538406842, -0.052103440518516 });
		mapIrisid2MdsXY.put("B222", new double[] { 0.0906646906956938, 0.0113108613081846 });
		mapIrisid2MdsXY.put("B223", new double[] { -0.202437121792855, 0.0105285854841477 });
		mapIrisid2MdsXY.put("B224", new double[] { 0.0863820201196875, 0.00959317655134976 });
		mapIrisid2MdsXY.put("B225", new double[] { -0.203178377667969, 0.0123178873197759 });
		mapIrisid2MdsXY.put("B226", new double[] { -0.211421066652714, 0.00764135725230565 });
		mapIrisid2MdsXY.put("B227", new double[] { 0.0563889512831851, 0.025649312948607 });
		mapIrisid2MdsXY.put("B228", new double[] { -0.199352003700581, 0.0113144596145109 });
		mapIrisid2MdsXY.put("B229", new double[] { 0.0883235912490392, 0.0149855218882618 });
		mapIrisid2MdsXY.put("B230", new double[] { -0.203394860312474, 0.00680345544733789 });
		mapIrisid2MdsXY.put("B231", new double[] { 0.088954067404443, 0.0202484159486971 });
		mapIrisid2MdsXY.put("B232", new double[] { 0.0914651772127086, 0.0274018222206836 });
		mapIrisid2MdsXY.put("B233", new double[] { 0.099761839517617, 0.0137432698031084 });
		mapIrisid2MdsXY.put("B234", new double[] { 0.0958182148574875, 0.0225056469061038 });
		mapIrisid2MdsXY.put("B235", new double[] { -0.197081662443712, 0.0158357456107389 });
		mapIrisid2MdsXY.put("B236", new double[] { -0.20851915813913, 0.0108976290972503 });
		mapIrisid2MdsXY.put("B238", new double[] { 0.0778398933262312, 0.0252638183822377 });
		mapIrisid2MdsXY.put("B239", new double[] { 0.0872490045827633, 0.0169477238280579 });
		mapIrisid2MdsXY.put("B240", new double[] { -0.210515499453706, 0.0138135208579625 });
		mapIrisid2MdsXY.put("B241", new double[] { -0.196883883735411, 0.0073891717829441 });
		mapIrisid2MdsXY.put("B242", new double[] { 0.0676341948709271, 0.0291714670952277 });
		mapIrisid2MdsXY.put("B243", new double[] { 0.0344346341860349, -0.138368271839375 });
		mapIrisid2MdsXY.put("B244", new double[] { 0.0760119469101295, 0.0181266319736511 });
		mapIrisid2MdsXY.put("B245", new double[] { -0.205603646193433, 0.00795826178166163 });
		mapIrisid2MdsXY.put("B246", new double[] { 0.0947504663150083, 0.0141201635947984 });
		mapIrisid2MdsXY.put("B247", new double[] { 0.0963120769324447, 0.0162702395825233 });
		mapIrisid2MdsXY.put("B248", new double[] { 0.0935561935206699, 0.0174513328234158 });
		mapIrisid2MdsXY.put("B249", new double[] { 0.0951195356038767, 0.0198515433587686 });
		mapIrisid2MdsXY.put("B250", new double[] { -0.209947447157131, 0.00930192269747582 });
		mapIrisid2MdsXY.put("B252", new double[] { 0.084830498559458, 0.0209621811550098 });
		mapIrisid2MdsXY.put("B253", new double[] { 0.0908627464320561, 0.0227658479725808 });
		mapIrisid2MdsXY.put("B254", new double[] { 0.0921498810170932, 0.0220463315284356 });
		mapIrisid2MdsXY.put("B255", new double[] { 0.0848085985474896, 0.0228700564651191 });
		mapIrisid2MdsXY.put("B258", new double[] { -0.208044696878102, 0.00613526318470189 });
		mapIrisid2MdsXY.put("B259", new double[] { 0.0932605879944197, 0.015893161796772 });
		mapIrisid2MdsXY.put("B260", new double[] { 0.0862650449650151, 0.0157218776537757 });
		mapIrisid2MdsXY.put("B261", new double[] { 0.101303720983815, 0.0182451272399053 });
		mapIrisid2MdsXY.put("B263", new double[] { -0.210478525872113, 0.0123441324632724 });
		mapIrisid2MdsXY.put("B264", new double[] { 0.0966663542103298, 0.02109893210812 });
		mapIrisid2MdsXY.put("B265", new double[] { 0.0949975509993037, 0.0202672969842782 });
		mapIrisid2MdsXY.put("B266", new double[] { -0.197849583746806, 0.00933028747786169 });
		mapIrisid2MdsXY.put("B267", new double[] { 0.0956132595710421, 0.0280772084525004 });
		mapIrisid2MdsXY.put("B268", new double[] { 0.0898000842954769, 0.00215427679006149 });
		mapIrisid2MdsXY.put("B269", new double[] { -0.210380245472089, 0.0123368152918845 });
		mapIrisid2MdsXY.put("CX2", new double[] { 0.0857867000581735, 0.0301022179140517 });
		mapIrisid2MdsXY.put("CX3", new double[] { 0.10439515903192, 0.0163133017861236 });
		mapIrisid2MdsXY.put("CX4", new double[] { -0.0406382414548171, 0.0448636213760031 });
		mapIrisid2MdsXY.put("CX5", new double[] { 0.0521204212761522, 0.0414086979617263 });
		mapIrisid2MdsXY.put("CX6", new double[] { -0.0774601804908611, 0.0451524159563975 });
		mapIrisid2MdsXY.put("CX8", new double[] { 0.0711300587012741, 0.0314588103647324 });
		mapIrisid2MdsXY.put("CX9", new double[] { 0.077420546807448, 0.0386026531971802 });
		mapIrisid2MdsXY.put("CX10", new double[] { 0.085344477894334, 0.0236571473632789 });
		mapIrisid2MdsXY.put("CX11", new double[] { -0.116532042071722, 0.0422051023357441 });
		mapIrisid2MdsXY.put("CX12", new double[] { 0.0670339678826496, 0.0211866908128311 });
		mapIrisid2MdsXY.put("CX13", new double[] { 0.0145179842525496, 0.0298346584678252 });
		mapIrisid2MdsXY.put("CX14", new double[] { -0.208532827254452, 0.0144741851824469 });
		mapIrisid2MdsXY.put("CX15", new double[] { 0.0373087521879495, 0.038307866302997 });
		mapIrisid2MdsXY.put("CX16", new double[] { -0.192816802512417, 0.0218169091734098 });
		mapIrisid2MdsXY.put("CX17", new double[] { 0.0889914590148486, 0.0241059814241141 });
		mapIrisid2MdsXY.put("CX18", new double[] { 0.084029859386017, 0.0228361779172661 });
		mapIrisid2MdsXY.put("CX19", new double[] { 0.0860768271357598, 0.024244697954244 });
		mapIrisid2MdsXY.put("CX20", new double[] { 0.0794798134440128, 0.0279549459037589 });
		mapIrisid2MdsXY.put("CX21", new double[] { 0.097623292396759, 0.024926931200385 });
		mapIrisid2MdsXY.put("CX22", new double[] { 0.0855533710782003, 0.0320546992022274 });
		mapIrisid2MdsXY.put("CX23", new double[] { 0.100434065097444, 0.0203877589992845 });
		mapIrisid2MdsXY.put("CX24", new double[] { 0.0973685734185435, -0.000873908900532276 });
		mapIrisid2MdsXY.put("CX25", new double[] { 0.104176859943952, 0.0281345892727678 });
		mapIrisid2MdsXY.put("CX26", new double[] { 0.0957674210001496, 0.0150031015637853 });
		mapIrisid2MdsXY.put("CX27", new double[] { 0.0979517448917453, 0.0240669101601974 });
		mapIrisid2MdsXY.put("CX28", new double[] { 0.0529286018332192, 0.040917545977331 });
		mapIrisid2MdsXY.put("CX29", new double[] { -0.0659292145606561, 0.0414421366842581 });
		mapIrisid2MdsXY.put("CX30", new double[] { 0.0826550840914182, 0.0312634458584876 });
		mapIrisid2MdsXY.put("CX31", new double[] { 0.0972231500537848, 0.0220856029293217 });
		mapIrisid2MdsXY.put("CX32", new double[] { -0.139276261053269, 0.0157660225272119 });
		mapIrisid2MdsXY.put("CX33", new double[] { 0.100177858316891, 0.019284980989766 });
		mapIrisid2MdsXY.put("CX34", new double[] { 0.101821688203562, 0.00990162904948078 });
		mapIrisid2MdsXY.put("CX35", new double[] { 0.102464878256418, 0.0247550193113797 });
		mapIrisid2MdsXY.put("CX37", new double[] { 0.0944370540559959, 0.0233612246462102 });
		mapIrisid2MdsXY.put("CX42", new double[] { 0.0877106352675274, 0.0239634064419148 });
		mapIrisid2MdsXY.put("CX43", new double[] { 0.0969445978544131, 0.0211750491495598 });
		mapIrisid2MdsXY.put("CX44", new double[] { 0.0976672198355459, 0.0230938895564974 });
		mapIrisid2MdsXY.put("CX45", new double[] { 0.106294367899559, 0.0241665551529671 });
		mapIrisid2MdsXY.put("CX46", new double[] { -0.0119604042207266, -0.00444407756728868 });
		mapIrisid2MdsXY.put("CX47", new double[] { -0.204740748839255, 0.0160734139994836 });
		mapIrisid2MdsXY.put("CX48", new double[] { 0.0863402916407713, 0.0274288112558652 });
		mapIrisid2MdsXY.put("CX49", new double[] { -0.133638911753623, 0.039053938936255 });
		mapIrisid2MdsXY.put("CX50", new double[] { 0.092555499842794, 0.0221429626349252 });
		mapIrisid2MdsXY.put("CX51", new double[] { 0.0475683150845861, 0.0277258819847217 });
		mapIrisid2MdsXY.put("CX52", new double[] { 0.0938436174323176, 0.0229790724978419 });
		mapIrisid2MdsXY.put("CX53", new double[] { 0.10518690935631, 0.0278081490322793 });
		mapIrisid2MdsXY.put("CX54", new double[] { 0.101504981788427, 0.0208310308147468 });
		mapIrisid2MdsXY.put("CX55", new double[] { 0.0979728256901587, 0.0207538311572753 });
		mapIrisid2MdsXY.put("CX56", new double[] { -0.208712721300893, 0.0117576448994704 });
		mapIrisid2MdsXY.put("CX57", new double[] { -0.163483812153649, 0.0254091196899045 });
		mapIrisid2MdsXY.put("CX58", new double[] { -0.208022186283659, 0.0138903485137442 });
		mapIrisid2MdsXY.put("CX59", new double[] { -0.124292547057759, -0.0462337367773418 });
		mapIrisid2MdsXY.put("CX60", new double[] { 0.0590159448149626, 0.0237075524636278 });
		mapIrisid2MdsXY.put("CX61", new double[] { 0.0904087230486879, 0.0185801943035538 });
		mapIrisid2MdsXY.put("CX63", new double[] { 0.0270133464344619, -0.171323475203241 });
		mapIrisid2MdsXY.put("CX64", new double[] { 0.0812196897637885, 0.0274786270148821 });
		mapIrisid2MdsXY.put("CX65", new double[] { -0.144985387943227, -0.0525279024111848 });
		mapIrisid2MdsXY.put("CX66", new double[] { -0.144828976242025, -0.0514724248592853 });
		mapIrisid2MdsXY.put("CX67", new double[] { -0.14665621804851, -0.0502162449023858 });
		mapIrisid2MdsXY.put("CX68", new double[] { 0.0952524958604468, 0.0253614297366964 });
		mapIrisid2MdsXY.put("CX69", new double[] { 0.0250654354583361, 0.0143986671137801 });
		mapIrisid2MdsXY.put("CX70", new double[] { 0.0976838105357949, 0.0227074500056248 });
		mapIrisid2MdsXY.put("CX71", new double[] { 0.0988989411464299, 0.0263455133841634 });
		mapIrisid2MdsXY.put("CX72", new double[] { -0.0555372613605342, -0.0482320888778343 });
		mapIrisid2MdsXY.put("CX73", new double[] { 0.100964576250814, 0.0270790357269588 });
		mapIrisid2MdsXY.put("CX74", new double[] { -0.209446208187124, 0.0123344887775365 });
		mapIrisid2MdsXY.put("CX75", new double[] { 0.0906612212903844, 0.0231961371661884 });
		mapIrisid2MdsXY.put("CX76", new double[] { 0.0941987686694006, 0.0203405333233312 });
		mapIrisid2MdsXY.put("CX77", new double[] { -0.188136579563046, 0.0126416648005822 });
		mapIrisid2MdsXY.put("CX78", new double[] { -0.203485557097612, 0.0126899041399088 });
		mapIrisid2MdsXY.put("CX79", new double[] { 0.101001279265211, 0.0219082942076842 });
		mapIrisid2MdsXY.put("CX80", new double[] { 0.107924346931971, 0.0250207915448511 });
		mapIrisid2MdsXY.put("CX82", new double[] { 0.0968732585176516, 0.0279767009947357 });
		mapIrisid2MdsXY.put("CX83", new double[] { 0.106751915449532, 0.028501403541965 });
		mapIrisid2MdsXY.put("CX84", new double[] { 0.102270448217859, 0.0277623776622951 });
		mapIrisid2MdsXY.put("CX85", new double[] { 0.098311311944507, 0.0179712086617036 });
		mapIrisid2MdsXY.put("CX86", new double[] { 0.0851665568532896, 0.0305745909521893 });
		mapIrisid2MdsXY.put("CX87", new double[] { 0.0910279211574429, 0.0264620617345841 });
		mapIrisid2MdsXY.put("CX88", new double[] { 0.0915203859381475, 0.014708854685549 });
		mapIrisid2MdsXY.put("CX89", new double[] { 0.078484232066522, 0.0202635989212116 });
		mapIrisid2MdsXY.put("CX90", new double[] { 0.038643159896948, 0.0251455030977475 });
		mapIrisid2MdsXY.put("CX91", new double[] { 0.0900232031232693, 0.0208012413533602 });
		mapIrisid2MdsXY.put("CX92", new double[] { 0.0950670786855448, 0.0245337600605833 });
		mapIrisid2MdsXY.put("CX93", new double[] { 0.0875852050275514, 0.0228635136614741 });
		mapIrisid2MdsXY.put("CX94", new double[] { 0.106054330798836, 0.0202465830639216 });
		mapIrisid2MdsXY.put("CX96", new double[] { 0.103205698289945, 0.021431099357199 });
		mapIrisid2MdsXY.put("CX97", new double[] { 0.107922287952245, 0.0237568556437466 });
		mapIrisid2MdsXY.put("CX98", new double[] { 0.100023680787277, -0.0329120984273313 });
		mapIrisid2MdsXY.put("CX99", new double[] { 0.0989402591969904, -0.0166773736806189 });
		mapIrisid2MdsXY.put("CX100", new double[] { 0.0358104719320582, 0.0246704779084149 });
		mapIrisid2MdsXY.put("CX101", new double[] { 0.0916686370595187, 0.0173977976861331 });
		mapIrisid2MdsXY.put("CX102", new double[] { 0.100995204737749, 0.0179457534461896 });
		mapIrisid2MdsXY.put("CX103", new double[] { 0.00180660834110241, 0.00160593700045121 });
		mapIrisid2MdsXY.put("CX104", new double[] { -0.144795124241144, -0.0411054602621781 });
		mapIrisid2MdsXY.put("CX106", new double[] { -0.187173107878984, 0.0118532601924147 });
		mapIrisid2MdsXY.put("CX107", new double[] { 0.104790681050889, 0.0300281811443556 });
		mapIrisid2MdsXY.put("CX108", new double[] { 0.0611487605339032, -0.0849245880252561 });
		mapIrisid2MdsXY.put("CX109", new double[] { -0.174458961903857, 0.00642692905612929 });
		mapIrisid2MdsXY.put("CX110", new double[] { -0.137588280882034, -0.0502007903848645 });
		mapIrisid2MdsXY.put("CX111", new double[] { -0.195539211181391, 0.0106566533025587 });
		mapIrisid2MdsXY.put("CX112", new double[] { -0.121161120221689, -0.060239051197857 });
		mapIrisid2MdsXY.put("CX113", new double[] { -0.192353347014379, 0.00681221833372827 });
		mapIrisid2MdsXY.put("CX114", new double[] { 0.099504853713639, 0.0182488908283315 });
		mapIrisid2MdsXY.put("CX115", new double[] { 0.0639866176202265, 0.0144401201669868 });
		mapIrisid2MdsXY.put("CX116", new double[] { -0.210157955516254, 0.0114082633878157 });
		mapIrisid2MdsXY.put("CX117", new double[] { 0.100766477611457, 0.0192254488382877 });
		mapIrisid2MdsXY.put("CX118", new double[] { 0.0999256262128655, 0.0142811996091278 });
		mapIrisid2MdsXY.put("CX119", new double[] { 0.0952264800479827, 0.0238009855650771 });
		mapIrisid2MdsXY.put("CX120", new double[] { 0.0678370578375127, 0.0228420168174449 });
		mapIrisid2MdsXY.put("CX121", new double[] { 0.0887317997024676, 0.0244769624067515 });
		mapIrisid2MdsXY.put("CX122", new double[] { 0.0802541049521127, 0.0213092031073987 });
		mapIrisid2MdsXY.put("CX123", new double[] { 0.0933394183518042, 0.0126080296009051 });
		mapIrisid2MdsXY.put("CX124", new double[] { 0.0648961988906483, 0.0303472025487714 });
		mapIrisid2MdsXY.put("CX125", new double[] { 0.0935734263950862, 0.0244776765833577 });
		mapIrisid2MdsXY.put("CX126", new double[] { 0.0866857159976119, 0.0246084478130232 });
		mapIrisid2MdsXY.put("CX128", new double[] { 0.0988365672838702, 0.0245497232145134 });
		mapIrisid2MdsXY.put("CX129", new double[] { -0.172749695178667, 0.0126892960096606 });
		mapIrisid2MdsXY.put("CX130", new double[] { 0.0744386753570944, 0.00204009922929546 });
		mapIrisid2MdsXY.put("CX131", new double[] { 0.0927787440472833, 0.0161744057354703 });
		mapIrisid2MdsXY.put("CX132", new double[] { -0.194014958137365, 0.0115634216050362 });
		mapIrisid2MdsXY.put("CX133", new double[] { 0.0832406013732016, 0.0234803134892093 });
		mapIrisid2MdsXY.put("CX134", new double[] { 0.0859814632708562, 0.0268466751307319 });
		mapIrisid2MdsXY.put("CX138", new double[] { -0.162855315637351, 0.0215885554305 });
		mapIrisid2MdsXY.put("CX139", new double[] { -0.173732599845935, 0.00713330151330833 });
		mapIrisid2MdsXY.put("CX140", new double[] { -0.207951215593318, 0.012122120237301 });
		mapIrisid2MdsXY.put("CX141", new double[] { 0.100674946940858, 0.0235904989896989 });
		mapIrisid2MdsXY.put("CX142", new double[] { -0.205483796908244, 0.00795347433305879 });
		mapIrisid2MdsXY.put("CX143", new double[] { -0.132342479293735, -0.0374629336789733 });
		mapIrisid2MdsXY.put("CX144", new double[] { 0.0991555346980809, 0.0220363651395401 });
		mapIrisid2MdsXY.put("CX145", new double[] { 0.0869600895990508, 0.0276855329755598 });
		mapIrisid2MdsXY.put("CX146", new double[] { 0.0978879467193587, 0.0156597621160677 });
		mapIrisid2MdsXY.put("CX147", new double[] { 0.103947180078714, 0.020090339765101 });
		mapIrisid2MdsXY.put("CX148", new double[] { 0.0948477331656517, 0.0162013468241368 });
		mapIrisid2MdsXY.put("CX149", new double[] { -0.11731443490351, -0.0785510179620842 });
		mapIrisid2MdsXY.put("CX150", new double[] { 0.0987903629958474, 0.0287032543487875 });
		mapIrisid2MdsXY.put("CX151", new double[] { -0.186113308245405, 0.00175299760116651 });
		mapIrisid2MdsXY.put("CX152", new double[] { 0.107788203714657, 0.026609825356585 });
		mapIrisid2MdsXY.put("CX153", new double[] { 0.0857707088842361, 0.00260374498326431 });
		mapIrisid2MdsXY.put("CX154", new double[] { 0.100990792631401, 0.0286941983904275 });
		mapIrisid2MdsXY.put("CX155", new double[] { 0.0999637766917283, -0.0192883058681157 });
		mapIrisid2MdsXY.put("CX156", new double[] { 0.106431412147687, 0.0208443224493786 });
		mapIrisid2MdsXY.put("CX157", new double[] { 0.0945428987396301, -0.0172704505469294 });
		mapIrisid2MdsXY.put("CX158", new double[] { 0.106819207034068, 0.0208737257826023 });
		mapIrisid2MdsXY.put("CX160", new double[] { 0.0898984255600055, -0.0329840971853914 });
		mapIrisid2MdsXY.put("CX161", new double[] { 0.0869114118347693, 0.0203164765776381 });
		mapIrisid2MdsXY.put("CX162", new double[] { 0.0915840490898982, 0.0238792234214269 });
		mapIrisid2MdsXY.put("CX165", new double[] { -0.203863897728553, 0.0145307697098798 });
		mapIrisid2MdsXY.put("CX182", new double[] { 0.0960673696113576, 0.0224085580301189 });
		mapIrisid2MdsXY.put("CX205", new double[] { -0.17896897641895, 0.0163919832808389 });
		mapIrisid2MdsXY.put("CX206", new double[] { 0.0961990005509626, 0.0228942846730144 });
		mapIrisid2MdsXY.put("CX207", new double[] { 0.0860063475298543, 0.0227484447145144 });
		mapIrisid2MdsXY.put("CX210", new double[] { -0.0330530059145871, 0.0577086828391976 });
		mapIrisid2MdsXY.put("CX211", new double[] { -0.207563088847553, 0.0126632539926281 });
		mapIrisid2MdsXY.put("CX212", new double[] { -0.203407760191603, 0.0163387220867066 });
		mapIrisid2MdsXY.put("CX213", new double[] { -0.190719290890777, 0.019457557615421 });
		mapIrisid2MdsXY.put("CX214", new double[] { -0.187992388732748, 0.0100238420765492 });
		mapIrisid2MdsXY.put("CX218", new double[] { 0.0842128415977893, 0.0332415452991536 });
		mapIrisid2MdsXY.put("CX219", new double[] { 0.100529994820715, 0.0127891309397889 });
		mapIrisid2MdsXY.put("CX220", new double[] { -0.19106517523137, 0.00927825289798548 });
		mapIrisid2MdsXY.put("CX221", new double[] { 0.10103490527473, 0.0252450240676306 });
		mapIrisid2MdsXY.put("CX225", new double[] { 0.0905019430981906, 0.0161705951128106 });
		mapIrisid2MdsXY.put("CX226", new double[] { 0.0880087618189688, 0.0264213091213641 });
		mapIrisid2MdsXY.put("CX227", new double[] { 0.0725192572228743, -0.108947466929314 });
		mapIrisid2MdsXY.put("CX228", new double[] { 0.0622835367927324, -0.0594923231514162 });
		mapIrisid2MdsXY.put("CX230", new double[] { 0.104679404681206, 0.0213993263480913 });
		mapIrisid2MdsXY.put("CX231", new double[] { 0.089518876996279, 0.0343133698637724 });
		mapIrisid2MdsXY.put("CX232", new double[] { 0.0879393288226354, 0.0335618148124082 });
		mapIrisid2MdsXY.put("CX233", new double[] { 0.0959288374126307, 0.0305777119325129 });
		mapIrisid2MdsXY.put("CX234", new double[] { 0.0965387046214943, 0.0177390001602499 });
		mapIrisid2MdsXY.put("CX235", new double[] { 0.0965530994403782, 0.028565237787564 });
		mapIrisid2MdsXY.put("CX236", new double[] { 0.0780869396977008, -0.0302285372420866 });
		mapIrisid2MdsXY.put("CX237", new double[] { 0.0812861065513156, 0.0226878064293746 });
		mapIrisid2MdsXY.put("CX238", new double[] { 0.0837074212711704, 0.0241854310810544 });
		mapIrisid2MdsXY.put("CX240", new double[] { 0.102890811548856, 0.0296593626359082 });
		mapIrisid2MdsXY.put("CX241", new double[] { -0.191056114233061, 0.00772926718818024 });
		mapIrisid2MdsXY.put("CX242", new double[] { -0.052489586493773, 0.0457507957517668 });
		mapIrisid2MdsXY.put("CX243", new double[] { -0.131199879479667, 0.041124840706397 });
		mapIrisid2MdsXY.put("CX247", new double[] { 0.0752991889702061, 0.0325005276435848 });
		mapIrisid2MdsXY.put("CX248", new double[] { -0.184063678569306, 0.0075185603720037 });
		mapIrisid2MdsXY.put("CX249", new double[] { 0.0453221340885079, 0.0356242793246391 });
		mapIrisid2MdsXY.put("CX250", new double[] { 0.0940739773214251, 0.0270989371704128 });
		mapIrisid2MdsXY.put("CX251", new double[] { -0.206680075802329, 0.0145802274605402 });
		mapIrisid2MdsXY.put("CX262", new double[] { -0.185857416769901, 0.0122056971459229 });
		mapIrisid2MdsXY.put("CX263", new double[] { 0.0840889852398158, 0.0296399197690994 });
		mapIrisid2MdsXY.put("CX265", new double[] { 0.0826813459322182, 0.0271253066455531 });
		mapIrisid2MdsXY.put("CX266", new double[] { -0.184717251581376, 0.0104297374975049 });
		mapIrisid2MdsXY.put("CX267", new double[] { 0.0921688801019871, 0.00451793160576569 });
		mapIrisid2MdsXY.put("CX268", new double[] { 0.0789416213581909, 0.0254887917397841 });
		mapIrisid2MdsXY.put("CX269", new double[] { -0.191147010941607, 0.0103360056732107 });
		mapIrisid2MdsXY.put("CX270", new double[] { 0.0710452141125787, 0.0284155841927903 });
		mapIrisid2MdsXY.put("CX273", new double[] { 0.0919563674543012, 0.0339486723978492 });
		mapIrisid2MdsXY.put("CX274", new double[] { 0.0914513530475554, 0.0340170172675848 });
		mapIrisid2MdsXY.put("CX275", new double[] { 0.0913165750590431, 0.0334786918520062 });
		mapIrisid2MdsXY.put("CX276", new double[] { 0.10540455359116, 0.0145294510399908 });
		mapIrisid2MdsXY.put("CX277", new double[] { -0.170030768665043, 0.0229958972643531 });
		mapIrisid2MdsXY.put("CX278", new double[] { 0.0343216441739658, 0.0161780362479492 });
		mapIrisid2MdsXY.put("CX280", new double[] { -0.0683751632306888, 0.0484007915538949 });
		mapIrisid2MdsXY.put("CX281", new double[] { 0.099813876851261, 0.0205794300477763 });
		mapIrisid2MdsXY.put("CX282", new double[] { -0.10436348296771, 0.0496743024326628 });
		mapIrisid2MdsXY.put("CX284", new double[] { -0.113686926715806, 0.0478038681493758 });
		mapIrisid2MdsXY.put("CX285", new double[] { -0.180373856877107, 0.0185012694540388 });
		mapIrisid2MdsXY.put("CX286", new double[] { -0.113918892330011, 0.036555983199631 });
		mapIrisid2MdsXY.put("CX287", new double[] { -0.173097496255097, 0.021836755914401 });
		mapIrisid2MdsXY.put("CX288", new double[] { 0.0710522572325562, 0.0266569528452483 });
		mapIrisid2MdsXY.put("CX290", new double[] { 0.0912670116870188, 0.0254273799789079 });
		mapIrisid2MdsXY.put("CX291", new double[] { 0.0820033630708821, 0.030423671350403 });
		mapIrisid2MdsXY.put("CX296", new double[] { 0.101149666481455, 0.0203553706772854 });
		mapIrisid2MdsXY.put("CX303", new double[] { 0.0786486014603457, 0.0309905454269989 });
		mapIrisid2MdsXY.put("CX304", new double[] { 0.0870781322532496, 0.0301038958175581 });
		mapIrisid2MdsXY.put("CX305", new double[] { 0.0854079173561094, 0.0305386841986644 });
		mapIrisid2MdsXY.put("CX306", new double[] { -0.210371719691698, 0.0109327422208069 });
		mapIrisid2MdsXY.put("CX307", new double[] { -0.170010917174851, 0.0198728826289124 });
		mapIrisid2MdsXY.put("CX313", new double[] { 0.0716791224363193, 0.0338683604068158 });
		mapIrisid2MdsXY.put("CX314", new double[] { 0.0870814852402601, 0.0321413281051921 });
		mapIrisid2MdsXY.put("CX315", new double[] { -0.195021992612002, 0.0163509327895907 });
		mapIrisid2MdsXY.put("CX316", new double[] { -0.0852630557701126, 0.0433588038642319 });
		mapIrisid2MdsXY.put("CX317", new double[] { -0.148194531738017, 0.0313259056446486 });
		mapIrisid2MdsXY.put("CX318", new double[] { 0.0946128884219944, 0.0215265689817983 });
		mapIrisid2MdsXY.put("CX319", new double[] { 0.0947056677323346, 0.0226717056903994 });
		mapIrisid2MdsXY.put("CX328", new double[] { 0.093273615283211, 0.0214095596565835 });
		mapIrisid2MdsXY.put("CX329", new double[] { -0.206806819917782, 0.0127281430766302 });
		mapIrisid2MdsXY.put("CX330", new double[] { -0.207182171105125, 0.0125059120689309 });
		mapIrisid2MdsXY.put("CX340", new double[] { 0.0772392878378511, 0.038730407636232 });
		mapIrisid2MdsXY.put("CX341", new double[] { 0.0996089592789259, 0.0300252375342115 });
		mapIrisid2MdsXY.put("CX342", new double[] { 0.0683302836856288, 0.0338272033004728 });
		mapIrisid2MdsXY.put("CX343", new double[] { 0.036302890708963, 0.0363326069901638 });
		mapIrisid2MdsXY.put("CX344", new double[] { -0.202259183450011, 0.0179111659159684 });
		mapIrisid2MdsXY.put("CX345", new double[] { -0.204780801940086, 0.0107152891041488 });
		mapIrisid2MdsXY.put("CX346", new double[] { 0.0899401191342159, 0.0240746552475004 });
		mapIrisid2MdsXY.put("CX347", new double[] { 0.058683715103288, 0.0276126688623583 });
		mapIrisid2MdsXY.put("CX348", new double[] { 0.0987707562390802, 0.029886898065597 });
		mapIrisid2MdsXY.put("CX349", new double[] { 0.0966777597075287, 0.0211689701059952 });
		mapIrisid2MdsXY.put("CX350", new double[] { -0.192547586291829, 0.0226580966720622 });
		mapIrisid2MdsXY.put("CX351", new double[] { -0.176950784638176, 0.0254082411007941 });
		mapIrisid2MdsXY.put("CX352", new double[] { -0.164299949135835, 0.0133785006865337 });
		mapIrisid2MdsXY.put("CX353", new double[] { -0.166211878434816, 0.0209420987837613 });
		mapIrisid2MdsXY.put("CX354", new double[] { -0.196789003567803, 0.0143163923484558 });
		mapIrisid2MdsXY.put("CX355", new double[] { -0.165505191202071, 0.0181450300858579 });
		mapIrisid2MdsXY.put("CX356", new double[] { -0.206084883792516, 0.0153130423188767 });
		mapIrisid2MdsXY.put("CX357", new double[] { 0.0887606882310419, 0.0230398122044922 });
		mapIrisid2MdsXY.put("CX358", new double[] { 0.0957512103221898, 0.0241084605286012 });
		mapIrisid2MdsXY.put("CX359", new double[] { -0.179576881662496, 0.0133551888663629 });
		mapIrisid2MdsXY.put("CX360", new double[] { 0.091406241310566, 0.0254515144329892 });
		mapIrisid2MdsXY.put("CX361", new double[] { 0.085350973701569, 0.0338754042093474 });
		mapIrisid2MdsXY.put("CX362", new double[] { 0.0802046734321762, 0.0328389995362409 });
		mapIrisid2MdsXY.put("CX363", new double[] { 0.0807987051475993, 0.0354560755128374 });
		mapIrisid2MdsXY.put("CX364", new double[] { 0.101145617721205, 0.0160208302115771 });
		mapIrisid2MdsXY.put("CX365", new double[] { -0.0350534977924251, 0.0482652720223103 });
		mapIrisid2MdsXY.put("CX366", new double[] { 0.0876726422032463, 0.0251433111167405 });
		mapIrisid2MdsXY.put("CX367", new double[] { -0.132371930953144, -0.0672297797273539 });
		mapIrisid2MdsXY.put("CX368", new double[] { 0.0197242637398307, -0.167479973476687 });
		mapIrisid2MdsXY.put("CX369", new double[] { 0.0814380147555814, 0.0263294940369393 });
		mapIrisid2MdsXY.put("CX370", new double[] { 0.0774955732040213, 0.0325570678736951 });
		mapIrisid2MdsXY.put("CX371", new double[] { -0.164713131850263, 0.0184433970863861 });
		mapIrisid2MdsXY.put("CX372", new double[] { -0.165730788505674, 0.0164394344326409 });
		mapIrisid2MdsXY.put("CX373", new double[] { -0.190073981475101, 0.00362375329668585 });
		mapIrisid2MdsXY.put("CX374", new double[] { -0.189743036441609, 0.00324036590653266 });
		mapIrisid2MdsXY.put("CX375", new double[] { 0.0952018947610825, 0.0227281260087963 });
		mapIrisid2MdsXY.put("CX376", new double[] { 0.090595461589632, 0.0275537337132737 });
		mapIrisid2MdsXY.put("CX377", new double[] { 0.0906521576205291, 0.023134896682991 });
		mapIrisid2MdsXY.put("CX378", new double[] { 0.0891800307233922, 0.0268087934375775 });
		mapIrisid2MdsXY.put("CX379", new double[] { 0.0914360891118977, 0.0186304205878438 });
		mapIrisid2MdsXY.put("CX380", new double[] { -0.198235816984003, 0.0183309977104812 });
		mapIrisid2MdsXY.put("CX381", new double[] { 0.0980289282798029, 0.015052536939671 });
		mapIrisid2MdsXY.put("CX382", new double[] { 0.0928664892291335, 0.0352273269563528 });
		mapIrisid2MdsXY.put("CX383", new double[] { -0.205792357073918, 0.00877924136298205 });
		mapIrisid2MdsXY.put("CX384", new double[] { -0.205665781878667, 0.00742930938146954 });
		mapIrisid2MdsXY.put("CX385", new double[] { 0.0908836340102596, 0.0285282439654124 });
		mapIrisid2MdsXY.put("CX386", new double[] { 0.0761101035840308, 0.0228435451150584 });
		mapIrisid2MdsXY.put("CX387", new double[] { 0.0836043117753217, 0.0306896547236226 });
		mapIrisid2MdsXY.put("CX388", new double[] { 0.0893832477826633, 0.0238335698321086 });
		mapIrisid2MdsXY.put("CX389", new double[] { -0.159667114761411, 0.030010428177628 });
		mapIrisid2MdsXY.put("CX390", new double[] { 0.0879099620637096, 0.00863664780590442 });
		mapIrisid2MdsXY.put("CX391", new double[] { -0.204938004153943, 0.0107230904880667 });
		mapIrisid2MdsXY.put("CX392", new double[] { 0.110445642409257, 0.0323311221132737 });
		mapIrisid2MdsXY.put("CX393", new double[] { 0.0970455727295536, 0.0315401405169602 });
		mapIrisid2MdsXY.put("CX394", new double[] { 0.0976308873845552, 0.0347603153004074 });
		mapIrisid2MdsXY.put("CX395", new double[] { -0.0571709279457294, 0.0301695865345368 });
		mapIrisid2MdsXY.put("CX396", new double[] { -0.208726659030886, 0.0114539303606068 });
		mapIrisid2MdsXY.put("CX397", new double[] { -0.204512021373426, 0.0172148471182443 });
		mapIrisid2MdsXY.put("CX399", new double[] { 0.0907787014258941, 0.0206561073075655 });
		mapIrisid2MdsXY.put("CX400", new double[] { -0.0391412223526742, 0.0241135071272213 });
		mapIrisid2MdsXY.put("CX401", new double[] { 0.0369480537062691, 0.00735434297469722 });
		mapIrisid2MdsXY.put("CX402", new double[] { -0.065062476014122, -0.0366556382183599 });
		mapIrisid2MdsXY.put("CX403", new double[] { 0.101098462610253, 0.0208693914615483 });
		mapIrisid2MdsXY.put("CX408", new double[] { 0.0865862934804371, 0.0275621006474237 });
		mapIrisid2MdsXY.put("CX409", new double[] { 0.0946381230605124, 0.0298615419129558 });
		mapIrisid2MdsXY.put("CX410", new double[] { 0.0866301337299765, 0.034002200422018 });
		mapIrisid2MdsXY.put("CX411", new double[] { 0.0873039830808454, 0.0338669848075284 });
		mapIrisid2MdsXY.put("CX413", new double[] { 0.0836955751977345, 0.0343835792980995 });
		mapIrisid2MdsXY.put("CX414", new double[] { 0.0882618047442309, 0.033021074994979 });
		mapIrisid2MdsXY.put("CX416", new double[] { 0.0870090436726301, 0.0319299015599541 });
		mapIrisid2MdsXY.put("CX417", new double[] { 0.0897127077584059, 0.0329941533196333 });
		mapIrisid2MdsXY.put("CX418", new double[] { 0.0899117728380668, 0.0239577227094329 });
		mapIrisid2MdsXY.put("CX419", new double[] { 0.0872910045666628, 0.0283657496036842 });
		mapIrisid2MdsXY.put("CX420", new double[] { 0.0856878101803844, 0.0324456700439329 });
		mapIrisid2MdsXY.put("CX421", new double[] { 0.0866126951953374, 0.0262705204594849 });
		mapIrisid2MdsXY.put("CX422", new double[] { 0.0878783747077872, 0.0284136320217492 });
		mapIrisid2MdsXY.put("CX423", new double[] { 0.0882790786218779, 0.0261901154371104 });
		mapIrisid2MdsXY.put("CX424", new double[] { 0.0866285027590669, 0.0225138785162 });
		mapIrisid2MdsXY.put("CX425", new double[] { 0.0897561480258008, 0.025570020022165 });
		mapIrisid2MdsXY.put("CX426", new double[] { 0.0605527399738514, 0.0327534964875104 });
		mapIrisid2MdsXY.put("CX427", new double[] { -0.186192602469517, 0.019888715188906 });
		mapIrisid2MdsXY.put("CX428", new double[] { -0.206509743323326, 0.0147412138972824 });
		mapIrisid2MdsXY.put("CX429", new double[] { -0.206070988261188, 0.0131948727488035 });
		mapIrisid2MdsXY.put("CX431", new double[] { 0.0873877498280526, 0.0266097265810575 });
		mapIrisid2MdsXY.put("CX534", new double[] { -0.190980327265779, 0.0169704822351097 });
		mapIrisid2MdsXY.put("CX542", new double[] { 0.0638083104523501, -0.00860905190573173 });
		mapIrisid2MdsXY.put("CX548", new double[] { 0.0792807637773273, 0.0313327249799644 });
		mapIrisid2MdsXY.put("CX561", new double[] { 0.0964356131156455, 0.0193316839756188 });
		mapIrisid2MdsXY.put("CX578", new double[] { -0.163598370781617, 0.022136138425352 });
		mapIrisid2MdsXY.put("CX579", new double[] { -0.120134645551326, 0.0391869798021953 });
		mapIrisid2MdsXY.put("IRIS_313-7620", new double[] { 0.103658231607018, 0.0256394231927081 });
		mapIrisid2MdsXY.put("IRIS_313-7635", new double[] { 0.0961434066575494, 0.0288145516880307 });
		mapIrisid2MdsXY.put("IRIS_313-7636", new double[] { 0.0895425946275239, 0.0254475377475006 });
		mapIrisid2MdsXY.put("IRIS_313-7638", new double[] { 0.0834268228603192, -0.00576365803282014 });
		mapIrisid2MdsXY.put("IRIS_313-7641", new double[] { 0.0839131282659511, 0.0306326233050445 });
		mapIrisid2MdsXY.put("IRIS_313-7646", new double[] { -0.0240363669210028, -0.0333810263214376 });
		mapIrisid2MdsXY.put("IRIS_313-7650", new double[] { 0.0535704325786978, -0.0516804464810477 });
		mapIrisid2MdsXY.put("IRIS_313-7651", new double[] { 0.0657454372977657, -0.0532101890979239 });
		mapIrisid2MdsXY.put("IRIS_313-7654", new double[] { 0.0979668413104555, 0.027944046774769 });
		mapIrisid2MdsXY.put("IRIS_313-7664", new double[] { 0.0957823974611455, 0.0195684878242308 });
		mapIrisid2MdsXY.put("IRIS_313-7665", new double[] { 0.08985945976367, 0.0255327515836509 });
		mapIrisid2MdsXY.put("IRIS_313-7668", new double[] { 0.0871924316669469, 0.0276720362032196 });
		mapIrisid2MdsXY.put("IRIS_313-7681", new double[] { 0.104935704828303, 0.0169740668007256 });
		mapIrisid2MdsXY.put("IRIS_313-7684", new double[] { 0.100550007781415, 0.00716513735831432 });
		mapIrisid2MdsXY.put("IRIS_313-7685", new double[] { 0.101768165514358, 0.00458594223856518 });
		mapIrisid2MdsXY.put("IRIS_313-7688", new double[] { 0.107840392712723, 0.0154442569680617 });
		mapIrisid2MdsXY.put("IRIS_313-7689", new double[] { 0.0993094343518642, 0.011631897445779 });
		mapIrisid2MdsXY.put("IRIS_313-7690", new double[] { 0.0864850818700409, 0.00723845647784569 });
		mapIrisid2MdsXY.put("IRIS_313-7691", new double[] { 0.101840831476472, 0.0115864682496034 });
		mapIrisid2MdsXY.put("IRIS_313-7696", new double[] { 0.0986791788053152, 0.0274161675055567 });
		mapIrisid2MdsXY.put("IRIS_313-7698", new double[] { 0.0960520935239232, 0.0262127554165441 });
		mapIrisid2MdsXY.put("IRIS_313-7699", new double[] { 0.086733964570105, 0.0312450290766139 });
		mapIrisid2MdsXY.put("IRIS_313-7719", new double[] { 0.107666504038865, 0.0212575287859298 });
		mapIrisid2MdsXY.put("IRIS_313-7720", new double[] { 0.0843043024020607, -0.0410290200063525 });
		mapIrisid2MdsXY.put("IRIS_313-7722", new double[] { -0.0468713423112663, -0.0227035629602073 });
		mapIrisid2MdsXY.put("IRIS_313-7725", new double[] { 0.0602993317785749, 0.00568400985010733 });
		mapIrisid2MdsXY.put("IRIS_313-7728", new double[] { 0.0881097645804852, -0.048416813323225 });
		mapIrisid2MdsXY.put("IRIS_313-7736", new double[] { 0.10241580520584, -0.00580920690199749 });
		mapIrisid2MdsXY.put("IRIS_313-7758", new double[] { 0.0486644443826159, -0.0518726331031334 });
		mapIrisid2MdsXY.put("IRIS_313-7766", new double[] { 0.093240374239403, 0.0133477785704031 });
		mapIrisid2MdsXY.put("IRIS_313-7769", new double[] { 0.089774166539971, 0.0199935842255906 });
		mapIrisid2MdsXY.put("IRIS_313-7770", new double[] { 0.0984374415089714, 0.02276653281803 });
		mapIrisid2MdsXY.put("IRIS_313-7773", new double[] { 0.0963520389654833, 0.0280412137756326 });
		mapIrisid2MdsXY.put("IRIS_313-7778", new double[] { 0.104983720452732, 0.0241008620346219 });
		mapIrisid2MdsXY.put("IRIS_313-7780", new double[] { 0.0967455413216937, 0.0223337364355299 });
		mapIrisid2MdsXY.put("IRIS_313-7792", new double[] { 0.0984621948887568, 0.018517190753135 });
		mapIrisid2MdsXY.put("IRIS_313-7793", new double[] { 0.108663669243374, -0.00502182283840777 });
		mapIrisid2MdsXY.put("IRIS_313-7795", new double[] { 0.111962715907955, -0.00357620412678376 });
		mapIrisid2MdsXY.put("IRIS_313-7797", new double[] { 0.0945492181359907, 0.0247476900302144 });
		mapIrisid2MdsXY.put("IRIS_313-7799", new double[] { 0.076160742429785, -0.0570386754362466 });
		mapIrisid2MdsXY.put("IRIS_313-7807", new double[] { 0.102362635433184, 0.0141057654716495 });
		mapIrisid2MdsXY.put("IRIS_313-7808", new double[] { 0.0977504944364515, 0.026930428182672 });
		mapIrisid2MdsXY.put("IRIS_313-7809", new double[] { 0.0957767327989669, 0.0191681512393173 });
		mapIrisid2MdsXY.put("IRIS_313-7815", new double[] { 0.0956138705401695, 0.0316714031489575 });
		mapIrisid2MdsXY.put("IRIS_313-7816", new double[] { 0.0962564431871006, 0.0189568039305286 });
		mapIrisid2MdsXY.put("IRIS_313-7819", new double[] { 0.104062952145689, 0.0133150244913862 });
		mapIrisid2MdsXY.put("IRIS_313-7820", new double[] { 0.101782858935549, 0.0255594293755483 });
		mapIrisid2MdsXY.put("IRIS_313-7824", new double[] { 0.0973280025921155, 0.0107507773036417 });
		mapIrisid2MdsXY.put("IRIS_313-7826", new double[] { 0.0968484593963417, 0.0242257593609872 });
		mapIrisid2MdsXY.put("IRIS_313-7832", new double[] { 0.0989228774195337, 0.0208205150131692 });
		mapIrisid2MdsXY.put("IRIS_313-7838", new double[] { -0.192249414393828, 0.00617151999617662 });
		mapIrisid2MdsXY.put("IRIS_313-7850", new double[] { -0.191858193438102, 0.00808468886945569 });
		mapIrisid2MdsXY.put("IRIS_313-7856", new double[] { -0.184411517394916, 0.00596295982332299 });
		mapIrisid2MdsXY.put("IRIS_313-7859", new double[] { -0.196635158017633, 0.0134598458624975 });
		mapIrisid2MdsXY.put("IRIS_313-7863", new double[] { -0.187272369654785, 0.00626027646737542 });
		mapIrisid2MdsXY.put("IRIS_313-7866", new double[] { -0.129539333359859, 0.0136596114074707 });
		mapIrisid2MdsXY.put("IRIS_313-7868", new double[] { -0.176728859962137, 0.0127915623814211 });
		mapIrisid2MdsXY.put("IRIS_313-7870", new double[] { -0.192557483772363, 0.00988369312375191 });
		mapIrisid2MdsXY.put("IRIS_313-7876", new double[] { -0.188226129130029, 0.00840739199418363 });
		mapIrisid2MdsXY.put("IRIS_313-7883", new double[] { -0.190357852549847, 0.00862401733835687 });
		mapIrisid2MdsXY.put("IRIS_313-7885", new double[] { -0.180403147591745, 0.00453490599077545 });
		mapIrisid2MdsXY.put("IRIS_313-7902", new double[] { -0.179805859392912, 0.0121068552666514 });
		mapIrisid2MdsXY.put("IRIS_313-7907", new double[] { -0.160158422045109, 0.0167723266738828 });
		mapIrisid2MdsXY.put("IRIS_313-7909", new double[] { -0.152256899204075, 0.0215768172225714 });
		mapIrisid2MdsXY.put("IRIS_313-7911", new double[] { 0.108882364563454, 0.0227746562646978 });
		mapIrisid2MdsXY.put("IRIS_313-7912", new double[] { -0.193764099158735, 0.00777627941701483 });
		mapIrisid2MdsXY.put("IRIS_313-7914", new double[] { -0.195724163136242, 0.00571428294758765 });
		mapIrisid2MdsXY.put("IRIS_313-7922", new double[] { -0.196601959955147, 0.00685686383299742 });
		mapIrisid2MdsXY.put("IRIS_313-7924", new double[] { -0.13034054521795, 0.0158428734056238 });
		mapIrisid2MdsXY.put("IRIS_313-7933", new double[] { -0.168587903127752, -0.0354246257451022 });
		mapIrisid2MdsXY.put("IRIS_313-7959", new double[] { -0.179475266947038, 0.00447869519855682 });
		mapIrisid2MdsXY.put("IRIS_313-7992", new double[] { -0.18902552437039, 0.000236469161271842 });
		mapIrisid2MdsXY.put("IRIS_313-7993", new double[] { -0.170793287515493, -0.00613944291158958 });
		mapIrisid2MdsXY.put("IRIS_313-7994", new double[] { -0.189415796677355, 0.0114378721527411 });
		mapIrisid2MdsXY.put("IRIS_313-8003", new double[] { -0.190613341230884, 0.00987288713367458 });
		mapIrisid2MdsXY.put("IRIS_313-8010", new double[] { -0.178852562956161, 0.0121406663911295 });
		mapIrisid2MdsXY.put("IRIS_313-8011", new double[] { -0.202419659807561, 0.0109316053019805 });
		mapIrisid2MdsXY.put("IRIS_313-8023", new double[] { -0.202101699149021, 0.0141037083977461 });
		mapIrisid2MdsXY.put("IRIS_313-8024", new double[] { -0.205633629963146, 0.00894449886803754 });
		mapIrisid2MdsXY.put("IRIS_313-8025", new double[] { -0.207464611882599, 0.011065285583024 });
		mapIrisid2MdsXY.put("IRIS_313-8026", new double[] { -0.209759608841352, 0.0104327717807468 });
		mapIrisid2MdsXY.put("IRIS_313-8027", new double[] { -0.199030646482172, 0.012260523671789 });
		mapIrisid2MdsXY.put("IRIS_313-8029", new double[] { -0.20156667005437, 0.0116870380664923 });
		mapIrisid2MdsXY.put("IRIS_313-8031", new double[] { -0.20534204481048, 0.0129004773003795 });
		mapIrisid2MdsXY.put("IRIS_313-8032", new double[] { -0.206208168991057, 0.0126060736009051 });
		mapIrisid2MdsXY.put("IRIS_313-8033", new double[] { -0.211570867758539, 0.0112568962424062 });
		mapIrisid2MdsXY.put("IRIS_313-8037", new double[] { -0.203926633197431, 0.0092484422098029 });
		mapIrisid2MdsXY.put("IRIS_313-8039", new double[] { -0.206782130644835, 0.010408284342488 });
		mapIrisid2MdsXY.put("IRIS_313-8041", new double[] { -0.196826516573388, 0.00855470589412776 });
		mapIrisid2MdsXY.put("IRIS_313-8044", new double[] { -0.18395310696853, 0.0120315044482811 });
		mapIrisid2MdsXY.put("IRIS_313-8046", new double[] { -0.17938740898404, 0.00818531337842274 });
		mapIrisid2MdsXY.put("IRIS_313-8048", new double[] { -0.205023264145282, 0.0127462100912541 });
		mapIrisid2MdsXY.put("IRIS_313-8049", new double[] { -0.202027140779693, 0.0124874587241176 });
		mapIrisid2MdsXY.put("IRIS_313-8050", new double[] { -0.200488738182381, 0.00817636929273063 });
		mapIrisid2MdsXY.put("IRIS_313-8052", new double[] { -0.206071205806258, 0.0113824387252308 });
		mapIrisid2MdsXY.put("IRIS_313-8053", new double[] { -0.201102931956312, 0.012519330504015 });
		mapIrisid2MdsXY.put("IRIS_313-8057", new double[] { -0.169114695040028, 0.0144715663969117 });
		mapIrisid2MdsXY.put("IRIS_313-8058", new double[] { -0.168099264618284, 0.0130029019199862 });
		mapIrisid2MdsXY.put("IRIS_313-8060", new double[] { -0.171073952768293, 0.0175016362680952 });
		mapIrisid2MdsXY.put("IRIS_313-8061", new double[] { -0.182434732039593, 0.0173740119244636 });
		mapIrisid2MdsXY.put("IRIS_313-8062", new double[] { -0.182606815916633, 0.0159212974725126 });
		mapIrisid2MdsXY.put("IRIS_313-8063", new double[] { -0.197882945263971, 0.00956851176533231 });
		mapIrisid2MdsXY.put("IRIS_313-8064", new double[] { -0.185128361510293, 0.0154897289836095 });
		mapIrisid2MdsXY.put("IRIS_313-8065", new double[] { -0.195462576076329, 0.0117673553493513 });
		mapIrisid2MdsXY.put("IRIS_313-8066", new double[] { -0.207098163114131, 0.00946115578679836 });
		mapIrisid2MdsXY.put("IRIS_313-8067", new double[] { 0.0031478259785634, 0.0403512483840647 });
		mapIrisid2MdsXY.put("IRIS_313-8068", new double[] { 0.0915574639007036, 0.0253006570762202 });
		mapIrisid2MdsXY.put("IRIS_313-8069", new double[] { 0.0946076460950846, 0.0301955584029859 });
		mapIrisid2MdsXY.put("IRIS_313-8072", new double[] { -0.193647175710178, 0.00298422830584612 });
		mapIrisid2MdsXY.put("IRIS_313-8073", new double[] { 0.0406419352822491, -0.166227026279917 });
		mapIrisid2MdsXY.put("IRIS_313-8074", new double[] { -0.190524103145744, 0.0118271582997018 });
		mapIrisid2MdsXY.put("IRIS_313-8075", new double[] { -0.200250308913396, 0.0130635768098471 });
		mapIrisid2MdsXY.put("IRIS_313-8076", new double[] { -0.192101480899958, 0.00885113827779683 });
		mapIrisid2MdsXY.put("IRIS_313-8084", new double[] { -0.20681531197781, 0.0105771172555997 });
		mapIrisid2MdsXY.put("IRIS_313-8085", new double[] { -0.208602470525116, 0.0116846409428517 });
		mapIrisid2MdsXY.put("IRIS_313-8087", new double[] { -0.210841983510604, 0.0122467362119667 });
		mapIrisid2MdsXY.put("IRIS_313-8090", new double[] { -0.206267076894265, 0.0103125909851826 });
		mapIrisid2MdsXY.put("IRIS_313-8095", new double[] { -0.204223698893844, 0.0136680593830052 });
		mapIrisid2MdsXY.put("IRIS_313-8096", new double[] { -0.206068585237458, 0.0105261963735354 });
		mapIrisid2MdsXY.put("IRIS_313-8097", new double[] { -0.193675764074607, 0.0142328428359917 });
		mapIrisid2MdsXY.put("IRIS_313-8099", new double[] { -0.203743290344566, 0.0128012644571069 });
		mapIrisid2MdsXY.put("IRIS_313-8102", new double[] { -0.186486368407571, 0.0124874937527849 });
		mapIrisid2MdsXY.put("IRIS_313-8105", new double[] { -0.205106938596937, 0.00895014946405896 });
		mapIrisid2MdsXY.put("IRIS_313-8109", new double[] { -0.210234637045429, 0.00924137658750387 });
		mapIrisid2MdsXY.put("IRIS_313-8111", new double[] { -0.210459712074541, 0.0091379992521578 });
		mapIrisid2MdsXY.put("IRIS_313-8112", new double[] { -0.207304291676082, 0.0103788578978319 });
		mapIrisid2MdsXY.put("IRIS_313-8113", new double[] { -0.211801398300568, 0.0093163991957475 });
		mapIrisid2MdsXY.put("IRIS_313-8114", new double[] { -0.19898584019365, 0.00883613688437922 });
		mapIrisid2MdsXY.put("IRIS_313-8115", new double[] { -0.20028343259758, 0.00928709161421686 });
		mapIrisid2MdsXY.put("IRIS_313-8116", new double[] { -0.19908094916843, 0.00680990726152324 });
		mapIrisid2MdsXY.put("IRIS_313-8118", new double[] { -0.198599633587066, 0.0160794086147766 });
		mapIrisid2MdsXY.put("IRIS_313-8119", new double[] { -0.207433652814992, 0.0113173420326133 });
		mapIrisid2MdsXY.put("IRIS_313-8121", new double[] { -0.192386277177508, 0.00805183876375566 });
		mapIrisid2MdsXY.put("IRIS_313-8123", new double[] { -0.206559780237827, 0.0102137232832413 });
		mapIrisid2MdsXY.put("IRIS_313-8124", new double[] { -0.204527603344303, 0.00848720660861122 });
		mapIrisid2MdsXY.put("IRIS_313-8125", new double[] { -0.206855679817177, 0.0119915235503835 });
		mapIrisid2MdsXY.put("IRIS_313-8126", new double[] { -0.210946848554692, 0.0111278141246861 });
		mapIrisid2MdsXY.put("IRIS_313-8127", new double[] { -0.206470712852162, 0.01243685762784 });
		mapIrisid2MdsXY.put("IRIS_313-8128", new double[] { -0.210563381377827, 0.00642786615680071 });
		mapIrisid2MdsXY.put("IRIS_313-8129", new double[] { -0.208395343845417, 0.0116470901500818 });
		mapIrisid2MdsXY.put("IRIS_313-8132", new double[] { -0.208325458965657, 0.00806438502626191 });
		mapIrisid2MdsXY.put("IRIS_313-8134", new double[] { -0.203937066312096, 0.0135004553001293 });
		mapIrisid2MdsXY.put("IRIS_313-8135", new double[] { -0.208854127023082, 0.0110288434838907 });
		mapIrisid2MdsXY.put("IRIS_313-8136", new double[] { -0.205864377649023, 0.0100623403639635 });
		mapIrisid2MdsXY.put("IRIS_313-8137", new double[] { -0.198244421404267, 0.0126203587617639 });
		mapIrisid2MdsXY.put("IRIS_313-8138", new double[] { -0.208579420480545, 0.00726983706222827 });
		mapIrisid2MdsXY.put("IRIS_313-8139", new double[] { -0.19519558851337, 0.0120535032066862 });
		mapIrisid2MdsXY.put("IRIS_313-8140", new double[] { -0.206183566169867, 0.0126109771347296 });
		mapIrisid2MdsXY.put("IRIS_313-8141", new double[] { -0.207203637469842, 0.0131604112481923 });
		mapIrisid2MdsXY.put("IRIS_313-8142", new double[] { -0.207918712567852, 0.0108804395451756 });
		mapIrisid2MdsXY.put("IRIS_313-8143", new double[] { -0.200348573851528, 0.00924376086851005 });
		mapIrisid2MdsXY.put("IRIS_313-8145", new double[] { -0.201607115777481, 0.00707159151976546 });
		mapIrisid2MdsXY.put("IRIS_313-8147", new double[] { -0.204181092461996, 0.00974710062069619 });
		mapIrisid2MdsXY.put("IRIS_313-8148", new double[] { -0.210372197829602, 0.0112874309972656 });
		mapIrisid2MdsXY.put("IRIS_313-8149", new double[] { -0.207530697810894, 0.00834312578206041 });
		mapIrisid2MdsXY.put("IRIS_313-8151", new double[] { -0.20348122624249, 0.00976595982631017 });
		mapIrisid2MdsXY.put("IRIS_313-8154", new double[] { -0.202361287361178, 0.010547941502648 });
		mapIrisid2MdsXY.put("IRIS_313-8155", new double[] { -0.202479321543439, 0.0122836451450721 });
		mapIrisid2MdsXY.put("IRIS_313-8158", new double[] { -0.202937884876021, 0.00654249543619857 });
		mapIrisid2MdsXY.put("IRIS_313-8159", new double[] { -0.20298068936064, 0.00654216824872682 });
		mapIrisid2MdsXY.put("IRIS_313-8160", new double[] { -0.203429761344725, 0.00747160715773392 });
		mapIrisid2MdsXY.put("IRIS_313-8161", new double[] { 0.0885293266358437, 0.0234570106879172 });
		mapIrisid2MdsXY.put("IRIS_313-8162", new double[] { -0.210944462750078, 0.0119357344080632 });
		mapIrisid2MdsXY.put("IRIS_313-8164", new double[] { -0.190948507017845, 0.0153340523751274 });
		mapIrisid2MdsXY.put("IRIS_313-8165", new double[] { -0.211008149459351, 0.00641454230279338 });
		mapIrisid2MdsXY.put("IRIS_313-8166", new double[] { -0.20578610872636, 0.00915392014596673 });
		mapIrisid2MdsXY.put("IRIS_313-8167", new double[] { -0.203900968793317, 0.0100484752509625 });
		mapIrisid2MdsXY.put("IRIS_313-8168", new double[] { -0.205814027725467, 0.00820015934137601 });
		mapIrisid2MdsXY.put("IRIS_313-8170", new double[] { -0.198905228788534, 0.00850641740211592 });
		mapIrisid2MdsXY.put("IRIS_313-8171", new double[] { -0.208742544791833, 0.00950132847958701 });
		mapIrisid2MdsXY.put("IRIS_313-8172", new double[] { -0.14001716573198, 0.0054319367231275 });
		mapIrisid2MdsXY.put("IRIS_313-8173", new double[] { -0.166645019608854, 0.0091550041279113 });
		mapIrisid2MdsXY.put("IRIS_313-8177", new double[] { -0.203057059211481, 0.0116563776356253 });
		mapIrisid2MdsXY.put("IRIS_313-8180", new double[] { -0.183927026477552, 0.0119046344541165 });
		mapIrisid2MdsXY.put("IRIS_313-8183", new double[] { -0.177610631903788, 0.0118844810684952 });
		mapIrisid2MdsXY.put("IRIS_313-8184", new double[] { -0.085301516747119, -0.00743958602161114 });
		mapIrisid2MdsXY.put("IRIS_313-8185", new double[] { -0.185327822421738, 0.012915694876602 });
		mapIrisid2MdsXY.put("IRIS_313-8186", new double[] { -0.186660603810398, 0.0146937413189517 });
		mapIrisid2MdsXY.put("IRIS_313-8192", new double[] { -0.171796358057392, 0.0179441664344392 });
		mapIrisid2MdsXY.put("IRIS_313-8193", new double[] { -0.174140794335131, 0.0104552009541675 });
		mapIrisid2MdsXY.put("IRIS_313-8195", new double[] { -0.202210113295424, 0.00941323974626331 });
		mapIrisid2MdsXY.put("IRIS_313-8200", new double[] { -0.20042073757789, 0.011930909334749 });
		mapIrisid2MdsXY.put("IRIS_313-8202", new double[] { -0.165975765092225, 0.0139334914214568 });
		mapIrisid2MdsXY.put("IRIS_313-8204", new double[] { -0.205621368159311, 0.0127503256196635 });
		mapIrisid2MdsXY.put("IRIS_313-8205", new double[] { -0.189219916670703, 0.012614661423302 });
		mapIrisid2MdsXY.put("IRIS_313-8208", new double[] { -0.199500638541193, 0.00604948423072203 });
		mapIrisid2MdsXY.put("IRIS_313-8209", new double[] { -0.183016962271499, 0.01079549300598 });
		mapIrisid2MdsXY.put("IRIS_313-8212", new double[] { 0.0892945135399455, 0.016174069867053 });
		mapIrisid2MdsXY.put("IRIS_313-8213", new double[] { -0.194257387211083, 0.0135796674122223 });
		mapIrisid2MdsXY.put("IRIS_313-8214", new double[] { -0.20063702969378, 0.00697784080508494 });
		mapIrisid2MdsXY.put("IRIS_313-8215", new double[] { 0.0841857711251066, 0.0285501263036509 });
		mapIrisid2MdsXY.put("IRIS_313-8216", new double[] { -0.204690544935323, 0.0103871012865773 });
		mapIrisid2MdsXY.put("IRIS_313-8217", new double[] { -0.210562060021836, 0.0119642450168456 });
		mapIrisid2MdsXY.put("IRIS_313-8218", new double[] { -0.209608990122651, 0.011454072888108 });
		mapIrisid2MdsXY.put("IRIS_313-8232", new double[] { -0.141506343894048, 0.0176442862445819 });
		mapIrisid2MdsXY.put("IRIS_313-8244", new double[] { 0.10547807201441, -0.0181298297009777 });
		mapIrisid2MdsXY.put("IRIS_313-8252", new double[] { 0.0310034215971941, -0.182587283693406 });
		mapIrisid2MdsXY.put("IRIS_313-8253", new double[] { 0.101942175482819, 0.0283635913959049 });
		mapIrisid2MdsXY.put("IRIS_313-8256", new double[] { -0.193504501713321, -0.0060249451492832 });
		mapIrisid2MdsXY.put("IRIS_313-8265", new double[] { 0.100326905529005, 0.00466471364719407 });
		mapIrisid2MdsXY.put("IRIS_313-8268", new double[] { -0.124019989678848, -0.0369421392672595 });
		mapIrisid2MdsXY.put("IRIS_313-8277", new double[] { -0.19149027304038, 0.00615634552309584 });
		mapIrisid2MdsXY.put("IRIS_313-8279", new double[] { -0.179420363722005, 0.0075824417186553 });
		mapIrisid2MdsXY.put("IRIS_313-8283", new double[] { 0.0434065519263542, -0.153668782644199 });
		mapIrisid2MdsXY.put("IRIS_313-8285", new double[] { -0.162835138806296, 0.0133696007753594 });
		mapIrisid2MdsXY.put("IRIS_313-8288", new double[] { 0.0715839710244971, -0.012213608992998 });
		mapIrisid2MdsXY.put("IRIS_313-8291", new double[] { 0.105864540499676, 0.0176560667291898 });
		mapIrisid2MdsXY.put("IRIS_313-8292", new double[] { 0.101277632975712, 0.0231453426376154 });
		mapIrisid2MdsXY.put("IRIS_313-8293", new double[] { 0.108294865148245, 0.0183378513651948 });
		mapIrisid2MdsXY.put("IRIS_313-8302", new double[] { -0.0985616540065596, -0.0891271485053305 });
		mapIrisid2MdsXY.put("IRIS_313-8303", new double[] { 0.0940696369976106, 0.00647659148965415 });
		mapIrisid2MdsXY.put("IRIS_313-8305", new double[] { 0.113938257292394, -0.0211982926440172 });
		mapIrisid2MdsXY.put("IRIS_313-8306", new double[] { 0.10735613044991, -0.0185356178660185 });
		mapIrisid2MdsXY.put("IRIS_313-8312", new double[] { 0.104069625671827, 0.0204211069571931 });
		mapIrisid2MdsXY.put("IRIS_313-8314", new double[] { -0.178372707399868, 0.012521813749657 });
		mapIrisid2MdsXY.put("IRIS_313-8315", new double[] { 0.0981709884977685, 0.0251842528391691 });
		mapIrisid2MdsXY.put("IRIS_313-8316", new double[] { 0.0955645725761218, 0.0249636297473479 });
		mapIrisid2MdsXY.put("IRIS_313-8321", new double[] { 0.0532465026837386, -0.165580515570528 });
		mapIrisid2MdsXY.put("IRIS_313-8323", new double[] { -0.181458724247049, 0.00969521263637799 });
		mapIrisid2MdsXY.put("IRIS_313-8324", new double[] { -0.0176375386514779, 0.0316408403142695 });
		mapIrisid2MdsXY.put("IRIS_313-8326", new double[] { -0.145407260957543, -0.0265073818361105 });
		mapIrisid2MdsXY.put("IRIS_313-8332", new double[] { 0.100568358827574, 0.0067820269378982 });
		mapIrisid2MdsXY.put("IRIS_313-8339", new double[] { -0.189414821204683, 0.0100048862198644 });
		mapIrisid2MdsXY.put("IRIS_313-8341", new double[] { 0.110075609610217, 0.0151051950109629 });
		mapIrisid2MdsXY.put("IRIS_313-8342", new double[] { 0.0346581254225684, -0.142925340394693 });
		mapIrisid2MdsXY.put("IRIS_313-8349", new double[] { 0.0997344350215518, 0.00401439939826082 });
		mapIrisid2MdsXY.put("IRIS_313-8356", new double[] { -0.193715546895854, 0.0047655886401373 });
		mapIrisid2MdsXY.put("IRIS_313-8368", new double[] { 0.0979766151434441, 0.0269157213900338 });
		mapIrisid2MdsXY.put("IRIS_313-8380", new double[] { 0.0977096844372099, 0.0170699616126144 });
		mapIrisid2MdsXY.put("IRIS_313-8381", new double[] { -0.180045961869633, 0.00341044440508605 });
		mapIrisid2MdsXY.put("IRIS_313-8382", new double[] { 0.0369315383307727, -0.0681778853678163 });
		mapIrisid2MdsXY.put("IRIS_313-8383", new double[] { 0.0918748819959794, 0.0249377310796207 });
		mapIrisid2MdsXY.put("IRIS_313-8385", new double[] { -0.146792941488691, -0.0250524456564339 });
		mapIrisid2MdsXY.put("IRIS_313-8386", new double[] { 0.104531422611297, 0.0151460452133664 });
		mapIrisid2MdsXY.put("IRIS_313-8387", new double[] { -0.209739527122531, 0.00817888634805084 });
		mapIrisid2MdsXY.put("IRIS_313-8390", new double[] { 0.0293434238938036, -0.173014666691502 });
		mapIrisid2MdsXY.put("IRIS_313-8391", new double[] { 0.10985167648106, 0.00280052677790042 });
		mapIrisid2MdsXY.put("IRIS_313-8392", new double[] { 0.085302990009943, 0.0247905393386121 });
		mapIrisid2MdsXY.put("IRIS_313-8398", new double[] { 0.0243505377549887, -0.191878800508262 });
		mapIrisid2MdsXY.put("IRIS_313-8399", new double[] { -0.209212532805574, 0.0129946524928649 });
		mapIrisid2MdsXY.put("IRIS_313-8400", new double[] { -0.181821253350824, 0.0177325701890691 });
		mapIrisid2MdsXY.put("IRIS_313-8401", new double[] { 0.0911681192714303, 0.0171831854909201 });
		mapIrisid2MdsXY.put("IRIS_313-8405", new double[] { 0.0813744475989077, 0.0220899000568394 });
		mapIrisid2MdsXY.put("IRIS_313-8407", new double[] { 0.103045822346094, 0.0250511304771371 });
		mapIrisid2MdsXY.put("IRIS_313-8409", new double[] { 0.0913469798522658, 0.0223838404251434 });
		mapIrisid2MdsXY.put("IRIS_313-8410", new double[] { 0.0386818196384682, -0.175113759402454 });
		mapIrisid2MdsXY.put("IRIS_313-8412", new double[] { 0.0924917426320314, 0.0201562472433738 });
		mapIrisid2MdsXY.put("IRIS_313-8414", new double[] { 0.0709182052236767, 0.0166204210766358 });
		mapIrisid2MdsXY.put("IRIS_313-8431", new double[] { -0.196999425235428, 0.00461550482595457 });
		mapIrisid2MdsXY.put("IRIS_313-8433", new double[] { 0.0982487111221701, 0.0245083485395154 });
		mapIrisid2MdsXY.put("IRIS_313-8434", new double[] { -0.184690790087532, 0.00886575006979663 });
		mapIrisid2MdsXY.put("IRIS_313-8435", new double[] { 0.0970127038028051, 0.0133460417679104 });
		mapIrisid2MdsXY.put("IRIS_313-8436", new double[] { -0.167601394544953, 0.0116766923435387 });
		mapIrisid2MdsXY.put("IRIS_313-8437", new double[] { 0.105016540007918, 0.0215848755062706 });
		mapIrisid2MdsXY.put("IRIS_313-8439", new double[] { -0.179998658643548, 0.0106124355420212 });
		mapIrisid2MdsXY.put("IRIS_313-8444", new double[] { -0.201076380575914, 0.00850455539490929 });
		mapIrisid2MdsXY.put("IRIS_313-8450", new double[] { 0.100261733546807, -0.0181030884133126 });
		mapIrisid2MdsXY.put("IRIS_313-8453", new double[] { 0.107535608341725, 0.0129413017066147 });
		mapIrisid2MdsXY.put("IRIS_313-8454", new double[] { 0.107769405988704, 0.0184315657844321 });
		mapIrisid2MdsXY.put("IRIS_313-8457", new double[] { 0.0798031810848553, 0.0264444185089577 });
		mapIrisid2MdsXY.put("IRIS_313-8458", new double[] { 0.0985157817321784, 0.0118416911689141 });
		mapIrisid2MdsXY.put("IRIS_313-8466", new double[] { 0.1057122915297, 0.0265408960694305 });
		mapIrisid2MdsXY.put("IRIS_313-8468", new double[] { 0.095558141917624, 0.0259803590892692 });
		mapIrisid2MdsXY.put("IRIS_313-8474", new double[] { 0.0874399322764281, 0.03231503768402 });
		mapIrisid2MdsXY.put("IRIS_313-8481", new double[] { -0.209521914749086, 0.0134161473527556 });
		mapIrisid2MdsXY.put("IRIS_313-8485", new double[] { 0.104109501430744, 0.0288812107136021 });
		mapIrisid2MdsXY.put("IRIS_313-8486", new double[] { -0.19454432685426, 0.00163523494703274 });
		mapIrisid2MdsXY.put("IRIS_313-8492", new double[] { 0.102233338083295, 0.025735793506208 });
		mapIrisid2MdsXY.put("IRIS_313-8493", new double[] { 0.108843583947414, 0.0201562648394094 });
		mapIrisid2MdsXY.put("IRIS_313-8498", new double[] { -0.101232860065914, 0.00278787999843223 });
		mapIrisid2MdsXY.put("IRIS_313-8502", new double[] { -0.189731310190623, 0.0170890896215134 });
		mapIrisid2MdsXY.put("IRIS_313-8509", new double[] { 0.107365836390343, -0.00810841563381329 });
		mapIrisid2MdsXY.put("IRIS_313-8514", new double[] { 0.0952933020532755, 0.0277156832044703 });
		mapIrisid2MdsXY.put("IRIS_313-8519", new double[] { -0.19593388368518, -0.000287726862083035 });
		mapIrisid2MdsXY.put("IRIS_313-8523", new double[] { -0.190556332368638, 0.00912441393340784 });
		mapIrisid2MdsXY.put("IRIS_313-8530", new double[] { 0.101738495565982, -0.00392428019626091 });
		mapIrisid2MdsXY.put("IRIS_313-8536", new double[] { 0.100256164064293, 0.0283341966848764 });
		mapIrisid2MdsXY.put("IRIS_313-8554", new double[] { 0.0173897787729016, -0.148823988100736 });
		mapIrisid2MdsXY.put("IRIS_313-8557", new double[] { 0.103874553179584, 0.0240793496744422 });
		mapIrisid2MdsXY.put("IRIS_313-8559", new double[] { 0.0962438244800514, -0.00467898868887007 });
		mapIrisid2MdsXY.put("IRIS_313-8565", new double[] { -0.184609060000694, 0.0138403784662229 });
		mapIrisid2MdsXY.put("IRIS_313-8567", new double[] { 0.101911503547143, 0.0240968116218445 });
		mapIrisid2MdsXY.put("IRIS_313-8568", new double[] { 0.0945401197016869, -0.0150088008959207 });
		mapIrisid2MdsXY.put("IRIS_313-8571", new double[] { 0.0993760192832784, 0.0263441282967509 });
		mapIrisid2MdsXY.put("IRIS_313-8572", new double[] { -0.195576560292696, 0.00523957955925912 });
		mapIrisid2MdsXY.put("IRIS_313-8578", new double[] { -0.196482045531192, 0.0111104285569076 });
		mapIrisid2MdsXY.put("IRIS_313-8580", new double[] { -0.193407097382878, 0.00790286217945488 });
		mapIrisid2MdsXY.put("IRIS_313-8585", new double[] { 0.103239653972917, 0.0221609780483885 });
		mapIrisid2MdsXY.put("IRIS_313-8586", new double[] { 0.104404511159831, 0.027075378922992 });
		mapIrisid2MdsXY.put("IRIS_313-8591", new double[] { 0.094661507695971, 0.0295951922380665 });
		mapIrisid2MdsXY.put("IRIS_313-8594", new double[] { -0.190285911083709, 0.00394635117570816 });
		mapIrisid2MdsXY.put("IRIS_313-8595", new double[] { 0.0579232944618107, -0.0460212056034375 });
		mapIrisid2MdsXY.put("IRIS_313-8599", new double[] { -0.198954082122091, 0.00752378476055139 });
		mapIrisid2MdsXY.put("IRIS_313-8603", new double[] { 0.0902883445197039, 0.0180279798779394 });
		mapIrisid2MdsXY.put("IRIS_313-8606", new double[] { 0.104827427549721, 0.0258611676607993 });
		mapIrisid2MdsXY.put("IRIS_313-8608", new double[] { 0.0993183543068713, 0.0230028970360707 });
		mapIrisid2MdsXY.put("IRIS_313-8614", new double[] { 0.0994242602514378, 0.00779014861235182 });
		mapIrisid2MdsXY.put("IRIS_313-8616", new double[] { 0.107358333756777, 0.0158469409448787 });
		mapIrisid2MdsXY.put("IRIS_313-8621", new double[] { 0.101220095581696, 0.0263355736621572 });
		mapIrisid2MdsXY.put("IRIS_313-8622", new double[] { 0.0919733838410245, -0.0220069302152841 });
		mapIrisid2MdsXY.put("IRIS_313-8626", new double[] { -0.184476372888359, 0.00404878735906339 });
		mapIrisid2MdsXY.put("IRIS_313-8627", new double[] { -0.195468321821758, 0.0129925512986792 });
		mapIrisid2MdsXY.put("IRIS_313-8631", new double[] { 0.101301464274939, -0.00277641386131781 });
		mapIrisid2MdsXY.put("IRIS_313-8632", new double[] { 0.0939007813094019, 0.00274635681207962 });
		mapIrisid2MdsXY.put("IRIS_313-8637", new double[] { -0.196041773993935, 0.00112538441098577 });
		mapIrisid2MdsXY.put("IRIS_313-8638", new double[] { 0.0946668388467527, 0.0264272230374803 });
		mapIrisid2MdsXY.put("IRIS_313-8641", new double[] { 0.0391994146036138, -0.157672089657107 });
		mapIrisid2MdsXY.put("IRIS_313-8643", new double[] { 0.102408062749183, 0.0246191394612797 });
		mapIrisid2MdsXY.put("IRIS_313-8645", new double[] { 0.0967733443627809, 0.0142039738065422 });
		mapIrisid2MdsXY.put("IRIS_313-8647", new double[] { 0.102025510832215, -0.0148061396587135 });
		mapIrisid2MdsXY.put("IRIS_313-8655", new double[] { 0.0361814246057711, -0.169183187055979 });
		mapIrisid2MdsXY.put("IRIS_313-8656", new double[] { -0.119024756921984, -0.0743849321266356 });
		mapIrisid2MdsXY.put("IRIS_313-8657", new double[] { 0.092949288576526, 0.000843073726573548 });
		mapIrisid2MdsXY.put("IRIS_313-8658", new double[] { -0.195552181879416, 0.0158151692688044 });
		mapIrisid2MdsXY.put("IRIS_313-8659", new double[] { 0.106218810124769, 0.0138798132086818 });
		mapIrisid2MdsXY.put("IRIS_313-8660", new double[] { 0.103855778067384, -0.0162723119653291 });
		mapIrisid2MdsXY.put("IRIS_313-8664", new double[] { -0.17529908683124, 0.00360250638956427 });
		mapIrisid2MdsXY.put("IRIS_313-8665", new double[] { -0.20494989583401, 0.00762620223886417 });
		mapIrisid2MdsXY.put("IRIS_313-8669", new double[] { -0.197040900511954, 0.00122331147072472 });
		mapIrisid2MdsXY.put("IRIS_313-8674", new double[] { 0.106723952578071, 0.0220820365579692 });
		mapIrisid2MdsXY.put("IRIS_313-8679", new double[] { 0.105592280152072, 0.0280488335716223 });
		mapIrisid2MdsXY.put("IRIS_313-8681", new double[] { 0.103151136349715, 0.0262637069980904 });
		mapIrisid2MdsXY.put("IRIS_313-8683", new double[] { 0.105969412831167, 0.00980557406369935 });
		mapIrisid2MdsXY.put("IRIS_313-8687", new double[] { -0.189307978469233, 0.00969404825783992 });
		mapIrisid2MdsXY.put("IRIS_313-8690", new double[] { -0.186397705135108, 0.0150664603521562 });
		mapIrisid2MdsXY.put("IRIS_313-8694", new double[] { -0.192038664951247, 0.00836322080070368 });
		mapIrisid2MdsXY.put("IRIS_313-8697", new double[] { 0.103395130068819, 0.0249724455537271 });
		mapIrisid2MdsXY.put("IRIS_313-8699", new double[] { 0.0937477085422956, -0.00104773754730784 });
		mapIrisid2MdsXY.put("IRIS_313-8702", new double[] { 0.103792138975658, 0.0266493336719925 });
		mapIrisid2MdsXY.put("IRIS_313-8703", new double[] { 0.106696879767043, 0.0110845925650439 });
		mapIrisid2MdsXY.put("IRIS_313-8704", new double[] { 0.0939208704434587, -0.0234297723194327 });
		mapIrisid2MdsXY.put("IRIS_313-8712", new double[] { -0.151854824221081, -0.0280120099603559 });
		mapIrisid2MdsXY.put("IRIS_313-8713", new double[] { 0.100271584347078, 0.0234960448305424 });
		mapIrisid2MdsXY.put("IRIS_313-8717", new double[] { 0.109999565229618, -0.00338510671141469 });
		mapIrisid2MdsXY.put("IRIS_313-8721", new double[] { 0.0398485608514555, -0.182781190748497 });
		mapIrisid2MdsXY.put("IRIS_313-8722", new double[] { 0.103900439579274, 0.0268828962148436 });
		mapIrisid2MdsXY.put("IRIS_313-8723", new double[] { 0.0944102907748158, 0.0289007755209834 });
		mapIrisid2MdsXY.put("IRIS_313-8725", new double[] { 0.101501743703804, 0.0294042438966168 });
		mapIrisid2MdsXY.put("IRIS_313-8727", new double[] { 0.0995338866046189, -0.0076310670531957 });
		mapIrisid2MdsXY.put("IRIS_313-8731", new double[] { 0.0899430921094677, 0.00372069194384887 });
		mapIrisid2MdsXY.put("IRIS_313-8732", new double[] { 0.0928257989117381, 0.0306507731619532 });
		mapIrisid2MdsXY.put("IRIS_313-8733", new double[] { 0.107537913663981, -0.0108588735329438 });
		mapIrisid2MdsXY.put("IRIS_313-8735", new double[] { -0.190027349007059, 0.0125977754973202 });
		mapIrisid2MdsXY.put("IRIS_313-8737", new double[] { 0.102594653819871, -0.00434161578772049 });
		mapIrisid2MdsXY.put("IRIS_313-8739", new double[] { 0.031243040352544, -0.0404369481465805 });
		mapIrisid2MdsXY.put("IRIS_313-8743", new double[] { 0.0978734119388092, 0.0188824381477661 });
		mapIrisid2MdsXY.put("IRIS_313-8744", new double[] { 0.0935404990954167, 0.0246907611546482 });
		mapIrisid2MdsXY.put("IRIS_313-8745", new double[] { -0.189985025440476, 0.0113838031828211 });
		mapIrisid2MdsXY.put("IRIS_313-8747", new double[] { -0.137351657288556, -0.0528732496895909 });
		mapIrisid2MdsXY.put("IRIS_313-8751", new double[] { 0.110704695253078, 0.0256498313972648 });
		mapIrisid2MdsXY.put("IRIS_313-8754", new double[] { 0.10568054216701, -0.00918269847597363 });
		mapIrisid2MdsXY.put("IRIS_313-8755", new double[] { -0.209876504393516, 0.0116030553847817 });
		mapIrisid2MdsXY.put("IRIS_313-8757", new double[] { 0.0963985029564348, -0.00529212725206272 });
		mapIrisid2MdsXY.put("IRIS_313-8765", new double[] { -0.122871474326981, -0.0340933339397641 });
		mapIrisid2MdsXY.put("IRIS_313-8767", new double[] { 0.101602368657356, 0.0271688765683675 });
		mapIrisid2MdsXY.put("IRIS_313-8768", new double[] { -0.189356111228943, 0.00971025997502432 });
		mapIrisid2MdsXY.put("IRIS_313-8769", new double[] { -0.189644322467852, 0.00891304814901277 });
		mapIrisid2MdsXY.put("IRIS_313-8771", new double[] { 0.039975068955331, -0.171484234102825 });
		mapIrisid2MdsXY.put("IRIS_313-8778", new double[] { -0.190792307499131, 0.00625631542051599 });
		mapIrisid2MdsXY.put("IRIS_313-8781", new double[] { 0.0715734089870898, 0.0341292004564436 });
		mapIrisid2MdsXY.put("IRIS_313-8783", new double[] { 0.0608280705802297, -0.0583919637019559 });
		mapIrisid2MdsXY.put("IRIS_313-8785", new double[] { 0.107467432045203, 0.0248525609266598 });
		mapIrisid2MdsXY.put("IRIS_313-8789", new double[] { 0.0342685504063068, -0.168593182616124 });
		mapIrisid2MdsXY.put("IRIS_313-8791", new double[] { 0.0985544139240717, 0.0285099988297973 });
		mapIrisid2MdsXY.put("IRIS_313-8793", new double[] { 0.0956452642023562, 0.0276255931328248 });
		mapIrisid2MdsXY.put("IRIS_313-8796", new double[] { 0.0902302476023919, 0.0034835678796483 });
		mapIrisid2MdsXY.put("IRIS_313-8803", new double[] { -0.188345806452735, 0.0107057124146401 });
		mapIrisid2MdsXY.put("IRIS_313-8811", new double[] { 0.0904370156192183, 0.0274316834514438 });
		mapIrisid2MdsXY.put("IRIS_313-8812", new double[] { 0.0973796868305066, 0.0311922274829255 });
		mapIrisid2MdsXY.put("IRIS_313-8813", new double[] { -0.1308441559448, -0.0410622059927327 });
		mapIrisid2MdsXY.put("IRIS_313-8814", new double[] { -0.117139368713081, -0.0406881203828256 });
		mapIrisid2MdsXY.put("IRIS_313-8815", new double[] { -0.197081627896645, 0.00205522838181062 });
		mapIrisid2MdsXY.put("IRIS_313-8822", new double[] { 0.0084483366671964, -0.118479506706669 });
		mapIrisid2MdsXY.put("IRIS_313-8831", new double[] { 0.0967851599316974, 0.0282482336033327 });
		mapIrisid2MdsXY.put("IRIS_313-8833", new double[] { 0.102048009743274, 0.0189093649807376 });
		mapIrisid2MdsXY.put("IRIS_313-8844", new double[] { 0.105867049293616, 0.00603974839580204 });
		mapIrisid2MdsXY.put("IRIS_313-8846", new double[] { 0.10889224907327, 0.00871744522586041 });
		mapIrisid2MdsXY.put("IRIS_313-8850", new double[] { 0.101032103326564, -0.0237808749789431 });
		mapIrisid2MdsXY.put("IRIS_313-8854", new double[] { 0.0919681961786527, 0.0208784633538627 });
		mapIrisid2MdsXY.put("IRIS_313-8856", new double[] { -0.204662273658141, 0.00951710168250113 });
		mapIrisid2MdsXY.put("IRIS_313-8857", new double[] { -0.194828466714826, 0.00218426645882981 });
		mapIrisid2MdsXY.put("IRIS_313-8859", new double[] { 0.0638055376957249, 0.0267327493810872 });
		mapIrisid2MdsXY.put("IRIS_313-8864", new double[] { 0.0480861414598016, -0.182689043760503 });
		mapIrisid2MdsXY.put("IRIS_313-8865", new double[] { -0.177852314365542, 0.00900328570859705 });
		mapIrisid2MdsXY.put("IRIS_313-8870", new double[] { 0.107567132339574, 0.0268702539761983 });
		mapIrisid2MdsXY.put("IRIS_313-8872", new double[] { -0.132406422658277, 0.014044126441977 });
		mapIrisid2MdsXY.put("IRIS_313-8873", new double[] { -0.0953358870611492, 0.040779718088491 });
		mapIrisid2MdsXY.put("IRIS_313-8876", new double[] { -0.186824576543466, 0.00718342330652786 });
		mapIrisid2MdsXY.put("IRIS_313-8880", new double[] { -0.0048150591060825, 0.0268736131837069 });
		mapIrisid2MdsXY.put("IRIS_313-8883", new double[] { -0.184645089448612, 0.015372646045961 });
		mapIrisid2MdsXY.put("IRIS_313-8884", new double[] { -0.193278302818092, 0.0094110818067075 });
		mapIrisid2MdsXY.put("IRIS_313-8889", new double[] { 0.0831352409566132, 0.0248692836347358 });
		mapIrisid2MdsXY.put("IRIS_313-8890", new double[] { -0.211284079333706, 0.00787229910007853 });
		mapIrisid2MdsXY.put("IRIS_313-8894", new double[] { -0.186838828961753, 0.00751322659295546 });
		mapIrisid2MdsXY.put("IRIS_313-8895", new double[] { 0.0917428016099501, 0.03034812324413 });
		mapIrisid2MdsXY.put("IRIS_313-8900", new double[] { 0.105717813504051, 0.00271843925169542 });
		mapIrisid2MdsXY.put("IRIS_313-8903", new double[] { 0.0788327481847932, 0.0241470580735525 });
		mapIrisid2MdsXY.put("IRIS_313-8909", new double[] { 0.1051614071011, 0.0274018018525812 });
		mapIrisid2MdsXY.put("IRIS_313-8911", new double[] { -0.0402547903725811, 0.0167206548077012 });
		mapIrisid2MdsXY.put("IRIS_313-8914", new double[] { 0.0870169695765885, 0.0201252118768333 });
		mapIrisid2MdsXY.put("IRIS_313-8920", new double[] { 0.102380086126177, -0.00126238577104182 });
		mapIrisid2MdsXY.put("IRIS_313-8921", new double[] { -0.0687011633944575, 0.0414985864642489 });
		mapIrisid2MdsXY.put("IRIS_313-8922", new double[] { 0.107935096895648, 0.00339530931864316 });
		mapIrisid2MdsXY.put("IRIS_313-8923", new double[] { -0.188902902440622, 0.0111896476635119 });
		mapIrisid2MdsXY.put("IRIS_313-8924", new double[] { 0.102242895003964, -0.00606523286569798 });
		mapIrisid2MdsXY.put("IRIS_313-8925", new double[] { 0.102209161675412, -0.00989037512549041 });
		mapIrisid2MdsXY.put("IRIS_313-8927", new double[] { -0.201157736722473, 0.0110497531117532 });
		mapIrisid2MdsXY.put("IRIS_313-8930", new double[] { 0.108678223670516, 0.0257856932832845 });
		mapIrisid2MdsXY.put("IRIS_313-8932", new double[] { 0.0963699409944797, 0.029545154005626 });
		mapIrisid2MdsXY.put("IRIS_313-8935", new double[] { 0.0461282103959078, 0.0373283301768825 });
		mapIrisid2MdsXY.put("IRIS_313-8940", new double[] { 0.102742983313352, 0.0226081978217971 });
		mapIrisid2MdsXY.put("IRIS_313-8946", new double[] { 0.0948416107719938, 0.0239041242989633 });
		mapIrisid2MdsXY.put("IRIS_313-8948", new double[] { 0.110121008485949, 0.0218680023769237 });
		mapIrisid2MdsXY.put("IRIS_313-8955", new double[] { -0.181645909543247, 0.00616865429275489 });
		mapIrisid2MdsXY.put("IRIS_313-8956", new double[] { 0.088603625448818, 0.023259926029493 });
		mapIrisid2MdsXY.put("IRIS_313-8957", new double[] { 0.106609692854228, 0.00632720919905924 });
		mapIrisid2MdsXY.put("IRIS_313-8960", new double[] { -0.186558356375962, 0.012387765094523 });
		mapIrisid2MdsXY.put("IRIS_313-8963", new double[] { 0.039465568236805, -0.18363988588206 });
		mapIrisid2MdsXY.put("IRIS_313-8967", new double[] { 0.107713344692381, 0.0243069310237048 });
		mapIrisid2MdsXY.put("IRIS_313-8968", new double[] { 0.106595058773321, -0.0198138379273761 });
		mapIrisid2MdsXY.put("IRIS_313-8976", new double[] { -0.187322821330271, 0.0123889498990369 });
		mapIrisid2MdsXY.put("IRIS_313-8978", new double[] { 0.10336008567678, 0.0181680848180478 });
		mapIrisid2MdsXY.put("IRIS_313-8980", new double[] { 0.105187235840082, 0.0265755281139125 });
		mapIrisid2MdsXY.put("IRIS_313-8982", new double[] { 0.0959881819682803, -0.0157559454658426 });
		mapIrisid2MdsXY.put("IRIS_313-8985", new double[] { 0.11159460223857, 0.0256158367476248 });
		mapIrisid2MdsXY.put("IRIS_313-8986", new double[] { 0.0892806778745001, -0.0340269478696208 });
		mapIrisid2MdsXY.put("IRIS_313-8987", new double[] { 0.093061988563927, 0.00590380404617332 });
		mapIrisid2MdsXY.put("IRIS_313-8988", new double[] { 0.109429444096669, -0.00673696915022927 });
		mapIrisid2MdsXY.put("IRIS_313-8994", new double[] { 0.102421189847811, 0.0164128555412195 });
		mapIrisid2MdsXY.put("IRIS_313-8996", new double[] { 0.109741096099568, 0.0245495210655791 });
		mapIrisid2MdsXY.put("IRIS_313-8998", new double[] { -0.182195796323324, 0.00403596628159772 });
		mapIrisid2MdsXY.put("IRIS_313-8999", new double[] { -0.195794261561672, 0.00475887574063304 });
		mapIrisid2MdsXY.put("IRIS_313-9002", new double[] { -0.209804140774375, 0.0121193383769815 });
		mapIrisid2MdsXY.put("IRIS_313-9005", new double[] { 0.100437680691131, 0.0165132022416121 });
		mapIrisid2MdsXY.put("IRIS_313-9006", new double[] { 0.102630800358562, 0.0260375156937503 });
		mapIrisid2MdsXY.put("IRIS_313-9017", new double[] { 0.108366437045868, 0.017589111290671 });
		mapIrisid2MdsXY.put("IRIS_313-9019", new double[] { 0.104329620698464, 0.0243343110615849 });
		mapIrisid2MdsXY.put("IRIS_313-9020", new double[] { 0.109662821881454, 0.0248164783070592 });
		mapIrisid2MdsXY.put("IRIS_313-9023", new double[] { 0.0985600618332279, 0.0115624514371464 });
		mapIrisid2MdsXY.put("IRIS_313-9032", new double[] { 0.0931612591718174, 0.0276943194733093 });
		mapIrisid2MdsXY.put("IRIS_313-9039", new double[] { 0.101087165243174, -0.00673590730255613 });
		mapIrisid2MdsXY.put("IRIS_313-9044", new double[] { 0.0905369907041864, 0.0184981724757579 });
		mapIrisid2MdsXY.put("IRIS_313-9048", new double[] { -0.193769644437174, 0.0014373279197396 });
		mapIrisid2MdsXY.put("IRIS_313-9049", new double[] { 0.0939224263154125, -0.00109419403685581 });
		mapIrisid2MdsXY.put("IRIS_313-9050", new double[] { -0.182421209874887, 0.00637521908194497 });
		mapIrisid2MdsXY.put("IRIS_313-9053", new double[] { -0.16648532359171, -0.0228889839391782 });
		mapIrisid2MdsXY.put("IRIS_313-9054", new double[] { 0.104843372750615, 0.0195741300553231 });
		mapIrisid2MdsXY.put("IRIS_313-9062", new double[] { 0.0975520530895292, 0.0240243266731758 });
		mapIrisid2MdsXY.put("IRIS_313-9065", new double[] { 0.0940536871852071, 0.0209146683443424 });
		mapIrisid2MdsXY.put("IRIS_313-9066", new double[] { 0.0295458379173403, 0.0322550227417413 });
		mapIrisid2MdsXY.put("IRIS_313-9067", new double[] { 0.103073188543235, -0.0041320758651116 });
		mapIrisid2MdsXY.put("IRIS_313-9070", new double[] { 0.10319338469486, 0.0234670187948195 });
		mapIrisid2MdsXY.put("IRIS_313-9072", new double[] { 0.110662765690538, -0.0100519930584962 });
		mapIrisid2MdsXY.put("IRIS_313-9081", new double[] { -0.207233632280261, 0.00954864219309656 });
		mapIrisid2MdsXY.put("IRIS_313-9083", new double[] { -0.126418208994178, -0.0588173357482279 });
		mapIrisid2MdsXY.put("IRIS_313-9091", new double[] { 0.0887297715019533, 0.00299983623681508 });
		mapIrisid2MdsXY.put("IRIS_313-9097", new double[] { 0.0994628788208361, 0.0195819015107349 });
		mapIrisid2MdsXY.put("IRIS_313-9098", new double[] { 0.10095126626642, 0.0191673334521841 });
		mapIrisid2MdsXY.put("IRIS_313-9101", new double[] { -0.0690733378082638, 0.0342131039913394 });
		mapIrisid2MdsXY.put("IRIS_313-9102", new double[] { 0.0897424457574539, 0.0202424875358547 });
		mapIrisid2MdsXY.put("IRIS_313-9108", new double[] { 0.0636357527468139, 0.0152657569831553 });
		mapIrisid2MdsXY.put("IRIS_313-9111", new double[] { 0.0955625479680382, 0.0141647599665252 });
		mapIrisid2MdsXY.put("IRIS_313-9112", new double[] { 0.108243626527483, 0.0311401291626983 });
		mapIrisid2MdsXY.put("IRIS_313-9114", new double[] { 0.107472627858811, 0.0217461957913999 });
		mapIrisid2MdsXY.put("IRIS_313-9115", new double[] { 0.0980731911581104, 0.0316391428811947 });
		mapIrisid2MdsXY.put("IRIS_313-9116", new double[] { 0.104046805488637, 0.030001730099477 });
		mapIrisid2MdsXY.put("IRIS_313-9117", new double[] { 0.0979441636925896, 0.0208138812489419 });
		mapIrisid2MdsXY.put("IRIS_313-9119", new double[] { 0.0991136502339106, 0.0312681693886711 });
		mapIrisid2MdsXY.put("IRIS_313-9120", new double[] { 0.000295872947031698, -0.00783363396119716 });
		mapIrisid2MdsXY.put("IRIS_313-9121", new double[] { 0.115428181569426, -0.011310863322913 });
		mapIrisid2MdsXY.put("IRIS_313-9123", new double[] { -0.183569400444336, 0.0094411255985703 });
		mapIrisid2MdsXY.put("IRIS_313-9129", new double[] { -0.186199447701095, 0.00962260489574546 });
		mapIrisid2MdsXY.put("IRIS_313-9131", new double[] { 0.104591380784348, 0.0191379836239306 });
		mapIrisid2MdsXY.put("IRIS_313-9137", new double[] { 0.0268203905404381, -0.116513184982912 });
		mapIrisid2MdsXY.put("IRIS_313-9139", new double[] { 0.102817667052158, -0.00255659886703348 });
		mapIrisid2MdsXY.put("IRIS_313-9140", new double[] { -0.171159814966647, 0.0266341487003197 });
		mapIrisid2MdsXY.put("IRIS_313-9148", new double[] { 0.104749345468541, -0.0233679105755215 });
		mapIrisid2MdsXY.put("IRIS_313-9156", new double[] { 0.107430229365969, 0.00225629985614071 });
		mapIrisid2MdsXY.put("IRIS_313-9160", new double[] { 0.109496232645376, 0.0237740899054607 });
		mapIrisid2MdsXY.put("IRIS_313-9170", new double[] { -0.139252346164626, -0.0217028290218575 });
		mapIrisid2MdsXY.put("IRIS_313-9172", new double[] { -0.145037659358527, -0.0280342796172552 });
		mapIrisid2MdsXY.put("IRIS_313-9174", new double[] { 0.103133886301796, 0.0104721539344369 });
		mapIrisid2MdsXY.put("IRIS_313-9176", new double[] { -0.199800374287289, 0.00548351865434451 });
		mapIrisid2MdsXY.put("IRIS_313-9182", new double[] { 0.102515556202527, 0.0104563063896396 });
		mapIrisid2MdsXY.put("IRIS_313-9184", new double[] { 0.0935289307424075, 0.0243537224916945 });
		mapIrisid2MdsXY.put("IRIS_313-9187", new double[] { 0.000671976877089452, 0.0191481585501106 });
		mapIrisid2MdsXY.put("IRIS_313-9188", new double[] { 0.0959090793712813, 0.026760862773713 });
		mapIrisid2MdsXY.put("IRIS_313-9190", new double[] { 0.107579730222403, 0.0149813184724762 });
		mapIrisid2MdsXY.put("IRIS_313-9193", new double[] { -0.203016084208125, 0.00997157520016688 });
		mapIrisid2MdsXY.put("IRIS_313-9197", new double[] { 0.0939460769003775, 0.0251318102167582 });
		mapIrisid2MdsXY.put("IRIS_313-9198", new double[] { 0.106521073753548, 0.0263816443389081 });
		mapIrisid2MdsXY.put("IRIS_313-9201", new double[] { -0.188822991984093, 0.0139151844653983 });
		mapIrisid2MdsXY.put("IRIS_313-9204", new double[] { 0.0897893412831631, 0.0135873587231596 });
		mapIrisid2MdsXY.put("IRIS_313-9208", new double[] { 0.0923210968542253, 0.0198794564543827 });
		mapIrisid2MdsXY.put("IRIS_313-9209", new double[] { 0.101961178536708, 0.0269820568780127 });
		mapIrisid2MdsXY.put("IRIS_313-9210", new double[] { 0.0977746917466717, 0.0225191622884384 });
		mapIrisid2MdsXY.put("IRIS_313-9218", new double[] { 0.104343144121609, 0.00915813895763925 });
		mapIrisid2MdsXY.put("IRIS_313-9227", new double[] { 0.0977003564520844, 0.0297160764431252 });
		mapIrisid2MdsXY.put("IRIS_313-9228", new double[] { -0.209778985705319, 0.0122335571405751 });
		mapIrisid2MdsXY.put("IRIS_313-9233", new double[] { -0.20900292466181, 0.0115694797959493 });
		mapIrisid2MdsXY.put("IRIS_313-9239", new double[] { -0.184061143764661, 0.0100188774860395 });
		mapIrisid2MdsXY.put("IRIS_313-9242", new double[] { -0.0358654020626093, 0.0409495598925559 });
		mapIrisid2MdsXY.put("IRIS_313-9243", new double[] { 0.0948244794088031, 0.0171533996572709 });
		mapIrisid2MdsXY.put("IRIS_313-9249", new double[] { -0.202253240056965, 0.0159940861368594 });
		mapIrisid2MdsXY.put("IRIS_313-9251", new double[] { 0.089559468494251, 0.0263181942173737 });
		mapIrisid2MdsXY.put("IRIS_313-9253", new double[] { 0.0725417640596589, 0.0232749958136473 });
		mapIrisid2MdsXY.put("IRIS_313-9256", new double[] { 0.0850239872038775, -0.0238821840921418 });
		mapIrisid2MdsXY.put("IRIS_313-9258", new double[] { 0.10063483569151, -0.000407005023526059 });
		mapIrisid2MdsXY.put("IRIS_313-9259", new double[] { 0.0840743378256321, 0.00510962326828755 });
		mapIrisid2MdsXY.put("IRIS_313-9262", new double[] { 0.111262741096691, 0.000280758623733842 });
		mapIrisid2MdsXY.put("IRIS_313-9267", new double[] { -0.192975602710257, 0.0103119878219545 });
		mapIrisid2MdsXY.put("IRIS_313-9271", new double[] { 0.111482420072451, -0.00529008984097851 });
		mapIrisid2MdsXY.put("IRIS_313-9273", new double[] { 0.0939142266665238, 0.0251591057553031 });
		mapIrisid2MdsXY.put("IRIS_313-9281", new double[] { 0.104735917618658, 0.0249095895541423 });
		mapIrisid2MdsXY.put("IRIS_313-9283", new double[] { 0.0253722138206987, -0.181981453598164 });
		mapIrisid2MdsXY.put("IRIS_313-9285", new double[] { 0.101939639831005, 0.0211656856524143 });
		mapIrisid2MdsXY.put("IRIS_313-9286", new double[] { 0.104642957946751, 0.0285709731759411 });
		mapIrisid2MdsXY.put("IRIS_313-9287", new double[] { 0.102019518558755, 0.00385462212255711 });
		mapIrisid2MdsXY.put("IRIS_313-9288", new double[] { 0.104568015308463, 0.0262791009385611 });
		mapIrisid2MdsXY.put("IRIS_313-9294", new double[] { 0.11185228658059, 0.00797972743392428 });
		mapIrisid2MdsXY.put("IRIS_313-9297", new double[] { -0.185973039228017, 0.0114986537423832 });
		mapIrisid2MdsXY.put("IRIS_313-9301", new double[] { -0.167965104535425, 0.0126737466755808 });
		mapIrisid2MdsXY.put("IRIS_313-9302", new double[] { 0.105008146876186, 0.0229604120877819 });
		mapIrisid2MdsXY.put("IRIS_313-9310", new double[] { 0.104350030211227, 0.0196255713081 });
		mapIrisid2MdsXY.put("IRIS_313-9313", new double[] { 0.0833379588796789, -0.0380500416306896 });
		mapIrisid2MdsXY.put("IRIS_313-9314", new double[] { 0.101258285980473, 0.0275133642786454 });
		mapIrisid2MdsXY.put("IRIS_313-9317", new double[] { 0.0986960021046665, 0.0226829775113637 });
		mapIrisid2MdsXY.put("IRIS_313-9320", new double[] { 0.0980811148410313, 0.0273224816226323 });
		mapIrisid2MdsXY.put("IRIS_313-9324", new double[] { 0.0990428420095536, 0.0231125767241494 });
		mapIrisid2MdsXY.put("IRIS_313-9325", new double[] { 0.0985799707954723, 0.022436476055643 });
		mapIrisid2MdsXY.put("IRIS_313-9329", new double[] { 0.0965954430084541, 0.0277413160213442 });
		mapIrisid2MdsXY.put("IRIS_313-9342", new double[] { 0.113821397906446, 0.0207582365575507 });
		mapIrisid2MdsXY.put("IRIS_313-9346", new double[] { -0.208878327710423, 0.0121105749320227 });
		mapIrisid2MdsXY.put("IRIS_313-9347", new double[] { 0.0862395798883507, 0.0190590805437794 });
		mapIrisid2MdsXY.put("IRIS_313-9348", new double[] { 0.0777262503355205, 0.00106858744659362 });
		mapIrisid2MdsXY.put("IRIS_313-9351", new double[] { 0.0942929012914307, -0.0141449973301309 });
		mapIrisid2MdsXY.put("IRIS_313-9357", new double[] { 0.110057568141652, 0.0266238655814647 });
		mapIrisid2MdsXY.put("IRIS_313-9360", new double[] { 0.108104670123791, 0.000420305324957893 });
		mapIrisid2MdsXY.put("IRIS_313-9363", new double[] { -0.18229189462971, 0.0157838397264079 });
		mapIrisid2MdsXY.put("IRIS_313-9366", new double[] { -0.204107917793231, 0.0134645240502227 });
		mapIrisid2MdsXY.put("IRIS_313-9368", new double[] { 0.0400654948899722, -0.173913326700163 });
		mapIrisid2MdsXY.put("IRIS_313-9372", new double[] { 0.0978338203532179, 0.0165377182000088 });
		mapIrisid2MdsXY.put("IRIS_313-9375", new double[] { -0.186958220438461, 0.00885641177019698 });
		mapIrisid2MdsXY.put("IRIS_313-9379", new double[] { -0.209539126453192, 0.00666469661159743 });
		mapIrisid2MdsXY.put("IRIS_313-9384", new double[] { 0.0994239619783755, -0.0154976177847253 });
		mapIrisid2MdsXY.put("IRIS_313-9388", new double[] { 0.0657209393819496, -0.0641240890007788 });
		mapIrisid2MdsXY.put("IRIS_313-9389", new double[] { -0.190276433583751, 0.00400415986144497 });
		mapIrisid2MdsXY.put("IRIS_313-9391", new double[] { 0.105128127427494, 0.0171042751673899 });
		mapIrisid2MdsXY.put("IRIS_313-9392", new double[] { -0.0751537027727006, 0.0377106432140442 });
		mapIrisid2MdsXY.put("IRIS_313-9397", new double[] { 0.100048361163434, 0.00641162075122245 });
		mapIrisid2MdsXY.put("IRIS_313-9400", new double[] { 0.0182049552635226, 0.0135015598872488 });
		mapIrisid2MdsXY.put("IRIS_313-9402", new double[] { 0.108548590052394, 0.0155258843013405 });
		mapIrisid2MdsXY.put("IRIS_313-9403", new double[] { 0.106904405493867, -0.0318864279868186 });
		mapIrisid2MdsXY.put("IRIS_313-9404", new double[] { -0.0584599707665909, 0.0433332715155764 });
		mapIrisid2MdsXY.put("IRIS_313-9405", new double[] { -0.183865034211827, 0.0101925547584996 });
		mapIrisid2MdsXY.put("IRIS_313-9406", new double[] { 0.109947832391453, 0.0214566241234425 });
		mapIrisid2MdsXY.put("IRIS_313-9409", new double[] { 0.102211908690546, 0.0231691924681751 });
		mapIrisid2MdsXY.put("IRIS_313-9410", new double[] { -0.209207430427037, 0.0118374225890565 });
		mapIrisid2MdsXY.put("IRIS_313-9415", new double[] { 0.1102718347489, 0.0195116489046412 });
		mapIrisid2MdsXY.put("IRIS_313-9422", new double[] { 0.0518282628853965, -0.176365652672328 });
		mapIrisid2MdsXY.put("IRIS_313-9423", new double[] { -0.190495161314597, 0.00355213832946597 });
		mapIrisid2MdsXY.put("IRIS_313-9424", new double[] { 0.105803726583665, 0.0140393427239968 });
		mapIrisid2MdsXY.put("IRIS_313-9427", new double[] { 0.104980050462108, 0.0187043268578035 });
		mapIrisid2MdsXY.put("IRIS_313-9429", new double[] { 0.0987161369459536, 0.0216102459511563 });
		mapIrisid2MdsXY.put("IRIS_313-9433", new double[] { 0.100685424593462, 0.0170484371493397 });
		mapIrisid2MdsXY.put("IRIS_313-9438", new double[] { -0.183243373076214, 0.0174359403676378 });
		mapIrisid2MdsXY.put("IRIS_313-9445", new double[] { -0.128108740640886, -0.0245398358285813 });
		mapIrisid2MdsXY.put("IRIS_313-9449", new double[] { 0.0322614676720943, -0.166601185488028 });
		mapIrisid2MdsXY.put("IRIS_313-9451", new double[] { 0.105293128685726, 0.0187692959788073 });
		mapIrisid2MdsXY.put("IRIS_313-9452", new double[] { -0.190297821976665, 0.00987041223876864 });
		mapIrisid2MdsXY.put("IRIS_313-9461", new double[] { 0.100646136405117, 0.0178214205756137 });
		mapIrisid2MdsXY.put("IRIS_313-9463", new double[] { -0.210168327591693, 0.0120529642889873 });
		mapIrisid2MdsXY.put("IRIS_313-9464", new double[] { -0.0361545759535264, 0.0285390093467306 });
		mapIrisid2MdsXY.put("IRIS_313-9468", new double[] { -0.206587493174426, 0.015657359157009 });
		mapIrisid2MdsXY.put("IRIS_313-9469", new double[] { 0.0999062800556932, 0.0211349449388211 });
		mapIrisid2MdsXY.put("IRIS_313-9470", new double[] { -0.181052912207704, 0.00561809778860603 });
		mapIrisid2MdsXY.put("IRIS_313-9472", new double[] { 0.104715731779429, 0.0106377408805234 });
		mapIrisid2MdsXY.put("IRIS_313-9482", new double[] { 0.0935750029319011, 0.0208166846918813 });
		mapIrisid2MdsXY.put("IRIS_313-9484", new double[] { 0.100090579366155, 0.0115933415988253 });
		mapIrisid2MdsXY.put("IRIS_313-9491", new double[] { -0.188620952057991, 0.0133041763220607 });
		mapIrisid2MdsXY.put("IRIS_313-9492", new double[] { 0.105888618047425, -0.00618502908760622 });
		mapIrisid2MdsXY.put("IRIS_313-9503", new double[] { 0.0889342500727402, 0.026337296574893 });
		mapIrisid2MdsXY.put("IRIS_313-9505", new double[] { 0.0983981036146793, 0.0185125517664503 });
		mapIrisid2MdsXY.put("IRIS_313-9506", new double[] { -0.0155549722251655, 0.00756078804299519 });
		mapIrisid2MdsXY.put("IRIS_313-9516", new double[] { 0.0782024998986252, -0.0281885922814902 });
		mapIrisid2MdsXY.put("IRIS_313-9519", new double[] { -0.190595142153821, 0.0129153929208783 });
		mapIrisid2MdsXY.put("IRIS_313-9522", new double[] { 0.0861143487434384, 0.0183227371652523 });
		mapIrisid2MdsXY.put("IRIS_313-9523", new double[] { -0.204638421876426, 0.0084292087124499 });
		mapIrisid2MdsXY.put("IRIS_313-9529", new double[] { -0.191648288163793, 0.00335094963465991 });
		mapIrisid2MdsXY.put("IRIS_313-9533", new double[] { 0.103375714229521, 0.0222322751327245 });
		mapIrisid2MdsXY.put("IRIS_313-9539", new double[] { -0.206430912371465, 0.0068954393004021 });
		mapIrisid2MdsXY.put("IRIS_313-9547", new double[] { 0.106885368892268, -0.0010868856102503 });
		mapIrisid2MdsXY.put("IRIS_313-9550", new double[] { -0.185560300547474, 0.0124203529325312 });
		mapIrisid2MdsXY.put("IRIS_313-9551", new double[] { 0.108303582977289, -0.00405785840620758 });
		mapIrisid2MdsXY.put("IRIS_313-9555", new double[] { 0.103100427112553, 0.0161204810837872 });
		mapIrisid2MdsXY.put("IRIS_313-9557", new double[] { 0.0942637005347443, -0.00765031973527389 });
		mapIrisid2MdsXY.put("IRIS_313-9558", new double[] { -0.188260365181122, 0.00994867923918417 });
		mapIrisid2MdsXY.put("IRIS_313-9560", new double[] { 0.102821228803737, 0.0219156563670647 });
		mapIrisid2MdsXY.put("IRIS_313-9566", new double[] { 0.102843983100751, 0.0142459625461513 });
		mapIrisid2MdsXY.put("IRIS_313-9567", new double[] { 0.105117874072859, 0.0248460860574497 });
		mapIrisid2MdsXY.put("IRIS_313-9568", new double[] { -0.177599952560465, 0.00476303841451719 });
		mapIrisid2MdsXY.put("IRIS_313-9570", new double[] { 0.0740969513385072, 0.0292777088293997 });
		mapIrisid2MdsXY.put("IRIS_313-9572", new double[] { 0.0864644464838273, -0.0356410097548201 });
		mapIrisid2MdsXY.put("IRIS_313-9574", new double[] { 0.109332836016989, 0.0199380988605958 });
		mapIrisid2MdsXY.put("IRIS_313-9575", new double[] { 0.0837761248406752, 0.0367832562667905 });
		mapIrisid2MdsXY.put("IRIS_313-9582", new double[] { 0.0942600660919318, 0.0261636845011094 });
		mapIrisid2MdsXY.put("IRIS_313-9590", new double[] { 0.094290717000941, 0.0274758524624128 });
		mapIrisid2MdsXY.put("IRIS_313-9593", new double[] { 0.10765376755802, 0.0190313829835916 });
		mapIrisid2MdsXY.put("IRIS_313-9594", new double[] { 0.106976165428851, 0.0211561929992123 });
		mapIrisid2MdsXY.put("IRIS_313-9600", new double[] { -0.0215022784226891, 0.0279274403542275 });
		mapIrisid2MdsXY.put("IRIS_313-9601", new double[] { -0.122267152665072, -0.0627136341857111 });
		mapIrisid2MdsXY.put("IRIS_313-9602", new double[] { 0.107032851061439, 0.0172361650974155 });
		mapIrisid2MdsXY.put("IRIS_313-9604", new double[] { 0.091646414541839, 0.00467881003327959 });
		mapIrisid2MdsXY.put("IRIS_313-9605", new double[] { 0.101135075402454, 0.0207923440397736 });
		mapIrisid2MdsXY.put("IRIS_313-9606", new double[] { 0.10561386077813, 0.0142601608056445 });
		mapIrisid2MdsXY.put("IRIS_313-9609", new double[] { 0.0918183789640167, 0.0104895424405705 });
		mapIrisid2MdsXY.put("IRIS_313-9610", new double[] { 0.0209780408308551, -0.181225372698668 });
		mapIrisid2MdsXY.put("IRIS_313-9611", new double[] { 0.103628041749258, 0.00154186426510572 });
		mapIrisid2MdsXY.put("IRIS_313-9616", new double[] { -0.189015025024581, 0.00601517667539297 });
		mapIrisid2MdsXY.put("IRIS_313-9617", new double[] { 0.103187250018333, 0.00190262850036197 });
		mapIrisid2MdsXY.put("IRIS_313-9619", new double[] { 0.102684565421127, 0.0148955908519585 });
		mapIrisid2MdsXY.put("IRIS_313-9623", new double[] { 0.102609773373016, 0.014937406819076 });
		mapIrisid2MdsXY.put("IRIS_313-9626", new double[] { 0.045948720091748, -0.188165627760963 });
		mapIrisid2MdsXY.put("IRIS_313-9629", new double[] { -0.133347279973394, -0.0444485084358585 });
		mapIrisid2MdsXY.put("IRIS_313-9634", new double[] { 0.0932181347885101, 0.0103635837847363 });
		mapIrisid2MdsXY.put("IRIS_313-9636", new double[] { -0.00902991257493202, -0.158933210507344 });
		mapIrisid2MdsXY.put("IRIS_313-9637", new double[] { 0.0861287414765369, 0.0110314819117123 });
		mapIrisid2MdsXY.put("IRIS_313-9641", new double[] { 0.011652114986908, -0.151793794109736 });
		mapIrisid2MdsXY.put("IRIS_313-9648", new double[] { -0.0346417785522829, -0.0144491272399834 });
		mapIrisid2MdsXY.put("IRIS_313-9661", new double[] { 0.0461719355225799, -0.17304153658074 });
		mapIrisid2MdsXY.put("IRIS_313-9669", new double[] { 0.102434987101164, 0.0271419047792566 });
		mapIrisid2MdsXY.put("IRIS_313-9682", new double[] { -0.135324845942092, -0.0235697679972201 });
		mapIrisid2MdsXY.put("IRIS_313-9685", new double[] { 0.0826634963971877, 0.0187211333948093 });
		mapIrisid2MdsXY.put("IRIS_313-9687", new double[] { 0.108170578745266, 0.0152458194173373 });
		mapIrisid2MdsXY.put("IRIS_313-9691", new double[] { -0.177974766314253, 0.00916228641393555 });
		mapIrisid2MdsXY.put("IRIS_313-9694", new double[] { 0.0991321193309866, 0.0275473087574463 });
		mapIrisid2MdsXY.put("IRIS_313-9695", new double[] { 0.0686761562214792, -0.106025897536424 });
		mapIrisid2MdsXY.put("IRIS_313-9696", new double[] { 0.104518950838289, 0.0211742889201611 });
		mapIrisid2MdsXY.put("IRIS_313-9697", new double[] { 0.113254479354113, 0.0206410596835283 });
		mapIrisid2MdsXY.put("IRIS_313-9698", new double[] { -0.210289915319733, 0.0102116980275712 });
		mapIrisid2MdsXY.put("IRIS_313-9699", new double[] { 0.103661131122795, 0.0237605304828389 });
		mapIrisid2MdsXY.put("IRIS_313-9701", new double[] { -0.209356839689189, 0.0119753815860028 });
		mapIrisid2MdsXY.put("IRIS_313-9702", new double[] { -0.205054120334614, 0.015016074695014 });
		mapIrisid2MdsXY.put("IRIS_313-9703", new double[] { -0.206528251421675, 0.0153744218693136 });
		mapIrisid2MdsXY.put("IRIS_313-9705", new double[] { 0.0954320384575144, 0.0221589815285245 });
		mapIrisid2MdsXY.put("IRIS_313-9706", new double[] { 0.0957507824266123, 0.0208262426924616 });
		mapIrisid2MdsXY.put("IRIS_313-9708", new double[] { 0.0899688815069603, 0.022188702533695 });
		mapIrisid2MdsXY.put("IRIS_313-9709", new double[] { 0.106705210112247, -0.00464660603373826 });
		mapIrisid2MdsXY.put("IRIS_313-9723", new double[] { 0.0930903572675542, 0.0159171002362768 });
		mapIrisid2MdsXY.put("IRIS_313-9724", new double[] { -0.205168675270236, 0.0180768457944473 });
		mapIrisid2MdsXY.put("IRIS_313-9725", new double[] { -0.202107102172563, 0.0159768888403811 });
		mapIrisid2MdsXY.put("IRIS_313-9727", new double[] { 0.070259912517678, -0.0417169552992504 });
		mapIrisid2MdsXY.put("IRIS_313-9730", new double[] { 0.098774386746397, 0.0138900035306599 });
		mapIrisid2MdsXY.put("IRIS_313-9732", new double[] { 0.0856894107367542, -0.0476127515076791 });
		mapIrisid2MdsXY.put("IRIS_313-9740", new double[] { 0.0348393593201703, -0.0483507645784783 });
		mapIrisid2MdsXY.put("IRIS_313-9742", new double[] { -0.197029260263466, 0.0105755420719648 });
		mapIrisid2MdsXY.put("IRIS_313-9745", new double[] { -0.193016126564969, 0.0129566857130511 });
		mapIrisid2MdsXY.put("IRIS_313-9758", new double[] { 0.0924820200473544, 0.0149851197417234 });
		mapIrisid2MdsXY.put("IRIS_313-9759", new double[] { -0.20747775447875, 0.00825452132915892 });
		mapIrisid2MdsXY.put("IRIS_313-9767", new double[] { 0.0210569634200938, 0.0400426496463139 });
		mapIrisid2MdsXY.put("IRIS_313-9769", new double[] { -0.211091103319531, 0.0115719830619835 });
		mapIrisid2MdsXY.put("IRIS_313-9770", new double[] { -0.20509998175042, 0.0124176333788063 });
		mapIrisid2MdsXY.put("IRIS_313-9771", new double[] { -0.209605463421761, 0.0134868722291193 });
		mapIrisid2MdsXY.put("IRIS_313-9774", new double[] { -0.20137034300676, 0.0125473832738221 });
		mapIrisid2MdsXY.put("IRIS_313-9778", new double[] { 0.0647177793262002, -0.0884471642515018 });
		mapIrisid2MdsXY.put("IRIS_313-9782", new double[] { -0.210693962347053, 0.0116761857967611 });
		mapIrisid2MdsXY.put("IRIS_313-9783", new double[] { -0.0509519473419248, -0.132987976709283 });
		mapIrisid2MdsXY.put("IRIS_313-9789", new double[] { -0.177047416474788, 0.0207081534860192 });
		mapIrisid2MdsXY.put("IRIS_313-9790", new double[] { -0.204613996044645, 0.0125593708500895 });
		mapIrisid2MdsXY.put("IRIS_313-9791", new double[] { 0.104113467776918, 0.00490007850693722 });
		mapIrisid2MdsXY.put("IRIS_313-9795", new double[] { 0.0612785507609601, 0.0105867259691194 });
		mapIrisid2MdsXY.put("IRIS_313-9800", new double[] { -0.180640029610287, 0.017470591452008 });
		mapIrisid2MdsXY.put("IRIS_313-9809", new double[] { 0.108947876533025, 0.0191822232587272 });
		mapIrisid2MdsXY.put("IRIS_313-9811", new double[] { -0.211601719316481, 0.0104889773656159 });
		mapIrisid2MdsXY.put("IRIS_313-9813", new double[] { -0.210143433462827, 0.00704924198780776 });
		mapIrisid2MdsXY.put("IRIS_313-9814", new double[] { -0.210597240540526, 0.0106408551727026 });
		mapIrisid2MdsXY.put("IRIS_313-9817", new double[] { -0.00785119147226039, -0.00895036687298572 });
		mapIrisid2MdsXY.put("IRIS_313-9818", new double[] { -0.0130398276283112, 0.0488549190495116 });
		mapIrisid2MdsXY.put("IRIS_313-9822", new double[] { 0.0960817578958341, 0.013776074788861 });
		mapIrisid2MdsXY.put("IRIS_313-9825", new double[] { 0.103645188438592, 0.00531266689747261 });
		mapIrisid2MdsXY.put("IRIS_313-9831", new double[] { 0.105802214054135, -0.00742756717224339 });
		mapIrisid2MdsXY.put("IRIS_313-9832", new double[] { 0.0839681497302098, 5.45178269077879E-05 });
		mapIrisid2MdsXY.put("IRIS_313-9838", new double[] { -0.209531465390962, 0.00618326825748396 });
		mapIrisid2MdsXY.put("IRIS_313-9839", new double[] { -0.210626755357689, 0.00848629034796343 });
		mapIrisid2MdsXY.put("IRIS_313-9841", new double[] { 0.0120362103883762, 0.01835445156975 });
		mapIrisid2MdsXY.put("IRIS_313-9851", new double[] { -0.189563345266373, 0.0109703313733393 });
		mapIrisid2MdsXY.put("IRIS_313-9861", new double[] { 0.0282551040333555, -0.167310859412293 });
		mapIrisid2MdsXY.put("IRIS_313-9862", new double[] { 0.0992421187650982, -0.0135805352454612 });
		mapIrisid2MdsXY.put("IRIS_313-9867", new double[] { 0.106399815688769, 0.0197791705793902 });
		mapIrisid2MdsXY.put("IRIS_313-9880", new double[] { -0.210452873856744, 0.00588527759252519 });
		mapIrisid2MdsXY.put("IRIS_313-9882", new double[] { 0.0998103636014352, 0.0139352248779417 });
		mapIrisid2MdsXY.put("IRIS_313-9884", new double[] { -0.210490072466172, 0.0101035347384686 });
		mapIrisid2MdsXY.put("IRIS_313-9886", new double[] { -0.208890028902355, 0.00911682844473193 });
		mapIrisid2MdsXY.put("IRIS_313-9887", new double[] { -0.20956770955531, 0.00531563323031325 });
		mapIrisid2MdsXY.put("IRIS_313-9890", new double[] { -0.210220847349309, 0.00556968099412013 });
		mapIrisid2MdsXY.put("IRIS_313-9891", new double[] { -0.210541637892083, 0.0123538260794435 });
		mapIrisid2MdsXY.put("IRIS_313-9897", new double[] { -0.194166513735975, 0.00660194588446951 });
		mapIrisid2MdsXY.put("IRIS_313-9898", new double[] { 0.101805721879716, 0.0270225796284513 });
		mapIrisid2MdsXY.put("IRIS_313-9917", new double[] { 0.104127774829814, 0.0112492228989474 });
		mapIrisid2MdsXY.put("IRIS_313-9922", new double[] { 0.0786351390275973, 0.0339191048083559 });
		mapIrisid2MdsXY.put("IRIS_313-9924", new double[] { 0.101732696997835, 0.0221893004707171 });
		mapIrisid2MdsXY.put("IRIS_313-9925", new double[] { 0.0829499263675844, 0.0190244726688353 });
		mapIrisid2MdsXY.put("IRIS_313-9926", new double[] { 0.0992063827699264, 0.00966157788403809 });
		mapIrisid2MdsXY.put("IRIS_313-9928", new double[] { -0.168916219910004, 0.0110696599764885 });
		mapIrisid2MdsXY.put("IRIS_313-9929", new double[] { -0.183026095872929, 0.00706762273629529 });
		mapIrisid2MdsXY.put("IRIS_313-9935", new double[] { 0.102474522973326, -0.00205348345160387 });
		mapIrisid2MdsXY.put("IRIS_313-9936", new double[] { 0.107157802844355, 0.0167513993865253 });
		mapIrisid2MdsXY.put("IRIS_313-9937", new double[] { -0.207657093724898, 0.0120623072415864 });
		mapIrisid2MdsXY.put("IRIS_313-9939", new double[] { -0.0414209524147819, 0.029883606260198 });
		mapIrisid2MdsXY.put("IRIS_313-9940", new double[] { 0.0995813216424598, 0.0268384538788785 });
		mapIrisid2MdsXY.put("IRIS_313-9944", new double[] { 0.10027399409413, -0.00746347570704416 });
		mapIrisid2MdsXY.put("IRIS_313-9949", new double[] { -0.172322509215383, -0.0160463585786299 });
		mapIrisid2MdsXY.put("IRIS_313-9953", new double[] { 0.10489250443558, 0.0305475547295244 });
		mapIrisid2MdsXY.put("IRIS_313-9961", new double[] { -0.207830224805992, 0.00985354550891555 });
		mapIrisid2MdsXY.put("IRIS_313-9963", new double[] { 0.0349184003306018, -0.181780928923294 });
		mapIrisid2MdsXY.put("IRIS_313-9964", new double[] { -0.211163395819713, 0.00612343222840167 });
		mapIrisid2MdsXY.put("IRIS_313-9966", new double[] { 0.104072776777914, 0.0264138045362819 });
		mapIrisid2MdsXY.put("IRIS_313-9968", new double[] { 0.103899941352051, 0.0138857461099258 });
		mapIrisid2MdsXY.put("IRIS_313-9969", new double[] { 0.097539271682909, 0.014877059058021 });
		mapIrisid2MdsXY.put("IRIS_313-9970", new double[] { 0.110657726018207, -0.0188571526052855 });
		mapIrisid2MdsXY.put("IRIS_313-9974", new double[] { -0.209086972641639, 0.00942698918601317 });
		mapIrisid2MdsXY.put("IRIS_313-9976", new double[] { 0.0975701209461166, 0.0213214884892173 });
		mapIrisid2MdsXY.put("IRIS_313-9978", new double[] { -0.138060617856284, -0.0523644217135172 });
		mapIrisid2MdsXY.put("IRIS_313-9980", new double[] { -0.203188734808315, 0.0160856835804642 });
		mapIrisid2MdsXY.put("IRIS_313-9986", new double[] { 0.107030558857785, 0.0141835182014707 });
		mapIrisid2MdsXY.put("IRIS_313-9989", new double[] { 0.104444412147784, 0.0279019520211017 });
		mapIrisid2MdsXY.put("IRIS_313-9995", new double[] { -0.176283431858782, 0.0207389811022268 });
		mapIrisid2MdsXY.put("IRIS_313-9996", new double[] { -0.206598286520315, 0.0142233575653967 });
		mapIrisid2MdsXY.put("IRIS_313-10000", new double[] { 0.0772797866273779, 0.0364851120074223 });
		mapIrisid2MdsXY.put("IRIS_313-10001", new double[] { 0.101693550312121, 0.0218434847333505 });
		mapIrisid2MdsXY.put("IRIS_313-10002", new double[] { 0.0834455686295339, 0.0307711430360886 });
		mapIrisid2MdsXY.put("IRIS_313-10007", new double[] { 0.0990674963049266, 0.0235918525865088 });
		mapIrisid2MdsXY.put("IRIS_313-10010", new double[] { 0.106393815607368, -0.000771031543600489 });
		mapIrisid2MdsXY.put("IRIS_313-10014", new double[] { -0.202820055626228, 0.0129301419263624 });
		mapIrisid2MdsXY.put("IRIS_313-10016", new double[] { 0.0946082990387963, 0.027277785131292 });
		mapIrisid2MdsXY.put("IRIS_313-10020", new double[] { -0.00487138279464421, -0.160202493364676 });
		mapIrisid2MdsXY.put("IRIS_313-10025", new double[] { -0.174354087056008, -0.027742541115549 });
		mapIrisid2MdsXY.put("IRIS_313-10026", new double[] { 0.0653558685227968, -0.0358901888910766 });
		mapIrisid2MdsXY.put("IRIS_313-10030", new double[] { 0.07310857907543, -0.04895972383715 });
		mapIrisid2MdsXY.put("IRIS_313-10032", new double[] { -0.136144099968142, -0.0530383707738847 });
		mapIrisid2MdsXY.put("IRIS_313-10034", new double[] { 0.100563634963742, 0.0219255793503137 });
		mapIrisid2MdsXY.put("IRIS_313-10035", new double[] { 0.0244229364367318, 0.0154087048518737 });
		mapIrisid2MdsXY.put("IRIS_313-10040", new double[] { 0.0863786243819627, 0.0312444378933338 });
		mapIrisid2MdsXY.put("IRIS_313-10041", new double[] { -0.1851464870533, 0.0113030678273389 });
		mapIrisid2MdsXY.put("IRIS_313-10045", new double[] { 0.103330189644778, 0.0125596255977972 });
		mapIrisid2MdsXY.put("IRIS_313-10046", new double[] { 0.101714540762694, 0.0172341091957358 });
		mapIrisid2MdsXY.put("IRIS_313-10047", new double[] { 0.0917003377340145, 0.023755502320834 });
		mapIrisid2MdsXY.put("IRIS_313-10048", new double[] { 0.0849508017894846, -0.0258941745167798 });
		mapIrisid2MdsXY.put("IRIS_313-10050", new double[] { 0.100125845777101, -0.0153271882589659 });
		mapIrisid2MdsXY.put("IRIS_313-10051", new double[] { -0.192944039653673, 0.0117363578533019 });
		mapIrisid2MdsXY.put("IRIS_313-10054", new double[] { 0.0635330687751764, 0.0226784629153899 });
		mapIrisid2MdsXY.put("IRIS_313-10056", new double[] { -0.195132769518615, 0.00582227590057712 });
		mapIrisid2MdsXY.put("IRIS_313-10057", new double[] { -0.209676424844119, 0.0118584355063345 });
		mapIrisid2MdsXY.put("IRIS_313-10059", new double[] { -0.203724124156499, 0.0118062673097016 });
		mapIrisid2MdsXY.put("IRIS_313-10061", new double[] { -0.165052738959306, 0.00339375761318904 });
		mapIrisid2MdsXY.put("IRIS_313-10062", new double[] { -0.193933506660873, 0.00953146342578472 });
		mapIrisid2MdsXY.put("IRIS_313-10065", new double[] { -0.181615151648076, 0.0196997256405517 });
		mapIrisid2MdsXY.put("IRIS_313-10067", new double[] { -0.178275667478455, 0.0194403211605486 });
		mapIrisid2MdsXY.put("IRIS_313-10071", new double[] { -0.179678453498395, 0.0183542029072323 });
		mapIrisid2MdsXY.put("IRIS_313-10073", new double[] { -0.174669180473839, 0.0209803838637766 });
		mapIrisid2MdsXY.put("IRIS_313-10074", new double[] { -0.176427810572636, 0.0193297121182387 });
		mapIrisid2MdsXY.put("IRIS_313-10075", new double[] { -0.183054886691415, 0.0196039832443497 });
		mapIrisid2MdsXY.put("IRIS_313-10076", new double[] { -0.176809356353351, 0.0189034254527215 });
		mapIrisid2MdsXY.put("IRIS_313-10077", new double[] { 0.106180112027498, 0.0152697267007279 });
		mapIrisid2MdsXY.put("IRIS_313-10078", new double[] { -0.177784997759443, 0.0198305155314171 });
		mapIrisid2MdsXY.put("IRIS_313-10079", new double[] { -0.178602128440428, 0.0196005618523196 });
		mapIrisid2MdsXY.put("IRIS_313-10080", new double[] { -0.175467021924638, 0.0206783391848982 });
		mapIrisid2MdsXY.put("IRIS_313-10082", new double[] { -0.183187230630002, 0.0182645860777156 });
		mapIrisid2MdsXY.put("IRIS_313-10083", new double[] { -0.206682339176757, 0.0110807915185353 });
		mapIrisid2MdsXY.put("IRIS_313-10084", new double[] { -0.206475536126226, 0.0116786555125669 });
		mapIrisid2MdsXY.put("IRIS_313-10089", new double[] { -0.209121988020523, 0.00940394537508078 });
		mapIrisid2MdsXY.put("IRIS_313-10092", new double[] { -0.207742387025455, 0.010657868752537 });
		mapIrisid2MdsXY.put("IRIS_313-10093", new double[] { -0.210185928849399, 0.012137293016084 });
		mapIrisid2MdsXY.put("IRIS_313-10094", new double[] { -0.176232790521229, 0.0196868460474659 });
		mapIrisid2MdsXY.put("IRIS_313-10096", new double[] { -0.183675463506177, 0.0183260494487183 });
		mapIrisid2MdsXY.put("IRIS_313-10097", new double[] { -0.209744585928382, 0.00915467202136128 });
		mapIrisid2MdsXY.put("IRIS_313-10099", new double[] { -0.184260272795993, 0.0113591132267336 });
		mapIrisid2MdsXY.put("IRIS_313-10102", new double[] { 0.0819591408503016, -0.0449545070905313 });
		mapIrisid2MdsXY.put("IRIS_313-10103", new double[] { 0.070852132341685, 0.0107473660998541 });
		mapIrisid2MdsXY.put("IRIS_313-10109", new double[] { 0.102125299198931, 0.0262377009020171 });
		mapIrisid2MdsXY.put("IRIS_313-10111", new double[] { -0.201261807992877, 0.0136049471077522 });
		mapIrisid2MdsXY.put("IRIS_313-10113", new double[] { 0.0932651334664321, 0.0274152123510195 });
		mapIrisid2MdsXY.put("IRIS_313-10114", new double[] { 0.053561795996909, -0.0525320367762681 });
		mapIrisid2MdsXY.put("IRIS_313-10119", new double[] { -0.205747749903792, 0.013965645850468 });
		mapIrisid2MdsXY.put("IRIS_313-10124", new double[] { -0.209438842552532, 0.00882151243857873 });
		mapIrisid2MdsXY.put("IRIS_313-10129", new double[] { 0.093054923152231, 0.0148847325174744 });
		mapIrisid2MdsXY.put("IRIS_313-10134", new double[] { 0.107017056439451, 0.0243095914666634 });
		mapIrisid2MdsXY.put("IRIS_313-10147", new double[] { 0.107724090106296, 0.0279678798666441 });
		mapIrisid2MdsXY.put("IRIS_313-10148", new double[] { 0.0967277111680297, 0.0160308770042655 });
		mapIrisid2MdsXY.put("IRIS_313-10150", new double[] { 0.0279079849211322, -0.155224730126284 });
		mapIrisid2MdsXY.put("IRIS_313-10151", new double[] { 0.104903290744698, 0.0276953378903827 });
		mapIrisid2MdsXY.put("IRIS_313-10152", new double[] { -0.188246718241588, 0.00771831108221367 });
		mapIrisid2MdsXY.put("IRIS_313-10154", new double[] { 0.0989942229656366, 0.0234888385618 });
		mapIrisid2MdsXY.put("IRIS_313-10158", new double[] { 0.0555524294571524, 0.0171308732479966 });
		mapIrisid2MdsXY.put("IRIS_313-10161", new double[] { 0.101374666011886, 0.0310307809100128 });
		mapIrisid2MdsXY.put("IRIS_313-10164", new double[] { -0.210311375814989, 0.0129848843258026 });
		mapIrisid2MdsXY.put("IRIS_313-10167", new double[] { 0.103110443025117, 0.0187988078036099 });
		mapIrisid2MdsXY.put("IRIS_313-10168", new double[] { 0.102981717464296, 0.0221147531111909 });
		mapIrisid2MdsXY.put("IRIS_313-10170", new double[] { 0.0982559934736099, 0.0208315806394838 });
		mapIrisid2MdsXY.put("IRIS_313-10171", new double[] { 0.0880502061528711, 0.0221221998170977 });
		mapIrisid2MdsXY.put("IRIS_313-10176", new double[] { -0.196142581749381, 0.00855506882129619 });
		mapIrisid2MdsXY.put("IRIS_313-10177", new double[] { 0.100724239180868, 0.0206447564152857 });
		mapIrisid2MdsXY.put("IRIS_313-10178", new double[] { 0.0857771267649074, 0.0112140422246698 });
		mapIrisid2MdsXY.put("IRIS_313-10179", new double[] { 0.104840019632946, 0.0211413860518453 });
		mapIrisid2MdsXY.put("IRIS_313-10189", new double[] { 0.0932366037827782, 0.0206529669440725 });
		mapIrisid2MdsXY.put("IRIS_313-10190", new double[] { 0.0904593486399312, 0.00897655412159905 });
		mapIrisid2MdsXY.put("IRIS_313-10191", new double[] { 0.0968078734948045, 0.0210658951639695 });
		mapIrisid2MdsXY.put("IRIS_313-10196", new double[] { -0.175937980056818, 0.00825737211189125 });
		mapIrisid2MdsXY.put("IRIS_313-10211", new double[] { 0.101586077829687, 0.0151995514353874 });
		mapIrisid2MdsXY.put("IRIS_313-10220", new double[] { 0.0977125432251169, 0.0193253790767577 });
		mapIrisid2MdsXY.put("IRIS_313-10221", new double[] { 0.0988903702974158, 0.0237788330252314 });
		mapIrisid2MdsXY.put("IRIS_313-10224", new double[] { 0.101079984335218, 0.0150106704228804 });
		mapIrisid2MdsXY.put("IRIS_313-10226", new double[] { 0.0888524429354079, 0.0210024226451903 });
		mapIrisid2MdsXY.put("IRIS_313-10228", new double[] { -0.193357676268471, 0.0104015048388186 });
		mapIrisid2MdsXY.put("IRIS_313-10234", new double[] { 0.095079798340358, 0.0267211922403411 });
		mapIrisid2MdsXY.put("IRIS_313-10235", new double[] { 0.105163947496251, 0.0189410830669474 });
		mapIrisid2MdsXY.put("IRIS_313-10237", new double[] { 0.100166782014665, 0.0219829748402033 });
		mapIrisid2MdsXY.put("IRIS_313-10238", new double[] { 0.0978791106828116, 0.0224084912951544 });
		mapIrisid2MdsXY.put("IRIS_313-10239", new double[] { 0.0937041075485945, 0.0173098011040823 });
		mapIrisid2MdsXY.put("IRIS_313-10242", new double[] { -0.2042044479089, 0.0115768112966936 });
		mapIrisid2MdsXY.put("IRIS_313-10247", new double[] { 0.0801237152879431, 0.0306462806700317 });
		mapIrisid2MdsXY.put("IRIS_313-10257", new double[] { 0.0783564223069883, 0.027193669460883 });
		mapIrisid2MdsXY.put("IRIS_313-10258", new double[] { -0.206402934293932, 0.00639193831781805 });
		mapIrisid2MdsXY.put("IRIS_313-10260", new double[] { 0.0968131678303237, 0.0194880110165436 });
		mapIrisid2MdsXY.put("IRIS_313-10263", new double[] { 0.0462779565249602, 0.0236041685446652 });
		mapIrisid2MdsXY.put("IRIS_313-10268", new double[] { 0.0473691891522968, 0.0348993226364721 });
		mapIrisid2MdsXY.put("IRIS_313-10271", new double[] { 0.097583840238741, 0.0295991077864338 });
		mapIrisid2MdsXY.put("IRIS_313-10272", new double[] { -0.122963884750549, 0.0308784081702843 });
		mapIrisid2MdsXY.put("IRIS_313-10274", new double[] { 0.078871478661872, 0.0318301870776149 });
		mapIrisid2MdsXY.put("IRIS_313-10275", new double[] { 0.0894081618461847, 0.0294329951764383 });
		mapIrisid2MdsXY.put("IRIS_313-10279", new double[] { 0.109498326020215, 0.0330453322741916 });
		mapIrisid2MdsXY.put("IRIS_313-10285", new double[] { 0.0757488900134881, 0.0236611191634701 });
		mapIrisid2MdsXY.put("IRIS_313-10287", new double[] { 0.066106071641719, 0.0305679914935097 });
		mapIrisid2MdsXY.put("IRIS_313-10289", new double[] { 0.0930435762386668, 0.0232841086924468 });
		mapIrisid2MdsXY.put("IRIS_313-10290", new double[] { 0.103293497711626, 0.0173472390535603 });
		mapIrisid2MdsXY.put("IRIS_313-10293", new double[] { 0.0832329374581316, 0.029440206440752 });
		mapIrisid2MdsXY.put("IRIS_313-10294", new double[] { 0.0935748357052702, 0.0187350142099201 });
		mapIrisid2MdsXY.put("IRIS_313-10295", new double[] { -0.174169867374169, -0.0321024959704365 });
		mapIrisid2MdsXY.put("IRIS_313-10298", new double[] { 0.091576358581812, 0.0205222013974572 });
		mapIrisid2MdsXY.put("IRIS_313-10300", new double[] { 0.0526576607345463, 0.028641520106873 });
		mapIrisid2MdsXY.put("IRIS_313-10301", new double[] { 0.0571425514889958, 0.0360796366773181 });
		mapIrisid2MdsXY.put("IRIS_313-10307", new double[] { 0.109164530471204, 0.0279660339017624 });
		mapIrisid2MdsXY.put("IRIS_313-10314", new double[] { 0.0984922669833623, 0.0315772732755866 });
		mapIrisid2MdsXY.put("IRIS_313-10318", new double[] { 0.0568675836634469, 0.0224559583055921 });
		mapIrisid2MdsXY.put("IRIS_313-10325", new double[] { 0.0617795574540821, 0.0244570569391528 });
		mapIrisid2MdsXY.put("IRIS_313-10327", new double[] { -0.187905122218757, 0.0134380392094193 });
		mapIrisid2MdsXY.put("IRIS_313-10332", new double[] { 0.105737629327507, 0.0250171209341948 });
		mapIrisid2MdsXY.put("IRIS_313-10333", new double[] { 0.0876476177456195, 0.0220366187432015 });
		mapIrisid2MdsXY.put("IRIS_313-10334", new double[] { 0.0793897911523593, 0.0243552885319253 });
		mapIrisid2MdsXY.put("IRIS_313-10336", new double[] { -0.184631660725721, 0.00916571035979627 });
		mapIrisid2MdsXY.put("IRIS_313-10337", new double[] { 0.0906088296555609, 0.0279209369369585 });
		mapIrisid2MdsXY.put("IRIS_313-10340", new double[] { 0.103678037379318, 0.0188232178064779 });
		mapIrisid2MdsXY.put("IRIS_313-10341", new double[] { 0.0929396848745319, 0.0218116677506858 });
		mapIrisid2MdsXY.put("IRIS_313-10348", new double[] { 0.0817882236771991, 0.00195796423663437 });
		mapIrisid2MdsXY.put("IRIS_313-10349", new double[] { 0.094099537477896, 0.00990884893544175 });
		mapIrisid2MdsXY.put("IRIS_313-10352", new double[] { 0.0753964264288394, 0.0108636804446914 });
		mapIrisid2MdsXY.put("IRIS_313-10353", new double[] { 0.0859878286886267, 0.0188355386752972 });
		mapIrisid2MdsXY.put("IRIS_313-10355", new double[] { 0.0946164991873158, 0.0127525159889791 });
		mapIrisid2MdsXY.put("IRIS_313-10357", new double[] { 0.101084131944572, 0.0164481666471595 });
		mapIrisid2MdsXY.put("IRIS_313-10359", new double[] { 0.0877914646706933, -0.0388230767507604 });
		mapIrisid2MdsXY.put("IRIS_313-10360", new double[] { 0.0956324036354085, 0.0167204259643274 });
		mapIrisid2MdsXY.put("IRIS_313-10361", new double[] { 0.109137961221709, 0.0027852734447507 });
		mapIrisid2MdsXY.put("IRIS_313-10366", new double[] { 0.100169830441257, -0.0189380329904421 });
		mapIrisid2MdsXY.put("IRIS_313-10371", new double[] { 0.0869335169731347, -0.0193927046353935 });
		mapIrisid2MdsXY.put("IRIS_313-10373", new double[] { -0.207986491540045, 0.0114196858917903 });
		mapIrisid2MdsXY.put("IRIS_313-10374", new double[] { 0.086713585602839, 0.0235254195249044 });
		mapIrisid2MdsXY.put("IRIS_313-10375", new double[] { 0.0900750843705825, -0.0242283427106723 });
		mapIrisid2MdsXY.put("IRIS_313-10379", new double[] { -0.210235282927438, 0.0106708652622294 });
		mapIrisid2MdsXY.put("IRIS_313-10380", new double[] { 0.0255257483219397, -0.128989060906519 });
		mapIrisid2MdsXY.put("IRIS_313-10385", new double[] { 0.0947761193987813, 0.0165101542215904 });
		mapIrisid2MdsXY.put("IRIS_313-10392", new double[] { 0.0914496388847072, 0.0233739345396617 });
		mapIrisid2MdsXY.put("IRIS_313-10394", new double[] { 0.0898093163724606, 0.024516616811858 });
		mapIrisid2MdsXY.put("IRIS_313-10396", new double[] { 0.0893479733200631, 0.0229984222826528 });
		mapIrisid2MdsXY.put("IRIS_313-10397", new double[] { 0.101128385451373, 0.0266211239507145 });
		mapIrisid2MdsXY.put("IRIS_313-10398", new double[] { 0.0995241453852746, 0.0295721617310899 });
		mapIrisid2MdsXY.put("IRIS_313-10399", new double[] { 0.10036176517144, 0.0313743970559557 });
		mapIrisid2MdsXY.put("IRIS_313-10400", new double[] { 0.0843695305696262, 0.0357293159091233 });
		mapIrisid2MdsXY.put("IRIS_313-10401", new double[] { 0.0944908513337426, 0.0315396472531464 });
		mapIrisid2MdsXY.put("IRIS_313-10402", new double[] { 0.101844317919362, 0.0250793053554904 });
		mapIrisid2MdsXY.put("IRIS_313-10403", new double[] { 0.106688271291039, 0.0313177299914161 });
		mapIrisid2MdsXY.put("IRIS_313-10404", new double[] { 0.101734469632147, 0.01962627476562 });
		mapIrisid2MdsXY.put("IRIS_313-10412", new double[] { 0.0940128451307654, 0.02418940231165 });
		mapIrisid2MdsXY.put("IRIS_313-10417", new double[] { 0.102287453138847, 0.0329757378192509 });
		mapIrisid2MdsXY.put("IRIS_313-10421", new double[] { 0.102540074291871, 0.0252689536628358 });
		mapIrisid2MdsXY.put("IRIS_313-10422", new double[] { 0.0965171723170313, 0.018501320240375 });
		mapIrisid2MdsXY.put("IRIS_313-10423", new double[] { 0.0871693295892031, 0.0298822306933822 });
		mapIrisid2MdsXY.put("IRIS_313-10428", new double[] { 0.0963922576989102, 0.0263759682170992 });
		mapIrisid2MdsXY.put("IRIS_313-10429", new double[] { -0.209129604370201, 0.011947782868175 });
		mapIrisid2MdsXY.put("IRIS_313-10430", new double[] { -0.209125421784692, 0.0130779575941574 });
		mapIrisid2MdsXY.put("IRIS_313-10433", new double[] { 0.102309078030646, 0.0198580720082947 });
		mapIrisid2MdsXY.put("IRIS_313-10437", new double[] { -0.209724670724872, 0.0134484134975806 });
		mapIrisid2MdsXY.put("IRIS_313-10440", new double[] { -0.199303697547122, 0.0133290407128333 });
		mapIrisid2MdsXY.put("IRIS_313-10441", new double[] { 0.0752545237116411, 0.0272313096705418 });
		mapIrisid2MdsXY.put("IRIS_313-10444", new double[] { -0.0869705126206408, 0.0505757270595772 });
		mapIrisid2MdsXY.put("IRIS_313-10448", new double[] { 0.0998534959215656, 0.0180273960013669 });
		mapIrisid2MdsXY.put("IRIS_313-10449", new double[] { 0.0458486897865318, 0.0253708136863103 });
		mapIrisid2MdsXY.put("IRIS_313-10450", new double[] { 0.0829717343744785, 0.0212513078077705 });
		mapIrisid2MdsXY.put("IRIS_313-10452", new double[] { 0.091322183673729, 0.0243785770548334 });
		mapIrisid2MdsXY.put("IRIS_313-10453", new double[] { -0.199810011083913, 0.0102611718024258 });
		mapIrisid2MdsXY.put("IRIS_313-10458", new double[] { 0.0992926732316477, 0.0148974139972819 });
		mapIrisid2MdsXY.put("IRIS_313-10459", new double[] { -0.150688159876095, 0.0172656574644513 });
		mapIrisid2MdsXY.put("IRIS_313-10469", new double[] { -0.210323224013618, 0.0114881262580533 });
		mapIrisid2MdsXY.put("IRIS_313-10476", new double[] { 0.102737152856379, -0.0167123407208301 });
		mapIrisid2MdsXY.put("IRIS_313-10477", new double[] { 0.085064518657369, 0.022564446825574 });
		mapIrisid2MdsXY.put("IRIS_313-10480", new double[] { 0.107535974751494, 0.0189841911019507 });
		mapIrisid2MdsXY.put("IRIS_313-10484", new double[] { -0.0225711274680057, 0.0348169557765123 });
		mapIrisid2MdsXY.put("IRIS_313-10485", new double[] { -0.187880469129473, 0.0124849095486995 });
		mapIrisid2MdsXY.put("IRIS_313-10489", new double[] { -0.184921116847761, 0.00876059916775293 });
		mapIrisid2MdsXY.put("IRIS_313-10497", new double[] { 0.0856741262069282, 0.0257392876129678 });
		mapIrisid2MdsXY.put("IRIS_313-10502", new double[] { 0.0934474391646555, 0.0137850078905523 });
		mapIrisid2MdsXY.put("IRIS_313-10503", new double[] { 0.0933678224001408, 0.0221507584909952 });
		mapIrisid2MdsXY.put("IRIS_313-10504", new double[] { 0.0922105480311086, 0.0157468769459468 });
		mapIrisid2MdsXY.put("IRIS_313-10506", new double[] { 0.104713674200372, 0.0264441009307955 });
		mapIrisid2MdsXY.put("IRIS_313-10507", new double[] { -0.178540741892084, 0.0193082926363025 });
		mapIrisid2MdsXY.put("IRIS_313-10509", new double[] { 0.106513611317922, 0.023615700249105 });
		mapIrisid2MdsXY.put("IRIS_313-10510", new double[] { 0.0688405216152671, 0.0211804388134475 });
		mapIrisid2MdsXY.put("IRIS_313-10511", new double[] { 0.110884113406543, 0.0196178729315815 });
		mapIrisid2MdsXY.put("IRIS_313-10513", new double[] { 0.0898613478685728, 0.0247084342091699 });
		mapIrisid2MdsXY.put("IRIS_313-10514", new double[] { 0.106650714299748, 0.0175867830597539 });
		mapIrisid2MdsXY.put("IRIS_313-10515", new double[] { 0.0980182821129438, 0.0195035328603376 });
		mapIrisid2MdsXY.put("IRIS_313-10516", new double[] { 0.102216531908312, 0.00768487144107024 });
		mapIrisid2MdsXY.put("IRIS_313-10517", new double[] { 0.100122194628405, 0.0221616642043279 });
		mapIrisid2MdsXY.put("IRIS_313-10518", new double[] { 0.0992754238802668, 0.0236634445805334 });
		mapIrisid2MdsXY.put("IRIS_313-10519", new double[] { 0.107315559806428, -0.0220076935775271 });
		mapIrisid2MdsXY.put("IRIS_313-10520", new double[] { 0.101394385214004, 0.00954494845323661 });
		mapIrisid2MdsXY.put("IRIS_313-10521", new double[] { -0.119482084425252, -0.0429481306234781 });
		mapIrisid2MdsXY.put("IRIS_313-10522", new double[] { -0.0491856960193995, 0.0203260521144573 });
		mapIrisid2MdsXY.put("IRIS_313-10523", new double[] { 0.0936664649030069, -0.0122679253509893 });
		mapIrisid2MdsXY.put("IRIS_313-10524", new double[] { 0.107334198013091, 0.0250368423308763 });
		mapIrisid2MdsXY.put("IRIS_313-10525", new double[] { 0.103220471863008, 0.0211527885572584 });
		mapIrisid2MdsXY.put("IRIS_313-10526", new double[] { 0.0988191865383132, -0.00350382564957098 });
		mapIrisid2MdsXY.put("IRIS_313-10527", new double[] { 0.0954214688409686, -0.0186879870822095 });
		mapIrisid2MdsXY.put("IRIS_313-10531", new double[] { 0.0075805543605555, -0.0206271618963928 });
		mapIrisid2MdsXY.put("IRIS_313-10534", new double[] { 0.0458786611881177, -0.180496549210017 });
		mapIrisid2MdsXY.put("IRIS_313-10536", new double[] { 0.0878914179125472, -0.0278005450582474 });
		mapIrisid2MdsXY.put("IRIS_313-10537", new double[] { -0.127638587423277, -0.01694101001969 });
		mapIrisid2MdsXY.put("IRIS_313-10539", new double[] { 0.0825028852776863, 0.00872778851744741 });
		mapIrisid2MdsXY.put("IRIS_313-10541", new double[] { -0.187043167825018, 0.0103684260785548 });
		mapIrisid2MdsXY.put("IRIS_313-10542", new double[] { 0.098067906686057, -0.0117838700579207 });
		mapIrisid2MdsXY.put("IRIS_313-10543", new double[] { 0.0219806188752472, -0.177676710626581 });
		mapIrisid2MdsXY.put("IRIS_313-10544", new double[] { 0.108495272871976, -0.0129551852193402 });
		mapIrisid2MdsXY.put("IRIS_313-10545", new double[] { 0.0323335380781377, -0.156327979882118 });
		mapIrisid2MdsXY.put("IRIS_313-10547", new double[] { 0.108038057253524, 0.00781664131669141 });
		mapIrisid2MdsXY.put("IRIS_313-10549", new double[] { 0.0240316219212107, -0.163096992886918 });
		mapIrisid2MdsXY.put("IRIS_313-10550", new double[] { 0.109567783689895, 0.0167928479240409 });
		mapIrisid2MdsXY.put("IRIS_313-10552", new double[] { -0.190435205651178, 0.0122680327697879 });
		mapIrisid2MdsXY.put("IRIS_313-10554", new double[] { 0.108365210504741, 0.018477261641195 });
		mapIrisid2MdsXY.put("IRIS_313-10555", new double[] { 0.102424855635759, 0.0279694733749091 });
		mapIrisid2MdsXY.put("IRIS_313-10556", new double[] { 0.102048157876286, 0.0242815454756601 });
		mapIrisid2MdsXY.put("IRIS_313-10557", new double[] { 0.106151013355472, 0.0208642441700891 });
		mapIrisid2MdsXY.put("IRIS_313-10558", new double[] { -0.206135747394085, 0.0106654074997718 });
		mapIrisid2MdsXY.put("IRIS_313-10559", new double[] { -0.206762350738986, 0.0129776805101899 });
		mapIrisid2MdsXY.put("IRIS_313-10560", new double[] { 0.0912062485031189, 0.018920778248474 });
		mapIrisid2MdsXY.put("IRIS_313-10561", new double[] { 0.0983513413399786, 0.0165391287190666 });
		mapIrisid2MdsXY.put("IRIS_313-10562", new double[] { -0.156326270238337, 0.00482495111704506 });
		mapIrisid2MdsXY.put("IRIS_313-10563", new double[] { -0.209803772864911, 0.00626183447972786 });
		mapIrisid2MdsXY.put("IRIS_313-10564", new double[] { -0.206703206119385, 0.0141203041579134 });
		mapIrisid2MdsXY.put("IRIS_313-10565", new double[] { 0.100909938302191, 0.0240424164611679 });
		mapIrisid2MdsXY.put("IRIS_313-10566", new double[] { 0.102789765688927, 0.0240999641316481 });
		mapIrisid2MdsXY.put("IRIS_313-10567", new double[] { -0.208759552066563, 0.011678675128162 });
		mapIrisid2MdsXY.put("IRIS_313-10568", new double[] { -0.209201302803598, 0.0108082149779504 });
		mapIrisid2MdsXY.put("IRIS_313-10569", new double[] { -0.209511246243274, 0.0122355300674139 });
		mapIrisid2MdsXY.put("IRIS_313-10570", new double[] { -0.209503933469147, 0.0129749489913465 });
		mapIrisid2MdsXY.put("IRIS_313-10572", new double[] { 0.088977520810939, 0.00946864776348614 });
		mapIrisid2MdsXY.put("IRIS_313-10573", new double[] { 0.101701869959827, 0.0125052424212705 });
		mapIrisid2MdsXY.put("IRIS_313-10574", new double[] { 0.0982195058905821, 0.0113593111602349 });
		mapIrisid2MdsXY.put("IRIS_313-10575", new double[] { 0.0885195606937905, 0.0264704777780812 });
		mapIrisid2MdsXY.put("IRIS_313-10576", new double[] { 0.114745220336078, -0.00272364617712467 });
		mapIrisid2MdsXY.put("IRIS_313-10577", new double[] { -0.193035910695277, 0.00552536584593162 });
		mapIrisid2MdsXY.put("IRIS_313-10578", new double[] { -0.183920700647919, 0.00624326891676079 });
		mapIrisid2MdsXY.put("IRIS_313-10580", new double[] { -0.185639999856034, 0.00507289150843321 });
		mapIrisid2MdsXY.put("IRIS_313-10581", new double[] { -0.186200807644758, 0.00912652676632096 });
		mapIrisid2MdsXY.put("IRIS_313-10582", new double[] { -0.195678312633144, 0.00577435079220926 });
		mapIrisid2MdsXY.put("IRIS_313-10583", new double[] { -0.207587428436637, 0.013096311589124 });
		mapIrisid2MdsXY.put("IRIS_313-10585", new double[] { -0.0337827741137102, 0.035577968735556 });
		mapIrisid2MdsXY.put("IRIS_313-10587", new double[] { 0.029301810977197, -0.173909671109139 });
		mapIrisid2MdsXY.put("IRIS_313-10592", new double[] { 0.0256228517435368, -0.179021618097918 });
		mapIrisid2MdsXY.put("IRIS_313-10593", new double[] { 0.027267966028077, -0.175650819902771 });
		mapIrisid2MdsXY.put("IRIS_313-10594", new double[] { 0.030387320391772, -0.170137027468679 });
		mapIrisid2MdsXY.put("IRIS_313-10595", new double[] { 0.024963891422892, -0.174220562194551 });
		mapIrisid2MdsXY.put("IRIS_313-10598", new double[] { 0.0317466186616226, -0.180719066929596 });
		mapIrisid2MdsXY.put("IRIS_313-10600", new double[] { 0.0260366305843744, -0.169378461400543 });
		mapIrisid2MdsXY.put("IRIS_313-10602", new double[] { 0.0438227624280897, -0.170447994214721 });
		mapIrisid2MdsXY.put("IRIS_313-10603", new double[] { 0.0436649798313012, -0.188583293634552 });
		mapIrisid2MdsXY.put("IRIS_313-10604", new double[] { 0.0304541377151827, -0.173334099281795 });
		mapIrisid2MdsXY.put("IRIS_313-10605", new double[] { 0.0452358997858603, -0.1794417374147 });
		mapIrisid2MdsXY.put("IRIS_313-10606", new double[] { 0.0206124858880586, -0.170083021282535 });
		mapIrisid2MdsXY.put("IRIS_313-10608", new double[] { 0.0131339239817611, -0.170958248480223 });
		mapIrisid2MdsXY.put("IRIS_313-10609", new double[] { 0.0885079095924406, -0.0272309084678873 });
		mapIrisid2MdsXY.put("IRIS_313-10610", new double[] { 0.104385081373618, -0.00998561861509814 });
		mapIrisid2MdsXY.put("IRIS_313-10614", new double[] { 0.0811901310753836, 0.0159518142616638 });
		mapIrisid2MdsXY.put("IRIS_313-10617", new double[] { -0.20921984252848, 0.00567527399696593 });
		mapIrisid2MdsXY.put("IRIS_313-10618", new double[] { -0.210290102525898, 0.0119951024955043 });
		mapIrisid2MdsXY.put("IRIS_313-10619", new double[] { -0.190877633611965, 0.00839054028476138 });
		mapIrisid2MdsXY.put("IRIS_313-10620", new double[] { -0.187028881920646, 0.00826906417917019 });
		mapIrisid2MdsXY.put("IRIS_313-10623", new double[] { 0.050656206495439, -0.177748815878947 });
		mapIrisid2MdsXY.put("IRIS_313-10628", new double[] { 0.107095786136446, 0.00523579905010103 });
		mapIrisid2MdsXY.put("IRIS_313-10631", new double[] { -0.208638966773199, 0.0126922536725527 });
		mapIrisid2MdsXY.put("IRIS_313-10640", new double[] { 0.0923413335570543, 0.00541564463409855 });
		mapIrisid2MdsXY.put("IRIS_313-10642", new double[] { -0.20871363886361, 0.0114419549345903 });
		mapIrisid2MdsXY.put("IRIS_313-10644", new double[] { -0.19239104580144, 0.00448283722142619 });
		mapIrisid2MdsXY.put("IRIS_313-10645", new double[] { -0.196636382672072, 0.00651626900978485 });
		mapIrisid2MdsXY.put("IRIS_313-10648", new double[] { 0.104369190628976, 0.025364774488563 });
		mapIrisid2MdsXY.put("IRIS_313-10649", new double[] { -0.174672337567417, 0.0142667921797136 });
		mapIrisid2MdsXY.put("IRIS_313-10650", new double[] { 0.103078531322271, 0.0231202184887205 });
		mapIrisid2MdsXY.put("IRIS_313-10651", new double[] { 0.0947600828801835, 0.0232973706685948 });
		mapIrisid2MdsXY.put("IRIS_313-10652", new double[] { 0.107843007788496, 0.0222988280326855 });
		mapIrisid2MdsXY.put("IRIS_313-10653", new double[] { -0.192175524193646, 0.0106355222847505 });
		mapIrisid2MdsXY.put("IRIS_313-10654", new double[] { 0.0990019146552619, 0.0135446770580238 });
		mapIrisid2MdsXY.put("IRIS_313-10655", new double[] { 0.0971747514130901, 0.0106120255780939 });
		mapIrisid2MdsXY.put("IRIS_313-10656", new double[] { -0.193231582924286, 0.0120864627684878 });
		mapIrisid2MdsXY.put("IRIS_313-10657", new double[] { -0.194037209161197, 0.00968281674715669 });
		mapIrisid2MdsXY.put("IRIS_313-10659", new double[] { 0.0965030618154367, 0.025632590031764 });
		mapIrisid2MdsXY.put("IRIS_313-10660", new double[] { -0.196655057195752, 0.0121922464035544 });
		mapIrisid2MdsXY.put("IRIS_313-10661", new double[] { 0.0969838488912222, -0.0114714635366036 });
		mapIrisid2MdsXY.put("IRIS_313-10662", new double[] { 0.102349155389515, -0.0240370793794456 });
		mapIrisid2MdsXY.put("IRIS_313-10664", new double[] { 0.111476146206928, -0.0077772830929461 });
		mapIrisid2MdsXY.put("IRIS_313-10666", new double[] { 0.106853618567829, 0.0208327132961109 });
		mapIrisid2MdsXY.put("IRIS_313-10667", new double[] { 0.0967335223013939, -0.0162699050159009 });
		mapIrisid2MdsXY.put("IRIS_313-10668", new double[] { 0.106833648885386, 0.000305345985475474 });
		mapIrisid2MdsXY.put("IRIS_313-10670", new double[] { -0.142104592249949, -0.0317753000343996 });
		mapIrisid2MdsXY.put("IRIS_313-10671", new double[] { 0.0849947572694968, -0.0272449098096451 });
		mapIrisid2MdsXY.put("IRIS_313-10673", new double[] { 0.0474445328560735, -0.176746714774225 });
		mapIrisid2MdsXY.put("IRIS_313-10674", new double[] { 0.10113496569497, 0.0172106655417138 });
		mapIrisid2MdsXY.put("IRIS_313-10675", new double[] { 0.0999033163565366, -0.00798378052655031 });
		mapIrisid2MdsXY.put("IRIS_313-10676", new double[] { 0.0728673365503957, -0.0574659677531639 });
		mapIrisid2MdsXY.put("IRIS_313-10677", new double[] { -0.209906098439105, 0.0122690359838947 });
		mapIrisid2MdsXY.put("IRIS_313-10678", new double[] { 0.109059883443251, -0.00274671455260804 });
		mapIrisid2MdsXY.put("IRIS_313-10679", new double[] { -0.197572126803294, 0.00826281746766909 });
		mapIrisid2MdsXY.put("IRIS_313-10680", new double[] { 0.0975790695241918, 0.0247362812426083 });
		mapIrisid2MdsXY.put("IRIS_313-10681", new double[] { 0.0921694571027346, 0.0274606019248969 });
		mapIrisid2MdsXY.put("IRIS_313-10682", new double[] { 0.101320677407958, 0.0208524547350753 });
		mapIrisid2MdsXY.put("IRIS_313-10683", new double[] { 0.0992494352943249, 0.0213043366156861 });
		mapIrisid2MdsXY.put("IRIS_313-10684", new double[] { 0.0947934365874402, 0.0222081116462537 });
		mapIrisid2MdsXY.put("IRIS_313-10687", new double[] { 0.101536393902498, 0.0249471888112185 });
		mapIrisid2MdsXY.put("IRIS_313-10688", new double[] { 0.104159757712825, 0.0288121429847947 });
		mapIrisid2MdsXY.put("IRIS_313-10689", new double[] { -0.178607437588578, 0.0104357487059361 });
		mapIrisid2MdsXY.put("IRIS_313-10690", new double[] { 0.0551612390695145, 0.0351907577031525 });
		mapIrisid2MdsXY.put("IRIS_313-10692", new double[] { 0.0996102556544691, 0.024312308624375 });
		mapIrisid2MdsXY.put("IRIS_313-10693", new double[] { -0.179776063371942, 0.00933594812310183 });
		mapIrisid2MdsXY.put("IRIS_313-10694", new double[] { 0.0954280408715487, 0.0298598160667778 });
		mapIrisid2MdsXY.put("IRIS_313-10695", new double[] { 0.105648405472886, 0.0273227829943373 });
		mapIrisid2MdsXY.put("IRIS_313-10697", new double[] { 0.0998225162333156, 0.0226518322716954 });
		mapIrisid2MdsXY.put("IRIS_313-10698", new double[] { 0.1062908696154, 0.0233351813263501 });
		mapIrisid2MdsXY.put("IRIS_313-10699", new double[] { 0.098823803608682, 0.0243795209202509 });
		mapIrisid2MdsXY.put("IRIS_313-10700", new double[] { 0.0924485133090361, 0.0257924859880018 });
		mapIrisid2MdsXY.put("IRIS_313-10701", new double[] { 0.101257408705007, 0.0244538006795914 });
		mapIrisid2MdsXY.put("IRIS_313-10702", new double[] { 0.0979651450101737, 0.0273676703523638 });
		mapIrisid2MdsXY.put("IRIS_313-10703", new double[] { -0.180425384672207, 0.00537359765379589 });
		mapIrisid2MdsXY.put("IRIS_313-10704", new double[] { -0.182447633163951, 0.00723092397170707 });
		mapIrisid2MdsXY.put("IRIS_313-10705", new double[] { 0.0326071251272829, 0.0155098049063244 });
		mapIrisid2MdsXY.put("IRIS_313-10706", new double[] { 0.108087414487608, 0.0198036013707221 });
		mapIrisid2MdsXY.put("IRIS_313-10707", new double[] { 0.103736625649856, 0.0231649969114568 });
		mapIrisid2MdsXY.put("IRIS_313-10708", new double[] { -0.187605222819696, 0.0141318861643621 });
		mapIrisid2MdsXY.put("IRIS_313-10710", new double[] { -0.188028647603104, 0.0128516674997823 });
		mapIrisid2MdsXY.put("IRIS_313-10711", new double[] { -0.187058364577065, 0.0102376783276002 });
		mapIrisid2MdsXY.put("IRIS_313-10712", new double[] { -0.193675654294558, 0.0062426764493453 });
		mapIrisid2MdsXY.put("IRIS_313-10715", new double[] { 0.0866463293553666, -0.0145492002882113 });
		mapIrisid2MdsXY.put("IRIS_313-10716", new double[] { 0.101952360838906, -0.0149026708198529 });
		mapIrisid2MdsXY.put("IRIS_313-10717", new double[] { 0.109793162746866, -0.0339389562271806 });
		mapIrisid2MdsXY.put("IRIS_313-10718", new double[] { -0.022309235927312, -0.164428671484666 });
		mapIrisid2MdsXY.put("IRIS_313-10719", new double[] { 0.097947813992549, -0.0125700536610816 });
		mapIrisid2MdsXY.put("IRIS_313-10720", new double[] { 0.0734058051280255, 0.0128121540296588 });
		mapIrisid2MdsXY.put("IRIS_313-10721", new double[] { 0.0958308400493827, -0.0139881583064943 });
		mapIrisid2MdsXY.put("IRIS_313-10722", new double[] { -0.186642240091627, 0.00556431226507059 });
		mapIrisid2MdsXY.put("IRIS_313-10723", new double[] { 0.0955720060566444, 0.0106103398988865 });
		mapIrisid2MdsXY.put("IRIS_313-10724", new double[] { 0.10837825270311, 0.0128220345856807 });
		mapIrisid2MdsXY.put("IRIS_313-10725", new double[] { 0.113451583113581, -0.000138722361844862 });
		mapIrisid2MdsXY.put("IRIS_313-10726", new double[] { 0.104153781068681, 0.0214316784345165 });
		mapIrisid2MdsXY.put("IRIS_313-10727", new double[] { 0.0990094355062307, 0.0163035529129131 });
		mapIrisid2MdsXY.put("IRIS_313-10728", new double[] { 0.108874940704782, 0.00159137877879113 });
		mapIrisid2MdsXY.put("IRIS_313-10729", new double[] { -0.0678336027849179, -0.0362111052605405 });
		mapIrisid2MdsXY.put("IRIS_313-10730", new double[] { -0.188800081380608, 0.0133789384487147 });
		mapIrisid2MdsXY.put("IRIS_313-10731", new double[] { 0.0972587210626641, 0.0152826426849826 });
		mapIrisid2MdsXY.put("IRIS_313-10732", new double[] { -0.131407897349581, -0.0425981908260487 });
		mapIrisid2MdsXY.put("IRIS_313-10733", new double[] { 0.104221962588737, 0.0133142837046447 });
		mapIrisid2MdsXY.put("IRIS_313-10734", new double[] { 0.0347911875230371, -0.155096942363008 });
		mapIrisid2MdsXY.put("IRIS_313-10735", new double[] { 0.0438245761052512, -0.162557695903646 });
		mapIrisid2MdsXY.put("IRIS_313-10736", new double[] { 0.0189331600124212, -0.171099402553441 });
		mapIrisid2MdsXY.put("IRIS_313-10737", new double[] { 0.022014473157207, -0.137153536361658 });
		mapIrisid2MdsXY.put("IRIS_313-10738", new double[] { -0.0581109917484506, 0.04522953126375 });
		mapIrisid2MdsXY.put("IRIS_313-10739", new double[] { -0.00698221239132013, 0.0383644097193349 });
		mapIrisid2MdsXY.put("IRIS_313-10740", new double[] { -0.171437515680713, 0.0112093777739836 });
		mapIrisid2MdsXY.put("IRIS_313-10741", new double[] { -0.172518008148296, 0.0114734239865803 });
		mapIrisid2MdsXY.put("IRIS_313-10742", new double[] { 0.0997572321201648, 0.0248275499395473 });
		mapIrisid2MdsXY.put("IRIS_313-10743", new double[] { -0.186129716632997, 0.0118172358896867 });
		mapIrisid2MdsXY.put("IRIS_313-10744", new double[] { -0.173095275762999, 0.0124078913447551 });
		mapIrisid2MdsXY.put("IRIS_313-10745", new double[] { -0.173164127433502, 0.0109201008301492 });
		mapIrisid2MdsXY.put("IRIS_313-10746", new double[] { -0.17531265505306, 0.0103709769717564 });
		mapIrisid2MdsXY.put("IRIS_313-10747", new double[] { -0.185423133945234, 0.0123303757464813 });
		mapIrisid2MdsXY.put("IRIS_313-10748", new double[] { 0.108680790854365, 0.0174739475651747 });
		mapIrisid2MdsXY.put("IRIS_313-10749", new double[] { 0.110823349883281, 0.0221854185238581 });
		mapIrisid2MdsXY.put("IRIS_313-10750", new double[] { 0.104464269686596, 0.0234762806928933 });
		mapIrisid2MdsXY.put("IRIS_313-10751", new double[] { 0.0902600736610505, 0.0093393599830787 });
		mapIrisid2MdsXY.put("IRIS_313-10752", new double[] { -0.188553373751779, 0.0122608660564949 });
		mapIrisid2MdsXY.put("IRIS_313-10753", new double[] { 0.0878753875550388, 0.0325646849200283 });
		mapIrisid2MdsXY.put("IRIS_313-10754", new double[] { 0.0995864473404323, 0.0232655260966304 });
		mapIrisid2MdsXY.put("IRIS_313-10755", new double[] { 0.102572889003501, 0.0228387955409183 });
		mapIrisid2MdsXY.put("IRIS_313-10756", new double[] { 0.101505373884739, -0.00129907366710084 });
		mapIrisid2MdsXY.put("IRIS_313-10757", new double[] { 0.0968478581415596, 0.0249004749455642 });
		mapIrisid2MdsXY.put("IRIS_313-10758", new double[] { -0.181354416427345, 0.00973281192368879 });
		mapIrisid2MdsXY.put("IRIS_313-10759", new double[] { -0.173359187454418, 0.0140980489441035 });
		mapIrisid2MdsXY.put("IRIS_313-10760", new double[] { 0.102159153268373, 0.0163947561789255 });
		mapIrisid2MdsXY.put("IRIS_313-10761", new double[] { -0.179730959949367, 0.00945092486958224 });
		mapIrisid2MdsXY.put("IRIS_313-10762", new double[] { 0.103640896985546, 0.0237781054617347 });
		mapIrisid2MdsXY.put("IRIS_313-10765", new double[] { -0.172395747804406, 0.0105066480108892 });
		mapIrisid2MdsXY.put("IRIS_313-10766", new double[] { -0.175285782505839, 0.0112794149326845 });
		mapIrisid2MdsXY.put("IRIS_313-10767", new double[] { -0.178099577843132, 0.0109152744671341 });
		mapIrisid2MdsXY.put("IRIS_313-10768", new double[] { 0.0882410184516522, 0.0258170678760585 });
		mapIrisid2MdsXY.put("IRIS_313-10769", new double[] { 0.103827271434718, 0.0194611333856589 });
		mapIrisid2MdsXY.put("IRIS_313-10770", new double[] { -0.171358430468075, 0.0114821155705291 });
		mapIrisid2MdsXY.put("IRIS_313-10771", new double[] { -0.089698231476298, 0.0475976843882267 });
		mapIrisid2MdsXY.put("IRIS_313-10772", new double[] { 0.105360515329282, 0.0232904801016851 });
		mapIrisid2MdsXY.put("IRIS_313-10773", new double[] { -0.178906832416756, 0.00994089907473496 });
		mapIrisid2MdsXY.put("IRIS_313-10774", new double[] { 0.111200396694734, 0.0213902965487735 });
		mapIrisid2MdsXY.put("IRIS_313-10775", new double[] { 0.106270677067078, 0.0149609717693598 });
		mapIrisid2MdsXY.put("IRIS_313-10776", new double[] { -0.185434427467835, 0.0086997427251159 });
		mapIrisid2MdsXY.put("IRIS_313-10777", new double[] { 0.0965211637444836, 0.0309587608631339 });
		mapIrisid2MdsXY.put("IRIS_313-10778", new double[] { 0.0986551347265398, 0.0199678161473532 });
		mapIrisid2MdsXY.put("IRIS_313-10779", new double[] { 0.0966592513434562, 0.0225432482313011 });
		mapIrisid2MdsXY.put("IRIS_313-10780", new double[] { -0.182002653633561, 0.0126379683302625 });
		mapIrisid2MdsXY.put("IRIS_313-10781", new double[] { -0.170785542940445, 0.0123824715733955 });
		mapIrisid2MdsXY.put("IRIS_313-10782", new double[] { 0.0897599469333275, 0.0217031261177339 });
		mapIrisid2MdsXY.put("IRIS_313-10783", new double[] { -0.171289379955778, 0.0105316335396626 });
		mapIrisid2MdsXY.put("IRIS_313-10784", new double[] { -0.17022408521986, 0.00998701793796312 });
		mapIrisid2MdsXY.put("IRIS_313-10785", new double[] { -0.166058620998045, 0.0128138898687921 });
		mapIrisid2MdsXY.put("IRIS_313-10786", new double[] { 0.0308830581875371, 0.0346117389815983 });
		mapIrisid2MdsXY.put("IRIS_313-10787", new double[] { -0.0207525690723992, 0.0349013626582293 });
		mapIrisid2MdsXY.put("IRIS_313-10788", new double[] { -0.176758016444274, 0.0115018959966724 });
		mapIrisid2MdsXY.put("IRIS_313-10789", new double[] { -0.173935938178391, 0.00903390701676617 });
		mapIrisid2MdsXY.put("IRIS_313-10790", new double[] { -0.1719112542317, 0.0117694098465515 });
		mapIrisid2MdsXY.put("IRIS_313-10791", new double[] { 0.100153590433918, 0.0299094829744169 });
		mapIrisid2MdsXY.put("IRIS_313-10792", new double[] { 0.102098320521312, 0.0254491194551268 });
		mapIrisid2MdsXY.put("IRIS_313-10793", new double[] { -0.180117519362293, 0.0130173592239892 });
		mapIrisid2MdsXY.put("IRIS_313-10794", new double[] { -0.187363244344779, 0.0149101995724559 });
		mapIrisid2MdsXY.put("IRIS_313-10795", new double[] { -0.186215824828693, 0.0128333235514336 });
		mapIrisid2MdsXY.put("IRIS_313-10796", new double[] { -0.182305091658765, 0.0135600311506446 });
		mapIrisid2MdsXY.put("IRIS_313-10797", new double[] { 0.0932611557675057, 0.0291862209906889 });
		mapIrisid2MdsXY.put("IRIS_313-10798", new double[] { -0.18472345455569, 0.00752709432813314 });
		mapIrisid2MdsXY.put("IRIS_313-10799", new double[] { -0.183397612591356, 0.0104858845724184 });
		mapIrisid2MdsXY.put("IRIS_313-10800", new double[] { -0.168752571946181, 0.0127009515373795 });
		mapIrisid2MdsXY.put("IRIS_313-10801", new double[] { -0.179837846707344, 0.0119562344201637 });
		mapIrisid2MdsXY.put("IRIS_313-10802", new double[] { -0.173498066570425, 0.00819010772545254 });
		mapIrisid2MdsXY.put("IRIS_313-10803", new double[] { -0.174373702731094, 0.0108788848877843 });
		mapIrisid2MdsXY.put("IRIS_313-10804", new double[] { 0.0942303347119336, 0.023607152763857 });
		mapIrisid2MdsXY.put("IRIS_313-10805", new double[] { -0.167711798479097, 0.0111087196135151 });
		mapIrisid2MdsXY.put("IRIS_313-10806", new double[] { 0.101328262135601, 0.0168885795247922 });
		mapIrisid2MdsXY.put("IRIS_313-10807", new double[] { 0.0900225339504183, 0.0266093078791788 });
		mapIrisid2MdsXY.put("IRIS_313-10808", new double[] { -0.169737123061608, 0.0124793898773059 });
		mapIrisid2MdsXY.put("IRIS_313-10809", new double[] { -0.151390321274848, 0.0184342588229184 });
		mapIrisid2MdsXY.put("IRIS_313-10810", new double[] { 0.100700584379681, 0.027099642125575 });
		mapIrisid2MdsXY.put("IRIS_313-10811", new double[] { 0.106860642649399, 0.0137383391088908 });
		mapIrisid2MdsXY.put("IRIS_313-10812", new double[] { 0.106473274564109, 0.0269756852971932 });
		mapIrisid2MdsXY.put("IRIS_313-10813", new double[] { 0.0969420481968414, 0.0197077731730622 });
		mapIrisid2MdsXY.put("IRIS_313-10814", new double[] { 0.0898204155959802, 0.0274131261464897 });
		mapIrisid2MdsXY.put("IRIS_313-10815", new double[] { -0.174785131944904, 0.0111564533277719 });
		mapIrisid2MdsXY.put("IRIS_313-10816", new double[] { -0.162577826316135, 0.00918065057727126 });
		mapIrisid2MdsXY.put("IRIS_313-10817", new double[] { -0.166067969419872, 0.0125993981408308 });
		mapIrisid2MdsXY.put("IRIS_313-10818", new double[] { 0.0899031879915195, 0.0219443283913007 });
		mapIrisid2MdsXY.put("IRIS_313-10819", new double[] { 0.0927911062730517, 0.0192372402644948 });
		mapIrisid2MdsXY.put("IRIS_313-10820", new double[] { 0.0961426073233196, 0.0230443140424882 });
		mapIrisid2MdsXY.put("IRIS_313-10821", new double[] { 0.0999494137582919, 0.0223169192644496 });
		mapIrisid2MdsXY.put("IRIS_313-10822", new double[] { 0.0961654180399413, 0.0180262213640399 });
		mapIrisid2MdsXY.put("IRIS_313-10823", new double[] { 0.0972896323692423, 0.0182506816726163 });
		mapIrisid2MdsXY.put("IRIS_313-10824", new double[] { 0.105653704775353, 0.030278024726764 });
		mapIrisid2MdsXY.put("IRIS_313-10825", new double[] { 0.108336713919886, 0.00807321126004258 });
		mapIrisid2MdsXY.put("IRIS_313-10827", new double[] { -0.189107852309148, 0.00818857506570339 });
		mapIrisid2MdsXY.put("IRIS_313-10828", new double[] { -0.186535377454362, 0.00641786744165096 });
		mapIrisid2MdsXY.put("IRIS_313-10829", new double[] { -0.180443657163383, 0.00493839644918131 });
		mapIrisid2MdsXY.put("IRIS_313-10830", new double[] { -0.185873958673538, 0.0103233804475373 });
		mapIrisid2MdsXY.put("IRIS_313-10831", new double[] { -0.181932489352023, 0.00651910584635984 });
		mapIrisid2MdsXY.put("IRIS_313-10832", new double[] { -0.192003112956408, 0.00883189097770393 });
		mapIrisid2MdsXY.put("IRIS_313-10833", new double[] { 0.104543629967395, 0.00287555690049544 });
		mapIrisid2MdsXY.put("IRIS_313-10834", new double[] { -0.19906761269009, 0.000766954824735697 });
		mapIrisid2MdsXY.put("IRIS_313-10835", new double[] { 0.107124172929415, -0.0041425209611124 });
		mapIrisid2MdsXY.put("IRIS_313-10836", new double[] { 0.107989529279588, 0.00133017539555312 });
		mapIrisid2MdsXY.put("IRIS_313-10837", new double[] { -0.2082329793344, 0.00773704160761044 });
		mapIrisid2MdsXY.put("IRIS_313-10838", new double[] { -0.2098685936088, 0.0103472491947487 });
		mapIrisid2MdsXY.put("IRIS_313-10839", new double[] { -0.209106850467548, 0.0126013569691824 });
		mapIrisid2MdsXY.put("IRIS_313-10840", new double[] { -0.208308827892883, 0.009240008249056 });
		mapIrisid2MdsXY.put("IRIS_313-10841", new double[] { -0.170409745923797, 0.0140886932560963 });
		mapIrisid2MdsXY.put("IRIS_313-10842", new double[] { 0.101532357419907, 0.0183571247161386 });
		mapIrisid2MdsXY.put("IRIS_313-10844", new double[] { 0.0941382250177669, 0.0253391431770258 });
		mapIrisid2MdsXY.put("IRIS_313-10845", new double[] { 0.0570861374991415, -0.162951218580775 });
		mapIrisid2MdsXY.put("IRIS_313-10847", new double[] { 0.108306894755347, 0.0144517762038256 });
		mapIrisid2MdsXY.put("IRIS_313-10848", new double[] { -0.184911447884493, -0.00299421146596164 });
		mapIrisid2MdsXY.put("IRIS_313-10849", new double[] { 0.0413507201004435, -0.174188176855141 });
		mapIrisid2MdsXY.put("IRIS_313-10850", new double[] { -0.0609524256502882, -0.0189593171580585 });
		mapIrisid2MdsXY.put("IRIS_313-10851", new double[] { -0.118256124666086, -0.021171241647402 });
		mapIrisid2MdsXY.put("IRIS_313-10852", new double[] { 0.023856605076315, -0.187479031052928 });
		mapIrisid2MdsXY.put("IRIS_313-10853", new double[] { -0.196214684461143, 0.0068199459678955 });
		mapIrisid2MdsXY.put("IRIS_313-10854", new double[] { 0.0240769998136959, -0.125799897667178 });
		mapIrisid2MdsXY.put("IRIS_313-10855", new double[] { 0.103234481777208, -0.00251487602875615 });
		mapIrisid2MdsXY.put("IRIS_313-10856", new double[] { 0.0751411214520505, -0.051322414807269 });
		mapIrisid2MdsXY.put("IRIS_313-10857", new double[] { 0.0707758519736695, -0.0506700748567608 });
		mapIrisid2MdsXY.put("IRIS_313-10858", new double[] { 0.0936824042479316, -0.0109319315223232 });
		mapIrisid2MdsXY.put("IRIS_313-10859", new double[] { 0.0848004381236053, -0.042273079436604 });
		mapIrisid2MdsXY.put("IRIS_313-10861", new double[] { 0.0252796260748666, -0.133497188882729 });
		mapIrisid2MdsXY.put("IRIS_313-10862", new double[] { -0.196038557541182, 0.00692196430840447 });
		mapIrisid2MdsXY.put("IRIS_313-10863", new double[] { 0.113710989334492, 0.00410887391173588 });
		mapIrisid2MdsXY.put("IRIS_313-10864", new double[] { -0.172786994417523, -0.00968511795202711 });
		mapIrisid2MdsXY.put("IRIS_313-10865", new double[] { -0.194627499000751, 0.00460583739423816 });
		mapIrisid2MdsXY.put("IRIS_313-10866", new double[] { -0.196136870151113, 0.00648029246427991 });
		mapIrisid2MdsXY.put("IRIS_313-10867", new double[] { -0.198477848346229, 0.0091600500178313 });
		mapIrisid2MdsXY.put("IRIS_313-10868", new double[] { -0.135868246690983, -0.0404179967348286 });
		mapIrisid2MdsXY.put("IRIS_313-10869", new double[] { 0.0180622827599679, -0.142147328121334 });
		mapIrisid2MdsXY.put("IRIS_313-10870", new double[] { -0.189878743663814, 0.00459864637724517 });
		mapIrisid2MdsXY.put("IRIS_313-10871", new double[] { 0.0162156837665374, -0.143816278735028 });
		mapIrisid2MdsXY.put("IRIS_313-10872", new double[] { -0.131861732991508, 0.0270980192234873 });
		mapIrisid2MdsXY.put("IRIS_313-10873", new double[] { -0.0102645311717189, -0.134727937219694 });
		mapIrisid2MdsXY.put("IRIS_313-10874", new double[] { -0.197303866591301, 0.00834694426693932 });
		mapIrisid2MdsXY.put("IRIS_313-10875", new double[] { 0.0217423249960049, -0.169505103191265 });
		mapIrisid2MdsXY.put("IRIS_313-10876", new double[] { 0.0148195825009714, -0.135328884639435 });
		mapIrisid2MdsXY.put("IRIS_313-10877", new double[] { 0.00969756811733686, -0.130747645625579 });
		mapIrisid2MdsXY.put("IRIS_313-10878", new double[] { 0.0101991759008932, -0.131398726336138 });
		mapIrisid2MdsXY.put("IRIS_313-10879", new double[] { 0.052054210278335, -0.0833458820391769 });
		mapIrisid2MdsXY.put("IRIS_313-10880", new double[] { 0.107332905408426, 0.00678542497856976 });
		mapIrisid2MdsXY.put("IRIS_313-10881", new double[] { -0.0734311046782368, -0.0485135098649799 });
		mapIrisid2MdsXY.put("IRIS_313-10882", new double[] { 0.0259741906145321, -0.119209330362292 });
		mapIrisid2MdsXY.put("IRIS_313-10883", new double[] { -0.0958816163056365, -0.0465212383172633 });
		mapIrisid2MdsXY.put("IRIS_313-10884", new double[] { -0.182272828138216, 0.0071665053958471 });
		mapIrisid2MdsXY.put("IRIS_313-10885", new double[] { 0.10219750856606, 0.0145766679470366 });
		mapIrisid2MdsXY.put("IRIS_313-10886", new double[] { -0.193168627693289, 0.00619603479077144 });
		mapIrisid2MdsXY.put("IRIS_313-10887", new double[] { 0.10219293740756, 0.0205591294722969 });
		mapIrisid2MdsXY.put("IRIS_313-10888", new double[] { -0.195469158929142, 0.00931953419133446 });
		mapIrisid2MdsXY.put("IRIS_313-10889", new double[] { -0.193508626906143, 0.00344784992332849 });
		mapIrisid2MdsXY.put("IRIS_313-10890", new double[] { -0.193592011619804, 0.00362654874773327 });
		mapIrisid2MdsXY.put("IRIS_313-10891", new double[] { 0.035933289692804, -0.109397027429062 });
		mapIrisid2MdsXY.put("IRIS_313-10892", new double[] { 0.0259514918452121, -0.119186621042294 });
		mapIrisid2MdsXY.put("IRIS_313-10893", new double[] { -0.193163934125116, 0.00494017160047989 });
		mapIrisid2MdsXY.put("IRIS_313-10894", new double[] { 0.0327796038737274, -0.0812156023039586 });
		mapIrisid2MdsXY.put("IRIS_313-10895", new double[] { -0.199473969219646, 0.00601746543406138 });
		mapIrisid2MdsXY.put("IRIS_313-10896", new double[] { 0.0287498876466379, -0.0709447290962858 });
		mapIrisid2MdsXY.put("IRIS_313-10897", new double[] { 0.106339114448245, 0.0241945775483038 });
		mapIrisid2MdsXY.put("IRIS_313-10898", new double[] { 0.103769139272121, 0.0225947657688889 });
		mapIrisid2MdsXY.put("IRIS_313-10899", new double[] { 0.104750157411096, 0.0228305063172194 });
		mapIrisid2MdsXY.put("IRIS_313-10900", new double[] { 0.108685004406611, 0.0219522064050271 });
		mapIrisid2MdsXY.put("IRIS_313-10901", new double[] { 0.105636533542307, 0.0249158926003275 });
		mapIrisid2MdsXY.put("IRIS_313-10902", new double[] { 0.111048640804456, 0.02432654535349 });
		mapIrisid2MdsXY.put("IRIS_313-10903", new double[] { 0.103065809945402, 0.020580547718661 });
		mapIrisid2MdsXY.put("IRIS_313-10904", new double[] { 0.103986925921013, 0.0224230583853452 });
		mapIrisid2MdsXY.put("IRIS_313-10905", new double[] { 0.10359410918755, 0.0207032960051364 });
		mapIrisid2MdsXY.put("IRIS_313-10906", new double[] { 0.0963021821398849, 0.0305409775530852 });
		mapIrisid2MdsXY.put("IRIS_313-10907", new double[] { 0.100102874530969, 0.0253462891781575 });
		mapIrisid2MdsXY.put("IRIS_313-10908", new double[] { 0.104138729986853, 0.021658486624789 });
		mapIrisid2MdsXY.put("IRIS_313-10909", new double[] { 0.10703206667374, 0.0208896660575907 });
		mapIrisid2MdsXY.put("IRIS_313-10910", new double[] { 0.107438349572123, 0.0273797809809062 });
		mapIrisid2MdsXY.put("IRIS_313-10911", new double[] { 0.107023539501833, 0.0222542719125855 });
		mapIrisid2MdsXY.put("IRIS_313-10912", new double[] { 0.10942372131737, 0.0218186703271218 });
		mapIrisid2MdsXY.put("IRIS_313-10913", new double[] { 0.107106110075238, 0.0185244286506373 });
		mapIrisid2MdsXY.put("IRIS_313-10915", new double[] { 0.112526672195686, 0.0233903694172051 });
		mapIrisid2MdsXY.put("IRIS_313-10916", new double[] { -0.203071647782808, 0.0129515391204103 });
		mapIrisid2MdsXY.put("IRIS_313-10917", new double[] { 0.095999108981449, 0.00924312519405678 });
		mapIrisid2MdsXY.put("IRIS_313-10918", new double[] { -0.150359186128671, 0.0164041851444209 });
		mapIrisid2MdsXY.put("IRIS_313-10919", new double[] { -0.176563055733013, 0.0139873560377409 });
		mapIrisid2MdsXY.put("IRIS_313-10920", new double[] { -0.175771193677629, 0.0143815873674937 });
		mapIrisid2MdsXY.put("IRIS_313-10921", new double[] { 0.0995001486647401, 0.0107723241245279 });
		mapIrisid2MdsXY.put("IRIS_313-10922", new double[] { -0.191012541170246, 0.00988507822914468 });
		mapIrisid2MdsXY.put("IRIS_313-10923", new double[] { -0.197493339501907, 0.0119763788416203 });
		mapIrisid2MdsXY.put("IRIS_313-10924", new double[] { 0.105387396212586, 0.0197511584202172 });
		mapIrisid2MdsXY.put("IRIS_313-10925", new double[] { 0.0265909195624784, -0.160326013537788 });
		mapIrisid2MdsXY.put("IRIS_313-10926", new double[] { -0.120719286369051, -0.0400638978733803 });
		mapIrisid2MdsXY.put("IRIS_313-10927", new double[] { 0.0579194711243794, -0.178805561528143 });
		mapIrisid2MdsXY.put("IRIS_313-10928", new double[] { 0.101301265315854, 0.0114698249903718 });
		mapIrisid2MdsXY.put("IRIS_313-10929", new double[] { 0.107970878954115, 0.00216468619741741 });
		mapIrisid2MdsXY.put("IRIS_313-10930", new double[] { 0.0346295802022353, -0.183355320850607 });
		mapIrisid2MdsXY.put("IRIS_313-10931", new double[] { -0.197705625786418, 0.00668442393913941 });
		mapIrisid2MdsXY.put("IRIS_313-10932", new double[] { 0.0985915242003173, 0.0162680660143469 });
		mapIrisid2MdsXY.put("IRIS_313-10933", new double[] { -0.140398286919724, -0.0252991631309897 });
		mapIrisid2MdsXY.put("IRIS_313-10934", new double[] { 0.102356785521334, 0.0261102847948758 });
		mapIrisid2MdsXY.put("IRIS_313-10935", new double[] { 0.0994680719173102, 0.0285246407249585 });
		mapIrisid2MdsXY.put("IRIS_313-10936", new double[] { -0.171484149533536, 0.00978977042499622 });
		mapIrisid2MdsXY.put("IRIS_313-10937", new double[] { 0.0990123914568044, 0.0252721173633257 });
		mapIrisid2MdsXY.put("IRIS_313-10938", new double[] { 0.103484987855189, 0.0248022932791971 });
		mapIrisid2MdsXY.put("IRIS_313-10940", new double[] { 0.0965482757063375, 0.023391621381771 });
		mapIrisid2MdsXY.put("IRIS_313-10941", new double[] { 0.108607060888624, 0.022794600673661 });
		mapIrisid2MdsXY.put("IRIS_313-10942", new double[] { 0.103335831187005, 0.0202907681236635 });
		mapIrisid2MdsXY.put("IRIS_313-10943", new double[] { 0.0987186238608952, 0.0282407336105307 });
		mapIrisid2MdsXY.put("IRIS_313-10944", new double[] { 0.0965252638673756, 0.00462904636507696 });
		mapIrisid2MdsXY.put("IRIS_313-10945", new double[] { -0.182869664514336, 0.0122148018814583 });
		mapIrisid2MdsXY.put("IRIS_313-10946", new double[] { -0.182156256433133, 0.0109806395868352 });
		mapIrisid2MdsXY.put("IRIS_313-10947", new double[] { 0.0846277964240118, 0.0264656093488763 });
		mapIrisid2MdsXY.put("IRIS_313-10948", new double[] { -0.046702281640568, 0.0431717638852547 });
		mapIrisid2MdsXY.put("IRIS_313-10949", new double[] { -0.179507890089656, 0.00616557426282092 });
		mapIrisid2MdsXY.put("IRIS_313-10950", new double[] { -0.16805933766987, 0.0104041415571371 });
		mapIrisid2MdsXY.put("IRIS_313-10951", new double[] { 0.101166135092451, 0.0293543599929657 });
		mapIrisid2MdsXY.put("IRIS_313-10952", new double[] { -0.183193548101813, 0.00301335341728571 });
		mapIrisid2MdsXY.put("IRIS_313-10953", new double[] { -0.182136232718757, 0.00394527650977658 });
		mapIrisid2MdsXY.put("IRIS_313-10954", new double[] { 0.108407332835894, 0.0300624700550901 });
		mapIrisid2MdsXY.put("IRIS_313-10955", new double[] { 0.0967206396052355, 0.018865075769768 });
		mapIrisid2MdsXY.put("IRIS_313-10956", new double[] { -0.168991589024406, 0.0112415325595722 });
		mapIrisid2MdsXY.put("IRIS_313-10957", new double[] { -0.18499183154845, 0.00708432274622239 });
		mapIrisid2MdsXY.put("IRIS_313-10958", new double[] { -0.181351339073383, 0.0064643351255632 });
		mapIrisid2MdsXY.put("IRIS_313-10959", new double[] { -0.183030847809105, 0.00665692936639348 });
		mapIrisid2MdsXY.put("IRIS_313-10960", new double[] { -0.178888768618039, 0.00675196396256341 });
		mapIrisid2MdsXY.put("IRIS_313-10961", new double[] { 0.103647636222744, 0.0277221143970674 });
		mapIrisid2MdsXY.put("IRIS_313-10962", new double[] { 0.101420055403594, 0.0276004654046764 });
		mapIrisid2MdsXY.put("IRIS_313-10963", new double[] { 0.0427625131328605, -0.171810550858422 });
		mapIrisid2MdsXY.put("IRIS_313-10964", new double[] { 0.0286008593276792, -0.176745582997972 });
		mapIrisid2MdsXY.put("IRIS_313-10965", new double[] { 0.0404560448137804, -0.170746880998455 });
		mapIrisid2MdsXY.put("IRIS_313-10966", new double[] { 0.0988709374438836, 0.0202193192936778 });
		mapIrisid2MdsXY.put("IRIS_313-10967", new double[] { -0.206277969594354, 0.0099197548877804 });
		mapIrisid2MdsXY.put("IRIS_313-10968", new double[] { 0.0999542159918906, 0.0137939914212321 });
		mapIrisid2MdsXY.put("IRIS_313-10969", new double[] { 0.0394469003966116, -0.179763357265085 });
		mapIrisid2MdsXY.put("IRIS_313-10970", new double[] { 0.104061381459859, 0.0226658423249795 });
		mapIrisid2MdsXY.put("IRIS_313-10971", new double[] { 0.0949058307056308, 0.00567554138805568 });
		mapIrisid2MdsXY.put("IRIS_313-10972", new double[] { 0.0974940359790529, 0.0031218656187716 });
		mapIrisid2MdsXY.put("IRIS_313-10973", new double[] { 0.104470426499852, -0.0074188254922622 });
		mapIrisid2MdsXY.put("IRIS_313-10974", new double[] { 0.103518807573691, -0.00011474230607995 });
		mapIrisid2MdsXY.put("IRIS_313-10975", new double[] { 0.107102530343482, 0.0100986660811284 });
		mapIrisid2MdsXY.put("IRIS_313-10976", new double[] { 0.0499666599919735, -0.181277667549926 });
		mapIrisid2MdsXY.put("IRIS_313-10977", new double[] { 0.104646359764845, -0.00854633961527719 });
		mapIrisid2MdsXY.put("IRIS_313-10978", new double[] { 0.100316511724807, -0.00908035470326137 });
		mapIrisid2MdsXY.put("IRIS_313-10979", new double[] { 0.0558330975526264, -0.153359864383029 });
		mapIrisid2MdsXY.put("IRIS_313-10980", new double[] { 0.093974345886368, -0.0799713433034403 });
		mapIrisid2MdsXY.put("IRIS_313-10981", new double[] { 0.0521162455115244, -0.159977929544091 });
		mapIrisid2MdsXY.put("IRIS_313-10982", new double[] { 0.103285867582944, -0.00219291126354772 });
		mapIrisid2MdsXY.put("IRIS_313-10983", new double[] { 0.0981050148818487, 0.0154108981146843 });
		mapIrisid2MdsXY.put("IRIS_313-10984", new double[] { 0.112720320800764, -0.00523255580341131 });
		mapIrisid2MdsXY.put("IRIS_313-10985", new double[] { 0.100794380534274, 0.00379180406121111 });
		mapIrisid2MdsXY.put("IRIS_313-10986", new double[] { 0.113080921587772, -0.00457893142695925 });
		mapIrisid2MdsXY.put("IRIS_313-10987", new double[] { 0.0528376367295497, -0.16237441838888 });
		mapIrisid2MdsXY.put("IRIS_313-10988", new double[] { 0.0821489221895092, 0.0224803595839452 });
		mapIrisid2MdsXY.put("IRIS_313-10989", new double[] { 0.108051500018884, 0.0093285040749396 });
		mapIrisid2MdsXY.put("IRIS_313-10990", new double[] { 0.0941606097206515, 0.0201819229300827 });
		mapIrisid2MdsXY.put("IRIS_313-10991", new double[] { -0.188021894720397, 0.00816990900675223 });
		mapIrisid2MdsXY.put("IRIS_313-10992", new double[] { -0.182371754307547, 0.00761511364969854 });
		mapIrisid2MdsXY.put("IRIS_313-10993", new double[] { -0.196657351049263, 0.004616294702814 });
		mapIrisid2MdsXY.put("IRIS_313-10994", new double[] { -0.175697343150108, 0.0138332055637667 });
		mapIrisid2MdsXY.put("IRIS_313-10995", new double[] { 0.108301982351035, 0.0198398583877129 });
		mapIrisid2MdsXY.put("IRIS_313-10996", new double[] { 0.09007913652003, 0.0285023442288326 });
		mapIrisid2MdsXY.put("IRIS_313-10997", new double[] { 0.103656461988381, 0.0258571239553213 });
		mapIrisid2MdsXY.put("IRIS_313-10998", new double[] { 0.0224709807985185, 0.0280427519334964 });
		mapIrisid2MdsXY.put("IRIS_313-10999", new double[] { -0.183024836023134, 0.00893662078572133 });
		mapIrisid2MdsXY.put("IRIS_313-11000", new double[] { 0.102089533774535, 0.0229731314122219 });
		mapIrisid2MdsXY.put("IRIS_313-11001", new double[] { -0.18770310583141, 0.00833428534486856 });
		mapIrisid2MdsXY.put("IRIS_313-11003", new double[] { -0.179992017788071, 0.0127540601696789 });
		mapIrisid2MdsXY.put("IRIS_313-11004", new double[] { -0.18010069595563, 0.0118849468755304 });
		mapIrisid2MdsXY.put("IRIS_313-11005", new double[] { -0.165707918243614, 0.00504023650045255 });
		mapIrisid2MdsXY.put("IRIS_313-11006", new double[] { 0.0927447630764697, 0.0298720892495782 });
		mapIrisid2MdsXY.put("IRIS_313-11007", new double[] { -0.167475293638701, 0.0101314888427759 });
		mapIrisid2MdsXY.put("IRIS_313-11008", new double[] { -0.175539075662598, 0.0130085789674374 });
		mapIrisid2MdsXY.put("IRIS_313-11009", new double[] { -0.183864735540343, 0.0057007980456392 });
		mapIrisid2MdsXY.put("IRIS_313-11010", new double[] { 0.0981318547037797, 0.0269379670840392 });
		mapIrisid2MdsXY.put("IRIS_313-11011", new double[] { 0.086672265397374, 0.0300289963460166 });
		mapIrisid2MdsXY.put("IRIS_313-11012", new double[] { -0.0569209825684582, 0.0327886552779527 });
		mapIrisid2MdsXY.put("IRIS_313-11013", new double[] { 0.0431748281547982, -0.17977081898592 });
		mapIrisid2MdsXY.put("IRIS_313-11014", new double[] { 0.0374029780990344, -0.180507384257851 });
		mapIrisid2MdsXY.put("IRIS_313-11015", new double[] { 0.0433125575796996, -0.182701106598502 });
		mapIrisid2MdsXY.put("IRIS_313-11016", new double[] { 0.0444040364319944, -0.184155375373643 });
		mapIrisid2MdsXY.put("IRIS_313-11017", new double[] { 0.0456119475641157, -0.179674665132653 });
		mapIrisid2MdsXY.put("IRIS_313-11018", new double[] { 0.0599528765087637, -0.17229383858942 });
		mapIrisid2MdsXY.put("IRIS_313-11019", new double[] { 0.0482266146751176, -0.177652474361732 });
		mapIrisid2MdsXY.put("IRIS_313-11020", new double[] { 0.0354538881475482, -0.169994277932914 });
		mapIrisid2MdsXY.put("IRIS_313-11021", new double[] { -0.118614354094948, -0.0703863431867281 });
		mapIrisid2MdsXY.put("IRIS_313-11022", new double[] { -0.10681333249284, -0.0650014408739454 });
		mapIrisid2MdsXY.put("IRIS_313-11023", new double[] { -0.120492129873603, -0.0700058768753461 });
		mapIrisid2MdsXY.put("IRIS_313-11024", new double[] { 0.031910040376749, -0.174287423757869 });
		mapIrisid2MdsXY.put("IRIS_313-11025", new double[] { 0.020695611260336, -0.190123760544839 });
		mapIrisid2MdsXY.put("IRIS_313-11026", new double[] { -0.126224904908502, -0.0582812379191185 });
		mapIrisid2MdsXY.put("IRIS_313-11027", new double[] { 0.0383421064965405, -0.146689244352837 });
		mapIrisid2MdsXY.put("IRIS_313-11028", new double[] { 0.0312005742105905, -0.175869334290795 });
		mapIrisid2MdsXY.put("IRIS_313-11029", new double[] { 0.0375560381795656, -0.160503289676806 });
		mapIrisid2MdsXY.put("IRIS_313-11030", new double[] { -0.0890542137033657, -0.0906774757703529 });
		mapIrisid2MdsXY.put("IRIS_313-11031", new double[] { 0.0534139236799462, -0.125731431312792 });
		mapIrisid2MdsXY.put("IRIS_313-11032", new double[] { -0.0608873202398581, -0.0753186969345619 });
		mapIrisid2MdsXY.put("IRIS_313-11033", new double[] { -0.0504799428671062, -0.120052815475347 });
		mapIrisid2MdsXY.put("IRIS_313-11034", new double[] { 0.03728423819409, -0.161993440772582 });
		mapIrisid2MdsXY.put("IRIS_313-11035", new double[] { 0.0739871032598414, -0.0948016830599915 });
		mapIrisid2MdsXY.put("IRIS_313-11036", new double[] { -0.0109799842158756, -0.144058427260682 });
		mapIrisid2MdsXY.put("IRIS_313-11037", new double[] { 0.0385492521649146, -0.180835525247974 });
		mapIrisid2MdsXY.put("IRIS_313-11038", new double[] { 0.101049176880268, 0.0158211323033161 });
		mapIrisid2MdsXY.put("IRIS_313-11039", new double[] { 0.10187468560685, 0.0175746943933047 });
		mapIrisid2MdsXY.put("IRIS_313-11040", new double[] { 0.103676757482389, -0.00434730210495894 });
		mapIrisid2MdsXY.put("IRIS_313-11041", new double[] { 0.104322948487101, -0.02183020350939 });
		mapIrisid2MdsXY.put("IRIS_313-11042", new double[] { 0.104258796004818, -0.0213801860759335 });
		mapIrisid2MdsXY.put("IRIS_313-11043", new double[] { 0.0990957588093404, 0.0286874324798028 });
		mapIrisid2MdsXY.put("IRIS_313-11044", new double[] { -0.170591218365556, 0.00475736869870311 });
		mapIrisid2MdsXY.put("IRIS_313-11045", new double[] { -0.178426534214254, 0.00952955910721246 });
		mapIrisid2MdsXY.put("IRIS_313-11046", new double[] { -0.167503517514772, 0.00635305861929556 });
		mapIrisid2MdsXY.put("IRIS_313-11047", new double[] { 0.0356614381531071, -0.180791793534194 });
		mapIrisid2MdsXY.put("IRIS_313-11048", new double[] { 0.0449535552516821, -0.18397167917723 });
		mapIrisid2MdsXY.put("IRIS_313-11049", new double[] { 0.0418882126834968, -0.184063665189451 });
		mapIrisid2MdsXY.put("IRIS_313-11050", new double[] { 0.0447130736733456, -0.186956971696559 });
		mapIrisid2MdsXY.put("IRIS_313-11051", new double[] { 0.04326479524543, -0.183950543889885 });
		mapIrisid2MdsXY.put("IRIS_313-11052", new double[] { 0.0364665257583156, -0.167139529523216 });
		mapIrisid2MdsXY.put("IRIS_313-11053", new double[] { 0.0396622026025541, -0.187340657500563 });
		mapIrisid2MdsXY.put("IRIS_313-11054", new double[] { 0.0450392465860543, -0.179505997652363 });
		mapIrisid2MdsXY.put("IRIS_313-11055", new double[] { 0.0512743038054879, -0.186874927358226 });
		mapIrisid2MdsXY.put("IRIS_313-11056", new double[] { 0.0525963850699863, -0.185936460585366 });
		mapIrisid2MdsXY.put("IRIS_313-11057", new double[] { 0.0458897946220355, -0.180836349516426 });
		mapIrisid2MdsXY.put("IRIS_313-11058", new double[] { 0.0460104307610593, -0.194388102849731 });
		mapIrisid2MdsXY.put("IRIS_313-11059", new double[] { 0.0455658844199962, -0.1881627333882 });
		mapIrisid2MdsXY.put("IRIS_313-11060", new double[] { 0.0358459501654566, -0.179335914380732 });
		mapIrisid2MdsXY.put("IRIS_313-11061", new double[] { 0.0289910403679255, -0.174004491988951 });
		mapIrisid2MdsXY.put("IRIS_313-11062", new double[] { -0.130450454824999, -0.0596310970366023 });
		mapIrisid2MdsXY.put("IRIS_313-11063", new double[] { 0.03345086699595, -0.181573007072415 });
		mapIrisid2MdsXY.put("IRIS_313-11064", new double[] { 0.0327862746980169, -0.186008170594364 });
		mapIrisid2MdsXY.put("IRIS_313-11065", new double[] { 0.0271252275993632, -0.177630425598361 });
		mapIrisid2MdsXY.put("IRIS_313-11066", new double[] { -0.124072657231511, -0.0629850867626303 });
		mapIrisid2MdsXY.put("IRIS_313-11067", new double[] { 0.0290161830254971, -0.185221290301138 });
		mapIrisid2MdsXY.put("IRIS_313-11068", new double[] { -0.140886015249566, -0.0538803204304381 });
		mapIrisid2MdsXY.put("IRIS_313-11069", new double[] { -0.128580613499662, -0.0623825467876757 });
		mapIrisid2MdsXY.put("IRIS_313-11070", new double[] { -0.128962350967652, -0.0610048233592708 });
		mapIrisid2MdsXY.put("IRIS_313-11071", new double[] { 0.101421835926082, 0.0147685983657539 });
		mapIrisid2MdsXY.put("IRIS_313-11072", new double[] { 0.112355837857526, 0.0211541947135835 });
		mapIrisid2MdsXY.put("IRIS_313-11073", new double[] { -0.203678646945436, 0.0103451706088743 });
		mapIrisid2MdsXY.put("IRIS_313-11074", new double[] { 0.104140568468948, 0.024099116615723 });
		mapIrisid2MdsXY.put("IRIS_313-11075", new double[] { -0.195902112070339, 0.00834134107595908 });
		mapIrisid2MdsXY.put("IRIS_313-11076", new double[] { 0.104226702759645, 0.0210016262990992 });
		mapIrisid2MdsXY.put("IRIS_313-11077", new double[] { -0.1997862909464, 0.0114668382755125 });
		mapIrisid2MdsXY.put("IRIS_313-11078", new double[] { 0.101921199744092, 0.0279918097763365 });
		mapIrisid2MdsXY.put("IRIS_313-11079", new double[] { 0.112417056004886, 0.0258552871458035 });
		mapIrisid2MdsXY.put("IRIS_313-11080", new double[] { 0.0981650675511642, 0.0121650790735362 });
		mapIrisid2MdsXY.put("IRIS_313-11081", new double[] { 0.10173824151068, 0.023410340764536 });
		mapIrisid2MdsXY.put("IRIS_313-11082", new double[] { 0.0926179539198111, 0.0283616453653964 });
		mapIrisid2MdsXY.put("IRIS_313-11083", new double[] { 0.102227166704509, 0.0209166697412677 });
		mapIrisid2MdsXY.put("IRIS_313-11084", new double[] { 0.109617496096644, 0.0227152437639795 });
		mapIrisid2MdsXY.put("IRIS_313-11085", new double[] { 0.100631865965232, 0.0082752455522363 });
		mapIrisid2MdsXY.put("IRIS_313-11086", new double[] { 0.0910347829384774, 0.0288767410753591 });
		mapIrisid2MdsXY.put("IRIS_313-11087", new double[] { 0.104029014690805, 0.0279952631072127 });
		mapIrisid2MdsXY.put("IRIS_313-11088", new double[] { 0.106221311621642, 0.0235590062126061 });
		mapIrisid2MdsXY.put("IRIS_313-11089", new double[] { 0.111797466484195, 0.0181238844244474 });
		mapIrisid2MdsXY.put("IRIS_313-11090", new double[] { 0.092454300823019, 0.0312890451093156 });
		mapIrisid2MdsXY.put("IRIS_313-11091", new double[] { 0.0913937030145346, 0.0136912223915716 });
		mapIrisid2MdsXY.put("IRIS_313-11092", new double[] { -0.0546773056769031, 0.0366465585866785 });
		mapIrisid2MdsXY.put("IRIS_313-11093", new double[] { -0.195605273579728, 0.0101481488089363 });
		mapIrisid2MdsXY.put("IRIS_313-11094", new double[] { -0.182025602283545, 0.0112918435690501 });
		mapIrisid2MdsXY.put("IRIS_313-11095", new double[] { -0.0107755961074261, 0.0399622773917171 });
		mapIrisid2MdsXY.put("IRIS_313-11096", new double[] { 0.0996491464271942, 0.0233312589468222 });
		mapIrisid2MdsXY.put("IRIS_313-11097", new double[] { 0.071567780107498, 0.020556313131003 });
		mapIrisid2MdsXY.put("IRIS_313-11098", new double[] { 0.0979626779312795, 0.0262321657174235 });
		mapIrisid2MdsXY.put("IRIS_313-11099", new double[] { 0.10630979775516, 0.00537945141827244 });
		mapIrisid2MdsXY.put("IRIS_313-11100", new double[] { -0.191859431543608, 0.0113303745491557 });
		mapIrisid2MdsXY.put("IRIS_313-11101", new double[] { 0.102861411702887, 0.0279876372042823 });
		mapIrisid2MdsXY.put("IRIS_313-11102", new double[] { -0.18554774214064, 0.0113163964396627 });
		mapIrisid2MdsXY.put("IRIS_313-11103", new double[] { -0.196361062491137, 0.010042703354809 });
		mapIrisid2MdsXY.put("IRIS_313-11104", new double[] { -0.196209165037163, 0.00999295571744256 });
		mapIrisid2MdsXY.put("IRIS_313-11105", new double[] { -0.193793236450752, 0.00787771224154108 });
		mapIrisid2MdsXY.put("IRIS_313-11106", new double[] { -0.192778360036364, 0.0120594546879058 });
		mapIrisid2MdsXY.put("IRIS_313-11107", new double[] { -0.189766163615321, 0.0109819776871323 });
		mapIrisid2MdsXY.put("IRIS_313-11108", new double[] { 0.0941395762613407, 0.0223855833604373 });
		mapIrisid2MdsXY.put("IRIS_313-11109", new double[] { -0.192208259687932, 0.00572708275204523 });
		mapIrisid2MdsXY.put("IRIS_313-11110", new double[] { 0.0788154564804019, -0.0189080082246708 });
		mapIrisid2MdsXY.put("IRIS_313-11111", new double[] { 0.0283197550170207, -0.1740637955544 });
		mapIrisid2MdsXY.put("IRIS_313-11112", new double[] { 0.0589424116551272, -0.156909330908902 });
		mapIrisid2MdsXY.put("IRIS_313-11113", new double[] { 0.109181343440658, -0.00553865113144419 });
		mapIrisid2MdsXY.put("IRIS_313-11114", new double[] { 0.103924877909466, 0.0179034460099579 });
		mapIrisid2MdsXY.put("IRIS_313-11115", new double[] { 0.103720868993239, -0.00553621867599006 });
		mapIrisid2MdsXY.put("IRIS_313-11116", new double[] { 0.0522434523550519, -0.152910912363095 });
		mapIrisid2MdsXY.put("IRIS_313-11117", new double[] { -0.183375184832731, 0.00668019710209185 });
		mapIrisid2MdsXY.put("IRIS_313-11118", new double[] { 0.115602010183835, 0.0148015946961929 });
		mapIrisid2MdsXY.put("IRIS_313-11119", new double[] { 0.0931681824048869, 0.0106583715814165 });
		mapIrisid2MdsXY.put("IRIS_313-11120", new double[] { 0.0986013558208492, 0.00696819729609441 });
		mapIrisid2MdsXY.put("IRIS_313-11121", new double[] { -0.187735240251528, 0.00263959117656891 });
		mapIrisid2MdsXY.put("IRIS_313-11122", new double[] { 0.102484526983896, 0.014513081727188 });
		mapIrisid2MdsXY.put("IRIS_313-11123", new double[] { 0.0447386955931176, -0.151260183956724 });
		mapIrisid2MdsXY.put("IRIS_313-11124", new double[] { 0.0392188204903493, -0.113656518989837 });
		mapIrisid2MdsXY.put("IRIS_313-11125", new double[] { 0.0148063733086745, -0.0079316219890864 });
		mapIrisid2MdsXY.put("IRIS_313-11126", new double[] { 0.107254253237069, 0.0176508300668597 });
		mapIrisid2MdsXY.put("IRIS_313-11127", new double[] { -0.191905222844753, 0.00932795144040367 });
		mapIrisid2MdsXY.put("IRIS_313-11128", new double[] { 0.106461146219621, 0.0160867900011716 });
		mapIrisid2MdsXY.put("IRIS_313-11129", new double[] { 0.0683987616179974, 0.00306872530764515 });
		mapIrisid2MdsXY.put("IRIS_313-11130", new double[] { 0.0810451227733642, 0.0255609930163196 });
		mapIrisid2MdsXY.put("IRIS_313-11131", new double[] { 0.0894897402632606, -0.0335762295577129 });
		mapIrisid2MdsXY.put("IRIS_313-11132", new double[] { 0.108292868880274, 0.0209774000944676 });
		mapIrisid2MdsXY.put("IRIS_313-11133", new double[] { 0.0983260395880261, 0.0225932478087004 });
		mapIrisid2MdsXY.put("IRIS_313-11134", new double[] { 0.099127274191829, 0.011092131862442 });
		mapIrisid2MdsXY.put("IRIS_313-11135", new double[] { 0.105857080342817, 0.0187272337202709 });
		mapIrisid2MdsXY.put("IRIS_313-11136", new double[] { -0.0374231636400965, 0.0185351913933622 });
		mapIrisid2MdsXY.put("IRIS_313-11137", new double[] { 0.104816924159876, 0.011991969135653 });
		mapIrisid2MdsXY.put("IRIS_313-11138", new double[] { 0.0990955585964663, 0.0190356807019022 });
		mapIrisid2MdsXY.put("IRIS_313-11139", new double[] { 0.0921359163956376, 0.0223058799942396 });
		mapIrisid2MdsXY.put("IRIS_313-11140", new double[] { 0.100986198582974, 0.0179481714414034 });
		mapIrisid2MdsXY.put("IRIS_313-11141", new double[] { 0.100545032869323, 0.0148288138071122 });
		mapIrisid2MdsXY.put("IRIS_313-11142", new double[] { 0.105683431520529, 0.0176053930913772 });
		mapIrisid2MdsXY.put("IRIS_313-11143", new double[] { 0.098645865802685, 0.0108679189046042 });
		mapIrisid2MdsXY.put("IRIS_313-11144", new double[] { 0.0945866226860256, 0.018703346946654 });
		mapIrisid2MdsXY.put("IRIS_313-11145", new double[] { 0.0975445413251747, 0.022563573793543 });
		mapIrisid2MdsXY.put("IRIS_313-11146", new double[] { 0.10185384056244, 0.0230355249721196 });
		mapIrisid2MdsXY.put("IRIS_313-11147", new double[] { 0.105825792169605, 0.00546908923849411 });
		mapIrisid2MdsXY.put("IRIS_313-11148", new double[] { 0.102564494558985, 0.0165681804550585 });
		mapIrisid2MdsXY.put("IRIS_313-11149", new double[] { 0.103400431986944, 0.024756015869686 });
		mapIrisid2MdsXY.put("IRIS_313-11150", new double[] { 0.0992636549153662, 0.0292043479708667 });
		mapIrisid2MdsXY.put("IRIS_313-11151", new double[] { 0.108486217114188, 0.0248955653355622 });
		mapIrisid2MdsXY.put("IRIS_313-11152", new double[] { 0.0897800919037031, 0.0205208326612386 });
		mapIrisid2MdsXY.put("IRIS_313-11153", new double[] { -0.139140333299349, 0.0422342261500999 });
		mapIrisid2MdsXY.put("IRIS_313-11154", new double[] { 0.025538892555631, -0.17325988779022 });
		mapIrisid2MdsXY.put("IRIS_313-11155", new double[] { -0.189591687169672, 0.016573100927018 });
		mapIrisid2MdsXY.put("IRIS_313-11156", new double[] { -0.192183521819102, 0.0166410376572683 });
		mapIrisid2MdsXY.put("IRIS_313-11157", new double[] { 0.0760617981350004, 0.0195929074082013 });
		mapIrisid2MdsXY.put("IRIS_313-11158", new double[] { 0.0865080883822349, 0.0227743948770295 });
		mapIrisid2MdsXY.put("IRIS_313-11159", new double[] { -0.187166787692889, 0.00149010703672 });
		mapIrisid2MdsXY.put("IRIS_313-11160", new double[] { 0.0931328114395911, 0.0209527018812658 });
		mapIrisid2MdsXY.put("IRIS_313-11161", new double[] { -0.189845254871792, 0.00978748514116066 });
		mapIrisid2MdsXY.put("IRIS_313-11162", new double[] { 0.102679659006971, 0.0159346500657945 });
		mapIrisid2MdsXY.put("IRIS_313-11163", new double[] { 0.0365470877942355, -0.17765402490657 });
		mapIrisid2MdsXY.put("IRIS_313-11164", new double[] { 0.0357302918740585, -0.182255393258628 });
		mapIrisid2MdsXY.put("IRIS_313-11165", new double[] { 0.074646555593878, -0.107025243020162 });
		mapIrisid2MdsXY.put("IRIS_313-11166", new double[] { 0.0357435723154281, -0.174597771841123 });
		mapIrisid2MdsXY.put("IRIS_313-11167", new double[] { 0.0943351617962935, -0.00420027050834612 });
		mapIrisid2MdsXY.put("IRIS_313-11168", new double[] { 0.0126613465293259, -0.168736103263793 });
		mapIrisid2MdsXY.put("IRIS_313-11169", new double[] { 0.03844186038015, -0.167786456761001 });
		mapIrisid2MdsXY.put("IRIS_313-11170", new double[] { 0.0322569008734975, -0.18228272468595 });
		mapIrisid2MdsXY.put("IRIS_313-11171", new double[] { 0.0314654403873698, -0.177021320773731 });
		mapIrisid2MdsXY.put("IRIS_313-11172", new double[] { 0.0279917174009184, -0.165614011223544 });
		mapIrisid2MdsXY.put("IRIS_313-11173", new double[] { 0.0404217381168834, -0.172355199040821 });
		mapIrisid2MdsXY.put("IRIS_313-11174", new double[] { 0.0160541527728035, -0.159380157963415 });
		mapIrisid2MdsXY.put("IRIS_313-11175", new double[] { 0.0324168524256012, -0.161474912238719 });
		mapIrisid2MdsXY.put("IRIS_313-11176", new double[] { 0.0863394271620784, -0.0491888915914874 });
		mapIrisid2MdsXY.put("IRIS_313-11177", new double[] { 0.0905634281598243, 0.0267304906710857 });
		mapIrisid2MdsXY.put("IRIS_313-11178", new double[] { 0.0800098287571247, 0.0233177409745408 });
		mapIrisid2MdsXY.put("IRIS_313-11179", new double[] { 0.100434716120422, 0.0200627914500364 });
		mapIrisid2MdsXY.put("IRIS_313-11180", new double[] { 0.0767780772554779, 0.0292864492932442 });
		mapIrisid2MdsXY.put("IRIS_313-11181", new double[] { 0.0938965835105133, 0.00944521905202385 });
		mapIrisid2MdsXY.put("IRIS_313-11182", new double[] { 0.095147182585317, 0.0326416053089087 });
		mapIrisid2MdsXY.put("IRIS_313-11183", new double[] { -0.189033226239384, 0.0119582711291585 });
		mapIrisid2MdsXY.put("IRIS_313-11189", new double[] { -0.0777645554155351, -0.11180011530371 });
		mapIrisid2MdsXY.put("IRIS_313-11191", new double[] { -0.00203513768913353, -0.165768075645638 });
		mapIrisid2MdsXY.put("IRIS_313-11192", new double[] { 0.110091325209559, 0.0268587058873211 });
		mapIrisid2MdsXY.put("IRIS_313-11193", new double[] { 0.0983083080142736, 0.0252916929720888 });
		mapIrisid2MdsXY.put("IRIS_313-11194", new double[] { 0.105961424823127, 0.0244158590015665 });
		mapIrisid2MdsXY.put("IRIS_313-11195", new double[] { -0.196281005160299, 0.00885987476010646 });
		mapIrisid2MdsXY.put("IRIS_313-11196", new double[] { 0.0978024801544306, 0.0212438280325086 });
		mapIrisid2MdsXY.put("IRIS_313-11197", new double[] { 0.101427625574702, 0.0194302262828857 });
		mapIrisid2MdsXY.put("IRIS_313-11198", new double[] { -0.209289999750484, 0.01186158265552 });
		mapIrisid2MdsXY.put("IRIS_313-11199", new double[] { 0.0949305215073306, 0.0108590077254861 });
		mapIrisid2MdsXY.put("IRIS_313-11200", new double[] { 0.100695801893532, 0.0252771276048637 });
		mapIrisid2MdsXY.put("IRIS_313-11201", new double[] { -0.210089560812137, 0.011929121033307 });
		mapIrisid2MdsXY.put("IRIS_313-11202", new double[] { -0.207337556316495, 0.011673522846955 });
		mapIrisid2MdsXY.put("IRIS_313-11203", new double[] { 0.096588558888571, 0.0192628207027431 });
		mapIrisid2MdsXY.put("IRIS_313-11204", new double[] { 0.09383298256241, -0.037842513399415 });
		mapIrisid2MdsXY.put("IRIS_313-11205", new double[] { 0.109511752799155, 0.00709420842441413 });
		mapIrisid2MdsXY.put("IRIS_313-11206", new double[] { 0.101439664821801, 0.0146608096628389 });
		mapIrisid2MdsXY.put("IRIS_313-11207", new double[] { 0.100742088581342, -0.00203354826740523 });
		mapIrisid2MdsXY.put("IRIS_313-11208", new double[] { 0.0982209272785184, 0.00854749202496458 });
		mapIrisid2MdsXY.put("IRIS_313-11209", new double[] { 0.100092834900264, 0.00221736377577238 });
		mapIrisid2MdsXY.put("IRIS_313-11210", new double[] { 0.0281177718762309, -0.165979509379678 });
		mapIrisid2MdsXY.put("IRIS_313-11211", new double[] { 0.103312521513832, -0.00976519989743318 });
		mapIrisid2MdsXY.put("IRIS_313-11212", new double[] { 0.103850924520955, -0.00633837089268956 });
		mapIrisid2MdsXY.put("IRIS_313-11213", new double[] { 0.0355659373552771, -0.177703959696193 });
		mapIrisid2MdsXY.put("IRIS_313-11214", new double[] { 0.0516425738281358, -0.161557536554191 });
		mapIrisid2MdsXY.put("IRIS_313-11216", new double[] { 0.0484700882161012, -0.158446433914052 });
		mapIrisid2MdsXY.put("IRIS_313-11217", new double[] { -0.13106511528475, -0.0193647306441805 });
		mapIrisid2MdsXY.put("IRIS_313-11218", new double[] { -0.13880806512535, -0.0447995872600206 });
		mapIrisid2MdsXY.put("IRIS_313-11219", new double[] { 0.0911267890909701, 0.00136171950011379 });
		mapIrisid2MdsXY.put("IRIS_313-11220", new double[] { 0.112569799548496, -0.0138393032190395 });
		mapIrisid2MdsXY.put("IRIS_313-11221", new double[] { 0.10821184008734, 0.0016096605143479 });
		mapIrisid2MdsXY.put("IRIS_313-11222", new double[] { 0.0972690626524108, 0.000379201464565495 });
		mapIrisid2MdsXY.put("IRIS_313-11223", new double[] { -0.0430355607203753, -0.000685988114870762 });
		mapIrisid2MdsXY.put("IRIS_313-11224", new double[] { 0.100337618861686, 0.00309753298425007 });
		mapIrisid2MdsXY.put("IRIS_313-11225", new double[] { 0.0992261198246768, 0.0105031381878729 });
		mapIrisid2MdsXY.put("IRIS_313-11226", new double[] { 0.11240131298519, -0.00128628727645202 });
		mapIrisid2MdsXY.put("IRIS_313-11227", new double[] { 0.0949204401497648, 0.000116931435630773 });
		mapIrisid2MdsXY.put("IRIS_313-11228", new double[] { 0.112228537444004, 0.000303169743377832 });
		mapIrisid2MdsXY.put("IRIS_313-11229", new double[] { 0.108395779417446, 0.00122664462668297 });
		mapIrisid2MdsXY.put("IRIS_313-11230", new double[] { 0.098648996567169, -0.000859762334462942 });
		mapIrisid2MdsXY.put("IRIS_313-11231", new double[] { 0.103860049865664, 0.00296737149814883 });
		mapIrisid2MdsXY.put("IRIS_313-11232", new double[] { 0.0261511337039574, -0.140908343396864 });
		mapIrisid2MdsXY.put("IRIS_313-11233", new double[] { 0.103840574985173, 0.0297185275854744 });
		mapIrisid2MdsXY.put("IRIS_313-11234", new double[] { 0.0834395270164251, 0.0310988073962838 });
		mapIrisid2MdsXY.put("IRIS_313-11235", new double[] { 0.102937718220927, 0.00388640433012968 });
		mapIrisid2MdsXY.put("IRIS_313-11236", new double[] { 0.105781673522817, 0.0260765553169144 });
		mapIrisid2MdsXY.put("IRIS_313-11237", new double[] { 0.0766671176685357, 0.027272274222046 });
		mapIrisid2MdsXY.put("IRIS_313-11238", new double[] { -0.188867343252357, 0.00100306933083155 });
		mapIrisid2MdsXY.put("IRIS_313-11239", new double[] { 0.108996910539108, 0.0271889464098336 });
		mapIrisid2MdsXY.put("IRIS_313-11240", new double[] { 0.106648210831056, 0.00986773470502358 });
		mapIrisid2MdsXY.put("IRIS_313-11241", new double[] { 0.106414656385484, -0.00959861196503988 });
		mapIrisid2MdsXY.put("IRIS_313-11242", new double[] { 0.109782322496054, -0.0109870674192222 });
		mapIrisid2MdsXY.put("IRIS_313-11243", new double[] { 0.0663073184893245, -0.0804996271157863 });
		mapIrisid2MdsXY.put("IRIS_313-11244", new double[] { 0.102148015701855, 0.0188823470054056 });
		mapIrisid2MdsXY.put("IRIS_313-11245", new double[] { 0.1053100666698, 0.025235951193045 });
		mapIrisid2MdsXY.put("IRIS_313-11246", new double[] { -0.189061561375561, 0.0147988179570706 });
		mapIrisid2MdsXY.put("IRIS_313-11247", new double[] { 0.0999592397085569, 0.00938366694201244 });
		mapIrisid2MdsXY.put("IRIS_313-11248", new double[] { -0.186101170640366, 0.00788633881009457 });
		mapIrisid2MdsXY.put("IRIS_313-11249", new double[] { 0.109255932361062, 0.0128656931831968 });
		mapIrisid2MdsXY.put("IRIS_313-11250", new double[] { 0.0941302712848939, 0.0250718024107557 });
		mapIrisid2MdsXY.put("IRIS_313-11251", new double[] { 0.10227852987922, 0.021896689479805 });
		mapIrisid2MdsXY.put("IRIS_313-11252", new double[] { 0.0989201824409135, -0.00934642004130544 });
		mapIrisid2MdsXY.put("IRIS_313-11253", new double[] { 0.0482771312808498, 0.0263437191186204 });
		return mapIrisid2MdsXY;
	}

	private static Map getXY1V1(Map mapCode2XY) {

		mapCode2XY.put("B001", new double[] { -0.0850114242700294, 0.0154160179496696 });
		mapCode2XY.put("B002", new double[] { -0.090933491668036, 0.0158867172740466 });
		mapCode2XY.put("B003", new double[] { -0.08630941180925, 0.0160358761057021 });
		mapCode2XY.put("B004", new double[] { -0.0930793066239103, 0.0161495606045715 });
		mapCode2XY.put("B005", new double[] { -0.0928987376070818, 0.016541958234377 });
		mapCode2XY.put("B006", new double[] { 0.0537610193457596, 0.0142503446221121 });
		mapCode2XY.put("B007", new double[] { 0.0526793473382518, 0.0120465773673896 });
		mapCode2XY.put("B008", new double[] { -0.0926315114776827, 0.015537767726438 });
		mapCode2XY.put("B009", new double[] { 0.0487348893751966, 0.0113040457495552 });
		mapCode2XY.put("B010", new double[] { 0.0479151254215047, 0.0108817231014001 });
		mapCode2XY.put("B011", new double[] { 0.0488614925124004, -0.00311565052178842 });
		mapCode2XY.put("B012", new double[] { 0.032647825423277, -0.00455052936789774 });
		mapCode2XY.put("B013", new double[] { 0.0273559463449938, 0.0119507806553872 });
		mapCode2XY.put("B014", new double[] { -0.0775906339730614, 0.0155163737852702 });
		mapCode2XY.put("B015", new double[] { 0.0524792377307983, 0.00992403176541868 });
		mapCode2XY.put("B016", new double[] { -0.0933534460365028, 0.0133596017342069 });
		mapCode2XY.put("B017", new double[] { -0.0923349251809833, 0.0141767360569841 });
		mapCode2XY.put("B018", new double[] { -0.0922447653051485, 0.0193219749176092 });
		mapCode2XY.put("B019", new double[] { 0.0362171286907138, 0.00756491311777474 });
		mapCode2XY.put("B020", new double[] { -0.0142656725388214, 0.0145849009248497 });
		mapCode2XY.put("B021", new double[] { 0.0466981757467618, 0.013507394582099 });
		mapCode2XY.put("B023", new double[] { -0.078455796290681, 0.0129436099355968 });
		mapCode2XY.put("B024", new double[] { 0.0507085610910262, 0.0113434901381071 });
		mapCode2XY.put("B025", new double[] { -0.0832140245585711, 0.0150526606339758 });
		mapCode2XY.put("B026", new double[] { 0.0486831132898919, -0.00310344943921069 });
		mapCode2XY.put("B027", new double[] { 0.0503951785587238, 0.0167976585610261 });
		mapCode2XY.put("B028", new double[] { 0.0413199421103887, 0.00793017916653971 });
		mapCode2XY.put("B029", new double[] { 0.0326806924237215, 0.0123616949788317 });
		mapCode2XY.put("B030", new double[] { 0.0515724045364443, 0.00823253170364919 });
		mapCode2XY.put("B031", new double[] { 0.044560200905965, -0.00398010236712506 });
		mapCode2XY.put("B032", new double[] { 0.0519488302629663, 0.00941152012835749 });
		mapCode2XY.put("B033", new double[] { 0.0518021143825453, 0.0180146959914326 });
		mapCode2XY.put("B034", new double[] { -0.0896427452170977, 0.0127725317540909 });
		mapCode2XY.put("B035", new double[] { 0.0375695580342075, 0.0147015686649446 });
		mapCode2XY.put("B036", new double[] { -0.0896950988115759, 0.0173059293547943 });
		mapCode2XY.put("B037", new double[] { -0.0793732798369134, 0.0159572337766858 });
		mapCode2XY.put("B038", new double[] { -0.0873688255780208, 0.0139713319190126 });
		mapCode2XY.put("B039", new double[] { -0.00385305492405323, 0.00403501153714978 });
		mapCode2XY.put("B040", new double[] { 0.0551002598459414, 0.010571376961532 });
		mapCode2XY.put("B043", new double[] { -0.0930185083811302, 0.0161004575531353 });
		mapCode2XY.put("B044", new double[] { 0.0138777930901513, 0.00484449965874795 });
		mapCode2XY.put("B045", new double[] { -0.0930007979716591, 0.0157181645141096 });
		mapCode2XY.put("B046", new double[] { -0.0935064120170909, 0.0167946966049305 });
		mapCode2XY.put("B047", new double[] { -0.0434442734645817, 0.00975152935060907 });
		mapCode2XY.put("B048", new double[] { 0.0466515506216686, 0.0103134197807922 });
		mapCode2XY.put("B049", new double[] { -0.00832783345961808, -0.100999945918395 });
		mapCode2XY.put("B051", new double[] { 0.047348481612808, 0.0129592627057419 });
		mapCode2XY.put("B052", new double[] { 0.0358294288813533, -0.0435375443462382 });
		mapCode2XY.put("B053", new double[] { -0.0847639052532582, 0.0169365711246659 });
		mapCode2XY.put("B054", new double[] { -0.0919112927153101, 0.0183302590937332 });
		mapCode2XY.put("B055", new double[] { -0.0737647753056335, 0.0185371062517916 });
		mapCode2XY.put("B056", new double[] { -0.08844142442705, 0.0158725167635655 });
		mapCode2XY.put("B057", new double[] { -0.0893274247876685, 0.0178296473543215 });
		mapCode2XY.put("B058", new double[] { 0.0511567937544347, 0.0178399823542149 });
		mapCode2XY.put("B059", new double[] { 0.0485945585888777, 0.011620295009322 });
		mapCode2XY.put("B060", new double[] { 0.0497469436865629, 0.0150604895322852 });
		mapCode2XY.put("B061", new double[] { 0.0496768784128741, 0.0141519781582604 });
		mapCode2XY.put("B062", new double[] { 0.04848569150563, 0.0138148646496736 });
		mapCode2XY.put("B063", new double[] { 0.0481513776904359, 0.0156950296294548 });
		mapCode2XY.put("B064", new double[] { 0.0512777760228799, 0.0123146428240893 });
		mapCode2XY.put("B065", new double[] { 0.036980558499116, 0.00783107192604395 });
		mapCode2XY.put("B066", new double[] { -0.087835856167629, 0.012689129984332 });
		mapCode2XY.put("B067", new double[] { 0.0502049774524666, 0.0124599930995856 });
		mapCode2XY.put("B068", new double[] { -0.0932824328390439, 0.0143790487571236 });
		mapCode2XY.put("B069", new double[] { -0.0860750358058495, 0.0158215202779146 });
		mapCode2XY.put("B070", new double[] { -0.0884411607716407, 0.0164279113545492 });
		mapCode2XY.put("B071", new double[] { -0.0871454303458199, 0.0148957290358764 });
		mapCode2XY.put("B072", new double[] { 0.0132784973359096, 0.0035567179511977 });
		mapCode2XY.put("B073", new double[] { 0.0445519282142478, 0.0120715232155099 });
		mapCode2XY.put("B074", new double[] { 0.0483324301577888, 0.0148430880608842 });
		mapCode2XY.put("B075", new double[] { 0.0259770642280288, 0.0063748502483537 });
		mapCode2XY.put("B076", new double[] { 0.037251563499087, 0.00887580184154099 });
		mapCode2XY.put("B077", new double[] { -0.0879211299629611, 0.01514119245036 });
		mapCode2XY.put("B079", new double[] { 0.0535934875493687, 0.00940212615157524 });
		mapCode2XY.put("B081", new double[] { 0.0405828541908487, 0.00944436182203448 });
		mapCode2XY.put("B082", new double[] { 0.0391665098685388, 0.014717314153474 });
		mapCode2XY.put("B083", new double[] { 0.0499418124975621, 0.0155954200138692 });
		mapCode2XY.put("B084", new double[] { -0.0363092712498304, 0.0208368266860475 });
		mapCode2XY.put("B085", new double[] { 0.0379515954128699, 0.0119300197920852 });
		mapCode2XY.put("B086", new double[] { -0.0252651846742785, 0.0166354566788309 });
		mapCode2XY.put("B087", new double[] { 0.0337842284170393, -0.0016758162560783 });
		mapCode2XY.put("B088", new double[] { 0.0377543914921628, 0.0146432530063801 });
		mapCode2XY.put("B089", new double[] { 0.0389455301391905, 0.00773382158730864 });
		mapCode2XY.put("B090", new double[] { 0.0375900698635332, -0.00145572881442172 });
		mapCode2XY.put("B091", new double[] { 0.0454762074795703, -0.00626393075248782 });
		mapCode2XY.put("B092", new double[] { 0.0485143570969775, 0.0177937524422667 });
		mapCode2XY.put("B093", new double[] { 0.0383085195224497, 0.00608474269414595 });
		mapCode2XY.put("B094", new double[] { 0.0380213825788599, 0.00303416158987923 });
		mapCode2XY.put("B095", new double[] { 0.0519561548479836, 0.010512362791937 });
		mapCode2XY.put("B096", new double[] { 0.049673001555258, 0.0113060992849047 });
		mapCode2XY.put("B097", new double[] { 0.0510398364951103, 0.00860343527537775 });
		mapCode2XY.put("B100", new double[] { -0.0880444082310538, 0.0126902239487763 });
		mapCode2XY.put("B101", new double[] { -0.0717596441418232, 0.0119870437860578 });
		mapCode2XY.put("B102", new double[] { -0.0911830812636285, 0.0134245425130371 });
		mapCode2XY.put("B103", new double[] { -0.0853754788385198, 0.01301132377715 });
		mapCode2XY.put("B104", new double[] { 0.0531063091645964, 0.0157678503786759 });
		mapCode2XY.put("B105", new double[] { 0.0428540762567621, 0.0162550663959598 });
		mapCode2XY.put("B106", new double[] { 0.0505839103873398, 0.00624308399501759 });
		mapCode2XY.put("B107", new double[] { 0.050116582972399, 0.00974325401704763 });
		mapCode2XY.put("B108", new double[] { 0.0404759472832726, -0.00201563432471146 });
		mapCode2XY.put("B109", new double[] { -0.080614864362054, 0.00931997516586995 });
		mapCode2XY.put("B110", new double[] { -0.087845663115274, 0.0131972567978451 });
		mapCode2XY.put("B111", new double[] { -0.0882566591243143, 0.0132833507160575 });
		mapCode2XY.put("B112", new double[] { 0.0506923266328635, 0.0152979346415869 });
		mapCode2XY.put("B113", new double[] { 0.0495655662611593, 0.0164263386020372 });
		mapCode2XY.put("B114", new double[] { 0.048415447926448, 0.0171711605505586 });
		mapCode2XY.put("B115", new double[] { 0.0494779161833708, 0.017229759290699 });
		mapCode2XY.put("B116", new double[] { 0.0532464744462125, 0.00596468099882173 });
		mapCode2XY.put("B117", new double[] { -0.0869983162720972, 0.0137144129310794 });
		mapCode2XY.put("B118", new double[] { 0.0458616439825826, 0.0180164149335858 });
		mapCode2XY.put("B119", new double[] { 0.0454984936087948, 0.014515572115364 });
		mapCode2XY.put("B120", new double[] { 0.0474030705558396, 0.0160417532115618 });
		mapCode2XY.put("B121", new double[] { 0.0503122035837692, 0.0151159292019849 });
		mapCode2XY.put("B122", new double[] { -0.0907454668233091, 0.0171059062130764 });
		mapCode2XY.put("B123", new double[] { 0.0437444570191065, 0.0153385684110721 });
		mapCode2XY.put("B124", new double[] { -0.0545135698331333, 0.0118128583447426 });
		mapCode2XY.put("B125", new double[] { 0.0470505348739974, 0.0143947895651337 });
		mapCode2XY.put("B126", new double[] { 0.0466240295347443, 0.0149776329006203 });
		mapCode2XY.put("B127", new double[] { 0.0479401453046458, 0.0148282223990076 });
		mapCode2XY.put("B128", new double[] { 0.0270308594717666, 0.0159020305726276 });
		mapCode2XY.put("B129", new double[] { 0.0456968620260083, 0.0121183495170348 });
		mapCode2XY.put("B130", new double[] { 0.0328871123658789, 0.00863267197339348 });
		mapCode2XY.put("B131", new double[] { 0.0454759782118764, 0.0152124522543263 });
		mapCode2XY.put("B132", new double[] { 0.0295697260128433, 0.0146180257244175 });
		mapCode2XY.put("B133", new double[] { 0.0406256806145081, 0.00911809021176337 });
		mapCode2XY.put("B134", new double[] { -0.0895499754189145, 0.0117787079903327 });
		mapCode2XY.put("B135", new double[] { 0.0425951325721472, 0.0149512233299002 });
		mapCode2XY.put("B136", new double[] { -0.0883355347604095, 0.0138466795944124 });
		mapCode2XY.put("B137", new double[] { 0.0354075354211202, 0.0140225846920088 });
		mapCode2XY.put("B138", new double[] { 0.0298091669241926, 0.00903921525418678 });
		mapCode2XY.put("B139", new double[] { 0.0227206085235102, 0.00679866627883447 });
		mapCode2XY.put("B140", new double[] { 0.0482632808021665, 0.0154346371310881 });
		mapCode2XY.put("B141", new double[] { -0.0130065250057735, 0.0181151848550781 });
		mapCode2XY.put("B142", new double[] { -0.0383864228230352, 0.0206161095129919 });
		mapCode2XY.put("B143", new double[] { -0.0550634674229925, 0.0220742646773555 });
		mapCode2XY.put("B144", new double[] { -0.0798410504943798, 0.01659788882023 });
		mapCode2XY.put("B145", new double[] { 0.032817011202879, 0.0125754532736713 });
		mapCode2XY.put("B146", new double[] { 0.0487198226773775, 0.0164343893573805 });
		mapCode2XY.put("B147", new double[] { 0.0400015097542838, 0.0135123478802745 });
		mapCode2XY.put("B148", new double[] { -0.0885693594650079, 0.0133093622960187 });
		mapCode2XY.put("B149", new double[] { 0.0489591658097446, 0.0155631739085416 });
		mapCode2XY.put("B150", new double[] { 0.0396722782142377, 0.0143895936024114 });
		mapCode2XY.put("B151", new double[] { 0.0429994548014931, 0.0119975994251114 });
		mapCode2XY.put("B152", new double[] { -0.0576686567713185, 0.00869449772130779 });
		mapCode2XY.put("B153", new double[] { 0.0266404220029449, 0.00832720839226975 });
		mapCode2XY.put("B154", new double[] { -0.0888291354247508, 0.0154319200680488 });
		mapCode2XY.put("B155", new double[] { 0.0316303452604386, 0.0135329288662337 });
		mapCode2XY.put("B156", new double[] { 0.0443409934368659, 0.0113250302153335 });
		mapCode2XY.put("B157", new double[] { 0.0499574126003396, 0.0149152624879351 });
		mapCode2XY.put("B158", new double[] { -0.0185031074608806, 0.0111262896007161 });
		mapCode2XY.put("B159", new double[] { 0.0409442960102224, 0.0131770000045786 });
		mapCode2XY.put("B160", new double[] { -0.0929748687021894, 0.0165775418654397 });
		mapCode2XY.put("B161", new double[] { -0.0888018876278986, 0.0133459480430519 });
		mapCode2XY.put("B162", new double[] { -0.0906619002945816, 0.0165142700891988 });
		mapCode2XY.put("B163", new double[] { 0.0383408367016694, 0.00918830086746696 });
		mapCode2XY.put("B164", new double[] { -0.00104314203810549, -0.109009329154958 });
		mapCode2XY.put("B165", new double[] { 0.0462202126541188, 0.00940032131506823 });
		mapCode2XY.put("B166", new double[] { -0.0918976898877306, 0.0151792271138485 });
		mapCode2XY.put("B167", new double[] { -0.0918299778306389, 0.0149726445115784 });
		mapCode2XY.put("B168", new double[] { -0.0889229363973755, 0.0182267362586866 });
		mapCode2XY.put("B169", new double[] { -0.0931901010830519, 0.016556836272448 });
		mapCode2XY.put("B170", new double[] { -0.09253462204837, 0.0178884044234203 });
		mapCode2XY.put("B171", new double[] { -0.0930738399467867, 0.0169167145559202 });
		mapCode2XY.put("B173", new double[] { -0.00603652104172413, 0.00310707614285687 });
		mapCode2XY.put("B176", new double[] { 0.0231509321475131, 0.0132169407320779 });
		mapCode2XY.put("B179", new double[] { -0.0949708045523878, 0.0136578894094671 });
		mapCode2XY.put("B180", new double[] { 0.0532761155795865, 0.0116456113108808 });
		mapCode2XY.put("B181", new double[] { 0.042684324918147, 0.0179286251079614 });
		mapCode2XY.put("B182", new double[] { -0.0927410134725031, 0.0159565032481139 });
		mapCode2XY.put("B183", new double[] { -0.093318330754851, 0.0167468619754308 });
		mapCode2XY.put("B184", new double[] { 0.0339926173710616, 0.0128932765069641 });
		mapCode2XY.put("B185", new double[] { 0.0495978360246147, 0.0124181143991417 });
		mapCode2XY.put("B187", new double[] { 0.0428728860510569, -0.00394762737088929 });
		mapCode2XY.put("B188", new double[] { -0.0933702456064823, 0.0165175641850075 });
		mapCode2XY.put("B189", new double[] { -0.0925700111068268, 0.013584308598795 });
		mapCode2XY.put("B190", new double[] { -0.0911548359181559, 0.0182965727836611 });
		mapCode2XY.put("B191", new double[] { -0.0898235138784748, 0.0193485360143639 });
		mapCode2XY.put("B192", new double[] { -0.0131945187030075, 0.00651133247853519 });
		mapCode2XY.put("B193", new double[] { 0.0470501134286833, 0.0181472661266893 });
		mapCode2XY.put("B194", new double[] { 0.0449844867902927, 0.0149880269400032 });
		mapCode2XY.put("B195", new double[] { 0.0472453644341235, 0.0127147504047755 });
		mapCode2XY.put("B196", new double[] { -0.0817049547852522, 0.0185502153135702 });
		mapCode2XY.put("B197", new double[] { 0.0531014900399021, 0.00656337211689075 });
		mapCode2XY.put("B198", new double[] { 0.0464591925373631, 0.00941535993300717 });
		mapCode2XY.put("B199", new double[] { -0.0888358887374469, 0.0138127697745758 });
		mapCode2XY.put("B200", new double[] { 0.0477944406540301, 0.0110987673476058 });
		mapCode2XY.put("B201", new double[] { 0.0401820452816648, 0.016159322816065 });
		mapCode2XY.put("B202", new double[] { 0.0413473447083794, 0.0129676547810115 });
		mapCode2XY.put("B203", new double[] { 0.0423459636072254, 0.00936706208759397 });
		mapCode2XY.put("B204", new double[] { -0.0934116346130058, 0.0151670313519495 });
		mapCode2XY.put("B205", new double[] { -0.0893905610179497, 0.0114405305050734 });
		mapCode2XY.put("B207", new double[] { 0.0414215969499648, 0.0155059465630813 });
		mapCode2XY.put("B208", new double[] { 0.0523297837137386, 0.013126804342229 });
		mapCode2XY.put("B210", new double[] { 0.0461901671531592, 0.00700751829685596 });
		mapCode2XY.put("B212", new double[] { -0.0785470332229625, 0.0124121175958907 });
		mapCode2XY.put("B213", new double[] { 0.0462051458058853, 0.0121278886031983 });
		mapCode2XY.put("B214", new double[] { 0.0510770617611754, 0.0189577286675772 });
		mapCode2XY.put("B215", new double[] { -0.0922694478548182, 0.0148885078304439 });
		mapCode2XY.put("B216", new double[] { 0.0461484407635321, 0.00953816791283856 });
		mapCode2XY.put("B217", new double[] { 0.0514913469144077, 0.0156056623096795 });
		mapCode2XY.put("B218", new double[] { -0.0904014153601748, 0.0152050014047177 });
		mapCode2XY.put("B219", new double[] { 0.0494158112234041, 0.0110650674985846 });
		mapCode2XY.put("B221", new double[] { 0.0173571100373936, -0.0432912018038599 });
		mapCode2XY.put("B222", new double[] { 0.0440671142815791, 0.00605126482457965 });
		mapCode2XY.put("B223", new double[] { -0.0895565148556016, 0.0128505199440086 });
		mapCode2XY.put("B224", new double[] { 0.0443468510762291, 0.00555159239459075 });
		mapCode2XY.put("B225", new double[] { -0.0877101970622208, 0.0139264187344238 });
		mapCode2XY.put("B226", new double[] { -0.0951442347045441, 0.0147672081220712 });
		mapCode2XY.put("B227", new double[] { 0.0299112051833817, 0.0141106431157882 });
		mapCode2XY.put("B228", new double[] { -0.0855912222833189, 0.0108186160338293 });
		mapCode2XY.put("B229", new double[] { 0.0434284763497593, 0.00873762834785577 });
		mapCode2XY.put("B230", new double[] { -0.0872983771151545, 0.00973496797383937 });
		mapCode2XY.put("B232", new double[] { 0.0480320278101042, 0.0133565250264797 });
		mapCode2XY.put("B233", new double[] { 0.0519607273881569, 0.0106680123901719 });
		mapCode2XY.put("B234", new double[] { 0.0483125705473025, 0.0164596868822101 });
		mapCode2XY.put("B235", new double[] { -0.0869519100191092, 0.0176745676153882 });
		mapCode2XY.put("B236", new double[] { -0.0927396209494389, 0.0163015071263612 });
		mapCode2XY.put("B238", new double[] { 0.0418350624355943, 0.0147961002338047 });
		mapCode2XY.put("B239", new double[] { 0.0399277214134077, 0.00644874982080627 });
		mapCode2XY.put("B240", new double[] { -0.095060966490558, 0.0178010162363053 });
		mapCode2XY.put("B241", new double[] { -0.0882529560294126, 0.0109269026284038 });
		mapCode2XY.put("B242", new double[] { 0.0386636299326639, 0.0134373957969422 });
		mapCode2XY.put("B243", new double[] { -0.000509612567551849, -0.11191557005125 });
		mapCode2XY.put("B244", new double[] { 0.0402867399319162, 0.011586301284511 });
		mapCode2XY.put("B245", new double[] { -0.0902181902716731, 0.0116012150779499 });
		mapCode2XY.put("B246", new double[] { 0.049510033002224, 0.00804775329704882 });
		mapCode2XY.put("B247", new double[] { 0.0418334504297299, 0.00495724419107461 });
		mapCode2XY.put("B248", new double[] { 0.0501709840013908, 0.0133741172257743 });
		mapCode2XY.put("B249", new double[] { 0.0507964132841686, 0.0149056032516904 });
		mapCode2XY.put("B250", new double[] { -0.0905760270747859, 0.0145569294112074 });
		mapCode2XY.put("B252", new double[] { 0.0440051613384712, 0.0132608528715526 });
		mapCode2XY.put("B253", new double[] { 0.048456629000194, 0.0134796553745476 });
		mapCode2XY.put("B254", new double[] { 0.0484949470785067, 0.013500838102703 });
		mapCode2XY.put("B255", new double[] { 0.0444762616412968, 0.0127371045651288 });
		mapCode2XY.put("B258", new double[] { -0.0934921389342844, 0.0127904550859202 });
		mapCode2XY.put("B259", new double[] { 0.0495054472276817, 0.0118891063609531 });
		mapCode2XY.put("B260", new double[] { 0.0442217605935134, 0.00994655288200459 });
		mapCode2XY.put("B261", new double[] { 0.0457872100077716, 0.0093230135741102 });
		mapCode2XY.put("B263", new double[] { -0.0931583528758078, 0.0161023089095313 });
		mapCode2XY.put("B264", new double[] { 0.0492486987535654, 0.0155954249168814 });
		mapCode2XY.put("B265", new double[] { 0.0477345068431742, 0.0136965933909962 });
		mapCode2XY.put("B266", new double[] { -0.0883049783080765, 0.0124911332620065 });
		mapCode2XY.put("B267", new double[] { 0.0472424469690533, 0.0154219957643772 });
		mapCode2XY.put("B268", new double[] { 0.0433204921331444, -0.00192316234966601 });
		mapCode2XY.put("B269", new double[] { -0.0934953435688535, 0.0162373709726703 });
		mapCode2XY.put("CX10", new double[] { 0.0437749850108455, 0.0159090856306949 });
		mapCode2XY.put("CX100", new double[] { 0.0212543629070592, 0.0163707517955455 });
		mapCode2XY.put("CX101", new double[] { 0.0483829058243846, 0.00985425182926472 });
		mapCode2XY.put("CX102", new double[] { 0.0525752267909774, 0.0130168004954096 });
		mapCode2XY.put("CX103", new double[] { -0.000157924802737025, -0.00118984005502191 });
		mapCode2XY.put("CX104", new double[] { -0.0741237528922541, -0.0226000594312819 });
		mapCode2XY.put("CX106", new double[] { -0.0836733851247373, 0.0146706570210666 });
		mapCode2XY.put("CX107", new double[] { 0.0532162231917526, 0.020672823398715 });
		mapCode2XY.put("CX108", new double[] { 0.013208307646748, -0.0642968885446775 });
		mapCode2XY.put("CX109", new double[] { -0.0773787755744321, 0.0106177944163814 });
		mapCode2XY.put("CX11", new double[] { -0.0594448666813581, 0.01524958052296 });
		mapCode2XY.put("CX110", new double[] { -0.0727715908452997, -0.030643963745648 });
		mapCode2XY.put("CX111", new double[] { -0.0939571917403927, 0.0188455270185096 });
		mapCode2XY.put("CX112", new double[] { -0.0723163399457968, -0.0404514964895917 });
		mapCode2XY.put("CX113", new double[] { -0.0931916083137952, 0.0139996225078863 });
		mapCode2XY.put("CX114", new double[] { 0.0508159545614108, 0.0147984247346692 });
		mapCode2XY.put("CX115", new double[] { 0.0353617776620698, 0.00310476577882263 });
		mapCode2XY.put("CX116", new double[] { -0.0940227827026953, 0.0170804395172823 });
		mapCode2XY.put("CX117", new double[] { 0.0532245114523369, 0.0125196902341326 });
		mapCode2XY.put("CX118", new double[] { 0.0494562979332507, 0.00823256136319488 });
		mapCode2XY.put("CX119", new double[] { 0.0517435446690469, 0.0139757407204626 });
		mapCode2XY.put("CX12", new double[] { 0.0406742884079217, 0.00806337156392665 });
		mapCode2XY.put("CX120", new double[] { 0.0339101795512891, 0.0134934413994906 });
		mapCode2XY.put("CX121", new double[] { 0.0445781335518127, 0.0157160150260973 });
		mapCode2XY.put("CX122", new double[] { 0.0436312375542689, 0.0101945365018167 });
		mapCode2XY.put("CX123", new double[] { 0.0481729845637095, 0.00866648484460937 });
		mapCode2XY.put("CX124", new double[] { 0.0351006934585392, 0.0182588193154729 });
		mapCode2XY.put("CX125", new double[] { 0.050746653301029, 0.0132538557497 });
		mapCode2XY.put("CX126", new double[] { 0.0473894769728944, 0.00985938058502954 });
		mapCode2XY.put("CX128", new double[] { 0.0513660872830804, 0.0166486915675088 });
		mapCode2XY.put("CX129", new double[] { -0.0832495847914944, 0.0138243128451733 });
		mapCode2XY.put("CX13", new double[] { 0.00277840561199168, 0.00264720918970856 });
		mapCode2XY.put("CX130", new double[] { 0.0319921251186495, -0.00480517253045269 });
		mapCode2XY.put("CX131", new double[] { 0.0482441134849202, 0.0109393012860385 });
		mapCode2XY.put("CX132", new double[] { -0.0935799592600613, 0.0186060915988379 });
		mapCode2XY.put("CX133", new double[] { 0.0444574420992266, 0.0141807284803884 });
		mapCode2XY.put("CX134", new double[] { 0.0469527540318482, 0.0113352576923511 });
		mapCode2XY.put("CX138", new double[] { -0.0745265754421673, 0.0185836876334987 });
		mapCode2XY.put("CX139", new double[] { -0.0774014473277807, 0.01055615179352 });
		mapCode2XY.put("CX14", new double[] { -0.0935856592231591, 0.0172602442389149 });
		mapCode2XY.put("CX140", new double[] { -0.0922249875246769, 0.0158964723678399 });
		mapCode2XY.put("CX141", new double[] { 0.0508995714952585, 0.0158762402235213 });
		mapCode2XY.put("CX142", new double[] { -0.0949452132259413, 0.0184758945276269 });
		mapCode2XY.put("CX143", new double[] { -0.0739151690059784, -0.0216693545924685 });
		mapCode2XY.put("CX144", new double[] { 0.0497498664328678, 0.0140855966365761 });
		mapCode2XY.put("CX145", new double[] { 0.0428431560154343, 0.0176070158798721 });
		mapCode2XY.put("CX146", new double[] { 0.0512568926041389, 0.0102721820194043 });
		mapCode2XY.put("CX147", new double[] { 0.0392791869797926, 0.0101737885929135 });
		mapCode2XY.put("CX148", new double[] { 0.049448300446811, 0.0149602924415664 });
		mapCode2XY.put("CX149", new double[] { -0.067534239539117, -0.0510541861328538 });
		mapCode2XY.put("CX15", new double[] { 0.0217513384634095, 0.0198235530466696 });
		mapCode2XY.put("CX150", new double[] { 0.047808523753067, 0.0215799675053935 });
		mapCode2XY.put("CX151", new double[] { -0.0875334647544022, 0.0115782278480796 });
		mapCode2XY.put("CX152", new double[] { 0.0553704599644115, 0.0180599512658763 });
		mapCode2XY.put("CX153", new double[] { 0.0446237441393399, -0.000139962366094198 });
		mapCode2XY.put("CX154", new double[] { 0.0533165927576535, 0.0194176980894248 });
		mapCode2XY.put("CX155", new double[] { 0.0485817613578525, -0.0160701270993017 });
		mapCode2XY.put("CX156", new double[] { 0.0546029078110797, 0.0146910970213115 });
		mapCode2XY.put("CX157", new double[] { 0.0420022989350975, -0.0124550034042052 });
		mapCode2XY.put("CX158", new double[] { 0.05357146326691, 0.0146715328908633 });
		mapCode2XY.put("CX16", new double[] { -0.0859610512899527, 0.0197347268470348 });
		mapCode2XY.put("CX160", new double[] { 0.03971544128867, -0.0306692815296838 });
		mapCode2XY.put("CX161", new double[] { 0.0424999886647296, 0.0135498489075532 });
		mapCode2XY.put("CX162", new double[] { 0.0499049492216746, 0.0178596487416548 });
		mapCode2XY.put("CX165", new double[] { -0.0902349129604197, 0.0170902467910682 });
		mapCode2XY.put("CX17", new double[] { 0.048575096197528, 0.0150868316349045 });
		mapCode2XY.put("CX18", new double[] { 0.0458938616165422, 0.013249085045552 });
		mapCode2XY.put("CX182", new double[] { 0.0507373300737668, 0.0146825867164657 });
		mapCode2XY.put("CX19", new double[] { 0.0471139278754924, 0.0143055669316922 });
		mapCode2XY.put("CX2", new double[] { 0.0475306853643391, 0.0182063246299685 });
		mapCode2XY.put("CX20", new double[] { 0.0439583423128415, 0.0180262371025376 });
		mapCode2XY.put("CX205", new double[] { -0.0855684714494941, 0.0175248524303675 });
		mapCode2XY.put("CX206", new double[] { 0.0512349456339787, 0.0112737089510177 });
		mapCode2XY.put("CX207", new double[] { 0.0446671806884164, 0.0150179677044111 });
		mapCode2XY.put("CX21", new double[] { 0.0534795327430842, 0.0155304698935218 });
		mapCode2XY.put("CX210", new double[] { -0.0193897595710885, 0.0100547133013773 });
		mapCode2XY.put("CX211", new double[] { -0.0915626786485589, 0.016093247728607 });
		mapCode2XY.put("CX212", new double[] { -0.0910243827471657, 0.0160950488585671 });
		mapCode2XY.put("CX213", new double[] { -0.0803314255945563, 0.0136876141791804 });
		mapCode2XY.put("CX214", new double[] { -0.0912334232571568, 0.0162139245402943 });
		mapCode2XY.put("CX218", new double[] { 0.0435068816870882, 0.0169268799597063 });
		mapCode2XY.put("CX219", new double[] { 0.0522778509434924, 0.0114406200727007 });
		mapCode2XY.put("CX22", new double[] { 0.0489340979485863, 0.0157174448741334 });
		mapCode2XY.put("CX220", new double[] { -0.0910885678042272, 0.0157428641543258 });
		mapCode2XY.put("CX221", new double[] { 0.0513116675543481, 0.0147713059715071 });
		mapCode2XY.put("CX225", new double[] { 0.0415703020558621, 0.00930265987015673 });
		mapCode2XY.put("CX226", new double[] { 0.0439499259518183, 0.0173020470388482 });
		mapCode2XY.put("CX227", new double[] { 0.0024799588467562, -0.0841892028888125 });
		mapCode2XY.put("CX228", new double[] { 0.0274560598229375, -0.0474088200193102 });
		mapCode2XY.put("CX23", new double[] { 0.0539274393299209, 0.0148886433695562 });
		mapCode2XY.put("CX230", new double[] { 0.0528692763659632, 0.01520050281915 });
		mapCode2XY.put("CX231", new double[] { 0.0490025579286206, 0.0208036712475291 });
		mapCode2XY.put("CX232", new double[] { 0.0383448144921256, 0.0153169950488341 });
		mapCode2XY.put("CX233", new double[] { 0.0500138024553208, 0.0190061761891706 });
		mapCode2XY.put("CX234", new double[] { 0.0332832735663856, 0.00320684013924046 });
		mapCode2XY.put("CX235", new double[] { 0.0498797038978956, 0.0168363933737153 });
		mapCode2XY.put("CX236", new double[] { 0.0356281088762064, -0.0243350035893563 });
		mapCode2XY.put("CX237", new double[] { 0.0462823557728835, 0.0149013690848467 });
		mapCode2XY.put("CX238", new double[] { 0.0438227630046877, 0.0141541895707317 });
		mapCode2XY.put("CX24", new double[] { 0.0495634269088679, 0.000658307762174423 });
		mapCode2XY.put("CX240", new double[] { 0.052423611384143, 0.0205022194970917 });
		mapCode2XY.put("CX241", new double[] { -0.0924878156759885, 0.0167010475717935 });
		mapCode2XY.put("CX242", new double[] { -0.0254722909962163, 0.0197584100483756 });
		mapCode2XY.put("CX243", new double[] { -0.0580245404388376, 0.00897958429720887 });
		mapCode2XY.put("CX247", new double[] { 0.0334915875658457, 0.012582922941371 });
		mapCode2XY.put("CX248", new double[] { -0.0861846186546785, 0.0137922012851487 });
		mapCode2XY.put("CX249", new double[] { 0.02105757303319, 0.0131215058053661 });
		mapCode2XY.put("CX25", new double[] { 0.0519726127544915, 0.0179751130334031 });
		mapCode2XY.put("CX250", new double[] { 0.0483320791601508, 0.0172304352359391 });
		mapCode2XY.put("CX251", new double[] { -0.0921711999311419, 0.0162625767596445 });
		mapCode2XY.put("CX26", new double[] { 0.0483149448545391, 0.00946721475677497 });
		mapCode2XY.put("CX262", new double[] { -0.0870238868564134, 0.0176479750675309 });
		mapCode2XY.put("CX263", new double[] { 0.0396911424915863, 0.0144099689970709 });
		mapCode2XY.put("CX265", new double[] { 0.0402435856853647, 0.0150874373970222 });
		mapCode2XY.put("CX266", new double[] { -0.0850825297655743, 0.0150356849019423 });
		mapCode2XY.put("CX267", new double[] { 0.0472810457020101, 0.00445699344383634 });
		mapCode2XY.put("CX268", new double[] { 0.0292174206336593, 0.00860324743332394 });
		mapCode2XY.put("CX269", new double[] { -0.0918291283051919, 0.0176553539305156 });
		mapCode2XY.put("CX27", new double[] { 0.0430389248667022, 0.0129272978466635 });
		mapCode2XY.put("CX270", new double[] { 0.0343991318230522, 0.0119814277457766 });
		mapCode2XY.put("CX273", new double[] { 0.049387155846599, 0.0207479454884819 });
		mapCode2XY.put("CX274", new double[] { 0.0493725544497845, 0.0208292252350572 });
		mapCode2XY.put("CX275", new double[] { 0.0463252798453371, 0.0196193816394894 });
		mapCode2XY.put("CX276", new double[] { 0.0509648153497408, 0.0113764992926806 });
		mapCode2XY.put("CX277", new double[] { -0.076261964846762, 0.018599731698994 });
		mapCode2XY.put("CX278", new double[] { 0.0128301786925776, 0.0053867958506997 });
		mapCode2XY.put("CX28", new double[] { 0.032899147327356, 0.0205378564850508 });
		mapCode2XY.put("CX280", new double[] { -0.032003886975361, 0.00815259138779974 });
		mapCode2XY.put("CX281", new double[] { 0.0506391715866373, 0.0131346822720663 });
		mapCode2XY.put("CX282", new double[] { -0.0443975766090524, 0.00555333025028801 });
		mapCode2XY.put("CX284", new double[] { -0.050155504986642, 0.00980324498794962 });
		mapCode2XY.put("CX285", new double[] { -0.0821155766474766, 0.01832868409714 });
		mapCode2XY.put("CX286", new double[] { -0.0508249346727524, 0.0222540650973734 });
		mapCode2XY.put("CX287", new double[] { -0.0733330809363135, 0.0180978661281177 });
		mapCode2XY.put("CX288", new double[] { 0.0403828851875187, 0.0143539154247711 });
		mapCode2XY.put("CX29", new double[] { -0.0226302302753876, 0.0203238536926206 });
		mapCode2XY.put("CX290", new double[] { 0.0446117343740157, 0.0164411899775259 });
		mapCode2XY.put("CX291", new double[] { 0.040669523377289, 0.0146757290043049 });
		mapCode2XY.put("CX296", new double[] { 0.0502244170795322, 0.0130832141778244 });
		mapCode2XY.put("CX3", new double[] { 0.0529607382582665, 0.0130597066065493 });
		mapCode2XY.put("CX30", new double[] { 0.0414681955375046, 0.0179804481092259 });
		mapCode2XY.put("CX303", new double[] { 0.0457944001114464, 0.0159435790773699 });
		mapCode2XY.put("CX304", new double[] { 0.046730688397885, 0.0200441058277121 });
		mapCode2XY.put("CX305", new double[] { 0.0451782544801427, 0.0152340846217344 });
		mapCode2XY.put("CX306", new double[] { -0.0927852712404265, 0.0157104881796276 });
		mapCode2XY.put("CX307", new double[] { -0.0670841616039875, 0.0107478201849074 });
		mapCode2XY.put("CX31", new double[] { 0.0458557772846964, 0.0131096529388616 });
		mapCode2XY.put("CX313", new double[] { 0.0377994529567442, 0.0185532801857206 });
		mapCode2XY.put("CX314", new double[] { 0.0393013109423358, 0.0163343307414876 });
		mapCode2XY.put("CX315", new double[] { -0.0873681522760048, 0.0164393565339272 });
		mapCode2XY.put("CX316", new double[] { -0.0396417738663, 0.026425931184824 });
		mapCode2XY.put("CX317", new double[] { -0.0624257056318596, 0.0209525750903093 });
		mapCode2XY.put("CX318", new double[] { 0.0510006210850705, 0.0131937132603953 });
		mapCode2XY.put("CX319", new double[] { 0.0505632831299642, 0.0147886636374602 });
		mapCode2XY.put("CX32", new double[] { -0.0648721175100501, 0.0148785629183305 });
		mapCode2XY.put("CX328", new double[] { 0.0520199359947797, 0.0158010363487581 });
		mapCode2XY.put("CX329", new double[] { -0.0921956377400675, 0.0168566586871261 });
		mapCode2XY.put("CX33", new double[] { 0.0522817828777943, 0.0126237164711221 });
		mapCode2XY.put("CX330", new double[] { -0.0923876190659319, 0.0169522436904476 });
		mapCode2XY.put("CX34", new double[] { 0.0320162407877677, 0.000544589758087706 });
		mapCode2XY.put("CX340", new double[] { 0.0327448018851584, 0.0181096876374669 });
		mapCode2XY.put("CX341", new double[] { 0.0512227684407422, 0.0171815788860984 });
		mapCode2XY.put("CX342", new double[] { 0.0304043080886594, 0.014509244896903 });
		mapCode2XY.put("CX343", new double[] { 0.0252179481483199, 0.0155286470918427 });
		mapCode2XY.put("CX344", new double[] { -0.090291280684664, 0.0179395406732336 });
		mapCode2XY.put("CX345", new double[] { -0.0918277173289019, 0.013860402720306 });
		mapCode2XY.put("CX346", new double[] { 0.0476061635298906, 0.0142577243454001 });
		mapCode2XY.put("CX347", new double[] { 0.0303174531293175, 0.0136011560861044 });
		mapCode2XY.put("CX348", new double[] { 0.0526441868163431, 0.0166871028490378 });
		mapCode2XY.put("CX349", new double[] { 0.0509703288506625, 0.0149985900584699 });
		mapCode2XY.put("CX35", new double[] { 0.0463924276500386, 0.015188450759015 });
		mapCode2XY.put("CX350", new double[] { -0.0875301822047816, 0.0188491314739022 });
		mapCode2XY.put("CX351", new double[] { -0.0793512807853053, 0.0189341411022409 });
		mapCode2XY.put("CX352", new double[] { -0.077468096037922, 0.0175788317408872 });
		mapCode2XY.put("CX353", new double[] { -0.0766673195419134, 0.0210754763647117 });
		mapCode2XY.put("CX354", new double[] { -0.0840514922679953, 0.0146311402999432 });
		mapCode2XY.put("CX355", new double[] { -0.0781946047153898, 0.0148970410400791 });
		mapCode2XY.put("CX356", new double[] { -0.0920571331700054, 0.0164096947052146 });
		mapCode2XY.put("CX357", new double[] { 0.0466788550493293, 0.0139093152922344 });
		mapCode2XY.put("CX358", new double[] { 0.0434482618421178, 0.0115493412001668 });
		mapCode2XY.put("CX359", new double[] { -0.0862754658410648, 0.0154087288364401 });
		mapCode2XY.put("CX360", new double[] { 0.0477162330557498, 0.0136288049797344 });
		mapCode2XY.put("CX361", new double[] { 0.037711071930431, 0.0144359264472309 });
		mapCode2XY.put("CX362", new double[] { 0.044939460286262, 0.0179308690099242 });
		mapCode2XY.put("CX363", new double[] { 0.0329279924827406, 0.0149811027855555 });
		mapCode2XY.put("CX364", new double[] { 0.0493367424397923, 0.0114899631291488 });
		mapCode2XY.put("CX365", new double[] { -0.0202577583881309, 0.0119530428470366 });
		mapCode2XY.put("CX366", new double[] { 0.0447342203602769, 0.0162570499263756 });
		mapCode2XY.put("CX367", new double[] { -0.0600638232740135, -0.0315387083805969 });
		mapCode2XY.put("CX368", new double[] { -0.00646408935732314, -0.132221006718766 });
		mapCode2XY.put("CX369", new double[] { 0.0468036489436799, 0.0120554625751278 });
		mapCode2XY.put("CX37", new double[] { 0.048748669949693, 0.0163165726858258 });
		mapCode2XY.put("CX370", new double[] { 0.041946880267573, 0.0183673199791511 });
		mapCode2XY.put("CX371", new double[] { -0.0736612963812365, 0.0136635569625629 });
		mapCode2XY.put("CX372", new double[] { -0.076353868068552, 0.0138475945017027 });
		mapCode2XY.put("CX373", new double[] { -0.0925037636093614, 0.0142926194354904 });
		mapCode2XY.put("CX374", new double[] { -0.092560481021469, 0.0137846342936815 });
		mapCode2XY.put("CX375", new double[] { 0.0477454584068833, 0.0117109112852608 });
		mapCode2XY.put("CX376", new double[] { 0.0361526948099416, 0.0102319209454723 });
		mapCode2XY.put("CX377", new double[] { 0.050705809990648, 0.0146019295870287 });
		mapCode2XY.put("CX378", new double[] { 0.0487026150952, 0.0155846579362432 });
		mapCode2XY.put("CX379", new double[] { 0.045807999488274, 0.0087577263175228 });
		mapCode2XY.put("CX380", new double[] { -0.086704987648382, 0.0173743231051239 });
		mapCode2XY.put("CX381", new double[] { 0.0499660933082836, 0.00838814399152593 });
		mapCode2XY.put("CX382", new double[] { 0.0516781518244539, 0.0247683760845593 });
		mapCode2XY.put("CX383", new double[] { -0.0863235574631224, 0.0108461512712868 });
		mapCode2XY.put("CX384", new double[] { -0.0872921693356078, 0.01119119004534 });
		mapCode2XY.put("CX385", new double[] { 0.0441824882231374, 0.0132419678358016 });
		mapCode2XY.put("CX386", new double[] { 0.0445468985983014, 0.0140229033022353 });
		mapCode2XY.put("CX387", new double[] { 0.0465012251157578, 0.0185004131173849 });
		mapCode2XY.put("CX388", new double[] { 0.0442791006022489, 0.0143344576216488 });
		mapCode2XY.put("CX389", new double[] { -0.0713781737115362, 0.0190939107946359 });
		mapCode2XY.put("CX390", new double[] { 0.0373884339864214, 0.00237326149948749 });
		mapCode2XY.put("CX391", new double[] { -0.0915206502275399, 0.013884841668015 });
		mapCode2XY.put("CX392", new double[] { 0.0546939721253143, 0.0205595275507039 });
		mapCode2XY.put("CX393", new double[] { 0.0505991599933526, 0.0182313602169894 });
		mapCode2XY.put("CX394", new double[] { 0.0501705120982895, 0.0209546637975792 });
		mapCode2XY.put("CX395", new double[] { -0.0252427521936682, 0.0124535446692355 });
		mapCode2XY.put("CX396", new double[] { -0.0924354969337396, 0.0152926898325063 });
		mapCode2XY.put("CX397", new double[] { -0.090826853641973, 0.0173287858990445 });
		mapCode2XY.put("CX399", new double[] { 0.0460254936345059, 0.0124923459736126 });
		mapCode2XY.put("CX4", new double[] { -0.0155216975701798, 0.00437530393835586 });
		mapCode2XY.put("CX400", new double[] { -0.0234380488148508, -0.00545093296570518 });
		mapCode2XY.put("CX401", new double[] { -0.00239524059041314, -0.00875761889398662 });
		mapCode2XY.put("CX402", new double[] { -0.0549233879714971, -0.0188073477788646 });
		mapCode2XY.put("CX403", new double[] { 0.0521919883043905, 0.0145308802205316 });
		mapCode2XY.put("CX42", new double[] { 0.0466650255085743, 0.0142938867472743 });
		mapCode2XY.put("CX43", new double[] { 0.0497328471803188, 0.0132382868807793 });
		mapCode2XY.put("CX431", new double[] { 0.0443816723783567, 0.0177773565712259 });
		mapCode2XY.put("CX44", new double[] { 0.0472899686397435, 0.0152005020597358 });
		mapCode2XY.put("CX45", new double[] { 0.0551471162188489, 0.0167696630129129 });
		mapCode2XY.put("CX46", new double[] { -0.00566898053871583, -0.010715731153515 });
		mapCode2XY.put("CX47", new double[] { -0.0925086609983433, 0.0180289286287422 });
		mapCode2XY.put("CX48", new double[] { 0.0423267955865326, 0.018066145891081 });
		mapCode2XY.put("CX49", new double[] { -0.0613599148068505, 0.0169279091614926 });
		mapCode2XY.put("CX5", new double[] { 0.034676846623094, 0.0208323824828399 });
		mapCode2XY.put("CX50", new double[] { 0.0500527995967635, 0.0132423788404707 });
		mapCode2XY.put("CX51", new double[] { 0.0204921708435018, 0.00806309743195238 });
		mapCode2XY.put("CX52", new double[] { 0.0500421223245545, 0.01484188239034 });
		mapCode2XY.put("CX53", new double[] { 0.0546576928532241, 0.0180678015631551 });
		mapCode2XY.put("CX534", new double[] { -0.0829250240796698, 0.0166362673171169 });
		mapCode2XY.put("CX54", new double[] { 0.0451939858663807, 0.0113343645976059 });
		mapCode2XY.put("CX542", new double[] { 0.0242995671840797, -0.0129828569546368 });
		mapCode2XY.put("CX548", new double[] { 0.0403721317425585, 0.0181535463424743 });
		mapCode2XY.put("CX55", new double[] { 0.0509890878247367, 0.0133369455693123 });
		mapCode2XY.put("CX56", new double[] { -0.091811954008892, 0.0155499070618381 });
		mapCode2XY.put("CX57", new double[] { -0.0732991698497731, 0.0197357664194706 });
		mapCode2XY.put("CX58", new double[] { -0.0941540812047311, 0.018315312284925 });
		mapCode2XY.put("CX59", new double[] { -0.0670984470235639, -0.0304862582258948 });
		mapCode2XY.put("CX6", new double[] { -0.0390119396453588, 0.0261651540653865 });
		mapCode2XY.put("CX60", new double[] { 0.0274863497511984, 0.0101031071971896 });
		mapCode2XY.put("CX61", new double[] { 0.0452299401412741, 0.0130523694149312 });
		mapCode2XY.put("CX63", new double[] { -0.00581622938666582, -0.136402637315932 });
		mapCode2XY.put("CX64", new double[] { 0.040883449449434, 0.0159443021282249 });
		mapCode2XY.put("CX65", new double[] { -0.0770048072074741, -0.0304364737629893 });
		mapCode2XY.put("CX66", new double[] { -0.0772661066587188, -0.0290964194048166 });
		mapCode2XY.put("CX67", new double[] { -0.0777261876646468, -0.0287025583681494 });
		mapCode2XY.put("CX68", new double[] { 0.0514310271723548, 0.0172507998945099 });
		mapCode2XY.put("CX69", new double[] { 0.00298705146311652, -0.00528977569608407 });
		mapCode2XY.put("CX70", new double[] { 0.0492092784911592, 0.0153016467584586 });
		mapCode2XY.put("CX71", new double[] { 0.0532234354075029, 0.0178596333271504 });
		mapCode2XY.put("CX72", new double[] { -0.0324802911186786, -0.0340084533405446 });
		mapCode2XY.put("CX73", new double[] { 0.0533734428364637, 0.017625121333148 });
		mapCode2XY.put("CX74", new double[] { -0.0927859184855817, 0.0161459854377482 });
		mapCode2XY.put("CX75", new double[] { 0.0475464543142401, 0.0122216432049912 });
		mapCode2XY.put("CX76", new double[] { 0.0486304626359216, 0.0142525350266849 });
		mapCode2XY.put("CX77", new double[] { -0.084204338095943, 0.015461564606635 });
		mapCode2XY.put("CX78", new double[] { -0.0900298415207236, 0.0153356771576602 });
		mapCode2XY.put("CX79", new double[] { 0.0502866642074758, 0.0155050929812307 });
		mapCode2XY.put("CX8", new double[] { 0.0370342443339238, 0.0177143073523437 });
		mapCode2XY.put("CX80", new double[] { 0.0550947830123347, 0.0177969294363581 });
		mapCode2XY.put("CX82", new double[] { 0.0491122811936588, 0.0173025924062405 });
		mapCode2XY.put("CX83", new double[] { 0.0534744767006859, 0.0174631562992149 });
		mapCode2XY.put("CX84", new double[] { 0.0522983109260224, 0.0167580507857929 });
		mapCode2XY.put("CX85", new double[] { 0.0520981057375225, 0.0104434983592761 });
		mapCode2XY.put("CX86", new double[] { 0.0333462585493912, 0.0117632833907716 });
		mapCode2XY.put("CX87", new double[] { 0.0470994000773658, 0.0162765216179661 });
		mapCode2XY.put("CX88", new double[] { 0.0472852169544284, 0.0107001523127231 });
		mapCode2XY.put("CX89", new double[] { 0.0246121136755829, 0.00749729202556022 });
		mapCode2XY.put("CX9", new double[] { 0.044913652746011, 0.0178933831572383 });
		mapCode2XY.put("CX90", new double[] { 0.0225365365203048, 0.0167055615013119 });
		mapCode2XY.put("CX91", new double[] { 0.0489960654518063, 0.0129611725380829 });
		mapCode2XY.put("CX92", new double[] { 0.0510664394465171, 0.0133385982806361 });
		mapCode2XY.put("CX93", new double[] { 0.0357749933659026, 0.00860297072494128 });
		mapCode2XY.put("CX94", new double[] { 0.0556867582535584, 0.0128219730884925 });
		mapCode2XY.put("CX96", new double[] { 0.052842135370489, 0.0135247899759294 });
		mapCode2XY.put("CX97", new double[] { 0.0552687889779895, 0.0151540542928589 });
		mapCode2XY.put("CX98", new double[] { 0.046762126831994, -0.0256049115419343 });
		mapCode2XY.put("CX99", new double[] { 0.0479953339007092, -0.0121959127055964 });
		mapCode2XY.put("IRIS_313-10000", new double[] { 0.0405197116554878, 0.0216962827233234 });
		mapCode2XY.put("IRIS_313-10001", new double[] { 0.0497694036391827, 0.0155679775884577 });
		mapCode2XY.put("IRIS_313-10002", new double[] { 0.0462870590069618, 0.0156049961060968 });
		mapCode2XY.put("IRIS_313-10007", new double[] { 0.0487016046342164, 0.0122890866371673 });
		mapCode2XY.put("IRIS_313-10010", new double[] { 0.0472950315619377, -0.00395479200071827 });
		mapCode2XY.put("IRIS_313-10014", new double[] { -0.0930250548457124, 0.0185187813402129 });
		mapCode2XY.put("IRIS_313-10016", new double[] { 0.0492769008937632, 0.0210125730594422 });
		mapCode2XY.put("IRIS_313-10020", new double[] { -0.0294985552889068, -0.122261094142219 });
		mapCode2XY.put("IRIS_313-10025", new double[] { -0.0805404372714061, -0.0138971555664824 });
		mapCode2XY.put("IRIS_313-10026", new double[] { 0.0330158826062719, -0.0265720488444493 });
		mapCode2XY.put("IRIS_313-10030", new double[] { 0.031348124488424, -0.0391136219810062 });
		mapCode2XY.put("IRIS_313-10032", new double[] { -0.0745248340141647, -0.0352523028219838 });
		mapCode2XY.put("IRIS_313-10034", new double[] { 0.0494463611151028, 0.0139681671366737 });
		mapCode2XY.put("IRIS_313-10035", new double[] { 0.0100803192036891, 0.00628450135878346 });
		mapCode2XY.put("IRIS_313-10040", new double[] { 0.045547142537167, 0.0169620661131481 });
		mapCode2XY.put("IRIS_313-10041", new double[] { -0.0891559153043164, 0.0179359759932645 });
		mapCode2XY.put("IRIS_313-10045", new double[] { 0.0517420086955459, 0.00510205256052191 });
		mapCode2XY.put("IRIS_313-10046", new double[] { 0.0531706108800338, 0.0101137203294409 });
		mapCode2XY.put("IRIS_313-10047", new double[] { 0.049660223817492, 0.0178335516162723 });
		mapCode2XY.put("IRIS_313-10048", new double[] { 0.039788057028569, -0.0220614316395996 });
		mapCode2XY.put("IRIS_313-10050", new double[] { 0.0503329541393492, -0.00835306727252166 });
		mapCode2XY.put("IRIS_313-10051", new double[] { -0.092567392982474, 0.0184253449250499 });
		mapCode2XY.put("IRIS_313-10054", new double[] { 0.033607236301908, 0.0169522083507868 });
		mapCode2XY.put("IRIS_313-10056", new double[] { -0.0874931385332112, 0.010372810913701 });
		mapCode2XY.put("IRIS_313-10057", new double[] { -0.0926876287729969, 0.0163018550122272 });
		mapCode2XY.put("IRIS_313-10059", new double[] { -0.089512823736738, 0.0151066303308973 });
		mapCode2XY.put("IRIS_313-10061", new double[] { -0.0795807869870443, 0.0124692402162281 });
		mapCode2XY.put("IRIS_313-10062", new double[] { -0.0934945751851015, 0.0192647885785558 });
		mapCode2XY.put("IRIS_313-10065", new double[] { -0.0820182188380991, 0.0186012467681206 });
		mapCode2XY.put("IRIS_313-10067", new double[] { -0.0819736543292742, 0.0188434113468193 });
		mapCode2XY.put("IRIS_313-10071", new double[] { -0.0829821724807562, 0.0189180770543833 });
		mapCode2XY.put("IRIS_313-10073", new double[] { -0.0808538629166476, 0.0197230978192321 });
		mapCode2XY.put("IRIS_313-10074", new double[] { -0.0818618912818756, 0.0193734038993103 });
		mapCode2XY.put("IRIS_313-10075", new double[] { -0.0826745553573522, 0.0187944726294915 });
		mapCode2XY.put("IRIS_313-10076", new double[] { -0.0815605151697175, 0.0201626562464997 });
		mapCode2XY.put("IRIS_313-10077", new double[] { 0.0539770143180205, 0.00882068948653849 });
		mapCode2XY.put("IRIS_313-10078", new double[] { -0.0819363638767059, 0.0188887397626866 });
		mapCode2XY.put("IRIS_313-10079", new double[] { -0.0820094725596488, 0.0189731449087262 });
		mapCode2XY.put("IRIS_313-10080", new double[] { -0.0809883985917384, 0.019702042562058 });
		mapCode2XY.put("IRIS_313-10082", new double[] { -0.0835522745345346, 0.0196312048924314 });
		mapCode2XY.put("IRIS_313-10083", new double[] { -0.0962626065288863, 0.0189789346003636 });
		mapCode2XY.put("IRIS_313-10084", new double[] { -0.095785103562252, 0.0171801328113311 });
		mapCode2XY.put("IRIS_313-10089", new double[] { -0.0945379870975146, 0.0165111141112702 });
		mapCode2XY.put("IRIS_313-10092", new double[] { -0.0919822743159438, 0.0156564355723672 });
		mapCode2XY.put("IRIS_313-10093", new double[] { -0.0935710975355268, 0.0163890562190375 });
		mapCode2XY.put("IRIS_313-10094", new double[] { -0.0816092412926634, 0.0187473054031591 });
		mapCode2XY.put("IRIS_313-10096", new double[] { -0.0815899786135136, 0.0179164585681553 });
		mapCode2XY.put("IRIS_313-10097", new double[] { -0.0918603896260413, 0.0136503317421834 });
		mapCode2XY.put("IRIS_313-10099", new double[] { -0.0879939050636338, 0.0156492137486968 });
		mapCode2XY.put("IRIS_313-10102", new double[] { 0.0390756490577046, -0.0367777913493156 });
		mapCode2XY.put("IRIS_313-10103", new double[] { 0.0325951515450507, 0.00769947438809207 });
		mapCode2XY.put("IRIS_313-10109", new double[] { 0.0523717545625521, 0.0168804832753007 });
		mapCode2XY.put("IRIS_313-10111", new double[] { -0.0923891369746994, 0.0195107552705313 });
		mapCode2XY.put("IRIS_313-10113", new double[] { 0.0482698763759691, 0.0170168025395095 });
		mapCode2XY.put("IRIS_313-10114", new double[] { 0.0192065611083793, -0.0370836236018285 });
		mapCode2XY.put("IRIS_313-10119", new double[] { -0.0934957806030463, 0.020089616811073 });
		mapCode2XY.put("IRIS_313-10124", new double[] { -0.0939247227522286, 0.0140514664453736 });
		mapCode2XY.put("IRIS_313-10129", new double[] { 0.0488663328701598, 0.0121878419079563 });
		mapCode2XY.put("IRIS_313-10134", new double[] { 0.0435317530315319, 0.0117964939810719 });
		mapCode2XY.put("IRIS_313-10147", new double[] { 0.0539618639185676, 0.0197463594729039 });
		mapCode2XY.put("IRIS_313-10148", new double[] { 0.0511598471770253, 0.0125733397142364 });
		mapCode2XY.put("IRIS_313-10150", new double[] { -0.00468721210658431, -0.12804199186977 });
		mapCode2XY.put("IRIS_313-10151", new double[] { 0.0530090139802189, 0.0194938290342971 });
		mapCode2XY.put("IRIS_313-10152", new double[] { -0.0866866084780364, 0.0145173646541118 });
		mapCode2XY.put("IRIS_313-10154", new double[] { 0.0508951131114977, 0.0159619639962385 });
		mapCode2XY.put("IRIS_313-10158", new double[] { 0.0314351450842597, 0.0117499090993997 });
		mapCode2XY.put("IRIS_313-10161", new double[] { 0.0527026325194481, 0.0187542516436439 });
		mapCode2XY.put("IRIS_313-10164", new double[] { -0.0941443898609107, 0.0171215379650784 });
		mapCode2XY.put("IRIS_313-10167", new double[] { 0.0514708097217318, 0.014939440520178 });
		mapCode2XY.put("IRIS_313-10168", new double[] { 0.0531584961049907, 0.0133458926052272 });
		mapCode2XY.put("IRIS_313-10170", new double[] { 0.0524868386391797, 0.0155381960858386 });
		mapCode2XY.put("IRIS_313-10171", new double[] { 0.0365301115090641, 0.0131907331369678 });
		mapCode2XY.put("IRIS_313-10176", new double[] { -0.0873621875585365, 0.0114806594345399 });
		mapCode2XY.put("IRIS_313-10177", new double[] { 0.048505292008219, 0.0145588242594394 });
		mapCode2XY.put("IRIS_313-10178", new double[] { 0.0443208439929059, 0.0102226444571457 });
		mapCode2XY.put("IRIS_313-10179", new double[] { 0.0519715555154672, 0.0141037528069833 });
		mapCode2XY.put("IRIS_313-10189", new double[] { 0.0482792776154895, 0.0137417221330536 });
		mapCode2XY.put("IRIS_313-10190", new double[] { 0.0468309675531056, 0.0089099897412525 });
		mapCode2XY.put("IRIS_313-10191", new double[] { 0.0495780746187526, 0.0148444140766225 });
		mapCode2XY.put("IRIS_313-10196", new double[] { -0.0835515550606017, 0.0163992176014685 });
		mapCode2XY.put("IRIS_313-10211", new double[] { 0.052246817640308, 0.0127308104609963 });
		mapCode2XY.put("IRIS_313-10220", new double[] { 0.050764407555361, 0.0134651664429728 });
		mapCode2XY.put("IRIS_313-10221", new double[] { 0.0500443845234822, 0.0157419612292966 });
		mapCode2XY.put("IRIS_313-10224", new double[] { 0.0504940709538226, 0.0134105847495717 });
		mapCode2XY.put("IRIS_313-10226", new double[] { 0.0442957514684395, 0.0138719308298292 });
		mapCode2XY.put("IRIS_313-10228", new double[] { -0.0827262063481608, 0.0129548533181981 });
		mapCode2XY.put("IRIS_313-10234", new double[] { 0.0479583544493295, 0.0160437296912166 });
		mapCode2XY.put("IRIS_313-10235", new double[] { 0.052801788341672, 0.0109193339571436 });
		mapCode2XY.put("IRIS_313-10237", new double[] { 0.0529054176521057, 0.014508269683032 });
		mapCode2XY.put("IRIS_313-10238", new double[] { 0.051536564070963, 0.0146167090784009 });
		mapCode2XY.put("IRIS_313-10239", new double[] { 0.0459294741055651, 0.0127910278870373 });
		mapCode2XY.put("IRIS_313-10242", new double[] { -0.090813862454188, 0.0168916022628001 });
		mapCode2XY.put("IRIS_313-10247", new double[] { 0.0422228370438143, 0.0176691250298765 });
		mapCode2XY.put("IRIS_313-10257", new double[] { 0.0384134408806128, 0.0159310366496802 });
		mapCode2XY.put("IRIS_313-10258", new double[] { -0.0971640950156761, 0.0173380487857709 });
		mapCode2XY.put("IRIS_313-10260", new double[] { 0.0506362413927718, 0.0132601105518164 });
		mapCode2XY.put("IRIS_313-10263", new double[] { 0.0273336320551677, 0.015611635969214 });
		mapCode2XY.put("IRIS_313-10268", new double[] { 0.02382808091676, 0.0222855428814033 });
		mapCode2XY.put("IRIS_313-10271", new double[] { 0.0509264721934652, 0.0188231633128846 });
		mapCode2XY.put("IRIS_313-10272", new double[] { -0.0587812210050916, 0.0191546087204792 });
		mapCode2XY.put("IRIS_313-10274", new double[] { 0.0443611199591607, 0.0142381351679941 });
		mapCode2XY.put("IRIS_313-10275", new double[] { 0.0462686839343806, 0.018774224460494 });
		mapCode2XY.put("IRIS_313-10279", new double[] { 0.0560728664001125, 0.0230639300664396 });
		mapCode2XY.put("IRIS_313-10285", new double[] { 0.041291298502825, 0.0167705535800589 });
		mapCode2XY.put("IRIS_313-10287", new double[] { 0.0358932005568088, 0.0191984306308837 });
		mapCode2XY.put("IRIS_313-10289", new double[] { 0.0436231996995681, 0.0131605141862598 });
		mapCode2XY.put("IRIS_313-10290", new double[] { 0.0531436351729878, 0.0102609591713232 });
		mapCode2XY.put("IRIS_313-10293", new double[] { 0.0426339645913601, 0.0167266483588218 });
		mapCode2XY.put("IRIS_313-10294", new double[] { 0.0469553174814721, 0.01457329026604 });
		mapCode2XY.put("IRIS_313-10295", new double[] { -0.0803455267383477, -0.0198115483160704 });
		mapCode2XY.put("IRIS_313-10298", new double[] { 0.048610968003545, 0.0114553857900098 });
		mapCode2XY.put("IRIS_313-10300", new double[] { 0.0231054296069164, 0.0202803096569062 });
		mapCode2XY.put("IRIS_313-10301", new double[] { 0.032267275456043, 0.0201909565943854 });
		mapCode2XY.put("IRIS_313-10307", new double[] { 0.055730265366333, 0.0195139176124049 });
		mapCode2XY.put("IRIS_313-10314", new double[] { 0.0496566732620766, 0.0188516671098189 });
		mapCode2XY.put("IRIS_313-10318", new double[] { 0.0321504606820076, 0.0106900791444385 });
		mapCode2XY.put("IRIS_313-10325", new double[] { 0.0338255181426113, 0.0144525511367566 });
		mapCode2XY.put("IRIS_313-10327", new double[] { -0.0905267184252446, 0.0197684958458816 });
		mapCode2XY.put("IRIS_313-10332", new double[] { 0.0530036108622226, 0.0168613140584998 });
		mapCode2XY.put("IRIS_313-10333", new double[] { 0.0483498578376405, 0.0150126597485256 });
		mapCode2XY.put("IRIS_313-10334", new double[] { 0.0450924797048209, 0.0152246908164203 });
		mapCode2XY.put("IRIS_313-10336", new double[] { -0.0896006059506393, 0.0158869792216625 });
		mapCode2XY.put("IRIS_313-10337", new double[] { 0.0483960322849344, 0.0188291929580618 });
		mapCode2XY.put("IRIS_313-10340", new double[] { 0.0538077702944025, 0.0114893656380104 });
		mapCode2XY.put("IRIS_313-10341", new double[] { 0.0470221687504241, 0.00992916882046839 });
		mapCode2XY.put("IRIS_313-10348", new double[] { 0.0325495838265524, -0.000420099867795745 });
		mapCode2XY.put("IRIS_313-10349", new double[] { 0.04430335503017, 0.00894070793522477 });
		mapCode2XY.put("IRIS_313-10352", new double[] { 0.0367500334041458, 0.0112255386912874 });
		mapCode2XY.put("IRIS_313-10353", new double[] { 0.0444655499477481, 0.0100518395797106 });
		mapCode2XY.put("IRIS_313-10355", new double[] { 0.0458541415258414, 0.00659988422229687 });
		mapCode2XY.put("IRIS_313-10357", new double[] { 0.0507542168832333, 0.00851090330405571 });
		mapCode2XY.put("IRIS_313-10359", new double[] { 0.0391534306059653, -0.0306424327728625 });
		mapCode2XY.put("IRIS_313-10360", new double[] { 0.0491163733505885, 0.010004603186682 });
		mapCode2XY.put("IRIS_313-10361", new double[] { 0.0519273146587434, 0.0051423976339008 });
		mapCode2XY.put("IRIS_313-10366", new double[] { 0.0457436970079816, -0.013566469445409 });
		mapCode2XY.put("IRIS_313-10371", new double[] { 0.0406421150603135, -0.0189143217134236 });
		mapCode2XY.put("IRIS_313-10373", new double[] { -0.0928029371374364, 0.0164015779142621 });
		mapCode2XY.put("IRIS_313-10374", new double[] { 0.0441612290277005, 0.0114367205195464 });
		mapCode2XY.put("IRIS_313-10375", new double[] { 0.0419574190167197, -0.0199017160812159 });
		mapCode2XY.put("IRIS_313-10379", new double[] { -0.0930935535226727, 0.0172023676046928 });
		mapCode2XY.put("IRIS_313-10380", new double[] { -0.00392854064617659, -0.101175519499947 });
		mapCode2XY.put("IRIS_313-10385", new double[] { 0.0483677070415826, 0.011595398347597 });
		mapCode2XY.put("IRIS_313-10392", new double[] { 0.0448987831839838, 0.0158590606737891 });
		mapCode2XY.put("IRIS_313-10394", new double[] { 0.0459969529841324, 0.0149398243275467 });
		mapCode2XY.put("IRIS_313-10396", new double[] { 0.0436871722702925, 0.0115861425850357 });
		mapCode2XY.put("IRIS_313-10397", new double[] { 0.0510616006590468, 0.0164750356223061 });
		mapCode2XY.put("IRIS_313-10398", new double[] { 0.0504121750587439, 0.0169480118313256 });
		mapCode2XY.put("IRIS_313-10399", new double[] { 0.0512665943402904, 0.0202983489037857 });
		mapCode2XY.put("IRIS_313-10400", new double[] { 0.0441719370845678, 0.0209580246341034 });
		mapCode2XY.put("IRIS_313-10401", new double[] { 0.0491172892234954, 0.0174122445353973 });
		mapCode2XY.put("IRIS_313-10402", new double[] { 0.0527215110599494, 0.016365631029044 });
		mapCode2XY.put("IRIS_313-10403", new double[] { 0.0524481691850468, 0.0212144794750469 });
		mapCode2XY.put("IRIS_313-10404", new double[] { 0.050422838392892, 0.0144266176332214 });
		mapCode2XY.put("IRIS_313-10412", new double[] { 0.0475276405872625, 0.0187308350087323 });
		mapCode2XY.put("IRIS_313-10417", new double[] { 0.0531594750308971, 0.0198094362711212 });
		mapCode2XY.put("IRIS_313-10421", new double[] { 0.0530507838208243, 0.0149714335756837 });
		mapCode2XY.put("IRIS_313-10422", new double[] { 0.0481438029032147, 0.00852729409492324 });
		mapCode2XY.put("IRIS_313-10423", new double[] { 0.0467934246903317, 0.0201184924715439 });
		mapCode2XY.put("IRIS_313-10428", new double[] { 0.0500879048508754, 0.0190164656201494 });
		mapCode2XY.put("IRIS_313-10429", new double[] { -0.0937088912044798, 0.0172039825557729 });
		mapCode2XY.put("IRIS_313-10430", new double[] { -0.0929391449182466, 0.0165243417477598 });
		mapCode2XY.put("IRIS_313-10433", new double[] { 0.0556253390643854, 0.013606328113726 });
		mapCode2XY.put("IRIS_313-10437", new double[] { -0.0928992681774044, 0.0169292001726697 });
		mapCode2XY.put("IRIS_313-10440", new double[] { -0.0865373452696044, 0.0144656934832286 });
		mapCode2XY.put("IRIS_313-10441", new double[] { 0.028317915077367, 0.00998846038000239 });
		mapCode2XY.put("IRIS_313-10444", new double[] { -0.0417504757587066, 0.00889967815653272 });
		mapCode2XY.put("IRIS_313-10448", new double[] { 0.0510966271990639, 0.0130028732613819 });
		mapCode2XY.put("IRIS_313-10449", new double[] { 0.025881670156084, 0.0151454953218826 });
		mapCode2XY.put("IRIS_313-10450", new double[] { 0.0460348434120926, 0.0140482141009849 });
		mapCode2XY.put("IRIS_313-10452", new double[] { 0.0500467315627218, 0.0161906660795528 });
		mapCode2XY.put("IRIS_313-10453", new double[] { -0.0899428686254903, 0.0165241674516061 });
		mapCode2XY.put("IRIS_313-10458", new double[] { 0.0508253712798518, 0.010707724156709 });
		mapCode2XY.put("IRIS_313-10459", new double[] { -0.0620569120979015, 0.0110429095997989 });
		mapCode2XY.put("IRIS_313-10469", new double[] { -0.0932297699470474, 0.015697897920244 });
		mapCode2XY.put("IRIS_313-10476", new double[] { 0.0507848709760064, -0.0110095890738382 });
		mapCode2XY.put("IRIS_313-10477", new double[] { 0.0439347324108305, 0.0154399999326762 });
		mapCode2XY.put("IRIS_313-10480", new double[] { 0.0558898712919714, 0.0120600803349748 });
		mapCode2XY.put("IRIS_313-10484", new double[] { -0.00868055016290287, 0.00486893791566659 });
		mapCode2XY.put("IRIS_313-10485", new double[] { -0.0871710348063657, 0.0179972129365051 });
		mapCode2XY.put("IRIS_313-10489", new double[] { -0.0838172511651694, 0.0141730022992804 });
		mapCode2XY.put("IRIS_313-10497", new double[] { 0.0455412415314897, 0.017166032100909 });
		mapCode2XY.put("IRIS_313-10502", new double[] { 0.0495436841767926, 0.0116974704126799 });
		mapCode2XY.put("IRIS_313-10503", new double[] { 0.0456253283322085, 0.0163125645743686 });
		mapCode2XY.put("IRIS_313-10504", new double[] { 0.0478563356000533, 0.0115591448903056 });
		mapCode2XY.put("IRIS_313-10506", new double[] { 0.0548395624128718, 0.0197135213764359 });
		mapCode2XY.put("IRIS_313-10507", new double[] { -0.0823459418091964, 0.0190841746679816 });
		mapCode2XY.put("IRIS_313-10509", new double[] { 0.0526011872548824, 0.0144077151501353 });
		mapCode2XY.put("IRIS_313-10510", new double[] { 0.032886068154305, 0.0126640632012195 });
		mapCode2XY.put("IRIS_313-10511", new double[] { 0.0575292295585806, 0.0157750546615229 });
		mapCode2XY.put("IRIS_313-10513", new double[] { 0.0466663364286503, 0.014026716829364 });
		mapCode2XY.put("IRIS_313-10514", new double[] { 0.0548480018094003, 0.0127577941462148 });
		mapCode2XY.put("IRIS_313-10515", new double[] { 0.0518154067676207, 0.0153260457637533 });
		mapCode2XY.put("IRIS_313-10516", new double[] { 0.0505920376573156, 0.00861598589763797 });
		mapCode2XY.put("IRIS_313-10517", new double[] { 0.0490636171378852, 0.0153924394175358 });
		mapCode2XY.put("IRIS_313-10518", new double[] { 0.0508156195997163, 0.0128831905896644 });
		mapCode2XY.put("IRIS_313-10519", new double[] { 0.0511177575931206, -0.0190383766853342 });
		mapCode2XY.put("IRIS_313-10520", new double[] { 0.0510801311860644, 0.00760286057658263 });
		mapCode2XY.put("IRIS_313-10521", new double[] { -0.0670124603448046, -0.0274885804020032 });
		mapCode2XY.put("IRIS_313-10522", new double[] { -0.025342982041924, 0.00417008751151438 });
		mapCode2XY.put("IRIS_313-10523", new double[] { 0.0382767871722707, -0.00773690776242239 });
		mapCode2XY.put("IRIS_313-10524", new double[] { 0.0544095506480788, 0.0192187746617145 });
		mapCode2XY.put("IRIS_313-10525", new double[] { 0.0545406825868906, 0.0161740102722903 });
		mapCode2XY.put("IRIS_313-10526", new double[] { 0.0488495888320638, -0.00574411373710872 });
		mapCode2XY.put("IRIS_313-10527", new double[] { 0.0441360154757167, -0.0125957756605404 });
		mapCode2XY.put("IRIS_313-10531", new double[] { -0.0048840166813144, -0.0248358084322581 });
		mapCode2XY.put("IRIS_313-10534", new double[] { -0.00423582593200662, -0.140576792072143 });
		mapCode2XY.put("IRIS_313-10536", new double[] { 0.0446851867791377, -0.0205673493859529 });
		mapCode2XY.put("IRIS_313-10537", new double[] { -0.0691905224577314, -0.0140567213253022 });
		mapCode2XY.put("IRIS_313-10539", new double[] { 0.0463021521083804, -0.0016056391692692 });
		mapCode2XY.put("IRIS_313-10541", new double[] { -0.0890451352015359, 0.0170863208286166 });
		mapCode2XY.put("IRIS_313-10542", new double[] { 0.049660200729475, -0.0114506815295143 });
		mapCode2XY.put("IRIS_313-10543", new double[] { -0.0155085946634389, -0.142011933397627 });
		mapCode2XY.put("IRIS_313-10544", new double[] { 0.0506543813669747, -0.0122259167741262 });
		mapCode2XY.put("IRIS_313-10545", new double[] { -0.00344985012545255, -0.126357012282319 });
		mapCode2XY.put("IRIS_313-10547", new double[] { 0.0540962539635329, 0.00602855375561153 });
		mapCode2XY.put("IRIS_313-10549", new double[] { -0.00831188151895131, -0.132314771535812 });
		mapCode2XY.put("IRIS_313-10550", new double[] { 0.0558876301165883, 0.00953776040799727 });
		mapCode2XY.put("IRIS_313-10552", new double[] { -0.0905008958295924, 0.0196181941966168 });
		mapCode2XY.put("IRIS_313-10554", new double[] { 0.0548423436161827, 0.0134758995909363 });
		mapCode2XY.put("IRIS_313-10555", new double[] { 0.052670360697868, 0.0189187537761951 });
		mapCode2XY.put("IRIS_313-10556", new double[] { 0.0521019533338857, 0.0187173978565562 });
		mapCode2XY.put("IRIS_313-10557", new double[] { 0.054284428163445, 0.0169468947160019 });
		mapCode2XY.put("IRIS_313-10558", new double[] { -0.0902124254555665, 0.0148280269821275 });
		mapCode2XY.put("IRIS_313-10559", new double[] { -0.0903231400449834, 0.01619560777736 });
		mapCode2XY.put("IRIS_313-10560", new double[] { 0.0462435687104031, 0.0148443410792276 });
		mapCode2XY.put("IRIS_313-10561", new double[] { 0.0512422516482314, 0.0127324052345108 });
		mapCode2XY.put("IRIS_313-10562", new double[] { -0.0690924317779018, 0.00836777379028632 });
		mapCode2XY.put("IRIS_313-10563", new double[] { -0.0950379210371254, 0.0137214630218542 });
		mapCode2XY.put("IRIS_313-10564", new double[] { -0.0915940383730487, 0.0168741345277642 });
		mapCode2XY.put("IRIS_313-10565", new double[] { 0.0527343450232428, 0.0144822676109555 });
		mapCode2XY.put("IRIS_313-10566", new double[] { 0.054162891881708, 0.0165682415177931 });
		mapCode2XY.put("IRIS_313-10567", new double[] { -0.0931779692346762, 0.0162978265233312 });
		mapCode2XY.put("IRIS_313-10568", new double[] { -0.0935557810629398, 0.0165653095275615 });
		mapCode2XY.put("IRIS_313-10569", new double[] { -0.0937124488662944, 0.0164668508051356 });
		mapCode2XY.put("IRIS_313-10570", new double[] { -0.092386859431194, 0.0163249589621177 });
		mapCode2XY.put("IRIS_313-10572", new double[] { 0.0366842662344766, -0.00167603152936468 });
		mapCode2XY.put("IRIS_313-10573", new double[] { 0.0545983995278265, 0.004586968942274 });
		mapCode2XY.put("IRIS_313-10574", new double[] { 0.0527290040733239, 0.00636647428793085 });
		mapCode2XY.put("IRIS_313-10575", new double[] { 0.0500944818020327, 0.0138790425928167 });
		mapCode2XY.put("IRIS_313-10576", new double[] { 0.0479171690356438, -0.00217652279071258 });
		mapCode2XY.put("IRIS_313-10577", new double[] { -0.0897973802964189, 0.014507377682543 });
		mapCode2XY.put("IRIS_313-10578", new double[] { -0.0851462415630269, 0.0158399549566348 });
		mapCode2XY.put("IRIS_313-10580", new double[] { -0.087277481841889, 0.0149761761251405 });
		mapCode2XY.put("IRIS_313-10581", new double[] { -0.0862506800531222, 0.0177967370948861 });
		mapCode2XY.put("IRIS_313-10582", new double[] { -0.0892003641752939, 0.0152608992826349 });
		mapCode2XY.put("IRIS_313-10583", new double[] { -0.0910522866096852, 0.0177067965987398 });
		mapCode2XY.put("IRIS_313-10585", new double[] { -0.0118104396266338, 0.0229281430687691 });
		mapCode2XY.put("IRIS_313-10587", new double[] { -0.00658113845340569, -0.143218695187651 });
		mapCode2XY.put("IRIS_313-10592", new double[] { -0.00858318813938332, -0.148576062011908 });
		mapCode2XY.put("IRIS_313-10593", new double[] { -0.00619020124799421, -0.146313527623271 });
		mapCode2XY.put("IRIS_313-10594", new double[] { -0.00827697257135297, -0.129302308390781 });
		mapCode2XY.put("IRIS_313-10595", new double[] { -0.0069809387689088, -0.146934920035558 });
		mapCode2XY.put("IRIS_313-10598", new double[] { -0.00922741021684517, -0.145795601039575 });
		mapCode2XY.put("IRIS_313-10600", new double[] { -0.00418235939707927, -0.139827727367049 });
		mapCode2XY.put("IRIS_313-10602", new double[] { 0.00116580852419834, -0.13750858665075 });
		mapCode2XY.put("IRIS_313-10603", new double[] { -0.00965610554411039, -0.145589704552041 });
		mapCode2XY.put("IRIS_313-10604", new double[] { -0.00392493936041209, -0.142052199707162 });
		mapCode2XY.put("IRIS_313-10605", new double[] { -0.00817816483220901, -0.139535934430257 });
		mapCode2XY.put("IRIS_313-10606", new double[] { -0.00597909671530954, -0.139998902668133 });
		mapCode2XY.put("IRIS_313-10608", new double[] { -0.0129695973694738, -0.135535981316235 });
		mapCode2XY.put("IRIS_313-10609", new double[] { 0.0369629647848084, -0.0218494392844528 });
		mapCode2XY.put("IRIS_313-10610", new double[] { 0.0515650678449735, -0.00973162180903264 });
		mapCode2XY.put("IRIS_313-10614", new double[] { 0.039235369992733, 0.0139598901132244 });
		mapCode2XY.put("IRIS_313-10617", new double[] { -0.089092996590885, 0.012179074579134 });
		mapCode2XY.put("IRIS_313-10618", new double[] { -0.0943686543731934, 0.0168338426311078 });
		mapCode2XY.put("IRIS_313-10619", new double[] { -0.0902099587559815, 0.0168245988378492 });
		mapCode2XY.put("IRIS_313-10620", new double[] { -0.088492055504598, 0.0156837360579636 });
		mapCode2XY.put("IRIS_313-10623", new double[] { -0.00122314426386358, -0.139518518279456 });
		mapCode2XY.put("IRIS_313-10628", new double[] { 0.0539786762219654, 0.000718850430873173 });
		mapCode2XY.put("IRIS_313-10631", new double[] { -0.0932640442535877, 0.0170122207280447 });
		mapCode2XY.put("IRIS_313-10640", new double[] { 0.0484887918054956, 0.000671751145210653 });
		mapCode2XY.put("IRIS_313-10642", new double[] { -0.0924504365561191, 0.0158843213811706 });
		mapCode2XY.put("IRIS_313-10644", new double[] { -0.0881923789010623, 0.0131693548396864 });
		mapCode2XY.put("IRIS_313-10645", new double[] { -0.0891644634631807, 0.0138749796157426 });
		mapCode2XY.put("IRIS_313-10648", new double[] { 0.0545848920432288, 0.0178326587835385 });
		mapCode2XY.put("IRIS_313-10649", new double[] { -0.083817906208899, 0.0157046717687331 });
		mapCode2XY.put("IRIS_313-10650", new double[] { 0.0505564868297212, 0.0156603906329091 });
		mapCode2XY.put("IRIS_313-10651", new double[] { 0.0484016353133198, 0.0127178019555812 });
		mapCode2XY.put("IRIS_313-10652", new double[] { 0.0546342761398135, 0.017742435693331 });
		mapCode2XY.put("IRIS_313-10653", new double[] { -0.0880929881649488, 0.013373946712006 });
		mapCode2XY.put("IRIS_313-10654", new double[] { 0.0483665379631866, 0.00861654098488654 });
		mapCode2XY.put("IRIS_313-10655", new double[] { 0.0470193906408035, 0.00810651927259371 });
		mapCode2XY.put("IRIS_313-10656", new double[] { -0.0863818935897352, 0.0137773664852142 });
		mapCode2XY.put("IRIS_313-10657", new double[] { -0.0864628515426227, 0.0132402810194053 });
		mapCode2XY.put("IRIS_313-10659", new double[] { 0.0487857035311727, 0.0170049067608603 });
		mapCode2XY.put("IRIS_313-10660", new double[] { -0.0890049845436952, 0.0150018763407994 });
		mapCode2XY.put("IRIS_313-10661", new double[] { 0.0493208310244388, -0.0109149607733543 });
		mapCode2XY.put("IRIS_313-10662", new double[] { 0.0490870787581809, -0.0188017920018249 });
		mapCode2XY.put("IRIS_313-10664", new double[] { 0.0546107860462431, -0.00476002793193442 });
		mapCode2XY.put("IRIS_313-10666", new double[] { 0.0543707927374418, 0.0124962383095304 });
		mapCode2XY.put("IRIS_313-10667", new double[] { 0.0451134888697649, -0.0125001424227535 });
		mapCode2XY.put("IRIS_313-10668", new double[] { 0.051098043998323, -0.00134431641324201 });
		mapCode2XY.put("IRIS_313-10670", new double[] { -0.07429127451319, -0.0157929977491414 });
		mapCode2XY.put("IRIS_313-10671", new double[] { 0.0375056160500054, -0.0238160910172115 });
		mapCode2XY.put("IRIS_313-10673", new double[] { -0.00502356030451272, -0.141968112325792 });
		mapCode2XY.put("IRIS_313-10674", new double[] { 0.0519187238186668, 0.0106417921288902 });
		mapCode2XY.put("IRIS_313-10675", new double[] { 0.0474708361741585, -0.00756350876974323 });
		mapCode2XY.put("IRIS_313-10676", new double[] { 0.0287429663786406, -0.0493903656424889 });
		mapCode2XY.put("IRIS_313-10677", new double[] { -0.0929827857682943, 0.015948342401504 });
		mapCode2XY.put("IRIS_313-10678", new double[] { 0.0548533510233515, -0.00216331406623304 });
		mapCode2XY.put("IRIS_313-10679", new double[] { -0.0896982114957645, 0.012361907067324 });
		mapCode2XY.put("IRIS_313-10680", new double[] { 0.0504588461896769, 0.0151613962444554 });
		mapCode2XY.put("IRIS_313-10681", new double[] { 0.049102150461283, 0.0202501316879484 });
		mapCode2XY.put("IRIS_313-10682", new double[] { 0.0531773331096003, 0.0136964458638749 });
		mapCode2XY.put("IRIS_313-10683", new double[] { 0.0523181038709114, 0.0138529608213198 });
		mapCode2XY.put("IRIS_313-10684", new double[] { 0.0497246080036288, 0.0163511110982495 });
		mapCode2XY.put("IRIS_313-10687", new double[] { 0.0531278813960869, 0.0192034955611327 });
		mapCode2XY.put("IRIS_313-10688", new double[] { 0.0524121104163139, 0.0186806399477264 });
		mapCode2XY.put("IRIS_313-10689", new double[] { -0.0860394077856612, 0.0143646582874818 });
		mapCode2XY.put("IRIS_313-10690", new double[] { 0.0173902262771249, 0.0109303845231651 });
		mapCode2XY.put("IRIS_313-10692", new double[] { 0.0512658679998118, 0.0189594332421205 });
		mapCode2XY.put("IRIS_313-10693", new double[] { -0.0864899078353785, 0.0134403764383659 });
		mapCode2XY.put("IRIS_313-10694", new double[] { 0.0513209629975801, 0.0197224462855099 });
		mapCode2XY.put("IRIS_313-10695", new double[] { 0.0539383150851693, 0.0184438322409998 });
		mapCode2XY.put("IRIS_313-10697", new double[] { 0.0504973156862679, 0.020009068810268 });
		mapCode2XY.put("IRIS_313-10698", new double[] { 0.0539946839851966, 0.0177173048113175 });
		mapCode2XY.put("IRIS_313-10699", new double[] { 0.0504418712853421, 0.0184665220921297 });
		mapCode2XY.put("IRIS_313-10700", new double[] { 0.0474984561126094, 0.0201858936997568 });
		mapCode2XY.put("IRIS_313-10701", new double[] { 0.0513964775921499, 0.0198056035683348 });
		mapCode2XY.put("IRIS_313-10702", new double[] { 0.0517845954058296, 0.0184137656305749 });
		mapCode2XY.put("IRIS_313-10703", new double[] { -0.0855075234382112, 0.012693769630404 });
		mapCode2XY.put("IRIS_313-10704", new double[] { -0.0831902783885254, 0.0149675699098045 });
		mapCode2XY.put("IRIS_313-10705", new double[] { 0.00791708811921036, 0.00127211378830391 });
		mapCode2XY.put("IRIS_313-10706", new double[] { 0.0533939263117804, 0.0162166853503811 });
		mapCode2XY.put("IRIS_313-10707", new double[] { 0.0533864129447651, 0.0177537971297917 });
		mapCode2XY.put("IRIS_313-10708", new double[] { -0.0900020120262703, 0.0196194595045469 });
		mapCode2XY.put("IRIS_313-10710", new double[] { -0.0879861238366269, 0.0180658416281477 });
		mapCode2XY.put("IRIS_313-10711", new double[] { -0.089481284789203, 0.0187478726349422 });
		mapCode2XY.put("IRIS_313-10712", new double[] { -0.0937015816350176, 0.0142277448498646 });
		mapCode2XY.put("IRIS_313-10715", new double[] { 0.0422140476421509, -0.0153591004498533 });
		mapCode2XY.put("IRIS_313-10716", new double[] { 0.0508496999514415, -0.0107022434881968 });
		mapCode2XY.put("IRIS_313-10717", new double[] { 0.0497803930981635, -0.0254804780318581 });
		mapCode2XY.put("IRIS_313-10718", new double[] { -0.0344270407072177, -0.127728138300007 });
		mapCode2XY.put("IRIS_313-10719", new double[] { 0.0497786591238108, -0.0122843577346455 });
		mapCode2XY.put("IRIS_313-10720", new double[] { 0.0375133402827765, 0.00276014108212473 });
		mapCode2XY.put("IRIS_313-10721", new double[] { 0.0497811276332166, -0.0145107977190306 });
		mapCode2XY.put("IRIS_313-10722", new double[] { -0.0857663915001311, 0.0126391120709126 });
		mapCode2XY.put("IRIS_313-10723", new double[] { 0.0519785225356341, 0.00386811273977376 });
		mapCode2XY.put("IRIS_313-10724", new double[] { 0.0547794105896836, 0.0108625652553841 });
		mapCode2XY.put("IRIS_313-10725", new double[] { 0.0558662140812159, 0.000456202000139507 });
		mapCode2XY.put("IRIS_313-10726", new double[] { 0.0535274188320725, 0.0158255226617372 });
		mapCode2XY.put("IRIS_313-10727", new double[] { 0.0536171274948998, 0.00766990678886584 });
		mapCode2XY.put("IRIS_313-10728", new double[] { 0.0545255563386689, -6.11969419616717E-05 });
		mapCode2XY.put("IRIS_313-10729", new double[] { -0.056123500972387, -0.0186475719488314 });
		mapCode2XY.put("IRIS_313-10730", new double[] { -0.0893357637302714, 0.0180522370025166 });
		mapCode2XY.put("IRIS_313-10731", new double[] { 0.0502602574032668, 0.00890478509585698 });
		mapCode2XY.put("IRIS_313-10732", new double[] { -0.0720387332043877, -0.0245419010148135 });
		mapCode2XY.put("IRIS_313-10733", new double[] { 0.0521696412542392, 0.0108141161080523 });
		mapCode2XY.put("IRIS_313-10734", new double[] { -0.0041257135518451, -0.125367685597223 });
		mapCode2XY.put("IRIS_313-10735", new double[] { 0.000168030193610658, -0.129276888540485 });
		mapCode2XY.put("IRIS_313-10736", new double[] { -0.0133800978055339, -0.133451816260842 });
		mapCode2XY.put("IRIS_313-10737", new double[] { -0.00489799213757709, -0.107768237558607 });
		mapCode2XY.put("IRIS_313-10738", new double[] { -0.0272116601700318, 0.0224153965930901 });
		mapCode2XY.put("IRIS_313-10739", new double[] { -0.00333630636216737, 0.01192437796183 });
		mapCode2XY.put("IRIS_313-10740", new double[] { -0.0817897885003485, 0.0127255349042846 });
		mapCode2XY.put("IRIS_313-10741", new double[] { -0.0818149741682488, 0.0129019590623796 });
		mapCode2XY.put("IRIS_313-10742", new double[] { 0.0498909781541135, 0.0191932031366247 });
		mapCode2XY.put("IRIS_313-10743", new double[] { -0.084683246799106, 0.0157086688877782 });
		mapCode2XY.put("IRIS_313-10744", new double[] { -0.0820118197418786, 0.0145807026493746 });
		mapCode2XY.put("IRIS_313-10745", new double[] { -0.0820398670691256, 0.0142066250048228 });
		mapCode2XY.put("IRIS_313-10746", new double[] { -0.0838138228284584, 0.0132422283541737 });
		mapCode2XY.put("IRIS_313-10747", new double[] { -0.084982688589794, 0.0155155233217488 });
		mapCode2XY.put("IRIS_313-10748", new double[] { 0.0548445717000973, 0.0113545863931317 });
		mapCode2XY.put("IRIS_313-10749", new double[] { 0.0561388863390966, 0.0166185389006302 });
		mapCode2XY.put("IRIS_313-10750", new double[] { 0.0536866522370567, 0.0164801364496529 });
		mapCode2XY.put("IRIS_313-10751", new double[] { 0.0440837130445141, 0.00960928375115281 });
		mapCode2XY.put("IRIS_313-10752", new double[] { -0.0912014498414623, 0.0184763751723513 });
		mapCode2XY.put("IRIS_313-10753", new double[] { 0.0452050295778319, 0.0170932622727904 });
		mapCode2XY.put("IRIS_313-10754", new double[] { 0.0530947058819851, 0.0178576508244231 });
		mapCode2XY.put("IRIS_313-10755", new double[] { 0.0516640577617709, 0.0175776148532545 });
		mapCode2XY.put("IRIS_313-10756", new double[] { 0.0513057773388354, -1.10442612094797E-05 });
		mapCode2XY.put("IRIS_313-10757", new double[] { 0.0497313425592285, 0.0187191985372862 });
		mapCode2XY.put("IRIS_313-10758", new double[] { -0.0821881510015843, 0.0138274436101582 });
		mapCode2XY.put("IRIS_313-10759", new double[] { -0.082417593463537, 0.0150647570602591 });
		mapCode2XY.put("IRIS_313-10760", new double[] { 0.0516767000147167, 0.0139559779815306 });
		mapCode2XY.put("IRIS_313-10761", new double[] { -0.0859716240536683, 0.0131598373471113 });
		mapCode2XY.put("IRIS_313-10762", new double[] { 0.0517168519089489, 0.0177342800745809 });
		mapCode2XY.put("IRIS_313-10765", new double[] { -0.0816954704547613, 0.0139275242098849 });
		mapCode2XY.put("IRIS_313-10766", new double[] { -0.0817194814747152, 0.0115612370739416 });
		mapCode2XY.put("IRIS_313-10767", new double[] { -0.0855077628826508, 0.0138435467391796 });
		mapCode2XY.put("IRIS_313-10768", new double[] { 0.0482362033133229, 0.0193956504037608 });
		mapCode2XY.put("IRIS_313-10769", new double[] { 0.0549358650863907, 0.0126688509243623 });
		mapCode2XY.put("IRIS_313-10770", new double[] { -0.0822254239921924, 0.0145240468796469 });
		mapCode2XY.put("IRIS_313-10771", new double[] { -0.0405694137948855, 0.00933552185425384 });
		mapCode2XY.put("IRIS_313-10772", new double[] { 0.054582376434967, 0.0199770279121968 });
		mapCode2XY.put("IRIS_313-10773", new double[] { -0.0856566257482012, 0.0139813981015256 });
		mapCode2XY.put("IRIS_313-10774", new double[] { 0.0495175537996416, 0.0102920188401387 });
		mapCode2XY.put("IRIS_313-10775", new double[] { 0.053526426491414, 0.00832112189500126 });
		mapCode2XY.put("IRIS_313-10776", new double[] { -0.0844484200839995, 0.014808917911642 });
		mapCode2XY.put("IRIS_313-10777", new double[] { 0.0505500527734912, 0.0205724116273294 });
		mapCode2XY.put("IRIS_313-10778", new double[] { 0.0465871848900876, 0.014279414862961 });
		mapCode2XY.put("IRIS_313-10779", new double[] { 0.0498082939551451, 0.0188690235319949 });
		mapCode2XY.put("IRIS_313-10780", new double[] { -0.0869089462039116, 0.0162539636755538 });
		mapCode2XY.put("IRIS_313-10781", new double[] { -0.0817087902330595, 0.0156364999430037 });
		mapCode2XY.put("IRIS_313-10782", new double[] { 0.04726466183445, 0.0191975380614476 });
		mapCode2XY.put("IRIS_313-10783", new double[] { -0.0813114611780519, 0.0139017988795327 });
		mapCode2XY.put("IRIS_313-10784", new double[] { -0.081327811187093, 0.0127501106157871 });
		mapCode2XY.put("IRIS_313-10785", new double[] { -0.0791311525019948, 0.0138479970266493 });
		mapCode2XY.put("IRIS_313-10786", new double[] { 0.0174141563519505, 0.0179454963679753 });
		mapCode2XY.put("IRIS_313-10787", new double[] { -0.00967459672696885, 0.00511732836276765 });
		mapCode2XY.put("IRIS_313-10788", new double[] { -0.0840693306912341, 0.0139935258559638 });
		mapCode2XY.put("IRIS_313-10789", new double[] { -0.0833936580009546, 0.0131447436108364 });
		mapCode2XY.put("IRIS_313-10790", new double[] { -0.0798746526189212, 0.012261487178199 });
		mapCode2XY.put("IRIS_313-10791", new double[] { 0.0520518890097479, 0.0203175305866102 });
		mapCode2XY.put("IRIS_313-10792", new double[] { 0.0518147858595122, 0.0162406668510719 });
		mapCode2XY.put("IRIS_313-10793", new double[] { -0.0806277547219621, 0.0157310632692676 });
		mapCode2XY.put("IRIS_313-10794", new double[] { -0.0862359699802947, 0.0173335530863348 });
		mapCode2XY.put("IRIS_313-10795", new double[] { -0.0846492064259297, 0.0157109997075351 });
		mapCode2XY.put("IRIS_313-10796", new double[] { -0.0835811737543202, 0.0148507147210569 });
		mapCode2XY.put("IRIS_313-10797", new double[] { 0.0487398339068734, 0.0193951192411188 });
		mapCode2XY.put("IRIS_313-10798", new double[] { -0.0860951634228672, 0.0150063077241577 });
		mapCode2XY.put("IRIS_313-10799", new double[] { -0.0823466938173886, 0.0150066773694597 });
		mapCode2XY.put("IRIS_313-10800", new double[] { -0.0819353305037033, 0.0157202760616044 });
		mapCode2XY.put("IRIS_313-10801", new double[] { -0.083467083049517, 0.0153850016586626 });
		mapCode2XY.put("IRIS_313-10802", new double[] { -0.0838973970271742, 0.013432362330269 });
		mapCode2XY.put("IRIS_313-10803", new double[] { -0.0827901274921611, 0.01422517935262 });
		mapCode2XY.put("IRIS_313-10804", new double[] { 0.0490947878913078, 0.016674841694754 });
		mapCode2XY.put("IRIS_313-10805", new double[] { -0.0819053810350204, 0.0152258935165141 });
		mapCode2XY.put("IRIS_313-10806", new double[] { 0.0526452269717296, 0.0146597642901291 });
		mapCode2XY.put("IRIS_313-10807", new double[] { 0.0486360615288548, 0.0183333428519885 });
		mapCode2XY.put("IRIS_313-10808", new double[] { -0.0810709560294579, 0.0142866015224493 });
		mapCode2XY.put("IRIS_313-10809", new double[] { -0.0705800406950921, 0.0157351444465172 });
		mapCode2XY.put("IRIS_313-10810", new double[] { 0.0472081491645298, 0.0176190352814425 });
		mapCode2XY.put("IRIS_313-10811", new double[] { 0.0539964911354455, 0.00808419742585828 });
		mapCode2XY.put("IRIS_313-10812", new double[] { 0.055385379617542, 0.0197160556066427 });
		mapCode2XY.put("IRIS_313-10813", new double[] { 0.0492012242884768, 0.0152903301533388 });
		mapCode2XY.put("IRIS_313-10814", new double[] { 0.0478473736712372, 0.0183741733906758 });
		mapCode2XY.put("IRIS_313-10815", new double[] { -0.0832480088497781, 0.013099620637822 });
		mapCode2XY.put("IRIS_313-10816", new double[] { -0.0784831883817575, 0.0129364265956443 });
		mapCode2XY.put("IRIS_313-10817", new double[] { -0.0788278411262148, 0.0134282645119182 });
		mapCode2XY.put("IRIS_313-10818", new double[] { 0.046976603292439, 0.017344051252237 });
		mapCode2XY.put("IRIS_313-10819", new double[] { 0.04770626556355, 0.0135509156152659 });
		mapCode2XY.put("IRIS_313-10820", new double[] { 0.0449898933867691, 0.0161941708770488 });
		mapCode2XY.put("IRIS_313-10821", new double[] { 0.051417036366424, 0.0172095145522767 });
		mapCode2XY.put("IRIS_313-10822", new double[] { 0.0492108346382232, 0.0131159620605588 });
		mapCode2XY.put("IRIS_313-10823", new double[] { 0.0498921573815788, 0.012771248913294 });
		mapCode2XY.put("IRIS_313-10824", new double[] { 0.0545413599253377, 0.0218853539030243 });
		mapCode2XY.put("IRIS_313-10825", new double[] { 0.0463711138651384, -0.000534138342650471 });
		mapCode2XY.put("IRIS_313-10827", new double[] { -0.087240202780749, 0.0154159622358375 });
		mapCode2XY.put("IRIS_313-10828", new double[] { -0.088461588323935, 0.0140107565340781 });
		mapCode2XY.put("IRIS_313-10829", new double[] { -0.0862224854009777, 0.0139550313166862 });
		mapCode2XY.put("IRIS_313-10830", new double[] { -0.0864180387580171, 0.0167078778874959 });
		mapCode2XY.put("IRIS_313-10831", new double[] { -0.0876881982975845, 0.015454578260888 });
		mapCode2XY.put("IRIS_313-10832", new double[] { -0.0877982185598178, 0.0152174358512803 });
		mapCode2XY.put("IRIS_313-10833", new double[] { 0.0501773000228717, -0.00146743140112614 });
		mapCode2XY.put("IRIS_313-10834", new double[] { -0.0862655409401714, 0.00719255099183466 });
		mapCode2XY.put("IRIS_313-10835", new double[] { 0.0491587666306724, -0.00518544293839995 });
		mapCode2XY.put("IRIS_313-10836", new double[] { 0.0507789492772018, -0.000536109482115688 });
		return mapCode2XY;
	}

	private static Map getXY2V1(Map mapCode2XY) {

		mapCode2XY.put("IRIS_313-10837", new double[] { -0.0922363664848681, 0.0133375485340637 });
		mapCode2XY.put("IRIS_313-10838", new double[] { -0.0917730844072878, 0.0151035264539555 });
		mapCode2XY.put("IRIS_313-10839", new double[] { -0.092442591090986, 0.0164394841799601 });
		mapCode2XY.put("IRIS_313-10840", new double[] { -0.0915396256729664, 0.0141496872761838 });
		mapCode2XY.put("IRIS_313-10841", new double[] { -0.0781677050911029, 0.0131444773181848 });
		mapCode2XY.put("IRIS_313-10842", new double[] { 0.0517007631493087, 0.0155652592273073 });
		mapCode2XY.put("IRIS_313-10844", new double[] { 0.0486675899369639, 0.0181697018919717 });
		mapCode2XY.put("IRIS_313-10845", new double[] { 0.00561365112350989, -0.124657696170833 });
		mapCode2XY.put("IRIS_313-10847", new double[] { 0.0535014902131058, 0.00835944476108155 });
		mapCode2XY.put("IRIS_313-10848", new double[] { -0.0834054824529835, 0.00608872035722138 });
		mapCode2XY.put("IRIS_313-10849", new double[] { -0.0043064893451569, -0.134893069118128 });
		mapCode2XY.put("IRIS_313-10850", new double[] { -0.0320429119514055, -0.0168490916768421 });
		mapCode2XY.put("IRIS_313-10851", new double[] { -0.0695875655663395, -0.0140777654205474 });
		mapCode2XY.put("IRIS_313-10852", new double[] { -0.013010720166962, -0.140262957948913 });
		mapCode2XY.put("IRIS_313-10853", new double[] { -0.087313543316573, 0.0113569661555391 });
		mapCode2XY.put("IRIS_313-10854", new double[] { -0.00324255693485349, -0.100542075364588 });
		mapCode2XY.put("IRIS_313-10855", new double[] { 0.0511047681088127, -0.000587192119437182 });
		mapCode2XY.put("IRIS_313-10856", new double[] { 0.0201280267486367, -0.0434483060353833 });
		mapCode2XY.put("IRIS_313-10857", new double[] { 0.0275537564146561, -0.0431357256578829 });
		mapCode2XY.put("IRIS_313-10858", new double[] { 0.0454275478161799, -0.0102948636179521 });
		mapCode2XY.put("IRIS_313-10859", new double[] { 0.0364204643929263, -0.0329025932752538 });
		mapCode2XY.put("IRIS_313-10861", new double[] { -0.00545732709781111, -0.105348325569939 });
		mapCode2XY.put("IRIS_313-10862", new double[] { -0.0877909480628026, 0.0116217077966542 });
		mapCode2XY.put("IRIS_313-10863", new double[] { 0.0555166199406517, 0.000639448449214973 });
		mapCode2XY.put("IRIS_313-10864", new double[] { -0.082325386756051, -0.00367186990315148 });
		mapCode2XY.put("IRIS_313-10865", new double[] { -0.0862086662175448, 0.00874749988464982 });
		mapCode2XY.put("IRIS_313-10866", new double[] { -0.0890032581714469, 0.0114213826093335 });
		mapCode2XY.put("IRIS_313-10867", new double[] { -0.0874787113712856, 0.0126642249220071 });
		mapCode2XY.put("IRIS_313-10868", new double[] { -0.0727397296918375, -0.0248658174027851 });
		mapCode2XY.put("IRIS_313-10869", new double[] { -0.009588846558727, -0.1152612763603 });
		mapCode2XY.put("IRIS_313-10870", new double[] { -0.0843373987600942, 0.00889775910084953 });
		mapCode2XY.put("IRIS_313-10871", new double[] { -0.0128847350414622, -0.110868925648698 });
		mapCode2XY.put("IRIS_313-10872", new double[] { -0.0563724281448645, 0.0111316877877543 });
		mapCode2XY.put("IRIS_313-10873", new double[] { -0.0254709878930343, -0.101494755568104 });
		mapCode2XY.put("IRIS_313-10874", new double[] { -0.0869494356245367, 0.0116721638227995 });
		mapCode2XY.put("IRIS_313-10875", new double[] { -0.0123278898907634, -0.129605389428134 });
		mapCode2XY.put("IRIS_313-10876", new double[] { -0.0102120390112099, -0.105679627727285 });
		mapCode2XY.put("IRIS_313-10877", new double[] { -0.0107475249631506, -0.104199984417467 });
		mapCode2XY.put("IRIS_313-10878", new double[] { -0.0105558443593851, -0.104394995642081 });
		mapCode2XY.put("IRIS_313-10879", new double[] { 0.0159748587222803, -0.0651049726975173 });
		mapCode2XY.put("IRIS_313-10880", new double[] { 0.054699564108574, 0.00437962279519593 });
		mapCode2XY.put("IRIS_313-10881", new double[] { -0.0428488072801027, -0.0387033551089554 });
		mapCode2XY.put("IRIS_313-10882", new double[] { -0.00197566659072448, -0.094263316229433 });
		mapCode2XY.put("IRIS_313-10883", new double[] { -0.0480694586322798, -0.0330118062916856 });
		mapCode2XY.put("IRIS_313-10884", new double[] { -0.0812060022403366, 0.0102484042362379 });
		mapCode2XY.put("IRIS_313-10885", new double[] { 0.052136661447179, 0.00838269783704166 });
		mapCode2XY.put("IRIS_313-10886", new double[] { -0.0861392631754077, 0.0108108917026232 });
		mapCode2XY.put("IRIS_313-10887", new double[] { 0.0517896356199414, 0.013097332208349 });
		mapCode2XY.put("IRIS_313-10888", new double[] { -0.0864193286330585, 0.0119652055116109 });
		mapCode2XY.put("IRIS_313-10889", new double[] { -0.0864406627194504, 0.00949603977310722 });
		mapCode2XY.put("IRIS_313-10890", new double[] { -0.0882232556912497, 0.0100409252414507 });
		mapCode2XY.put("IRIS_313-10891", new double[] { 0.00523602645779526, -0.0869035655500044 });
		mapCode2XY.put("IRIS_313-10892", new double[] { -0.00182992556674955, -0.0890537761802645 });
		mapCode2XY.put("IRIS_313-10893", new double[] { -0.0876117380031239, 0.00974074473389599 });
		mapCode2XY.put("IRIS_313-10894", new double[] { 0.00562978229312632, -0.0632811520949103 });
		mapCode2XY.put("IRIS_313-10895", new double[] { -0.0882603139071, 0.0110197297358278 });
		mapCode2XY.put("IRIS_313-10896", new double[] { 0.00465784339636658, -0.0537482476254724 });
		mapCode2XY.put("IRIS_313-10897", new double[] { 0.0532455197518214, 0.018607458494093 });
		mapCode2XY.put("IRIS_313-10898", new double[] { 0.052996542846712, 0.0152879531409 });
		mapCode2XY.put("IRIS_313-10899", new double[] { 0.0540912386083711, 0.0163140967696732 });
		mapCode2XY.put("IRIS_313-10900", new double[] { 0.0559963568169397, 0.0160918135600429 });
		mapCode2XY.put("IRIS_313-10901", new double[] { 0.0547132164183064, 0.0173837276316424 });
		mapCode2XY.put("IRIS_313-10902", new double[] { 0.049699577429804, 0.0136557502347324 });
		mapCode2XY.put("IRIS_313-10903", new double[] { 0.0510141773298702, 0.0121882675283865 });
		mapCode2XY.put("IRIS_313-10904", new double[] { 0.0529614844796202, 0.0171075535002295 });
		mapCode2XY.put("IRIS_313-10905", new double[] { 0.0517564280196037, 0.0178278527988169 });
		mapCode2XY.put("IRIS_313-10906", new double[] { 0.0490743476644572, 0.0203397489527964 });
		mapCode2XY.put("IRIS_313-10907", new double[] { 0.0529387718637632, 0.0177989399635752 });
		mapCode2XY.put("IRIS_313-10908", new double[] { 0.0539350495827852, 0.0153086035020295 });
		mapCode2XY.put("IRIS_313-10909", new double[] { 0.0548952033743792, 0.0153003902229677 });
		mapCode2XY.put("IRIS_313-10910", new double[] { 0.0547988770589521, 0.0178265117132532 });
		mapCode2XY.put("IRIS_313-10911", new double[] { 0.0540152293848748, 0.0187585005920367 });
		mapCode2XY.put("IRIS_313-10912", new double[] { 0.0531733396635521, 0.018629798585817 });
		mapCode2XY.put("IRIS_313-10913", new double[] { 0.0543009826667427, 0.0142279075346152 });
		mapCode2XY.put("IRIS_313-10915", new double[] { 0.0562100423217954, 0.0161258533226323 });
		mapCode2XY.put("IRIS_313-10916", new double[] { -0.0919100795486925, 0.0174860924744522 });
		mapCode2XY.put("IRIS_313-10917", new double[] { 0.0485468889874153, 0.00541594939999948 });
		mapCode2XY.put("IRIS_313-10918", new double[] { -0.0674661252344433, 0.014523575329303 });
		mapCode2XY.put("IRIS_313-10919", new double[] { -0.0839049201963493, 0.0162499089827903 });
		mapCode2XY.put("IRIS_313-10920", new double[] { -0.0840111947418017, 0.0160775106897609 });
		mapCode2XY.put("IRIS_313-10921", new double[] { 0.0491657987013054, 0.00660707909779516 });
		mapCode2XY.put("IRIS_313-10922", new double[] { -0.0876632211720532, 0.0122073474976505 });
		mapCode2XY.put("IRIS_313-10923", new double[] { -0.0890176393691794, 0.013605236941989 });
		mapCode2XY.put("IRIS_313-10924", new double[] { 0.0531828191846425, 0.0118657984272536 });
		mapCode2XY.put("IRIS_313-10925", new double[] { -0.00679081258553061, -0.128913036706111 });
		mapCode2XY.put("IRIS_313-10926", new double[] { -0.0658617175429344, -0.0243143223965391 });
		mapCode2XY.put("IRIS_313-10927", new double[] { 0.000109247550785894, -0.1403787635413 });
		mapCode2XY.put("IRIS_313-10928", new double[] { 0.0501161390998597, 0.00864014041075788 });
		mapCode2XY.put("IRIS_313-10929", new double[] { 0.0523622367680138, 0.000749523261332524 });
		mapCode2XY.put("IRIS_313-10930", new double[] { -0.0099906845604385, -0.143210794633562 });
		mapCode2XY.put("IRIS_313-10931", new double[] { -0.0902993476172879, 0.0141521357348474 });
		mapCode2XY.put("IRIS_313-10932", new double[] { 0.0509909065810973, 0.0128613218211386 });
		mapCode2XY.put("IRIS_313-10933", new double[] { -0.0753473901576018, -0.014654402892565 });
		mapCode2XY.put("IRIS_313-10934", new double[] { 0.0503624597497467, 0.0162530586785886 });
		mapCode2XY.put("IRIS_313-10935", new double[] { 0.0511279498145787, 0.0179345849427198 });
		mapCode2XY.put("IRIS_313-10936", new double[] { -0.0832167772754642, 0.0133400862953743 });
		mapCode2XY.put("IRIS_313-10937", new double[] { 0.0514709962326389, 0.0175615116176144 });
		mapCode2XY.put("IRIS_313-10938", new double[] { 0.0521084415282637, 0.0195187743950758 });
		mapCode2XY.put("IRIS_313-10940", new double[] { 0.0504769090890744, 0.0169785896687811 });
		mapCode2XY.put("IRIS_313-10941", new double[] { 0.05577565540697, 0.0141088567246778 });
		mapCode2XY.put("IRIS_313-10942", new double[] { 0.0533237632105329, 0.0164874214343478 });
		mapCode2XY.put("IRIS_313-10943", new double[] { 0.0506432480808396, 0.0202033545790503 });
		mapCode2XY.put("IRIS_313-10944", new double[] { 0.0496245450617213, 0.00266886497597176 });
		mapCode2XY.put("IRIS_313-10945", new double[] { -0.0841431856911053, 0.0160965339049458 });
		mapCode2XY.put("IRIS_313-10946", new double[] { -0.0842759017520995, 0.0150047400887959 });
		mapCode2XY.put("IRIS_313-10947", new double[] { 0.0424918417219249, 0.0162446882152495 });
		mapCode2XY.put("IRIS_313-10948", new double[] { -0.0197646986657823, 0.013253708617034 });
		mapCode2XY.put("IRIS_313-10949", new double[] { -0.0845858735446337, 0.0143503767872029 });
		mapCode2XY.put("IRIS_313-10950", new double[] { -0.0801577209013249, 0.0131443802897386 });
		mapCode2XY.put("IRIS_313-10951", new double[] { 0.0502765432848944, 0.0201460009916079 });
		mapCode2XY.put("IRIS_313-10952", new double[] { -0.0861024944003528, 0.0121445625539534 });
		mapCode2XY.put("IRIS_313-10953", new double[] { -0.0853988167492603, 0.0118047691734195 });
		mapCode2XY.put("IRIS_313-10954", new double[] { 0.0557704911250738, 0.0205204748621212 });
		mapCode2XY.put("IRIS_313-10955", new double[] { 0.0503419463754236, 0.0168198923363489 });
		mapCode2XY.put("IRIS_313-10956", new double[] { -0.0820008168481343, 0.0156809296867553 });
		mapCode2XY.put("IRIS_313-10957", new double[] { -0.0843196839871275, 0.0135260461312442 });
		mapCode2XY.put("IRIS_313-10958", new double[] { -0.0838036812571561, 0.0128459257881825 });
		mapCode2XY.put("IRIS_313-10959", new double[] { -0.082452312396009, 0.0134951412233501 });
		mapCode2XY.put("IRIS_313-10960", new double[] { -0.0813815230318059, 0.0129118963341075 });
		mapCode2XY.put("IRIS_313-10961", new double[] { 0.0523888294430023, 0.0200097682461467 });
		mapCode2XY.put("IRIS_313-10962", new double[] { 0.0438593557807248, 0.0156521236482032 });
		mapCode2XY.put("IRIS_313-10963", new double[] { -0.00250923100519921, -0.134606040255467 });
		mapCode2XY.put("IRIS_313-10964", new double[] { -0.0122107212731799, -0.140842287747743 });
		mapCode2XY.put("IRIS_313-10965", new double[] { -0.00296900206013226, -0.135444393497312 });
		mapCode2XY.put("IRIS_313-10966", new double[] { 0.0507311564217434, 0.0125390569047388 });
		mapCode2XY.put("IRIS_313-10967", new double[] { -0.0962092757234157, 0.0194051658011976 });
		mapCode2XY.put("IRIS_313-10968", new double[] { 0.0497218158145809, 0.011505770887514 });
		mapCode2XY.put("IRIS_313-10969", new double[] { -0.00471371754971355, -0.141476308016022 });
		mapCode2XY.put("IRIS_313-10970", new double[] { 0.052722319483728, 0.0181808433708487 });
		mapCode2XY.put("IRIS_313-10971", new double[] { 0.0448064001897147, -0.000668908452068201 });
		mapCode2XY.put("IRIS_313-10972", new double[] { 0.0401468971864101, -0.00186471133212633 });
		mapCode2XY.put("IRIS_313-10973", new double[] { 0.0465798189529985, -0.00369110176866006 });
		mapCode2XY.put("IRIS_313-10974", new double[] { 0.0492475828464013, 0.00139673785742631 });
		mapCode2XY.put("IRIS_313-10975", new double[] { 0.0524310932162951, 0.00628033406072699 });
		mapCode2XY.put("IRIS_313-10976", new double[] { -0.00461912851085892, -0.144095636589423 });
		mapCode2XY.put("IRIS_313-10977", new double[] { 0.0496375868309171, -0.00485993056518922 });
		mapCode2XY.put("IRIS_313-10978", new double[] { 0.048979593893819, -0.011299116381619 });
		mapCode2XY.put("IRIS_313-10979", new double[] { 0.00284971875485335, -0.121020320030771 });
		mapCode2XY.put("IRIS_313-10980", new double[] { 0.0338852035854885, -0.0617642505030703 });
		mapCode2XY.put("IRIS_313-10981", new double[] { -0.000366463049510344, -0.125333018364653 });
		mapCode2XY.put("IRIS_313-10982", new double[] { 0.0498160021003574, -0.00110157692575275 });
		mapCode2XY.put("IRIS_313-10983", new double[] { 0.0507868267699886, 0.00978955616433886 });
		mapCode2XY.put("IRIS_313-10984", new double[] { 0.0529321442027274, -0.00372769863360822 });
		mapCode2XY.put("IRIS_313-10985", new double[] { 0.0518265274388556, 0.00272499829842111 });
		mapCode2XY.put("IRIS_313-10986", new double[] { 0.0540281540738291, -0.00400020383093642 });
		mapCode2XY.put("IRIS_313-10987", new double[] { 0.000506015536093813, -0.123955516233192 });
		mapCode2XY.put("IRIS_313-10988", new double[] { 0.0279856611532642, 0.00682879782638654 });
		mapCode2XY.put("IRIS_313-10989", new double[] { 0.0543568637067866, 0.0043960931291953 });
		mapCode2XY.put("IRIS_313-10990", new double[] { 0.0442693892626285, 0.0130307192336861 });
		mapCode2XY.put("IRIS_313-10991", new double[] { -0.0879921868026279, 0.0153508194166947 });
		mapCode2XY.put("IRIS_313-10992", new double[] { -0.0861641552056518, 0.0160984129138966 });
		mapCode2XY.put("IRIS_313-10993", new double[] { -0.0907485734582355, 0.0134183030359295 });
		mapCode2XY.put("IRIS_313-10994", new double[] { -0.0839873241248469, 0.015728751385253 });
		mapCode2XY.put("IRIS_313-10995", new double[] { 0.0533392718043618, 0.0136174344091547 });
		mapCode2XY.put("IRIS_313-10996", new double[] { 0.0433354005561489, 0.0161336419081272 });
		mapCode2XY.put("IRIS_313-10997", new double[] { 0.0511042133909816, 0.01833040684635 });
		mapCode2XY.put("IRIS_313-10998", new double[] { 0.011243456185202, 0.0213450368124862 });
		mapCode2XY.put("IRIS_313-10999", new double[] { -0.0847546610775185, 0.0154396210332312 });
		mapCode2XY.put("IRIS_313-11000", new double[] { 0.0511066131865281, 0.0167430056970138 });
		mapCode2XY.put("IRIS_313-11001", new double[] { -0.0869122614137762, 0.0147772063983522 });
		mapCode2XY.put("IRIS_313-11003", new double[] { -0.0787865733391425, 0.0155850668085659 });
		mapCode2XY.put("IRIS_313-11004", new double[] { -0.0810535439317474, 0.0147765932615748 });
		mapCode2XY.put("IRIS_313-11005", new double[] { -0.0797467838032103, 0.0125138042343878 });
		mapCode2XY.put("IRIS_313-11006", new double[] { 0.0493050968510256, 0.0196253217911547 });
		mapCode2XY.put("IRIS_313-11007", new double[] { -0.0819733370156618, 0.0151620108106932 });
		mapCode2XY.put("IRIS_313-11008", new double[] { -0.0733437611283809, 0.0087082257171264 });
		mapCode2XY.put("IRIS_313-11009", new double[] { -0.0850714043210788, 0.0135474501651125 });
		mapCode2XY.put("IRIS_313-11010", new double[] { 0.0510648900850278, 0.0190620005002546 });
		mapCode2XY.put("IRIS_313-11011", new double[] { 0.0450352616580442, 0.0178119986196275 });
		mapCode2XY.put("IRIS_313-11012", new double[] { -0.0266993527383099, 0.0156078189354998 });
		mapCode2XY.put("IRIS_313-11013", new double[] { -0.00279188534949589, -0.142211136598799 });
		mapCode2XY.put("IRIS_313-11014", new double[] { -0.00814444713461776, -0.141156604362944 });
		mapCode2XY.put("IRIS_313-11015", new double[] { -0.00622167191111691, -0.141486755599764 });
		mapCode2XY.put("IRIS_313-11016", new double[] { -0.00497258426758922, -0.144968883593532 });
		mapCode2XY.put("IRIS_313-11017", new double[] { -0.00165867072454387, -0.140918429892636 });
		mapCode2XY.put("IRIS_313-11018", new double[] { 0.00651546198009472, -0.138531442850108 });
		mapCode2XY.put("IRIS_313-11019", new double[] { -0.00585927642524577, -0.140376847944269 });
		mapCode2XY.put("IRIS_313-11020", new double[] { -0.0079160064660501, -0.134055247955029 });
		mapCode2XY.put("IRIS_313-11021", new double[] { -0.0651188180638659, -0.0490594415806132 });
		mapCode2XY.put("IRIS_313-11022", new double[] { -0.063406895850314, -0.043659548465296 });
		mapCode2XY.put("IRIS_313-11023", new double[] { -0.0653236368174724, -0.0489359215914766 });
		mapCode2XY.put("IRIS_313-11024", new double[] { -0.00767093375379143, -0.135196805373617 });
		mapCode2XY.put("IRIS_313-11025", new double[] { -0.0167042875916652, -0.147479203943749 });
		mapCode2XY.put("IRIS_313-11026", new double[] { -0.0712825198457003, -0.0321539042164682 });
		mapCode2XY.put("IRIS_313-11027", new double[] { -0.00221772874144838, -0.115525659873109 });
		mapCode2XY.put("IRIS_313-11028", new double[] { -0.0065229342812379, -0.134129707228019 });
		mapCode2XY.put("IRIS_313-11029", new double[] { -0.00299253185744139, -0.133429038619132 });
		mapCode2XY.put("IRIS_313-11030", new double[] { -0.0510681595810873, -0.0654050640385013 });
		mapCode2XY.put("IRIS_313-11031", new double[] { 0.00581534244346419, -0.0905654066249025 });
		mapCode2XY.put("IRIS_313-11032", new double[] { -0.0427824579606158, -0.0538121522413348 });
		mapCode2XY.put("IRIS_313-11033", new double[] { -0.040200409861522, -0.0808317302025681 });
		mapCode2XY.put("IRIS_313-11034", new double[] { -0.00678819313888799, -0.127440867261002 });
		mapCode2XY.put("IRIS_313-11035", new double[] { 0.0243624046299806, -0.0763359060077791 });
		mapCode2XY.put("IRIS_313-11036", new double[] { -0.0206864267529188, -0.107880042587888 });
		mapCode2XY.put("IRIS_313-11037", new double[] { -0.00701425316558554, -0.13697661507379 });
		mapCode2XY.put("IRIS_313-11038", new double[] { 0.0520955496330373, 0.012774281602124 });
		mapCode2XY.put("IRIS_313-11039", new double[] { 0.051585188125862, 0.0148970131025118 });
		mapCode2XY.put("IRIS_313-11040", new double[] { 0.0493752157936872, -0.00318523251054412 });
		mapCode2XY.put("IRIS_313-11041", new double[] { 0.0494270917371884, -0.0129977588950563 });
		mapCode2XY.put("IRIS_313-11042", new double[] { 0.0482862964852536, -0.0137624080285529 });
		mapCode2XY.put("IRIS_313-11043", new double[] { 0.0509779534724527, 0.0194962844214372 });
		mapCode2XY.put("IRIS_313-11044", new double[] { -0.0802416036289119, 0.0113002783162494 });
		mapCode2XY.put("IRIS_313-11045", new double[] { -0.0834176559501777, 0.0165999651353608 });
		mapCode2XY.put("IRIS_313-11046", new double[] { -0.0771675896379928, 0.0117914668003034 });
		mapCode2XY.put("IRIS_313-11047", new double[] { -0.00820769473977008, -0.135107325212423 });
		mapCode2XY.put("IRIS_313-11048", new double[] { -0.00121260860324931, -0.141962498675122 });
		mapCode2XY.put("IRIS_313-11049", new double[] { -0.00633127784287048, -0.14350474648382 });
		mapCode2XY.put("IRIS_313-11050", new double[] { -0.00567418580421123, -0.144309688860136 });
		mapCode2XY.put("IRIS_313-11051", new double[] { -0.00796057886696568, -0.143124174265606 });
		mapCode2XY.put("IRIS_313-11052", new double[] { -0.0050862247795169, -0.126302750917943 });
		mapCode2XY.put("IRIS_313-11053", new double[] { -0.00590899648985024, -0.143554020811027 });
		mapCode2XY.put("IRIS_313-11054", new double[] { -0.00594076490502556, -0.140173120336821 });
		mapCode2XY.put("IRIS_313-11055", new double[] { -0.00597695570262652, -0.145763429590375 });
		mapCode2XY.put("IRIS_313-11056", new double[] { -0.00233135672812268, -0.14662085213745 });
		mapCode2XY.put("IRIS_313-11057", new double[] { -0.00569371505718084, -0.140735187271309 });
		mapCode2XY.put("IRIS_313-11058", new double[] { -0.00547495256452246, -0.151079576894538 });
		mapCode2XY.put("IRIS_313-11059", new double[] { -0.00551925763287112, -0.147482215511358 });
		mapCode2XY.put("IRIS_313-11060", new double[] { -0.00620612501172953, -0.139068474742879 });
		mapCode2XY.put("IRIS_313-11061", new double[] { -0.00883704663356443, -0.134263089820638 });
		mapCode2XY.put("IRIS_313-11062", new double[] { -0.0753333071577222, -0.0363039552450313 });
		mapCode2XY.put("IRIS_313-11063", new double[] { -0.0149976206884793, -0.139607324413634 });
		mapCode2XY.put("IRIS_313-11064", new double[] { -0.0152498517051761, -0.141324977816539 });
		mapCode2XY.put("IRIS_313-11065", new double[] { -0.018561701603383, -0.135917187504194 });
		mapCode2XY.put("IRIS_313-11066", new double[] { -0.0729304856294695, -0.040493767499091 });
		mapCode2XY.put("IRIS_313-11067", new double[] { -0.018035038990619, -0.142736196231749 });
		mapCode2XY.put("IRIS_313-11068", new double[] { -0.0786529467249447, -0.0316540372985137 });
		mapCode2XY.put("IRIS_313-11069", new double[] { -0.0734929857241071, -0.0385712699480675 });
		mapCode2XY.put("IRIS_313-11070", new double[] { -0.0734862179992227, -0.0381954078844398 });
		mapCode2XY.put("IRIS_313-11071", new double[] { 0.0512274771813744, 0.0106863380145598 });
		mapCode2XY.put("IRIS_313-11072", new double[] { 0.0570303339910782, 0.0171243776875644 });
		mapCode2XY.put("IRIS_313-11073", new double[] { -0.0888352465196901, 0.0138238646136493 });
		mapCode2XY.put("IRIS_313-11074", new double[] { 0.0538869078582043, 0.0162281313787386 });
		mapCode2XY.put("IRIS_313-11075", new double[] { -0.0863727320902794, 0.0126118419407179 });
		mapCode2XY.put("IRIS_313-11076", new double[] { 0.053218470065023, 0.0131249724282261 });
		mapCode2XY.put("IRIS_313-11077", new double[] { -0.0918462669532077, 0.0129802260241209 });
		mapCode2XY.put("IRIS_313-11078", new double[] { 0.051273711601311, 0.0186822963572531 });
		mapCode2XY.put("IRIS_313-11079", new double[] { 0.0462980496005625, 0.0127025386736572 });
		mapCode2XY.put("IRIS_313-11080", new double[] { 0.0472303054819996, 0.00640971047320365 });
		mapCode2XY.put("IRIS_313-11081", new double[] { 0.0497079179827219, 0.0138701471372443 });
		mapCode2XY.put("IRIS_313-11082", new double[] { 0.0477678056821854, 0.0186956221120308 });
		mapCode2XY.put("IRIS_313-11083", new double[] { 0.0531682043160996, 0.0137239588648809 });
		mapCode2XY.put("IRIS_313-11084", new double[] { 0.0454411703859158, 0.0169787411458193 });
		mapCode2XY.put("IRIS_313-11085", new double[] { 0.0475007087201019, 0.00679574853071583 });
		mapCode2XY.put("IRIS_313-11086", new double[] { 0.0358887034915553, 0.0176212823012708 });
		mapCode2XY.put("IRIS_313-11087", new double[] { 0.044256259340378, 0.0204393672467477 });
		mapCode2XY.put("IRIS_313-11088", new double[] { 0.0452805656558636, 0.0173406736272461 });
		mapCode2XY.put("IRIS_313-11089", new double[] { 0.0570998145771022, 0.0140013750748858 });
		mapCode2XY.put("IRIS_313-11090", new double[] { 0.0374727506988963, 0.019370380474051 });
		mapCode2XY.put("IRIS_313-11091", new double[] { 0.0346654952338433, 0.00757229114033244 });
		mapCode2XY.put("IRIS_313-11092", new double[] { -0.0265750423078735, 0.00606671516417445 });
		mapCode2XY.put("IRIS_313-11093", new double[] { -0.0851887223124659, 0.0142733467564896 });
		mapCode2XY.put("IRIS_313-11094", new double[] { -0.0809261258166127, 0.0123431079867296 });
		mapCode2XY.put("IRIS_313-11095", new double[] { -0.000830190133995485, 0.00766840409126491 });
		mapCode2XY.put("IRIS_313-11096", new double[] { 0.0400878345856128, 0.0186755541058842 });
		mapCode2XY.put("IRIS_313-11097", new double[] { 0.0325089924472595, 0.0131771756209214 });
		mapCode2XY.put("IRIS_313-11098", new double[] { 0.046762409765595, 0.0163673835030262 });
		mapCode2XY.put("IRIS_313-11099", new double[] { 0.0451073799242907, 0.000835407619184172 });
		mapCode2XY.put("IRIS_313-11100", new double[] { -0.0898999796239216, 0.0203415611365854 });
		mapCode2XY.put("IRIS_313-11101", new double[] { 0.0444767732270272, 0.0179026981474462 });
		mapCode2XY.put("IRIS_313-11102", new double[] { -0.0883406646707709, 0.0172571326246252 });
		mapCode2XY.put("IRIS_313-11103", new double[] { -0.0935793214822544, 0.0152390460567358 });
		mapCode2XY.put("IRIS_313-11104", new double[] { -0.093537644979748, 0.0152104926319496 });
		mapCode2XY.put("IRIS_313-11105", new double[] { -0.0880328795966315, 0.0167705687719375 });
		mapCode2XY.put("IRIS_313-11106", new double[] { -0.089457433521979, 0.0187618752343541 });
		mapCode2XY.put("IRIS_313-11107", new double[] { -0.0902014435390063, 0.0180442490352082 });
		mapCode2XY.put("IRIS_313-11108", new double[] { 0.0426281409285469, 0.0168600305445653 });
		mapCode2XY.put("IRIS_313-11109", new double[] { -0.0911070050432989, 0.0145729843507676 });
		mapCode2XY.put("IRIS_313-11110", new double[] { 0.0297528750781571, -0.0197130184994819 });
		mapCode2XY.put("IRIS_313-11111", new double[] { -0.0105822494234959, -0.132966954380139 });
		mapCode2XY.put("IRIS_313-11112", new double[] { 0.00358127695168699, -0.119092101912129 });
		mapCode2XY.put("IRIS_313-11113", new double[] { 0.0496390268319833, -0.00296082116167711 });
		mapCode2XY.put("IRIS_313-11114", new double[] { 0.0495960793850167, 0.0131517463851234 });
		mapCode2XY.put("IRIS_313-11115", new double[] { 0.0359815542550346, -0.0051052943228883 });
		mapCode2XY.put("IRIS_313-11116", new double[] { 0.000699908406606737, -0.119462165995782 });
		mapCode2XY.put("IRIS_313-11117", new double[] { -0.0846875674841209, 0.0165470408543741 });
		mapCode2XY.put("IRIS_313-11118", new double[] { 0.057812443707536, 0.0126828521434225 });
		mapCode2XY.put("IRIS_313-11119", new double[] { 0.0396850153226631, 0.00831318934671165 });
		mapCode2XY.put("IRIS_313-11120", new double[] { 0.0439312408171709, 0.00478929482624692 });
		mapCode2XY.put("IRIS_313-11121", new double[] { -0.0862000640170293, 0.0155154233265442 });
		mapCode2XY.put("IRIS_313-11122", new double[] { 0.0465215348630784, 0.00839165298354326 });
		mapCode2XY.put("IRIS_313-11123", new double[] { -0.00373945105375364, -0.11652875208807 });
		mapCode2XY.put("IRIS_313-11124", new double[] { -0.0110889797487969, -0.082734374279872 });
		mapCode2XY.put("IRIS_313-11125", new double[] { 0.00151220131719897, -0.0118228418555717 });
		mapCode2XY.put("IRIS_313-11126", new double[] { 0.0564362066847989, 0.0123714426101706 });
		mapCode2XY.put("IRIS_313-11127", new double[] { -0.0856720624800188, 0.014953929806256 });
		mapCode2XY.put("IRIS_313-11128", new double[] { 0.0340943426282056, 0.00603702117426609 });
		mapCode2XY.put("IRIS_313-11129", new double[] { 0.0363071266263547, 0.00264253450771072 });
		mapCode2XY.put("IRIS_313-11130", new double[] { 0.0290507325873821, 0.00954613560787114 });
		mapCode2XY.put("IRIS_313-11131", new double[] { 0.036906347346504, -0.0216983468368324 });
		mapCode2XY.put("IRIS_313-11132", new double[] { 0.0393318212708676, 0.00825060795646751 });
		mapCode2XY.put("IRIS_313-11133", new double[] { 0.0457276370079795, 0.0156593390422143 });
		mapCode2XY.put("IRIS_313-11134", new double[] { 0.0444462132516805, 0.00860469198450048 });
		mapCode2XY.put("IRIS_313-11135", new double[] { 0.0483219598545397, 0.0123985691956552 });
		mapCode2XY.put("IRIS_313-11136", new double[] { -0.0118072676398127, 0.00806688447183259 });
		mapCode2XY.put("IRIS_313-11137", new double[] { 0.0472308581931848, 0.00979625074838694 });
		mapCode2XY.put("IRIS_313-11138", new double[] { 0.0417148751839821, 0.0114222597025527 });
		mapCode2XY.put("IRIS_313-11139", new double[] { 0.0396698640048347, 0.0135457932560205 });
		mapCode2XY.put("IRIS_313-11140", new double[] { 0.0476514260605723, 0.0116452792225283 });
		mapCode2XY.put("IRIS_313-11141", new double[] { 0.0455751689554821, 0.0101864571981609 });
		mapCode2XY.put("IRIS_313-11142", new double[] { 0.0421479601137022, 0.0110668783515519 });
		mapCode2XY.put("IRIS_313-11143", new double[] { 0.0282174019963999, 0.000390229108088493 });
		mapCode2XY.put("IRIS_313-11144", new double[] { 0.0400872713590704, 0.00934368363804 });
		mapCode2XY.put("IRIS_313-11145", new double[] { 0.0442340590125694, 0.0162555266926108 });
		mapCode2XY.put("IRIS_313-11146", new double[] { 0.0463071056965229, 0.0155767620324677 });
		mapCode2XY.put("IRIS_313-11147", new double[] { 0.0480962773147211, 0.0062885665757167 });
		mapCode2XY.put("IRIS_313-11148", new double[] { 0.0438197335528095, 0.0103311988622999 });
		mapCode2XY.put("IRIS_313-11149", new double[] { 0.0462230483070695, 0.0185844663735672 });
		mapCode2XY.put("IRIS_313-11150", new double[] { 0.0459160810142436, 0.0189928830979928 });
		mapCode2XY.put("IRIS_313-11151", new double[] { 0.0530594671272087, 0.0176473848133125 });
		mapCode2XY.put("IRIS_313-11152", new double[] { 0.0412063984587884, 0.0171289230972063 });
		mapCode2XY.put("IRIS_313-11153", new double[] { -0.0764035198753999, 0.0131619364161168 });
		mapCode2XY.put("IRIS_313-11154", new double[] { -0.0125065520092738, -0.138381272814384 });
		mapCode2XY.put("IRIS_313-11155", new double[] { -0.0862475766846307, 0.0185411279930767 });
		mapCode2XY.put("IRIS_313-11156", new double[] { -0.0922777375430558, 0.0219345640448199 });
		mapCode2XY.put("IRIS_313-11157", new double[] { 0.0391274739571204, 0.0157960505008688 });
		mapCode2XY.put("IRIS_313-11158", new double[] { 0.043885713493953, 0.0174396762635188 });
		mapCode2XY.put("IRIS_313-11159", new double[] { -0.0900317773834026, 0.0142020947847594 });
		mapCode2XY.put("IRIS_313-11160", new double[] { 0.0503815260833985, 0.0156791922857726 });
		mapCode2XY.put("IRIS_313-11161", new double[] { -0.0907271770403798, 0.0184585229759758 });
		mapCode2XY.put("IRIS_313-11162", new double[] { 0.051930026452249, 0.00953087533460271 });
		mapCode2XY.put("IRIS_313-11163", new double[] { -0.00996927755905675, -0.143039679466658 });
		mapCode2XY.put("IRIS_313-11164", new double[] { -0.00738087608501511, -0.146999462904929 });
		mapCode2XY.put("IRIS_313-11165", new double[] { 0.023135393332147, -0.0900522409274186 });
		mapCode2XY.put("IRIS_313-11166", new double[] { -0.00882069107470672, -0.138007529081889 });
		mapCode2XY.put("IRIS_313-11167", new double[] { 0.0453041938175926, -0.0070129059875726 });
		mapCode2XY.put("IRIS_313-11168", new double[] { -0.0125913917866326, -0.136079794397129 });
		mapCode2XY.put("IRIS_313-11169", new double[] { -0.00425847461588021, -0.139353179536658 });
		mapCode2XY.put("IRIS_313-11170", new double[] { -0.0114387126523754, -0.146617921663435 });
		mapCode2XY.put("IRIS_313-11171", new double[] { -0.0108655182399769, -0.137847690864283 });
		mapCode2XY.put("IRIS_313-11172", new double[] { -0.0102833453569943, -0.1286163500044 });
		mapCode2XY.put("IRIS_313-11173", new double[] { -0.00400231819122294, -0.136845181292917 });
		mapCode2XY.put("IRIS_313-11174", new double[] { -0.00813499502995918, -0.129432784876619 });
		mapCode2XY.put("IRIS_313-11175", new double[] { -0.0077868688691738, -0.131357806696434 });
		mapCode2XY.put("IRIS_313-11176", new double[] { 0.0197916122188655, -0.0332851849622393 });
		mapCode2XY.put("IRIS_313-11177", new double[] { 0.0408233164467274, 0.0150016435228387 });
		mapCode2XY.put("IRIS_313-11178", new double[] { 0.0336128747183362, 0.0181352072225855 });
		mapCode2XY.put("IRIS_313-11179", new double[] { 0.0474613943992942, 0.0184375904622929 });
		mapCode2XY.put("IRIS_313-11180", new double[] { 0.0363819720304914, 0.0193062449713137 });
		mapCode2XY.put("IRIS_313-11181", new double[] { 0.0398365954635481, 0.0140018646132036 });
		mapCode2XY.put("IRIS_313-11182", new double[] { 0.0437748157530746, 0.0207154761191473 });
		mapCode2XY.put("IRIS_313-11183", new double[] { -0.0863292625780404, 0.0167249044649572 });
		mapCode2XY.put("IRIS_313-11189", new double[] { -0.0522876314608716, -0.0782938421624963 });
		mapCode2XY.put("IRIS_313-11191", new double[] { -0.0294801052337507, -0.126694092923209 });
		mapCode2XY.put("IRIS_313-11192", new double[] { 0.0515239361212927, 0.0179008499146297 });
		mapCode2XY.put("IRIS_313-11193", new double[] { 0.0433839312741189, 0.0178429030091885 });
		mapCode2XY.put("IRIS_313-11194", new double[] { 0.0521484722085128, 0.0197601192273265 });
		mapCode2XY.put("IRIS_313-11195", new double[] { -0.0862065752942037, 0.0136827817456446 });
		mapCode2XY.put("IRIS_313-11196", new double[] { 0.0444447032596867, 0.0166151105281795 });
		mapCode2XY.put("IRIS_313-11197", new double[] { 0.0447381945253885, 0.0126776473133206 });
		mapCode2XY.put("IRIS_313-11198", new double[] { -0.0932172436844538, 0.0169812630487502 });
		mapCode2XY.put("IRIS_313-11199", new double[] { 0.0445277503984053, 0.00498361274471395 });
		mapCode2XY.put("IRIS_313-11200", new double[] { 0.0475736211420914, 0.0189624604482173 });
		mapCode2XY.put("IRIS_313-11201", new double[] { -0.0936467049427361, 0.0197486081481059 });
		mapCode2XY.put("IRIS_313-11202", new double[] { -0.0921051178263263, 0.0153563565314334 });
		mapCode2XY.put("IRIS_313-11203", new double[] { 0.0439101244257469, 0.0125991984538306 });
		mapCode2XY.put("IRIS_313-11204", new double[] { 0.0366123563554808, -0.0290046469486776 });
		mapCode2XY.put("IRIS_313-11205", new double[] { 0.055799798053609, 0.00441199121941344 });
		mapCode2XY.put("IRIS_313-11206", new double[] { 0.0474192884447018, 0.0078124168222012 });
		mapCode2XY.put("IRIS_313-11207", new double[] { 0.0439185768505549, -0.00222109159183492 });
		mapCode2XY.put("IRIS_313-11208", new double[] { 0.0450012282588704, 0.00758943523767314 });
		mapCode2XY.put("IRIS_313-11209", new double[] { 0.0463794614350531, 0.00261788792933071 });
		mapCode2XY.put("IRIS_313-11210", new double[] { -0.00832028714210317, -0.125997096888622 });
		mapCode2XY.put("IRIS_313-11211", new double[] { 0.0455025422821389, -0.00943906884530821 });
		mapCode2XY.put("IRIS_313-11212", new double[] { 0.0453738464126305, -0.00602749405627841 });
		mapCode2XY.put("IRIS_313-11213", new double[] { -0.0105912851931648, -0.137979985057111 });
		mapCode2XY.put("IRIS_313-11214", new double[] { -0.00228115282035227, -0.125524767681431 });
		mapCode2XY.put("IRIS_313-11216", new double[] { -0.00254877062741786, -0.124517735726571 });
		mapCode2XY.put("IRIS_313-11217", new double[] { -0.0715762766100501, -0.0116331613689876 });
		mapCode2XY.put("IRIS_313-11218", new double[] { -0.0769507587584922, -0.024909373551249 });
		mapCode2XY.put("IRIS_313-11219", new double[] { 0.039680197769613, -0.000662771536581978 });
		mapCode2XY.put("IRIS_313-11220", new double[] { 0.0524215484043204, -0.00715580582188432 });
		mapCode2XY.put("IRIS_313-11221", new double[] { 0.0516424331629771, 0.00152798955667734 });
		mapCode2XY.put("IRIS_313-11222", new double[] { 0.0434227786097808, 0.00145931936187828 });
		mapCode2XY.put("IRIS_313-11223", new double[] { -0.0425890797245923, -0.0118570282350077 });
		mapCode2XY.put("IRIS_313-11224", new double[] { 0.04944256177171, 0.000312591658519511 });
		mapCode2XY.put("IRIS_313-11225", new double[] { 0.0473332906789993, 0.00727965108859912 });
		mapCode2XY.put("IRIS_313-11226", new double[] { 0.0517013219122076, 0.000731988694379371 });
		mapCode2XY.put("IRIS_313-11227", new double[] { 0.043444667978851, 0.000295877988583162 });
		mapCode2XY.put("IRIS_313-11228", new double[] { 0.0463314346797561, -0.00125466037276725 });
		mapCode2XY.put("IRIS_313-11229", new double[] { 0.0514477299851899, -0.000455437434213244 });
		mapCode2XY.put("IRIS_313-11230", new double[] { 0.0462909723810701, -0.00103279422042205 });
		mapCode2XY.put("IRIS_313-11231", new double[] { 0.0444595524486113, 0.00381742453710315 });
		mapCode2XY.put("IRIS_313-11232", new double[] { -0.00580150646853223, -0.103079315876122 });
		mapCode2XY.put("IRIS_313-11233", new double[] { 0.0449584701250013, 0.0234655318070988 });
		mapCode2XY.put("IRIS_313-11234", new double[] { 0.0457163466174727, 0.0195312601682781 });
		mapCode2XY.put("IRIS_313-11235", new double[] { 0.0435432556020212, 0.00405580521075314 });
		mapCode2XY.put("IRIS_313-11236", new double[] { 0.0462853954660008, 0.0226644547571025 });
		mapCode2XY.put("IRIS_313-11237", new double[] { 0.0371334114052954, 0.0122530437203205 });
		mapCode2XY.put("IRIS_313-11238", new double[] { -0.0902160356673159, 0.00865423397372669 });
		mapCode2XY.put("IRIS_313-11239", new double[] { 0.0540227390425307, 0.0164663071603863 });
		mapCode2XY.put("IRIS_313-11240", new double[] { 0.0478136356692472, 0.00362535424171812 });
		mapCode2XY.put("IRIS_313-11241", new double[] { 0.0523247458606159, -0.00267891166897701 });
		mapCode2XY.put("IRIS_313-11242", new double[] { 0.0398551180169217, -0.0160108401007824 });
		mapCode2XY.put("IRIS_313-11243", new double[] { 0.020874099363427, -0.0578687850167732 });
		mapCode2XY.put("IRIS_313-11244", new double[] { 0.0544658595110561, 0.015499859171865 });
		mapCode2XY.put("IRIS_313-11245", new double[] { 0.054479695146458, 0.0193427818898805 });
		mapCode2XY.put("IRIS_313-11246", new double[] { -0.0874393701116709, 0.0160333729128627 });
		mapCode2XY.put("IRIS_313-11247", new double[] { 0.0499986633977372, 0.0103667769482529 });
		mapCode2XY.put("IRIS_313-11248", new double[] { -0.0855224870320966, 0.0157600049191305 });
		mapCode2XY.put("IRIS_313-11249", new double[] { 0.0337495480781341, 0.0028385295713252 });
		mapCode2XY.put("IRIS_313-11250", new double[] { 0.0412502602075405, 0.0173714043962461 });
		mapCode2XY.put("IRIS_313-11251", new double[] { 0.0490160172578919, 0.0150303663228513 });
		mapCode2XY.put("IRIS_313-11252", new double[] { 0.0408096339094095, -0.0066853179466466 });
		mapCode2XY.put("IRIS_313-11253", new double[] { 0.0279581536947311, 0.0150191202900224 });
		mapCode2XY.put("IRIS_313-11254", new double[] { 0.0412691676524276, 0.0170190861229411 });
		mapCode2XY.put("IRIS_313-11255", new double[] { 0.0368359369285829, 0.00658093847240012 });
		mapCode2XY.put("IRIS_313-11256", new double[] { 0.0536598717220152, 0.00417443682362418 });
		mapCode2XY.put("IRIS_313-11257", new double[] { -7.08400572996537E-06, 0.00920026869913081 });
		mapCode2XY.put("IRIS_313-11258", new double[] { -0.0579460356049054, -0.0159680790453854 });
		mapCode2XY.put("IRIS_313-11259", new double[] { -0.0721264929004743, -0.00918537538390011 });
		mapCode2XY.put("IRIS_313-11260", new double[] { 0.0323389106467551, -0.00838660732874999 });
		mapCode2XY.put("IRIS_313-11261", new double[] { 0.0433056844496503, 0.014761784312 });
		mapCode2XY.put("IRIS_313-11262", new double[] { 0.0521196000401258, 0.00645549953047177 });
		mapCode2XY.put("IRIS_313-11263", new double[] { 0.0267326663300769, 0.00975109720830885 });
		mapCode2XY.put("IRIS_313-11264", new double[] { 0.0523179892825723, 0.0100487795079167 });
		mapCode2XY.put("IRIS_313-11265", new double[] { -0.00555972375242282, -0.133705548003241 });
		mapCode2XY.put("IRIS_313-11266", new double[] { 0.052906095550225, 0.0125045777898453 });
		mapCode2XY.put("IRIS_313-11267", new double[] { 0.0520401140308275, 0.00645952038956957 });
		mapCode2XY.put("IRIS_313-11268", new double[] { -0.0759217229995092, -0.0102647924520339 });
		mapCode2XY.put("IRIS_313-11269", new double[] { -0.00518993527232637, -0.00516180384767433 });
		mapCode2XY.put("IRIS_313-11270", new double[] { -0.0573959780397625, -0.0104589346511923 });
		mapCode2XY.put("IRIS_313-11271", new double[] { 0.0458292298364452, 0.00750327021328 });
		mapCode2XY.put("IRIS_313-11272", new double[] { -0.00827995835886028, -0.135544665605146 });
		mapCode2XY.put("IRIS_313-11273", new double[] { 0.058379144558457, 0.00432655465727997 });
		mapCode2XY.put("IRIS_313-11274", new double[] { -0.0069844351030514, -0.105694991226204 });
		mapCode2XY.put("IRIS_313-11275", new double[] { 0.0439154469290863, -0.00527926653002666 });
		mapCode2XY.put("IRIS_313-11276", new double[] { 0.0270688625530495, 0.00942121927805465 });
		mapCode2XY.put("IRIS_313-11277", new double[] { 0.00691106545911278, -0.119339283703895 });
		mapCode2XY.put("IRIS_313-11278", new double[] { 0.0466881950785703, 0.00763284249995388 });
		mapCode2XY.put("IRIS_313-11279", new double[] { 0.033329242865993, 0.0076266323990264 });
		mapCode2XY.put("IRIS_313-11280", new double[] { 0.043739116469478, 0.0195017979329741 });
		mapCode2XY.put("IRIS_313-11281", new double[] { 0.0495409301439355, 0.0116971041614888 });
		mapCode2XY.put("IRIS_313-11282", new double[] { 0.0428987810187537, 0.00275450256083121 });
		mapCode2XY.put("IRIS_313-11283", new double[] { 0.034407195647716, 0.0054647253433293 });
		mapCode2XY.put("IRIS_313-11284", new double[] { 0.0349249508952431, 0.00788999096749784 });
		mapCode2XY.put("IRIS_313-11285", new double[] { 0.0437773002688146, -0.00613814271764708 });
		mapCode2XY.put("IRIS_313-11286", new double[] { 0.031884579123151, -0.00160526667686256 });
		mapCode2XY.put("IRIS_313-11287", new double[] { 0.044233781964367, 0.0113172028942784 });
		mapCode2XY.put("IRIS_313-11288", new double[] { 0.0360288456778954, 0.00233513018401071 });
		mapCode2XY.put("IRIS_313-11289", new double[] { -0.0780430550454071, -0.0154616977582463 });
		mapCode2XY.put("IRIS_313-11290", new double[] { -0.0088994146169541, -0.00354753872924455 });
		mapCode2XY.put("IRIS_313-11291", new double[] { -0.00510930564075557, -0.115389639177658 });
		mapCode2XY.put("IRIS_313-11292", new double[] { 0.0452396288887949, 0.0127634853340992 });
		mapCode2XY.put("IRIS_313-11293", new double[] { -0.0751821011736, -0.0148442662845346 });
		mapCode2XY.put("IRIS_313-11294", new double[] { 0.0450227809742613, 0.0136491521686346 });
		mapCode2XY.put("IRIS_313-11295", new double[] { 0.00574091059246992, -0.0180763374867485 });
		mapCode2XY.put("IRIS_313-11296", new double[] { 0.0387504478883788, 0.00856016240405157 });
		mapCode2XY.put("IRIS_313-11297", new double[] { -0.0865229180427947, -0.00275549903906134 });
		mapCode2XY.put("IRIS_313-11298", new double[] { -0.0108837697528987, -0.131649104087834 });
		mapCode2XY.put("IRIS_313-11299", new double[] { 0.0380688448272339, 0.00697216519927086 });
		mapCode2XY.put("IRIS_313-11300", new double[] { 0.0388699002169403, -0.00911504117894079 });
		mapCode2XY.put("IRIS_313-11301", new double[] { 0.0507175498341586, 0.0031559626264287 });
		mapCode2XY.put("IRIS_313-11302", new double[] { 0.0325574259873128, -0.0283638946869852 });
		mapCode2XY.put("IRIS_313-11303", new double[] { 0.0315202790802049, -0.000587584882178482 });
		mapCode2XY.put("IRIS_313-11304", new double[] { 0.0429262336836168, 0.0146374250103314 });
		mapCode2XY.put("IRIS_313-11305", new double[] { 0.0255739747648838, 0.0104602383229202 });
		mapCode2XY.put("IRIS_313-11306", new double[] { 0.0411727878340576, 0.00983940167112152 });
		mapCode2XY.put("IRIS_313-11307", new double[] { 0.0485326399055944, 0.010319993466444 });
		mapCode2XY.put("IRIS_313-11308", new double[] { 0.049462086513142, 0.0113441507601564 });
		mapCode2XY.put("IRIS_313-11309", new double[] { 0.0483030393681006, 0.0129655432693417 });
		mapCode2XY.put("IRIS_313-11310", new double[] { 0.0461737421086346, 0.00152282145722918 });
		mapCode2XY.put("IRIS_313-11311", new double[] { -0.0864244527902338, 0.0134371486531351 });
		mapCode2XY.put("IRIS_313-11312", new double[] { 0.0397571921144671, 0.019397549671701 });
		mapCode2XY.put("IRIS_313-11313", new double[] { -0.0826342547618528, 0.013046694909715 });
		mapCode2XY.put("IRIS_313-11314", new double[] { -0.0865209297121839, 0.0162554291337162 });
		mapCode2XY.put("IRIS_313-11315", new double[] { 0.0438861924843647, 0.0199448680898665 });
		mapCode2XY.put("IRIS_313-11316", new double[] { 0.0416125017124807, 0.0208926030704941 });
		mapCode2XY.put("IRIS_313-11317", new double[] { 0.0457984991560282, 0.0185987765547744 });
		mapCode2XY.put("IRIS_313-11318", new double[] { 0.0460868464922789, 0.0179807233023792 });
		mapCode2XY.put("IRIS_313-11319", new double[] { 0.040386421350327, 0.0140085623347101 });
		mapCode2XY.put("IRIS_313-11320", new double[] { 0.0466733304035419, 0.0193406765865244 });
		mapCode2XY.put("IRIS_313-11321", new double[] { 0.0485067025643246, 0.00200083100125812 });
		mapCode2XY.put("IRIS_313-11322", new double[] { -0.01104058894366, -0.135840847478663 });
		mapCode2XY.put("IRIS_313-11323", new double[] { -0.00940426837559157, -0.139718842875709 });
		mapCode2XY.put("IRIS_313-11324", new double[] { -0.00516581487488939, -0.14179111884604 });
		mapCode2XY.put("IRIS_313-11325", new double[] { 0.0484453803884451, 0.0100189098111506 });
		mapCode2XY.put("IRIS_313-11326", new double[] { 0.0471166789059329, 0.0172202468862883 });
		mapCode2XY.put("IRIS_313-11327", new double[] { 0.046522361932661, 0.0189279573036448 });
		mapCode2XY.put("IRIS_313-11328", new double[] { -0.0873983622301084, 0.0152906600389155 });
		mapCode2XY.put("IRIS_313-11329", new double[] { -0.0813217474673526, 0.0147979949269434 });
		mapCode2XY.put("IRIS_313-11330", new double[] { 0.0394590782223195, 0.0193711826153718 });
		mapCode2XY.put("IRIS_313-11331", new double[] { 0.0461585331069779, 0.0162488540888594 });
		mapCode2XY.put("IRIS_313-11334", new double[] { 0.0468085827280224, 0.0144500804797961 });
		mapCode2XY.put("IRIS_313-11335", new double[] { 0.0414044568302646, -0.00595097374823555 });
		mapCode2XY.put("IRIS_313-11336", new double[] { -0.0867230768582542, 0.0166785118157263 });
		mapCode2XY.put("IRIS_313-11337", new double[] { -0.0852151743403969, 0.0179654312354392 });
		mapCode2XY.put("IRIS_313-11338", new double[] { 0.0480194275963123, 0.0114836420719183 });
		mapCode2XY.put("IRIS_313-11339", new double[] { 0.0422092533391814, -0.00438384987586807 });
		mapCode2XY.put("IRIS_313-11340", new double[] { -0.0861269234170712, 0.0166522851719649 });
		mapCode2XY.put("IRIS_313-11341", new double[] { 0.0449146302917627, 0.0168473518969844 });
		mapCode2XY.put("IRIS_313-11342", new double[] { 0.00493445546221805, 0.0128033379216813 });
		mapCode2XY.put("IRIS_313-11343", new double[] { 0.0393877627420027, 0.0174347123818372 });
		mapCode2XY.put("IRIS_313-11344", new double[] { 0.0395772884279832, 0.00919124872829735 });
		mapCode2XY.put("IRIS_313-11345", new double[] { 0.0451215305700191, 0.0108011371201494 });
		mapCode2XY.put("IRIS_313-11346", new double[] { 0.0451385962828075, 0.013028320750257 });
		mapCode2XY.put("IRIS_313-11347", new double[] { 0.0396222298079599, 0.0142521591121974 });
		mapCode2XY.put("IRIS_313-11348", new double[] { -0.00892225299013463, -0.135229995975843 });
		mapCode2XY.put("IRIS_313-11349", new double[] { 0.0494217413306387, 0.00341058781060072 });
		mapCode2XY.put("IRIS_313-11350", new double[] { -0.0673879181724006, -0.0224127913608959 });
		mapCode2XY.put("IRIS_313-11351", new double[] { 0.0540638082259433, 0.000467968879542183 });
		mapCode2XY.put("IRIS_313-11352", new double[] { -0.0631929471301858, -0.00700399376823027 });
		mapCode2XY.put("IRIS_313-11353", new double[] { 0.00102492481246935, -0.117544829154391 });
		mapCode2XY.put("IRIS_313-11354", new double[] { 0.0456828153848874, 0.000687882156131784 });
		mapCode2XY.put("IRIS_313-11355", new double[] { 0.0304890516184298, -0.0390371162358343 });
		mapCode2XY.put("IRIS_313-11356", new double[] { -0.0763867356263812, -0.0256841748316859 });
		mapCode2XY.put("IRIS_313-11357", new double[] { 0.0478521218847538, 0.0127720626978138 });
		mapCode2XY.put("IRIS_313-11358", new double[] { 0.0503557175855374, 0.00373206024604237 });
		mapCode2XY.put("IRIS_313-11359", new double[] { 0.047822199093899, 0.00179838135455853 });
		mapCode2XY.put("IRIS_313-11360", new double[] { -0.0690781687668342, -0.0143381536702362 });
		mapCode2XY.put("IRIS_313-11361", new double[] { 0.0477137257718858, -0.00278803326005118 });
		mapCode2XY.put("IRIS_313-11362", new double[] { -0.0727623662738274, -0.0286130387864877 });
		mapCode2XY.put("IRIS_313-11363", new double[] { 0.0478192250967573, 0.00102097993017036 });
		mapCode2XY.put("IRIS_313-11364", new double[] { 0.0107291309807962, -0.000175367089015448 });
		mapCode2XY.put("IRIS_313-11365", new double[] { 0.0528254501545344, 0.00549440443121273 });
		mapCode2XY.put("IRIS_313-11367", new double[] { 0.0491359658542823, -0.000350004606361806 });
		mapCode2XY.put("IRIS_313-11368", new double[] { 0.042789477265918, 0.00827724251167469 });
		mapCode2XY.put("IRIS_313-11369", new double[] { 0.0469217412567598, 0.0022188686720054 });
		mapCode2XY.put("IRIS_313-11370", new double[] { 0.0509448134762781, 0.00100796715752885 });
		mapCode2XY.put("IRIS_313-11371", new double[] { -0.00484286465549932, -0.138636849415792 });
		mapCode2XY.put("IRIS_313-11372", new double[] { 0.051291531159506, -0.00667747651080999 });
		mapCode2XY.put("IRIS_313-11373", new double[] { -0.0744634143407596, -0.0209726879947887 });
		mapCode2XY.put("IRIS_313-11374", new double[] { -0.00983624570130188, -0.131950460696843 });
		mapCode2XY.put("IRIS_313-11375", new double[] { -0.0329448961776113, -0.0138137050131699 });
		mapCode2XY.put("IRIS_313-11376", new double[] { -0.0928061421763541, 0.0137289999382183 });
		mapCode2XY.put("IRIS_313-11377", new double[] { 0.0316590109975691, 0.0127600163550341 });
		mapCode2XY.put("IRIS_313-11379", new double[] { -0.0829760908699035, 0.0132283070470249 });
		mapCode2XY.put("IRIS_313-11380", new double[] { -0.0541165517439834, 0.0107489094774284 });
		mapCode2XY.put("IRIS_313-11381", new double[] { 0.0469814135559147, 0.0152677038219737 });
		mapCode2XY.put("IRIS_313-11382", new double[] { 0.043189161266526, 0.0013307772250164 });
		mapCode2XY.put("IRIS_313-11383", new double[] { 0.0342744660774737, 0.00980919902227485 });
		mapCode2XY.put("IRIS_313-11384", new double[] { 0.0305964764579554, 0.0128071433946184 });
		mapCode2XY.put("IRIS_313-11385", new double[] { 0.045073406816925, 0.00863575416510566 });
		mapCode2XY.put("IRIS_313-11386", new double[] { 0.0442612331127569, 0.0172408850495663 });
		mapCode2XY.put("IRIS_313-11387", new double[] { 0.0393784589582592, 0.0074560309750853 });
		mapCode2XY.put("IRIS_313-11388", new double[] { 0.0469377674976427, 0.0157843783303693 });
		mapCode2XY.put("IRIS_313-11389", new double[] { 0.0467622784181176, 0.0193042649874646 });
		mapCode2XY.put("IRIS_313-11390", new double[] { 0.0491084493923621, 0.0173209305920905 });
		mapCode2XY.put("IRIS_313-11391", new double[] { 0.0486993148367279, 0.0138632367972679 });
		mapCode2XY.put("IRIS_313-11392", new double[] { 0.0485556557052772, 0.0166491100325353 });
		mapCode2XY.put("IRIS_313-11393", new double[] { 0.0480001838476841, 0.0174086340849073 });
		mapCode2XY.put("IRIS_313-11394", new double[] { 0.0506202291376296, 0.0127812136059115 });
		mapCode2XY.put("IRIS_313-11395", new double[] { 0.0482176026819143, 0.0125980982562446 });
		mapCode2XY.put("IRIS_313-11396", new double[] { -0.0855479086111401, 0.0127161919210062 });
		mapCode2XY.put("IRIS_313-11397", new double[] { -0.0825308320657285, 0.0127949027400313 });
		mapCode2XY.put("IRIS_313-11398", new double[] { 0.0480887556343351, 0.0162263353729836 });
		mapCode2XY.put("IRIS_313-11399", new double[] { 0.0497931344409389, 0.00836889218168737 });
		mapCode2XY.put("IRIS_313-11400", new double[] { 0.038511394173562, 0.00847456377265088 });
		mapCode2XY.put("IRIS_313-11401", new double[] { -0.0773312189239889, -0.0117708277399666 });
		mapCode2XY.put("IRIS_313-11402", new double[] { 0.047415486725449, 0.00773125669091619 });
		mapCode2XY.put("IRIS_313-11403", new double[] { 0.0354510517283084, 0.00436973275731208 });
		mapCode2XY.put("IRIS_313-11404", new double[] { 0.0430556432477, 0.0110988480976313 });
		mapCode2XY.put("IRIS_313-11405", new double[] { 0.0268287945496102, 0.00330812669458654 });
		mapCode2XY.put("IRIS_313-11406", new double[] { 0.0470489838159067, 0.0216742172779497 });
		mapCode2XY.put("IRIS_313-11407", new double[] { 0.0425852706159792, 0.00319671683392844 });
		mapCode2XY.put("IRIS_313-11408", new double[] { 0.0439417310833254, -0.000756805698083034 });
		mapCode2XY.put("IRIS_313-11409", new double[] { 0.0356895820820332, -0.0105079277654098 });
		mapCode2XY.put("IRIS_313-11410", new double[] { 0.0314794576878929, -0.00348506357886695 });
		mapCode2XY.put("IRIS_313-11411", new double[] { 0.0394771204422194, -0.0077643586794514 });
		mapCode2XY.put("IRIS_313-11413", new double[] { -0.0492356318098691, -0.0975199318061462 });
		mapCode2XY.put("IRIS_313-11414", new double[] { 0.0419698677969291, -0.000834624985168329 });
		mapCode2XY.put("IRIS_313-11415", new double[] { -0.0156962235001961, -0.014332478666288 });
		mapCode2XY.put("IRIS_313-11416", new double[] { 0.0515286295173417, 0.00144154930849726 });
		mapCode2XY.put("IRIS_313-11417", new double[] { -0.0212804908969054, -0.0226957802786828 });
		mapCode2XY.put("IRIS_313-11418", new double[] { 0.0495224847825471, -0.0013083779525142 });
		mapCode2XY.put("IRIS_313-11419", new double[] { 0.0384387120792253, -0.00340145429351017 });
		mapCode2XY.put("IRIS_313-11420", new double[] { 0.0405773728889492, -0.0188949313258088 });
		mapCode2XY.put("IRIS_313-11421", new double[] { 0.0405838056377855, -0.00343190640236759 });
		mapCode2XY.put("IRIS_313-11422", new double[] { 0.0397550182516459, 0.0137502926012788 });
		mapCode2XY.put("IRIS_313-11423", new double[] { 0.0398693079058375, 0.0198222288160713 });
		mapCode2XY.put("IRIS_313-11424", new double[] { -0.0811414974208081, 0.0133130819916389 });
		mapCode2XY.put("IRIS_313-11425", new double[] { -0.0300831841061375, 0.00819579026981191 });
		mapCode2XY.put("IRIS_313-11426", new double[] { -0.0900103078264006, 0.0163456107456716 });
		mapCode2XY.put("IRIS_313-11427", new double[] { -0.0903085776224049, 0.0101851783813519 });
		mapCode2XY.put("IRIS_313-11428", new double[] { -0.0933169383122356, 0.0166063372486498 });
		mapCode2XY.put("IRIS_313-11429", new double[] { 0.0473298767982326, 0.0199045583437775 });
		mapCode2XY.put("IRIS_313-11431", new double[] { 0.0334058500474357, -0.05438813514033 });
		mapCode2XY.put("IRIS_313-11432", new double[] { 0.0504490424685544, 0.0133144355423375 });
		mapCode2XY.put("IRIS_313-11433", new double[] { -0.0897272293693616, 0.0171885193228735 });
		mapCode2XY.put("IRIS_313-11434", new double[] { -0.0910584055511097, 0.0155086363288716 });
		mapCode2XY.put("IRIS_313-11435", new double[] { -0.0886428201765225, 0.0169489138300366 });
		mapCode2XY.put("IRIS_313-11436", new double[] { 0.0499690932380791, 0.0176803216822648 });
		mapCode2XY.put("IRIS_313-11437", new double[] { -0.0947226136809865, 0.0175203411107932 });
		mapCode2XY.put("IRIS_313-11438", new double[] { 0.0536069543660784, 0.0183794230472431 });
		mapCode2XY.put("IRIS_313-11439", new double[] { -0.0870280817564754, 0.0161022245351146 });
		mapCode2XY.put("IRIS_313-11441", new double[] { -0.0830562787159073, 0.0146989555291526 });
		mapCode2XY.put("IRIS_313-11442", new double[] { 0.0491494554672734, 0.0103452497695494 });
		mapCode2XY.put("IRIS_313-11443", new double[] { 0.0512848146903095, 0.0104624789765967 });
		mapCode2XY.put("IRIS_313-11445", new double[] { 0.0509143064069546, -0.00836824877385506 });
		mapCode2XY.put("IRIS_313-11446", new double[] { 0.0504714024630931, -0.00644069216401798 });
		mapCode2XY.put("IRIS_313-11447", new double[] { 0.0545433946399606, 0.0101303165573075 });
		mapCode2XY.put("IRIS_313-11448", new double[] { 0.0448709453585988, -0.0120676553677777 });
		mapCode2XY.put("IRIS_313-11449", new double[] { 0.0391514817076609, -0.0327175410660807 });
		mapCode2XY.put("IRIS_313-11451", new double[] { -0.0657709871054332, -0.0286491185471053 });
		mapCode2XY.put("IRIS_313-11452", new double[] { -0.00478801490868228, -0.102330578397272 });
		mapCode2XY.put("IRIS_313-11453", new double[] { 0.0479162595307154, -0.0189378989580418 });
		mapCode2XY.put("IRIS_313-11454", new double[] { -0.00842191698414973, -0.132003808739436 });
		mapCode2XY.put("IRIS_313-11455", new double[] { -0.0184083701607665, -0.134645423762549 });
		mapCode2XY.put("IRIS_313-11456", new double[] { -0.00336315149095759, -0.127155341181282 });
		mapCode2XY.put("IRIS_313-11458", new double[] { -0.00596160689085683, -0.147972736373102 });
		mapCode2XY.put("IRIS_313-11460", new double[] { 0.0494555656337471, -0.0304904485415135 });
		mapCode2XY.put("IRIS_313-11461", new double[] { 0.0539816008608595, -0.00578368586608132 });
		mapCode2XY.put("IRIS_313-11462", new double[] { -0.00440077953232924, -0.125570679930331 });
		mapCode2XY.put("IRIS_313-11463", new double[] { 0.0435009456509863, 0.0140784160219527 });
		mapCode2XY.put("IRIS_313-11464", new double[] { -0.0873707219156113, 0.0153476274334508 });
		mapCode2XY.put("IRIS_313-11465", new double[] { -0.0911523935935736, 0.0151754548550311 });
		mapCode2XY.put("IRIS_313-11467", new double[] { 0.0504506388408557, 0.0195150271591538 });
		mapCode2XY.put("IRIS_313-11471", new double[] { 0.0553528143612833, 0.0126036873453156 });
		mapCode2XY.put("IRIS_313-11472", new double[] { 0.0498986485914751, 0.0161118040699879 });
		mapCode2XY.put("IRIS_313-11473", new double[] { -0.090584843036401, 0.0131390537270692 });
		mapCode2XY.put("IRIS_313-11476", new double[] { -0.0033221764212351, -0.0902696072170563 });
		mapCode2XY.put("IRIS_313-11477", new double[] { -0.0200304310281007, -0.132160782318742 });
		mapCode2XY.put("IRIS_313-11478", new double[] { 0.0409228439486794, -0.0479635228765425 });
		mapCode2XY.put("IRIS_313-11479", new double[] { -0.0821014546310449, 0.0156722294032419 });
		mapCode2XY.put("IRIS_313-11480", new double[] { 0.0482245000852888, 0.0157481019252568 });
		mapCode2XY.put("IRIS_313-11481", new double[] { -0.00554184266269298, -0.14585059166584 });
		mapCode2XY.put("IRIS_313-11482", new double[] { 0.00481291913223931, -0.120593029690341 });
		mapCode2XY.put("IRIS_313-11483", new double[] { -0.00392101516153062, -0.142210000781924 });
		mapCode2XY.put("IRIS_313-11484", new double[] { 0.00995754640639498, -0.108940818792158 });
		mapCode2XY.put("IRIS_313-11485", new double[] { 0.0544270686312082, 0.017517176217996 });
		mapCode2XY.put("IRIS_313-11486", new double[] { 0.0201497006832738, -0.0484873001179173 });
		mapCode2XY.put("IRIS_313-11487", new double[] { 0.0472145337428512, -0.0167635075302177 });
		mapCode2XY.put("IRIS_313-11489", new double[] { 0.00314123294819245, -0.0956796416214164 });
		mapCode2XY.put("IRIS_313-11490", new double[] { 0.0514714756045638, 0.0086974212041636 });
		mapCode2XY.put("IRIS_313-11491", new double[] { 0.0522836173318842, -0.00258414990040129 });
		mapCode2XY.put("IRIS_313-11492", new double[] { 0.000418905582013117, -0.138601330063834 });
		mapCode2XY.put("IRIS_313-11493", new double[] { 0.0514087769044693, 0.0121804515164119 });
		mapCode2XY.put("IRIS_313-11494", new double[] { -0.0872985946161991, 0.0111465635154056 });
		mapCode2XY.put("IRIS_313-11495", new double[] { -0.0830886400797593, 0.0150742025500423 });
		mapCode2XY.put("IRIS_313-11496", new double[] { -0.0860501181581468, 0.0137183231523015 });
		mapCode2XY.put("IRIS_313-11497", new double[] { 0.0454672134998079, -0.0200247549397211 });
		mapCode2XY.put("IRIS_313-11498", new double[] { -0.0767129342329859, 0.0147705007801459 });
		mapCode2XY.put("IRIS_313-11499", new double[] { -0.0844458709716585, 0.0158811967216863 });
		mapCode2XY.put("IRIS_313-11500", new double[] { 0.0552499645727346, 0.00635756818574986 });
		mapCode2XY.put("IRIS_313-11505", new double[] { 0.0528208335026973, 0.0019896015339028 });
		mapCode2XY.put("IRIS_313-11506", new double[] { 0.0540799133480315, 0.00730058213612246 });
		mapCode2XY.put("IRIS_313-11507", new double[] { 0.0465595892235675, 0.0149579038966993 });
		mapCode2XY.put("IRIS_313-11508", new double[] { 0.0556361390200517, 0.0166689945278979 });
		mapCode2XY.put("IRIS_313-11509", new double[] { 0.0510851663076381, 0.0176124807448398 });
		mapCode2XY.put("IRIS_313-11510", new double[] { 0.0504764299085453, 0.0107805387660774 });
		mapCode2XY.put("IRIS_313-11511", new double[] { -0.0893515825781157, 0.0113859057939876 });
		mapCode2XY.put("IRIS_313-11512", new double[] { 0.0528704442910379, 0.016066070337229 });
		mapCode2XY.put("IRIS_313-11513", new double[] { 0.0537663288228455, 0.0186710556098666 });
		mapCode2XY.put("IRIS_313-11515", new double[] { 0.0526768508827644, 0.00746681204117215 });
		mapCode2XY.put("IRIS_313-11516", new double[] { 0.0557288055956047, 0.00916911251054834 });
		mapCode2XY.put("IRIS_313-11517", new double[] { 0.0477718667180507, 0.0190706699356541 });
		mapCode2XY.put("IRIS_313-11521", new double[] { 0.0447848151447004, 0.00957096849223561 });
		mapCode2XY.put("IRIS_313-11522", new double[] { -0.08805763987067, 0.010265714459642 });
		mapCode2XY.put("IRIS_313-11523", new double[] { 0.0540143670067836, 0.012577189735688 });
		mapCode2XY.put("IRIS_313-11524", new double[] { -0.0893593614498754, 0.0141995868796445 });
		mapCode2XY.put("IRIS_313-11525", new double[] { 0.0515458227944743, 0.0164725901293994 });
		mapCode2XY.put("IRIS_313-11526", new double[] { -0.0893817660806739, 0.0143985730816122 });
		mapCode2XY.put("IRIS_313-11527", new double[] { -0.0937968806914269, 0.0161677058132947 });
		mapCode2XY.put("IRIS_313-11528", new double[] { 0.0560707649043345, 0.0174906944233606 });
		mapCode2XY.put("IRIS_313-11530", new double[] { 0.0563929286688884, 0.0163870984938838 });
		mapCode2XY.put("IRIS_313-11532", new double[] { -0.0855657136232072, 0.0158097286962212 });
		mapCode2XY.put("IRIS_313-11534", new double[] { 0.0500882382056309, 0.0165859744003245 });
		mapCode2XY.put("IRIS_313-11535", new double[] { 0.0383551349155576, 0.00985334041950971 });
		mapCode2XY.put("IRIS_313-11536", new double[] { -0.0950284792884804, 0.0135069679180901 });
		mapCode2XY.put("IRIS_313-11537", new double[] { -0.091013751712265, 0.0177967457555694 });
		mapCode2XY.put("IRIS_313-11538", new double[] { 0.0368671073479579, 0.0204819403273239 });
		mapCode2XY.put("IRIS_313-11539", new double[] { -0.0916858205969296, 0.0186735222476728 });
		mapCode2XY.put("IRIS_313-11540", new double[] { -0.0935303506191762, 0.0141521338894654 });
		mapCode2XY.put("IRIS_313-11541", new double[] { 0.0531661365322926, 0.0146493585560695 });
		mapCode2XY.put("IRIS_313-11542", new double[] { -0.0679170996744356, -0.0154461064852042 });
		mapCode2XY.put("IRIS_313-11543", new double[] { 0.0521677557818166, 0.0163919248259676 });
		mapCode2XY.put("IRIS_313-11544", new double[] { 0.0539318628684469, 0.00895769695672577 });
		mapCode2XY.put("IRIS_313-11545", new double[] { 0.053555868905711, 0.00893410779011668 });
		mapCode2XY.put("IRIS_313-11546", new double[] { 0.0545149486137246, 0.0124928252118724 });
		mapCode2XY.put("IRIS_313-11547", new double[] { 0.0483851616415674, 0.0197275378228981 });
		mapCode2XY.put("IRIS_313-11548", new double[] { 0.0510150113052771, 0.0103403452464441 });
		mapCode2XY.put("IRIS_313-11549", new double[] { 0.0526973163524919, 0.0120738114760827 });
		mapCode2XY.put("IRIS_313-11551", new double[] { 0.0408641464297569, 0.00665673646948663 });
		mapCode2XY.put("IRIS_313-11554", new double[] { 0.0526162827576642, 0.0174379146902765 });
		mapCode2XY.put("IRIS_313-11555", new double[] { 0.0548289585792905, 0.00307799294090469 });
		mapCode2XY.put("IRIS_313-11556", new double[] { 0.0497403596265718, 0.0173521845658606 });
		mapCode2XY.put("IRIS_313-11557", new double[] { -0.00388749993678508, -0.134490365149852 });
		mapCode2XY.put("IRIS_313-11558", new double[] { 0.0479380752103596, 0.000857016150516943 });
		mapCode2XY.put("IRIS_313-11561", new double[] { 0.0498120353540539, -0.0156727575084828 });
		mapCode2XY.put("IRIS_313-11563", new double[] { 0.0488129464631489, -0.0143038323577245 });
		mapCode2XY.put("IRIS_313-11564", new double[] { -0.0779544699116221, -0.00886771702166782 });
		mapCode2XY.put("IRIS_313-11565", new double[] { 0.0477334047778152, -0.0206823329005083 });
		mapCode2XY.put("IRIS_313-11566", new double[] { 0.054044148450253, -0.0054743194636598 });
		mapCode2XY.put("IRIS_313-11567", new double[] { -0.0735550588678752, -0.025271192089302 });
		mapCode2XY.put("IRIS_313-11568", new double[] { 0.0521311999925431, 0.0129246473309818 });
		mapCode2XY.put("IRIS_313-11570", new double[] { 0.0321953838606857, 0.0161971866409188 });
		mapCode2XY.put("IRIS_313-11571", new double[] { -0.0901288628247206, 0.0171995206609748 });
		mapCode2XY.put("IRIS_313-11572", new double[] { 0.0495473882211563, 0.0117323906094854 });
		mapCode2XY.put("IRIS_313-11573", new double[] { 0.0495837617623084, 0.010362193192292 });
		mapCode2XY.put("IRIS_313-11574", new double[] { -0.0903089265920912, 0.0166258542437048 });
		mapCode2XY.put("IRIS_313-11575", new double[] { -0.0903715783455159, 0.013841553921505 });
		mapCode2XY.put("IRIS_313-11576", new double[] { 0.0450385217783337, 0.0128743503283013 });
		mapCode2XY.put("IRIS_313-11577", new double[] { 0.0477939204127945, 0.0126234117938704 });
		mapCode2XY.put("IRIS_313-11578", new double[] { -0.0901716447740289, 0.0160421961880336 });
		mapCode2XY.put("IRIS_313-11579", new double[] { 0.0464229918565586, 0.0143636077441992 });
		mapCode2XY.put("IRIS_313-11580", new double[] { 0.0428722406113243, 0.0143007975533842 });
		mapCode2XY.put("IRIS_313-11582", new double[] { -0.0897480629725287, 0.0165646745913724 });
		mapCode2XY.put("IRIS_313-11584", new double[] { -0.091881891375862, 0.016145435183872 });
		mapCode2XY.put("IRIS_313-11585", new double[] { 0.0496608729621533, 0.0142952611197591 });
		mapCode2XY.put("IRIS_313-11586", new double[] { -0.0940996861116644, 0.016843779196921 });
		mapCode2XY.put("IRIS_313-11588", new double[] { 0.0501685427966634, 0.0202693757674464 });
		mapCode2XY.put("IRIS_313-11591", new double[] { -0.0023249660550776, 0.0210873558179213 });
		mapCode2XY.put("IRIS_313-11594", new double[] { 0.0550306864092533, 0.0152830958539501 });
		mapCode2XY.put("IRIS_313-11595", new double[] { -0.0156274505140842, -0.127727798254292 });
		mapCode2XY.put("IRIS_313-11596", new double[] { 0.0289673537835098, -0.0469549836863309 });
		mapCode2XY.put("IRIS_313-11597", new double[] { 0.0486008414328871, -0.00949884093114279 });
		mapCode2XY.put("IRIS_313-11598", new double[] { 0.0141074737039211, -0.0717729510645865 });
		mapCode2XY.put("IRIS_313-11599", new double[] { 0.0510965386626137, 0.00371710700104403 });
		mapCode2XY.put("IRIS_313-11600", new double[] { 0.0513807202422993, -0.00133855262215263 });
		mapCode2XY.put("IRIS_313-11602", new double[] { -0.00484331948467591, -0.13253609562222 });
		mapCode2XY.put("IRIS_313-11603", new double[] { -0.0152579711914754, -0.137704370423038 });
		mapCode2XY.put("IRIS_313-11604", new double[] { -0.0073102991275015, -0.132368797089927 });
		mapCode2XY.put("IRIS_313-11606", new double[] { 0.0523870182530973, 0.000939176404655517 });
		mapCode2XY.put("IRIS_313-11607", new double[] { 0.0532660821854323, -0.00391765061068323 });
		mapCode2XY.put("IRIS_313-11608", new double[] { 0.0468093403005564, 0.0163216438043126 });
		mapCode2XY.put("IRIS_313-11609", new double[] { 0.0525260169226791, 0.0174331099256796 });
		mapCode2XY.put("IRIS_313-11610", new double[] { 0.0517161613438447, 0.018228975530041 });
		mapCode2XY.put("IRIS_313-11611", new double[] { -0.0813274224948431, 0.0117041506348355 });
		mapCode2XY.put("IRIS_313-11615", new double[] { 0.0556985451168753, 0.00991074445855889 });
		mapCode2XY.put("IRIS_313-11616", new double[] { 0.0238967544174351, -0.0562766044208451 });
		mapCode2XY.put("IRIS_313-11617", new double[] { -0.00345898195522724, -0.1038715000724 });
		mapCode2XY.put("IRIS_313-11618", new double[] { -0.0010015113289445, -0.120522187893112 });
		mapCode2XY.put("IRIS_313-11619", new double[] { -0.0076545972050635, -0.127748407823455 });
		mapCode2XY.put("IRIS_313-11620", new double[] { -0.0078378043659096, -0.115654195473647 });
		mapCode2XY.put("IRIS_313-11621", new double[] { 0.0546032129929476, 0.0173972200865553 });
		mapCode2XY.put("IRIS_313-11622", new double[] { 0.0524925288389076, 0.0127259622659541 });
		mapCode2XY.put("IRIS_313-11623", new double[] { -0.0875592905955709, 0.0122719452962745 });
		mapCode2XY.put("IRIS_313-11624", new double[] { 0.0532669800440816, 0.0150107936712 });
		mapCode2XY.put("IRIS_313-11625", new double[] { -0.0515175449159472, -0.0360086879099041 });
		mapCode2XY.put("IRIS_313-11626", new double[] { -0.0674581698827646, -0.0212157972936071 });
		mapCode2XY.put("IRIS_313-11627", new double[] { -0.0687635345245451, -0.0284289896165616 });
		mapCode2XY.put("IRIS_313-11628", new double[] { -0.0149746595122491, -0.0416419467016934 });
		mapCode2XY.put("IRIS_313-11629", new double[] { -0.00147289108902549, -0.125329134759471 });
		mapCode2XY.put("IRIS_313-11630", new double[] { -0.0659661961094178, -0.0286242830018744 });
		mapCode2XY.put("IRIS_313-11632", new double[] { -0.0629022730826993, -0.0323740633361671 });
		mapCode2XY.put("IRIS_313-11635", new double[] { 0.0555924510734733, 0.014384152687462 });
		mapCode2XY.put("IRIS_313-11636", new double[] { -0.00118338967443239, -0.141429007159956 });
		mapCode2XY.put("IRIS_313-11638", new double[] { 0.0548866635264719, -0.00751950788789521 });
		mapCode2XY.put("IRIS_313-11639", new double[] { 0.050237117353004, 0.00769330509784364 });
		mapCode2XY.put("IRIS_313-11640", new double[] { 0.0526791824123385, -0.00907076912824344 });
		mapCode2XY.put("IRIS_313-11641", new double[] { 0.0533983741153394, -0.00210446901353597 });
		mapCode2XY.put("IRIS_313-11642", new double[] { 0.0520565920059443, -0.000880716312954588 });
		mapCode2XY.put("IRIS_313-11643", new double[] { 0.045429928947762, -0.0253275284699988 });
		mapCode2XY.put("IRIS_313-11644", new double[] { 0.0424704477405922, -0.0162864957998546 });
		mapCode2XY.put("IRIS_313-11645", new double[] { 0.0506049316952295, -0.0143669216187042 });
		mapCode2XY.put("IRIS_313-11646", new double[] { 0.0563578580705247, 0.00164582916248439 });
		mapCode2XY.put("IRIS_313-11647", new double[] { 0.0477693439810394, -0.0156118233153364 });
		mapCode2XY.put("IRIS_313-11648", new double[] { 0.0540161277925921, -0.00224326929055512 });
		mapCode2XY.put("IRIS_313-11650", new double[] { 0.0326719008984406, -0.00698893971887775 });
		mapCode2XY.put("IRIS_313-11651", new double[] { -0.0927838810668172, 0.0166996845550235 });
		mapCode2XY.put("IRIS_313-11652", new double[] { -0.0897219767022114, 0.0163370924603925 });
		mapCode2XY.put("IRIS_313-11653", new double[] { -0.0942005084841169, 0.0177958443378496 });
		mapCode2XY.put("IRIS_313-11654", new double[] { -0.0940183386782444, 0.0157643903494688 });
		mapCode2XY.put("IRIS_313-11655", new double[] { -0.0914711318600604, 0.0173656061820086 });
		mapCode2XY.put("IRIS_313-11656", new double[] { 0.047960085267776, 0.0156676402584637 });
		mapCode2XY.put("IRIS_313-11657", new double[] { 0.0522758083870483, -0.0104838857306955 });
		mapCode2XY.put("IRIS_313-11658", new double[] { -0.0934361511624596, 0.0140765337786979 });
		mapCode2XY.put("IRIS_313-11659", new double[] { -0.0917717728413686, 0.0173731538620426 });
		mapCode2XY.put("IRIS_313-11660", new double[] { -0.0898544505428051, 0.0179920138334638 });
		mapCode2XY.put("IRIS_313-11661", new double[] { -0.0919513341526102, 0.0178143773467822 });
		mapCode2XY.put("IRIS_313-11663", new double[] { 0.0354009648346853, -0.0624574620442459 });
		mapCode2XY.put("IRIS_313-11664", new double[] { 0.0544570780351867, 0.0152332695920013 });
		mapCode2XY.put("IRIS_313-11665", new double[] { 0.0511850884337655, 0.0152423563986025 });
		mapCode2XY.put("IRIS_313-11666", new double[] { 0.0518796138046962, 0.00810941173032812 });
		mapCode2XY.put("IRIS_313-11667", new double[] { 0.053178213190147, 0.0132013177325383 });
		mapCode2XY.put("IRIS_313-11668", new double[] { 0.0475083266317666, 0.0112659758422666 });
		mapCode2XY.put("IRIS_313-11669", new double[] { 0.0391809981835402, 0.0156916364795124 });
		mapCode2XY.put("IRIS_313-11671", new double[] { 0.0522954848378178, -0.0199018576706384 });
		mapCode2XY.put("IRIS_313-11672", new double[] { -0.0933561645029746, 0.0165400679947229 });
		mapCode2XY.put("IRIS_313-11673", new double[] { -0.0863434297774164, 0.0157374158551466 });
		mapCode2XY.put("IRIS_313-11674", new double[] { 0.0548659044834401, 0.0142838078795064 });
		mapCode2XY.put("IRIS_313-11676", new double[] { 0.0541637758547213, 0.0169779192566424 });
		mapCode2XY.put("IRIS_313-11677", new double[] { 0.0491284183800398, 0.00924517557796486 });
		mapCode2XY.put("IRIS_313-11678", new double[] { 0.0514674937705189, 0.0177969690688007 });
		mapCode2XY.put("IRIS_313-11679", new double[] { 0.0565757324132883, 0.0201977970066908 });
		mapCode2XY.put("IRIS_313-11680", new double[] { 0.0558553593020383, 0.0171188092624874 });
		mapCode2XY.put("IRIS_313-11681", new double[] { 0.0471964407890032, 0.00370759955508354 });
		mapCode2XY.put("IRIS_313-11682", new double[] { 0.0513612402473355, 0.0184286309956109 });
		mapCode2XY.put("IRIS_313-11683", new double[] { 0.0556081284745371, 0.0171698588723751 });
		mapCode2XY.put("IRIS_313-11684", new double[] { 0.0575385019214337, 0.01681934597594 });
		mapCode2XY.put("IRIS_313-11685", new double[] { 0.0534369493488415, 0.0192218761739572 });
		mapCode2XY.put("IRIS_313-11686", new double[] { 0.0529823602617663, 0.018504463771521 });
		mapCode2XY.put("IRIS_313-11687", new double[] { 0.0572453987765797, 0.0170696787378465 });
		mapCode2XY.put("IRIS_313-11688", new double[] { 0.0580251250565855, 0.0160588976181683 });
		mapCode2XY.put("IRIS_313-11689", new double[] { -0.0930242444376784, 0.0166458134401071 });
		mapCode2XY.put("IRIS_313-11690", new double[] { -0.0255650294419755, 0.0103304860560921 });
		mapCode2XY.put("IRIS_313-11691", new double[] { -0.0860706577079999, 0.00836909071245089 });
		mapCode2XY.put("IRIS_313-11692", new double[] { 0.0520680891942804, 0.0146796852375475 });
		mapCode2XY.put("IRIS_313-11693", new double[] { 0.0481276822500296, 0.0102155141059667 });
		mapCode2XY.put("IRIS_313-11694", new double[] { 0.0447141643722696, 0.0124102465755263 });
		mapCode2XY.put("IRIS_313-11695", new double[] { 0.048306436192292, 0.0165129654159787 });
		mapCode2XY.put("IRIS_313-11698", new double[] { -0.0724827626922949, -0.0203327522043383 });
		mapCode2XY.put("IRIS_313-11700", new double[] { 0.0530491315360239, 0.0161470434913283 });
		mapCode2XY.put("IRIS_313-11702", new double[] { -0.0928985281146134, 0.0183029680182503 });
		mapCode2XY.put("IRIS_313-11704", new double[] { 0.0473886027447228, 0.00556787709105443 });
		mapCode2XY.put("IRIS_313-11705", new double[] { 0.0511308585735602, 0.0174230958852249 });
		mapCode2XY.put("IRIS_313-11706", new double[] { 0.0487835091549163, 0.018225574315884 });
		mapCode2XY.put("IRIS_313-11707", new double[] { 0.0553990234782114, 0.0148382049454004 });
		mapCode2XY.put("IRIS_313-11708", new double[] { 0.0547862004846234, 0.0170353686786105 });
		mapCode2XY.put("IRIS_313-11709", new double[] { 0.0535003564872023, 0.0186085415412337 });
		mapCode2XY.put("IRIS_313-11710", new double[] { 0.056006001024482, 0.0179125092287744 });
		mapCode2XY.put("IRIS_313-11711", new double[] { 0.053316653536994, 0.0177427715048409 });
		mapCode2XY.put("IRIS_313-11712", new double[] { 0.00159549820938822, -0.137521179341844 });
		mapCode2XY.put("IRIS_313-11713", new double[] { 0.0497242821012477, 0.0137444465212369 });
		mapCode2XY.put("IRIS_313-11714", new double[] { 0.00693249150202219, 0.0168984553195888 });
		mapCode2XY.put("IRIS_313-11716", new double[] { 0.0462433399339598, 0.00843116156024563 });
		mapCode2XY.put("IRIS_313-11717", new double[] { 0.0578003076117238, 0.0167950244077002 });
		mapCode2XY.put("IRIS_313-11719", new double[] { 0.0547684173777209, 0.0151225816485266 });
		mapCode2XY.put("IRIS_313-11720", new double[] { 0.0556379377109815, 0.0180568457413343 });
		mapCode2XY.put("IRIS_313-11721", new double[] { 0.0520885138313765, 0.0159882448682722 });
		mapCode2XY.put("IRIS_313-11722", new double[] { 0.054476882039114, 0.0154606128749782 });
		mapCode2XY.put("IRIS_313-11723", new double[] { 0.0516212648508953, 0.000165216715444987 });
		mapCode2XY.put("IRIS_313-11724", new double[] { 0.0544954302496965, 0.0113527735830448 });
		mapCode2XY.put("IRIS_313-11725", new double[] { -0.0929410225310164, 0.0160121093265043 });
		mapCode2XY.put("IRIS_313-11726", new double[] { 0.0474814450227188, 0.0151186445442062 });
		mapCode2XY.put("IRIS_313-11727", new double[] { 0.0522495399972467, 0.015764038547739 });
		mapCode2XY.put("IRIS_313-11728", new double[] { 0.0574215507524406, 0.0157058134633385 });
		mapCode2XY.put("IRIS_313-11729", new double[] { 0.0495146937652727, 0.0141996276194292 });
		mapCode2XY.put("IRIS_313-11730", new double[] { 0.050676869678864, 0.0178205579208854 });
		mapCode2XY.put("IRIS_313-11731", new double[] { 0.0504746178310407, 0.017569730166112 });
		mapCode2XY.put("IRIS_313-11732", new double[] { 0.0505137685419466, 0.0160398716009821 });
		mapCode2XY.put("IRIS_313-11733", new double[] { 0.0465504210528548, 0.0179975321753161 });
		mapCode2XY.put("IRIS_313-11734", new double[] { 0.0520554004336479, 0.011634397122841 });
		mapCode2XY.put("IRIS_313-11735", new double[] { 0.0460259122734508, 0.00995742766727517 });
		mapCode2XY.put("IRIS_313-11736", new double[] { -0.0890443080810259, 0.0138067304710828 });
		mapCode2XY.put("IRIS_313-11737", new double[] { -0.00248942270410551, -0.10917679881604 });
		mapCode2XY.put("IRIS_313-11738", new double[] { 0.0513717419443407, -0.00929943315321532 });
		mapCode2XY.put("IRIS_313-11739", new double[] { -0.0889160205157544, 0.0158935482979967 });
		mapCode2XY.put("IRIS_313-11740", new double[] { 0.0522492841698351, 0.0104743866630555 });
		mapCode2XY.put("IRIS_313-11741", new double[] { 0.0515975416911982, -0.0156541794295346 });
		mapCode2XY.put("IRIS_313-11742", new double[] { -0.0075042661391599, -0.140133638148246 });
		mapCode2XY.put("IRIS_313-11743", new double[] { -0.0662504576004118, -0.0204327719563883 });
		mapCode2XY.put("IRIS_313-11744", new double[] { 0.0467054336105601, 0.0168004309440944 });
		mapCode2XY.put("IRIS_313-11745", new double[] { 0.0522155258272238, 0.0107494462931279 });
		mapCode2XY.put("IRIS_313-11746", new double[] { 0.0513809312900363, 0.0161193129698959 });
		mapCode2XY.put("IRIS_313-11747", new double[] { 0.0542774388201944, 0.0127854142982506 });
		mapCode2XY.put("IRIS_313-11748", new double[] { 0.047927908364724, 0.0142219647130916 });
		mapCode2XY.put("IRIS_313-11750", new double[] { 0.0545889502470713, 0.0141718281299815 });
		mapCode2XY.put("IRIS_313-11751", new double[] { 0.0449210897095381, 0.00745522457080126 });
		mapCode2XY.put("IRIS_313-11752", new double[] { 0.0510353515067193, 0.014568033420127 });
		mapCode2XY.put("IRIS_313-11753", new double[] { 0.0479819832041645, 0.00969470500106244 });
		mapCode2XY.put("IRIS_313-11754", new double[] { -0.0313402250331917, -0.0110885060943742 });
		mapCode2XY.put("IRIS_313-11755", new double[] { -0.0934694066593662, 0.0141018462351626 });
		mapCode2XY.put("IRIS_313-11756", new double[] { -0.0905839832375546, 0.0143832402410665 });
		mapCode2XY.put("IRIS_313-11757", new double[] { 0.0525843998397407, 0.0184165412014316 });
		mapCode2XY.put("IRIS_313-11758", new double[] { 0.0573397923948338, 0.00154437023112289 });
		mapCode2XY.put("IRIS_313-11759", new double[] { -0.0892922883749163, 0.0142825534383477 });
		mapCode2XY.put("IRIS_313-11760", new double[] { 0.0527788895381225, -0.00754832306893735 });
		mapCode2XY.put("IRIS_313-11761", new double[] { 0.0533910046244948, -0.0178071256925175 });
		mapCode2XY.put("IRIS_313-11762", new double[] { 0.0510722480081459, -0.00127824159452353 });
		mapCode2XY.put("IRIS_313-11763", new double[] { 0.0513956095023439, 0.0160115188720435 });
		mapCode2XY.put("IRIS_313-11764", new double[] { 0.0551611556462673, 0.0131711262532836 });
		mapCode2XY.put("IRIS_313-11765", new double[] { -0.0713693238868053, -0.0301683895111708 });
		mapCode2XY.put("IRIS_313-11766", new double[] { 0.0154214617409568, -0.074295831917903 });
		mapCode2XY.put("IRIS_313-11767", new double[] { 0.00346666518937943, -0.001197454888881 });
		mapCode2XY.put("IRIS_313-11772", new double[] { 0.0273503082969351, -0.0415260460869263 });
		mapCode2XY.put("IRIS_313-11773", new double[] { 0.0540506908223212, 0.00744070053631843 });
		mapCode2XY.put("IRIS_313-11779", new double[] { 0.0507058604220443, 0.0203660470536356 });
		mapCode2XY.put("IRIS_313-11780", new double[] { 0.0511882395216419, 0.0168913041552725 });
		mapCode2XY.put("IRIS_313-11782", new double[] { 0.0429429649981245, -0.0272629635061924 });
		mapCode2XY.put("IRIS_313-11783", new double[] { 0.0563054909581762, 0.00753856931706057 });
		mapCode2XY.put("IRIS_313-11784", new double[] { 0.0431427246493257, 0.0203318996029007 });
		mapCode2XY.put("IRIS_313-11785", new double[] { 0.04965418624969, 0.0170666952088159 });
		mapCode2XY.put("IRIS_313-11786", new double[] { 0.0578770409057306, 0.0198605795291613 });
		mapCode2XY.put("IRIS_313-11787", new double[] { 0.0523586199431088, -0.000773917922846894 });
		mapCode2XY.put("IRIS_313-11788", new double[] { -0.0864862598886102, 0.0144022432029814 });
		mapCode2XY.put("IRIS_313-11789", new double[] { 0.0501981154458033, -0.0190380829668851 });
		mapCode2XY.put("IRIS_313-11790", new double[] { -0.0836996521671799, 0.0127910775041387 });
		mapCode2XY.put("IRIS_313-11791", new double[] { 0.0220353643935844, -0.0340114529445274 });
		mapCode2XY.put("IRIS_313-11792", new double[] { -0.0923779134704417, 0.0180494869097156 });
		mapCode2XY.put("IRIS_313-11793", new double[] { 0.0461489803321469, -0.0268613511658723 });
		mapCode2XY.put("IRIS_313-11794", new double[] { 0.0513402093685433, -0.0159269685734966 });
		mapCode2XY.put("IRIS_313-11795", new double[] { 0.0498056110292465, 0.0165271252387597 });
		mapCode2XY.put("IRIS_313-11796", new double[] { 0.0516018076356898, 0.0100481553969336 });
		mapCode2XY.put("IRIS_313-11797", new double[] { 0.0454774718913767, 0.0110453042684592 });
		mapCode2XY.put("IRIS_313-11798", new double[] { 0.0493043672738999, 0.016887333794498 });
		mapCode2XY.put("IRIS_313-11799", new double[] { 0.0499600091878355, 0.0157772575909424 });
		mapCode2XY.put("IRIS_313-11800", new double[] { -0.0934708551036421, 0.015809150505104 });
		mapCode2XY.put("IRIS_313-11801", new double[] { 0.0542752591468646, 0.0106603554583986 });
		mapCode2XY.put("IRIS_313-11802", new double[] { 0.0492294420380374, 0.0103791652572253 });
		mapCode2XY.put("IRIS_313-11803", new double[] { -0.0911516994468128, 0.0152733811328745 });
		mapCode2XY.put("IRIS_313-11804", new double[] { 0.0513100688646665, 0.0142097500366689 });
		mapCode2XY.put("IRIS_313-11805", new double[] { 0.0507781610221576, 0.0131875315472413 });
		mapCode2XY.put("IRIS_313-11806", new double[] { 0.0464865219219566, 0.0152502444478208 });
		mapCode2XY.put("IRIS_313-11807", new double[] { 0.0376567908169694, 0.0185816919015469 });
		mapCode2XY.put("IRIS_313-11808", new double[] { 0.0320518907029754, 0.020998282265572 });
		mapCode2XY.put("IRIS_313-11809", new double[] { -0.0064026510558651, -0.136598551384306 });
		mapCode2XY.put("IRIS_313-11810", new double[] { 0.053876073772969, 0.0157511810946946 });
		mapCode2XY.put("IRIS_313-11811", new double[] { 0.0492212682514713, -0.0109290546742821 });
		mapCode2XY.put("IRIS_313-11812", new double[] { 0.0553568312355693, 0.0201562685387574 });
		mapCode2XY.put("IRIS_313-11813", new double[] { 0.0527113010136098, 0.0096181184453828 });
		mapCode2XY.put("IRIS_313-11814", new double[] { 0.0511973597635579, 0.0181404605778219 });
		mapCode2XY.put("IRIS_313-11815", new double[] { 0.0522117432940728, 0.0186423514891102 });
		mapCode2XY.put("IRIS_313-11816", new double[] { 0.0459854072243493, 0.00595836053704367 });
		mapCode2XY.put("IRIS_313-11817", new double[] { 0.0443314050252687, 0.00943101800938803 });
		mapCode2XY.put("IRIS_313-11818", new double[] { 0.0470270479430464, 0.00314976887623782 });
		mapCode2XY.put("IRIS_313-11819", new double[] { 0.0550618758726172, 0.0164423884603062 });
		mapCode2XY.put("IRIS_313-11820", new double[] { 0.0493720651384814, 0.0168856076274965 });
		mapCode2XY.put("IRIS_313-11821", new double[] { 0.0514162573269713, -0.0063270544105219 });
		mapCode2XY.put("IRIS_313-11822", new double[] { 0.0518595759727142, 0.000663248650465416 });
		mapCode2XY.put("IRIS_313-11823", new double[] { 0.0490869205843979, -0.00704274506277272 });
		mapCode2XY.put("IRIS_313-11824", new double[] { 0.0546609194002758, 0.000860614203997299 });
		mapCode2XY.put("IRIS_313-11825", new double[] { -0.0709135534009921, -0.0275826840717878 });
		mapCode2XY.put("IRIS_313-11826", new double[] { -0.0731739229796963, -0.0203145826263486 });
		mapCode2XY.put("IRIS_313-11827", new double[] { 0.0519026505624058, -0.00680810270767447 });
		mapCode2XY.put("IRIS_313-11828", new double[] { 0.0532279539545273, -0.00617427479511202 });
		mapCode2XY.put("IRIS_313-11829", new double[] { -0.0926416662895589, 0.0159911412715213 });
		mapCode2XY.put("IRIS_313-11830", new double[] { 0.0531825081777852, 0.0186435657350216 });
		mapCode2XY.put("IRIS_313-11831", new double[] { -0.0907368117329168, 0.0132806022475665 });
		mapCode2XY.put("IRIS_313-11832", new double[] { -0.0881573877390235, 0.0129222989598297 });
		mapCode2XY.put("IRIS_313-11833", new double[] { 0.0526689763932817, 0.0211548812042503 });
		mapCode2XY.put("IRIS_313-11834", new double[] { -0.0858256555772477, 0.0131350661026364 });
		mapCode2XY.put("IRIS_313-11835", new double[] { 0.0401255903282817, 0.0123045563555876 });
		mapCode2XY.put("IRIS_313-11836", new double[] { 0.0574635623627689, 0.0178686367339243 });
		mapCode2XY.put("IRIS_313-11837", new double[] { 0.0507555374440986, 0.0168987078719704 });
		mapCode2XY.put("IRIS_313-11838", new double[] { 0.0521793075627331, 0.0155401210628791 });
		mapCode2XY.put("IRIS_313-11839", new double[] { 0.0511642424790003, 0.0179667090200977 });
		mapCode2XY.put("IRIS_313-11840", new double[] { 0.0514780292191535, 0.0164059750391707 });
		mapCode2XY.put("IRIS_313-11841", new double[] { 0.0551196607251536, 0.0180083924776136 });
		mapCode2XY.put("IRIS_313-11842", new double[] { 0.0527859590562615, 0.0175459711965394 });
		mapCode2XY.put("IRIS_313-11843", new double[] { 0.0572233642251905, 0.0178631751537097 });
		mapCode2XY.put("IRIS_313-11844", new double[] { 0.0503720443049708, 0.0200301424346237 });
		mapCode2XY.put("IRIS_313-11845", new double[] { -0.0882202435678003, 0.0138019849544609 });
		mapCode2XY.put("IRIS_313-11846", new double[] { -0.0841846421951758, 0.0129732072400271 });
		mapCode2XY.put("IRIS_313-11848", new double[] { 0.0440204226828138, 0.0106476792930066 });
		mapCode2XY.put("IRIS_313-11849", new double[] { 0.0461620583779613, 0.015935590903751 });
		mapCode2XY.put("IRIS_313-11850", new double[] { 0.0529664777331298, 0.0185959003225087 });
		mapCode2XY.put("IRIS_313-11851", new double[] { -0.0892781612668847, 0.0142894159187446 });
		mapCode2XY.put("IRIS_313-11852", new double[] { 0.0484593236893217, 0.0099127093369334 });
		mapCode2XY.put("IRIS_313-11853", new double[] { 0.0498186289736355, 0.010469003733177 });
		mapCode2XY.put("IRIS_313-11854", new double[] { 0.0533651334544995, 0.0117603248950726 });
		mapCode2XY.put("IRIS_313-11855", new double[] { 0.0480704738140164, 0.0131030619596073 });
		mapCode2XY.put("IRIS_313-11856", new double[] { 0.0498493091529642, 0.00908862564744549 });
		mapCode2XY.put("IRIS_313-11857", new double[] { 0.0491835296474091, 0.0113113629766219 });
		mapCode2XY.put("IRIS_313-11858", new double[] { 0.0507870265555859, 0.0166301965772541 });
		mapCode2XY.put("IRIS_313-11859", new double[] { 0.0489479666040379, 0.0101327640617128 });
		mapCode2XY.put("IRIS_313-11860", new double[] { 0.0515017659609512, 0.0144481016040779 });
		mapCode2XY.put("IRIS_313-11861", new double[] { 0.0407601047964623, 0.00791695716281692 });
		mapCode2XY.put("IRIS_313-11862", new double[] { 0.046288223119464, 0.013533455025228 });
		mapCode2XY.put("IRIS_313-11863", new double[] { 0.0458047298634862, 0.0120369052712467 });
		mapCode2XY.put("IRIS_313-11865", new double[] { 0.0482611732984059, 0.0132645643895203 });
		mapCode2XY.put("IRIS_313-11866", new double[] { 0.0508466250766446, 0.0156215067047977 });
		mapCode2XY.put("IRIS_313-11867", new double[] { 0.0540343828419281, 0.0113561791620318 });
		mapCode2XY.put("IRIS_313-11868", new double[] { 0.0490031056589314, 0.0126864598966066 });
		mapCode2XY.put("IRIS_313-11869", new double[] { 0.0498524931711347, 0.0157499295127956 });
		mapCode2XY.put("IRIS_313-11870", new double[] { 0.0515001214914521, 0.0123695584293855 });
		mapCode2XY.put("IRIS_313-11871", new double[] { 0.0480967266964642, 0.0136009976416204 });
		mapCode2XY.put("IRIS_313-11872", new double[] { 0.0373287667180006, 0.00855135226614763 });
		mapCode2XY.put("IRIS_313-11875", new double[] { -0.0940109645509936, 0.0181523340181429 });
		mapCode2XY.put("IRIS_313-11876", new double[] { 0.0245746743805843, 0.0110795099170512 });
		mapCode2XY.put("IRIS_313-11877", new double[] { 0.0520848629083885, 0.0123307517484293 });
		mapCode2XY.put("IRIS_313-11878", new double[] { 0.0492700046328904, 0.00847164061928818 });
		mapCode2XY.put("IRIS_313-11881", new double[] { 0.0451963937703334, 0.0125412903033422 });
		mapCode2XY.put("IRIS_313-11882", new double[] { 0.0483618017237668, 0.0136901674863182 });
		mapCode2XY.put("IRIS_313-11884", new double[] { 0.0505598312590254, 0.0125170879510608 });
		mapCode2XY.put("IRIS_313-11885", new double[] { 0.0495096224174084, 0.0105229535938971 });
		mapCode2XY.put("IRIS_313-11886", new double[] { 0.0459189455063021, 0.0110080549638234 });
		mapCode2XY.put("IRIS_313-11887", new double[] { 0.0518035505515173, 0.0162937771992439 });
		mapCode2XY.put("IRIS_313-11888", new double[] { -0.00538728458460752, -0.135297386919362 });
		mapCode2XY.put("IRIS_313-11889", new double[] { 0.040939833097958, -0.00880021987855721 });
		mapCode2XY.put("IRIS_313-11890", new double[] { -0.0885387265221421, 0.0171833750724379 });
		mapCode2XY.put("IRIS_313-11892", new double[] { -0.0878456922407805, 0.0126964614330287 });
		mapCode2XY.put("IRIS_313-11893", new double[] { 0.0431079763799001, 0.0102648262871611 });
		mapCode2XY.put("IRIS_313-11894", new double[] { 0.045183972365138, 0.0126578344948311 });
		mapCode2XY.put("IRIS_313-11895", new double[] { 0.0523510479981417, 0.0173589840789912 });
		mapCode2XY.put("IRIS_313-11896", new double[] { 0.0551059914914012, 0.0183398292810578 });
		mapCode2XY.put("IRIS_313-11897", new double[] { -0.0886889089341068, 0.0131511289347102 });
		mapCode2XY.put("IRIS_313-11898", new double[] { 0.0488597286073156, 0.0130914127850071 });
		mapCode2XY.put("IRIS_313-11899", new double[] { 0.0462827351698067, 0.0084389821236076 });
		mapCode2XY.put("IRIS_313-11900", new double[] { -0.0905318241550348, 0.015189063896556 });
		mapCode2XY.put("IRIS_313-11901", new double[] { 0.0523995614973928, 0.0213980222398315 });
		mapCode2XY.put("IRIS_313-11902", new double[] { 0.0519198766858808, 0.0201983094326742 });
		mapCode2XY.put("IRIS_313-11903", new double[] { -0.0865971767609655, 0.0154985822808307 });
		mapCode2XY.put("IRIS_313-11904", new double[] { 0.0481029923847688, 0.0175863687196868 });
		mapCode2XY.put("IRIS_313-11905", new double[] { 0.0511115993877296, 0.0195617318476275 });
		mapCode2XY.put("IRIS_313-11906", new double[] { -0.0827519951949352, 0.0139821453103712 });
		mapCode2XY.put("IRIS_313-11907", new double[] { -0.0847078572460324, 0.0142937703489092 });
		mapCode2XY.put("IRIS_313-11908", new double[] { -0.0894714773476809, 0.0139661442487423 });
		mapCode2XY.put("IRIS_313-11909", new double[] { 0.0492017388676909, 0.0121801093449245 });
		mapCode2XY.put("IRIS_313-11910", new double[] { 0.0490966871672263, 0.00896374707144054 });
		mapCode2XY.put("IRIS_313-11911", new double[] { 0.0473461144802545, 0.0107068676441946 });
		mapCode2XY.put("IRIS_313-11912", new double[] { 0.0528171986175585, 0.0139656175071287 });
		mapCode2XY.put("IRIS_313-11913", new double[] { -0.0855425582802097, 0.0133597597244622 });
		mapCode2XY.put("IRIS_313-11914", new double[] { 0.0394317690311583, -0.0380058844203296 });
		mapCode2XY.put("IRIS_313-11915", new double[] { -0.0914640825572279, 0.0156952468387566 });
		mapCode2XY.put("IRIS_313-11916", new double[] { 0.0434372117802118, -0.0132657634443415 });
		mapCode2XY.put("IRIS_313-11917", new double[] { -0.00831896051321204, -0.131488732951704 });
		mapCode2XY.put("IRIS_313-11918", new double[] { 0.0386413142605564, -0.0076053710084031 });
		mapCode2XY.put("IRIS_313-11919", new double[] { 0.0517102214219767, -0.00493849720118231 });
		mapCode2XY.put("IRIS_313-11920", new double[] { 0.0567393580454953, 0.00890505044246854 });
		mapCode2XY.put("IRIS_313-11921", new double[] { 0.053869906189542, 0.0184053483967867 });
		mapCode2XY.put("IRIS_313-11922", new double[] { -0.0891002094821794, 0.0134151919822454 });
		mapCode2XY.put("IRIS_313-11923", new double[] { -0.0877047350432946, 0.0135226901224422 });
		mapCode2XY.put("IRIS_313-11924", new double[] { -0.0902205006473673, 0.0136847637447527 });
		mapCode2XY.put("IRIS_313-11925", new double[] { 0.0519440584171976, 0.0136334883150059 });
		mapCode2XY.put("IRIS_313-11926", new double[] { -0.0893371354449155, 0.0138220395137278 });
		mapCode2XY.put("IRIS_313-11927", new double[] { 0.0510995971614014, 0.0197599171724751 });
		mapCode2XY.put("IRIS_313-11928", new double[] { -0.0879697984315226, 0.0152748074667023 });
		mapCode2XY.put("IRIS_313-11929", new double[] { -0.0852371886528857, 0.0175193684656429 });
		mapCode2XY.put("IRIS_313-11930", new double[] { 0.0128748900345399, 0.0037127780817468 });
		mapCode2XY.put("IRIS_313-11931", new double[] { -0.0928824201552022, 0.015495131708173 });
		mapCode2XY.put("IRIS_313-11932", new double[] { 0.0415996823092628, -0.0268984155231709 });
		mapCode2XY.put("IRIS_313-11934", new double[] { 0.0388104531251288, 0.0093222427884774 });
		mapCode2XY.put("IRIS_313-11935", new double[] { 0.0548974687403029, 0.0187810795077767 });
		mapCode2XY.put("IRIS_313-11936", new double[] { 0.0536883851422028, 0.0180843539611983 });
		mapCode2XY.put("IRIS_313-11937", new double[] { 0.050810956785021, 0.0131650737725523 });
		mapCode2XY.put("IRIS_313-11938", new double[] { 0.053011454298029, 0.00527211902685001 });
		mapCode2XY.put("IRIS_313-11939", new double[] { 0.0553120067332019, 0.0172414456634191 });
		mapCode2XY.put("IRIS_313-11940", new double[] { 0.0523745252590945, 0.00759337035445254 });
		mapCode2XY.put("IRIS_313-11941", new double[] { 0.0540240907290308, 0.0157896010559901 });
		mapCode2XY.put("IRIS_313-11943", new double[] { 0.047730622066619, 0.00969642741727792 });
		mapCode2XY.put("IRIS_313-11944", new double[] { 0.0520125673410303, 0.0149548023886679 });
		mapCode2XY.put("IRIS_313-11945", new double[] { 0.0491856980034532, -0.00306159015875797 });
		mapCode2XY.put("IRIS_313-11946", new double[] { -0.0892954220180726, 0.0149662742533728 });
		mapCode2XY.put("IRIS_313-11947", new double[] { 0.051794630721186, 0.0141715622372072 });
		mapCode2XY.put("IRIS_313-11948", new double[] { 0.0457993014284291, 0.0111081399145679 });
		mapCode2XY.put("IRIS_313-11949", new double[] { 0.0518783585326841, 0.0100611119800976 });
		mapCode2XY.put("IRIS_313-11950", new double[] { 0.0510733439450303, 0.0125898652405008 });
		mapCode2XY.put("IRIS_313-11951", new double[] { 0.0506233516665854, 0.0153243356004522 });
		mapCode2XY.put("IRIS_313-11952", new double[] { 0.0499743009921247, 0.0119852583039276 });
		mapCode2XY.put("IRIS_313-11953", new double[] { 0.0467663036831742, 0.0142385218793058 });
		mapCode2XY.put("IRIS_313-11954", new double[] { 0.0509354844566335, 0.0133498791118335 });
		mapCode2XY.put("IRIS_313-11955", new double[] { 0.0500225141308959, 0.0134081975055409 });
		mapCode2XY.put("IRIS_313-11956", new double[] { -0.0358935973865394, -0.0106439381192378 });
		mapCode2XY.put("IRIS_313-11957", new double[] { 0.0479636634077065, 0.00527051509370623 });
		mapCode2XY.put("IRIS_313-11958", new double[] { 0.05097761307028, 0.00664212755991753 });
		mapCode2XY.put("IRIS_313-11959", new double[] { 0.046266495173697, 0.016558562581086 });
		mapCode2XY.put("IRIS_313-11960", new double[] { 0.0470401407746275, 0.0117214825695318 });
		mapCode2XY.put("IRIS_313-11961", new double[] { 0.0508478694458702, 0.0195631185376433 });
		mapCode2XY.put("IRIS_313-11962", new double[] { 0.0544806932516313, 0.01813112527216 });
		mapCode2XY.put("IRIS_313-11963", new double[] { -0.00422110436746861, -0.146716859753706 });
		mapCode2XY.put("IRIS_313-11964", new double[] { 0.0552726966079419, -0.000414543637321472 });
		mapCode2XY.put("IRIS_313-11965", new double[] { 0.0517420569465083, 0.0161981714952311 });
		mapCode2XY.put("IRIS_313-11966", new double[] { 0.0495112274253099, 0.0134378464785882 });
		mapCode2XY.put("IRIS_313-11967", new double[] { 0.0439462769290316, 0.0158397159208543 });
		mapCode2XY.put("IRIS_313-11968", new double[] { 0.0508364994260422, 0.0177746638639691 });
		mapCode2XY.put("IRIS_313-11969", new double[] { 0.0531996441763695, -0.0131802688583653 });
		mapCode2XY.put("IRIS_313-11970", new double[] { -0.0883446147221667, 0.0149017140174196 });
		mapCode2XY.put("IRIS_313-11971", new double[] { -0.0844372916120014, 0.0129788578298765 });
		mapCode2XY.put("IRIS_313-11973", new double[] { -0.0927949906466025, 0.0139688674763054 });
		mapCode2XY.put("IRIS_313-11974", new double[] { 0.0516775552098136, 0.0204110908239401 });
		mapCode2XY.put("IRIS_313-11975", new double[] { 0.0481612033282066, 0.00536161030083706 });
		mapCode2XY.put("IRIS_313-11976", new double[] { 0.0494665753757316, 0.0196327918618218 });
		mapCode2XY.put("IRIS_313-11977", new double[] { 0.0528676888320126, 0.00703252060932995 });
		mapCode2XY.put("IRIS_313-11978", new double[] { 0.0498910676458966, 0.0170947569432128 });
		mapCode2XY.put("IRIS_313-11979", new double[] { 0.0473219195507084, 0.0131434913481369 });
		mapCode2XY.put("IRIS_313-11980", new double[] { 0.0494617849983171, 0.0161874765922722 });
		mapCode2XY.put("IRIS_313-11981", new double[] { -0.0933198611086843, 0.0166566820335985 });
		mapCode2XY.put("IRIS_313-11982", new double[] { -0.00662521651153041, -0.132943573160525 });
		mapCode2XY.put("IRIS_313-11983", new double[] { 0.0534074424396399, 0.00262535811682709 });
		mapCode2XY.put("IRIS_313-11984", new double[] { -0.0897133765394309, 0.014220106598604 });
		mapCode2XY.put("IRIS_313-11985", new double[] { 0.0490211828054306, 0.014570824340831 });
		mapCode2XY.put("IRIS_313-11986", new double[] { 0.0497763570191044, 0.0157046566769968 });
		mapCode2XY.put("IRIS_313-11987", new double[] { 0.0478326096301129, 0.0200723020117406 });
		mapCode2XY.put("IRIS_313-11988", new double[] { 0.0535624185121244, 0.00504697864293814 });
		mapCode2XY.put("IRIS_313-11989", new double[] { 0.0513630507273896, 0.0160779701837056 });
		mapCode2XY.put("IRIS_313-11990", new double[] { 0.0474000758935195, 0.0141229798317054 });
		mapCode2XY.put("IRIS_313-11991", new double[] { 0.0531570982709307, 0.0188232497355298 });
		mapCode2XY.put("IRIS_313-11992", new double[] { 0.0513873114562167, 0.0191383726993924 });
		mapCode2XY.put("IRIS_313-11993", new double[] { 0.0477414152166431, 0.00709156252631298 });
		mapCode2XY.put("IRIS_313-11994", new double[] { -0.0853154089126066, 0.0147953971667845 });
		mapCode2XY.put("IRIS_313-11995", new double[] { -0.0865488900698977, 0.0159376676313508 });
		mapCode2XY.put("IRIS_313-11996", new double[] { 0.0478548135580996, 0.0129872985021943 });
		mapCode2XY.put("IRIS_313-11997", new double[] { 0.0546699858827705, 0.0158068645620311 });
		mapCode2XY.put("IRIS_313-11998", new double[] { 0.0516526317231532, 0.0194634117735194 });
		mapCode2XY.put("IRIS_313-11999", new double[] { 0.0560084577037497, 0.0172683250988232 });
		mapCode2XY.put("IRIS_313-12000", new double[] { 0.0569709333554911, 0.0195181410623062 });
		mapCode2XY.put("IRIS_313-12002", new double[] { -0.0185863434527868, -0.137845154598277 });
		mapCode2XY.put("IRIS_313-12003", new double[] { -0.0936298362439583, 0.015830454154596 });
		mapCode2XY.put("IRIS_313-12004", new double[] { -0.0507471286577011, -0.0113543709198473 });
		mapCode2XY.put("IRIS_313-12005", new double[] { 0.0514926092267945, 0.0190341868234651 });
		mapCode2XY.put("IRIS_313-12006", new double[] { -0.0855273543599745, 0.0145198342144478 });
		mapCode2XY.put("IRIS_313-12007", new double[] { 0.0488924424352432, 0.0172815014137887 });
		mapCode2XY.put("IRIS_313-12009", new double[] { 0.046455006536791, 0.0101914263147858 });
		mapCode2XY.put("IRIS_313-12010", new double[] { 0.0488590550531652, 0.0124223123543423 });
		mapCode2XY.put("IRIS_313-12011", new double[] { 0.0435383412972247, 0.0146320511324724 });
		mapCode2XY.put("IRIS_313-12012", new double[] { 0.0496417993543803, 0.0126647741315234 });
		mapCode2XY.put("IRIS_313-12013", new double[] { 0.0472288930093206, -0.0142031414830515 });
		mapCode2XY.put("IRIS_313-12014", new double[] { 0.0547539899741825, 0.000699016022922923 });
		mapCode2XY.put("IRIS_313-12015", new double[] { 0.0535460149336502, -0.0115677617089058 });
		mapCode2XY.put("IRIS_313-12016", new double[] { 0.0360924372683187, 0.00728024794988051 });
		mapCode2XY.put("IRIS_313-12017", new double[] { 0.0499557617549583, 0.0105210052578147 });
		mapCode2XY.put("IRIS_313-12018", new double[] { -0.0905627819026247, 0.0146567210214268 });
		mapCode2XY.put("IRIS_313-12021", new double[] { -0.092448110680592, 0.0168918629246393 });
		mapCode2XY.put("IRIS_313-12024", new double[] { 0.0569332782376301, 0.0159899032558552 });
		mapCode2XY.put("IRIS_313-12027", new double[] { 0.0413514473722437, 0.0180787455976305 });
		mapCode2XY.put("IRIS_313-12028", new double[] { 0.0528715686177347, 0.0109828991311505 });
		mapCode2XY.put("IRIS_313-12029", new double[] { -0.0899275409737788, 0.0128008522717591 });
		mapCode2XY.put("IRIS_313-12030", new double[] { -0.0448321850690001, 0.0125916006764738 });
		mapCode2XY.put("IRIS_313-12031", new double[] { -0.089388952925306, 0.0142879109678773 });
		mapCode2XY.put("IRIS_313-12033", new double[] { 0.0434693824823468, 0.0135060256798759 });
		mapCode2XY.put("IRIS_313-12036", new double[] { 0.0479873029047245, 0.0129198019461467 });
		mapCode2XY.put("IRIS_313-12037", new double[] { 0.0573953578019203, 0.0163606075681588 });
		mapCode2XY.put("IRIS_313-12038", new double[] { 0.052569357590267, 0.017703706124953 });
		mapCode2XY.put("IRIS_313-12039", new double[] { 0.0515210769349462, 0.0193419846426535 });
		mapCode2XY.put("IRIS_313-12040", new double[] { 0.0561691125486155, 0.0178233086420861 });
		mapCode2XY.put("IRIS_313-12041", new double[] { 0.0558347922048925, 0.0187816495731772 });
		mapCode2XY.put("IRIS_313-12042", new double[] { 0.0532104183955413, 0.0184882945301134 });
		mapCode2XY.put("IRIS_313-12043", new double[] { 0.0539311629180781, 0.0166283159323029 });
		mapCode2XY.put("IRIS_313-12044", new double[] { 0.0567126728397556, 0.0187725487911335 });
		mapCode2XY.put("IRIS_313-12045", new double[] { -0.0878161936199438, 0.0153324376559732 });
		mapCode2XY.put("IRIS_313-12046", new double[] { 0.0515602104538562, 0.0186331955370764 });
		mapCode2XY.put("IRIS_313-12047", new double[] { 0.0496261229184269, 0.0187818373255528 });
		mapCode2XY.put("IRIS_313-12048", new double[] { 0.051829985998279, 0.0174232618018499 });
		mapCode2XY.put("IRIS_313-12049", new double[] { 0.0512040971488301, 0.015986406776892 });
		mapCode2XY.put("IRIS_313-12050", new double[] { 0.0492616779431371, 0.011851910924407 });
		mapCode2XY.put("IRIS_313-12051", new double[] { -0.0840916904553513, 0.0159474658983586 });
		mapCode2XY.put("IRIS_313-12052", new double[] { 0.0370011977995054, -0.0258655626397743 });
		mapCode2XY.put("IRIS_313-12053", new double[] { 0.0479815489717269, 0.0162344208005495 });
		mapCode2XY.put("IRIS_313-12054", new double[] { -0.0876642977903233, 0.0182625865145466 });
		mapCode2XY.put("IRIS_313-12055", new double[] { 0.00267145127157035, -0.112172606365178 });
		mapCode2XY.put("IRIS_313-12057", new double[] { 0.041244519682132, 0.0125746522459583 });
		mapCode2XY.put("IRIS_313-12058", new double[] { 0.0511420013341247, 0.0176867073219699 });
		mapCode2XY.put("IRIS_313-12059", new double[] { -0.0894670081665571, 0.0119262721367753 });
		mapCode2XY.put("IRIS_313-12060", new double[] { -0.088461867412005, 0.0106844340294855 });
		mapCode2XY.put("IRIS_313-12061", new double[] { -0.0896319635834377, 0.0133464499986954 });
		mapCode2XY.put("IRIS_313-12063", new double[] { -0.088598443313556, 0.0119381186797603 });
		mapCode2XY.put("IRIS_313-12065", new double[] { 0.0242679323169997, -0.0712723394663821 });
		mapCode2XY.put("IRIS_313-12066", new double[] { 0.0551360290897585, 0.0170497122206175 });
		mapCode2XY.put("IRIS_313-12067", new double[] { 0.0489654114636661, 0.0114834049995443 });
		mapCode2XY.put("IRIS_313-12068", new double[] { -0.0816976450217822, 0.0136882602272156 });
		mapCode2XY.put("IRIS_313-12069", new double[] { -0.0847201438763228, 0.013141112448443 });
		mapCode2XY.put("IRIS_313-12070", new double[] { -0.0828540996614912, 0.0126566922267397 });
		mapCode2XY.put("IRIS_313-12071", new double[] { -0.0899875048367716, 0.013669865161665 });
		mapCode2XY.put("IRIS_313-12072", new double[] { 0.047176985782982, 0.0117411427130857 });
		mapCode2XY.put("IRIS_313-12073", new double[] { -0.0855248451597461, 0.0142061266223191 });
		mapCode2XY.put("IRIS_313-12074", new double[] { -0.0775660772472549, -0.00518277136517021 });
		mapCode2XY.put("IRIS_313-12076", new double[] { -0.0901052249761217, 0.0116778640226155 });
		mapCode2XY.put("IRIS_313-12077", new double[] { -0.0899435897753958, 0.012047610738908 });
		mapCode2XY.put("IRIS_313-12078", new double[] { 0.0503615805471717, 0.0150360019154022 });
		mapCode2XY.put("IRIS_313-12079", new double[] { 0.0508365016503901, 0.0200113452396511 });
		mapCode2XY.put("IRIS_313-12080", new double[] { 0.0502194390704844, 0.0199651308359711 });
		mapCode2XY.put("IRIS_313-12081", new double[] { 0.055735969527727, 0.016170776179261 });
		mapCode2XY.put("IRIS_313-12082", new double[] { 0.0398613074844303, -0.0238467125685837 });
		mapCode2XY.put("IRIS_313-12083", new double[] { 0.0446694541088035, -0.0268713500369493 });
		mapCode2XY.put("IRIS_313-12093", new double[] { 0.0523444719954967, 0.013337120842928 });
		mapCode2XY.put("IRIS_313-12094", new double[] { -0.0728402478542619, -0.0248458514201165 });
		mapCode2XY.put("IRIS_313-12096", new double[] { 0.0494245885739775, 0.00313008134813834 });
		mapCode2XY.put("IRIS_313-12097", new double[] { 0.0567600994155894, 0.017272929672963 });
		mapCode2XY.put("IRIS_313-12101", new double[] { 0.0576284081475412, 0.0157451832538991 });
		mapCode2XY.put("IRIS_313-12102", new double[] { 0.0516153172377129, 0.018144142103808 });
		mapCode2XY.put("IRIS_313-12108", new double[] { -0.0865544763369753, 0.0145188508486703 });
		mapCode2XY.put("IRIS_313-12109", new double[] { 0.0534214786023316, 0.0156219841778658 });
		mapCode2XY.put("IRIS_313-12118", new double[] { 0.0455401160015712, -0.0233932680581198 });
		mapCode2XY.put("IRIS_313-12121", new double[] { 0.056534285617212, 0.0178176157517174 });
		mapCode2XY.put("IRIS_313-12127", new double[] { 0.0543984691439279, 0.0165624828545666 });
		mapCode2XY.put("IRIS_313-12128", new double[] { 0.0535318099221587, 0.0221981447063954 });
		mapCode2XY.put("IRIS_313-12129", new double[] { -0.0844399897134064, 0.0125328935248111 });
		mapCode2XY.put("IRIS_313-12130", new double[] { 0.0530075910304846, 0.0167414690413682 });
		mapCode2XY.put("IRIS_313-12131", new double[] { 0.0555281112224666, 0.0168960980618657 });
		mapCode2XY.put("IRIS_313-12133", new double[] { 0.0498243528624127, 0.0177447444284071 });
		mapCode2XY.put("IRIS_313-12134", new double[] { -0.0867211461455524, 0.0130923771675326 });
		mapCode2XY.put("IRIS_313-12135", new double[] { 0.0489984605011319, 0.0129693613733375 });
		mapCode2XY.put("IRIS_313-12138", new double[] { 0.0528142755417902, 0.0119580521609643 });
		mapCode2XY.put("IRIS_313-12139", new double[] { -0.00576869162380238, -0.131287247392216 });
		mapCode2XY.put("IRIS_313-12141", new double[] { -0.00446972054280571, -0.139671280564138 });
		mapCode2XY.put("IRIS_313-12142", new double[] { 0.0533484169267574, 0.0173680593203324 });
		mapCode2XY.put("IRIS_313-12143", new double[] { 0.056934546760878, 0.0120515897079648 });
		mapCode2XY.put("IRIS_313-12144", new double[] { -0.0869955301640538, 0.0153684188487366 });
		mapCode2XY.put("IRIS_313-12146", new double[] { 0.048366472479468, 0.00733847132985062 });
		mapCode2XY.put("IRIS_313-12147", new double[] { 0.0543631383796698, 0.0136133478163754 });
		mapCode2XY.put("IRIS_313-12148", new double[] { 0.0506288508208612, 0.0189405747614357 });
		mapCode2XY.put("IRIS_313-12151", new double[] { 0.0529333290256198, 0.017009819713829 });
		mapCode2XY.put("IRIS_313-12152", new double[] { 0.0507696066707185, 0.0196788661159807 });
		mapCode2XY.put("IRIS_313-12161", new double[] { 0.0553303893850589, 0.0173627870303017 });
		mapCode2XY.put("IRIS_313-12164", new double[] { -0.0852501619634709, 0.0133577166240889 });
		mapCode2XY.put("IRIS_313-12180", new double[] { 0.0530491297726928, 0.011982572877419 });
		mapCode2XY.put("IRIS_313-12182", new double[] { 0.0514308582572401, 0.0108579139779808 });
		mapCode2XY.put("IRIS_313-12183", new double[] { -0.00577258240157846, -0.110377992681017 });
		mapCode2XY.put("IRIS_313-12185", new double[] { 0.0503822018541992, 0.0132175124691309 });
		mapCode2XY.put("IRIS_313-12186", new double[] { 0.0345094503429275, 0.00741893036287913 });
		mapCode2XY.put("IRIS_313-12187", new double[] { 0.0505515195172517, 0.0104957741427746 });
		mapCode2XY.put("IRIS_313-12188", new double[] { 0.0532450376373862, 0.0200801726208256 });
		mapCode2XY.put("IRIS_313-12190", new double[] { 0.0496417405511052, 0.00801345299746317 });
		mapCode2XY.put("IRIS_313-12193", new double[] { 0.0542177888349242, 0.0151600474099455 });
		mapCode2XY.put("IRIS_313-12194", new double[] { 0.0499382190961769, 0.0179609255788525 });
		mapCode2XY.put("IRIS_313-12200", new double[] { -0.0892694558543463, 0.0143211165243277 });
		mapCode2XY.put("IRIS_313-12207", new double[] { 0.0488697410291056, 0.00958577868569092 });
		mapCode2XY.put("IRIS_313-12210", new double[] { 0.0484494170648093, 0.00994002997667511 });
		mapCode2XY.put("IRIS_313-12217", new double[] { -0.0930760786621304, 0.0142351473251967 });
		mapCode2XY.put("IRIS_313-12220", new double[] { 0.0565241974308859, 0.0142832577039965 });
		mapCode2XY.put("IRIS_313-12221", new double[] { 0.0536004065268728, 0.0153315118225301 });
		mapCode2XY.put("IRIS_313-12222", new double[] { 0.049187148997094, 0.0108615833656977 });
		mapCode2XY.put("IRIS_313-12224", new double[] { 0.0532388685006663, 0.015208417271866 });
		mapCode2XY.put("IRIS_313-12225", new double[] { 0.0520785946379813, 0.0155619256106828 });
		mapCode2XY.put("IRIS_313-12226", new double[] { -0.0909642406715608, 0.0131829868036092 });
		mapCode2XY.put("IRIS_313-12227", new double[] { -0.0880331014841202, 0.01427040782574 });
		mapCode2XY.put("IRIS_313-12228", new double[] { -0.0908926121036386, 0.0140509324266281 });
		mapCode2XY.put("IRIS_313-12229", new double[] { 0.0552655515302745, 0.018003264450343 });
		mapCode2XY.put("IRIS_313-12231", new double[] { 0.0523343902708521, 0.0159082069841179 });
		mapCode2XY.put("IRIS_313-12232", new double[] { 0.0480056598046701, 0.018361779483662 });
		mapCode2XY.put("IRIS_313-12234", new double[] { 0.0535582629701246, 0.0214748541725684 });
		mapCode2XY.put("IRIS_313-12236", new double[] { 0.0511046092134927, 0.00969342355690025 });
		mapCode2XY.put("IRIS_313-12237", new double[] { 0.044642218810781, 0.0134403277397152 });
		mapCode2XY.put("IRIS_313-12240", new double[] { 0.0516609096515774, 0.0187394075970507 });
		mapCode2XY.put("IRIS_313-12241", new double[] { -0.0889819238650277, 0.0159571938809378 });
		mapCode2XY.put("IRIS_313-12242", new double[] { -0.0915131520151256, 0.0128274993999642 });
		mapCode2XY.put("IRIS_313-12244", new double[] { -0.0864912036612131, 0.0134491144653399 });
		mapCode2XY.put("IRIS_313-12246", new double[] { 0.0517381692366356, 0.0183830287106439 });
		mapCode2XY.put("IRIS_313-12247", new double[] { 0.0495877273137366, 0.0141025554154652 });
		mapCode2XY.put("IRIS_313-12249", new double[] { 0.049984966062777, 0.00860077004944442 });
		mapCode2XY.put("IRIS_313-12251", new double[] { 0.0574671478274266, 0.0154318337113229 });
		mapCode2XY.put("IRIS_313-12252", new double[] { -0.0868142169516826, 0.0129672100259033 });
		mapCode2XY.put("IRIS_313-12254", new double[] { -0.0903220128851049, 0.0139057900795742 });
		mapCode2XY.put("IRIS_313-12257", new double[] { -0.0893964913598677, 0.01365931750235 });
		mapCode2XY.put("IRIS_313-12258", new double[] { -0.090591276837301, 0.0135811473432718 });
		mapCode2XY.put("IRIS_313-12259", new double[] { 0.0547223712247251, 0.0172019013306294 });
		mapCode2XY.put("IRIS_313-12260", new double[] { 0.0494488969470515, 0.0175857555906047 });
		mapCode2XY.put("IRIS_313-12261", new double[] { 0.0557191135294104, 0.0182317350985343 });
		mapCode2XY.put("IRIS_313-12262", new double[] { -0.0899070551216289, 0.0140639428145926 });
		mapCode2XY.put("IRIS_313-12263", new double[] { 0.0532503264349071, 0.0181694463756426 });
		mapCode2XY.put("IRIS_313-12265", new double[] { -0.0908622000787778, 0.012418295053548 });
		mapCode2XY.put("IRIS_313-12266", new double[] { -0.0893883923409345, 0.0123842159192486 });
		mapCode2XY.put("IRIS_313-12268", new double[] { 0.0523512712363472, 0.0156505125526226 });
		mapCode2XY.put("IRIS_313-12269", new double[] { 0.0552198901314724, 0.00922838273445967 });
		mapCode2XY.put("IRIS_313-12270", new double[] { 0.0515656338888376, 0.00981464106165895 });
		mapCode2XY.put("IRIS_313-12271", new double[] { -0.0898361367922356, 0.0149403889610126 });
		mapCode2XY.put("IRIS_313-12272", new double[] { -0.0875134676657913, 0.0119913838133703 });
		mapCode2XY.put("IRIS_313-12273", new double[] { 0.0499877461160191, 0.0121966991085123 });
		mapCode2XY.put("IRIS_313-12275", new double[] { 0.0506449557624831, 0.0130218354387524 });
		mapCode2XY.put("IRIS_313-12278", new double[] { 0.042112210911897, -0.0203439982112727 });
		mapCode2XY.put("IRIS_313-12279", new double[] { -0.088983737028136, 0.0174720110924875 });
		mapCode2XY.put("IRIS_313-12280", new double[] { 0.0551874015158121, 0.00709313680794579 });
		mapCode2XY.put("IRIS_313-12281", new double[] { -0.0888511076643687, 0.0191101061509014 });
		mapCode2XY.put("IRIS_313-12282", new double[] { 0.0462697200755329, -0.00146867007865312 });
		mapCode2XY.put("IRIS_313-12283", new double[] { 0.0495957620367734, -0.00174766564214383 });
		mapCode2XY.put("IRIS_313-12284", new double[] { 0.0390147522814523, -0.0442982530537412 });
		mapCode2XY.put("IRIS_313-12285", new double[] { -0.0829474908515132, 0.0136693373415613 });
		mapCode2XY.put("IRIS_313-12286", new double[] { 0.0554561234734028, 0.013901102255106 });
		mapCode2XY.put("IRIS_313-12287", new double[] { 0.0521230456417102, 0.0230163480547739 });
		mapCode2XY.put("IRIS_313-12288", new double[] { 0.054105987879795, 0.0125387172117907 });
		mapCode2XY.put("IRIS_313-12289", new double[] { -0.0867296448156336, 0.0123303151142429 });
		mapCode2XY.put("IRIS_313-12290", new double[] { 0.0503732946104483, 0.0137355642325596 });
		mapCode2XY.put("IRIS_313-12291", new double[] { 0.0547185720917919, 0.0111508781606123 });
		mapCode2XY.put("IRIS_313-12292", new double[] { 0.0518000244455991, 0.0116235474011737 });
		mapCode2XY.put("IRIS_313-12296", new double[] { 0.0508011681753925, 0.0148004572637158 });
		mapCode2XY.put("IRIS_313-12297", new double[] { 0.042542934851728, 0.00967260368922527 });
		mapCode2XY.put("IRIS_313-12299", new double[] { -0.0808433196836443, 0.0122958169635649 });
		mapCode2XY.put("IRIS_313-12300", new double[] { 0.0527344174455286, 0.00939588551333748 });
		mapCode2XY.put("IRIS_313-12301", new double[] { 0.04930773243322, 0.0111112490711758 });
		mapCode2XY.put("IRIS_313-12302", new double[] { 0.0506392146256521, 0.0138649609747136 });
		mapCode2XY.put("IRIS_313-12303", new double[] { 0.0510312390980963, 0.0124892912304672 });
		mapCode2XY.put("IRIS_313-12305", new double[] { 0.0527305135029015, 0.0137925156346274 });
		mapCode2XY.put("IRIS_313-12307", new double[] { -0.0913862058983445, 0.0142667464561972 });
		mapCode2XY.put("IRIS_313-12308", new double[] { 0.0530572158086193, 0.0192813676920737 });
		mapCode2XY.put("IRIS_313-12309", new double[] { 0.0528915743713673, 0.0164863745280131 });
		mapCode2XY.put("IRIS_313-12311", new double[] { -0.0910338819637154, 0.0136857670246712 });
		mapCode2XY.put("IRIS_313-12312", new double[] { -0.090982403389599, 0.0123585844055115 });
		mapCode2XY.put("IRIS_313-12313", new double[] { -0.0866806125998111, 0.0123922828279373 });
		mapCode2XY.put("IRIS_313-12319", new double[] { 0.0476273538833283, 0.0201849946918431 });
		mapCode2XY.put("IRIS_313-12321", new double[] { -0.0871089604885854, 0.0109057347187621 });
		mapCode2XY.put("IRIS_313-12322", new double[] { -0.0907759096993789, 0.0144794436341743 });
		mapCode2XY.put("IRIS_313-12323", new double[] { -0.0914504436169689, 0.0132907799276204 });
		mapCode2XY.put("IRIS_313-12324", new double[] { -0.0894265582174884, 0.0127485418993854 });
		mapCode2XY.put("IRIS_313-12325", new double[] { 0.0525481912251204, -0.00205075952805 });
		mapCode2XY.put("IRIS_313-12329", new double[] { 0.0441811864419698, 0.00605644016405681 });
		mapCode2XY.put("IRIS_313-12330", new double[] { -0.0891656249703721, 0.0133721583859404 });
		mapCode2XY.put("IRIS_313-12332", new double[] { -0.0896942728646968, 0.0127725402476508 });
		mapCode2XY.put("IRIS_313-12334", new double[] { 0.0539053769856951, 0.0160429345603038 });
		mapCode2XY.put("IRIS_313-12336", new double[] { -0.0904680027207415, 0.0129014615519297 });
		mapCode2XY.put("IRIS_313-12337", new double[] { -0.0902927202208369, 0.0143275922258512 });
		mapCode2XY.put("IRIS_313-12340", new double[] { -0.091131903565664, 0.0134365410045488 });
		mapCode2XY.put("IRIS_313-12341", new double[] { -0.0911910507134032, 0.0139329857040404 });
		mapCode2XY.put("IRIS_313-12342", new double[] { -0.089628652586601, 0.0122962910203664 });
		mapCode2XY.put("IRIS_313-12344", new double[] { -0.0890127498846065, 0.0134299845126016 });
		mapCode2XY.put("IRIS_313-12345", new double[] { -0.0812395573089241, 0.0126664681822309 });
		mapCode2XY.put("IRIS_313-12346", new double[] { -0.0886642294370962, 0.0147316419758689 });
		mapCode2XY.put("IRIS_313-12347", new double[] { -0.0889821550752788, 0.0126825351134665 });
		mapCode2XY.put("IRIS_313-12348", new double[] { -0.0912791220491797, 0.0142086009220619 });
		mapCode2XY.put("IRIS_313-12349", new double[] { -0.0912132396083884, 0.0137328597256203 });
		mapCode2XY.put("IRIS_313-12350", new double[] { -0.0901182419714447, 0.0131790098120174 });
		mapCode2XY.put("IRIS_313-12351", new double[] { -0.089933543658247, 0.0131752651174925 });
		mapCode2XY.put("IRIS_313-12352", new double[] { -0.0889166579980829, 0.0131278328717814 });
		mapCode2XY.put("IRIS_313-12353", new double[] { -0.0915855304480902, 0.0139498486553584 });
		mapCode2XY.put("IRIS_313-12354", new double[] { 0.0555339186553152, 0.019202293476106 });
		mapCode2XY.put("IRIS_313-12355", new double[] { 0.0547988553259243, 0.016456980330516 });
		mapCode2XY.put("IRIS_313-15896", new double[] { 0.0399779467146661, 0.00936079666952896 });
		mapCode2XY.put("IRIS_313-15897", new double[] { 0.0476194861580214, 0.0151992940741271 });
		mapCode2XY.put("IRIS_313-15898", new double[] { 0.0457736029285241, 0.0106277948854865 });
		mapCode2XY.put("IRIS_313-15899", new double[] { 0.0375261852992513, 0.00651794399720386 });
		mapCode2XY.put("IRIS_313-15900", new double[] { 0.0507154280735232, 0.0168876224653352 });
		mapCode2XY.put("IRIS_313-15901", new double[] { 0.0392469306284947, 0.0117157370507623 });
		mapCode2XY.put("IRIS_313-15902", new double[] { 0.0373227003796615, 0.0125257245366802 });
		mapCode2XY.put("IRIS_313-15903", new double[] { 0.0240960649384671, -0.0347494451164283 });
		mapCode2XY.put("IRIS_313-15904", new double[] { -0.0949370240476488, 0.017358049576939 });
		mapCode2XY.put("IRIS_313-15905", new double[] { -0.0846192188868556, 0.0144816685458727 });
		mapCode2XY.put("IRIS_313-15906", new double[] { 0.024588097327808, 0.01742974504685 });
		mapCode2XY.put("IRIS_313-15907", new double[] { -0.0870344688836686, 0.0197782970243082 });
		mapCode2XY.put("IRIS_313-15908", new double[] { -0.0108713405025896, -0.144046326707157 });
		mapCode2XY.put("IRIS_313-15909", new double[] { -0.0679560265643734, -0.048077226596028 });
		mapCode2XY.put("IRIS_313-15910", new double[] { -0.0868319905158568, 0.0195244413518764 });
		mapCode2XY.put("IRIS_313-7620", new double[] { 0.054718975364483, 0.0174528701021407 });
		mapCode2XY.put("IRIS_313-7635", new double[] { 0.0506074465297161, 0.0158921228036179 });
		mapCode2XY.put("IRIS_313-7636", new double[] { 0.0487589387393573, 0.0159553190364414 });
		mapCode2XY.put("IRIS_313-7638", new double[] { 0.0395680183632585, -0.00517923864412157 });
		mapCode2XY.put("IRIS_313-7641", new double[] { 0.0453853534804916, 0.0201163070892593 });
		mapCode2XY.put("IRIS_313-7646", new double[] { -0.0136447649515018, -0.0231584375811057 });
		mapCode2XY.put("IRIS_313-7650", new double[] { 0.0213326220303613, -0.0439952007508404 });
		mapCode2XY.put("IRIS_313-7651", new double[] { 0.02855439337115, -0.0443065954164519 });
		mapCode2XY.put("IRIS_313-7654", new double[] { 0.0504526592717584, 0.0171194660206052 });
		mapCode2XY.put("IRIS_313-7664", new double[] { 0.0501147762623536, 0.0134249069448612 });
		mapCode2XY.put("IRIS_313-7665", new double[] { 0.0462260402422148, 0.0139546409532025 });
		mapCode2XY.put("IRIS_313-7668", new double[] { 0.0442775758274624, 0.0174602111299695 });
		mapCode2XY.put("IRIS_313-7681", new double[] { 0.0543695635974192, 0.0102547132122729 });
		mapCode2XY.put("IRIS_313-7684", new double[] { 0.0496135301261531, 0.00379709158401216 });
		mapCode2XY.put("IRIS_313-7685", new double[] { 0.0509920460120567, 0.0041643804524892 });
		mapCode2XY.put("IRIS_313-7688", new double[] { 0.0549934347721903, 0.00966523362697141 });
		mapCode2XY.put("IRIS_313-7689", new double[] { 0.0483912576261232, 0.00898343001863355 });
		mapCode2XY.put("IRIS_313-7690", new double[] { 0.0391678468304486, 0.00165087535363591 });
		mapCode2XY.put("IRIS_313-7691", new double[] { 0.0514795675436917, 0.00696007990010257 });
		mapCode2XY.put("IRIS_313-7696", new double[] { 0.0505664450042979, 0.0166104417938845 });
		mapCode2XY.put("IRIS_313-7698", new double[] { 0.0480008830531252, 0.0180360303930701 });
		mapCode2XY.put("IRIS_313-7699", new double[] { 0.047478854666404, 0.0180575759837066 });
		mapCode2XY.put("IRIS_313-7719", new double[] { 0.05615925473394, 0.0150697649137014 });
		mapCode2XY.put("IRIS_313-7720", new double[] { 0.0410499353090163, -0.032173059721954 });
		mapCode2XY.put("IRIS_313-7722", new double[] { -0.021664782352564, -0.0161284824706158 });
		mapCode2XY.put("IRIS_313-7725", new double[] { 0.0296537680121978, 0.00327261666777533 });
		mapCode2XY.put("IRIS_313-7728", new double[] { 0.043147127013538, -0.0342114722657154 });
		mapCode2XY.put("IRIS_313-7736", new double[] { 0.0482978961499204, -0.00486794467012767 });
		mapCode2XY.put("IRIS_313-7758", new double[] { 0.0199125468107977, -0.0442978704356481 });
		mapCode2XY.put("IRIS_313-7766", new double[] { 0.0475573154286388, 0.00799303072456201 });
		mapCode2XY.put("IRIS_313-7769", new double[] { 0.044135895118901, 0.0128643376836211 });
		mapCode2XY.put("IRIS_313-7770", new double[] { 0.0508990783515061, 0.0155045521850575 });
		mapCode2XY.put("IRIS_313-7773", new double[] { 0.0506204142530476, 0.0177418058428509 });
		mapCode2XY.put("IRIS_313-7778", new double[] { 0.0527469803903225, 0.0178926380931331 });
		mapCode2XY.put("IRIS_313-7780", new double[] { 0.0493231940151056, 0.012758899026629 });
		mapCode2XY.put("IRIS_313-7792", new double[] { 0.0480652277936454, 0.0118558370034371 });
		mapCode2XY.put("IRIS_313-7793", new double[] { 0.0545686805646809, -0.00379217449377734 });
		mapCode2XY.put("IRIS_313-7795", new double[] { 0.0562244950561952, -0.00239125888049161 });
		mapCode2XY.put("IRIS_313-7797", new double[] { 0.0481120689967174, 0.0140683435156529 });
		mapCode2XY.put("IRIS_313-7799", new double[] { 0.0330738681883864, -0.0474219957598519 });
		mapCode2XY.put("IRIS_313-7807", new double[] { 0.0514370866718141, 0.011585714939484 });
		mapCode2XY.put("IRIS_313-7808", new double[] { 0.0509944498581864, 0.0189656188492689 });
		mapCode2XY.put("IRIS_313-7809", new double[] { 0.044811124420638, 0.0120872377796672 });
		mapCode2XY.put("IRIS_313-7815", new double[] { 0.0485308599006269, 0.0218542642010567 });
		mapCode2XY.put("IRIS_313-7816", new double[] { 0.0500269204434751, 0.0124330368083232 });
		mapCode2XY.put("IRIS_313-7819", new double[] { 0.0539853975586653, 0.00915048356711043 });
		mapCode2XY.put("IRIS_313-7820", new double[] { 0.0519031223848366, 0.0166329381918985 });
		mapCode2XY.put("IRIS_313-7824", new double[] { 0.0489603459083161, 0.0060300787056561 });
		mapCode2XY.put("IRIS_313-7826", new double[] { 0.0504566536028951, 0.0149044843559308 });
		mapCode2XY.put("IRIS_313-7832", new double[] { 0.0510941910750427, 0.0142141181532692 });
		mapCode2XY.put("IRIS_313-7838", new double[] { -0.0929398260098923, 0.0155611230242093 });
		mapCode2XY.put("IRIS_313-7850", new double[] { -0.089340210105527, 0.0147345916331728 });
		mapCode2XY.put("IRIS_313-7856", new double[] { -0.0819541079263457, 0.0106112197416527 });
		mapCode2XY.put("IRIS_313-7859", new double[] { -0.0920609655217125, 0.0161846837864006 });
		mapCode2XY.put("IRIS_313-7863", new double[] { -0.0905237088675442, 0.0162096126884308 });
		mapCode2XY.put("IRIS_313-7866", new double[] { -0.0611090864809832, 0.0137559225721377 });
		mapCode2XY.put("IRIS_313-7868", new double[] { -0.0842913646692424, 0.0175351905331426 });
		mapCode2XY.put("IRIS_313-7870", new double[] { -0.089461621487141, 0.0146185200669861 });
		mapCode2XY.put("IRIS_313-7876", new double[] { -0.085977489060713, 0.0154208046192226 });
		mapCode2XY.put("IRIS_313-7883", new double[] { -0.086152023854974, 0.0141217739084851 });
		mapCode2XY.put("IRIS_313-7885", new double[] { -0.0830718618001607, 0.0119343087976021 });
		mapCode2XY.put("IRIS_313-7902", new double[] { -0.0837369745874175, 0.016447653793785 });
		mapCode2XY.put("IRIS_313-7907", new double[] { -0.0763447301444976, 0.0158632009687629 });
		mapCode2XY.put("IRIS_313-7909", new double[] { -0.0698864232177628, 0.0174869244523209 });
		mapCode2XY.put("IRIS_313-7911", new double[] { 0.0561622285183244, 0.0161806654352568 });
		mapCode2XY.put("IRIS_313-7912", new double[] { -0.0927177798793094, 0.016450521442486 });
		mapCode2XY.put("IRIS_313-7914", new double[] { -0.0942631068613465, 0.0158617661157019 });
		mapCode2XY.put("IRIS_313-7922", new double[] { -0.0945056679893725, 0.0172751028835231 });
		mapCode2XY.put("IRIS_313-7924", new double[] { -0.0616578012812546, 0.0151998302668016 });
		mapCode2XY.put("IRIS_313-7933", new double[] { -0.0787890784745582, -0.0194303476066161 });
		mapCode2XY.put("IRIS_313-7959", new double[] { -0.0873502513551737, 0.0127816819767541 });
		mapCode2XY.put("IRIS_313-7992", new double[] { -0.0904703601093403, 0.00826170371038446 });
		mapCode2XY.put("IRIS_313-7993", new double[] { -0.0838236100387817, 0.00764185486021878 });
		mapCode2XY.put("IRIS_313-7994", new double[] { -0.0882032725998456, 0.0172388261170266 });
		mapCode2XY.put("IRIS_313-8003", new double[] { -0.090140963229825, 0.0175307810179103 });
		mapCode2XY.put("IRIS_313-8010", new double[] { -0.0865580456947513, 0.0178702754985753 });
		mapCode2XY.put("IRIS_313-8011", new double[] { -0.0890250980376067, 0.0139179474132996 });
		mapCode2XY.put("IRIS_313-8023", new double[] { -0.0929443784460981, 0.0194462431742672 });
		mapCode2XY.put("IRIS_313-8024", new double[] { -0.0941122727830457, 0.0182999836811936 });
		mapCode2XY.put("IRIS_313-8025", new double[] { -0.0942671603944819, 0.0188299549587277 });
		mapCode2XY.put("IRIS_313-8026", new double[] { -0.0968366769042136, 0.0192456470078735 });
		mapCode2XY.put("IRIS_313-8027", new double[] { -0.090474298581442, 0.0180760105765094 });
		mapCode2XY.put("IRIS_313-8029", new double[] { -0.0939041413701193, 0.0189376554811816 });
		mapCode2XY.put("IRIS_313-8031", new double[] { -0.0944155048563595, 0.0202660093719234 });
		mapCode2XY.put("IRIS_313-8032", new double[] { -0.0902825667517528, 0.0166128320198429 });
		mapCode2XY.put("IRIS_313-8033", new double[] { -0.0971891838965403, 0.018000381384791 });
		mapCode2XY.put("IRIS_313-8037", new double[] { -0.0973089501336441, 0.0183933310472015 });
		mapCode2XY.put("IRIS_313-8039", new double[] { -0.0939210929445365, 0.0193438061189069 });
		mapCode2XY.put("IRIS_313-8041", new double[] { -0.0922502778424574, 0.0175201135457092 });
		mapCode2XY.put("IRIS_313-8044", new double[] { -0.0892753471223003, 0.0198062352031746 });
		mapCode2XY.put("IRIS_313-8046", new double[] { -0.0875335368363943, 0.0176116197007497 });
		mapCode2XY.put("IRIS_313-8048", new double[] { -0.0944350824629247, 0.0202887072684024 });
		mapCode2XY.put("IRIS_313-8049", new double[] { -0.0935800042896699, 0.0194512907161896 });
		mapCode2XY.put("IRIS_313-8050", new double[] { -0.0949391179720333, 0.0167932262153211 });
		mapCode2XY.put("IRIS_313-8052", new double[] { -0.0946823787866957, 0.0204472419891149 });
		mapCode2XY.put("IRIS_313-8053", new double[] { -0.0934856354602582, 0.0195710296800559 });
		mapCode2XY.put("IRIS_313-8057", new double[] { -0.0809527803604135, 0.0178361548681319 });
		mapCode2XY.put("IRIS_313-8058", new double[] { -0.0803882729792172, 0.0185913263019105 });
		mapCode2XY.put("IRIS_313-8060", new double[] { -0.0818172919980912, 0.0202935660360365 });
		mapCode2XY.put("IRIS_313-8061", new double[] { -0.0885659730365373, 0.0216623304604489 });
		mapCode2XY.put("IRIS_313-8062", new double[] { -0.0865051384609607, 0.0190995616459557 });
		mapCode2XY.put("IRIS_313-8063", new double[] { -0.092958252272312, 0.0179975472108981 });
		mapCode2XY.put("IRIS_313-8064", new double[] { -0.0866418527191926, 0.0205801696930768 });
		mapCode2XY.put("IRIS_313-8065", new double[] { -0.0950839643329475, 0.0188779015166839 });
		mapCode2XY.put("IRIS_313-8066", new double[] { -0.093543047866468, 0.0167859355767798 });
		mapCode2XY.put("IRIS_313-8067", new double[] { 6.23349508833722E-05, 0.00909240752601177 });
		mapCode2XY.put("IRIS_313-8068", new double[] { 0.0471435534547976, 0.0141813899597395 });
		mapCode2XY.put("IRIS_313-8069", new double[] { 0.0489677640644104, 0.0190168175049512 });
		mapCode2XY.put("IRIS_313-8072", new double[] { -0.0934326897562682, 0.0139868221527315 });
		mapCode2XY.put("IRIS_313-8073", new double[] { -0.000262763944316084, -0.132412732396491 });
		mapCode2XY.put("IRIS_313-8074", new double[] { -0.0896383572241688, 0.019005970581497 });
		mapCode2XY.put("IRIS_313-8075", new double[] { -0.0911016283445497, 0.0184000998336127 });
		mapCode2XY.put("IRIS_313-8076", new double[] { -0.0929080895989759, 0.0181871591267858 });
		mapCode2XY.put("IRIS_313-8084", new double[] { -0.095058487282308, 0.017923398782009 });
		mapCode2XY.put("IRIS_313-8085", new double[] { -0.0967108697123026, 0.0184337346153993 });
		mapCode2XY.put("IRIS_313-8087", new double[] { -0.0935862465843993, 0.0162835720365123 });
		mapCode2XY.put("IRIS_313-8090", new double[] { -0.0960889538838188, 0.0189928662229202 });
		mapCode2XY.put("IRIS_313-8095", new double[] { -0.0933964998726198, 0.0193667770244409 });
		mapCode2XY.put("IRIS_313-8096", new double[] { -0.0935628490103997, 0.0195642374884843 });
		mapCode2XY.put("IRIS_313-8097", new double[] { -0.0878264257445875, 0.0183865014858014 });
		mapCode2XY.put("IRIS_313-8099", new double[] { -0.0933014749190955, 0.0197420504637182 });
		mapCode2XY.put("IRIS_313-8102", new double[] { -0.088422035910746, 0.0189227929686047 });
		mapCode2XY.put("IRIS_313-8105", new double[] { -0.0942193017420266, 0.016449601135409 });
		mapCode2XY.put("IRIS_313-8109", new double[] { -0.0961142447035501, 0.0173359211195298 });
		mapCode2XY.put("IRIS_313-8111", new double[] { -0.0952228237461178, 0.0162245634703375 });
		mapCode2XY.put("IRIS_313-8112", new double[] { -0.096220012307908, 0.0182713209501311 });
		mapCode2XY.put("IRIS_313-8113", new double[] { -0.0958276650570293, 0.0169630744959458 });
		mapCode2XY.put("IRIS_313-8114", new double[] { -0.092410408236999, 0.0177469485643853 });
		mapCode2XY.put("IRIS_313-8115", new double[] { -0.0922619095833828, 0.0183393393296872 });
		mapCode2XY.put("IRIS_313-8116", new double[] { -0.0923060918298869, 0.0172325252765801 });
		mapCode2XY.put("IRIS_313-8118", new double[] { -0.0926475274878405, 0.0193532507482945 });
		mapCode2XY.put("IRIS_313-8119", new double[] { -0.0910668200255972, 0.0167848555323905 });
		mapCode2XY.put("IRIS_313-8121", new double[] { -0.0899192890654748, 0.0167224031731822 });
		mapCode2XY.put("IRIS_313-8123", new double[] { -0.0934665717935286, 0.0184400344114608 });
		mapCode2XY.put("IRIS_313-8124", new double[] { -0.0925173907844902, 0.018210939851558 });
		mapCode2XY.put("IRIS_313-8125", new double[] { -0.0967216878116928, 0.0177478181315556 });
		mapCode2XY.put("IRIS_313-8126", new double[] { -0.0958355614112584, 0.0172940488659277 });
		mapCode2XY.put("IRIS_313-8127", new double[] { -0.082422980974879, 0.0112445624640373 });
		mapCode2XY.put("IRIS_313-8128", new double[] { -0.0961542933569368, 0.0150620078424544 });
		mapCode2XY.put("IRIS_313-8129", new double[] { -0.0963292193945586, 0.0175664070707466 });
		mapCode2XY.put("IRIS_313-8132", new double[] { -0.0929263687239675, 0.0169790706759062 });
		mapCode2XY.put("IRIS_313-8134", new double[] { -0.0931509275557019, 0.0190682652808172 });
		mapCode2XY.put("IRIS_313-8135", new double[] { -0.097462151541614, 0.0182722916308643 });
		mapCode2XY.put("IRIS_313-8136", new double[] { -0.0941219266286809, 0.017769561438113 });
		mapCode2XY.put("IRIS_313-8137", new double[] { -0.085651442294831, 0.0141667230403933 });
		mapCode2XY.put("IRIS_313-8138", new double[] { -0.0962650559615737, 0.0166865235831929 });
		mapCode2XY.put("IRIS_313-8139", new double[] { -0.0894763071073107, 0.0184461623854701 });
		mapCode2XY.put("IRIS_313-8140", new double[] { -0.0911119215184023, 0.0181830249048534 });
		mapCode2XY.put("IRIS_313-8141", new double[] { -0.095393068333754, 0.0188469470451321 });
		mapCode2XY.put("IRIS_313-8142", new double[] { -0.094974230964285, 0.0196211402597023 });
		mapCode2XY.put("IRIS_313-8143", new double[] { -0.0922761328604911, 0.0182937752090726 });
		mapCode2XY.put("IRIS_313-8145", new double[] { -0.0873199662501602, 0.0138467345491816 });
		mapCode2XY.put("IRIS_313-8147", new double[] { -0.0913779609273272, 0.0162303689845421 });
		mapCode2XY.put("IRIS_313-8148", new double[] { -0.0929182160065959, 0.0156909394150566 });
		mapCode2XY.put("IRIS_313-8149", new double[] { -0.0954786560883097, 0.0184831236387102 });
		mapCode2XY.put("IRIS_313-8151", new double[] { -0.093035625393017, 0.0164894384004778 });
		mapCode2XY.put("IRIS_313-8154", new double[] { -0.0941212019120689, 0.017344666345839 });
		mapCode2XY.put("IRIS_313-8155", new double[] { -0.0927592823573892, 0.0184807609709411 });
		mapCode2XY.put("IRIS_313-8158", new double[] { -0.0966775386256683, 0.0184299810355309 });
		mapCode2XY.put("IRIS_313-8159", new double[] { -0.0967030689426992, 0.0183726542269957 });
		mapCode2XY.put("IRIS_313-8160", new double[] { -0.0942817705089984, 0.0171231322292718 });
		mapCode2XY.put("IRIS_313-8161", new double[] { 0.0495341071939456, 0.0139960973845366 });
		mapCode2XY.put("IRIS_313-8162", new double[] { -0.0936687794414904, 0.0163594827123478 });
		mapCode2XY.put("IRIS_313-8164", new double[] { -0.0854876554952219, 0.0183802501964941 });
		mapCode2XY.put("IRIS_313-8165", new double[] { -0.0957825242983729, 0.0152692778015915 });
		mapCode2XY.put("IRIS_313-8166", new double[] { -0.0942136914776193, 0.0185330470901546 });
		mapCode2XY.put("IRIS_313-8167", new double[] { -0.09487442153451, 0.0185761702838471 });
		mapCode2XY.put("IRIS_313-8168", new double[] { -0.0950907595986419, 0.0188988738184475 });
		mapCode2XY.put("IRIS_313-8170", new double[] { -0.0887157750693233, 0.0153233919807386 });
		mapCode2XY.put("IRIS_313-8171", new double[] { -0.0945475060400097, 0.0148551203063367 });
		mapCode2XY.put("IRIS_313-8172", new double[] { -0.0664005290893308, 0.00856641530851146 });
		mapCode2XY.put("IRIS_313-8173", new double[] { -0.0798572472449695, 0.013564756964217 });
		mapCode2XY.put("IRIS_313-8177", new double[] { -0.0942549826689458, 0.0182594500075865 });
		mapCode2XY.put("IRIS_313-8180", new double[] { -0.089186199376534, 0.0197469542483091 });
		mapCode2XY.put("IRIS_313-8183", new double[] { -0.0858162907243943, 0.0183474802538651 });
		mapCode2XY.put("IRIS_313-8184", new double[] { -0.0402992175051483, -0.00814854980036261 });
		mapCode2XY.put("IRIS_313-8185", new double[] { -0.0871049663552421, 0.018513084670735 });
		mapCode2XY.put("IRIS_313-8186", new double[] { -0.0903088159730324, 0.0199557799768869 });
		mapCode2XY.put("IRIS_313-8192", new double[] { -0.0833790740889853, 0.0195856645036352 });
		mapCode2XY.put("IRIS_313-8193", new double[] { -0.0865246869178285, 0.018329423729934 });
		mapCode2XY.put("IRIS_313-8195", new double[] { -0.0926954317315496, 0.0190043235939841 });
		mapCode2XY.put("IRIS_313-8200", new double[] { -0.089333161138826, 0.0164442474664498 });
		mapCode2XY.put("IRIS_313-8202", new double[] { -0.0789477954578996, 0.0186002766023593 });
		mapCode2XY.put("IRIS_313-8204", new double[] { -0.0939140647658224, 0.0172867142076194 });
		mapCode2XY.put("IRIS_313-8205", new double[] { -0.0905246529110113, 0.0201076293499285 });
		mapCode2XY.put("IRIS_313-8208", new double[] { -0.089383570882896, 0.0152838365333477 });
		mapCode2XY.put("IRIS_313-8209", new double[] { -0.0873390591022305, 0.0171666488723443 });
		mapCode2XY.put("IRIS_313-8212", new double[] { 0.0486741633953079, 0.00932695448241437 });
		mapCode2XY.put("IRIS_313-8213", new double[] { -0.0924343891690235, 0.0200296280112551 });
		mapCode2XY.put("IRIS_313-8214", new double[] { -0.0932558897313962, 0.0167298380096913 });
		mapCode2XY.put("IRIS_313-8215", new double[] { 0.0452934236866211, 0.0173447662920265 });
		mapCode2XY.put("IRIS_313-8216", new double[] { -0.0943094604683662, 0.0192893013587885 });
		mapCode2XY.put("IRIS_313-8217", new double[] { -0.0941845718620682, 0.017528512964432 });
		mapCode2XY.put("IRIS_313-8218", new double[] { -0.0939598885286209, 0.0172308312570905 });
		mapCode2XY.put("IRIS_313-8232", new double[] { -0.0684578101456473, 0.0143617633890742 });
		mapCode2XY.put("IRIS_313-8244", new double[] { 0.0523082274726457, -0.0136749056600731 });
		mapCode2XY.put("IRIS_313-8252", new double[] { -0.0148583805617951, -0.142887953572787 });
		mapCode2XY.put("IRIS_313-8253", new double[] { 0.0519888852746987, 0.0196534477118172 });
		mapCode2XY.put("IRIS_313-8256", new double[] { -0.0908268466423523, 0.00508636787784791 });
		mapCode2XY.put("IRIS_313-8265", new double[] { 0.0504418217084555, 0.00276175985790633 });
		mapCode2XY.put("IRIS_313-8268", new double[] { -0.0651743320718176, -0.0213523691289723 });
		mapCode2XY.put("IRIS_313-8277", new double[] { -0.0909361352606304, 0.0146037120672182 });
		mapCode2XY.put("IRIS_313-8279", new double[] { -0.0824807398329741, 0.0144224474415912 });
		mapCode2XY.put("IRIS_313-8283", new double[] { -0.00194598916981664, -0.120960814685352 });
		mapCode2XY.put("IRIS_313-8285", new double[] { -0.0797862092736522, 0.0195381552430815 });
		mapCode2XY.put("IRIS_313-8288", new double[] { 0.0302290891337129, -0.0145273363162322 });
		mapCode2XY.put("IRIS_313-8291", new double[] { 0.0541204920746459, 0.0155473205979854 });
		mapCode2XY.put("IRIS_313-8292", new double[] { 0.0496698727510011, 0.015065426337324 });
		mapCode2XY.put("IRIS_313-8293", new double[] { 0.0546401951833865, 0.01353817512141 });
		mapCode2XY.put("IRIS_313-8302", new double[] { -0.0552123445316785, -0.0537440303200551 });
		mapCode2XY.put("IRIS_313-8303", new double[] { 0.0490477338791893, -2.20922286431486E-05 });
		mapCode2XY.put("IRIS_313-8305", new double[] { 0.0518395052624727, -0.0158696031043109 });
		mapCode2XY.put("IRIS_313-8306", new double[] { 0.0518594720001091, -0.0102552085597626 });
		mapCode2XY.put("IRIS_313-8312", new double[] { 0.0476503162590826, 0.0167982651381326 });
		mapCode2XY.put("IRIS_313-8314", new double[] { -0.084824404247351, 0.0143457996673847 });
		mapCode2XY.put("IRIS_313-8315", new double[] { 0.0478178279729077, 0.0154475517732378 });
		mapCode2XY.put("IRIS_313-8316", new double[] { 0.0495165889629456, 0.0182685341411064 });
		mapCode2XY.put("IRIS_313-8321", new double[] { 0.00119884461781961, -0.128752539958027 });
		mapCode2XY.put("IRIS_313-8323", new double[] { -0.0865776311586539, 0.0168286379223262 });
		mapCode2XY.put("IRIS_313-8324", new double[] { -0.00860354436191021, 0.0167557427520223 });
		mapCode2XY.put("IRIS_313-8326", new double[] { -0.0754634865763645, -0.0116567303656453 });
		mapCode2XY.put("IRIS_313-8332", new double[] { 0.0498528551014779, -0.00151714763550252 });
		mapCode2XY.put("IRIS_313-8339", new double[] { -0.090162467711745, 0.0179365268568286 });
		mapCode2XY.put("IRIS_313-8341", new double[] { 0.0548266031801173, 0.0139609549496202 });
		mapCode2XY.put("IRIS_313-8342", new double[] { 0.000195954475888841, -0.112488927490319 });
		mapCode2XY.put("IRIS_313-8349", new double[] { 0.0493067722171649, 0.000503519766126342 });
		mapCode2XY.put("IRIS_313-8356", new double[] { -0.0881958015602104, 0.0118356890696466 });
		mapCode2XY.put("IRIS_313-8368", new double[] { 0.0511143490035515, 0.0175019794902806 });
		mapCode2XY.put("IRIS_313-8380", new double[] { 0.0496868189810599, 0.0113051028422924 });
		mapCode2XY.put("IRIS_313-8381", new double[] { -0.0849791311810226, 0.0116161995646694 });
		mapCode2XY.put("IRIS_313-8382", new double[] { 0.00926812644224655, -0.0621248715891036 });
		mapCode2XY.put("IRIS_313-8383", new double[] { 0.0475552578288213, 0.014238404337524 });
		mapCode2XY.put("IRIS_313-8385", new double[] { -0.0766815213381166, -0.0131559269851522 });
		mapCode2XY.put("IRIS_313-8386", new double[] { 0.046241850613599, 0.00911471169060973 });
		mapCode2XY.put("IRIS_313-8387", new double[] { -0.090456583238527, 0.0129558518499702 });
		mapCode2XY.put("IRIS_313-8390", new double[] { -0.00797845125819062, -0.132239728186304 });
		mapCode2XY.put("IRIS_313-8391", new double[] { 0.0437498159201704, -0.000920891945521039 });
		mapCode2XY.put("IRIS_313-8392", new double[] { 0.0453265685309469, 0.0110181259860617 });
		mapCode2XY.put("IRIS_313-8398", new double[] { -0.0156218460639018, -0.149747529902713 });
		mapCode2XY.put("IRIS_313-8399", new double[] { -0.0955587928458487, 0.0181435854722551 });
		mapCode2XY.put("IRIS_313-8400", new double[] { -0.0824143958869005, 0.0183737271823878 });
		mapCode2XY.put("IRIS_313-8401", new double[] { 0.0456269603796029, 0.00995494886373869 });
		mapCode2XY.put("IRIS_313-8405", new double[] { 0.0391349775440254, 0.0142957065017996 });
		mapCode2XY.put("IRIS_313-8407", new double[] { 0.0456898474212923, 0.0205774687752232 });
		mapCode2XY.put("IRIS_313-8409", new double[] { 0.0481087951344309, 0.0151000397566589 });
		mapCode2XY.put("IRIS_313-8410", new double[] { -0.00501737817223981, -0.133949931596559 });
		mapCode2XY.put("IRIS_313-8412", new double[] { 0.0476200331499346, 0.0130898937994705 });
		mapCode2XY.put("IRIS_313-8414", new double[] { 0.032295816906027, 0.00555356021436574 });
		mapCode2XY.put("IRIS_313-8431", new double[] { -0.0908020624503509, 0.0128133892478594 });
		mapCode2XY.put("IRIS_313-8433", new double[] { 0.0526944639699298, 0.0184861341773749 });
		mapCode2XY.put("IRIS_313-8434", new double[] { -0.0886610392528442, 0.0164783412485031 });
		mapCode2XY.put("IRIS_313-8435", new double[] { 0.0508881961093104, 0.0111894782691874 });
		mapCode2XY.put("IRIS_313-8436", new double[] { -0.0791458662392819, 0.0131012359836599 });
		mapCode2XY.put("IRIS_313-8437", new double[] { 0.0539702288301274, 0.0132180272043914 });
		mapCode2XY.put("IRIS_313-8439", new double[] { -0.0847048966877597, 0.0154786790605898 });
		mapCode2XY.put("IRIS_313-8444", new double[] { -0.0938310563096011, 0.0170300060155387 });
		mapCode2XY.put("IRIS_313-8450", new double[] { 0.0484594345484308, -0.0197070939261486 });
		mapCode2XY.put("IRIS_313-8453", new double[] { 0.051632938225087, 0.00734657064323647 });
		mapCode2XY.put("IRIS_313-8454", new double[] { 0.0543609435774355, 0.0142296361112695 });
		mapCode2XY.put("IRIS_313-8457", new double[] { 0.047246474936771, 0.0143270357757336 });
		mapCode2XY.put("IRIS_313-8458", new double[] { 0.0492375238485525, 0.00312785246245893 });
		mapCode2XY.put("IRIS_313-8466", new double[] { 0.0536733700436409, 0.0189432728714859 });
		mapCode2XY.put("IRIS_313-8468", new double[] { 0.0506149414665213, 0.0177129891292986 });
		mapCode2XY.put("IRIS_313-8474", new double[] { 0.0461703709269585, 0.0162303194638536 });
		mapCode2XY.put("IRIS_313-8481", new double[] { -0.0934927225045738, 0.0168365303678695 });
		mapCode2XY.put("IRIS_313-8485", new double[] { 0.051996719108562, 0.0197497956518091 });
		mapCode2XY.put("IRIS_313-8486", new double[] { -0.0857585464840551, 0.00710432981987406 });
		mapCode2XY.put("IRIS_313-8492", new double[] { 0.0511928631006665, 0.0177797175772907 });
		mapCode2XY.put("IRIS_313-8493", new double[] { 0.0519318745531137, 0.0168271001872894 });
		mapCode2XY.put("IRIS_313-8498", new double[] { -0.0497672698664428, -0.00862025826891184 });
		mapCode2XY.put("IRIS_313-8502", new double[] { -0.0865720589635045, 0.0177879657290775 });
		mapCode2XY.put("IRIS_313-8509", new double[] { 0.0522838779432425, -0.0082767478377181 });
		mapCode2XY.put("IRIS_313-8514", new double[] { 0.0505959849747057, 0.0165372264497494 });
		mapCode2XY.put("IRIS_313-8519", new double[] { -0.0861875402199284, 0.00610113630664717 });
		mapCode2XY.put("IRIS_313-8523", new double[] { -0.0917341412391272, 0.0173320305512431 });
		mapCode2XY.put("IRIS_313-8530", new double[] { 0.0474908837369268, -0.00464589270637774 });
		mapCode2XY.put("IRIS_313-8536", new double[] { 0.0508996720537582, 0.01873767804138 });
		mapCode2XY.put("IRIS_313-8554", new double[] { -0.00946848937387918, -0.113072902095665 });
		mapCode2XY.put("IRIS_313-8557", new double[] { 0.0534742883601256, 0.0195291110673809 });
		mapCode2XY.put("IRIS_313-8559", new double[] { 0.0485184048169151, -0.00243362951314689 });
		mapCode2XY.put("IRIS_313-8565", new double[] { -0.0834280959316355, 0.0142637609802503 });
		mapCode2XY.put("IRIS_313-8567", new double[] { 0.0521733460275501, 0.0164096504262761 });
		mapCode2XY.put("IRIS_313-8568", new double[] { 0.0450236883719549, -0.0152800948525043 });
		mapCode2XY.put("IRIS_313-8571", new double[] { 0.0514102244188523, 0.0168635744658966 });
		mapCode2XY.put("IRIS_313-8572", new double[] { -0.088723320836688, 0.0132787829193728 });
		mapCode2XY.put("IRIS_313-8578", new double[] { -0.0887802888106099, 0.0130923616507586 });
		mapCode2XY.put("IRIS_313-8580", new double[] { -0.0865859113808617, 0.0125399386210504 });
		mapCode2XY.put("IRIS_313-8585", new double[] { 0.0511687340500773, 0.0126228316640934 });
		mapCode2XY.put("IRIS_313-8586", new double[] { 0.0540249223994815, 0.016239105725031 });
		mapCode2XY.put("IRIS_313-8591", new double[] { 0.0479977461972393, 0.0206460273197773 });
		mapCode2XY.put("IRIS_313-8594", new double[] { -0.0897203629826575, 0.0142466906932661 });
		mapCode2XY.put("IRIS_313-8595", new double[] { 0.0264818291235252, -0.037552050709306 });
		mapCode2XY.put("IRIS_313-8599", new double[] { -0.0899084484832749, 0.0111454148352236 });
		mapCode2XY.put("IRIS_313-8603", new double[] { 0.0466552688145341, 0.0115370681320058 });
		mapCode2XY.put("IRIS_313-8606", new double[] { 0.0469174713844056, 0.0200264422425098 });
		mapCode2XY.put("IRIS_313-8608", new double[] { 0.0529179897433436, 0.0164152945079433 });
		mapCode2XY.put("IRIS_313-8614", new double[] { 0.0521389211213322, 0.000378495342877994 });
		mapCode2XY.put("IRIS_313-8616", new double[] { 0.0551077086878628, 0.00981147930738092 });
		mapCode2XY.put("IRIS_313-8621", new double[] { 0.0514936475536687, 0.0136721090315422 });
		mapCode2XY.put("IRIS_313-8622", new double[] { 0.0426349275665864, -0.0191583986278453 });
		mapCode2XY.put("IRIS_313-8626", new double[] { -0.0870431573336838, 0.0135806886235156 });
		mapCode2XY.put("IRIS_313-8627", new double[] { -0.0922860181980757, 0.019163184706841 });
		mapCode2XY.put("IRIS_313-8631", new double[] { 0.0478016656311551, -0.00398633117657687 });
		mapCode2XY.put("IRIS_313-8632", new double[] { 0.0457140976989101, -0.00128981840923293 });
		mapCode2XY.put("IRIS_313-8637", new double[] { -0.0859700047050313, 0.00711452352700078 });
		mapCode2XY.put("IRIS_313-8638", new double[] { 0.0517664749484461, 0.0178500340680133 });
		mapCode2XY.put("IRIS_313-8641", new double[] { -0.000454210188169717, -0.125243611014817 });
		mapCode2XY.put("IRIS_313-8643", new double[] { 0.0529029601621831, 0.0176372365046505 });
		mapCode2XY.put("IRIS_313-8645", new double[] { 0.049940560866977, 0.0105986944272806 });
		mapCode2XY.put("IRIS_313-8647", new double[] { 0.0495858250156522, -0.0111964351044005 });
		mapCode2XY.put("IRIS_313-8655", new double[] { -0.00818928580513333, -0.129721045691583 });
		mapCode2XY.put("IRIS_313-8656", new double[] { -0.0685796533612342, -0.0474585741106214 });
		mapCode2XY.put("IRIS_313-8657", new double[] { 0.0460853254189688, -0.00324174421480316 });
		mapCode2XY.put("IRIS_313-8658", new double[] { -0.0929960587936387, 0.0209677272516923 });
		mapCode2XY.put("IRIS_313-8659", new double[] { 0.0507990697175471, 0.0071829814183164 });
		mapCode2XY.put("IRIS_313-8660", new double[] { 0.0504562721944705, -0.0150880183434003 });
		mapCode2XY.put("IRIS_313-8664", new double[] { -0.0815896941565373, 0.0118952822637898 });
		mapCode2XY.put("IRIS_313-8665", new double[] { -0.0958057921508972, 0.0166927470412646 });
		mapCode2XY.put("IRIS_313-8669", new double[] { -0.0873498845773389, 0.00866035831632113 });
		mapCode2XY.put("IRIS_313-8674", new double[] { 0.0542743834888926, 0.0169645546060326 });
		mapCode2XY.put("IRIS_313-8679", new double[] { 0.055097880016273, 0.0187813860603501 });
		mapCode2XY.put("IRIS_313-8681", new double[] { 0.0534218406313982, 0.0206458844853445 });
		mapCode2XY.put("IRIS_313-8683", new double[] { 0.0528014765634177, 0.00689850823151149 });
		mapCode2XY.put("IRIS_313-8687", new double[] { -0.088623436174338, 0.0169316400354657 });
		mapCode2XY.put("IRIS_313-8690", new double[] { -0.0807470766470863, 0.0135505903164579 });
		mapCode2XY.put("IRIS_313-8694", new double[] { -0.0926252146122929, 0.0172428756524052 });
		mapCode2XY.put("IRIS_313-8697", new double[] { 0.0546310885398569, 0.0180106112447541 });
		mapCode2XY.put("IRIS_313-8699", new double[] { 0.046006641331226, 0.00139729755915771 });
		mapCode2XY.put("IRIS_313-8702", new double[] { 0.0551232715491562, 0.018177752040471 });
		mapCode2XY.put("IRIS_313-8703", new double[] { 0.0533983106769127, 0.00250832420531903 });
		mapCode2XY.put("IRIS_313-8704", new double[] { 0.046031554704117, -0.0244380752337583 });
		mapCode2XY.put("IRIS_313-8712", new double[] { -0.0790970030758504, -0.0146932693898843 });
		mapCode2XY.put("IRIS_313-8713", new double[] { 0.0519448046659789, 0.016427955634026 });
		mapCode2XY.put("IRIS_313-8717", new double[] { 0.0529133286565129, -0.00335179188762589 });
		mapCode2XY.put("IRIS_313-8721", new double[] { -0.0118288622912128, -0.141444223157261 });
		mapCode2XY.put("IRIS_313-8722", new double[] { 0.0546129061251495, 0.0181526818071944 });
		mapCode2XY.put("IRIS_313-8723", new double[] { 0.0495419743157996, 0.0181762888672321 });
		mapCode2XY.put("IRIS_313-8725", new double[] { 0.0522115193755902, 0.0195505101169656 });
		mapCode2XY.put("IRIS_313-8727", new double[] { 0.0485566886876848, -0.00801925873413672 });
		mapCode2XY.put("IRIS_313-8731", new double[] { 0.0469145854900752, -0.00151339632368209 });
		mapCode2XY.put("IRIS_313-8732", new double[] { 0.0501006314125699, 0.0174108058222508 });
		mapCode2XY.put("IRIS_313-8733", new double[] { 0.0506506835989697, -0.00753346784666344 });
		mapCode2XY.put("IRIS_313-8735", new double[] { -0.0830001182368164, 0.0127367709860727 });
		mapCode2XY.put("IRIS_313-8737", new double[] { 0.0501966767612099, -0.00311236538266077 });
		mapCode2XY.put("IRIS_313-8739", new double[] { 0.0122112325992837, -0.032547774128427 });
		mapCode2XY.put("IRIS_313-8743", new double[] { 0.0477996985147755, 0.0132042173095322 });
		mapCode2XY.put("IRIS_313-8744", new double[] { 0.0494540882785475, 0.0175393201674461 });
		mapCode2XY.put("IRIS_313-8745", new double[] { -0.090741241634859, 0.0185619735239613 });
		mapCode2XY.put("IRIS_313-8747", new double[] { -0.0702468820514113, -0.0352015822115127 });
		mapCode2XY.put("IRIS_313-8751", new double[] { 0.0549919967280669, 0.0189805929442521 });
		mapCode2XY.put("IRIS_313-8754", new double[] { 0.0510995207314563, -0.0106448892720012 });
		mapCode2XY.put("IRIS_313-8755", new double[] { -0.0930959097529833, 0.016009407406861 });
		mapCode2XY.put("IRIS_313-8757", new double[] { 0.0482490962175537, -0.00617687697687608 });
		mapCode2XY.put("IRIS_313-8765", new double[] { -0.0630909473004528, -0.0218952110262859 });
		mapCode2XY.put("IRIS_313-8767", new double[] { 0.0522451418695888, 0.0184629460720562 });
		mapCode2XY.put("IRIS_313-8768", new double[] { -0.0886356866320235, 0.0169677743368254 });
		mapCode2XY.put("IRIS_313-8769", new double[] { -0.09151260849627, 0.0172015965812129 });
		mapCode2XY.put("IRIS_313-8771", new double[] { -0.00337881002607335, -0.137240878253463 });
		mapCode2XY.put("IRIS_313-8778", new double[] { -0.0900478528598473, 0.0145716563849703 });
		mapCode2XY.put("IRIS_313-8781", new double[] { 0.0379396710321609, 0.0205566933034749 });
		mapCode2XY.put("IRIS_313-8783", new double[] { 0.0252955323857517, -0.0468550505781062 });
		mapCode2XY.put("IRIS_313-8785", new double[] { 0.0559799172846638, 0.0179333031896344 });
		mapCode2XY.put("IRIS_313-8789", new double[] { -0.00723031904839978, -0.133493730813649 });
		mapCode2XY.put("IRIS_313-8791", new double[] { 0.0506498870300229, 0.0194047357157139 });
		mapCode2XY.put("IRIS_313-8793", new double[] { 0.0519625162082159, 0.0165937646204333 });
		mapCode2XY.put("IRIS_313-8796", new double[] { 0.0476958797572978, -0.00380640406077886 });
		mapCode2XY.put("IRIS_313-8803", new double[] { -0.0897450463997727, 0.0180660005071252 });
		mapCode2XY.put("IRIS_313-8811", new double[] { 0.0469996520099083, 0.0179020395349672 });
		mapCode2XY.put("IRIS_313-8812", new double[] { 0.0492489680804758, 0.0209289022671178 });
		mapCode2XY.put("IRIS_313-8813", new double[] { -0.0681763522347439, -0.0265174360832206 });
		mapCode2XY.put("IRIS_313-8814", new double[] { -0.0644186767717787, -0.0272439107975745 });
		mapCode2XY.put("IRIS_313-8815", new double[] { -0.0851053927035844, 0.00700865686734756 });
		mapCode2XY.put("IRIS_313-8822", new double[] { -0.00553271779508436, -0.0941398222376449 });
		mapCode2XY.put("IRIS_313-8831", new double[] { 0.0523561725704213, 0.0171500322375822 });
		mapCode2XY.put("IRIS_313-8833", new double[] { 0.0527167241322504, 0.0138211756272617 });
		mapCode2XY.put("IRIS_313-8844", new double[] { 0.0523375045305927, 0.00450171821317453 });
		mapCode2XY.put("IRIS_313-8846", new double[] { 0.0564926749259615, 0.00445449930681291 });
		mapCode2XY.put("IRIS_313-8850", new double[] { 0.0456009786677738, -0.0185142987547932 });
		mapCode2XY.put("IRIS_313-8854", new double[] { 0.0485792485400557, 0.0117525780297203 });
		mapCode2XY.put("IRIS_313-8856", new double[] { -0.094103948536738, 0.0169347955170613 });
		mapCode2XY.put("IRIS_313-8857", new double[] { -0.0861934074524565, 0.00712444772535088 });
		mapCode2XY.put("IRIS_313-8859", new double[] { 0.0403954670844678, 0.0120728227452953 });
		mapCode2XY.put("IRIS_313-8864", new double[] { -0.00986011765034631, -0.132399456965519 });
		mapCode2XY.put("IRIS_313-8865", new double[] { -0.081503780007336, 0.0163518659294391 });
		mapCode2XY.put("IRIS_313-8870", new double[] { 0.0541674461569148, 0.0205381441965674 });
		mapCode2XY.put("IRIS_313-8872", new double[] { -0.0482809881964033, 0.00813743561775584 });
		mapCode2XY.put("IRIS_313-8873", new double[] { -0.0367627493511844, 0.0204642728234369 });
		mapCode2XY.put("IRIS_313-8876", new double[] { -0.0908003378548549, 0.0162041296391706 });
		mapCode2XY.put("IRIS_313-8880", new double[] { 0.00488340803565218, 0.0138268972096597 });
		mapCode2XY.put("IRIS_313-8883", new double[] { -0.0803918561186237, 0.0136437979428862 });
		mapCode2XY.put("IRIS_313-8884", new double[] { -0.0882612382284283, 0.0132340080365563 });
		mapCode2XY.put("IRIS_313-8889", new double[] { 0.0433306967768489, 0.0148527797499709 });
		mapCode2XY.put("IRIS_313-8890", new double[] { -0.0958272856820482, 0.016233667554832 });
		mapCode2XY.put("IRIS_313-8894", new double[] { -0.087728793949082, 0.0155082515088902 });
		mapCode2XY.put("IRIS_313-8895", new double[] { 0.0494469471322571, 0.0211714388951174 });
		mapCode2XY.put("IRIS_313-8900", new double[] { 0.0537860323690782, -0.000498059123934698 });
		mapCode2XY.put("IRIS_313-8903", new double[] { 0.0422864366116317, 0.0165892423853671 });
		mapCode2XY.put("IRIS_313-8909", new double[] { 0.0541258897536504, 0.0179210506494057 });
		mapCode2XY.put("IRIS_313-8911", new double[] { -0.022498297571144, 0.00100438052877151 });
		mapCode2XY.put("IRIS_313-8914", new double[] { 0.0454413039293097, 0.0121091358476747 });
		mapCode2XY.put("IRIS_313-8920", new double[] { 0.051089034473034, -0.00489224186906145 });
		mapCode2XY.put("IRIS_313-8921", new double[] { 0.0490107988114003, -0.00529675362326181 });
		mapCode2XY.put("IRIS_313-8922", new double[] { 0.0397183316407833, -0.0025563425783138 });
		mapCode2XY.put("IRIS_313-8923", new double[] { -0.0907182764930773, 0.0194688596939336 });
		mapCode2XY.put("IRIS_313-8924", new double[] { 0.0505918545429286, -0.00585684550293919 });
		mapCode2XY.put("IRIS_313-8925", new double[] { 0.0439468846186835, -0.0103698764424847 });
		mapCode2XY.put("IRIS_313-8927", new double[] { -0.0893234905015679, 0.0129067481777475 });
		mapCode2XY.put("IRIS_313-8930", new double[] { 0.0461711434510329, 0.0159931759867337 });
		mapCode2XY.put("IRIS_313-8932", new double[] { 0.050599705919276, 0.0197568682023641 });
		mapCode2XY.put("IRIS_313-8935", new double[] { 0.0201366153282666, 0.0150546965346395 });
		mapCode2XY.put("IRIS_313-8940", new double[] { 0.052576357043767, 0.017372738607399 });
		mapCode2XY.put("IRIS_313-8946", new double[] { 0.0466515637811708, 0.0140709672541688 });
		mapCode2XY.put("IRIS_313-8948", new double[] { 0.0525438091026201, 0.0150291572013175 });
		mapCode2XY.put("IRIS_313-8955", new double[] { -0.084037125477321, 0.0141885817843592 });
		mapCode2XY.put("IRIS_313-8956", new double[] { 0.0442642535174304, 0.0162062898855057 });
		mapCode2XY.put("IRIS_313-8957", new double[] { 0.053565937231224, 0.000582392457661898 });
		mapCode2XY.put("IRIS_313-8960", new double[] { -0.0884767704853517, 0.0190918912627389 });
		mapCode2XY.put("IRIS_313-8963", new double[] { -0.00948290365033129, -0.143899866138647 });
		mapCode2XY.put("IRIS_313-8967", new double[] { 0.0499375642068894, 0.0113405919983303 });
		mapCode2XY.put("IRIS_313-8968", new double[] { 0.0511614252740355, -0.0175152204220615 });
		mapCode2XY.put("IRIS_313-8976", new double[] { -0.0901065513055695, 0.0191050558528038 });
		mapCode2XY.put("IRIS_313-8978", new double[] { 0.052209582514403, 0.0167607649814514 });
		mapCode2XY.put("IRIS_313-8980", new double[] { 0.054239908578873, 0.0182222675217383 });
		mapCode2XY.put("IRIS_313-8982", new double[] { 0.0464027385838897, -0.0132560470739864 });
		mapCode2XY.put("IRIS_313-8985", new double[] { 0.0566702838405485, 0.0182007358426841 });
		mapCode2XY.put("IRIS_313-8986", new double[] { 0.0408580221075941, -0.0295886502636697 });
		mapCode2XY.put("IRIS_313-8987", new double[] { 0.0480852154631866, -0.00228101756382961 });
		mapCode2XY.put("IRIS_313-8988", new double[] { 0.0557032540090705, -0.00778666749450239 });
		mapCode2XY.put("IRIS_313-8994", new double[] { 0.0516106518255702, 0.00880679877380803 });
		mapCode2XY.put("IRIS_313-8996", new double[] { 0.054840084998506, 0.0194869571781888 });
		mapCode2XY.put("IRIS_313-8998", new double[] { -0.0789743403314256, 0.00910670380567642 });
		mapCode2XY.put("IRIS_313-8999", new double[] { -0.0863095337656309, 0.00968024764352074 });
		mapCode2XY.put("IRIS_313-9002", new double[] { -0.0932696809902675, 0.0164238376384524 });
		mapCode2XY.put("IRIS_313-9005", new double[] { 0.0545134977175508, 0.0148532375683685 });
		mapCode2XY.put("IRIS_313-9006", new double[] { 0.0523730437843307, 0.0160524161872629 });
		mapCode2XY.put("IRIS_313-9017", new double[] { 0.0576956189440278, 0.0101301076501174 });
		mapCode2XY.put("IRIS_313-9019", new double[] { 0.0548019875656541, 0.0177346255369839 });
		mapCode2XY.put("IRIS_313-9020", new double[] { 0.0494002090270803, 0.0184148648749851 });
		mapCode2XY.put("IRIS_313-9023", new double[] { 0.0461525084896095, 0.00993353896311258 });
		mapCode2XY.put("IRIS_313-9032", new double[] { 0.0483577620058038, 0.0157479262802956 });
		mapCode2XY.put("IRIS_313-9039", new double[] { 0.0389501225803389, -0.00347834784652849 });
		mapCode2XY.put("IRIS_313-9044", new double[] { 0.0435568627120406, 0.012921888992424 });
		mapCode2XY.put("IRIS_313-9048", new double[] { -0.0854122649896213, 0.00681787843960249 });
		mapCode2XY.put("IRIS_313-9049", new double[] { 0.0449931437505508, -0.000321709752338353 });
		mapCode2XY.put("IRIS_313-9050", new double[] { -0.085784682411691, 0.014566550769194 });
		mapCode2XY.put("IRIS_313-9053", new double[] { -0.0826594578176994, -0.0100334329631017 });
		mapCode2XY.put("IRIS_313-9054", new double[] { 0.0554064637385597, 0.0159929746366359 });
		mapCode2XY.put("IRIS_313-9062", new double[] { 0.0496807274027808, 0.0162785791816603 });
		mapCode2XY.put("IRIS_313-9065", new double[] { 0.0492761356568327, 0.0152875462317551 });
		mapCode2XY.put("IRIS_313-9066", new double[] { 0.0185724658147361, 0.0216215895923288 });
		mapCode2XY.put("IRIS_313-9067", new double[] { 0.0469241054054983, -0.00286631672242113 });
		mapCode2XY.put("IRIS_313-9070", new double[] { 0.0527213179071451, 0.0174970587168034 });
		mapCode2XY.put("IRIS_313-9072", new double[] { 0.0540355402972652, -0.0100498495655448 });
		mapCode2XY.put("IRIS_313-9081", new double[] { -0.0911518113387664, 0.0154849825458941 });
		mapCode2XY.put("IRIS_313-9083", new double[] { -0.0734639919542785, -0.0359755765872402 });
		mapCode2XY.put("IRIS_313-9091", new double[] { 0.0406082293839704, -0.00127952010097778 });
		mapCode2XY.put("IRIS_313-9097", new double[] { 0.0523524887656497, 0.014849676573899 });
		mapCode2XY.put("IRIS_313-9098", new double[] { 0.0530686320706273, 0.016166646670219 });
		mapCode2XY.put("IRIS_313-9101", new double[] { -0.0285275589050657, 0.00928349550543101 });
		mapCode2XY.put("IRIS_313-9102", new double[] { 0.0485968796746024, 0.0168185009172695 });
		mapCode2XY.put("IRIS_313-9108", new double[] { 0.0197348329554612, -0.00248896182924952 });
		mapCode2XY.put("IRIS_313-9111", new double[] { 0.0492548058619208, 0.0101380981192906 });
		mapCode2XY.put("IRIS_313-9112", new double[] { 0.0542949541251365, 0.0199242346993001 });
		mapCode2XY.put("IRIS_313-9114", new double[] { 0.0443128886800434, 0.0078411010339888 });
		mapCode2XY.put("IRIS_313-9115", new double[] { 0.0512497144016011, 0.0216300941950508 });
		mapCode2XY.put("IRIS_313-9116", new double[] { 0.0418232631142507, 0.0203051431198346 });
		mapCode2XY.put("IRIS_313-9117", new double[] { 0.0515877358318034, 0.0149869881726286 });
		mapCode2XY.put("IRIS_313-9119", new double[] { 0.0507365865635722, 0.0206286470102236 });
		mapCode2XY.put("IRIS_313-9120", new double[] { -0.00725361556819887, -0.0153750157806856 });
		mapCode2XY.put("IRIS_313-9121", new double[] { 0.0553088191762361, -0.00694475998424523 });
		mapCode2XY.put("IRIS_313-9123", new double[] { -0.0843923935979675, 0.0127059668139964 });
		mapCode2XY.put("IRIS_313-9129", new double[] { -0.0853936105883058, 0.0131029100795681 });
		mapCode2XY.put("IRIS_313-9131", new double[] { 0.0536527605835504, 0.0147720164705241 });
		mapCode2XY.put("IRIS_313-9137", new double[] { -0.00719104779460145, -0.0929349764015316 });
		mapCode2XY.put("IRIS_313-9139", new double[] { 0.0513484872173737, -0.003470112978028 });
		mapCode2XY.put("IRIS_313-9140", new double[] { -0.0747454367351131, 0.021006154735112 });
		mapCode2XY.put("IRIS_313-9148", new double[] { 0.0465279550986067, -0.0145881596955157 });
		mapCode2XY.put("IRIS_313-9156", new double[] { 0.0530167109968224, 0.00126955835079835 });
		mapCode2XY.put("IRIS_313-9160", new double[] { 0.0542700205876584, 0.0159853716886703 });
		mapCode2XY.put("IRIS_313-9170", new double[] { -0.0736941799627753, -0.00931423652635126 });
		mapCode2XY.put("IRIS_313-9172", new double[] { -0.076405516407647, -0.0168256075926691 });
		mapCode2XY.put("IRIS_313-9174", new double[] { 0.0524292580629277, 0.00834165808722685 });
		mapCode2XY.put("IRIS_313-9176", new double[] { -0.0891219773549664, 0.0109072908425181 });
		mapCode2XY.put("IRIS_313-9182", new double[] { 0.0495631709862262, 0.00738677194097587 });
		mapCode2XY.put("IRIS_313-9184", new double[] { 0.0442126180855762, 0.0162290522435198 });
		mapCode2XY.put("IRIS_313-9187", new double[] { 0.00297563407853224, 0.00517177855680173 });
		mapCode2XY.put("IRIS_313-9188", new double[] { 0.0519092966589446, 0.0181192153311239 });
		mapCode2XY.put("IRIS_313-9190", new double[] { 0.0428669246228683, 0.00242538289076847 });
		mapCode2XY.put("IRIS_313-9193", new double[] { -0.0934548172027293, 0.0192217770273393 });
		mapCode2XY.put("IRIS_313-9197", new double[] { 0.0485928455957492, 0.0144210551884148 });
		mapCode2XY.put("IRIS_313-9198", new double[] { 0.0533450533615827, 0.0155762968658881 });
		mapCode2XY.put("IRIS_313-9201", new double[] { -0.0865244527005421, 0.0183326463334975 });
		mapCode2XY.put("IRIS_313-9204", new double[] { 0.047535436940614, 0.0128916677242466 });
		mapCode2XY.put("IRIS_313-9208", new double[] { 0.0492834664159852, 0.0159203411896507 });
		mapCode2XY.put("IRIS_313-9209", new double[] { 0.0547740878564129, 0.0173905754572719 });
		mapCode2XY.put("IRIS_313-9210", new double[] { 0.0515649594703896, 0.0164567677887046 });
		mapCode2XY.put("IRIS_313-9218", new double[] { 0.054564672189274, 0.00714607640841606 });
		mapCode2XY.put("IRIS_313-9227", new double[] { 0.0505577888494771, 0.0171171693928188 });
		mapCode2XY.put("IRIS_313-9228", new double[] { -0.0923986779781831, 0.01627340243259 });
		mapCode2XY.put("IRIS_313-9233", new double[] { -0.0929647172395229, 0.0161227569971887 });
		mapCode2XY.put("IRIS_313-9239", new double[] { -0.084440374818477, 0.0154708753654905 });
		mapCode2XY.put("IRIS_313-9242", new double[] { -0.0166138469772154, 0.0118124821817765 });
		mapCode2XY.put("IRIS_313-9243", new double[] { 0.0457881351312084, 0.0136427595694436 });
		mapCode2XY.put("IRIS_313-9249", new double[] { -0.0894226378531138, 0.0162344495872929 });
		mapCode2XY.put("IRIS_313-9251", new double[] { 0.048704249403612, 0.0176973203669648 });
		mapCode2XY.put("IRIS_313-9253", new double[] { 0.0416041454867745, 0.0157742575201212 });
		mapCode2XY.put("IRIS_313-9256", new double[] { 0.0425544169567307, -0.0218389140553448 });
		mapCode2XY.put("IRIS_313-9258", new double[] { 0.052122494589403, -0.00158810544571408 });
		mapCode2XY.put("IRIS_313-9259", new double[] { 0.0421964753805706, 0.0008382998893883 });
		mapCode2XY.put("IRIS_313-9262", new double[] { 0.0552458328895164, 0.000859249550023623 });
		mapCode2XY.put("IRIS_313-9267", new double[] { -0.0928231739748138, 0.0186282328738775 });
		mapCode2XY.put("IRIS_313-9271", new double[] { 0.055249896026468, -0.00207240671940498 });
		mapCode2XY.put("IRIS_313-9273", new double[] { 0.0499465741319013, 0.0162489551242656 });
		mapCode2XY.put("IRIS_313-9281", new double[] { 0.0545864185825644, 0.0191820515272064 });
		mapCode2XY.put("IRIS_313-9283", new double[] { -0.010087193608432, -0.139575916224265 });
		mapCode2XY.put("IRIS_313-9285", new double[] { 0.0523988450405274, 0.0119736614835782 });
		mapCode2XY.put("IRIS_313-9286", new double[] { 0.0543377396319483, 0.0221327534532415 });
		mapCode2XY.put("IRIS_313-9287", new double[] { 0.0525462897796434, -0.000991938671170625 });
		mapCode2XY.put("IRIS_313-9288", new double[] { 0.0541052162988039, 0.0176532894517289 });
		mapCode2XY.put("IRIS_313-9294", new double[] { 0.0475651153386078, 0.00307953612983153 });
		mapCode2XY.put("IRIS_313-9297", new double[] { -0.0876710223924354, 0.0174356112427548 });
		mapCode2XY.put("IRIS_313-9301", new double[] { -0.0761808474903291, 0.0132383516389621 });
		mapCode2XY.put("IRIS_313-9302", new double[] { 0.0549890822986989, 0.0172407287641484 });
		mapCode2XY.put("IRIS_313-9310", new double[] { 0.0539792214173079, 0.0152470315407827 });
		mapCode2XY.put("IRIS_313-9313", new double[] { 0.0374256127777342, -0.0337170290469561 });
		mapCode2XY.put("IRIS_313-9314", new double[] { 0.0537015355315197, 0.0205339799084514 });
		mapCode2XY.put("IRIS_313-9317", new double[] { 0.0494662273752916, 0.0144929165779506 });
		mapCode2XY.put("IRIS_313-9320", new double[] { 0.051518458123494, 0.0185997264596442 });
		mapCode2XY.put("IRIS_313-9324", new double[] { 0.0516184825347792, 0.0151364549715311 });
		mapCode2XY.put("IRIS_313-9325", new double[] { 0.0531734545002392, 0.0140522680095296 });
		mapCode2XY.put("IRIS_313-9329", new double[] { 0.050438783321116, 0.0193427997048394 });
		mapCode2XY.put("IRIS_313-9342", new double[] { 0.0579715561483213, 0.0170874890748912 });
		mapCode2XY.put("IRIS_313-9346", new double[] { -0.0937906654928125, 0.01710218228537 });
		mapCode2XY.put("IRIS_313-9347", new double[] { 0.0467920081623331, 0.0073922451287991 });
		mapCode2XY.put("IRIS_313-9348", new double[] { 0.0401078231065112, -0.00135439813774406 });
		mapCode2XY.put("IRIS_313-9351", new double[] { 0.044830810920926, -0.0100780390711161 });
		mapCode2XY.put("IRIS_313-9357", new double[] { 0.0564208804825582, 0.0184229529724666 });
		mapCode2XY.put("IRIS_313-9360", new double[] { 0.0539209046375503, -0.000915145774199614 });
		mapCode2XY.put("IRIS_313-9363", new double[] { -0.0855454054273124, 0.0182333757508502 });
		mapCode2XY.put("IRIS_313-9366", new double[] { -0.0961996225751164, 0.0199299444790357 });
		mapCode2XY.put("IRIS_313-9368", new double[] { -0.00409839268811195, -0.138669819954866 });
		mapCode2XY.put("IRIS_313-9372", new double[] { 0.0505630461835088, 0.0118011919767987 });
		mapCode2XY.put("IRIS_313-9375", new double[] { -0.0867106728174457, 0.0160087920355834 });
		mapCode2XY.put("IRIS_313-9379", new double[] { -0.0927049790544949, 0.0131870791316403 });
		mapCode2XY.put("IRIS_313-9384", new double[] { 0.0481576869111324, -0.0138051700265032 });
		mapCode2XY.put("IRIS_313-9388", new double[] { 0.0280124743143447, -0.0500692832093571 });
		mapCode2XY.put("IRIS_313-9389", new double[] { -0.0896990049548602, 0.0145634617985428 });
		mapCode2XY.put("IRIS_313-9391", new double[] { 0.0529443771459197, 0.00952688458301241 });
		mapCode2XY.put("IRIS_313-9392", new double[] { -0.0317565994648833, 0.00586117898023741 });
		mapCode2XY.put("IRIS_313-9397", new double[] { 0.0490788806117154, 0.00232075311321685 });
		mapCode2XY.put("IRIS_313-9400", new double[] { 0.0104126542565565, -0.00158336468899523 });
		mapCode2XY.put("IRIS_313-9402", new double[] { 0.0547145942508209, 0.0089754993738779 });
		mapCode2XY.put("IRIS_313-9403", new double[] { 0.0500262368980322, -0.0267953547730999 });
		mapCode2XY.put("IRIS_313-9404", new double[] { -0.0239377554653214, 0.00927745420180712 });
		mapCode2XY.put("IRIS_313-9405", new double[] { -0.0861246411742796, 0.0130689367178784 });
		mapCode2XY.put("IRIS_313-9406", new double[] { 0.0562491437514497, 0.0169799353230064 });
		mapCode2XY.put("IRIS_313-9409", new double[] { 0.0493633358091166, 0.0161082580236772 });
		mapCode2XY.put("IRIS_313-9410", new double[] { -0.0946096010884328, 0.0170978959083229 });
		mapCode2XY.put("IRIS_313-9415", new double[] { 0.0564689567752108, 0.0145809617159373 });
		mapCode2XY.put("IRIS_313-9422", new double[] { -0.00573717987081971, -0.140073901312315 });
		mapCode2XY.put("IRIS_313-9423", new double[] { -0.0889167420423344, 0.013026299283946 });
		mapCode2XY.put("IRIS_313-9424", new double[] { 0.0529331974594799, 0.00893110093613295 });
		mapCode2XY.put("IRIS_313-9427", new double[] { 0.0530519474432415, 0.0109902909598271 });
		mapCode2XY.put("IRIS_313-9429", new double[] { 0.0499454897307449, 0.0147569714709853 });
		mapCode2XY.put("IRIS_313-9433", new double[] { 0.0519234667943314, 0.00879807832963728 });
		mapCode2XY.put("IRIS_313-9438", new double[] { -0.0803355482001099, 0.017092446103078 });
		mapCode2XY.put("IRIS_313-9445", new double[] { -0.0706382304843105, -0.015083356001155 });
		mapCode2XY.put("IRIS_313-9449", new double[] { -0.0050305852178372, -0.129829460075093 });
		mapCode2XY.put("IRIS_313-9451", new double[] { 0.0477753619589549, 0.0102415689077647 });
		mapCode2XY.put("IRIS_313-9452", new double[] { -0.0922303594472339, 0.0182489770451452 });
		mapCode2XY.put("IRIS_313-9461", new double[] { 0.0507420718715318, 0.0103703729716108 });
		mapCode2XY.put("IRIS_313-9463", new double[] { -0.0951010818137972, 0.0166303966127057 });
		mapCode2XY.put("IRIS_313-9464", new double[] { -0.00761318874027044, 0.0142458110433273 });
		mapCode2XY.put("IRIS_313-9468", new double[] { -0.0912444812623928, 0.0168671907937829 });
		mapCode2XY.put("IRIS_313-9469", new double[] { 0.0504844979810434, 0.0151615556566087 });
		mapCode2XY.put("IRIS_313-9470", new double[] { -0.0847448437770659, 0.0154387857574057 });
		mapCode2XY.put("IRIS_313-9472", new double[] { 0.0523481004282386, 0.00470216445911747 });
		mapCode2XY.put("IRIS_313-9482", new double[] { 0.0464048457027302, 0.012790993714708 });
		mapCode2XY.put("IRIS_313-9484", new double[] { 0.0501777930315639, 0.00682099155569513 });
		mapCode2XY.put("IRIS_313-9491", new double[] { -0.089618023080179, 0.0195907726513155 });
		mapCode2XY.put("IRIS_313-9492", new double[] { 0.0526672674756081, -0.00774771750675793 });
		mapCode2XY.put("IRIS_313-9503", new double[] { 0.0456988839197781, 0.0141623485434414 });
		mapCode2XY.put("IRIS_313-9505", new double[] { 0.0506828968310262, 0.0123565401165552 });
		mapCode2XY.put("IRIS_313-9506", new double[] { -0.0120236208856199, 0.000652217283239598 });
		mapCode2XY.put("IRIS_313-9516", new double[] { 0.0253090884547242, -0.0266890298168806 });
		mapCode2XY.put("IRIS_313-9519", new double[] { -0.0906593563967987, 0.0197033712200416 });
		mapCode2XY.put("IRIS_313-9522", new double[] { 0.0431375839748472, 0.00808121905543011 });
		mapCode2XY.put("IRIS_313-9523", new double[] { -0.0896070659999395, 0.0155192415640581 });
		mapCode2XY.put("IRIS_313-9529", new double[] { -0.0842933038304725, 0.00651529423474927 });
		mapCode2XY.put("IRIS_313-9533", new double[] { 0.0535869860325647, 0.0150738484649726 });
		mapCode2XY.put("IRIS_313-9539", new double[] { -0.0963281452445909, 0.0164308298218126 });
		mapCode2XY.put("IRIS_313-9547", new double[] { 0.0541581155703784, -0.00243987531317358 });
		mapCode2XY.put("IRIS_313-9550", new double[] { -0.0883910418333826, 0.0182551215551086 });
		mapCode2XY.put("IRIS_313-9551", new double[] { 0.054753162285768, -0.00300025868291947 });
		mapCode2XY.put("IRIS_313-9555", new double[] { 0.0521825760119688, 0.0122774362771376 });
		mapCode2XY.put("IRIS_313-9557", new double[] { 0.0446244729390485, -0.00923210732908803 });
		mapCode2XY.put("IRIS_313-9558", new double[] { -0.0842657947796045, 0.0158463402257003 });
		mapCode2XY.put("IRIS_313-9560", new double[] { 0.0512750668125074, 0.0134914156083332 });
		mapCode2XY.put("IRIS_313-9566", new double[] { 0.052325227976105, 0.00748410761134572 });
		mapCode2XY.put("IRIS_313-9567", new double[] { 0.0532199839677473, 0.0187348822598275 });
		mapCode2XY.put("IRIS_313-9568", new double[] { -0.0826937099720685, 0.0115186289349051 });
		mapCode2XY.put("IRIS_313-9570", new double[] { 0.0444150598652055, 0.0160160406944144 });
		mapCode2XY.put("IRIS_313-9572", new double[] { 0.0393511389073035, -0.0283527082634913 });
		mapCode2XY.put("IRIS_313-9574", new double[] { 0.0542479716583372, 0.0139421328271789 });
		mapCode2XY.put("IRIS_313-9575", new double[] { 0.0474625721235399, 0.018748551794191 });
		mapCode2XY.put("IRIS_313-9582", new double[] { 0.0501387719705841, 0.0172247636521161 });
		mapCode2XY.put("IRIS_313-9590", new double[] { 0.0416930003892563, 0.0169895806938181 });
		mapCode2XY.put("IRIS_313-9593", new double[] { 0.0547393482178406, 0.0107920178869296 });
		mapCode2XY.put("IRIS_313-9594", new double[] { 0.0543953280088688, 0.0130829208502708 });
		mapCode2XY.put("IRIS_313-9600", new double[] { -0.00205418794404515, 0.0148437183157112 });
		mapCode2XY.put("IRIS_313-9601", new double[] { -0.0698857012024442, -0.036384236577657 });
		mapCode2XY.put("IRIS_313-9602", new double[] { 0.051561592580387, 0.0130540059228869 });
		mapCode2XY.put("IRIS_313-9604", new double[] { 0.0468521541643657, 0.00557267447851903 });
		mapCode2XY.put("IRIS_313-9605", new double[] { 0.0529576025320825, 0.014727197304842 });
		mapCode2XY.put("IRIS_313-9606", new double[] { 0.0542377062017655, 0.00695153606331221 });
		mapCode2XY.put("IRIS_313-9609", new double[] { 0.0471757086310824, 0.00533872909623709 });
		mapCode2XY.put("IRIS_313-9610", new double[] { -0.0129501248125554, -0.135510652035411 });
		mapCode2XY.put("IRIS_313-9611", new double[] { 0.0514350481456707, -0.000576953329986985 });
		mapCode2XY.put("IRIS_313-9616", new double[] { -0.087908881348295, 0.013546595929357 });
		mapCode2XY.put("IRIS_313-9617", new double[] { 0.0492459163006802, -0.000862051506169799 });
		mapCode2XY.put("IRIS_313-9619", new double[] { 0.0521564028313299, 0.00746303149397854 });
		mapCode2XY.put("IRIS_313-9623", new double[] { 0.0516991139940104, 0.0112480154769166 });
		mapCode2XY.put("IRIS_313-9626", new double[] { -0.00713045091521869, -0.149314470051274 });
		mapCode2XY.put("IRIS_313-9629", new double[] { -0.0726912071052579, -0.0291305855730992 });
		mapCode2XY.put("IRIS_313-9634", new double[] { 0.0464876550113394, 0.00544750471385002 });
		mapCode2XY.put("IRIS_313-9636", new double[] { -0.0310609902652206, -0.123974389105179 });
		mapCode2XY.put("IRIS_313-9637", new double[] { 0.0411297077012073, 0.00680004015858672 });
		mapCode2XY.put("IRIS_313-9641", new double[] { -0.0129894386456664, -0.121458908393838 });
		mapCode2XY.put("IRIS_313-9648", new double[] { -0.0146486206013812, -0.0138923936004176 });
		mapCode2XY.put("IRIS_313-9661", new double[] { -0.00378200389856241, -0.137343255923818 });
		mapCode2XY.put("IRIS_313-9669", new double[] { 0.05194638475046, 0.0168916758479996 });
		mapCode2XY.put("IRIS_313-9682", new double[] { -0.0701020586960316, -0.0117612209242734 });
		mapCode2XY.put("IRIS_313-9685", new double[] { 0.0426887158007824, 0.0119898968111392 });
		mapCode2XY.put("IRIS_313-9687", new double[] { 0.0532675870192387, 0.00915343102587961 });
		mapCode2XY.put("IRIS_313-9691", new double[] { -0.0823004752556026, 0.0140357881116317 });
		mapCode2XY.put("IRIS_313-9694", new double[] { 0.0503510404221338, 0.0193129156891611 });
		mapCode2XY.put("IRIS_313-9695", new double[] { 0.0196524925566293, -0.085983938397633 });
		mapCode2XY.put("IRIS_313-9696", new double[] { 0.0541046054978193, 0.0121787752311679 });
		mapCode2XY.put("IRIS_313-9697", new double[] { 0.0529116978491016, 0.0137590376160936 });
		mapCode2XY.put("IRIS_313-9698", new double[] { -0.0926703888042075, 0.0158758602441813 });
		mapCode2XY.put("IRIS_313-9699", new double[] { 0.0523181810298808, 0.0175141653151308 });
		mapCode2XY.put("IRIS_313-9701", new double[] { -0.0935082979626442, 0.0166681387840997 });
		mapCode2XY.put("IRIS_313-9702", new double[] { -0.0903206808088558, 0.0166025020692997 });
		mapCode2XY.put("IRIS_313-9703", new double[] { -0.0932081143188751, 0.0178544185000511 });
		mapCode2XY.put("IRIS_313-9705", new double[] { 0.0508669412376203, 0.0166973585809426 });
		mapCode2XY.put("IRIS_313-9706", new double[] { 0.0494257422107378, 0.0164534014448071 });
		mapCode2XY.put("IRIS_313-9708", new double[] { 0.0483659457232667, 0.0161561145883915 });
		mapCode2XY.put("IRIS_313-9709", new double[] { 0.0535007307441838, -0.00358812236742503 });
		mapCode2XY.put("IRIS_313-9723", new double[] { 0.0475597183611459, 0.0116721734908365 });
		mapCode2XY.put("IRIS_313-9724", new double[] { -0.090025127092867, 0.0168216092656727 });
		mapCode2XY.put("IRIS_313-9725", new double[] { -0.0892766576947027, 0.0161087141124596 });
		mapCode2XY.put("IRIS_313-9727", new double[] { 0.0314188479870939, -0.0347908410943621 });
		mapCode2XY.put("IRIS_313-9730", new double[] { 0.0504267282898228, 0.0110904656767066 });
		mapCode2XY.put("IRIS_313-9732", new double[] { 0.0424523234834215, -0.0339759262177974 });
		mapCode2XY.put("IRIS_313-9740", new double[] { 0.0136155136419143, -0.0365427419262993 });
		mapCode2XY.put("IRIS_313-9742", new double[] { -0.0938893327031213, 0.0162201020661118 });
		mapCode2XY.put("IRIS_313-9745", new double[] { -0.0921744427781206, 0.019425401098589 });
		mapCode2XY.put("IRIS_313-9758", new double[] { 0.048425466223881, 0.014215037696041 });
		mapCode2XY.put("IRIS_313-9759", new double[] { -0.0950749895874415, 0.0179607347400169 });
		mapCode2XY.put("IRIS_313-9767", new double[] { 0.0170283595038887, 0.0229376670979944 });
		mapCode2XY.put("IRIS_313-9769", new double[] { -0.0955949624575519, 0.016620617570741 });
		mapCode2XY.put("IRIS_313-9770", new double[] { -0.0929636432737217, 0.0190733486790125 });
		mapCode2XY.put("IRIS_313-9771", new double[] { -0.0938912927929229, 0.0169368904672022 });
		mapCode2XY.put("IRIS_313-9774", new double[] { -0.0910748271158482, 0.0163683530958205 });
		mapCode2XY.put("IRIS_313-9778", new double[] { 0.0237900341162028, -0.0730532726522661 });
		mapCode2XY.put("IRIS_313-9782", new double[] { -0.0939999614754756, 0.0163698811539756 });
		mapCode2XY.put("IRIS_313-9783", new double[] { -0.0439792003906993, -0.0932903358879563 });
		mapCode2XY.put("IRIS_313-9789", new double[] { -0.0813372685828244, 0.0195489354263167 });
		mapCode2XY.put("IRIS_313-9790", new double[] { -0.092139520356121, 0.0178367977186246 });
		mapCode2XY.put("IRIS_313-9791", new double[] { 0.0486785373041399, 0.00185855940799427 });
		mapCode2XY.put("IRIS_313-9795", new double[] { 0.0349674859905687, 0.00343694363652308 });
		mapCode2XY.put("IRIS_313-9800", new double[] { -0.0833246644125093, 0.0187079160012986 });
		mapCode2XY.put("IRIS_313-9809", new double[] { 0.0555707946985819, 0.0144023213850982 });
		mapCode2XY.put("IRIS_313-9811", new double[] { -0.096752365448673, 0.016974387921678 });
		mapCode2XY.put("IRIS_313-9813", new double[] { -0.093924487338223, 0.0146641702529506 });
		mapCode2XY.put("IRIS_313-9814", new double[] { -0.0920639153599874, 0.0151742532448537 });
		mapCode2XY.put("IRIS_313-9817", new double[] { -0.00178291382400486, -0.00866478258001017 });
		mapCode2XY.put("IRIS_313-9818", new double[] { -0.0156252088504859, 0.0190179165114486 });
		mapCode2XY.put("IRIS_313-9822", new double[] { 0.0507458149094393, 0.0116436717673268 });
		mapCode2XY.put("IRIS_313-9825", new double[] { 0.0428174263437505, -0.00217242035779932 });
		mapCode2XY.put("IRIS_313-9831", new double[] { 0.0432876234653206, -0.00887458757560703 });
		mapCode2XY.put("IRIS_313-9832", new double[] { 0.0424067288237005, -0.00162907418251451 });
		mapCode2XY.put("IRIS_313-9838", new double[] { -0.0925770599871154, 0.0137984832050986 });
		mapCode2XY.put("IRIS_313-9839", new double[] { -0.0954864759035234, 0.0168230169750417 });
		mapCode2XY.put("IRIS_313-9841", new double[] { 0.0125938813001781, 0.0098795230892984 });
		mapCode2XY.put("IRIS_313-9851", new double[] { -0.0891042669396768, 0.0163535155717339 });
		mapCode2XY.put("IRIS_313-9861", new double[] { -0.0105845428491243, -0.131681040638623 });
		mapCode2XY.put("IRIS_313-9862", new double[] { 0.0479053747441766, -0.0152558913139867 });
		mapCode2XY.put("IRIS_313-9867", new double[] { 0.0550109789479454, 0.0125835282005399 });
		mapCode2XY.put("IRIS_313-9880", new double[] { -0.0953903640929255, 0.0137090124623936 });
		mapCode2XY.put("IRIS_313-9882", new double[] { 0.0495465142672716, 0.0107316066901465 });
		mapCode2XY.put("IRIS_313-9884", new double[] { -0.0921707088259466, 0.0157306133113993 });
		mapCode2XY.put("IRIS_313-9886", new double[] { -0.0922672506906303, 0.0138544938590923 });
		mapCode2XY.put("IRIS_313-9887", new double[] { -0.0917125044747066, 0.0126864477324039 });
		mapCode2XY.put("IRIS_313-9890", new double[] { -0.0926857459092952, 0.0127190546579875 });
		mapCode2XY.put("IRIS_313-9891", new double[] { -0.0931303685529305, 0.0166764449166256 });
		mapCode2XY.put("IRIS_313-9897", new double[] { -0.0914790773106609, 0.013170680647021 });
		mapCode2XY.put("IRIS_313-9898", new double[] { 0.0523871261625491, 0.0194709490345998 });
		mapCode2XY.put("IRIS_313-9917", new double[] { 0.0529075214174818, 0.00627908166829545 });
		mapCode2XY.put("IRIS_313-9922", new double[] { 0.0433474724886874, 0.0182099362180669 });
		mapCode2XY.put("IRIS_313-9924", new double[] { 0.0539967758276704, 0.0181843036016636 });
		mapCode2XY.put("IRIS_313-9925", new double[] { 0.0437180557834643, 0.00713079439884992 });
		mapCode2XY.put("IRIS_313-9926", new double[] { 0.0501234772475035, 0.00317229531984204 });
		mapCode2XY.put("IRIS_313-9928", new double[] { -0.0824022431262877, 0.0153905969977066 });
		mapCode2XY.put("IRIS_313-9929", new double[] { -0.0862690375554626, 0.0153906395069758 });
		mapCode2XY.put("IRIS_313-9935", new double[] { 0.0495676877774842, -0.0034296395830857 });
		mapCode2XY.put("IRIS_313-9936", new double[] { 0.0561984589063515, 0.0118743221752418 });
		mapCode2XY.put("IRIS_313-9937", new double[] { -0.0974826347865878, 0.0192311321900604 });
		mapCode2XY.put("IRIS_313-9939", new double[] { -0.0108755969542372, 0.014294146956537 });
		mapCode2XY.put("IRIS_313-9940", new double[] { 0.0515865119933875, 0.0173094846371076 });
		mapCode2XY.put("IRIS_313-9944", new double[] { 0.0479151362952291, -0.00916359590216789 });
		mapCode2XY.put("IRIS_313-9949", new double[] { -0.0840930965336604, -0.00456182840378257 });
		mapCode2XY.put("IRIS_313-9953", new double[] { 0.0539534280605718, 0.0205694987988583 });
		mapCode2XY.put("IRIS_313-9961", new double[] { -0.0950414239408162, 0.0152325325897821 });
		mapCode2XY.put("IRIS_313-9963", new double[] { -0.00865545764427005, -0.144537564465105 });
		mapCode2XY.put("IRIS_313-9964", new double[] { -0.0949613146860856, 0.0136673779292261 });
		mapCode2XY.put("IRIS_313-9966", new double[] { 0.0543896797872315, 0.017536500104379 });
		mapCode2XY.put("IRIS_313-9968", new double[] { 0.0535217951129644, 0.00664000398937276 });
		mapCode2XY.put("IRIS_313-9969", new double[] { 0.0491347800521702, 0.00867417695113238 });
		mapCode2XY.put("IRIS_313-9970", new double[] { 0.0533992086484688, -0.0116951183577217 });
		mapCode2XY.put("IRIS_313-9974", new double[] { -0.0917032919215688, 0.0144529230365927 });
		mapCode2XY.put("IRIS_313-9976", new double[] { 0.0514365248290521, 0.016633308096456 });
		mapCode2XY.put("IRIS_313-9978", new double[] { -0.0749390799695257, -0.0345332922805082 });
		mapCode2XY.put("IRIS_313-9980", new double[] { -0.0960958411917078, 0.0203761195097488 });
		mapCode2XY.put("IRIS_313-9986", new double[] { 0.0518042020981134, 0.008089309997264 });
		mapCode2XY.put("IRIS_313-9989", new double[] { 0.0543840298794441, 0.0183535624471935 });
		mapCode2XY.put("IRIS_313-9995", new double[] { -0.0809561120656294, 0.0196267913473372 });
		mapCode2XY.put("IRIS_313-9996", new double[] { -0.0912173753419508, 0.0170567607090861 });

		return mapCode2XY;
	}

	/*
	 * public static String get3kCoreNewick() { return
	 * "((((((((((((((((((((((((((((((((((((((((CX344:0.0150713,CX47:0.0162126):0.0024064,(CX391:2.43E-5,CX345:0.0010071):0.018826):0.0052156,(CX306:0.0228525,IRIS_313-11702:0.0250241):1.942E-4):9.887E-4,(((((((((((((((CX396:0.0091293,B004:0.0080465):0.001382,(CX329:-1.0E-6,CX330:7.08E-5):0.0104199):0.0018931,((B169:0.0078611,IRIS_313-10437:0.0067567):0.0027342,IRIS_313-11689:0.0097819):0.0021088):0.0018255,(B269:0.0134417,(IRIS_313-15904:0.0136936,(IRIS_313-10057:0.0114472,IRIS_313-10093:0.0090202):0.0020525):0.0013838):5.086E-4):9.026E-4,((CX116:0.0132228,(((IRIS_313-11201:0.0142993,IRIS_313-10677:0.0049408):0.002937,IRIS_313-8087:0.0091655):0.0015758,(B183:8.84E-5,B046:1.381E-4):0.01087):0.0018322):7.604E-4,((IRIS_313-10379:0.0089699,IRIS_313-10373:0.0081867):0.0028649,IRIS_313-8218:0.0114929):0.0016258):8.337E-4):0.0011904,(B236:0.0147005,B235:0.0146774):6.196E-4):2.591E-4,B001:0.010504):0.0012478,((CX212:0.0128919,CX165:0.0122094):0.0020964,(((CX140:0.005979,IRIS_313-10642:0.0061919):0.0040186,IRIS_313-9996:0.0111946):0.0020368,IRIS_313-10059:0.0143125):0.002514):6.443E-4):3.184E-4,(B122:0.0139622,IRIS_313-8217:0.0136831):0.0024134):0.0019239,(CX534:0.0110399,(((CX14:0.0116084,B154:0.0090872):0.0048567,B045:0.0166695):0.0012572,((((B263:0.0129841,IRIS_313-10469:0.0112784):0.0017857,IRIS_313-10430:0.0128323):0.0014342,B008:0.0127814):0.0018478,IRIS_313-8162:0.0159849):0.0015624):6.332E-4):5.122E-4):9.196E-4,(IRIS_313-11246:0.0213962,IRIS_313-11890:0.0185186):0.0014757):9.688E-4,IRIS_313-9438:0.0180293):0.0015593,(((IRIS_313-10570:0.0139856,IRIS_313-11931:0.0139541):0.0024189,IRIS_313-11875:0.019228):0.004059,IRIS_313-11654:0.0212047):0.0018282):6.143E-4,(((((CX356:0.0024415,CX251:0.0024227):0.0157169,CX16:0.0168525):0.0023608,((CX211:0.0157918,IRIS_313-11202:0.0171514):0.0027088,((B057:0.015386,(IRIS_313-11800:0.0146324,IRIS_313-9468:0.0143062):0.0012755):0.0021131,IRIS_313-11586:0.0181381):0.0013676):9.018E-4):5.876E-4,B240:0.0213447):0.0010154,((CX380:0.0103026,CX350:0.010981):0.0010535,CX397:0.0129787):0.0078082):0.0010081):6.218E-4,((((((((((IRIS_313-10839:0.0087916,(B160:6.02E-5,B005:1.663E-4):0.0080923):0.0034028,IRIS_313-9228:0.0106767):0.0020624,IRIS_313-9698:0.0145434):0.0025655,(((((B171:0.0112861,(IRIS_313-10564:0.0112636,((IRIS_313-11981:0.0020565,(IRIS_313-9701:9.75E-4,IRIS_313-11672:5.181E-4):0.0011226):0.0073756,IRIS_313-9703:0.0101651):0.0010036):0.0015834):0.0017287,IRIS_313-8481:0.0135698):7.188E-4,((B002:0.0086378,IRIS_313-9002:0.0110581):0.0015055,(IRIS_313-10568:0.0075432,IRIS_313-11725:0.0068296):0.0045571):0.0015458):0.0011403,(((((IRIS_313-10618:-1.87E-5,IRIS_313-9463:9.24E-5):0.0036255,IRIS_313-10569:0.0036793):0.0015158,IRIS_313-9782:0.0049143):0.0013601,IRIS_313-9771:0.0067753):0.005963,IRIS_313-10164:0.0144914):0.0016709):4.879E-4,(((IRIS_313-10631:-1.95E-4,IRIS_313-9346:3.044E-4):5.558E-4,IRIS_313-10429:5.86E-4):0.0124336,IRIS_313-9702:0.0107523):0.0036985):0.001313):9.081E-4,IRIS_313-9884:0.0160989):7.428E-4,IRIS_313-10092:0.0169169):4.371E-4,IRIS_313-9891:0.018253):6.118E-4,IRIS_313-9081:0.0173722):0.0020331,(((B182:0.0137449,IRIS_313-8148:0.0135062):0.0035233,(B166:0.0161571,B167:0.0116423):0.0038258):0.0018494,(B250:0.0075196,IRIS_313-9838:0.0119781):0.0071408):0.0025551):3.989E-4,IRIS_313-12054:0.0224765):0.0019374):3.111E-4):4.732E-4,(IRIS_313-11653:0.0179375,IRIS_313-11651:0.0152703):0.0070774):8.992E-4,CX56:0.0229976):8.767E-4,B218:0.0201836):0.0024675,(IRIS_313-11155:0.0279459,IRIS_313-10916:0.0266424):0.0018512):9.673E-4,(CX58:0.0163339,B038:0.0043771):0.0107817):0.0015755,IRIS_313-9774:0.0285041):5.805E-4,(((((((((((CX78:-0.0043277,IRIS_313-8444:0.0046597):0.0068269,((IRIS_313-8665:0.0020753,IRIS_313-9539:0.00264):0.0056163,(IRIS_313-8856:2.641E-4,IRIS_313-8105:5.565E-4):0.0072661):0.0037294):4.2E-4,IRIS_313-8164:0.0103971):0.0042398,IRIS_313-8502:0.0139503):0.0030699,(((((CX74:3.54E-5,IRIS_313-11829:6.95E-5):0.0023876,(IRIS_313-8755:-0.0011123,IRIS_313-9233:0.0012245):0.0033929):0.0039744,IRIS_313-10567:0.0061622):0.0019649,IRIS_313-9410:0.008866):0.006879,IRIS_313-8204:0.0164643):0.0016168):0.0010931,B055:0.0140694):0.0025826,IRIS_313-8177:0.0246305):0.0012557,IRIS_313-8097:0.0231632):0.004248,(((((IRIS_313-11198:0.0224656,((IRIS_313-8125:0.0148783,(IRIS_313-8111:0.01125,IRIS_313-8129:0.0116115):0.0023469):0.003972,(IRIS_313-8135:0.0156229,IRIS_313-8112:0.0165639):0.0017624):0.0027017):0.0026306,((B034:3.377E-4,IRIS_313-8165:0.0133382):0.0030651,IRIS_313-9839:0.0169878):0.0038368):0.0017767,(((((B170:0.0068116,B014:-0.0066145):0.0109562,IRIS_313-8140:0.0170392):5.081E-4,IRIS_313-9790:0.0183635):0.0013991,IRIS_313-8399:0.0201214):0.0014877,(IRIS_313-8126:0.0200051,IRIS_313-8132:0.0176242):0.0027618):9.509E-4):0.001102,IRIS_313-9769:0.02396):0.0036906,IRIS_313-8151:0.0263328):0.0022752):7.49E-4,((((IRIS_313-10967:0.0202185,IRIS_313-8141:0.0197681):0.0022512,(IRIS_313-9980:0.0059479,IRIS_313-9366:0.0064134):0.0167507):0.0050379,IRIS_313-8127:-0.0017292):0.0022759,(IRIS_313-8084:0.0222475,IRIS_313-10083:0.0241114):0.0057499):0.0010952):0.0014344,(((((((((((((((((CX142:0.0065783,IRIS_313-8024:0.0049302):0.0045251,IRIS_313-8052:0.0099071):0.0038054,IRIS_313-8167:0.0145297):0.0010404,IRIS_313-8216:0.0150356):0.0019587,IRIS_313-8096:0.0152316):0.0021762,IRIS_313-8114:0.0180501):0.0024963,(IRIS_313-8032:0.0021032,(IRIS_313-8048:0.0012341,IRIS_313-8031:0.0016962):0.0107623):0.0097166):0.0010665,IRIS_313-8029:0.023354):4.323E-4,((IRIS_313-8195:0.0150277,IRIS_313-8155:0.0159498):0.0042942,(IRIS_313-8099:0.0077566,IRIS_313-8039:0.0075948):0.0119147):0.0024555):7.879E-4,(IRIS_313-8168:0.0185142,IRIS_313-8166:0.0197125):0.0054905):0.0020554,(IRIS_313-8115:1.07E-5,IRIS_313-8143:1.99E-4):0.0242373):5.417E-4,((IRIS_313-9193:0.0217241,(IRIS_313-8124:0.0191179,IRIS_313-8142:0.0192267):0.0024991):0.0044501,(IRIS_313-10119:0.0167347,IRIS_313-10111:0.0169205):0.0071115):0.0012079):0.0019101,((IRIS_313-8027:0.0069584,(IRIS_313-8053:0.0082299,IRIS_313-8049:0.0075159):0.0052722):0.0138794,(IRIS_313-8025:0.0120348,IRIS_313-9937:0.0127785):0.0128488):9.765E-4):0.0019415,((((((IRIS_313-9770:0.0178047,IRIS_313-11661:0.0142604):0.0032184,(IRIS_313-8075:0.0147434,(IRIS_313-8023:0.0112084,IRIS_313-10014:0.0110655):0.0052935):0.0039268):0.0031488,IRIS_313-8134:0.0222053):0.0012349,(((IRIS_313-9759:0.0014561,IRIS_313-8149:0.002362):0.0178544,((IRIS_313-8090:0.0112146,IRIS_313-8095:0.0110056):0.0014925,(IRIS_313-8085:0.0071242,IRIS_313-10084:0.0075673):0.0059046):0.006903):0.0030083,IRIS_313-8119:0.0195881):6.903E-4):0.001301,(IRIS_313-8138:0.0207444,IRIS_313-8123:0.0200484):0.0053399):0.0012856,IRIS_313-8066:0.0252163):0.0017342):4.219E-4,(((IRIS_313-8145:0.0080694,(IRIS_313-8139:0.0166828,IRIS_313-8116:0.0160667):0.0053274):0.0052905,((IRIS_313-8121:0.0232795,IRIS_313-8208:0.01935):0.0024338,(IRIS_313-8137:0.002934,IRIS_313-8136:0.0164983):0.0091):7.745E-4):0.0025542,IRIS_313-8147:0.0273874):0.0014777):0.0022745,IRIS_313-8118:0.0316849):2.422E-4,(((IRIS_313-8033:0.0149382,IRIS_313-8026:0.0179599):0.0086996,IRIS_313-8154:0.0240417):0.0034543,IRIS_313-10089:0.0232708):0.0051581):9.658E-4):0.0020952):0.0026606,(((((((((((IRIS_313-10840:0.0128555,(IRIS_313-10837:0.01186,IRIS_313-9379:0.0127112):0.0014387):8.011E-4,IRIS_313-9974:0.015122):0.0017638,IRIS_313-10838:0.0148997):0.0028796,(IRIS_313-12217:0.0168354,(IRIS_313-9886:0.0132151,IRIS_313-10097:0.0160072):0.0038536):6.789E-4):7.269E-4,(IRIS_313-11973:0.0181753,(IRIS_313-9890:0.016861,IRIS_313-9887:0.014872):0.0020536):8.562E-4):0.0022792,IRIS_313-12003:0.0210724):0.0024115,IRIS_313-10124:0.0231697):0.0020962,(((B258:0.015262,B017:0.0164949):0.0043652,((((((((B179:6.16E-5,IRIS_313-9964:3.583E-4):0.0063721,B226:0.0072957):5.692E-4,(IRIS_313-9880:0.005935,IRIS_313-11536:0.0063461):0.0027959):8.485E-4,IRIS_313-10563:0.0089268):0.0030996,((IRIS_313-9811:0.0083801,IRIS_313-9961:0.006835):0.0043158,IRIS_313-9813:0.0102918):0.002342):0.0017908,IRIS_313-8128:0.014576):0.0036069,(IRIS_313-8890:0.0180089,(IRIS_313-8109:0.0103564,IRIS_313-8113:0.0098008):0.0101878):0.0015317):0.0054984,(B204:0.0076493,B016:0.0067478):0.0123929):5.993E-4):0.0038651,(B068:0.0218696,IRIS_313-8387:0.0199964):0.0013123):0.0014914):9.792E-4,((B161:0.0102533,B102:0.0158965):0.0059857,IRIS_313-9814:0.024555):0.0020979):0.0013643,(IRIS_313-8171:0.0137387,IRIS_313-10242:0.0129236):0.017353):0.00239,B023:0.0173803):0.0018234):0.0024762,(CX354:0.0307793,B228:0.0231528):0.0044195):0.0011204,(((((CX389:0.0209137,B143:0.0151695):0.0044318,CX287:0.025376):0.0043996,CX57:0.0304902):0.0016314,(((CX351:0.0231434,(CX277:0.0040864,CX138:0.0042591):0.0169531):0.0026616,CX213:0.0123358):0.003643,B144:0.029091):0.0047743):9.105E-4,IRIS_313-11153:0.0196279):6.961E-4):6.973E-4,CX307:0.0136294):0.0017084,(B124:-0.0011942,IRIS_313-9140:0.0286986):0.0052624):0.0015628,B152:0.0068753):0.0038483,CX49:0.0252676):0.0019199,((((((((CX384:9.375E-4,CX383:0.0050962):0.0093174,IRIS_313-12061:0.0208162):0.0012522,(B230:0.0126206,(IRIS_313-12059:0.0099142,(IRIS_313-12060:0.0016959,IRIS_313-11522:0.0016761):0.0070765):0.0044414):0.0045647):0.0032207,B109:0.0219643):0.0065303,(IRIS_313-10617:0.0172822,IRIS_313-8256:0.0278101):0.008772):0.0019045,((((((((CX315:0.0184431,((((B162:0.0063035,B071:7.057E-4):0.0065277,IRIS_313-10583:0.0135638):0.0015942,((B056:0.0110263,((IRIS_313-9725:-1.419E-4,IRIS_313-9249:3.818E-4):0.0102832,IRIS_313-11582:0.0110379):0.0015666):0.0023385,((IRIS_313-10559:0.0112697,IRIS_313-11578:0.0109289):1.94E-4,(((IRIS_313-9724:0.0051357,IRIS_313-11574:0.0049347):0.002749,(IRIS_313-11584:0.0066232,IRIS_313-11571:0.0058444):0.0025342):0.0021746,IRIS_313-11652:0.0096888):8.944E-4):0.0018481):0.0012859):0.0031014,(B077:0.0123067,IRIS_313-10558:0.0142437):0.0019069):0.0016505):0.0031055,B117:0.0157268):4.292E-4,((B215:0.0097371,B101:-0.009226):0.0092431,IRIS_313-11803:0.0198493):0.0023319):0.0038309,((B199:0.0197409,IRIS_313-11575:0.0184509):0.0020301,IRIS_313-10228:0.0191345):0.0033159):0.0020447,((((((IRIS_313-11336:0.0016843,IRIS_313-10440:-0.0013257):7.874E-4,IRIS_313-11788:-5.484E-4):0.0132331,IRIS_313-8690:0.0108409):0.0026956,IRIS_313-8883:0.0137237):0.0015024,IRIS_313-8735:0.0165325):0.0077501,((B148:0.0145274,B136:0.0150263):0.0062963,((((B225:0.0097345,IRIS_313-11908:0.0090117):0.0072677,IRIS_313-11984:0.0156141):0.0025082,(B103:0.0144259,(B066:0.0133209,(B111:4.2E-4,B110:-6.95E-5):0.0139935):0.0022212):7.688E-4):0.0017517,B100:0.0139789):0.0019564):0.0024249):0.0022424):0.0012452,IRIS_313-11655:0.0332272):0.0013609,(B205:0.0191927,B223:0.0241392):0.0056881):0.0020393,IRIS_313-11075:0.0327236):0.0023159):8.167E-4,B212:0.0329116):0.0027518,IRIS_313-10562:0.0357295):0.0059302):0.0029571,(CX11:0.0219182,IRIS_313-10459:0.0272703):0.0017585):0.0027924,(((((CX6:-1.75E-4,CX316:3.498E-4):0.0108119,CX317:0.0132117):0.0091993,CX286:0.0252891):0.0103082,(B084:5.195E-4,B142:-3.086E-4):0.0288576):0.0036703,B047:-0.0014677):0.0049434):0.0011186,CX284:0.0111688):0.0013219,IRIS_313-8873:0.0445721):0.0039938,CX282:0.0090505):0.0017715,B086:0.0421708):0.0030519,IRIS_313-11092:0.0213181):8.008E-4,(((((IRIS_313-10883:0.0356105,IRIS_313-10881:0.0324646):0.0116212,((IRIS_313-10872:0.0288046,IRIS_313-8872:0.0302692):0.0022504,IRIS_313-8302:0.0395731):0.0012495):0.0053883,IRIS_313-9392:0.0124871):0.002393,IRIS_313-11690:0.0412433):0.0017533,IRIS_313-9404:0.0174265):0.0022618):0.0025554,(((((((((((CX367:0.0022658,CX353:0.0415518):0.0031133,((((((((((((((((CX374:4.745E-4,CX373:3.7E-6):0.0155068,IRIS_313-10336:0.015221):0.0070582,((CX220:0.0154753,(IRIS_313-7838:0.0112576,IRIS_313-8072:0.0112546):0.0053635):0.0032732,(IRIS_313-12021:0.0134897,IRIS_313-7912:0.0122141):0.0068101):0.0030957):0.0023476,IRIS_313-8010:0.0238389):0.0017526,IRIS_313-7868:0.024842):0.0017826,IRIS_313-7863:0.0269118):0.0012008,B043:0.0287105):0.002271,IRIS_313-11915:0.0318134):0.003986,(((((((((CX269:0.007078,CX241:0.0070614):0.0026805,((IRIS_313-11427:0.0012467,IRIS_313-7992:-7.993E-4):0.001013,IRIS_313-11238:-4.103E-4):0.0083442):0.0079282,IRIS_313-7922:0.0176733):5.809E-4,((CX111:5.829E-4,CX132:1.513E-4):0.0144175,(IRIS_313-7914:0.0130072,IRIS_313-11428:0.0121962):0.0029638):0.0035115):0.0045561,(((CX214:0.009977,IRIS_313-8694:0.0121484):0.0044875,((IRIS_313-11159:0.0079401,IRIS_313-11527:0.0070996):0.0071834,(B188:0.0096796,IRIS_313-8523:0.0104622):0.0034097):0.0033544):0.0013329,IRIS_313-11426:0.0206405):0.0029406):0.0035565,IRIS_313-8170:0.0222542):0.0032524,(CX106:0.0086156,(((((((((IRIS_313-11121:0.0163985,(B190:0.0073233,(IRIS_313-9267:0.0065078,IRIS_313-8745:0.0051284):0.0015389):0.0033801):0.0016168,((IRIS_313-9519:0.0058749,((IRIS_313-8768:2.462E-4,IRIS_313-11435:8.51E-5):3.76E-5,IRIS_313-8687:5.84E-5):0.0065736):0.0021751,IRIS_313-11739:0.0072563):0.002678):5.378E-4,IRIS_313-10552:0.0120067):0.0013303,IRIS_313-10327:0.0153016):0.0014128,IRIS_313-12279:0.0140078):0.0032133,IRIS_313-10711:0.017574):0.0020911,IRIS_313-10619:0.0188935):0.0010154,(IRIS_313-8876:0.0143807,IRIS_313-11434:0.0138302):0.0047306):7.654E-4,(IRIS_313-10710:0.0170982,((IRIS_313-10541:0.0133642,IRIS_313-8778:0.0138388):0.0012507,IRIS_313-9851:0.0150323):0.0020904):0.0031378):0.002186):0.0041472):0.0028274,(((((((((((((((CX113:7.227E-4,((IRIS_313-11755:0.0011954,IRIS_313-11540:8.512E-4):2.84E-5,IRIS_313-11658:7.399E-4):4.414E-4):1.604E-4,IRIS_313-10712:0.0016106):6.203E-4,B189:2.08E-5):0.0012816,IRIS_313-12018:0.0030673):0.0030441,IRIS_313-8277:0.0060267):0.003444,IRIS_313-11105:0.0122669):0.0025949,((IRIS_313-11759:1.393E-4,IRIS_313-11526:3.495E-4):1.195E-4,IRIS_313-11524:2.24E-5):0.0104159):0.0034773,IRIS_313-11109:0.0141788):0.0012575,IRIS_313-11376:0.0192113):5.159E-4,(IRIS_313-11103:2.101E-4,IRIS_313-11104:1.217E-4):0.01583):0.005251,((((((IRIS_313-11106:0.0103659,(IRIS_313-11107:0.0131282,(IRIS_313-11161:-2.41E-5,IRIS_313-11659:8.462E-4):0.0076138):0.0028827):5.442E-4,IRIS_313-11102:0.008765):0.0024132,IRIS_313-11660:0.0138152):0.0021414,IRIS_313-9297:0.0140536):0.001702,IRIS_313-8769:0.0163645):0.0020789,IRIS_313-10730:0.0188301):0.0023118):0.0017032,(IRIS_313-12281:0.0210186,IRIS_313-9742:0.021365):0.0014874):0.0021924,((IRIS_313-9745:0.0097292,(IRIS_313-11792:3.394E-4,IRIS_313-10051:9.72E-5):0.0100564):0.0130381,IRIS_313-11433:0.024581):0.0016467):0.0016274,(IRIS_313-7994:0.0227824,IRIS_313-10099:0.0239285):0.001007):0.0031579,IRIS_313-11756:0.0290934):0.0010333):0.0021754,(IRIS_313-7959:0.020299,IRIS_313-7993:0.016948):0.0120893):0.0024984):0.0028414,IRIS_313-11537:0.0349664):7.864E-4,IRIS_313-7850:0.0338404):0.0037197,CX352:0.036179):7.787E-4,((((((((((((CX77:-0.0078215,(IRIS_313-8044:0.0012887,IRIS_313-8180:0.0013606):0.00792):0.006552,(IRIS_313-8976:0.0123631,IRIS_313-9491:0.0136901):0.001126):0.0040693,IRIS_313-10196:0.0164708):0.0030086,IRIS_313-8923:0.0206563):0.0031275,(((((IRIS_313-10708:0.0122088,IRIS_313-9452:0.0120254):0.0028054,(IRIS_313-8193:0.0129977,IRIS_313-8046:0.0117956):0.0031476):0.0023382,(IRIS_313-8339:0.0147106,IRIS_313-8434:0.0137955):0.0032123):0.0019833,(IRIS_313-8285:0.0086372,IRIS_313-8183:0.0100219):0.0099768):0.0011027,((B018:0.0139893,((IRIS_313-10041:0.0066732,IRIS_313-8803:0.0064367):0.0016857,IRIS_313-9550:0.0070851):0.0051575):0.0021359,IRIS_313-11539:0.0133753):0.006151):0.003643):0.0022062,IRIS_313-10752:0.0256752):0.0049395,(IRIS_313-11100:0.0315929,IRIS_313-8323:0.0212864):0.0034197):0.0032068,((B191:0.0199043,((B053:0.0093328,B054:0.0178609):0.001459,(IRIS_313-8076:0.013239,IRIS_313-8186:0.0136531):0.0056601):0.0036693):0.0048703,IRIS_313-8074:0.0269538):0.0047592):8.119E-4,(((((IRIS_313-15910:6.22E-4,IRIS_313-15907:-1.782E-4):0.0208465,IRIS_313-8202:0.0199257):6.807E-4,IRIS_313-9363:0.0212829):8.789E-4,IRIS_313-8192:0.0205172):0.0033889,((IRIS_313-8185:0.0194351,IRIS_313-8173:0.0229458):0.0019901,IRIS_313-8209:0.0213962):0.0016276):0.0084241):0.0044549,(B037:0.0192735,(IRIS_313-8063:0.0304684,(IRIS_313-8205:0.0180647,IRIS_313-8064:0.0184874):0.0120727):0.0038458):0.0017487):0.0015818,(((IRIS_313-8060:0.0229866,IRIS_313-8057:0.0228782):0.0056835,IRIS_313-8061:0.0295263):0.0030873,(IRIS_313-8058:0.0295598,IRIS_313-8062:0.0301309):0.0013402):0.0043088):0.0011516,((((IRIS_313-11156:0.0217954,IRIS_313-8658:0.0214791):0.0088403,IRIS_313-10062:0.0309025):0.004015,((((IRIS_313-8050:0.0072558,IRIS_313-11437:0.0068692):0.0050753,IRIS_313-8214:0.011956):0.0121828,IRIS_313-8200:0.0142651):0.0065429,IRIS_313-8041:0.0328657):9.564E-4):0.0020251,(((IRIS_313-10258:0.0175326,IRIS_313-8160:0.0138411):0.0040599,(IRIS_313-8159:2.2E-4,IRIS_313-8158:9.43E-5):0.0211036):0.0115921,((IRIS_313-8065:0.0063814,IRIS_313-8213:0.0070064):0.0179662,IRIS_313-8037:0.0226299):0.0091405):0.0026843):0.0037846):0.0044301):0.0033557,((CX139:5.32E-5,CX109:1.912E-4):0.0354606,IRIS_313-10061:0.0367765):0.0054281):0.0026006,(((((CX285:1.556E-4,IRIS_313-8400:3.72E-5):0.0112566,(((((((B196:1.387E-4,IRIS_313-10065:2.481E-4):0.001865,IRIS_313-10075:0.0026611):0.0015121,((IRIS_313-9995:8.679E-4,IRIS_313-9789:0.0013027):0.0012604,(IRIS_313-10080:6.05E-5,IRIS_313-10073:3.065E-4):0.0023342):0.0024972):0.0039348,IRIS_313-10071:0.0073922):0.0015879,IRIS_313-10074:0.0100146):6.256E-4,IRIS_313-10082:0.0111908):0.0012703,(((IRIS_313-10507:3.147E-4,IRIS_313-10094:-1.216E-4):4.515E-4,((IRIS_313-10078:1.067E-4,IRIS_313-10067:1.035E-4):6.58E-5,IRIS_313-10079:2.31E-5):4.918E-4):0.0059845,IRIS_313-10076:0.007553):0.0044949):8.313E-4):0.0012397,IRIS_313-9800:0.0133469):0.0042043,IRIS_313-9201:0.0161229):0.0139981,(((B168:0.0175938,((B069:-9.539E-4,B070:0.001199):0.0124612,((B003:-0.0021394,B036:0.0062715):0.0031014,IRIS_313-10453:0.0091912):0.0061494):0.003657):0.0035579,IRIS_313-9523:0.0193576):0.0026091,IRIS_313-10096:0.0237082):0.0029086):0.0181132):6.613E-4,((((((((((CX129:0.0185861,IRIS_313-11496:0.0175863):0.0048321,IRIS_313-11790:0.0238365):5.67E-4,((IRIS_313-10809:0.0179823,((IRIS_313-10815:0.0092396,IRIS_313-10816:0.00854):0.0105487,(IRIS_313-10783:0.0118803,IRIS_313-8436:0.0123206):0.004751):0.0026016):0.0025042,IRIS_313-10817:0.0201066):0.0021927):0.0013965,(IRIS_313-11498:0.0150992,IRIS_313-11479:0.0161464):0.0072166):7.546E-4,(((((IRIS_313-11311:0.0017839,IRIS_313-9405:1.71E-4):0.0175666,IRIS_313-10801:0.0188365):6.774E-4,IRIS_313-10780:0.0199046):0.0037322,((((((((((((IRIS_313-10956:2.808E-4,IRIS_313-9928:1.179E-4):9.52E-5,IRIS_313-10805:2.845E-4):7.57E-5,IRIS_313-11007:1.593E-4):0.0131408,IRIS_313-10781:0.0119129):0.0043878,IRIS_313-10841:0.0081015):0.0013622,(IRIS_313-10936:0.0164904,IRIS_313-10784:0.0160606):0.0013518):3.659E-4,((IRIS_313-10789:0.0144822,IRIS_313-11971:0.0137404):0.0030698,IRIS_313-10765:0.0161506):8.834E-4):0.001282,(IRIS_313-10803:0.0166648,IRIS_313-10745:0.0169132):0.0013412):8.222E-4,(((((IRIS_313-10808:0.0129064,IRIS_313-10802:0.0134537):0.0015478,IRIS_313-10770:0.0142251):0.0027756,(IRIS_313-10761:0.0116723,IRIS_313-10689:0.012696):0.0036759):9.558E-4,((IRIS_313-10773:0.0114287,IRIS_313-8314:0.0118142):0.0032124,((IRIS_313-10767:0.010092,IRIS_313-10766:-2.987E-4):0.0030361,IRIS_313-10693:0.0144354):0.0013624):0.0027612):9.42E-4,IRIS_313-10788:0.0170308):0.001014):0.0010294,IRIS_313-10744:0.019872):0.0025159,(IRIS_313-10746:0.017908,IRIS_313-10759:0.0174854):0.0029052):9.568E-4,(IRIS_313-10800:0.0218074,((IRIS_313-10740:0.0011193,IRIS_313-10741:0.0013411):0.0039992,IRIS_313-10785:0.0061157):0.0159149):3.891E-4):0.0020711):0.0010455,IRIS_313-9301:0.0236269):0.0012831):0.0028004,(IRIS_313-11005:1.424E-4,IRIS_313-10950:2.272E-4):0.0261719):1.372E-4,IRIS_313-10790:0.02514):0.0031892,(IRIS_313-10994:1.733E-4,((IRIS_313-10920:3.119E-4,IRIS_313-10649:-4.09E-5):1.063E-4,IRIS_313-10919:9.5E-5):1.173E-4):0.0331293):0.0044924,CX205:0.0364362):0.007402,(((((((((((((((((((((CX248:0.0158553,IRIS_313-10991:0.018595):5.382E-4,(IRIS_313-8594:3.543E-4,IRIS_313-9389:6.33E-5):0.0172562):0.0025674,(IRIS_313-11946:0.012483,IRIS_313-11465:0.0120068):0.0074167):9.364E-4,(IRIS_313-11340:0.0141358,IRIS_313-11736:0.0128318):0.0085053):0.0021865,(IRIS_313-11424:0.0141103,(IRIS_313-10828:0.0149376,IRIS_313-9423:0.0170677):0.0049914):4.279E-4):0.0021137,(IRIS_313-10829:0.0155862,IRIS_313-10831:0.0183092):0.0065033):0.0017648,IRIS_313-10999:0.0231317):6.095E-4,(((IRIS_313-10830:0.012607,IRIS_313-10827:0.0115413):0.010276,IRIS_313-12070:0.0224585):0.0013179,IRIS_313-11929:0.0248922):0.0023668):7.7E-5,((IRIS_313-10832:0.0203924,IRIS_313-9375:0.0213473):0.0023428,IRIS_313-9897:0.0229573):0.0018341):7.324E-4,((CX266:-7.25E-5,IRIS_313-7876:8.447E-4):0.023847,IRIS_313-11913:0.023479):0.0014882):8.149E-4,((((IRIS_313-11379:0.0251077,((((IRIS_313-11337:0.0258735,IRIS_313-10489:0.0157594):7.877E-4,((((IRIS_313-11903:0.0032013,IRIS_313-9929:0.0031979):0.0064302,IRIS_313-9050:0.0076684):0.0030487,IRIS_313-8439:0.0099515):0.0109204,IRIS_313-11532:0.0197429):0.0014474):0.0010457,IRIS_313-12051:0.0222341):9.573E-4,((IRIS_313-11117:0.0253513,IRIS_313-11673:0.022712):4.851E-4,(((IRIS_313-12244:0.0151649,(IRIS_313-11994:0.0136909,IRIS_313-12073:0.0135624):8.971E-4):0.0018713,(IRIS_313-10578:0.0176361,IRIS_313-11995:0.0160178):0.0014315):0.0033165,IRIS_313-10580:0.0198152):0.0029341):0.0011312):9.48E-4):6.694E-4,IRIS_313-12272:0.0249177):0.0014123,IRIS_313-10992:0.0257577):0.0013917,((((IRIS_313-10581:0.0189374,IRIS_313-12144:0.0191956):0.004008,IRIS_313-11928:0.0220214):0.0029037,IRIS_313-12271:0.0240375):0.0012754,IRIS_313-11464:0.0250112):0.0027361):3.221E-4):4.71E-4,(((((CX262:1.174E-4,IRIS_313-10485:4.247E-4):0.0125623,(IRIS_313-8960:2.465E-4,IRIS_313-8102:1.907E-4):0.0168527):0.0049617,IRIS_313-11439:0.015507):0.0056952,IRIS_313-8627:0.0241159):0.0067956,((CX151:0.0199694,IRIS_313-10620:0.0232906):0.0035038,(IRIS_313-9616:0.0221152,IRIS_313-11441:0.0198973):0.0026771):0.0028504):0.0017127):0.0011887,IRIS_313-9558:0.027725):0.0022086,((IRIS_313-11397:0.0265404,(((IRIS_313-11004:0.015654,IRIS_313-10799:0.0156782):8.453E-4,((IRIS_313-11001:0.0148825,IRIS_313-9129:0.0139789):0.0020983,IRIS_313-7883:0.0141042):0.0018433):0.0022673,IRIS_313-11003:0.0201065):0.0013733):0.0052097,((IRIS_313-10758:0.0182299,IRIS_313-11495:0.019596):0.0033385,(IRIS_313-10798:0.019882,IRIS_313-10776:0.0189867):0.0051698):0.004106):0.0014015):2.364E-4,(IRIS_313-11009:0.0197055,IRIS_313-11008:-0.0031382):0.0095515):0.0017317,(((((((IRIS_313-10993:0.0068308,(IRIS_313-11851:6.145E-4,IRIS_313-12031:4.28E-4):0.0063514):0.001597,IRIS_313-10931:0.0077753):7.364E-4,(((IRIS_313-10582:0.0058901,IRIS_313-10577:0.0064033):9.184E-4,IRIS_313-11473:0.0050002):0.0018852,IRIS_313-8431:0.0072815):0.0010723):9.234E-4,IRIS_313-8572:0.0080646):0.0028019,(IRIS_313-10644:0.0106678,IRIS_313-10645:0.0097554):0.0014784):8.358E-4,(IRIS_313-8356:0.0102497,IRIS_313-11511:0.0107781):0.0019907):0.0077421,IRIS_313-10918:0.0152872):0.010646):5.522E-4,((IRIS_313-10959:0.0190809,IRIS_313-11907:0.0190796):0.0098161,IRIS_313-7885:0.0278669):0.0020174):0.0012671,((((((IRIS_313-11396:0.0212761,(((((IRIS_313-11328:0.0094053,IRIS_313-8626:0.0054261):0.0010275,IRIS_313-8955:0.0062345):0.0133065,IRIS_313-11314:0.0245683):6.403E-4,(((IRIS_313-11329:0.0093779,IRIS_313-12285:0.0177574):0.0037896,((IRIS_313-12241:0.0147277,(IRIS_313-12108:0.0138124,IRIS_313-11970:0.0140922):0.0015236):0.004304,IRIS_313-12045:0.0180141):0.001496):1.737E-4,(IRIS_313-12069:0.0163892,IRIS_313-8894:0.0184908):0.0025488):0.0014148):0.0016746,IRIS_313-8865:0.0225538):0.0012909):0.0011754,(IRIS_313-11045:0.0230045,IRIS_313-9239:0.0236146):0.0024248):0.0012885,(IRIS_313-12068:0.0197186,IRIS_313-10152:0.0207255):0.0049758):0.0019855,(IRIS_313-10949:0.0258825,(IRIS_313-10703:0.0249212,(((IRIS_313-10704:0.0128025,IRIS_313-8279:0.0128416):0.0041657,IRIS_313-8381:0.0175433):0.0028703,IRIS_313-9568:0.0205455):0.0035593):0.001225):0.0020936):0.0018778,(((((IRIS_313-11248:0.0282819,IRIS_313-12006:0.0216631):0.0022943,IRIS_313-11611:0.0227435):0.0022574,((IRIS_313-11313:0.0237186,(IRIS_313-10953:0.0190131,IRIS_313-10958:0.0186892):0.0029509):0.0020563,(IRIS_313-10957:0.0177087,IRIS_313-10952:0.0181014):0.0045259):0.0015047):8.396E-4,IRIS_313-10960:0.0241196):0.0010863,((IRIS_313-8664:0.0187186,IRIS_313-8998:0.0191949):0.005732,(IRIS_313-9470:0.023557,IRIS_313-9691:0.0219452):0.0042948):0.0017183):0.0026163):0.0016651,((((((((IRIS_313-11183:0.0193306,IRIS_313-10747:0.0187908):9.764E-4,((IRIS_313-10743:0.0111907,IRIS_313-10796:0.0087325):0.0047012,IRIS_313-10793:0.0148654):0.0034195):0.001135,IRIS_313-10795:0.0203074):0.0023737,B025:0.0172295):0.0010398,IRIS_313-10794:0.0248599):0.0038306,(IRIS_313-10945:0.0070264,IRIS_313-11499:0.0065821):0.0192426):0.0024104,IRIS_313-10946:0.0295853):9.32E-4,IRIS_313-11906:0.0279681):0.0018106):0.0019396):9.886E-4,(IRIS_313-10722:0.0290693,IRIS_313-9949:0.0284734):0.0051175):0.0027316,(IRIS_313-11046:0.0122132,IRIS_313-11044:0.013353):0.021468):0.0020896,(((((((((((IRIS_313-11073:0.0037626,IRIS_313-11922:0.0051034):0.0093189,IRIS_313-11924:0.0152585):0.0041046,IRIS_313-8011:0.0177222):0.0021597,IRIS_313-12076:0.0215098):0.0030318,(B134:0.0177529,IRIS_313-8927:0.0200131):0.0030049):8.725E-4,B245:0.0215268):0.0055822,(((((((((((((IRIS_313-11094:3.327E-4,IRIS_313-12299:-5.28E-5):3.122E-4,IRIS_313-12345:0.0010889):0.0118565,(IRIS_313-10660:0.0047243,IRIS_313-12129:0.0107374):0.0090798):0.0054589,IRIS_313-10656:0.0174167):0.0012637,((IRIS_313-11093:0.0137453,(IRIS_313-12134:6.562E-4,IRIS_313-12252:2.886E-4):0.0067102):0.0058592,IRIS_313-12227:0.0144011):0.0056622):0.0012153,IRIS_313-11845:0.0208624):0.0022391,((((((IRIS_313-10922:0.0140057,IRIS_313-12350:0.014088):0.0014282,IRIS_313-10653:0.0164113):0.002853,IRIS_313-12313:0.0184984):0.0022789,((((((IRIS_313-12348:0.0062461,IRIS_313-12349:0.0059491):0.0071333,(IRIS_313-12311:0.0044726,IRIS_313-12258:0.00315):0.0089468):0.002278,IRIS_313-12265:0.0157733):0.0010985,IRIS_313-12228:0.0162877):0.0021633,(IRIS_313-12337:0.017057,IRIS_313-12029:0.0168464):0.0017226):0.0015726,((IRIS_313-12077:0.0154502,IRIS_313-12352:0.0151674):0.0035658,IRIS_313-12336:0.019146):9.128E-4):3.966E-4):7.358E-4,(IRIS_313-10679:6.39E-5,IRIS_313-12342:1.822E-4):0.0200601):6.134E-4,IRIS_313-12321:0.0212085):7.919E-4):0.0016453,(IRIS_313-11127:0.006488,IRIS_313-10657:0.0065557):0.0163031):8.842E-4,((IRIS_313-12330:0.0224538,IRIS_313-12266:0.0183461):7.555E-4,IRIS_313-8565:0.0175793):0.0037549):4.295E-4,((((((((((((IRIS_313-11077:0.0143086,IRIS_313-12322:0.013475):0.0029545,IRIS_313-12242:0.0151845):6.185E-4,(((IRIS_313-12341:0.0154803,IRIS_313-11923:0.0140255):0.0012483,IRIS_313-12340:0.0140741):5.29E-4,IRIS_313-12257:0.0150101):8.121E-4):3.512E-4,IRIS_313-12344:0.0148351):6.004E-4,((IRIS_313-12324:0.0102139,IRIS_313-12226:0.0140842):0.002008,(IRIS_313-12346:0.0147588,IRIS_313-12351:0.0145377):7.12E-4):3.646E-4):3.586E-4,IRIS_313-11831:0.0172864):0.0010924,((((IRIS_313-10923:0.0092654,IRIS_313-11900:0.0104348):0.0068415,(((IRIS_313-12254:0.0110925,IRIS_313-12323:0.0108083):0.0012957,IRIS_313-11926:0.0124074):0.0020193,IRIS_313-12332:0.0141004):0.001795):6.762E-4,IRIS_313-12312:0.0169574):3.537E-4,(IRIS_313-12262:0.0129347,IRIS_313-12200:0.0144367):0.0031244):0.0013966):0.0016334,IRIS_313-12307:0.0176568):7.828E-4,((IRIS_313-12353:0.0159709,(IRIS_313-12347:0.0149845,IRIS_313-12071:0.0154246):0.0010404):5.751E-4,IRIS_313-8578:0.0180823):0.0019543):0.001876,IRIS_313-11897:0.0206939):0.0014944,(IRIS_313-12063:0.0191948,IRIS_313-11623:0.0196656):0.0035196):7.274E-4,B266:0.020797):0.0016339):0.0011546,((IRIS_313-12289:0.0142522,IRIS_313-8599:0.016804):0.0049768,IRIS_313-11892:0.0226605):0.0016196):9.22E-4,((B241:0.0200838,IRIS_313-8580:0.0200689):0.002113,IRIS_313-10176:0.0230398):0.0012584):0.0023373,(((IRIS_313-11846:0.0118226,IRIS_313-11834:0.0144394):0.0021552,IRIS_313-9123:0.0154551):0.0064859,(IRIS_313-11832:0.0069816,IRIS_313-8884:0.0063918):0.0158973):0.0066487):0.0023027):0.0024456,IRIS_313-7856:0.0294672):0.0014416,((((((IRIS_313-11195:0.0236593,IRIS_313-10886:0.0193458):0.0045288,((IRIS_313-10867:0.0141959,IRIS_313-10888:0.0144105):0.0072712,IRIS_313-10874:0.0219067):0.0025198):7.257E-4,(((IRIS_313-10866:0.0145434,IRIS_313-10056:0.013034):0.0019093,IRIS_313-10865:0.0146615):0.0060522,IRIS_313-10889:0.0200284):0.0035566):0.0036462,((((IRIS_313-10893:0.0147447,IRIS_313-11494:0.0149209):0.0067229,IRIS_313-10890:0.0216441):0.003994,IRIS_313-10870:0.0210332):0.0022169,IRIS_313-10895:0.0238123):0.0020052):2.872E-4,IRIS_313-10884:0.027431):0.0019201,(((((((((IRIS_313-10834:0.0071662,IRIS_313-8486:0.0080923):3.247E-4,IRIS_313-8857:0.0073418):7.446E-4,IRIS_313-8815:0.0059227):0.0022506,IRIS_313-11691:0.0108289):0.0012908,IRIS_313-9529:0.0109777):4.693E-4,(IRIS_313-9048:0.0070356,IRIS_313-8637:0.0070366):0.0040377):8.796E-4,IRIS_313-8519:0.0120197):0.010157,IRIS_313-10848:0.0223981):0.0030668,IRIS_313-8999:0.0245725):0.0021053):0.0011866):7.024E-4,((((IRIS_313-10853:0.0011687,IRIS_313-10862:0.0015371):0.0063637,IRIS_313-9176:0.0094837):0.0067597,IRIS_313-8669:0.0139105):0.0138568,(IRIS_313-7870:0.031198,IRIS_313-7859:0.0363303):0.0047975):9.919E-4):0.0018381,IRIS_313-12164:0.0340371):0.0034209):0.001301):0.0027777):0.0019845):7.053E-4,(IRIS_313-11380:0.017126,(CX243:0.0020867,IRIS_313-7924:0.0389154):0.0050304):0.001405):9.88E-4,(CX32:0.0422454,((((((((CX359:0.0196535,IRIS_313-15905:0.0204114):7.149E-4,(CX372:0.0129791,CX371:0.0050239):0.0026092):0.0036669,CX355:0.0216838):0.001811,IRIS_313-7902:0.0222436):0.0055592,IRIS_313-7907:0.0260999):0.0034613,((IRIS_313-7909:0.014126,IRIS_313-8232:0.0148382):0.01123,IRIS_313-8003:0.0272291):0.0042614):0.0033792,IRIS_313-7866:0.0315509):0.0063371,IRIS_313-10272:0.0384127):0.0050272):0.0043675):0.0026284,IRIS_313-10444:0.0017082):0.0045033,(IRIS_313-8172:0.0410586,IRIS_313-8184:0.0382202):0.0133265):0.0020884,CX395:0.0295025):0.0037435,IRIS_313-9101:0.0232626):0.0015763,CX280:0.0056345):0.0011028,(IRIS_313-11425:0.0170776,(IRIS_313-12030:0.0422819,IRIS_313-8911:0.0252181):0.0063096):0.0032489):0.0015506,(CX242:0.0331417,((IRIS_313-10948:0.0217803,IRIS_313-10771:0.0112878):0.0042463,(((IRIS_313-10998:0.0251431,IRIS_313-10772:0.0182509):0.0089203,IRIS_313-11012:0.0295637):0.0053752,IRIS_313-10738:0.0436334):0.0050363):0.001461):7.073E-4):0.0022205):8.891E-4,(IRIS_313-10484:0.002124,((IRIS_313-11956:-0.0035671,(IRIS_313-7933:0.0226167,(IRIS_313-10295:0.0145713,IRIS_313-10025:0.01502):0.0068672):0.0174925):0.0129891,IRIS_313-9506:0.0334966):0.0097789):0.0032636):0.0020217,(CX4:0.0026925,(CX210:0.0076666,IRIS_313-10585:0.0489404):0.0024836):5.154E-4):0.0013727,(((CX365:0.0197559,((B020:0.0336908,B141:0.0336832):0.0070664,IRIS_313-11930:0.0413671):0.0022233):8.136E-4,IRIS_313-8067:0.0186382):0.0024078,IRIS_313-11714:0.0504931):0.0012532):0.0019211,(CX401:-0.0033791,(CX400:-0.007639,((CX402:0.0015643,IRIS_313-10729:0.001241):0.0365791,IRIS_313-11415:-0.0062504):0.0113585):0.0106523):0.014493):4.659E-4,((((((((((((((((((((((((CX65:0.00793,(CX66:9.72E-5,CX67:2.392E-4):0.0085879):0.005776,CX104:-5.224E-4):0.0038659,IRIS_313-8747:0.018696):0.0045092,CX110:0.018864):0.0014374,((IRIS_313-11373:0.0202735,IRIS_313-9083:0.0190359):0.0029565,((IRIS_313-11026:0.0048854,IRIS_313-9601:0.0041098):0.0156313,IRIS_313-11825:0.0200054):4.984E-4):0.0024505):0.0046208,((((((CX59:0.0138494,(((IRIS_313-11362:0.0115547,IRIS_313-11765:0.0069012):0.0021348,IRIS_313-9629:0.0114807):5.587E-4,IRIS_313-10868:0.0117451):0.0031008):0.0021647,CX143:0.017057):0.0023727,IRIS_313-11826:0.0176506):0.0031607,(IRIS_313-11350:0.0189896,(((IRIS_313-11356:0.0165689,IRIS_313-10732:0.0141535):0.0018496,IRIS_313-11567:0.0173719):0.0021792,IRIS_313-12094:0.0201685):0.0018253):0.0021885):0.0016249,IRIS_313-11451:0.0235193):7.912E-4,IRIS_313-10521:0.021914):0.0014792):0.0015491,IRIS_313-11218:0.0263522):0.0041632,IRIS_313-11258:0.0293851):0.002683,(IRIS_313-10670:0.0228546,IRIS_313-8498:-0.0079023):0.012616):0.001136,(((((IRIS_313-11401:0.0215732,(((((IRIS_313-11259:0.0159772,IRIS_313-8712:0.0060902):0.003785,IRIS_313-11293:0.0110556):0.0023835,IRIS_313-11289:0.0141356):0.0014555,(IRIS_313-11268:0.0170068,IRIS_313-9172:0.0116647):0.0023597):0.0043212,IRIS_313-10933:0.017769):0.0049027):0.0020968,IRIS_313-10851:0.0230189):0.003927,(IRIS_313-11352:0.0013029,IRIS_313-11564:0.0209028):0.0077218):0.00279,(IRIS_313-12074:0.0199098,(IRIS_313-9682:0.0117747,IRIS_313-9170:0.0141704):0.0090713):0.0096579):0.0013351,(IRIS_313-8326:2.985E-4,IRIS_313-8385:1.242E-4):0.0294013):8.333E-4):0.0013879,((((((IRIS_313-10926:0.0130996,IRIS_313-8814:0.011734):0.0061085,IRIS_313-11743:0.0164436):0.0044187,(IRIS_313-8268:0.0153465,IRIS_313-11698:0.0180272):0.0041757):7.407E-4,((IRIS_313-8813:0.0184405,IRIS_313-8765:0.0172432):0.0034541,(IRIS_313-11627:0.0187289,(IRIS_313-11632:0.0172995,IRIS_313-11630:0.0169557):0.0035878):0.0017453):0.00173):0.0013042,IRIS_313-11626:0.0229294):0.0037694,IRIS_313-11625:0.0269522):0.0049321):0.0049047,((((CX112:1.02E-5,IRIS_313-11066:2.882E-4):0.0055372,IRIS_313-11070:0.0061049):0.0040781,IRIS_313-11069:0.0094719):0.004717,(IRIS_313-11068:0.0129551,IRIS_313-11062:0.0128808):0.0027645):0.0255233):0.0040553,(((IRIS_313-11270:0.0099219,IRIS_313-11297:0.0345084):0.0045436,IRIS_313-10864:0.0354351):0.0017519,IRIS_313-9053:0.0420222):7.389E-4):0.0031101,((IRIS_313-11360:0.0062657,IRIS_313-11542:0.0033627):0.0195463,(IRIS_313-11217:0.0220664,(IRIS_313-10537:0.0182496,IRIS_313-9445:0.020526):0.0023735):0.002343):0.0234328):0.0031876,IRIS_313-11223:0.0099694):0.0026435,IRIS_313-11375:0.039576):0.0017393,(((CX72:0.0259248,((((CX149:2.213E-4,IRIS_313-15909:1.727E-4):0.0150624,(IRIS_313-11022:0.010466,IRIS_313-8656:0.011549):0.002669):0.0039101,((IRIS_313-11023:9.74E-5,IRIS_313-11021:2.544E-4):0.0138897,(IRIS_313-10032:2.184E-4,IRIS_313-9978:2.101E-4):0.0138269):0.00399):0.0072371,IRIS_313-11030:0.0184012):0.0085467):0.0035688,IRIS_313-11032:0.0296132):0.0102991,((IRIS_313-11189:0.0430346,IRIS_313-11033:0.0183335):0.0026645,(IRIS_313-11036:0.0383808,IRIS_313-9783:0.0353982):0.001338):0.0018319):0.0091659):0.0032011,IRIS_313-11417:0.0425864):0.0044046,IRIS_313-10531:0.0165424):0.0030177,CX46:0.0468381):0.006516,IRIS_313-9400:0.0463205):0.0031151,IRIS_313-11269:0.0061458):7.875E-4,IRIS_313-11290:0.0183253):0.001255,B173:0.0506412):8.596E-4):0.0010875,((IRIS_313-11342:0.0355465,(((IRIS_313-10787:-7.587E-4,IRIS_313-10786:0.033565):0.005415,IRIS_313-11591:0.0448104):0.0042965,((IRIS_313-10522:0.033889,IRIS_313-9242:0.0234742):0.0046153,IRIS_313-8324:0.049606):0.0016831):0.0021867):0.0027204,IRIS_313-10739:0.0294611):9.876E-4):2.185E-4,(IRIS_313-11125:0.0582013,IRIS_313-11263:0.0433897):0.0071444):0.0013373,(((((((((((((((((((CX368:0.0167825,IRIS_313-11917:0.0171918):0.0067683,IRIS_313-11602:0.0241666):0.0046122,((((IRIS_313-10925:0.0118754,IRIS_313-12139:0.0109362):0.0097188,IRIS_313-10608:0.0229925):0.0030525,(IRIS_313-8390:0.0229391,IRIS_313-11619:0.023756):0.0020151):0.0013775,IRIS_313-9641:0.0241439):0.0036324):0.0016016,((IRIS_313-10735:0.022156,(IRIS_313-10734:0.0195125,IRIS_313-10736:0.0211527):0.0023497):0.0034398,IRIS_313-11629:0.027467):0.0042687):0.0013049,((((((((CX63:-0.0016419,IRIS_313-11374:0.002105):0.0059698,IRIS_313-11809:0.0047186):0.0085624,IRIS_313-11888:0.013624):0.0054892,IRIS_313-9449:0.0189266):0.0053399,IRIS_313-11028:0.02479):0.0020727,(IRIS_313-11024:0.0123861,IRIS_313-11020:0.0136023):0.0134851):0.0021647,((IRIS_313-11034:0.0261225,(IRIS_313-11037:0.0210691,IRIS_313-10549:0.02125):0.0037206):0.0014062,IRIS_313-11029:0.0270404):0.0015313):0.0025853,IRIS_313-11618:0.029213):0.001464):0.0016943,(((((IRIS_313-11371:0.0015643,IRIS_313-11636:-0.0010474):0.011917,IRIS_313-8771:0.0100577):0.0112088,IRIS_313-11712:0.0225872):0.0059465,((((((((((IRIS_313-11174:0.0148465,IRIS_313-10600:0.0108467):0.0013798,IRIS_313-9368:0.0120576):0.0018409,IRIS_313-10594:-1.757E-4):0.0018393,IRIS_313-11060:0.015482):0.0016733,((IRIS_313-11053:0.0157382,IRIS_313-10606:0.0165566):0.0014003,IRIS_313-10965:0.0162237):0.0013727):0.0020797,((((IRIS_313-11164:8.316E-4,IRIS_313-11481:-1.68E-4):0.016807,((IRIS_313-11168:0.0218992,(IRIS_313-10592:0.0088302,IRIS_313-9963:0.0083136):0.005786):6.196E-4,(IRIS_313-10595:0.0102803,IRIS_313-10587:0.0101387):0.0049536):0.0026232):0.0022895,(IRIS_313-11322:0.019786,IRIS_313-10604:0.0158243):0.0032558):0.001585,(IRIS_313-11048:0.0175636,(IRIS_313-11013:0.0166641,((IRIS_313-11017:0.0101738,IRIS_313-8864:0.0120756):0.0043587,IRIS_313-11483:0.015282):0.0014355):0.001514):0.0024625):0.0016744):0.0018441,(((IRIS_313-11324:0.0129439,IRIS_313-10930:0.0130707):0.0053623,IRIS_313-8073:0.0148419):0.0060866,((((IRIS_313-11213:0.0174835,IRIS_313-10849:0.0141519):0.0029979,IRIS_313-11016:0.0184345):0.0040638,IRIS_313-10598:0.0220406):7.791E-4,IRIS_313-8410:0.0198835):0.0014136):4.767E-4):0.0011428,IRIS_313-10969:0.0244036):6.092E-4,IRIS_313-10963:0.0236793):0.0027659,(IRIS_313-11173:0.0267509,IRIS_313-11018:0.0260729):9.722E-4):0.0012578):0.001168,((((((IRIS_313-11291:0.0171225,IRIS_313-11210:0.0171214):0.0058349,IRIS_313-8641:0.0186076):0.003722,IRIS_313-11061:0.0231887):0.0015429,(IRIS_313-11175:0.0230863,IRIS_313-10150:0.0216839):0.0036861):0.0013279,(IRIS_313-11172:0.0235253,IRIS_313-11047:0.0159313):0.0022926):8.044E-4,((((IRIS_313-11298:3.785E-4,IRIS_313-10875:1.686E-4):0.0162511,(IRIS_313-11265:0.0151539,IRIS_313-11982:0.0144449):0.0022071):0.0010971,IRIS_313-10852:0.0189974):0.0068406,(IRIS_313-11169:0.0280597,IRIS_313-10602:0.0239363):0.0010379):0.0029498):0.0017594):0.0038599):0.0016111,(((IRIS_313-11027:0.0222928,(IRIS_313-11462:0.0044902,IRIS_313-11456:0.0043671):0.0173186):0.0052557,IRIS_313-11604:0.0292621):0.0031391,(IRIS_313-8342:0.025437,(IRIS_313-8822:0.0155139,IRIS_313-11737:0.0194113):0.0051979):0.005712):0.002823):0.0017423,(((IRIS_313-11232:0.0297094,IRIS_313-10380:0.0241501):0.0019649,(IRIS_313-11617:0.0218596,IRIS_313-11620:0.0237973):0.0043162):0.0030582,((IRIS_313-10737:0.0229585,IRIS_313-12183:0.0233519):0.003133,B049:0.0234763):0.0032396):0.0037021):8.498E-4,(((((IRIS_313-10861:0.0127724,IRIS_313-10854:0.0108642):0.003082,IRIS_313-9137:0.0116935):0.0084801,(IRIS_313-10869:0.0197343,(((IRIS_313-10877:8.93E-5,IRIS_313-10878:3.299E-4):0.0076312,IRIS_313-8554:0.0087408):0.008652,(IRIS_313-10871:0.0144146,IRIS_313-10876:0.0140946):0.0025986):0.0032026):0.005282):0.0035587,((IRIS_313-10882:0.0216903,IRIS_313-10892:0.0210114):0.0037581,(B243:0.0010503,B164:-3.84E-4):0.0261227):4.501E-4):0.0023595,IRIS_313-12055:0.0294967):0.0041044):0.0057697,IRIS_313-11489:0.0381889):0.0043496,((IRIS_313-10894:0.0124461,IRIS_313-10896:0.0116634):0.0147445,IRIS_313-10891:0.0311598):0.0086959):0.0040008,IRIS_313-10879:0.0374002):0.0040092,IRIS_313-8382:0.0406243):0.0055978,CX108:0.0176545):0.0018531,((((((CX227:0.007412,((((((((IRIS_313-11413:0.024245,IRIS_313-10718:0.0271206):0.0060437,((IRIS_313-11191:0.005626,IRIS_313-9636:0.0048312):0.0058141,IRIS_313-10020:0.0096709):0.0216898):0.0054961,(((IRIS_313-9610:0.0140065,IRIS_313-11454:0.0124102):0.0165779,((IRIS_313-11455:0.0256952,IRIS_313-11477:0.0254064):0.0041166,IRIS_313-11603:0.0276979):0.0032407):0.0017278,IRIS_313-11595:0.0322807):0.0034447):5.446E-4,(((((((((IRIS_313-11171:0.0108416,IRIS_313-9661:0.0093739):0.0057503,(IRIS_313-10673:0.0039617,IRIS_313-9422:0.002536):0.0134427):0.0035899,IRIS_313-11272:0.0209386):0.0018292,((IRIS_313-11019:0.0180542,IRIS_313-12141:0.0183499):0.0017251,IRIS_313-10534:0.0212705):0.0019698):0.0045091,(((((IRIS_313-11050:0.0123946,IRIS_313-11154:0.0158271):0.0034892,(IRIS_313-11015:0.0138997,IRIS_313-11014:0.0137734):0.0016414):0.0049906,IRIS_313-8789:0.0177864):0.0035198,(IRIS_313-11056:0.0184453,(IRIS_313-11348:0.0152208,IRIS_313-11557:0.0120248):0.0044287):0.0058724):0.0014969,((((IRIS_313-11059:0.0122346,(IRIS_313-11170:0.0114906,IRIS_313-9626:0.009842):0.001943):0.0026422,IRIS_313-11058:0.015025):0.0022517,(IRIS_313-11111:0.0162318,IRIS_313-10603:0.0138563):0.0040474):0.0068398,IRIS_313-11049:0.0222338):0.0029216):0.0011632):0.0016269,(((((IRIS_313-11163:0.0014818,IRIS_313-11051:7.61E-4):0.0091659,((IRIS_313-11057:-7.05E-5,IRIS_313-10605:8.217E-4):3.334E-4,IRIS_313-11054:1.38E-5):0.0088736):0.0112513,IRIS_313-10593:0.0201059):0.0065117,(((((((IRIS_313-11065:0.0041224,IRIS_313-11063:0.0046857):0.001385,IRIS_313-11064:0.00676):0.0011206,IRIS_313-12002:0.0080747):0.0022588,IRIS_313-11067:0.0114016):0.0011723,IRIS_313-8252:0.0124152):0.0080995,IRIS_313-8721:0.0204523):0.0038624,IRIS_313-11166:0.0251071):0.0041099):1.597E-4,(IRIS_313-11055:0.0220023,((IRIS_313-10964:0.0117877,IRIS_313-10976:0.013028):0.0056024,IRIS_313-8963:0.0187069):0.0048199):0.0021614):0.0027228):0.0015305,IRIS_313-11323:0.0330557):0.0021131,IRIS_313-9861:0.0318027):4.105E-4,((((((IRIS_313-11025:0.0032846,IRIS_313-8398:0.0034935):0.0189578,(IRIS_313-11963:0.0052143,IRIS_313-11458:0.0054333):0.0160621):0.0032196,IRIS_313-10623:0.0226778):0.0020645,(IRIS_313-10927:0.0135066,IRIS_313-11492:0.0130383):0.0125784):0.002157,IRIS_313-11742:0.0278591):0.0019143,(((IRIS_313-10543:0.0208402,IRIS_313-15908:0.0215037):0.005255,IRIS_313-9283:0.0225295):0.0032618,IRIS_313-8655:0.0251556):0.0022876):0.0030729):0.0031572):0.0034148,(((((((IRIS_313-11112:0.0120257,IRIS_313-10979:0.0119732):0.0071523,(IRIS_313-11216:0.0188963,IRIS_313-10981:0.0166141):0.0028139):0.0020339,(IRIS_313-8321:0.0193214,IRIS_313-8283:0.0203724):0.0010156):0.005184,IRIS_313-11484:0.0235402):0.0050278,(IRIS_313-11277:0.0213,(IRIS_313-11124:-0.0122161,IRIS_313-11123:0.0165081):0.0107824):0.0081237):7.36E-4,(IRIS_313-11116:0.0178086,IRIS_313-11482:0.0125803):0.0190713):0.0020158,((IRIS_313-11353:0.0142243,IRIS_313-10545:0.0160345):0.0143118,(IRIS_313-11214:0.0239891,(IRIS_313-10845:0.0182225,IRIS_313-10987:0.0183402):0.0038125):0.0031048):0.0045906):0.005207):0.001282,IRIS_313-11052:0.0347009):0.0019542,IRIS_313-11274:0.0208102):0.0032361,IRIS_313-10873:0.0424484):0.0024613):0.0074006,(IRIS_313-11031:0.0171015,(IRIS_313-11452:0.045764,IRIS_313-11476:0.0384734):0.0036203):0.0027295):0.0028397,IRIS_313-9695:0.0435164):0.001167,IRIS_313-11035:0.0401551):0.0021047,IRIS_313-11165:0.0460667):0.0011738,IRIS_313-11598:0.0072147):0.0023285):9.335E-4,IRIS_313-11616:0.0442375):0.0011619,(IRIS_313-11243:0.0486627,IRIS_313-8783:0.0401882):0.0014078):0.0023021,IRIS_313-10856:0.0248201):0.0033192,(IRIS_313-10980:0.0390213,IRIS_313-11486:0.0186292):0.006453):0.0033208):0.0011918,(((((IRIS_313-11110:0.0185659,IRIS_313-10715:0.0156455):0.0055934,IRIS_313-9256:0.0209538):0.0017712,IRIS_313-11916:0.0220923):0.0030097,IRIS_313-10609:0.0287148):0.0144933,IRIS_313-10705:0.0256329):0.005498):7.81E-4,(((((((((((((((CX141:0.0309209,IRIS_313-9188:0.0302058):9.774E-4,IRIS_313-10792:0.0298624):0.0011717,((IRIS_313-11315:0.0237083,IRIS_313-8791:0.0212123):0.0024876,IRIS_313-10955:0.0238147):0.0090899):0.0029062,IRIS_313-11010:0.0339934):0.0024856,(IRIS_313-11905:0.0257843,IRIS_313-9329:0.0238543):0.0119896):0.0011871,((((((CX23:0.0072657,IRIS_313-10525:0.0075302):0.0067046,IRIS_313-8608:0.0151727):0.0061939,IRIS_313-11398:0.0229364):0.0121653,((((IRIS_313-10842:0.01749,IRIS_313-10844:0.0154511):0.0136521,((IRIS_313-10951:0.0204014,IRIS_313-9694:0.0219025):0.0067287,IRIS_313-8811:0.0295966):0.00223):0.0014122,IRIS_313-11904:0.0298403):0.002061,IRIS_313-8713:0.033134):0.0012095):0.0026575,IRIS_313-8833:0.0351608):0.0017,(((((IRIS_313-11318:0.0319208,IRIS_313-10822:0.0322096):0.0026044,(IRIS_313-11178:0.0303659,(IRIS_313-10782:0.0287441,IRIS_313-9005:0.0248085):0.0026155):0.0034758):0.0014646,(IRIS_313-11179:0.025778,IRIS_313-11912:0.0235067):0.0095064):0.0024405,((IRIS_313-11180:0.0262043,IRIS_313-9320:0.0250468):0.0108377,IRIS_313-10692:0.0368989):3.387E-4):0.001035,IRIS_313-10940:0.0352069):0.0013493):7.58E-4):3.245E-4,((((((CX148:0.0320449,IRIS_313-10779:0.0317134):0.0053415,((((((((IRIS_313-11395:0.013397,IRIS_313-10813:0.0121478):0.0084092,IRIS_313-11320:0.0205142):0.0016616,IRIS_313-10806:0.0235304):0.0025545,IRIS_313-10804:0.0235519):0.0028556,IRIS_313-10768:0.0283404):6.908E-4,IRIS_313-11319:0.0299774):0.001929,IRIS_313-10778:0.0258281):0.0025871,((((IRIS_313-10807:0.020462,IRIS_313-8831:0.0186654):0.0030527,IRIS_313-9102:0.026654):0.0018144,IRIS_313-9273:0.0264684):0.0020195,IRIS_313-9210:0.0286229):0.0038087):9.408E-4):0.001977,IRIS_313-9117:0.0350576):0.0022272,((((IRIS_313-11316:0.0158097,IRIS_313-11312:0.0183919):0.0109035,IRIS_313-8956:0.0244539):0.0069391,((IRIS_313-12046:0.0252176,(IRIS_313-12047:0.0215645,IRIS_313-9251:0.0245443):6.28E-4):0.0018331,(IRIS_313-12048:0.0260242,IRIS_313-8725:0.0238692):3.413E-4):0.0071999):0.0017478,(((IRIS_313-11043:0.0268395,IRIS_313-11989:0.0293355):0.003683,IRIS_313-10109:0.028302):0.0025937,(IRIS_313-8536:0.0322788,IRIS_313-9582:0.0305123):0.0019423):0.0012412):0.0023261):5.075E-4,(IRIS_313-8723:0.03379,IRIS_313-9409:0.0337559):0.0034084):0.0023567,(((((IRIS_313-11317:0.0250994,IRIS_313-10814:0.0207612):0.0092948,((IRIS_313-10938:0.0302266,IRIS_313-11556:0.0325878):0.0014211,(((IRIS_313-10687:0.0020774,IRIS_313-8606:0.0016701):0.0087639,(IRIS_313-11974:1.867E-4,IRIS_313-8681:2.164E-4):0.0101141):0.0144842,IRIS_313-11830:0.02232):0.011373):4.092E-4):1.643E-4,(((IRIS_313-10961:0.0161995,IRIS_313-10962:-1.087E-4):0.0118617,(IRIS_313-10943:0.0239544,IRIS_313-10797:0.0237457):0.0041442):0.0041925,IRIS_313-8492:0.031275):0.0010903):0.0025237,(((IRIS_313-10697:0.0266908,IRIS_313-8407:0.0325249):0.0030385,IRIS_313-8591:0.0296953):0.0049761,IRIS_313-8643:0.032496):0.0011966):0.0016779,IRIS_313-10935:0.0329976):0.0021959):0.001121):7.32E-4,((IRIS_313-10760:0.0351446,(((((IRIS_313-9098:0.0192356,IRIS_313-9054:0.0180915):0.0031848,IRIS_313-8493:0.0220993):0.006948,IRIS_313-9310:0.0289098):0.0010956,(IRIS_313-8767:0.0260147,IRIS_313-8457:0.0300693):0.0028838):0.0017163,(IRIS_313-8291:0.0241611,IRIS_313-8978:0.0244865):0.0082948):0.0032308):0.0022487,IRIS_313-9097:0.0363354):0.0027571):3.12E-4,((IRIS_313-10762:0.0291267,IRIS_313-11902:0.0284359):0.0042263,IRIS_313-10818:0.0360703):0.0063672):5.412E-4,((((((IRIS_313-10821:0.0079911,IRIS_313-8744:0.0064354):0.0244884,IRIS_313-10820:0.0263626):8.735E-4,IRIS_313-10742:0.0312088):0.0023174,IRIS_313-10819:0.036579):7.332E-4,IRIS_313-10823:0.0318068):7.444E-4,IRIS_313-12081:0.0334961):0.0047448):0.0013415,((((((IRIS_313-11160:0.0231324,IRIS_313-11108:0.0227546):0.0144094,IRIS_313-8781:0.0341145):0.0032876,((((IRIS_313-11098:0.0258207,((((((((IRIS_313-10707:4.569E-4,IRIS_313-9070:-1.047E-4):0.0184154,(IRIS_313-10701:0.0129746,IRIS_313-11554:0.013946):0.0047243):0.0021087,IRIS_313-10706:0.0196787):0.0023281,IRIS_313-10698:0.0212427):0.0027242,IRIS_313-11850:0.0265946):0.0030772,IRIS_313-11976:0.0283138):0.0026054,(IRIS_313-8468:0.0266287,IRIS_313-8557:0.0266524):0.002424):0.001217,(((IRIS_313-10684:-4.601E-4,IRIS_313-8312:7.56E-4):0.0259593,(IRIS_313-10428:0.0187627,IRIS_313-9699:0.019327):0.0065127):0.0033666,IRIS_313-8316:0.0306719):0.0031821):0.0019364):0.0025776,(((((IRIS_313-10757:0.0131692,IRIS_313-10650:0.0071827):0.0197844,(IRIS_313-10699:0.0316454,IRIS_313-12005:0.030879):0.001015):0.0011582,(IRIS_313-10700:0.0304586,IRIS_313-11706:0.0368343):0.001546):3.796E-4,(IRIS_313-11901:0.0191527,IRIS_313-11833:0.0182201):0.0149526):0.0011794,(IRIS_313-11534:0.0291473,(IRIS_313-11610:0.0296344,IRIS_313-11608:0.02837):0.0049434):5.34E-4):0.0014834):3.025E-4,(IRIS_313-10688:0.0269817,(IRIS_313-12240:0.0246603,IRIS_313-11840:0.0245846):0.0034036):0.0074535):9.81E-5,((IRIS_313-10937:0.0309866,IRIS_313-10702:0.0318638):0.0020152,IRIS_313-11842:0.0321133):0.0044131):0.0016909):5.839E-4,IRIS_313-8466:0.0373843):0.0021473,IRIS_313-9697:0.0295409):0.0015767,(IRIS_313-11006:0.0377544,IRIS_313-11609:0.037931):0.0019893):0.0013663):0.0013243,((IRIS_313-10995:0.0265921,IRIS_313-10947:0.0265552):0.0076688,(IRIS_313-9197:0.0234937,IRIS_313-9590:0.0277475):0.0068346):0.0061648):0.0026496,(((((IRIS_313-11181:0.0277166,IRIS_313-10942:0.0267985):0.0012462,IRIS_313-9208:0.0289553):0.0037651,IRIS_313-12053:0.0307279):0.0074735,IRIS_313-12027:0.0381568):0.0049602,IRIS_313-10944:0.0447962):0.002145):8.686E-4,(((IRIS_313-12282:8.743E-4,IRIS_313-12283:0.0014784):0.027145,IRIS_313-10050:0.0333744):0.0090051,(IRIS_313-12280:0.0368419,(IRIS_313-11977:0.0141019,IRIS_313-11757:0.0172221):0.0217383):0.0038666):0.0045589):7.773E-4,(IRIS_313-10572:0.0266392,IRIS_313-9685:0.0447047):0.0024898):8.116E-4):4.859E-4,((((((((((((CX98:0.034234,(IRIS_313-11409:0.0197256,IRIS_313-8568:0.0187935):0.0143293):7.715E-4,IRIS_313-12052:0.0405275):0.0016494,IRIS_313-10542:0.0346292):0.0062986,IRIS_313-9516:0.0223082):0.0027372,((((((IRIS_313-10850:0.0236419,IRIS_313-7722:0.0368947):7.805E-4,((IRIS_313-12004:0.0434333,IRIS_313-7646:0.0235351):0.0024531,IRIS_313-11754:0.0385054):0.0022106):0.00654,IRIS_313-9648:0.0335732):0.0032013,(((((IRIS_313-12065:9.42E-4,IRIS_313-9778:0.0018257):0.0220465,IRIS_313-11663:0.0192973):0.0163412,(IRIS_313-11766:0.0344984,IRIS_313-9388:0.0265059):0.006501):0.0036929,IRIS_313-11478:0.0335996):0.0011343,IRIS_313-10026:0.031822):0.0027156):0.0054626,(IRIS_313-10536:0.0285068,(IRIS_313-9384:0.0215631,(IRIS_313-11453:0.0114292,IRIS_313-11497:0.011651):0.0097561):0.0060409):0.0082956):0.0022564,((((((((((B052:0.0219767,((IRIS_313-7728:-2.25E-5,IRIS_313-9732:2.519E-4):0.0132654,IRIS_313-7720:0.0138278):0.0038421):0.0038253,IRIS_313-10102:0.0218901):8.992E-4,((IRIS_313-7799:0.0229485,(((((IRIS_313-7650:0.0118538,IRIS_313-7758:0.0146036):0.0032132,IRIS_313-9740:0.0178159):0.0013219,((IRIS_313-11772:0.0118277,(IRIS_313-10030:0.005364,IRIS_313-8595:0.0054763):0.0070035):0.0034435,IRIS_313-11791:0.0090231):0.0018121):0.002534,IRIS_313-8739:0.0218066):0.0022922,IRIS_313-10114:0.0227002):7.614E-4):0.0019681,IRIS_313-7651:0.0242332):0.0024534):0.0042987,IRIS_313-12284:0.0266425):0.0011123,IRIS_313-12082:0.0257815):0.0014725,(IRIS_313-12083:0.0137969,IRIS_313-11793:0.0129441):0.0142848):0.0021617,((IRIS_313-12118:0.0259968,IRIS_313-11761:0.0248992):0.0012879,(IRIS_313-11789:0.0211288,IRIS_313-11794:0.0206354):0.0044832):0.0016677):0.0029206,(IRIS_313-12278:0.020048,IRIS_313-11811:0.0199288):0.0067949):0.0033791,((((((((((IRIS_313-10678:-1.594E-4,IRIS_313-7795:3.171E-4):0.0043374,(IRIS_313-7793:1.585E-4,IRIS_313-9709:1.71E-5):0.0044707):0.0017592,IRIS_313-9551:0.006596):0.0092915,IRIS_313-7725:0.0216848):0.0026606,IRIS_313-11760:0.0205074):0.0022715,(IRIS_313-11932:2.488E-4,IRIS_313-11782:7.07E-5):0.0265438):0.0038274,IRIS_313-11914:0.0334718):0.0012105,IRIS_313-10035:0.0335315):0.0033339,IRIS_313-9817:0.0431949):0.0011739,IRIS_313-9187:0.0319726):0.0012808):0.0038228,IRIS_313-11767:0.0462496):0.0034141):0.0019723):0.0016608,(((IRIS_313-11120:0.0239263,IRIS_313-11648:0.0171037):0.0077985,IRIS_313-9557:0.0320514):0.0106951,(((IRIS_313-11354:0.0013797,IRIS_313-10756:-4.158E-4):0.0333384,IRIS_313-7736:0.0340644):0.0014589,IRIS_313-10348:0.0241384):0.0094342):8.756E-4):3.984E-4,(((((((((((((((IRIS_313-11370:0.0023229,IRIS_313-11824:0.0027514):0.0015306,IRIS_313-11822:0.0040843):0.0190674,IRIS_313-9547:0.0235934):5.807E-4,IRIS_313-8757:0.0261255):0.0011275,IRIS_313-11606:0.0265723):0.0021342,(((CX130:0.0123712,(((IRIS_313-11919:0.0172282,IRIS_313-11600:0.0174512):0.0013715,(IRIS_313-8731:0.0170094,IRIS_313-8796:0.0189278):0.0013543):0.003178,(IRIS_313-11597:0.0211894,IRIS_313-11738:0.020384):0.0023321):0.0026191):0.002487,((IRIS_313-8924:0.0190895,IRIS_313-11446:0.0181397):0.0070682,IRIS_313-9611:0.0256293):0.001902):0.001506,IRIS_313-8988:0.0270537):9.198E-4):0.0023709,((((IRIS_313-11828:0.0205547,IRIS_313-11640:0.0199537):0.0062701,(IRIS_313-9492:0.021296,IRIS_313-11641:0.0187615):0.0055317):0.0029043,IRIS_313-11647:0.0313369):0.0013623,(IRIS_313-8303:0.0246865,(IRIS_313-9258:0.0207952,IRIS_313-11642:0.0191068):0.0066104):0.0039012):0.0016599):0.001153,IRIS_313-11821:0.0339663):0.0014653,(IRIS_313-11361:0.0319989,(IRIS_313-11167:0.0214835,IRIS_313-11445:0.0210965):0.0120766):0.0032881):2.541E-4,(((((IRIS_313-11372:0.0220843,IRIS_313-11827:0.0240046):0.0046978,IRIS_313-11408:0.0291841):0.0030965,IRIS_313-11823:0.0308737):0.0013473,((IRIS_313-10628:0.0137561,IRIS_313-8614:0.0141763):0.0152534,(IRIS_313-8450:0.030617,(IRIS_313-10010:0.0231513,IRIS_313-11607:0.0243497):0.0049917):0.0010802):0.001754):0.0016046,(IRIS_313-11969:0.0286059,((((IRIS_313-9403:0.0211869,IRIS_313-11671:0.0202586):0.0025559,IRIS_313-8704:0.0231146):0.0022601,IRIS_313-8305:0.0213465):0.0011995,IRIS_313-11460:0.0258957):0.0049345):0.0061116):9.283E-4):8.475E-4,(((IRIS_313-11285:0.0229334,IRIS_313-9287:0.0213744):0.0028592,IRIS_313-11566:0.0213491):0.0046513,IRIS_313-10863:0.0258277):0.0079381):3.273E-4,IRIS_313-11363:0.0383531):3.866E-4,(IRIS_313-11310:0.0310683,(IRIS_313-9795:0.0326787,IRIS_313-11638:0.0298584):0.0033732):0.003818):0.0015743,((IRIS_313-11212:0.0333259,(IRIS_313-11211:0.0296079,(IRIS_313-8509:0.0256656,IRIS_313-9072:0.0252593):0.0014679):0.003837):0.0050095,((B031:0.0094108,IRIS_313-11491:0.0219406):0.0074319,B087:0.0103209):0.0062069):7.983E-4):6.728E-4,(((IRIS_313-11364:0.0451641,IRIS_313-9120:0.0156471):0.0064702,IRIS_313-11650:0.0442046):9.003E-4,(IRIS_313-11563:0.024874,IRIS_313-11628:0.0084744):0.0110056):0.0032129):6.976E-4):0.0010019,(((((((CX153:0.0232932,(IRIS_313-10975:0.020553,IRIS_313-9617:0.0231703):0.0035163):0.002712,IRIS_313-11113:0.0274365):0.0062167,(IRIS_313-11368:0.0321697,IRIS_313-10974:0.0327451):0.0043264):0.0039009,(((((IRIS_313-11115:0.0145484,(IRIS_313-10977:0.0185812,IRIS_313-8733:0.0188115):0.0039241):0.0047572,IRIS_313-10973:0.0240165):0.0054272,IRIS_313-9067:0.0356051):0.0033228,(IRIS_313-10982:0.0283626,IRIS_313-10539:0.0313705):0.0045659):0.0033436,((IRIS_313-11207:0.030665,IRIS_313-8717:0.0256807):0.007213,((IRIS_313-10972:0.0202039,IRIS_313-8349:0.0367639):0.0020577,(IRIS_313-11918:-0.0084289,IRIS_313-11945:0.0259086):0.0116569):0.0011104):0.0010577):7.535E-4):0.0020532,(((IRIS_313-11209:0.0281483,IRIS_313-10971:0.0211362):0.0086606,((IRIS_313-11300:0.0306919,IRIS_313-11487:0.0255183):0.0014065,IRIS_313-9148:0.0280279):0.011132):0.0025273,(IRIS_313-12013:0.0262679,IRIS_313-11565:0.0294418):0.0098556):0.0013866):0.001363,IRIS_313-11448:0.0432753):0.0010558,(((((IRIS_313-11367:0.0315341,((IRIS_313-11339:0.0340487,IRIS_313-10986:0.0275969):0.0023474,((IRIS_313-10984:0.0251018,IRIS_313-11558:0.0257533):0.0031476,IRIS_313-8632:0.0288503):0.0025862):3.307E-4):0.0020171,IRIS_313-11964:0.0331996):0.0019967,((IRIS_313-10667:0.0234764,IRIS_313-8850:0.0240316):0.011745,IRIS_313-11561:0.0332469):0.0045644):0.0010921,((IRIS_313-10929:0.0332553,IRIS_313-8530:0.0371643):0.0021272,IRIS_313-10668:0.0368965):5.053E-4):0.0021355,IRIS_313-9825:0.0188573):5.568E-4):0.0011141):2.158E-4,((((((((IRIS_313-11369:0.0036737,(IRIS_313-11224:-1.441E-4,(IRIS_313-10640:1.04E-5,IRIS_313-11723:2.896E-4):1.786E-4):0.0037033):0.0184265,IRIS_313-8922:0.0035005):0.0068586,IRIS_313-11359:0.028661):0.0024699,IRIS_313-10422:0.0312047):0.0043121,((((((IRIS_313-11418:0.0164766,((IRIS_313-11221:0.0126337,(IRIS_313-10576:0.0052053,IRIS_313-12014:0.010583):0.0033555):0.0012915,IRIS_313-9360:0.0151466):0.0018802):0.0018516,(IRIS_313-12325:0.0120423,IRIS_313-11657:0.015001):0.0053257):0.0038689,IRIS_313-12015:0.0221971):0.0057978,IRIS_313-11500:0.02573):0.0030675,IRIS_313-11920:0.0325328):0.0042133,IRIS_313-11235:0.0382872):0.0015001):0.0030282,(((IRIS_313-11228:0.0072732,IRIS_313-11226:0.0184828):0.0062076,IRIS_313-8737:0.025875):0.0099594,IRIS_313-11231:0.0346059):0.003686):0.0014521,((IRIS_313-11227:9.743E-4,IRIS_313-11230:-8.638E-4):0.0323231,IRIS_313-9049:0.035862):0.0085848):0.0026333,((((IRIS_313-11253:0.016439,IRIS_313-10325:0.0096928):0.0127377,(((IRIS_313-9939:0.0091157,IRIS_313-9464:0.0089864):0.0210362,IRIS_313-9841:0.0235803):0.0027211,IRIS_313-9600:0.0302898):0.0090582):0.0107377,IRIS_313-10318:0.039355):0.0036087,IRIS_313-11646:0.0362674):0.0035208):0.0016699):9.193E-4,((((((((IRIS_313-11404:0.0325236,(IRIS_313-11301:0.0289661,(((IRIS_313-11114:0.0166837,IRIS_313-11294:0.0199227):0.0044828,IRIS_313-9936:0.0215781):0.003761,IRIS_313-11449:0.0362029):0.0046611):0.0047009):5.938E-4,IRIS_313-11292:0.0383731):0.0024177,IRIS_313-11204:0.0374522):0.001847,((IRIS_313-11321:0.0311545,IRIS_313-11271:0.0296156):0.0014674,IRIS_313-10978:0.0351612):0.004336):4.708E-4,(((((((IRIS_313-11400:0.0127968,IRIS_313-11208:0.0147405):0.0160723,IRIS_313-11225:0.0273007):0.0071033,((IRIS_313-11205:0.0271364,IRIS_313-11219:0.0239006):0.006299,IRIS_313-10983:0.0309316):5.928E-4):0.0022526,(((IRIS_313-11222:-6.692E-4,IRIS_313-9397:9.342E-4):0.0292817,(IRIS_313-9433:0.0194425,IRIS_313-8703:0.0155014):0.0092602):0.0041424,((IRIS_313-9218:0.0225045,IRIS_313-9391:0.022579):0.0051572,((IRIS_313-8854:0.0113283,IRIS_313-9174:0.011496):0.0151619,IRIS_313-8683:0.0257464):0.0029264):0.0016637):0.0019457):0.0026961,(IRIS_313-11229:0.0293503,IRIS_313-9262:0.0288884):0.0060428):0.0010815,(IRIS_313-10885:0.0170564,IRIS_313-10077:0.0175137):0.0195722):0.0017181,((((IRIS_313-11220:0.027917,IRIS_313-10664:0.0270774):0.0013275,IRIS_313-9139:0.0298439):0.0025124,(IRIS_313-10985:0.0307938,IRIS_313-9271:0.0286862):0.0012061):0.004188,IRIS_313-11203:0.0356705):0.0027672):7.008E-4):0.0016871,(((((((IRIS_313-11365:6.507E-4,IRIS_313-8846:-4.463E-4):3.028E-4,IRIS_313-11273:-1.69E-4):0.0103434,IRIS_313-11256:0.010447):0.0161822,((IRIS_313-10880:0.0198497,IRIS_313-8900:0.0197828):0.0045165,B030:0.0229592):0.0025945):0.0037127,((IRIS_313-11308:0.0275596,(IRIS_313-11266:0.0224939,IRIS_313-10847:0.0232163):0.0020698):0.0025006,IRIS_313-11262:0.0277167):0.001831):0.0018438,IRIS_313-8844:0.0322076):0.004154,IRIS_313-11305:0.0373788):0.001778):7.98E-5,IRIS_313-11284:0.0286879):7.255E-4,((IRIS_313-11257:0.0202613,IRIS_313-9347:0.0333573):0.0050031,IRIS_313-10855:0.0383781):0.0020115):0.0018713):6.213E-4,((((IRIS_313-11416:0.034244,IRIS_313-10519:0.0388996):7.147E-4,(IRIS_313-10989:0.0275108,IRIS_313-10988:0.0049406):0.0092873):9.262E-4,(IRIS_313-10825:0.0230772,IRIS_313-10574:0.0338162):0.004633):0.001955,((((((IRIS_313-11421:0.0338587,(IRIS_313-9259:0.0333669,IRIS_313-8957:0.0299962):0.001505):0.0025822,((IRIS_313-8920:0.0303545,IRIS_313-9606:0.0285412):0.002038,IRIS_313-11599:0.0287943):0.003603):0.0021051,(IRIS_313-11407:0.0383419,IRIS_313-11242:0.0024394):0.0024253):0.0011267,((IRIS_313-11282:0.027988,IRIS_313-11490:0.0231537):0.0048262,IRIS_313-9619:0.0297969):0.0077231):0.001238,(IRIS_313-11199:0.0398173,IRIS_313-7681:0.038012):0.0021434):0.0019855,((((IRIS_313-11358:0.0099789,IRIS_313-11349:0.0097971):0.0222687,(((IRIS_313-11351:0.0199657,IRIS_313-9121:0.0223553):0.0053186,(IRIS_313-11762:0.0224041,IRIS_313-9348:0.0263815):0.0081995):0.0011299,IRIS_313-9156:0.0291682):0.0020928):0.0020184,IRIS_313-11267:0.0347135):0.0033141,IRIS_313-9190:0.0170425):0.0034572):7.754E-4):0.0011757):9.931E-4,(((IRIS_313-11410:0.0238473,((IRIS_313-11405:0.0085375,IRIS_313-10526:0.0298788):0.0019813,IRIS_313-11431:0.0457798):7.886E-4):0.0049587,((((IRIS_313-11419:0.0295677,IRIS_313-11040:0.0289699):0.0023845,IRIS_313-8657:0.0282608):0.0033137,IRIS_313-11042:0.035623):0.0049137,IRIS_313-9935:0.0344511):0.0021282):0.0045326,IRIS_313-9091:0.0395762):0.0017332):1.736E-4):8.25E-5,((((((((((((((CX390:0.0084539,B108:0.0149549):0.0017832,(((B210:0.0108785,B222:0.0024714):0.0087136,B093:0.0171923):0.0039746,B091:0.02459):9.457E-4):0.0020113,B268:0.0220878):0.0068624,B203:0.0333348):0.0025984,B247:0.0224029):0.0033732,(CX51:0.0276178,((((B219:0.0233913,B165:0.024273):0.0064216,IRIS_313-11521:0.0314045):0.002611,(((B106:0.0286622,(IRIS_313-12207:0.0260409,IRIS_313-12028:0.0238058):0.0024806):8.694E-4,B097:0.0291601):8.357E-4,IRIS_313-12190:0.0300349):0.0030133):0.0011821,(IRIS_313-12072:0.0326951,IRIS_313-12050:0.0294071):0.0032557):0.0017105):0.0017887):8.401E-4,(B224:0.0371291,((B229:0.0025465,B089:-0.00223):0.0316681,(B096:0.0270655,IRIS_313-11957:0.0290826):0.0054786):0.0037927):0.0025831):9.003E-4,((B238:0.0285204,B123:0.0276461):0.008311,((B239:0.0111541,B094:-0.0016726):0.0080606,B090:0.0211913):0.0063614):0.0035397):0.0011693,CX115:0.0443349):0.0011065,(((IRIS_313-11403:0.0273068,IRIS_313-11299:0.0285929):0.0074783,IRIS_313-8332:0.0321923):0.0047028,IRIS_313-11817:0.0214381):0.0027837):0.0018878,(((((((CX128:0.034354,((((IRIS_313-11309:0.0225216,(((IRIS_313-10924:0.0010836,(IRIS_313-12138:4.266E-4,IRIS_313-12180:5.534E-4):0.0010142):0.0127614,IRIS_313-12182:0.0136871):0.0017822,IRIS_313-12093:0.0164423):0.0047966):0.0038163,IRIS_313-9593:0.0227819):0.0026595,((IRIS_313-11304:0.0102066,IRIS_313-11276:-1.97E-5):0.0113786,IRIS_313-11447:0.0184121):0.0079854):0.0035479,IRIS_313-8453:0.0316197):0.0036367):0.0018126,IRIS_313-9427:0.0359734):0.0011429,((((((IRIS_313-11402:0.0056826,IRIS_313-11307:0.0067118):0.0243346,(IRIS_313-10674:0.0260035,IRIS_313-11548:0.0249097):0.0036918):0.0012538,IRIS_313-11546:0.0286662):0.0030234,IRIS_313-8659:0.030587):0.0033244,IRIS_313-12291:0.0337624):0.0018605,IRIS_313-11278:0.0344655):0.0014529):3.781E-4,(IRIS_313-11279:0.0335576,IRIS_313-8386:0.0368992):0.0020969):0.0010123,((IRIS_313-11302:0.0339911,IRIS_313-11303:0.0033579):0.0149187,IRIS_313-8414:0.0426465):0.0023976):8.486E-4,(((((((((IRIS_313-11264:0.0162345,IRIS_313-8994:0.0176647):0.0084957,IRIS_313-9634:0.0278161):0.0021188,(IRIS_313-9560:0.0226773,IRIS_313-11443:0.0236252):0.0051594):0.0028384,(IRIS_313-11260:0.0070599,IRIS_313-11261:0.0246974):0.0120035):3.322E-4,(IRIS_313-11287:0.0208108,IRIS_313-10666:0.0216362):0.0078346):0.0039645,((IRIS_313-11286:0.035772,(IRIS_313-12270:0.0250518,(IRIS_313-12268:0.0124543,IRIS_313-8585:0.0130704):0.0118454):0.0066388):0.0029099,((((IRIS_313-10887:0.0207523,IRIS_313-8946:0.0230395):0.0095671,IRIS_313-11549:0.0286508):0.0023964,(IRIS_313-12290:0.0201885,IRIS_313-11541:0.02059):0.0107038):0.0010426,IRIS_313-10733:0.032555):0.0011057):0.0012485):0.0017325,IRIS_313-9484:0.0343745):0.0017288,IRIS_313-11296:0.0364893):1.252E-4,((((IRIS_313-11283:0.0288453,(IRIS_313-10917:0.0102544,IRIS_313-9609:0.0103326):0.0145333):0.0056856,IRIS_313-8401:0.0327206):0.0045653,(IRIS_313-8603:0.0318287,IRIS_313-11442:0.0261313):0.0063338):0.0016776,(((IRIS_313-10518:-3.75E-5,IRIS_313-10575:2.836E-4):0.0326013,(IRIS_313-8315:0.030895,IRIS_313-10007:0.0322379):7.798E-4):0.0032562,IRIS_313-9424:0.032534):0.0023667):9.971E-4):0.0032425):1.18E-4,(((((IRIS_313-11255:0.0265761,IRIS_313-9572:0.0287632):0.0034613,IRIS_313-11306:0.0288412):9.845E-4,(((IRIS_313-10671:0.0105856,IRIS_313-8986:0.0148546):0.0136696,IRIS_313-8982:0.02535):0.0013652,IRIS_313-10675:0.0239307):0.0080489):0.0074661,(((IRIS_313-11295:0.0352633,((IRIS_313-10857:0.0215501,IRIS_313-9313:0.0189612):0.0062206,IRIS_313-10676:0.0278449):0.0068169):0.004677,IRIS_313-10859:0.0347171):0.0048997,IRIS_313-10858:0.0348679):0.0056297):0.003992,(IRIS_313-11137:0.0372502,IRIS_313-11275:0.0412902):0.0030522):0.0016495):3.388E-4):7.84E-4,((IRIS_313-11131:0.0453876,IRIS_313-11134:0.0410119):0.0048859,((IRIS_313-12329:0.0303933,IRIS_313-12297:0.0305502):0.0065551,(IRIS_313-11818:0.021147,IRIS_313-11816:0.0229788):0.0186938):0.0020158):0.0010851):0.0010106,(((((((((((((CX71:0.009889,(IRIS_313-11150:0.0087477,IRIS_313-8697:0.0091879):0.0021784):0.0099435,IRIS_313-11406:0.0207687):0.0060403,(IRIS_313-9533:0.0174109,IRIS_313-11543:0.0181958):0.008298):0.0069744,(((IRIS_313-11812:0.0177153,IRIS_313-11815:0.0186178):0.0036991,IRIS_313-11810:0.0245631):0.0053081,(IRIS_313-8909:0.0226752,IRIS_313-9989:0.0230933):0.0057417):0.0039011):0.0019942,(((((((CX154:-1.1E-6,IRIS_313-10151:1.766E-4):4.546E-4,IRIS_313-8253:5.413E-4):0.0086641,IRIS_313-12128:0.0089478):0.0047767,IRIS_313-12287:0.0144709):0.0068947,IRIS_313-11386:0.0149268):0.0110752,(IRIS_313-10910:0.0286999,IRIS_313-9898:0.0283748):0.003504):0.0022629,(IRIS_313-10694:0.0222373,IRIS_313-9286:0.0261815):0.0088036):0.0021504):0.0036493,(((IRIS_313-10517:0.0279441,IRIS_313-12066:0.0283256):0.0056302,IRIS_313-10509:0.0323217):0.001889,((IRIS_313-11814:0.0224886,IRIS_313-11779:0.0246552):0.0047726,IRIS_313-11813:0.0298621):0.0059146):0.0024488):0.0025632,(((((((IRIS_313-11393:0.0231463,IRIS_313-11710:0.0201457):0.0106038,(IRIS_313-11921:0.0253123,IRIS_313-11707:0.0265587):0.0044326):8.815E-4,IRIS_313-9209:0.0320909):0.0014184,(IRIS_313-10511:0.0321447,IRIS_313-9288:0.0311682):0.0012893):0.0021071,(((((IRIS_313-11838:0.0258624,IRIS_313-11684:0.0258749):0.0041796,IRIS_313-8785:0.0304218):8.379E-4,(IRIS_313-8702:0.0215781,IRIS_313-10134:0.0088546):0.0102737):0.001214,(IRIS_313-11848:-0.0064257,IRIS_313-11836:0.0229492):0.0112879):9.751E-4,(IRIS_313-9575:0.0280023,IRIS_313-11687:0.0295177):0.0052674):0.0011421):0.0029117,(((((((((IRIS_313-11389:0.0214993,(IRIS_313-10524:0.0163169,IRIS_313-11962:0.0148446):0.0040641):0.0031453,IRIS_313-8870:0.0227864):0.0014648,IRIS_313-9567:0.0241776):0.0048052,((((IRIS_313-11149:0.0101568,IRIS_313-9020:0.0094929):0.0108959,IRIS_313-12039:0.0206608):0.0018106,IRIS_313-11509:0.0237059):0.0030391,IRIS_313-9406:0.0244383):0.003901):0.0017141,IRIS_313-8895:0.0314191):0.0022763,IRIS_313-11236:0.0348908):0.0022869,(IRIS_313-11079:-0.0030241,(IRIS_313-11087:0.0048134,IRIS_313-12152:0.00273):0.0178462):0.0132841):0.0022486,(IRIS_313-10506:0.0346261,IRIS_313-8996:0.0318859):0.00427):0.0012592,((IRIS_313-11084:0.0302597,(IRIS_313-12251:0.0194319,(IRIS_313-12143:0.016208,(IRIS_313-9809:-1.23E-5,IRIS_313-9415:1.187E-4):0.0151191):0.0045536):0.0107046):0.0049001,((IRIS_313-11194:0.0143652,IRIS_313-11708:0.0123682):0.0137872,IRIS_313-11683:0.0253988):0.0080102):0.0015294):0.0012107):0.001069,IRIS_313-11674:0.0388516):0.0012426):3.732E-4,((IRIS_313-11192:0.0131474,(IRIS_313-8679:1.612E-4,IRIS_313-9357:3.48E-5):0.0157536):0.0215431,(IRIS_313-12225:0.0354628,IRIS_313-11680:0.0324789):0.0027797):0.0020677):0.0024244,IRIS_313-9451:0.0311699):0.0011302,((((((IRIS_313-11391:0.0227849,IRIS_313-11388:0.0241107):0.0054419,IRIS_313-11635:0.0274531):0.007789,(((((((((((IRIS_313-11390:0.0010362,IRIS_313-11719:-5.545E-4):3.724E-4,IRIS_313-12193:-2.972E-4):4.774E-4,IRIS_313-12224:-3.675E-4):0.0183186,IRIS_313-11074:0.018035):0.0036199,IRIS_313-9006:0.022519):0.0034523,IRIS_313-11700:0.0250738):0.0028918,IRIS_313-12259:0.0290948):0.0030358,(((IRIS_313-12334:0.0167628,(IRIS_313-12194:6.974E-4,IRIS_313-8638:0.0010289):0.0163528):0.0053917,IRIS_313-12130:0.0244067):0.0075627,((IRIS_313-12133:0.0181254,IRIS_313-11705:0.0190769):0.0071644,((IRIS_313-12127:0.003769,IRIS_313-12309:0.0040986):0.0187596,IRIS_313-11682:0.0217129):0.0065609):0.0035257):8.125E-4):8.652E-4,IRIS_313-9669:0.0321523):0.0010931,((IRIS_313-10934:-2.321E-4,IRIS_313-11721:4.774E-4):0.028626,IRIS_313-10680:0.0297564):0.0036919):0.0014662,((((((IRIS_313-11082:0.0158026,IRIS_313-12260:0.0165627):0.0098095,((((IRIS_313-11090:0.0146013,IRIS_313-11927:0.0116172):0.0047535,(IRIS_313-11961:0.0091891,IRIS_313-11678:0.009464):0.0059267):0.0034982,IRIS_313-11676:0.0195879):0.002939,IRIS_313-10659:0.0217169):0.0036887):0.0021849,(IRIS_313-11095:-0.0099358,IRIS_313-12231:0.0174989):0.009231):0.0025108,IRIS_313-10681:0.0298751):0.0020568,IRIS_313-12263:0.0298745):0.0020455,(((IRIS_313-11133:0.0217475,IRIS_313-11898:0.020559):0.0036039,(IRIS_313-11083:1.646E-4,((IRIS_313-10683:8.93E-5,IRIS_313-10682:1.906E-4):4.57E-5,IRIS_313-12305:5.92E-5):4.06E-5):0.0246386):0.0051254,((IRIS_313-11086:0.0193605,IRIS_313-12049:0.0173906):0.0108964,IRIS_313-11076:0.0283411):8.002E-4):0.0049673):0.0013071):0.001923):8.275E-4,(((((IRIS_313-11081:0.0223253,((IRIS_313-8586:0.0203001,IRIS_313-11686:0.020663):0.0027049,IRIS_313-9062:0.0245242):0.0011897):0.0035101,IRIS_313-8474:0.0268558):0.0018983,(IRIS_313-8980:-1.85E-5,(IRIS_313-8722:2.3E-5,IRIS_313-11720:1.524E-4):8.05E-5):0.0287853):0.0031516,(IRIS_313-12221:0.0295251,IRIS_313-11711:0.0318512):0.0025288):0.0021883,IRIS_313-11685:0.0334185):0.0026916):0.002258,((IRIS_313-10651:0.0236952,(IRIS_313-12301:0.0157092,IRIS_313-12302:0.0165138):0.0071292):0.0066519,IRIS_313-12303:0.0287431):0.0084095):9.869E-4,IRIS_313-10441:0.0128522):0.0035343):3.077E-4,(((IRIS_313-11193:0.0384171,IRIS_313-11728:0.0330836):0.0049152,((((IRIS_313-12131:0.0148783,IRIS_313-9198:0.0121516):0.019064,IRIS_313-11508:0.0334447):0.0018015,(IRIS_313-12261:0.0284819,IRIS_313-11839:0.0233645):0.0061324):0.0020202,IRIS_313-12220:0.0336576):9.803E-4):0.0016474,(((B107:0.0263084,IRIS_313-12300:0.0258949):0.0072094,IRIS_313-12185:0.034701):0.0037554,IRIS_313-11835:0.0164805):0.002001):8.744E-4):0.0011384,(((((((IRIS_313-11343:0.0332585,(((IRIS_313-11331:0.0130346,IRIS_313-8948:0.0172422):0.0066677,IRIS_313-11334:0.0272541):0.0058227,((IRIS_313-11330:0.0254554,IRIS_313-11472:0.0236363):0.0022708,IRIS_313-8567:0.0265749):0.0042479):0.0025921):0.0014882,IRIS_313-11485:0.0355065):0.0017549,IRIS_313-11341:0.0398844):0.0046348,((((((((IRIS_313-11096:0.0345989,(IRIS_313-10905:0.0253633,IRIS_313-10755:0.0246227):0.0035733):0.001554,(IRIS_313-10750:0.0262848,(IRIS_313-10556:0.0178024,IRIS_313-11895:0.0198524):0.0077139):0.0032776):0.0026612,IRIS_313-11254:0.0352506):0.0017571,(IRIS_313-11118:0.0349753,IRIS_313-9131:0.032996):5.093E-4):0.0019756,((((((((((IRIS_313-11088:0.0033943,IRIS_313-11072:-0.0029222):0.0219141,IRIS_313-12044:0.0217716):0.0090961,(((IRIS_313-12042:0.027461,IRIS_313-11843:0.0276792):0.0014431,IRIS_313-12000:0.030238):9.447E-4,IRIS_313-12040:0.0304358):4.644E-4):0.00112,((((IRIS_313-10908:1.953E-4,IRIS_313-10909:1.394E-4):0.0221471,IRIS_313-12037:0.0216725):0.006793,(IRIS_313-10901:0.0163382,IRIS_313-10904:0.0179336):0.0081595):0.0026843,((IRIS_313-10912:0.0267881,(IRIS_313-11936:0.0196808,IRIS_313-12102:0.0201522):0.0088267):0.0022718,IRIS_313-12097:0.0298402):0.0010817):5.901E-4):6.799E-4,((IRIS_313-10749:0.0239727,IRIS_313-12041:0.0258029):0.0028165,(IRIS_313-11896:0.0267092,IRIS_313-12038:0.028823):3.99E-4):0.0027549):7.18E-4,IRIS_313-10911:0.0303462):9.361E-4,((IRIS_313-10970:0.0159516,IRIS_313-10897:0.0160206):0.0103644,IRIS_313-11998:0.0283027):0.00694):7.551E-4,(IRIS_313-11999:0.0251369,IRIS_313-12036:0.0057458):0.009829):4.41E-4,IRIS_313-10557:0.0352076):0.001447,(((IRIS_313-10902:0.0121603,(IRIS_313-10915:0.0163529,IRIS_313-11935:0.0197171):0.0053568):0.0046179,(IRIS_313-12058:0.0257344,IRIS_313-12101:0.0276518):0.0039083):7.735E-4,IRIS_313-11688:0.0318295):0.0028599):0.0011422):9.271E-4,(IRIS_313-12142:0.0355773,(IRIS_313-8985:0.0329142,IRIS_313-11709:0.0330105):0.0025653):0.002258):0.0018301,((((((IRIS_313-10900:1.044E-4,IRIS_313-10899:2.131E-4):0.033028,(IRIS_313-12148:0.0303775,(IRIS_313-12161:0.0257592,IRIS_313-12043:0.0260625):0.0017753):0.0042113):0.0020008,IRIS_313-10907:0.0340195):0.0017674,IRIS_313-10555:0.0355515):0.0013995,(IRIS_313-10898:0.016772,IRIS_313-12151:0.0188442):0.018049):5.252E-4,(IRIS_313-10906:0.0341947,IRIS_313-11997:0.0288636):0.0044782):5.42E-4):0.0019002,IRIS_313-12109:0.036947):0.0012715):7.88E-4,((IRIS_313-11089:0.0135699,IRIS_313-10554:0.01258):0.0169884,IRIS_313-10913:0.0329465):0.0093099):2.65E-4,IRIS_313-10903:0.0407106):0.0013868,(((((((IRIS_313-11327:0.0199021,(((IRIS_313-11837:5.21E-5,(IRIS_313-11780:3.58E-5,IRIS_313-8571:1.388E-4):8.77E-5):4.54E-5,IRIS_313-11785:-5.0E-6):1.721E-4,IRIS_313-11820:-4.9E-5):0.0181501):0.0111447,IRIS_313-12247:0.0291005):0.0046512,(IRIS_313-12246:0.0280231,IRIS_313-12147:0.0292696):0.0029504):0.0025316,IRIS_313-10648:0.0369142):0.0041821,IRIS_313-12296:0.038111):0.0014166,IRIS_313-11849:0.0427298):0.0013838,(((IRIS_313-11085:0.0216551,(IRIS_313-10655:0.0133363,IRIS_313-11899:0.0133743):0.0067116):0.0040216,(((IRIS_313-11080:0.002081,IRIS_313-10921:0.0027745):0.0176031,(((IRIS_313-11091:0.0129141,IRIS_313-10654:0.0104011):0.0018892,IRIS_313-12222:0.0114208):0.0014588,((IRIS_313-10928:5.87E-5,IRIS_313-12249:2.561E-4):0.0021895,IRIS_313-11677:0.0029647):0.0110708):0.0071159):0.0044795,IRIS_313-9182:0.0239409):8.967E-4):0.0117601,(IRIS_313-12146:0.0238989,IRIS_313-11716:0.0256492):0.013819):0.005441):0.0019013):7.009E-4):2.347E-4,(((CX54:0.0273227,((((IRIS_313-11381:0.0214105,IRIS_313-11512:0.0189719):0.0071208,(IRIS_313-11196:0.0223797,IRIS_313-11996:0.0236259):0.0079344):0.004536,IRIS_313-8292:0.0337917):0.001031,((((((IRIS_313-11347:0.0140112,IRIS_313-11345:0.0121689):0.0017776,IRIS_313-7769:0.01472):0.004871,IRIS_313-9243:0.018614):0.0030699,(((((IRIS_313-11338:0.0045759,IRIS_313-10513:0.0056954):0.0088446,(IRIS_313-12187:-1.972E-4,(IRIS_313-12017:3.88E-5,IRIS_313-11740:1.903E-4):2.41E-4):0.0124797):0.0016148,IRIS_313-11463:0.0145841):0.002711,IRIS_313-8383:0.0144945):0.0019619,IRIS_313-10990:0.0198555):0.0010038):0.0059826,((IRIS_313-11071:0.0191193,(B246:0.0097377,B095:0.009078):0.0092581):0.0039336,IRIS_313-12210:0.0226117):0.0026079):0.0023666,IRIS_313-10966:0.0286434):0.0069885):0.0014959):0.0023846,(((IRIS_313-11377:0.0171158,(IRIS_313-11097:0.0096877,IRIS_313-10510:0.0081463):0.0192568):0.0059545,IRIS_313-11959:0.0333974):0.0049195,IRIS_313-10448:0.0351876):0.0036555):0.0043716,(((CX61:0.0305956,IRIS_313-11011:0.0301137):0.0133195,(((((((B265:0.0345653,(IRIS_313-11577:0.0232848,IRIS_313-11573:0.0219993):0.0090596):6.482E-4,(B076:0.0085873,IRIS_313-10239:0.0309525):0.002085):0.0013383,B075:0.0070948):0.0029201,((((((((((B207:1.437E-4,IRIS_313-10477:5.34E-5):0.0178932,IRIS_313-9184:0.0188198):0.0017656,(IRIS_313-8405:0.0166245,IRIS_313-11580:0.0168491):0.0026071):0.00849,IRIS_313-11744:0.0255838):0.005321,B135:0.0340782):0.0018172,IRIS_313-10221:0.0318163):8.144E-4,(IRIS_313-12011:0.0334213,(IRIS_313-11947:0.0290236,IRIS_313-9555:0.0270664):0.0035757):0.0030259):8.046E-4,((B082:0.028895,(B132:-0.0030159,B131:0.0034986):0.0319073):0.0018458,(IRIS_313-11967:0.0350108,((IRIS_313-12007:0.0271979,(IRIS_313-11985:5.35E-4,IRIS_313-10177:9.724E-4):0.0279999):0.0033637,(((IRIS_313-8743:0.0218605,IRIS_313-11694:0.0257068):0.003316,IRIS_313-11693:0.0276992):0.0038854,IRIS_313-9882:0.0307196):0.0031616):0.0024203):5.096E-4):0.0013525):7.566E-4,IRIS_313-8409:0.0364917):5.187E-4,(((((B073:-0.0019389,IRIS_313-11576:0.0021884):0.0213045,IRIS_313-10226:0.0222193):0.0049138,(IRIS_313-11748:0.0241393,IRIS_313-8889:0.0227071):0.0035887):0.0031608,(IRIS_313-12275:0.028781,(IRIS_313-10179:5.299E-4,IRIS_313-10034:-4.06E-4):0.0265737):0.0013159):0.0029236,IRIS_313-12057:0.0345319):0.0037161):0.0021892):0.0015411,B129:0.0350802):9.16E-4,(B113:0.0386922,IRIS_313-11572:0.0342365):9.883E-4):0.0014922,((B120:0.0386319,(((B133:0.027057,IRIS_313-10614:0.0316725):0.0145583,(IRIS_313-11910:0.0265603,IRIS_313-11735:0.0279417):0.0096896):0.0025745,IRIS_313-11695:0.0367379):0.0015974):0.0011671,((((B105:0.0254961,B118:0.0235074):0.0034311,IRIS_313-11726:0.0272095):0.0073013,IRIS_313-11730:0.0326871):0.0032773,(B044:0.0406416,IRIS_313-11894:0.0390448):0.0013788):0.0029675):0.0013929):1.303E-4):0.0020332,((((IRIS_313-11383:0.0221486,(IRIS_313-11384:0.0235876,B184:0.0162232):0.0011612):0.0119898,(IRIS_313-10751:0.0255675,IRIS_313-11893:0.0240585):0.0062519):0.0048748,B227:0.0339951):0.0085281,(((((IRIS_313-10748:0.022307,IRIS_313-8341:0.0260378):0.0061642,((IRIS_313-7778:0.0259724,IRIS_313-11594:0.0246806):0.0032719,IRIS_313-9317:0.0322755):0.0021599):0.0024227,(B006:0.031391,((B021:0.0119338,IRIS_313-12078:0.0109876):0.0183408,IRIS_313-9429:0.0289442):0.003551):7.862E-4):0.0037662,B007:0.0349313):0.0019503,IRIS_313-8880:0.047462):0.0020497):0.0015716):8.917E-4):0.0021741):5.638E-4):5.359E-4,((((((((((CX107:0.0263483,(((IRIS_313-12188:4.0E-5,IRIS_313-10147:2.224E-4):4.99E-5,IRIS_313-8485:3.13E-5):0.0143744,(IRIS_313-11991:4.978E-4,IRIS_313-11992:-2.468E-4):0.0153238):0.0149536):0.0054797,(((IRIS_313-11392:0.026168,IRIS_313-8674:0.0249758):0.0072336,((IRIS_313-10695:0.0266552,IRIS_313-11679:0.027366):0.0027834,IRIS_313-12121:0.0297955):0.001744):0.0012755,(IRIS_313-8793:0.0201612,IRIS_313-11530:0.0200444):0.012126):0.0023164):6.673E-4,(((((IRIS_313-11151:0.0208751,IRIS_313-11819:0.0212658):0.0084425,IRIS_313-10652:0.027191):0.0024806,IRIS_313-8751:0.0285966):0.0014418,IRIS_313-12286:0.030104):0.0030236,(IRIS_313-9281:0.0352557,IRIS_313-9342:0.0340547):8.726E-4):4.84E-4):9.125E-4,(IRIS_313-11844:0.0308051,(IRIS_313-11786:0.0056804,IRIS_313-11525:0.0057382):0.024416):0.0047654):0.0032789,IRIS_313-11142:0.0341972):0.0013054,IRIS_313-11139:0.0421267):0.0017538,((((IRIS_313-11140:0.0261909,IRIS_313-12292:0.0232823):0.0047164,IRIS_313-11148:0.0286188):0.0037343,IRIS_313-11764:0.0305736):0.0057307,(IRIS_313-11145:0.0314671,IRIS_313-12288:0.0309308):0.004929):0.0044602):8.492E-4,(((((IRIS_313-11399:0.0246268,IRIS_313-12269:0.024806):0.0111911,((IRIS_313-11147:0.01165,IRIS_313-10547:0.0089291):0.0144745,IRIS_313-11146:0.0226383):0.0086786):0.0022798,((IRIS_313-11141:0.0313727,(IRIS_313-8437:1.519E-4,IRIS_313-9594:4.07E-5):0.0308828):0.001232,IRIS_313-11129:0.0383825):0.0042321):0.0018435,IRIS_313-11132:0.016108):0.0051362,(IRIS_313-11136:0.0526153,IRIS_313-11144:0.0357896):0.0097245):5.376E-4):1.642E-4,((IRIS_313-11130:0.0187866,(IRIS_313-11993:0.0189907,IRIS_313-9969:0.020262):0.010604):0.0093292,IRIS_313-11143:0.0144858):0.005556):8.175E-4,((((((((IRIS_313-11099:0.0166203,IRIS_313-8391:0.0189337):0.0060744,IRIS_313-11983:0.0218677):0.0065394,IRIS_313-11940:0.0279983):0.0028235,(IRIS_313-10727:0.0332699,IRIS_313-10048:0.0399017):0.0016494):0.0034018,((IRIS_313-10724:0.0342093,(((IRIS_313-11939:0.0085702,IRIS_313-7620:0.0092332):0.0144214,IRIS_313-7719:0.0207174):0.0061461,IRIS_313-11523:0.0279451):0.0031233):0.0028105,IRIS_313-9926:0.0371669):0.0021329):0.0040224,((IRIS_313-11101:0.0165099,IRIS_313-11528:0.0168328):0.0195958,IRIS_313-10340:0.0373195):0.005135):0.0032006,(((((((IRIS_313-10728:0.0282107,IRIS_313-11773:0.0311978):0.0031039,IRIS_313-11938:0.0311865):0.0012485,((((IRIS_313-10723:0.0174854,IRIS_313-10573:0.0156074):0.0034726,IRIS_313-11758:0.0209131):0.005581,(IRIS_313-11988:0.0279193,IRIS_313-9986:0.0267373):0.0012629):0.0024322,((IRIS_313-11783:0.0174172,IRIS_313-9294:0.0164545):0.0058127,IRIS_313-10045:0.0252032):0.0049157):0.0020558):0.0027024,IRIS_313-9402:0.0351919):0.0012816,((((IRIS_313-10725:0.0215834,IRIS_313-11787:0.0220566):0.0115667,IRIS_313-11555:0.0317244):0.0021816,IRIS_313-11615:0.0369029):8.162E-4,IRIS_313-11975:0.0305436):0.0033112):0.0020231,IRIS_313-9687:0.041619):0.0012742,(((IRIS_313-10726:0.0284158,(IRIS_313-9461:0.0266087,IRIS_313-11551:0.0322661):0.0017582):0.0028964,(IRIS_313-9160:0.0234817,IRIS_313-8293:0.0223285):0.0084774):0.009678,IRIS_313-11724:0.0380253):0.0042019):0.0023402):3.445E-4,((((IRIS_313-11138:0.0375185,IRIS_313-11128:0.0151684):2.262E-4,(IRIS_313-10520:0.0355187,(IRIS_313-11544:2.2E-6,IRIS_313-11545:6.82E-5):0.034606):0.0035713):0.0020057,(IRIS_313-11126:0.0356091,IRIS_313-9285:0.0338854):0.0017792):0.0030283,((IRIS_313-11135:0.0368354,IRIS_313-11547:0.0396667):0.0029687,IRIS_313-10516:0.0426955):0.0011557):9.799E-4):2.224E-4):8.018E-4):6.728E-4,((((((((((((((((((CX340:0.0227811,(CX347:0.0302664,(((((CX92:4.055E-4,CX125:1.354E-4):0.0211583,IRIS_313-8161:0.0202511):0.0021437,(((((((CX369:0.0015912,CX134:0.0035597):8.922E-4,CX126:0.0047825):0.0043015,((CX22:3.86E-5,IRIS_313-11480:2.25E-4):0.0027865,B217:0.0022729):0.0043354):0.002632,IRIS_313-10274:0.0125336):0.0054925,B232:0.0191598):0.002821,(CX28:0.0107551,CX218:0.0078319):0.0092315):0.0016886,IRIS_313-10298:0.0226419):0.0011711):0.0012754,(IRIS_313-11941:0.0162553,(IRIS_313-10247:0.0039591,IRIS_313-10293:0.0029402):0.0156882):0.0068596):0.0027139,CX305:0.0299381):0.0030083):8.593E-4):8.212E-4,B128:0.0347755):0.0019325,(((CX343:0.0208782,(CX303:0.0120475,(B146:-1.546E-4,IRIS_313-7635:4.388E-4):0.0108462):0.0100785):0.0065187,CX314:0.0239555):0.0048459,CX296:0.0294103):0.0027692):0.0015167,(((((((CX393:0.020306,(CX348:0.0117917,CX9:0.0142178):0.0061426):0.0024167,(CX394:0.0218754,CX341:0.0194795):0.0017621):0.0021733,CX361:0.0094753):0.0035235,CX349:0.0319066):0.0019172,B159:0.0192063):0.0027386,(((((CX87:0.0171806,CX86:-0.0068934):0.0123565,((((((CX346:6.988E-4,(CX42:8.51E-5,CX19:2.65E-4):4.295E-4):0.0140467,IRIS_313-12232:0.0143664):0.004799,CX386:0.0191207):0.0045223,CX12:0.0272046):0.0014875,CX318:0.0250176):0.0023976,CX378:0.0244864):9.637E-4):8.831E-4,CX17:0.0290928):0.0023177,CX360:0.0265331):0.0016061,B065:0.0083176):0.0025937):0.0012708,((CX119:0.0221306,CX118:0.021304):0.0122344,((((((B085:-0.0090059,B063:0.0120795):0.0066598,IRIS_313-11734:0.0213759):0.0058676,(IRIS_313-12273:0.0254167,IRIS_313-11732:0.0221125):0.0015064):0.0023243,IRIS_313-11729:0.0271898):0.0039247,IRIS_313-11733:0.0295427):0.0026136,IRIS_313-11731:0.0317645):8.133E-4):0.0018455):0.0019241):0.0014172,((B252:0.0318299,B153:0.0070263):0.0100773,B145:0.0393083):0.0011492):5.032E-4,((((((((((CX387:0.011598,CX250:0.0097637):0.006006,((((CX48:0.0044313,CX145:0.0033992):0.0015159,CX431:0.0057899):0.0013178,CX290:0.0066793):0.0099081,(CX370:0.0095064,CX8:0.011905):0.0060757):0.0030303):0.0039325,B201:0.0194185):0.0021079,((CX90:2.446E-4,CX100:6.117E-4):0.0277762,CX291:0.0126007):0.0015072):0.0021446,(CX342:0.0031341,CX313:0.0195767):0.0087899):0.004137,CX249:0.0208513):0.0039637,(CX388:0.0202895,CX121:0.0259639):0.0094018):0.0029572,CX247:0.017925):0.0018585,((CX263:0.0123721,CX265:0.0226431):0.0016512,CX268:0.0044135):0.0113204):9.102E-4,(CX288:0.0389832,(((B242:0.0076283,B138:-0.0059415):0.0215814,B192:0.0453765):0.0062759,IRIS_313-9570:0.0344143):0.0027302):0.0023868):0.001103):0.0011438,(((((((((((((CX328:2.282E-4,B104:2.089E-4):0.0245641,IRIS_313-11804:0.0275169):0.0019379,(((((((((((CX114:6.903E-4,IRIS_313-11039:8.982E-4):5.787E-4,B061:5.937E-4):0.005295,IRIS_313-11986:0.0066026):0.0052972,(((IRIS_313-11038:2.868E-4,IRIS_313-10561:2.76E-5):1.433E-4,IRIS_313-10932:-1.19E-5):0.0042327,B208:0.0048109):0.0086443):0.0015626,(B119:0.0107153,(B015:0.0124976,IRIS_313-10170:0.0115633):7.832E-4):8.857E-4):9.656E-4,(B060:0.0100142,IRIS_313-11968:0.0109064):0.0018902):0.003151,(((IRIS_313-11158:0.0015181,IRIS_313-9065:-0.0010959):0.0159702,((B181:0.0014221,B114:-7.548E-4):0.0104717,(((B121:0.0023183,B112:0.0027631):0.0020347,B092:0.0045867):0.0048292,IRIS_313-11965:0.01065):0.0032729):0.0028912):5.678E-4,IRIS_313-9253:0.0172808):0.0025971):0.001089,((B074:7.81E-5,B127:2.013E-4):1.139E-4,B126:-1.73E-5):0.019305):0.0024252,(IRIS_313-8940:0.0154371,IRIS_313-8433:0.0146741):0.0048087):0.0015507,IRIS_313-11806:0.0248776):0.0018074,(((B234:0.0018858,IRIS_313-11795:0.0030124):0.0165833,IRIS_313-11866:0.0236223):0.0015863,((B249:0.0136451,B059:0.0134929):0.0052237,IRIS_313-11865:0.018358):0.0025325):0.002804):0.0036923):0.0017624,(IRIS_313-11422:0.03452,IRIS_313-11585:0.0265958):0.0013608):0.0016435,CX18:0.0322496):7.907E-4,(B151:0.0203322,(B083:0.0268261,(IRIS_313-11664:0.0224209,IRIS_313-11746:0.0199131):0.008938):0.0039054):0.0010458):7.141E-4,(((((((((CX10:0.0175181,(CX133:0.0088866,IRIS_313-11668:0.009431):0.0094732):0.0040521,IRIS_313-11797:0.0228443):0.0012844,IRIS_313-10171:0.0231816):0.0012817,IRIS_313-11665:0.024388):0.0014522,IRIS_313-11727:0.0253825):0.0024034,B009:0.0235012):0.0016891,(IRIS_313-11666:0.0221521,IRIS_313-11622:0.0213938):0.0078152):0.0015802,((((((B248:0.0047412,B156:-0.0044368):0.0137219,IRIS_313-11752:0.0198782):0.0069033,((B010:0.0219606,IRIS_313-11753:0.0244802):0.0012514,(IRIS_313-8859:0.0250689,IRIS_313-10154:0.0208956):0.003324):0.0013856):0.0014675,IRIS_313-9727:0.0353388):0.0013298,IRIS_313-10404:0.027054):0.0016747,((B067:0.0197731,IRIS_313-11667:0.0215637):0.00346,(IRIS_313-9968:0.0214408,IRIS_313-10168:0.0179035):0.0072638):0.0054346):1.75E-4):0.0016868,(B064:0.0277504,IRIS_313-11747:0.0266161):0.0050578):0.0015469):0.0012709,(B197:5.153E-4,B116:0.0013012):0.0366987):0.0031385,(CX93:0.0195616,((CX270:0.0104562,(B150:0.017167,IRIS_313-8215:0.0182268):0.0082261):0.0045073,IRIS_313-8914:0.0359416):0.0030129):0.0020416):6.515E-4,(((CX548:0.015436,CX221:0.018194):0.0088868,B267:0.0252462):0.0060515,((CX117:0.0315373,(B202:0.0300517,B137:0.0204038):0.005366):0.0026754,(B254:2.707E-4,B253:1.134E-4):0.0390042):0.0011305):0.0015775):8.404E-4,(B155:0.0344027,B255:0.0309882):0.0074231):6.982E-4,CX278:0.0234971):6.906E-4,(((B157:0.0202788,B158:-0.0033134):0.0154693,IRIS_313-11570:0.038522):0.0018321,(B139:0.0029384,IRIS_313-11669:0.0407361):0.0030366):0.0016565):5.3E-4):8.968E-4,((((((((((((((CX45:4.422E-4,IRIS_313-7911:7.278E-4):0.0016489,CX21:0.0021986):8.565E-4,IRIS_313-12024:0.0038041):0.0060444,IRIS_313-9867:0.0095525):0.0109553,IRIS_313-7819:0.0217997):0.0064475,B214:0.0232983):0.0041614,((IRIS_313-7826:0.0222758,IRIS_313-11784:0.02301):0.0076601,IRIS_313-7808:0.031745):0.0027026):0.0020884,(IRIS_313-10314:0.0283327,IRIS_313-10257:0.0342481):0.0039043):0.0013669,CX376:0.0103805):5.341E-4,((((((CX73:0.0010682,IRIS_313-9966:7.492E-4):0.0057176,IRIS_313-9940:0.0060737):0.0165548,(((IRIS_313-7664:6.17E-4,IRIS_313-10220:7.304E-4):4.887E-4,IRIS_313-10260:0.0010821):0.0194479,IRIS_313-7636:0.0178739):0.0038449):0.0061446,(IRIS_313-10400:0.0228179,(((IRIS_313-10397:7.726E-4,(IRIS_313-10401:5.068E-4,IRIS_313-10398:-1.569E-4):7.447E-4):0.011456,IRIS_313-10161:0.0107432):0.0055234,IRIS_313-10402:0.0183317):0.0062109):0.007044):8.895E-4,((((B035:2.73E-5,B088:1.144E-4):0.013013,IRIS_313-10301:0.0142576):0.0199144,IRIS_313-10352:0.0347341):0.0024726,(((IRIS_313-11807:0.0123282,IRIS_313-11808:0.0153033):0.0116826,IRIS_313-10307:0.0218742):0.0026012,IRIS_313-10275:0.0285652):0.005178):0.0017496):0.00259,((IRIS_313-10300:0.0375139,(IRIS_313-10268:0.0301051,IRIS_313-10287:0.0264788):0.0077387):0.0041496,(IRIS_313-10054:0.0291179,IRIS_313-10263:0.0296309):0.0090084):0.00141):0.001643):0.0016757,(((((((CX382:0.02832,IRIS_313-7815:0.0267289):0.0019416,IRIS_313-11233:0.0295466):0.0013223,((((((CX97:0.0142931,(IRIS_313-12234:0.0106095,IRIS_313-11513:0.0107912):0.0036929):0.0036252,IRIS_313-8514:0.0182514):0.0015677,IRIS_313-9566:0.0210629):0.0025214,(IRIS_313-8732:0.0134126,IRIS_313-9227:0.0120413):0.0117694):9.982E-4,IRIS_313-10417:0.0234606):0.0016226,IRIS_313-11250:0.0292478):0.0022644):0.0018533,(B185:0.0306973,(IRIS_313-11937:0.0254649,IRIS_313-11763:0.0255232):0.0037911):0.0036394):0.001087,((IRIS_313-7770:0.0259129,(IRIS_313-7820:0.0171853,IRIS_313-7766:0.0209355):0.0094567):0.0062709,IRIS_313-11643:0.0421757):8.032E-4):0.0011103,((IRIS_313-11245:0.0285698,(IRIS_313-10754:0.0119524,IRIS_313-9924:0.0117786):0.017834):0.003741,IRIS_313-8212:0.0343991):0.003402):0.0014176,(((CX15:0.0369007,((CX122:0.0250921,IRIS_313-11990:0.0248692):0.0036725,IRIS_313-11237:0.0323915):0.0025062):0.0029965,((CX30:0.0282284,(((IRIS_313-10753:0.0163061,IRIS_313-11538:0.0219341):0.0038032,IRIS_313-9922:0.0223033):0.0035336,(IRIS_313-10040:0.0217232,IRIS_313-9925:0.0238774):0.0031493):0.0018741):0.0051948,IRIS_313-11251:0.0336427):0.0020065):0.0017993,((((((CX146:0.0175065,(IRIS_313-11346:0.0055437,IRIS_313-10046:0.0029597):0.013803):0.0054701,IRIS_313-9917:0.0235474):0.0051696,B200:0.0270948):0.004516,IRIS_313-11197:0.0335736):0.0031054,IRIS_313-9522:0.0386776):0.0013095,B125:0.0345778):0.0014927):2.795E-4):9.23E-4):3.035E-4,(((((CX50:2.081E-4,CX33:-6.13E-5):0.0213191,CX29:0.039934):0.0065681,(((B195:-2.914E-4,IRIS_313-7780:5.568E-4):4.903E-4,IRIS_313-7792:-3.942E-4):0.0188919,IRIS_313-8621:0.0186145):0.0092168):0.0031971,IRIS_313-10285:0.0335397):0.0015842,(((B194:0.015628,IRIS_313-10271:0.0265676):7.558E-4,B193:0.0248462):0.0064146,IRIS_313-8392:0.033655):0.0052273):0.0010621):4.763E-4,((((CX68:0.0186134,IRIS_313-7773:0.0161342):0.0139921,CX69:-6.555E-4):0.0056048,(((CX91:0.0297845,(IRIS_313-12319:0.028456,IRIS_313-11436:0.0260636):0.0019013):0.0027483,CX226:0.0337337):0.0038147,CX234:0.008684):0.0021825):0.0013331,(IRIS_313-11234:0.0360078,(IRIS_313-11889:0.0214435,IRIS_313-10016:0.0197395):0.0179044):0.0045538):9.75E-4):9.18E-4,((((CX75:0.0342909,((CX35:0.0105298,IRIS_313-11510:0.02024):0.0109657,B051:0.030154):0.0041715):8.861E-4,B013:0.0318898):0.0014941,((CX207:0.0365973,IRIS_313-15897:0.0386491):7.537E-4,(CX20:0.0358699,CX2:0.0311329):0.0018257):0.0018043):0.0018838,((CX89:0.0130179,(CX79:0.0221178,CX80:0.0266497):0.0106581):0.0036737,((((CX43:2.08E-5,CX281:2.414E-4):0.0321318,((((CX276:0.0273486,(IRIS_313-11886:0.0144955,IRIS_313-7691:0.0222129):0.003244):0.0024633,CX206:0.0271774):0.0027896,IRIS_313-11385:0.0294457):0.0013446,B029:0.0220073):0.0039107):0.0018175,((B233:0.0193417,IRIS_313-11751:0.0154929):0.0160964,IRIS_313-11750:0.0307797):0.0027082):0.0029251,(CX219:0.0386264,IRIS_313-10353:0.0355581):0.0031876):0.0013244):2.959E-4):3.741E-4):6.152E-4):1.694E-4,(((CX363:0.0070167,CX362:0.0239938):0.0166904,(B176:0.0352072,IRIS_313-9066:0.0373546):0.009033):0.0027279,CX542:0.0262446):0.0011666):8.138E-4,((((((((CX392:6.734E-4,IRIS_313-10279:0.0012343):0.0230072,IRIS_313-10403:0.0222242):0.0071992,IRIS_313-11438:0.0313233):0.0022872,IRIS_313-11798:0.0355784):7.25E-5,((((CX120:0.0224002,IRIS_313-10433:0.0185318):0.0095047,(IRIS_313-10480:0.0215016,IRIS_313-9017:0.0198962):0.0062205):0.0017122,IRIS_313-11280:0.0279295):0.0042811,IRIS_313-9602:0.0321743):0.0025141):0.0014745,(((IRIS_313-12308:0.0145928,((IRIS_313-9116:6.425E-4,IRIS_313-9115:-4.067E-4):5.752E-4,IRIS_313-9119:-5.554E-4):0.0139636):0.0099211,IRIS_313-9112:0.0192549):0.0089377,IRIS_313-9953:0.0312368):0.0082531):0.0021303,CX366:0.0359238):0.0020138,((((IRIS_313-12354:0.0197687,(IRIS_313-12229:0.009948,(IRIS_313-11841:0.0039496,(IRIS_313-9019:0.0016212,IRIS_313-9302:0.0019676):0.0027083):0.0067179):0.0121527):0.0087456,IRIS_313-12355:0.0270374):0.0068944,IRIS_313-10000:0.0343268):0.0055199,IRIS_313-11515:0.043718):0.0017103):0.0015664):1.203E-4,(((IRIS_313-10359:0.022559,IRIS_313-10375:0.0197567):0.021062,(IRIS_313-10371:0.0318424,IRIS_313-10355:0.0257727):0.010791):0.0084158,((IRIS_313-10235:0.0160353,IRIS_313-10360:0.0164832):0.0171758,(IRIS_313-10396:0.0062235,IRIS_313-10374:0.0060406):0.0292028):0.0096744):0.0010914):2.968E-4,((((((((((((CX357:0.027498,IRIS_313-15902:0.0307737):0.0016563,(((CX364:0.0257345,((CX381:0.004665,CX379:-0.0015151):0.0160766,(IRIS_313-11960:0.0143547,IRIS_313-7689:0.014307):0.0051058):0.0048914):7.913E-4,(IRIS_313-12135:0.0257143,(IRIS_313-7816:0.0199284,IRIS_313-7807:0.0194412):0.0048194):0.0021949):0.0011336,(CX60:0.0054192,(CX26:0.017458,IRIS_313-9482:0.0139374):0.0035853):0.0081583):0.0032187):7.841E-4,IRIS_313-11887:0.0314845):7.152E-4,IRIS_313-15896:0.0331779):0.0022737,(IRIS_313-10167:0.023502,IRIS_313-10366:0.0264366):0.0123706):0.001042,(IRIS_313-11979:0.0360493,IRIS_313-10392:0.0318711):0.0028866):0.0017517,(((CX44:0.0197997,CX76:0.0261352):0.0091995,(IRIS_313-11934:0.0330898,IRIS_313-11517:0.0315184):0.0030399):0.0018239,IRIS_313-12067:0.0410232):6.702E-4):0.0026028,((CX399:0.0337121,((CX161:6.576E-4,IRIS_313-9044:6.921E-4):0.0242612,((B033:1.257E-4,B058:1.538E-4):0.0180951,IRIS_313-10002:0.0169733):0.0034632):0.0101466):0.0032535,IRIS_313-15899:0.0377051):0.0025831):9.689E-4,(((CX385:0.0171718,((((CX375:0.0052159,((((CX403:0.0018176,(CX377:3.6E-5,IRIS_313-7832:1.581E-4):0.0014383):7.439E-4,CX230:0.0024873):0.0016635,CX37:0.0053246):0.0018031,CX31:-5.165E-4):0.0081462):0.0062561,(IRIS_313-10237:1.541E-4,IRIS_313-10238:-1.34E-5):0.0209302):0.0041621,CX358:0.0119193):0.0014776,(CX225:0.0109583,IRIS_313-15901:0.0213522):0.0094915):0.0042235):0.0022533,(IRIS_313-11978:0.0171002,IRIS_313-10234:0.0171849):0.0168583):0.0032492,(((CX83:0.0151125,CX84:0.0168868):0.0069251,CX82:0.0242589):0.0088194,((IRIS_313-15906:0.0344325,IRIS_313-10385:0.0315633):0.0020233,(IRIS_313-10001:0.0191571,IRIS_313-10294:0.0216286):0.0127294):0.0025415):0.0031699):0.0027051):4.057E-4,((CX238:-0.0017995,(CX237:-2.768E-4,(IRIS_313-10333:2.78E-5,IRIS_313-10334:1.719E-4):4.001E-4):0.0019367):0.0372459,IRIS_313-10357:0.0385138):9.928E-4):0.0019474,B039:1.351E-4):0.0018299,((IRIS_313-7809:0.0297685,IRIS_313-15898:0.027128):0.0107583,IRIS_313-10361:0.0400746):0.0039462):9.482E-4):5.096E-4,(IRIS_313-8967:0.0230764,IRIS_313-8288:0.0267815):0.0100773):7.443E-4,(((((((CX64:0.0315031,(((CX304:2.276E-4,IRIS_313-10423:1.042E-4):1.052E-4,IRIS_313-7641:7.22E-5):0.0107386,IRIS_313-10337:0.0120977):0.0191415):0.0037023,(IRIS_313-11987:0.0332995,(IRIS_313-8903:0.0334579,IRIS_313-9818:0.0237494):0.0061668):8.275E-4):0.0053189,(CX236:0.0159785,IRIS_313-15903:0.0215878):0.0325195):0.0020803,((((((CX232:0.0125624,((CX235:0.0026572,IRIS_313-10394:0.0034164):0.0204038,(IRIS_313-7699:0.0157758,IRIS_313-11429:0.0199247):0.0046273):7.847E-4):0.0069311,(((CX240:0.0166322,(IRIS_313-12080:2.008E-4,IRIS_313-12079:1.319E-4):0.0175052):0.0050148,(IRIS_313-10996:0.0058542,IRIS_313-10113:0.0080347):0.0130957):0.0039897,B027:0.0277199):0.0039818):0.0012532,((IRIS_313-7696:0.0096335,IRIS_313-8069:0.009928):0.0054471,IRIS_313-7698:0.0129746):0.0175017):0.0025214,IRIS_313-7668:0.033506):0.0010674,(IRIS_313-11423:0.0246962,((IRIS_313-7665:-9.6E-5,(IRIS_313-7797:1.894E-4,IRIS_313-8068:1.086E-4):2.015E-4):2.698E-4,IRIS_313-9503:9.31E-5):0.019411):0.0129207):0.0037525,IRIS_313-8935:0.0257397):0.002302):0.0038108,((((CX150:0.0307781,IRIS_313-11507:0.0264108):0.0048823,(IRIS_313-7654:0.0204742,IRIS_313-9032:0.0208505):0.0092075):0.0039366,CX156:0.0340987):0.0023082,((IRIS_313-11394:0.0271722,B180:0.0242621):0.0040248,B019:0.0058305):0.0061081):0.0030061):7.04E-4,(((((((((CX25:0.0113522,IRIS_313-11717:0.0144905):0.0064396,CX152:0.0207107):0.007634,IRIS_313-11516:0.0297054):0.0023578,B048:0.0274313):6.575E-4,(((((((IRIS_313-10941:0.0054655,IRIS_313-10550:0.0051249):0.0056229,IRIS_313-10565:0.0103091):0.0028389,IRIS_313-10774:2.005E-4):0.0041499,IRIS_313-10775:0.0181124):0.0015995,IRIS_313-8930:0.019318):0.0056016,((IRIS_313-10514:8.213E-4,IRIS_313-11471:6.16E-4):0.0167794,IRIS_313-10566:0.0161417):0.0104552):5.766E-4,IRIS_313-10769:0.0250966):0.004987):0.0033588,IRIS_313-11239:0.0324964):0.0016239,((IRIS_313-11176:-0.001998,IRIS_313-11177:0.0154491):0.0118962,((((IRIS_313-11182:0.0285336,((IRIS_313-10824:0.024847,IRIS_313-10997:0.020718):0.0052959,((IRIS_313-10810:0.0247163,IRIS_313-8368:0.0257308):0.0024711,IRIS_313-10812:0.0289885):0.001888):0.0038846):0.001665,((IRIS_313-11000:0.0302183,(IRIS_313-10791:0.0213452,(IRIS_313-10777:0.0115951,IRIS_313-8812:0.0129585):0.0108996):0.0062639):0.0026569,IRIS_313-10954:0.0301034):0.0037936):0.0020399,IRIS_313-10690:0.0103259):6.115E-4,(IRIS_313-9314:0.0297207,IRIS_313-11467:0.0352886):0.0040305):0.0020906):0.0021736):8.463E-4,(IRIS_313-10811:0.0392316,(IRIS_313-10158:0.044414,IRIS_313-9767:0.0443471):0.002388):0.0012536):0.0017913,(IRIS_313-10421:0.0412354,(IRIS_313-11535:-3.714E-4,IRIS_313-11656:0.0254313):0.017616):0.0012593):2.967E-4):0.0022129,IRIS_313-10349:0.0451555):7.565E-4):6.125E-4,(((((((CX70:0.0111834,CX147:-0.01052):0.0138181,CX27:0.0128321):0.006058,IRIS_313-9574:0.0305455):0.0083184,((CX158:0.0306296,IRIS_313-11713:0.0312376):0.0038921,IRIS_313-11506:0.0299914):0.0036888):0.0037272,(((((IRIS_313-11326:0.0181178,IRIS_313-11200:0.0164663):0.0043766,(IRIS_313-10399:0.0161914,IRIS_313-10332:0.0159508):0.0041722):0.0046554,(IRIS_313-9325:0.0150102,IRIS_313-11621:0.0145417):0.0086523):0.0050442,IRIS_313-9696:0.0298873):0.0022836,IRIS_313-10341:0.030936):0.0081256):9.319E-4,(IRIS_313-8458:0.0316971,IRIS_313-11493:0.0295374):0.0102081):0.0024625,((CX94:0.0367706,(((IRIS_313-11206:0.0277866,(IRIS_313-8932:0.0150827,IRIS_313-11588:0.0145547):0.0131799):0.0048211,IRIS_313-15900:0.0282058):0.0060511,IRIS_313-10412:0.033764):0.0040417):0.0030943,(((CX231:6.33E-5,(CX273:4.02E-5,CX274:1.692E-4):5.89E-5):0.0017207,CX275:-0.0015797):0.0190194,CX233:0.0192645):0.021956):0.0034935):0.0012536):4.36E-4,(CX53:0.0404112,IRIS_313-9114:0.0206135):0.0040773):6.726E-4,(CX144:0.0355396,(((((IRIS_313-11387:0.023167,IRIS_313-11704:0.0210414):0.00428,(IRIS_313-11344:0.0239799,IRIS_313-11681:0.0253838):0.0014558):0.0019478,IRIS_313-11958:0.0287875):0.0023879,((IRIS_313-11119:0.023293,IRIS_313-9637:0.0187045):0.0026133,IRIS_313-12096:0.0280442):0.0049607):0.006761,IRIS_313-11925:0.0355321):0.0036948):0.0067242):7.898E-4,((((((((((((((((CX55:0.0188161,IRIS_313-11952:0.0198074):0.0035403,((((CX131:0.0185379,IRIS_313-11568:0.0180556):8.472E-4,IRIS_313-10731:0.0161547):0.00147,(B261:0.0016437,IRIS_313-8454:0.0168434):0.0038838):0.0020009,IRIS_313-11862:0.0262088):0.0014758):0.0013285,CX101:0.0244365):8.837E-4,(CX123:0.025877,(IRIS_313-11943:0.0019163,(IRIS_313-11944:4.57E-5,IRIS_313-11624:2.69E-4):0.0125723):0.0122227):0.0016737):0.0011732,(IRIS_313-10449:0.0287832,IRIS_313-10458:0.0237995):0.0039322):0.0014054,IRIS_313-11948:0.0310305):0.0043973,((((((((((CX88:0.0205885,IRIS_313-12236:0.0201737):0.0030954,IRIS_313-11802:0.0242294):8.684E-4,(B260:0.0207454,IRIS_313-12237:0.0210773):0.0035838):7.688E-4,(IRIS_313-10450:0.0180548,IRIS_313-12010:0.0188774):0.0071823):0.0031504,IRIS_313-11858:0.025496):0.0023489,(IRIS_313-11857:0.0310792,(IRIS_313-11861:-0.002038,IRIS_313-11860:0.0140163):0.0140001):3.445E-4):8.646E-4,((((((IRIS_313-11157:5.016E-4,IRIS_313-9758:-2.638E-4):0.008128,IRIS_313-11152:0.0074214):0.0046534,IRIS_313-11980:0.0114181):0.0097531,IRIS_313-11579:0.0224093):0.0056902,(((IRIS_313-10560:0.0247494,IRIS_313-10515:0.0216379):0.0039834,((IRIS_313-9705:0.011193,IRIS_313-11692:0.0105545):0.0075497,IRIS_313-9706:0.0188199):0.0066898):7.165E-4,((IRIS_313-10497:3.65E-4,IRIS_313-11869:-1.066E-4):0.0248032,IRIS_313-9976:0.0228247):0.0025272):2.96E-4):0.0058583,(((IRIS_313-10452:0.0237712,IRIS_313-12033:0.0271694):0.0016908,IRIS_313-10224:0.0266821):0.0035343,IRIS_313-9723:0.0274148):0.0025001):0.0012994):6.217E-4,((IRIS_313-11911:0.0256297,IRIS_313-9372:0.0226157):0.0043336,IRIS_313-9324:0.0272172):0.0037082):3.778E-4,((B244:0.027836,IRIS_313-11796:0.029696):0.0031767,IRIS_313-10502:0.0328224):0.0011863):0.0010231,(((((((((((((IRIS_313-11281:0.0026114,(IRIS_313-10968:0.0019611,IRIS_313-9730:0.0019769):8.845E-4):0.0020152,IRIS_313-11885:0.006172):0.0032636,IRIS_313-11949:0.0110406):0.0052265,B130:-0.0011599):0.0043194,IRIS_313-10211:0.0167189):0.0014413,((((B213:-0.0011451,IRIS_313-11877:0.0013571):0.00348,B259:0.0051752):0.0023787,IRIS_313-11884:0.0083551):0.0045242,IRIS_313-11881:0.0124027):0.0062861):7.773E-4,(IRIS_313-10504:7.976E-4,IRIS_313-8645:0.0011199):0.0189499):0.0023021,IRIS_313-11799:0.0214142):0.0021113,(B198:0.0233328,IRIS_313-9505:0.023587):4.511E-4):0.0020752,IRIS_313-11859:0.0196955):0.0040263,IRIS_313-11909:0.0312806):0.0021547,(B147:0.0274001,((B062:0.0200507,IRIS_313-11882:0.0215167):0.0072922,IRIS_313-10178:0.0328004):0.0014086):0.0013275):0.0012748,((((B115:0.0231932,(IRIS_313-11966:0.0198643,IRIS_313-11951:0.0203014):0.0049598):0.0048203,IRIS_313-11950:0.0310953):0.0017389,IRIS_313-12009:0.017792):5.196E-4,(((IRIS_313-11805:0.0203492,IRIS_313-9469:0.0201971):0.0064968,IRIS_313-11745:0.0285806):0.0017358,IRIS_313-8380:0.029443):0.0029446):4.045E-4):0.0013251):2.795E-4):0.0011624,B072:0.0071992):6.845E-4,((CX102:0.0314662,IRIS_313-10503:0.0303982):9.739E-4,(IRIS_313-12012:0.0285481,IRIS_313-10189:0.0283991):0.0040709):0.0043106):7.115E-4,(((((((CX3:0.0155555,(IRIS_313-9822:2.705E-4,IRIS_313-8435:-1.288E-4):0.0149716):0.0131481,IRIS_313-9605:0.024897):0.0020988,((IRIS_313-11870:0.0252618,IRIS_313-10129:0.0253442):0.0032891,IRIS_313-9204:0.0305251):0.0030828):0.0016308,((B163:0.0259753,(IRIS_313-11878:0.0266256,IRIS_313-10190:0.0255905):0.0043261):0.002265,(B216:0.030427,(((IRIS_313-12186:6.56E-5,IRIS_313-12016:2.849E-4):0.0087001,IRIS_313-10103:0.0082144):0.0135323,IRIS_313-11876:0.021957):0.0125772):0.0026048):0.0022347):0.0019322,(((B264:1.699E-4,B140:1.792E-4):0.0326389,(IRIS_313-11872:0.0322375,IRIS_313-11871:0.026627):0.0051747):0.0014043,(IRIS_313-11863:0.025174,IRIS_313-9111:0.0274453):0.0059699):0.0023605):0.0010496,(((((B079:0.0084591,IRIS_313-11867:0.0092446):0.018909,IRIS_313-11854:0.0257289):0.0016359,(B024:0.0279676,IRIS_313-11955:0.0270203):0.0029472):0.00138,IRIS_313-11868:0.0315412):0.0040766,((IRIS_313-11852:0.0289865,(IRIS_313-11853:0.0278462,IRIS_313-11856:0.025997):0.001316):0.004129,(IRIS_313-11953:0.0311572,IRIS_313-11855:0.0280312):0.0050829):0.0023912):0.0015186):0.0010289,B081:0.0262625):9.171E-4):9.796E-4,(((B149:0.0189939,B221:-0.011796):0.0153871,IRIS_313-10191:0.0359141):0.0015435,IRIS_313-11954:0.0369689):0.0014811):0.0024346,IRIS_313-9108:0.0195541):0.0023293,(((CX267:0.0214619,B187:0.0186192):0.0117609,((((CX228:0.0049517,IRIS_313-11596:0.0057067):0.0252137,IRIS_313-11355:0.0292737):0.0059359,(((CX162:3.04E-4,IRIS_313-10047:1.158E-4):0.0091628,IRIS_313-9708:0.0103094):0.0073962,IRIS_313-11432:0.0173005):0.0059574):0.0055819,(IRIS_313-11247:0.0197365,IRIS_313-9604:0.020274):0.0096438):0.003296):0.004067,IRIS_313-9791:0.0262312):0.0061236):0.0019397,(((((((((CX5:0.0356588,((((IRIS_313-11162:0.009841,((IRIS_313-10290:6.391E-4,IRIS_313-7688:0.0010092):3.042E-4,IRIS_313-8616:0.0017922):0.0070969):0.0131984,B040:0.0235079):0.0028186,IRIS_313-11801:0.0255026):0.0060542,IRIS_313-10289:0.0277309):0.0022014):7.458E-4,IRIS_313-11249:0.0102149):9.358E-4,(CX85:0.034009,CX96:0.0344248):0.0011725):9.527E-4,(((CX124:0.0358295,IRIS_313-9623:0.0294911):0.0076498,IRIS_313-11122:0.0314862):0.0035602,((((IRIS_313-11325:0.0192465,(IRIS_313-11357:0.0132127,IRIS_313-7684:0.0165364):0.0037886):0.0059795,B028:0.0047762):0.0075034,(IRIS_313-7685:0.0309721,IRIS_313-7824:0.030327):0.0039409):0.0034288,(((IRIS_313-11244:0.0014989,IRIS_313-11722:0.0016606):0.0286582,(IRIS_313-10148:0.0088953,IRIS_313-11639:0.0088641):0.0230435):0.0046688,IRIS_313-8412:0.03193):2.953E-4):0.0029729):8.09E-4):0.0014151,((CX52:3.99E-5,CX182:1.352E-4):2.5E-5,CX319:1.324E-4):0.036607):5.938E-4,((CX13:0.0023996,CX24:0.0296036):0.0060679,IRIS_313-8265:0.0326292):0.0065422):0.0012343,(IRIS_313-11240:0.0291935,B032:0.0258671):0.0109937):2.623E-4,IRIS_313-7690:0.039458):0.001125,(((((((((CX99:0.0139681,IRIS_313-8921:0.0116541):0.0049688,IRIS_313-11411:0.0204974):0.0068115,IRIS_313-8559:0.0245321):0.0087669,(((IRIS_313-10544:0.0277963,IRIS_313-11645:0.0283342):3.377E-4,IRIS_313-8631:0.0283591):0.0018882,(IRIS_313-8622:0.0318902,IRIS_313-11644:0.0340409):0.0019219):0.0025497):8.425E-4,(IRIS_313-10833:0.0270551,(IRIS_313-8727:0.0300455,(IRIS_313-11505:0.0198046,IRIS_313-11461:0.0189787):0.0068116):0.0020448):0.0024012):0.0037087,(((((IRIS_313-11335:0.0244386,(IRIS_313-10661:0.0175831,IRIS_313-8925:0.0189522):0.0045625):3.091E-4,(IRIS_313-10719:0.01249,IRIS_313-8244:0.01428):0.0097435):0.0036092,(((IRIS_313-10721:8.547E-4,IRIS_313-8660:9.993E-4):0.0231813,IRIS_313-10716:0.0223875):0.0035526,(IRIS_313-10662:0.0089313,(IRIS_313-10476:9.74E-5,IRIS_313-9970:4.32E-5):0.0073106):0.016433):0.0024472):0.0033655,((IRIS_313-10610:0.0220984,(IRIS_313-8968:0.0151564,IRIS_313-11741:0.016766):0.0074896):0.0030351,(IRIS_313-9039:0.016783,IRIS_313-9832:0.0175413):0.0113154):0.0024391):0.0035518,IRIS_313-8754:0.0301703):0.0019291):4.785E-4,(((((CX160:0.0336048,IRIS_313-9351:0.0265461):0.0052824,(IRIS_313-11041:0.0199657,IRIS_313-10527:0.0230275):0.0054726):0.0046232,((IRIS_313-10835:0.0099384,IRIS_313-10836:0.0095508):0.0170342,IRIS_313-8647:0.0273096):0.002674):0.0013265,(CX103:0.0385245,B012:0.0179222):0.0036461):0.0031747,(IRIS_313-11414:0.0374605,(B026:1.78E-4,B011:1.4E-5):0.0357759):5.068E-4):0.0021811):0.001564,IRIS_313-11241:0.0431507):0.001642,(((IRIS_313-11420:0.026036,(IRIS_313-10717:0.02354,IRIS_313-9862:0.0213148):0.0037205):0.0034499,IRIS_313-9831:0.0111827):0.0063367,IRIS_313-8306:0.035462):0.0044596):0.0014401):0.0014039):7.733E-4,(CX34:0.0019549,(CX155:0.0280686,IRIS_313-8987:0.0250943):0.0073429):0.0088414):9.014E-4,(((((CX157:0.0310396,IRIS_313-10523:0.0321987):0.0057741,IRIS_313-11252:0.0351221):0.0013012,IRIS_313-11382:0.0358124):0.0131682,IRIS_313-9023:0.0426056):0.0049996,(((IRIS_313-11288:0.0396709,(IRIS_313-7638:0.0325397,IRIS_313-9472:0.0279742):0.005273):0.0043671,IRIS_313-11078:0.033315):0.0019857,((IRIS_313-10720:0.0238567,IRIS_313-9944:0.0211378):0.0150156,IRIS_313-8699:0.0422359):0.0030028):0.0061321):5.59E-4):1.938E-4):4.23E-4);";
	 * }
	 */

	/*
	 * public static String get3kCoreNewick() {
	 * 
	 * AppContext.debug("reading  get3kCoreNewick"); return
	 * }
	 */

}