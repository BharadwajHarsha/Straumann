# Straumann
Patient Hub Service

## Read Me
* Sample Data inserted through data.sql script
* Cache enabled
* Please add spring.profiles.active=[dev,qa,prod,test] in environment properties, defaultss to "dev" from application properties file value
* DB User change based on the profile set in environment property

    * dev - devuser/[NO PASSWORD]
    * qa - qauser/qauserpassword
    * prod - produser/produserpassword
    * test - testuser/testuserpassword
* Debug is enabled in "dev" profile

* 2 Test cases added
