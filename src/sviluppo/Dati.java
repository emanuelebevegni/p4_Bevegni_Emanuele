package sviluppo;
import java.util.ArrayList;
/**
 * Classe per definire l'oggetto Dati
 */
public class Dati{
	
	/** Constanti per indicare la provenienza dell'App (cioè da quale AppStore è stata salvata)
	
	
    /** Attributi */
	private String versione;
	private String provenienza;

	//################# REVIEW
	//GOOGLEstore
    // App Version
	private String package_name_app_version;
    private ArrayList<String> app_version;
    private ArrayList<Double> daily_average_app_version;
	private ArrayList<Double> total_average_app_version;
	// Carrier
	private ArrayList<String> data_carrier;
	private String package_name_carrier;
	private ArrayList<String> carrier;
	private ArrayList<Double> daily_average_carrier;
    private ArrayList<Double> total_average_carrier;
    // Country
    private ArrayList<String> data_country;
	private String package_name_country;
	private ArrayList<String> country;
	private ArrayList<Double> daily_average_country;
    private ArrayList<Double> total_average_country;
    // Device
    private ArrayList<String> data_device;
	private String package_name_device;
	private ArrayList<String> device;
	private ArrayList<Double> daily_average_device;
    private ArrayList<Double> total_average_device;
    // Language
    private ArrayList<String> data_language;
   	private String package_name_language;
   	private ArrayList<String> language;
   	private ArrayList<Double> daily_average_language;
    private ArrayList<Double> total_average_language;
	// Os Version
    private ArrayList<String> data_os_version;
   	private String package_name_os_version;
   	private ArrayList<String> os_version;
   	private ArrayList<Double> daily_average_os_version;
    private ArrayList<Double> total_average_os_version;
    // Tablet
    private ArrayList<String> data_tablet;
   	private String package_name_tablet;
   	private ArrayList<String> tablet;
   	private ArrayList<Double> daily_average_tablet;
    private ArrayList<Double> total_average_tablet;
    // Overview
    private ArrayList<String> data_overview;
   	private String package_name_overview;
    private ArrayList<Double> daily_average_overview;
    private ArrayList<Double> total_average_overview;
    
    //WINDOWSstore
    // Rating new and revised
    private ArrayList<String> rating; //lista possibili valori di votazioni da 1 a 5
    private ArrayList<String> type;	  //serve per capire il tipo di rating se nuovo o no
    private double count_new;
    private double count_revised;
    // Rating average over time
    private String name;
    private ArrayList<String> date_win;
    private ArrayList<Double> count_average;
    // Rating market
    private ArrayList<String> market; //lista di nazioni per market
    private ArrayList<Double> average_rating;
    private ArrayList<Integer> number_rating;
    
	//############# INSTALLS
	//Overview
	private ArrayList<String>  overview_data;				//Anche WinStore (install)
	private ArrayList<Integer> overview_dailyUserInstalls;	//Anche WinStore (install)
	private ArrayList<Integer> overview_totUserInstalls;	
	private ArrayList<Integer> overview_dailyUserUninstalls;
	private ArrayList<Integer> overview_activeDeviceInstalls;
	
	//Aggregazione per carrier ( compagnie telefoniche )
	private ArrayList<String>  carrier_data;
	private ArrayList<Integer> carrier_totUserInstalls;
	private ArrayList<Integer> carrier_dailyUserInstalls;
	private ArrayList<Integer> carrier_dailyUserUninstalls;
	private ArrayList<Integer> carrier_activeDeviceInstalls;

	//Aggregazione per paese
	private ArrayList<String>  country_data;				//Anche WinStore (install)
	private ArrayList<Integer> country_dailyUserInstalls;	//Anche WinStore (install_markets)
	private ArrayList<Integer> country_totUserInstalls;
	private ArrayList<Integer> country_dailyUserUninstalls;
	private ArrayList<Integer> country_activeDeviceInstalls;
	
	//Aggregazione per device
	private ArrayList<String>  device_data;
	private ArrayList<Integer> device_totUserInstalls;
	private ArrayList<Integer> device_dailyUserInstalls;
	private ArrayList<Integer> device_dailyUserUninstalls;
	private ArrayList<Integer> device_activeDeviceInstalls;
	
