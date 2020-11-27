#!/bin/bash

printf "Hello,"

if [ $# -gt 0 ]; then
    for var in "$@"; do
        printf ' %s' "${var^}"
    done
else
    printf " World"
fi

echo "!"
