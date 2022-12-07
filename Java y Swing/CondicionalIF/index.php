<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Project/PHP/PHPProject.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        $a = 4;
        $b = 7;
        $c = -12;
        $d = 4;
        $bool = false;
        
        if ($a == $c){
            echo "a y c son iguales";
            $bool = true;
        } elseif($a > $d) {
            echo "a es mayor a d";
            $bool = true;
        } elseif ($b * $d == 28 ){
            echo "la multiplicacion es correcta";
            $bool = true;
        } else {
            echo "nada de lo anterior se cumple";
        }
        
        
        if ($bool){
            echo "\n";
            echo "*** algo era correcto ***";
        }
        
        ?>
    </body>
</html>
