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

## Endpoints:
Please use relevant {Id} while making the request. 100 is given as example.

* GetAllPatients - GET: http://localhost:8080/api/patients

* CreatePatientRecord - POST: http://localhost:8080/api/patients

  * payload: {

  "id": 100,
"firstName": "Hunders",
"lastName": "hundredth",
"email": "gconner@example.com"
}

* GetAPatientById - GET: http://localhost:8080/api/patients/100

* DeletePatientById - DELETE: http://localhost:8080/api/patients/100