Gradle configurable project
===========================

## Overview
Variables controllable build.

What can be configured:
 - Showing message in stdout
 - Failing build with message
 - Delaying build execution time
 
## Configuration
Properties:
 - testMessage
 - failMessage
 - sleepTime
 - variablesSource (set this to 'environment' to use environment variables)
 
Environment variables:
- TEST_MESSAGE
- FAIL_MESSAGE
- SLEEP_TIME

### Examples 

Fail with a given message:
<pre>

</pre>
