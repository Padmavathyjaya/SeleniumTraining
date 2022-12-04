$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Redbus.feature");
formatter.feature({
  "name": "sigin to redbus app",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature4"
    }
  ]
});
formatter.scenario({
  "name": "login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature4"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "TO launch the  chrome browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "RedBuspage.to_launch_the_chrome_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "launching  url",
  "keyword": "When "
});
formatter.match({
  "location": "RedBuspage.launching_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login option",
  "keyword": "And "
});
formatter.match({
  "location": "RedBuspage.click_login_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signin",
  "keyword": "And "
});
formatter.match({
  "location": "RedBuspage.click_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass the phonenumber",
  "keyword": "And "
});
formatter.match({
  "location": "RedBuspage.pass_the_phonenumber()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//input[@class\u003d\u0027IP\u0027])[1]\"}\n  (Session info: chrome\u003d107.0.5304.107)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SATHISH\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\Sathish\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:52514}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 25ccfb38a8646868d72d4d6db08d1b8d\n*** Element info: {Using\u003dxpath, value\u003d(//input[@class\u003d\u0027IP\u0027])[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy16.sendKeys(Unknown Source)\r\n\tat org.base.BaseClass.passText(BaseClass.java:56)\r\n\tat org.stepdefinition.RedBuspage.pass_the_phonenumber(RedBuspage.java:40)\r\n\tat ✽.pass the phonenumber(src/test/resources/Redbus.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "check whether navigate to the home page or not of facebook",
  "keyword": "And "
});
formatter.match({
  "location": "RedBuspage.check_whether_navigate_to_the_home_page_or_not_of_facebook()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the chrome  browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RedBuspage.close_the_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
});