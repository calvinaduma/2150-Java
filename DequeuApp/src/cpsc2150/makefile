default: cpsc2150/MyDeque/*.java
	javac -Xlint cpsc2150/MyDeque/*.java

runChar: default
	java cpsc2150.MyDeque.DequeApp

runInt: default
	java cpsc2150.MyDeque.IntegerDequeApp

test: cpsc2150/MyDeque/*.java
	java -cp .:/usr/share/java/junit4.jar cpsc2150/MyDeque/*.java

testArr: cpsc2150/MyDeque/.*class
	java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore cpsc2150.MyDeque.DequeApp
testList: cpsc2150/MyDeque/.*class
	java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore cpsc2150.MyDeque.DequeApp

clean:
	rm -f cpsc2150/MyDeque/*.class 
