# HonestBee

# Project Title

Running Test cases for Yahoo Weather App


### Prerequisites

We need to have install these below


1) Appium

2) Android studio

3) maven

4) jdk1.8





 
## Running the tests

1) Once emulator Android virtual device is up and appium server is up please run below command to start test

mvn clean test -DdeviceId=emulator-5556

Note:- If you want to run test on other devices just pass devicedid us -DdevicedId parameter.It will set uuid in desired capability like below


 dc.setCapability("udid","emulator-5556");



2) Once test are run report are present in below path in project

/target/surefire-reports/index.html






## Built With

* [Appium](http://appium.io/) - The mobile testing framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [testng](http://testng.org/) - testing framework
* [Selenium](http://www.seleniumhq.org/)-UI testing framework


## Run test on real android Devices

Steps

1) Connect your device to Laptop/Pc
2) Enable USB debugging. To enable USB Debugging please find below steps
   a) Navigate to Settings app on phone
   b) Scroll down and click on the Developer Options
   c) Turn on the Developer Options and click the USB Debugging.
3) Run command adb devices and make sure you are seeing your connected devices. adb devices will show your devices connected with udid

4)If you want to run test on other devices just pass devicedid us -DdevicedId parameter.It will set uuid in desired capability like below


 dc.setCapability("udid","emulator-5556");

5) Run mvn clean test to run tests.
