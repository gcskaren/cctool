package cctool;

import java.util.ArrayList;

public class comparetxt {
	private static ArrayList OList = new ArrayList();

	public static void main(String[] args) {
		String[] Newlist = {
		//		 String[] orange = {
						 "CY-humanrights                ",
						 "CY-humanrightsEn              ",
						 "CY-Icinga                     ",
						 "CY-kids                       ",
						 "CY-notDonate                  ",
						 "CY-pdis                       ",
						 "CY-sunshine                   ",
						 "CY-Web-test                   ",
						 "CY-www                        ",
						 "CY-wwwEn                      ",
						 "CY-wwwPDA                     ",
						 "director.moeasmea.gov.tw      ",
						 "dns.cga.gov.tw                ",
						 "eDC_2DNS_check                ",
						 "eDC-SL-048                    ",
						 "edic.good.nat.gov.tw          ",
						 "edit_adbook                   ",
						 "edit_announce                 ",
						 "edit.good.nat.gov.tw          ",
						 "editad.good.nat.gov.tw        ",
						 "edoc.good.nat.gov.tw          ",
						 "edw.epa.gov.tw                ",
						 "edw.epa.gov.tw_H              ",
						 "EPA-ACCSI-CSPMonitor-TP       ",
						 "EPA-ACCSI-Icinga-TP           ",
						 "EPA-ACCSI-Icinga2-TP          ",
						 "EPA-ACCSI-Oz-TP               ",
						 "EPA-TC-Firewall-WAN           ",
						 "EPA-TC-Firewall-WAN_H         ",
						 "EPA-TP-Firewall-WAN           ",
						 "EPA-TP-Firewall-WAN_H         ",
						 "eric.epa.gov.tw               ",
						 "eric.epa.gov.tw_H             ",
						 "erlp.archives.gov.tw          ",
						 "gisa.gretai.org.tw            ",
						 "gofunding.gretai.org.tw       ",
						 "localhost                     ",
						 "mail.archives.gov.tw          ",
						 "Moea_2DNS_check               ",
						 "MOEA-2k3dmz5-psnlogin         ",
						 "MOEA-2k3dmz5-srvlogin         ",
						 "MOEA-AAWEB                    ",
						 "MOEA-cloudapp                 ",
						 "MOEA-csmgg                    ",
						 "MOEA-csmgr                    ",
						 "MOEA-CSR                      ",
						 "MOEA-DMZ1                     ",
						 "MOEA-dmz2-bmweb               ",
						 "MOEA-dmz2-btweb               ",
						 "MOEA-dmz2-director            ",
						 "MOEA-dmz2-itweb               ",
						 "MOEA-dmz2-maweb               ",
						 "MOEA-dmz2-meeting             ",
						 "MOEA-dmz2-olweb               ",
						 "MOEA-DMZ8-1                   ",
						 "MOEA-DMZ8-2                   ",
						 "MOEA-DMZ9-bnweb               ",
						 "MOEA-DMZ9-gbweb               ",
						 "MOEA-DMZ9-GMWEB               ",
						 "MOEA-DMZ9-goweb               ",
						 "MOEA-DMZ9-gsweb               ",
						 "MOEA-DMZ9-IPCWEB              ",
						 "MOEA-DMZ9-MRWEB               ",
						 "MOEA-DMZ9-QsWebln             ",
						 "MOEA-DNS                      ",
						 "MOEA-DNS3                     ",
						 "MOEA-ecenter1                 ",
						 "MOEA-ecenter2                 ",
						 "MOEA-ecenter3                 ",
						 "MOEA-ecenter4                 ",
						 "MOEA-ecenter5                 ",
						 "MOEA-ecenter6                 ",
						 "MOEA-EGIS                     ",
						 "MOEA-Exchange-OWA             ",
						 "MOEA-Giwebfill                ",
						 "MOEA-GODoms                   ",
						 "MOEA-IDIC-BACK                ",
						 "MOEA-InvestTW3ap              ",
						 "MOEA-InvestTW4ap              ",
						 "MOEA-InvestTW5km              ",
						 "MOEA-moeaspace                ",
						 "MOEA-ngisweb2008              ",
						 "MOEA-w2koa01                  ",
						 "Moeaboe-Icinga                ",
						 "MOEAGCIS-AP11                 ",
						 "MOEAGCIS-AP12                 ",
						 "MOEAGCIS-DB11                 ",
						 "MOEAGCIS-DB12                 ",
						 "MOEAGCIS-DIR11                ",
						 "MOEAGCIS-DIR12                ",
						 "MOEAGCIS-DS11                 ",
						 "MOEAGCIS-IDE11                ",
						 "MOEAGCIS-IDE12                ",
						 "MOEAGCIS-POR11                ",
						 "MOEAGCIS-POR12                ",
						 "MOEAGCIS-POR13                ",
						 "MOEAGCIS-POR14                ",
						 "MOEAGCIS-QD11                 ",
						 "MOEAGCIS-QD12                 ",
						 "Moeasmea_2DNS_check           ",
						 "moeasmea-DNS1                 ",
						 "moeasmea-DNS3                 ",
						 "MOEASMEA-TC-FSA03             ",
						 "MOEASMEA-TC-logger            ",
						 "MOEASMEA-TC-Snort             ",
						 "MOFA-Icinga                   ",
						 "MOI-CAND                      ",
						 "MOI-COAA                      ",
						 "MOI-COIS                      ",
						 "MOI-comgis                    ",
						 "MOI-COOP                      ",
						 "MOI-data                      ",
						 "MOI-DNS                       ",
						 "MOI-dr100                     ",
						 "MOI-eclient                   ",
						 "MOI-Elearning                 ",
						 "MOI-EMSG                      ",
						 "MOI-farmeriiqry               ",
						 "MOI-GLRS                      ",
						 "MOI-hotline                   ",
						 "MOI-icensus                   ",
						 "MOI-maritimeinfo              ",
						 "MOI-moisagis                  ",
						 "MOI-mort                      ",
						 "MOI-ngis                      ",
						 "MOI-NGIS2                     ",
						 "MOI-ngiseq                    ",
						 "MOI-npersonnel                ",
						 "MOI-owgateway                 ",
						 "MOI-placesearch               ",
						 "MOI-rdec                      ",
						 "MOI-religion                  ",
						 "MOI-segis                     ",
						 "MOI-service                   ",
						 "MOI-standards                 ",
						 "MOI-statis                    ",
						 "MOI-statis2                   ",
						 "MOI-taiwanarmap               ",
						 "MOI-webmail                   ",
						 "MOI-www                       ",
						 "NASC-HD-AIR3                  ",
						 "NASC-HD-AIR4                  ",
						 "NASC-HD-IBM-BACKUP            ",
						 "NASC-HD-Storage               ",
						 "NASC-LT-DTVH                  ",
						 "near.archives.gov.tw          ",
						 "NSB-Web                       ",
						 "online.archives.gov.tw        ",
						 "pms.moeasmea.gov.tw           ",
						 "prtr.epa.gov.tw               ",
						 "prtr.epa.gov.tw_H             ",
						 "stat.good.nat.gov.tw          ",
						 "taicgof.gretai.org.tw         ",
						 "taipeibond.gretai.org.tw      ",
						 "taqm.epa.gov.tw               ",
						 "taqm.epa.gov.tw_H             ",
						 "TBROC-ALI-WEB01               ",
						 "TBROC-ALI-WEB02               ",
						 "TBROC-backupLine              ",
						 "TBROC-DB01                    ",
						 "TBROC-DB02                    ",
						 "TBROC-DB03                    ",
						 "TBROC-DB04                    ",
						 "TBROC-DB05                    ",
						 "TBROC-DB06                    ",
						 "TBROC-DBNSA-WEB01             ",
						 "TBROC-ECNSA-WEB01             ",
						 "TBROC-ERV-WEB01               ",
						 "TBROC-MAOLIN-WEB01            ",
						 "TBROC-MATSU-WEB01             ",
						 "TBROC-NEYC-WEB01              ",
						 "TBROC-NEYC-WEB02              ",
						 "TBROC-NGN-WEB01               ",
						 "TBROC-PH-WEB01                ",
						 "TBROC-SIRAYA-WEB01            ",
						 "TBROC-SML-WEB01               ",
						 "TBROC-SWCOAST-WEB01           ",
						 "TBROC-TRIMT-WEB01             ",
						 "TBROC-WEB01                   ",
						 "TBROC-WEB02                   ",
						 "TBROC-WEB03                   ",
						 "TBROC-WEB04                   ",
						 "TBROC-WEB05                   ",
						 "TBROC-WEB06                   ",
						 "TBROC-WEB07                   ",
						 "TBROC-WEB08                   ",
						 "TBROC-WEB09                   ",
						 "TBROC-WEB10                   ",
						 "TBROC-WEB11                   ",
						 "TBROC-WEB12                   ",
						 "TBROC-WEB13                   ",
						 "TBROC-WEB14                   ",
						 "TBROC-WEB15                   ",
						 "TBROC-WEB17                   ",
						 "TBROC-WEB18                   ",
						 "TBROC-WEB19                   ",
						 "TBROC-WEB20                   ",
						 "TBROC-WEB21                   ",
						 "TBROC-WEB22                   ",
						 "TBROC-WEB23                   ",
						 "TBROC-WEB24                   ",
						 "TBROC-WEB25                   ",
						 "TBROC-WEB26                   ",
						 "TBROC-WEB27                   ",
						 "TBROC-WEB29                   ",
						 "TBROC-WEB30                   ",
						 "TBROC-WEB31                   ",
						 "TBROC-WEB32                   ",
						 "TBROC-WEB33                   ",
						 "theme.archives.gov.tw         ",
						 "TPC-DNS1                      ",
						 "TPC-DNS2                      ",
						 "TPC-DNS3                      ",
						 "TPC-DNS4                      ",
						 "ust.epa.gov.tw                ",
						 "ust.epa.gov.tw_H              ",
						 "Water-WebMonitoring           ",
						 "web2.moeaboe.gov.tw_oil       ",
						 "web3.moeaboe.gov.tw_chp       ",
						 "web3.moeaboe.gov.tw_ecw       ",
						 "web3.moeaboe.gov.tw_ecwadmin  ",
						 "web3.moeaboe.gov.tw_eiaaudit  ",
						 "web3.moeaboe.gov.tw_gsl       ",
						 "web3.moeaboe.gov.tw_oil102    ",
						 "web3.moeaboe.gov.tw_wesnq     ",
						 "webmail.moeaboe.gov.tw        ",
						 "wiki.archives.gov.tw          ",
						 "wq.epa.gov.tw                 ",
						 "wq.epa.gov.tw_H               ",
						 "www.archives.gov.tw           ",
						 "www.cga.gov.tw                ",
						 "www.epa.gov.tw                ",
						 "www.epa.gov.tw_H              ",
						 "www.gretai.org.tw             ",
						 "www.moeaboe.gov.tw            ",
						 "www.moeasmea.gov.tw           ",
						 "www.odbbs.gov.tw              "
						 };

		// new

		String[] orange = {
	//			 String[] Newlist = {
						 "across.archives.gov.tw            ",
						 "alohas.archives.gov.tw            ",
						 "EPA-ACCSI-CSPMonitor-TP           ",
						 "EPA-ACCSI-Icinga-TP               ",
						 "mail.archives.gov.tw              ",
						 "MOEA-2k3dmz5-psnlogin             ",
						 "MOEA-2k3dmz5-srvlogin             ",
						 "MOEA-CSR                          ",
						 "MOEA-DMZ1                         ",
						 "MOEA-DMZ8-1                       ",
						 "MOEA-DMZ8-2                       ",
						 "MOEA-DMZ9-bnweb                   ",
						 "MOEA-DMZ9-goweb                   ",
						 "MOEA-DMZ9-gsweb                   ",
						 "MOEA-DMZ9-QsWebln                 ",
						 "MOEA-GODoms                       ",
						 "MOEA-IDIC-BACK                    ",
						 "MOEA-InvestTW3ap                  ",
						 "MOEA-InvestTW4ap                  ",
						 "MOEA-InvestTW5km                  ",
						 "MOEA-ngisweb2008                  ",
						 "MOEA-w2koa01                      ",
						 "NASC-HD-AIR3                      ",
						 "NASC-HD-AIR4                      ",
						 "NASC-HD-IBM-BACKUP                ",
						 "NASC-HD-Storage                   ",
						 "NASC-LT-DTVH                      ",
						 "near.archives.gov.tw              ",
						 "online.archives.gov.tw            ",
						 "TBROC-ALI-WEB01                   ",
						 "TBROC-DB01                        ",
						 "TBROC-DB02                        ",
						 "TBROC-DB03                        ",
						 "TBROC-DBNSA-WEB01                 ",
						 "TBROC-ECNSA-WEB01                 ",
						 "TBROC-ERV-WEB01                   ",
						 "TBROC-MAOLIN-WEB01                ",
						 "TBROC-MATSU-WEB01                 ",
						 "TBROC-NEYC-WEB01                  ",
						 "TBROC-NGN-WEB01                   ",
						 "TBROC-PH-WEB01                    ",
						 "TBROC-SIRAYA-WEB01                ",
						 "TBROC-SML-WEB01                   ",
						 "TBROC-SWCOAST-WEB01               ",
						 "TBROC-TRIMT-WEB01                 ",
						 "TBROC-WEB01                       ",
						 "TBROC-WEB02                       ",
						 "TBROC-WEB03                       ",
						 "TBROC-WEB04                       ",
						 "TBROC-WEB05                       ",
						 "TBROC-WEB06                       ",
						 "TBROC-WEB07                       ",
						 "TBROC-WEB08                       ",
						 "theme.archives.gov.tw             ",
						 "wiki.archives.gov.tw              ",
						 "www.archives.gov.tw               ",
						 "eDC-SL-048                        ",
						 "edw.epa.gov.tw                    ",
						 "prtr.epa.gov.tw                   ",
						 "taqm.epa.gov.tw                   ",
						 "www.epa.gov.tw                    ",
						 "aa.archives.gov.tw                ",
						 "EPA-ACCSI-Icinga2-TP              ",
						 "MOEA-csmgg                        ",
						 "MOEA-csmgr                        ",
						 "MOEA-ecenter1                     ",
						 "MOEA-ecenter2                     ",
						 "MOEA-ecenter3                     ",
						 "MOEA-ecenter4                     ",
						 "MOEA-ecenter5                     ",
						 "MOEA-ecenter6                     ",
						 "MOEA-Exchange-OWA                 ",
						 "Water-WebMonitoring               ",
						 "edic.good.nat.gov.tw              ",
						 "edit.good.nat.gov.tw              ",
						 "editad.good.nat.gov.tw            ",
						 "edoc.good.nat.gov.tw              ",
						 "EPA-ACCSI-Oz-TP                   ",
						 "mgonline.good.nat.gov.tw          ",
						 "mgt2.good.nat.gov.tw              ",
						 "mgtp.good.nat.gov.tw              ",
						 "stat.good.nat.gov.tw              ",
						 "www.odbbs.gov.tw                  ",
						 "163.29.3.84_imail                 ",
						 "163.29.3.85_imail                 ",
						 "edit_adbook                       ",
						 "edit_announce                     ",
						 "MOEA-DMZ9-IPCWEB                  ",
						 "MOEA-DNS                          ", 
						 "MOEA-DNS3                         ", 
						 "MOEA-EGIS                         ", 
						 "MOEA-Giwebfill                    ",
						 "CPC-HQSwwwy                       ",
						 "edw.epa.gov.tw_H                  ",
						 "erlp.archives.gov.tw              ",
						 "prtr.epa.gov.tw_H                 ",
						 "taqm.epa.gov.tw_H                 ",
						 "webmail.moeaboe.gov.tw            ",
						 "www.epa.gov.tw_H                  ",
						 "www.moeaboe.gov.tw                ",
						 "book.moeasmea.gov.tw              ",
						 "CY-DnsInCy                        ",
						 "CY-DnsInGsn                       ",
						 "CY-Icinga                         ",
						 "CY-notDonate                      ",
						 "director.moeasmea.gov.tw          ",
						 "MOEA-cloudapp                     ",
						 "MOEA-moeaspace                    ",
						 "moeasmea-DNS1                     ",
						 "moeasmea-DNS3                     ",
						 "pms.moeasmea.gov.tw               ",
						 "wq.epa.gov.tw                     ",
						 "wq.epa.gov.tw_H                   ",
						 "www.cga.gov.tw                    ",
						 "www.moeasmea.gov.tw               ",
						 "dns.cga.gov.tw                    ",
						 "eDC_2DNS_check                    ",
						 "Moea_2DNS_check                   ",
						 "Moeasmea_2DNS_check               ",
						 "MOEASMEA-TC-logger                ",
						 "MOEASMEA-TC-Snort                 ",
						 "NSB-Web                           ",
						 "EPA-TC-Firewall-WAN               ",
						 "EPA-TC-Firewall-WAN_H             ",
						 "EPA-TP-Firewall-WAN               ",
						 "EPA-TP-Firewall-WAN_H             ",
						 "MOEASMEA-TC-FSA03                 ",
						 "CY-Web-test                       ",
						 "localhost                         ",
						 "MOFA-Icinga                       ",
						 "TBROC-backupLine                  ",
						 "ust.epa.gov.tw                    ",
						 "ust.epa.gov.tw_H                  ",
						 "CY-ards                           ",
						 "CY-assetweb                       ",
						 "CY-building                       ",
						 "CY-humanrights                    ",
						 "CY-humanrightsEn                  ",
						 "CY-kids                           ",
						 "CY-pdis                           ",
						 "CY-sunshine                       ",
						 "CY-www                            ",
						 "CY-wwwEn                          ",
						 "CY-wwwPDA                         ",
						 "eric.epa.gov.tw                   ",
						 "eric.epa.gov.tw_H                 ",
						 "MOEA-dmz2-bmweb                   ",
						 "MOEA-dmz2-btweb                   ",
						 "MOEA-dmz2-itweb                   ",
						 "MOEA-dmz2-maweb                   ",
						 "MOEA-dmz2-meeting                 ",
						 "MOEA-dmz2-olweb                   ",
						 "MOEA-DMZ9-gbweb                   ",
						 "MOEA-DMZ9-GMWEB                   ",
						 "MOEAGCIS-AP11                     ",
						 "MOEAGCIS-AP12                     ",
						 "MOEAGCIS-DB11                     ",
						 "MOEAGCIS-DB12                     ",
						 "MOEAGCIS-DIR11                    ",
						 "MOEAGCIS-DIR12                    ",
						 "MOEAGCIS-DS11                     ",
						 "MOEAGCIS-IDE11                    ",
						 "MOEAGCIS-IDE12                    ",
						 "MOEAGCIS-POR11                    ",
						 "MOEAGCIS-POR12                    ",
						 "MOEAGCIS-POR13                    ",
						 "MOEAGCIS-POR14                    ",
						 "MOEAGCIS-QD11                     ",
						 "MOEAGCIS-QD12                     ",
						 "MOI-DNS                           ",
						 "web2.moeaboe.gov.tw_oil           ",
						 "web3.moeaboe.gov.tw_chp           ",
						 "web3.moeaboe.gov.tw_ecw           ",
						 "web3.moeaboe.gov.tw_ecwadmin      ",
						 "web3.moeaboe.gov.tw_eiaaudit      ",
						 "web3.moeaboe.gov.tw_gsl           ",
						 "web3.moeaboe.gov.tw_oil102        ",
						 "web3.moeaboe.gov.tw_wesnq         ",
						 "MOEA-AAWEB                        ",
						 "MOEA-dmz2-director                ",
						 "MOEA-DMZ9-MRWEB                   ",
						 "Moeaboe-Icinga                    ",
						 "TPC-DNS1                          ",
						 "TPC-DNS2                          ",
						 "TPC-DNS3                          ",
						 "TPC-DNS4                          ",
						 "gisa.gretai.org.tw                ",  
						 "gofunding.gretai.org.tw           ",  
						 "MOI-CAND                          ",  
						 "MOI-COAA                          ",  
						 "MOI-COIS                          ",  
						 "MOI-comgis                        ",  
						 "MOI-COOP                          ",  
						 "MOI-data                          ",  
						 "MOI-dr100                         ",  
						 "MOI-eclient                       ",  
						 "MOI-Elearning                     ",  
						 "MOI-EMSG                          ",  
						 "MOI-farmeriiqry                   ",  
						 "MOI-GLRS                          ",  
						 "MOI-hotline                       ",  
						 "MOI-icensus                       ",  
						 "MOI-maritimeinfo                  ",  
						 "MOI-moisagis                      ",  
						 "MOI-mort                          ",  
						 "MOI-ngis                          ",  
						 "MOI-NGIS2                         ",  
						 "MOI-ngiseq                        ",  
						 "MOI-npersonnel                    ",  
						 "MOI-owgateway                     ",  
						 "MOI-placesearch                   ",  
						 "MOI-rdec                          ",  
						 "MOI-religion                      ",  
						 "MOI-segis                         ",  
						 "MOI-service                       ",  
						 "MOI-standards                     ",  
						 "MOI-statis                        ",  
						 "MOI-statis2                       ",  
						 "MOI-taiwanarmap                   ",  
						 "MOI-webmail                       ",  
						 "MOI-www                           ",  
						 "taicgof.gretai.org.tw             ",  
						 "taipeibond.gretai.org.tw          ",  
						 "www.gretai.org.tw                 "	
		};

		for (int i = 0; i < orange.length; i++) {
			OList.add(i, orange[i].trim());
		}

		for (int i = 0; i < Newlist.length; i++) {
			if (!OList.contains(Newlist[i].trim())) {
				System.out.println(Newlist[i]);
			}

		}

	}
}
