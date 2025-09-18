It is a java based calculator application.
It uses automate building, testing, packaging using maven integrated with jenkins

1️⃣ Prerequisites
1.Jenkins installed (either on Windows, Linux, or via Docker).
2.JDK installed on the Jenkins machine.
3.Maven installed on the Jenkins machine.
4.Your project in a Git repository

2️⃣ Configure Jenkins
1.Set up JDK & Maven in Jenkins
Go to: Manage Jenkins → Global Tool Configuration.

Add JDK:
Name: JDK-21 (or whatever you prefer)
JAVA_HOME path: example:C:\Program Files\Java\jdk-21

Add Maven:
Name: your maven name
Maven home: path to your maven ex:C:apache-maven-3.8.9-bin\apache-maven-3.8.9

2.Set PATH correctly
Jenkins uses its own environment. Make sure the tools are selected in the Jenkins job configuration.

3️⃣ Create a New Jenkins Job

1.Click New Item → choose Freestyle project (or Pipeline if you want scripted pipeline).

2.Name it e.g., Java-Calculator-Build.

3.Source Code Management
Choose Git and provide your repository URL.

4.Build Environment
Optionally check Delete workspace before build to avoid stale files.

5.Build Step
Choose Invoke top-level Maven targets
Goals: clean test package
Maven version: select the one you configured (Maven-3.8.9)
JDK: select JDK-21

4️⃣ Optional: Post-build Actions

-->Archive the artifact
    Choose Archive the artifacts
    Files to archive: target/*.jar
    This will keep the runnable JAR in Jenkins for download.
-->Publish JUnit test results
    Test report XMLs: target/surefire-reports/*.xml
    This allows Jenkins to show test results in the UI.

5️⃣ Run the Job
Click Build Now.
Jenkins will:
    Pull the latest code from Git.
    Run mvn clean test package.
    Produce the calculator-1.0-SNAPSHOT.jar.
    Archive the JAR and test reports.

6️⃣ Make It Fully Automated (Optional)

Add Triggers:
    Poll SCM: H/5 * * * * → check Git every 5 minutes.
    Webhook trigger from GitHub → build automatically when code is pushed.

    You now have CI/CD:
        Tests are automatically run.
        JAR is automatically created.
        Reports and artifacts are accessible from Jenkins.

7.After that the build result is send to the developer using email notification whether the build is successfull or failed; if failed it will also send the details why it is failed. This feature is added in post build action section in email notification with recipient email address or email server address.

✅ Result: Every commit or trigger builds the project automatically, runs tests, and produces a runnable JAR.