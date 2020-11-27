<?php

echo "Hello,";

if (count($argv) > 1)
    for ($i = 1; $i < count($argv); ++$i)
        printf(" %s", ucwords($argv[$i]));
else
    echo " World";

echo "!\n";
