CC              := gcc
DEBUG_LEVEL     := -g
EXTRA_CCFLAGS   := -Wall -Werror=return-type -Wextra -pedantic
OPT             := -O0
CFLAGS          := $(DEBUG_LEVEL) $(EXTRA_CCFLAGS) $(OPT)
LDLIBS          := -lm

INC             := include
SRC             := src

HELLO           := hello

OBJ             := $(HELLO).o
                  
# $@ targt name
# $< first prerequisite
# $^ all prerequisites

$(HELLO): $(OBJ)
	$(CC) -o $@ $^
	rm $(HELLO).o

$(HELLO).o: $(HELLO).c

.PHONY: clean

clean:
	rm -f *.o *.out $(HELLO)
