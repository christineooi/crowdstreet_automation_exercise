# crowdstreet_automation_exercise
An automation test to automate the process of creating a new account

Automation test was written using the Selenium, Java, Maven, TestNG framework

Steps to run test locally on PC:

Step 1. Download and install Java JDK 11.  In command prompt, type java -version and press Enter to see which java version is installed

Step 2. Set Up Java Environment Variable

  a. Go to This PC and right-click on the empty space anywhere within and select Properties
	
  b. Click on Advanced System Settings so that a new pop up opens up.
	
  c. Now, from the pop-up window click on Environment Variables
	
  d. Click on the New button under System variables.
	
  e. Type “JAVA_HOME” in the Variable name box and ‘C:\Program Files\Java\jdk<version here>’ JDK path in the Variable value box and save the same.
	
Step 3. Download Maven and Set Up Maven Environment Variable
	
  a. Maven can be downloaded from below location:
     https://Maven.apache.org/download.cgi
	
  b. Extract it to some location in your machine as per your convenience.
	
  c. You can set up the Maven Environment Variable similar to how we set up the Java Environment Variable in steps above.
	
  d.  Type ‘Maven_HOME’ in the Variable name box and ‘C:\apache-Maven-<version here>’ in the Variable value box.
	
Step 4. Update the Path Variable
In order to run Maven from the command line, we have to necessarily update the Path Variable with Maven’s installation ‘bin’ directory.
	
  a. Open system properties through My Computer.
	
  b. Navigate to ‘Advanced System Settings’.
	
  c.  Click on ‘Environment Variables’.
	
  d.  Click on the Edit button under user variables.
	
  e.  Type ‘PATH’ in the Variable name box & ‘C:\apache-Maven-<version here\bin’ in the Variable value box.
																																			 
Step 5. Test the Maven Installation
Open command prompt and type mvn -version and hit Enter to see the version of Maven installed
																																			 
Step 6. Download the latest chromedriver and save it to a folder
																																			 
Step 7. Open up project in an IDE and change the chromepath in the qa.properties file to the path to the chromedriver from Step 6
																																			 
Step 8. Run the registerTest() method in RegisterTests.java
