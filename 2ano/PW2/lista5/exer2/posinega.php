<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>posinega.php</title>
</head>
<body>
  <?php
    $n1 = $_POST['txtn1'];
    
    if($n1>=0)
     echo '<span style="color:blue">O número digitado é positivo:</span>';
    elseif($n1<0)
    echo '<span style="color:red">O número digitado é negativo</span>';
  ?> 
</body>
</html>