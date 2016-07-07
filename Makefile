JCC = javac
JFLAGS = -g -d . -cp .
COMPILE = $(JCC) $(JFLAGS)
LINK = $(JCC)
INCLUDES = 
LIBS = 

CLASSES = my_api.class \
	  test_my_api.class


%.class : %.java 
	    $(COMPILE) $^

all : $(CLASSES)

clean : 
	rm -f $(CLASSES)

.PHONY : all clean