	//Aggregazione per lingua
	private ArrayList<String> lang_data;
	private ArrayList<Integer> lang_totUserInstalls;
	private ArrayList<Integer> lang_dailyUserInstalls;
	private ArrayList<Integer> lang_dailyUserUninstalls;
	private ArrayList<Integer> lang_activeDeviceInstalls;
	
	//Aggregazione per versione OS
	private ArrayList<String>  osVersion_data;				//Anche WinStore (install)
	private ArrayList<Integer> osVersion_dailyUserInstalls;	//Anche WinStore (acquisition_os)
	private ArrayList<Integer> osVersion_totUserInstalls;
	private ArrayList<Integer> osVersion_dailyUserUninstalls;
	private ArrayList<Integer> osVersion_activeDeviceInstalls;
	
	//Aggregazione per tablet
	private ArrayList<String>  tablet_data;
	private ArrayList<Integer> tablet_totUserInstalls;
	private ArrayList<Integer> tablet_dailyUserInstalls;
	private ArrayList<Integer> tablet_dailyUserUninstalls;
	private ArrayList<Integer> tablet_activeDeviceInstalls;
	
	
	//SOLO WinStore
	private ArrayList<String>  failure_data;	
	private ArrayList<Integer> failure_count;	//quanti errori contenuti nell'app
	
	private ArrayList<String> data_app_version;
	
	/** 
	 * Costruttore della classe dati
	 * */
		
	public Dati() {
		
		this.data_app_version = new ArrayList<>();
		this.app_version = new ArrayList<>();
		this.daily_average_app_version = new ArrayList<>();
		this.total_average_app_version = new ArrayList<>();
		this.data_carrier = new ArrayList<>();
		this.carrier = new ArrayList<>();
		this.daily_average_carrier = new ArrayList<>();
		this.total_average_carrier = new ArrayList<>();
		this.data_country = new ArrayList<>();
		this.country = new ArrayList<>();
		this.daily_average_country = new ArrayList<>();
		this.total_average_country = new ArrayList<>();
		this.data_device = new ArrayList<>();
		this.device = new ArrayList<>();
		this.daily_average_device = new ArrayList<>();
		this.total_average_device = new ArrayList<>();
		this.data_language = new ArrayList<>();
		this.language = new ArrayList<>();
		this.daily_average_language = new ArrayList<>();
		this.total_average_language = new ArrayList<>();
		this.data_os_version = new ArrayList<>();
		this.os_version = new ArrayList<>();
		this.daily_average_os_version = new ArrayList<>();
		this.total_average_os_version = new ArrayList<>();
		this.data_tablet = new ArrayList<>();
		this.tablet = new ArrayList<>();
		this.daily_average_tablet = new ArrayList<>();
		this.total_average_tablet = new ArrayList<>();
		this.data_overview = new ArrayList<>();
		this.daily_average_overview = new ArrayList<>();
		this.total_average_overview = new ArrayList<>();
		this.rating = new ArrayList<>();
		this.type = new ArrayList<>();
		this.date_win = new ArrayList<>();
		this.count_average = new ArrayList<>();
		this.market = new ArrayList<>();
		this.average_rating = new ArrayList<>();
		this.number_rating = new ArrayList<>();
		this.overview_data = new ArrayList<>();
		this.overview_dailyUserInstalls = new ArrayList<>();
		this.overview_totUserInstalls = new ArrayList<>();
		this.overview_dailyUserUninstalls = new ArrayList<>();
		this.overview_activeDeviceInstalls = new ArrayList<>();
		this.carrier_data = new ArrayList<>();
		this.carrier_totUserInstalls = new ArrayList<>();
		this.carrier_dailyUserInstalls = new ArrayList<>();
		this.carrier_dailyUserUninstalls = new ArrayList<>();
		this.carrier_activeDeviceInstalls = new ArrayList<>();
		this.country_data = new ArrayList<>();
		this.country_dailyUserInstalls = new ArrayList<>();
		this.country_totUserInstalls = new ArrayList<>();
		this.country_dailyUserUninstalls = new ArrayList<>();
		this.country_activeDeviceInstalls = new ArrayList<>();
		this.device_data = new ArrayList<>();
		this.device_totUserInstalls = new ArrayList<>();
		this.device_dailyUserInstalls = new ArrayList<>();
		this.device_dailyUserUninstalls = new ArrayList<>();
		this.device_activeDeviceInstalls = new ArrayList<>();
		this.lang_data = new ArrayList<>();
		this.lang_totUserInstalls = new ArrayList<>();
		this.lang_dailyUserInstalls = new ArrayList<>();
		this.lang_dailyUserUninstalls = new ArrayList<>();
		this.lang_activeDeviceInstalls = new ArrayList<>();
		this.osVersion_data = new ArrayList<>();
		this.osVersion_dailyUserInstalls = new ArrayList<>();
		this.osVersion_totUserInstalls = new ArrayList<>();
		this.osVersion_dailyUserUninstalls = new ArrayList<>();
		this.osVersion_activeDeviceInstalls = new ArrayList<>();
		this.tablet_data = new ArrayList<>();
		this.tablet_totUserInstalls = new ArrayList<>();
		this.tablet_dailyUserInstalls = new ArrayList<>();
		this.tablet_dailyUserUninstalls = new ArrayList<>();
		this.tablet_activeDeviceInstalls = new ArrayList<>();
		this.failure_data = new ArrayList<>();
		this.failure_count = new ArrayList<>();
	}
	
