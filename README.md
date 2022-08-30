# TestNGExamples

### App Under Test ###

https://www.amsmeteors.org

(2022/08/30)

### Pre-requisites ###

* Im using IJ to create
* Im using GRADLE to build
* You will need to download ChromeDriver from https://chromedriver.chromium.org/downloads
* Update com.nemesissy.tests.TestCaseBase to point to your ChromeDriver

### Run all Tests

$ ./gradle test

### Run a  singe test
$ ./gradlew test --tests "com.nemesissy.tests.VerifyHomeLink"

### Location of the HTML report
./build/reports/tests/test/index.httml

### Usages
* Page Object Modeling
* Collections
* Waiting on actionalbe elements
* Asserting
* Logging
* Reporting
* Testcase Management Integration
