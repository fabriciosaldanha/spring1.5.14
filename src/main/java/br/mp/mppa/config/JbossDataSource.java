package br.mp.mppa.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Profile(value="JbossEAP64")
@ImportResource("classpath:config-bd.xml")
@Configuration
//@PropertySource(value = { "classpath:database/jdbc.properties" })
//@EnableTransactionManagement
public class JbossDataSource {
/*
    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
    private static final String PROPERTY_NAME_HIBERNATE_MAX_FETCH_DEPTH = "hibernate.max_fetch_depth";
    private static final String PROPERTY_NAME_HIBERNATE_JDBC_FETCH_SIZE = "hibernate.jdbc.fetch_size";
    private static final String PROPERTY_NAME_HIBERNATE_JDBC_BATCH_SIZE = "hibernate.jdbc.batch_size";
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    private static final String[] ENTITYMANAGER_PACKAGES_TO_SCAN = {"a.b.c.entities", "a.b.c.converters"};

    @Autowired
    private Environment env;
	
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {

         LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = null;
		try {
			entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
			 entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());
			 entityManagerFactoryBean.setDataSource(dataSource());
			 entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
			 entityManagerFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
			 entityManagerFactoryBean.setJpaProperties(jpaHibernateProperties());
		} catch (Exception e) {
			e.printStackTrace();
		}

         return entityManagerFactoryBean;
     }	
    private HibernateJpaVendorAdapter vendorAdaptor() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setShowSql(true);
        return vendorAdapter;
   }
	
	@Bean
	@ConfigurationProperties(prefix="app.datasource")
	public DataSource dataSource() throws Exception {
	    JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
	    return dataSourceLookup.getDataSource("java:jboss/datasources/oracleXE");
	}
	
    private Properties jpaHibernateProperties() {

        Properties properties = new Properties();

        properties.put(PROPERTY_NAME_HIBERNATE_MAX_FETCH_DEPTH, env.getProperty(PROPERTY_NAME_HIBERNATE_MAX_FETCH_DEPTH));
        properties.put(PROPERTY_NAME_HIBERNATE_JDBC_FETCH_SIZE, env.getProperty(PROPERTY_NAME_HIBERNATE_JDBC_FETCH_SIZE));
        properties.put(PROPERTY_NAME_HIBERNATE_JDBC_BATCH_SIZE, env.getProperty(PROPERTY_NAME_HIBERNATE_JDBC_BATCH_SIZE));
        properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, env.getProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
        properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, env.getProperty(PROPERTY_NAME_HIBERNATE_DIALECT));

        properties.put(AvailableSettings.SCHEMA_GEN_DATABASE_ACTION, "none");
        properties.put(AvailableSettings.USE_CLASS_ENHANCER, "false");      
        return properties;       
    }
    
    *	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory( EntityManagerFactoryBuilder builder ) {
	    try {
			LocalContainerEntityManagerFactoryBean build = builder
					.dataSource( dataSource() )
			        .packages( "br.mp.mppa.repository" )
			        .persistenceUnit("teste-pu")
			        .build();
			return build;
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return null;
	}
    *
    */
}
