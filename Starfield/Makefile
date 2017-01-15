#
# A simple makefile for compiling three java classes
#
JV = java
JCC = javac
JDEBUG = -g
JDIR = -d
JRFLAGS = -cp
JPACK = starfield.Starfield
RMPATH = bin/starfield/*.class
CLEAR = clear

all:
	$(JCC) $(JDEBUG) $(JDIR) bin *.java

run:
	$(JV) $(JRFLAGS) bin $(JPACK)

clean: 
	$(RM) $(RMPATH)
	$(CLEAR)