<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>impares decrescente.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    $n2 = $_POST['txtn2'];
    $impar=1;

    if($n1<$n2){
        if($n2 %2 !=0){
          for ($nA = $_POST['txtn2'] ; $nA >= $n1; $nA--)
          {
              if($nA %2 !=0) {
                    echo $nA.',';
                 }
          }
        } 
          elseif($n2 %2 ==0){ 
          for ($nA = $_POST['txtn2'] ; $nA >= 1; $nA--)
          {     
              if($n2 %2 ==0){
                  $nA=$nA-$impar;
                echo $nA.',';
            }
           }
        }
    }
elseif($n2<$n1){
    if($n1 %2 !=0){
        for ($nA = $_POST['txtn1'] ; $nA >= $n2; $nA--)
        {
            if($nA %2 !=0) {
                  echo $nA.',';
               }
        }
    }
    elseif($n1 %2 ==0){         
        for ($nA = $_POST['txtn1'] ; $nA >= 1; $nA--)
        {     
            if($n1 %2 ==0){
                $nA=$nA-$impar;
              echo $nA.',';
          }
         }
      }
}   
elseif($n1==$n2)
  echo 'não há números impares entre o primeiro e segundo valor';
  ?> 
</body>
</html>