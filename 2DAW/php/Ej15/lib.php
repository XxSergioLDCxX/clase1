<?php

function div($n1,$n2,&$nrest){
  
    while ($n1 > $n2){

        $n1 = $n1 - $n2;
        $nrest++;   
       
       }

       return $n1;
}