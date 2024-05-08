<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>maiormenor.php</title>
</head>
<body>
  <?php
    $nA = $_POST['txtn1'];
    $nB = $_POST['txtn2'];
    $nC = $_POST['txtn3'];
    
   if($nA>$nB && $nB>$nC && $nA!=$nC)
   {
           echo 'o maior valor é A:'.$nA.' e o menor valor é C:'.$nC;
   }
   elseif($nA>$nB && $nB<$nC && $nA!=$nC)
   {
           echo 'o maior valor é A:'.$nA.' e o menor valor é B:'.$nB;
   } 
   elseif($nB>$nC && $nA<$nC && $nA!=$nB)
   {
           echo 'o maior valor é B:'.$nB.' e o menor valor é A:'.$nA;
   } 
   elseif($nB>$nA && $nA>$nC && $nB!=$nC)
   {
           echo 'o maior valor é B:'.$nB.' e o menor valor é C:'.$nC;
   } 
   elseif($nC>$nA && $nA<$nB && $nB!=$nC)
   {
           echo 'o maior valor é C:'.$nC.' e o menor valor é A:'.$nA;
   } 
   elseif($nC>$nA && $nA>$nB && $nB!=$nC)
   {
           echo 'o maior valor é C:'.$nC.' e o menor valor é B:'.$nB;
   } 
   elseif($nA==$nB || $nA==$nC ||$nB==$nC)
         echo 'desculpa mas números iguais foram digitados';
  ?> 
</body>
</html>