	public String getVersione() {
		return versione;
	}
	
	public void setVersione(String versione) {
		this.versione = versione;
	}
	
	public String getProvenienza() {
		return provenienza;
	}
	
	public void setProvenienza(String provenienza) {
		this.provenienza = provenienza;
	}
	
	public ArrayList<String> getOverview_data() {
		return overview_data;
	}
	
	public void setOverview_data(ArrayList<String> overview_data) {
		this.overview_data = overview_data;
	}
	
	public ArrayList<Integer> getOverview_dailyUserInstalls() {
		return overview_dailyUserInstalls;
	}
	
	public void setOverview_dailyUserInstalls(ArrayList<Integer> overview_dailyUserInstalls) {
		this.overview_dailyUserInstalls = overview_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getOverview_totUserInstalls() {
		return overview_totUserInstalls;
	}
	
	public void setOverview_totUserInstalls(ArrayList<Integer> overview_totUserInstalls) {
		this.overview_totUserInstalls = overview_totUserInstalls;
	}
	
	public ArrayList<Integer> getOverview_dailyUserUninstalls() {
		return overview_dailyUserUninstalls;
	}
	
	public void setOverview_dailyUserUninstalls(ArrayList<Integer> overview_dailyUserUninstalls) {
		this.overview_dailyUserUninstalls = overview_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getOverview_activeDeviceInstalls() {
		return overview_activeDeviceInstalls;
	}
	
	public void setOverview_activeDeviceInstalls(ArrayList<Integer> overview_activeDeviceInstalls) {
		this.overview_activeDeviceInstalls = overview_activeDeviceInstalls;
	}
	
	public ArrayList<String> getCarrier_data() {
		return carrier_data;
	}
	
	public void setCarrier_data(ArrayList<String> carrier_data) {
		this.carrier_data = carrier_data;
	}
	
	public ArrayList<Integer> getCarrier_totUserInstalls() {
		return carrier_totUserInstalls;
	}
	
	public void setCarrier_totUserInstalls(ArrayList<Integer> carrier_totUserInstalls) {
		this.carrier_totUserInstalls = carrier_totUserInstalls;
	}
	
	public ArrayList<Integer> getCarrier_dailyUserInstalls() {
		return carrier_dailyUserInstalls;
	}
	
	public void setCarrier_dailyUserInstalls(ArrayList<Integer> carrier_dailyUserInstalls) {
		this.carrier_dailyUserInstalls = carrier_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getCarrier_dailyUserUninstalls() {
		return carrier_dailyUserUninstalls;
	}
	
	public void setCarrier_dailyUserUninstalls(ArrayList<Integer> carrier_dailyUserUninstalls) {
		this.carrier_dailyUserUninstalls = carrier_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getCarrier_activeDeviceInstalls() {
		return carrier_activeDeviceInstalls;
	}
	
	public void setCarrier_activeDeviceInstalls(ArrayList<Integer> carrier_activeDeviceInstalls) {
		this.carrier_activeDeviceInstalls = carrier_activeDeviceInstalls;
	}
	
	public ArrayList<String> getCountry_data() {
		return country_data;
	}
	
	public void setCountry_data(ArrayList<String> country_data) {
		this.country_data = country_data;
	}
	
	public ArrayList<Integer> getCountry_dailyUserInstalls() {
		return country_dailyUserInstalls;
	}
	
	public void setCountry_dailyUserInstalls(ArrayList<Integer> country_dailyUserInstalls) {
		this.country_dailyUserInstalls = country_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getCountry_totUserInstalls() {
		return country_totUserInstalls;
	}
	
	public void setCountry_totUserInstalls(ArrayList<Integer> country_totUserInstalls) {
		this.country_totUserInstalls = country_totUserInstalls;
	}
	
	public ArrayList<Integer> getCountry_dailyUserUninstalls() {
		return country_dailyUserUninstalls;
	}
	
	public void setCountry_dailyUserUninstalls(ArrayList<Integer> country_dailyUserUninstalls) {
		this.country_dailyUserUninstalls = country_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getCountry_activeDeviceInstalls() {
		return country_activeDeviceInstalls;
	}
	
	public void setCountry_activeDeviceInstalls(ArrayList<Integer> country_activeDeviceInstalls) {
		this.country_activeDeviceInstalls = country_activeDeviceInstalls;
	}
	
	public ArrayList<String> getDevice_data() {
		return device_data;
	}
	
	public void setDevice_data(ArrayList<String> device_data) {
		this.device_data = device_data;
	}
	
	public ArrayList<Integer> getDevice_totUserInstalls() {
		return device_totUserInstalls;
	}
	
	public void setDevice_totUserInstalls(ArrayList<Integer> device_totUserInstalls) {
		this.device_totUserInstalls = device_totUserInstalls;
	}
	
	public ArrayList<Integer> getDevice_dailyUserInstalls() {
		return device_dailyUserInstalls;
	}
	
	public void setDevice_dailyUserInstalls(ArrayList<Integer> device_dailyUserInstalls) {
		this.device_dailyUserInstalls = device_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getDevice_dailyUserUninstalls() {
		return device_dailyUserUninstalls;
	}
	
	public void setDevice_dailyUserUninstalls(ArrayList<Integer> device_dailyUserUninstalls) {
		this.device_dailyUserUninstalls = device_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getDevice_activeDeviceInstalls() {
		return device_activeDeviceInstalls;
	}
	
	public void setDevice_activeDeviceInstalls(ArrayList<Integer> device_activeDeviceInstalls) {
		this.device_activeDeviceInstalls = device_activeDeviceInstalls;
	}
	
	public ArrayList<String> getLang_data() {
		return lang_data;
	}
	
	public void setLang_data(ArrayList<String> lang_data) {
		this.lang_data = lang_data;
	}
	
	public ArrayList<Integer> getLang_totUserInstalls() {
		return lang_totUserInstalls;
	}
	
	public void setLang_totUserInstalls(ArrayList<Integer> lang_totUserInstalls) {
		this.lang_totUserInstalls = lang_totUserInstalls;
	}
	
	public ArrayList<Integer> getLang_dailyUserInstalls() {
		return lang_dailyUserInstalls;
	}
	
	public void setLang_dailyUserInstalls(ArrayList<Integer> lang_dailyUserInstalls) {
		this.lang_dailyUserInstalls = lang_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getLang_dailyUserUninstalls() {
		return lang_dailyUserUninstalls;
	}
	
	public void setLang_dailyUserUninstalls(ArrayList<Integer> lang_dailyUserUninstalls) {
		this.lang_dailyUserUninstalls = lang_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getLang_activeDeviceInstalls() {
		return lang_activeDeviceInstalls;
	}
	
	public void setLang_activeDeviceInstalls(ArrayList<Integer> lang_activeDeviceInstalls) {
		this.lang_activeDeviceInstalls = lang_activeDeviceInstalls;
	}
	
	public ArrayList<String> getOsVersion_data() {
		return osVersion_data;
	}
	
	public void setOsVersion_data(ArrayList<String> osVersion_data) {
		this.osVersion_data = osVersion_data;
	}
	
	public ArrayList<Integer> getOsVersion_dailyUserInstalls() {
		return osVersion_dailyUserInstalls;
	}
	
	public void setOsVersion_dailyUserInstalls(ArrayList<Integer> osVersion_dailyUserInstalls) {
		this.osVersion_dailyUserInstalls = osVersion_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getOsVersion_totUserInstalls() {
		return osVersion_totUserInstalls;
	}
	
	public void setOsVersion_totUserInstalls(ArrayList<Integer> osVersion_totUserInstalls) {
		this.osVersion_totUserInstalls = osVersion_totUserInstalls;
	}
	
	public ArrayList<Integer> getOsVersion_dailyUserUninstalls() {
		return osVersion_dailyUserUninstalls;
	}
	
	public void setOsVersion_dailyUserUninstalls(ArrayList<Integer> osVersion_dailyUserUninstalls) {
		this.osVersion_dailyUserUninstalls = osVersion_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getOsVersion_activeDeviceInstalls() {
		return osVersion_activeDeviceInstalls;
	}
	
	public void setOsVersion_activeDeviceInstalls(ArrayList<Integer> osVersion_activeDeviceInstalls) {
		this.osVersion_activeDeviceInstalls = osVersion_activeDeviceInstalls;
	}
	
	public ArrayList<String> getTablet_data() {
		return tablet_data;
	}
	
	public void setTablet_data(ArrayList<String> tablet_data) {
		this.tablet_data = tablet_data;
	}
	
	public ArrayList<Integer> getTablet_totUserInstalls() {
		return tablet_totUserInstalls;
	}
	
	public void setTablet_totUserInstalls(ArrayList<Integer> tablet_totUserInstalls) {
		this.tablet_totUserInstalls = tablet_totUserInstalls;
	}
	
	public ArrayList<Integer> getTablet_dailyUserInstalls() {
		return tablet_dailyUserInstalls;
	}
	
	public void setTablet_dailyUserInstalls(ArrayList<Integer> tablet_dailyUserInstalls) {
		this.tablet_dailyUserInstalls = tablet_dailyUserInstalls;
	}
	
	public ArrayList<Integer> getTablet_dailyUserUninstalls() {
		return tablet_dailyUserUninstalls;
	}
	
	public void setTablet_dailyUserUninstalls(ArrayList<Integer> tablet_dailyUserUninstalls) {
		this.tablet_dailyUserUninstalls = tablet_dailyUserUninstalls;
	}
	
	public ArrayList<Integer> getTablet_activeDeviceInstalls() {
		return tablet_activeDeviceInstalls;
	}
	
	public void setTablet_activeDeviceInstalls(ArrayList<Integer> tablet_activeDeviceInstalls) {
		this.tablet_activeDeviceInstalls = tablet_activeDeviceInstalls;
	}
	
	public ArrayList<String> getFailure_data() {
		return failure_data;
	}
	
	public void setFailure_data(ArrayList<String> failure_data) {
		this.failure_data = failure_data;
	}
	
	public ArrayList<Integer> getFailure_count() {
		return failure_count;
	}
	
	public void setFailure_count(ArrayList<Integer> failure_count) {
		this.failure_count = failure_count;
	}

	public ArrayList<String> getData_app_version() {
		return data_app_version;
	}

	public void setData_app_version(ArrayList<String> data_app_version) {
		this.data_app_version = data_app_version;
	}

	public String getPackage_name_app_version() {
		return package_name_app_version;
	}

	public void setPackage_name_app_version(String package_name_app_version) {
		this.package_name_app_version = package_name_app_version;
	}

	public ArrayList<String> getApp_version() {
		return app_version;
	}

	public void setApp_version(ArrayList<String> app_version) {
		this.app_version = app_version;
	}

	public ArrayList<Double> getDaily_average_app_version() {
		return daily_average_app_version;
	}

	public void setDaily_average_app_version(ArrayList<Double> daily_average_app_version) {
		this.daily_average_app_version = daily_average_app_version;
	}

	public ArrayList<Double> getTotal_average_app_version() {
		return total_average_app_version;
	}

	public void setTotal_average_app_version(ArrayList<Double> total_average_app_version) {
		this.total_average_app_version = total_average_app_version;
	}

	public ArrayList<String> getData_carrier() {
		return data_carrier;
	}

	public void setData_carrier(ArrayList<String> data_carrier) {
		this.data_carrier = data_carrier;
	}

	public String getPackage_name_carrier() {
		return package_name_carrier;
	}

	public void setPackage_name_carrier(String package_name_carrier) {
		this.package_name_carrier = package_name_carrier;
	}

	public ArrayList<String> getCarrier() {
		return carrier;
	}

	public void setCarrier(ArrayList<String> carrier) {
		this.carrier = carrier;
	}

	public ArrayList<Double> getDaily_average_carrier() {
		return daily_average_carrier;
	}

	public void setDaily_average_carrier(ArrayList<Double> daily_average_carrier) {
		this.daily_average_carrier = daily_average_carrier;
	}

	public ArrayList<Double> getTotal_average_carrier() {
		return total_average_carrier;
	}

	public void setTotal_average_carrier(ArrayList<Double> total_average_carrier) {
		this.total_average_carrier = total_average_carrier;
	}

	public ArrayList<String> getData_country() {
		return data_country;
	}

	public void setData_country(ArrayList<String> data_country) {
		this.data_country = data_country;
	}

	public String getPackage_name_country() {
		return package_name_country;
	}

	public void setPackage_name_country(String package_name_country) {
		this.package_name_country = package_name_country;
	}

	public ArrayList<String> getCountry() {
		return country;
	}

	public void setCountry(ArrayList<String> country) {
		this.country = country;
	}

	public ArrayList<Double> getDaily_average_country() {
		return daily_average_country;
	}

	public void setDaily_average_country(ArrayList<Double> daily_average_country) {
		this.daily_average_country = daily_average_country;
	}

	public ArrayList<Double> getTotal_average_country() {
		return total_average_country;
	}

	public void setTotal_average_country(ArrayList<Double> total_average_country) {
		this.total_average_country = total_average_country;
	}

	public ArrayList<String> getData_device() {
		return data_device;
	}

	public void setData_device(ArrayList<String> data_device) {
		this.data_device = data_device;
	}

	public String getPackage_name_device() {
		return package_name_device;
	}

	public void setPackage_name_device(String package_name_device) {
		this.package_name_device = package_name_device;
	}

	public ArrayList<String> getDevice() {
		return device;
	}

	public void setDevice(ArrayList<String> device) {
		this.device = device;
	}

	public ArrayList<Double> getDaily_average_device() {
		return daily_average_device;
	}

	public void setDaily_average_device(ArrayList<Double> daily_average_device) {
		this.daily_average_device = daily_average_device;
	}

	public ArrayList<Double> getTotal_average_device() {
		return total_average_device;
	}

	public void setTotal_average_device(ArrayList<Double> total_average_device) {
		this.total_average_device = total_average_device;
	}

	public ArrayList<String> getData_language() {
		return data_language;
	}

	public void setData_language(ArrayList<String> data_language) {
		this.data_language = data_language;
	}

	public String getPackage_name_language() {
		return package_name_language;
	}

	public void setPackage_name_language(String package_name_language) {
		this.package_name_language = package_name_language;
	}

	public ArrayList<String> getLanguage() {
		return language;
	}

	public void setLanguage(ArrayList<String> language) {
		this.language = language;
	}

	public ArrayList<Double> getDaily_average_language() {
		return daily_average_language;
	}

	public void setDaily_average_language(ArrayList<Double> daily_average_language) {
		this.daily_average_language = daily_average_language;
	}

	public ArrayList<Double> getTotal_average_language() {
		return total_average_language;
	}

	public void setTotal_average_language(ArrayList<Double> total_average_language) {
		this.total_average_language = total_average_language;
	}

	public ArrayList<String> getData_os_version() {
		return data_os_version;
	}

	public void setData_os_version(ArrayList<String> data_os_version) {
		this.data_os_version = data_os_version;
	}

	public String getPackage_name_os_version() {
		return package_name_os_version;
	}

	public void setPackage_name_os_version(String package_name_os_version) {
		this.package_name_os_version = package_name_os_version;
	}

	public ArrayList<String> getOs_version() {
		return os_version;
	}

	public void setOs_version(ArrayList<String> os_version) {
		this.os_version = os_version;
	}

	public ArrayList<Double> getDaily_average_os_version() {
		return daily_average_os_version;
	}

	public void setDaily_average_os_version(ArrayList<Double> daily_average_os_version) {
		this.daily_average_os_version = daily_average_os_version;
	}

	public ArrayList<Double> getTotal_average_os_version() {
		return total_average_os_version;
	}

	public void setTotal_average_os_version(ArrayList<Double> total_average_os_version) {
		this.total_average_os_version = total_average_os_version;
	}

	public ArrayList<String> getData_tablet() {
		return data_tablet;
	}

	public void setData_tablet(ArrayList<String> data_tablet) {
		this.data_tablet = data_tablet;
	}

	public String getPackage_name_tablet() {
		return package_name_tablet;
	}

	public void setPackage_name_tablet(String package_name_tablet) {
		this.package_name_tablet = package_name_tablet;
	}

	public ArrayList<String> getTablet() {
		return tablet;
	}

	public void setTablet(ArrayList<String> tablet) {
		this.tablet = tablet;
	}

	public ArrayList<Double> getDaily_average_tablet() {
		return daily_average_tablet;
	}

	public void setDaily_average_tablet(ArrayList<Double> daily_average_tablet) {
		this.daily_average_tablet = daily_average_tablet;
	}

	public ArrayList<Double> getTotal_average_tablet() {
		return total_average_tablet;
	}

	public void setTotal_average_tablet(ArrayList<Double> total_average_tablet) {
		this.total_average_tablet = total_average_tablet;
	}

	public ArrayList<String> getData_overview() {
		return data_overview;
	}

	public void setData_overview(ArrayList<String> data_overview) {
		this.data_overview = data_overview;
	}

	public String getPackage_name_overview() {
		return package_name_overview;
	}

	public void setPackage_name_overview(String package_name_overview) {
		this.package_name_overview = package_name_overview;
	}

	public ArrayList<Double> getDaily_average_overview() {
		return daily_average_overview;
	}

	public void setDaily_average_overview(ArrayList<Double> daily_average_overview) {
		this.daily_average_overview = daily_average_overview;
	}

	public ArrayList<Double> getTotal_average_overview() {
		return total_average_overview;
	}

	public void setTotal_average_overview(ArrayList<Double> total_average_overview) {
		this.total_average_overview = total_average_overview;
	}

	public ArrayList<String> getRating() {
		return rating;
	}

	public void setRating(ArrayList<String> rating) {
		this.rating = rating;
	}

	public ArrayList<String> getType() {
		return type;
	}

	public void setType(ArrayList<String> type) {
		this.type = type;
	}

	public double getCount_new() {
		return count_new;
	}

	public void setCount_new(double count_new) {
		this.count_new = count_new;
	}

	public double getCount_revised() {
		return count_revised;
	}

	public void setCount_revised(double count_revised) {
		this.count_revised = count_revised;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getDate_win() {
		return date_win;
	}

	public void setDate_win(ArrayList<String> date_win) {
		this.date_win = date_win;
	}

	public ArrayList<Double> getCount_average() {
		return count_average;
	}

	public void setCount_average(ArrayList<Double> count_average) {
		this.count_average = count_average;
	}

	public ArrayList<String> getMarket() {
		return market;
	}

	public void setMarket(ArrayList<String> market) {
		this.market = market;
	}

	public ArrayList<Double> getAverage_rating() {
		return average_rating;
	}

	public void setAverage_rating(ArrayList<Double> average_rating) {
		this.average_rating = average_rating;
	}

	public ArrayList<Integer> getNumber_rating() {
		return number_rating;
	}

	public void setNumber_rating(ArrayList<Integer> number_rating) {
		this.number_rating = number_rating;
	}
	
}