<?php

require_once 'lib.php';

$n1 = 43;
$n2 = 7;
$nrest = 0;

$n1 = div($n1,$n2,$nrest);



echo $nrest . '<br>' . $n1;