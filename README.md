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
##### Fail with given message:
<pre>
$ gradle build -PfailMessage=Oops
> Task :configuredTask FAILED

FAILURE: Build failed with an exception.

* Where:
Build file 'C:\Users\Anykey\IdeaProjects\gradle-test-build\build.gradle' line: 39

* What went wrong:
Execution failed for task ':configuredTask'.
> Oops
...
</pre>

##### Delay build execution:
<pre>
$ gradle build -PsleepTime=5
</pre>

##### Fail after specified amount of time:
<pre>
$ gradle build -PsleepTime=5 -PfailMessage="Are we there yet?"
</pre>

##### Show message after specified amount of time:
<pre>
$ gradle build -PsleepTime=10 -ptestMessage="Finally I am here"
</pre>