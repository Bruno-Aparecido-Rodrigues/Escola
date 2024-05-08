<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>parimpar.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    if($n1% 2 !=0)
    echo 'O número digitado é impar:';
    elseif($n1% 2 ==0)
    echo 'O número digitado é par:';
  ?> 
</body>
</html>