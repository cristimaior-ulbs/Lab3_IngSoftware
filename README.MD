Roster League
=============
This example is adapted from the persistence example from https://github.com/eclipse-ee4j/jakartaee-examples
The tutorial documentation is available at https://jakartaee.github.io/jakartaee-documentation/jakartaee-tutorial/current/persist/persistence-basicexamples/persistence-basicexamples.html#_the_roster_application

Roster League is a simple web application to manage a sports league roster.
It allows users to create teams, add players, and view team rosters.

The application is built using Jakarta EE technologies including Servlets, JPA, and EJB.
The purpose of this example is to demonstrate the use of JPA.

# Running the Application

This application is designed to run on a GlassFish server. It can be downloaded from https://glassfish.org/download.html
To simplify the database setup, it uses the JavaDB (Derby) as a database which comes bundled with GlassFish.

The next steps outline using the IntelliJ IDEA IDE to run the application.

To run the application locally, you need to add GlassFish as a run configuration in your IDE.
Click edit configurations on the Run menu, add new configuration - select GlassFish Server Local, select your GlassFish 
installation path and domain from the dropdown (domain1 by default), and then select the deployment artifact as this 
project (RosterLeague-1.0-SNAPSHOT.war)

Before running the application, ensure that the database is started. To start it, open a terminal and navigate to 
the `bin` directory of your GlassFish installation. Example path: `C:\Users\Alex\glassfish7\bin`

Depending on your operating system or terminal choice, run the appropriate command to start the database:

In Windows Command Prompt:
```cmd
asadmin.bat start-database
```

In Windows PowerShell:
```powershell
.\asadmin start-database
```

In Git Bash, Unix/Linux or macOS terminal:
```sh
./asadmin start-database
```

If the command is successful, you should see a message indicating that the command completed successfully.
Stopping the database can be done similarly using the `stop-database` command.

Once the configuration is set up, you can run the application directly from your IDE. 
The application will be accessible at http://localhost:8080/RosterLeague-1.0-SNAPSHOT/ 
(the default IDE configuration will open the browser automatically after the server started and the application is deployed).

Troubleshooting
===============
When running the application, if you encounter an error related to the database connection, 
ensure that the JavaDB (Derby) is started as described above. An example error message might look like this:

```
Internal Exception: 
 java.sql.SQLException: Failed to obtain/create connection
```

After starting the database, redeploy the application - there is no need to restart the server.