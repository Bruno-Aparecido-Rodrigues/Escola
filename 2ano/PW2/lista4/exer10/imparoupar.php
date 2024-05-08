<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>imparoupar.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];

        if($n1 %2 !=0){
                    echo 'o número digitado é impar';
                 }
          elseif($n1 %2 ==0){ 
               echo 'o número digitado é par';
            }   
  ?> 
</body>
</html>