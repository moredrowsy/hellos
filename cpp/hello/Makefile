CXX             := g++
DEBUG_LEVEL     := -g
EXTRA_CCFLAGS   := -Wall -Werror=return-type -Wextra -pedantic
OPT             := -O0
CXXFLAGS        := $(DEBUG_LEVEL) $(EXTRA_CCFLAGS) $(OPT)
LDLIBS          := -lm -lstdc++

INC             := include
SRC             := src

HELLO           := hello

OBJ             := $(HELLO).o
                  
# $@ targt name
# $< first prerequisite
# $^ all prerequisites

$(HELLO): $(OBJ)
	$(CXX) -o $@ $^
	rm $(HELLO).o

$(HELLO).o: $(HELLO).cpp

.PHONY: clean

clean:
	rm -f *.o *.out $(HELLO)
