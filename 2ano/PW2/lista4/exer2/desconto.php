<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>desconto.php</title>
</head>
<body>
  <?php
    $des = $_POST['txtdes'];
    $pre = $_POST['txtpre'];
    
    $desfinal = $pre*($des/100);
    echo 'o desconto de '.$des.'% de '.$pre.' é:'.$desfinal; 
  ?> 
</body>
</html>