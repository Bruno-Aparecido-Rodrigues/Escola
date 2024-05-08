<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>pesoi.php</title>
</head>
<body>
  <?php
    $nome = $_POST['txtnom'];
    $peso = $_POST['txtpes'];
    $altura = $_POST['txtalt'];
    $cbosexo = $_POST['cbosexo'];
    $pi =0;

    if($cbosexo=="Masculino"){
        $pi=($altura*$altura)*23;
          
          if($peso>$pi)
          echo '<span style="color:red">Acima do peso.</span><br>Peso ideal para você é de:'.$pi;
          elseif($peso<$pi)
          echo '<span style="color:yellow">Abaixo do peso.</span><br>Peso ideal para você é de:'.$pi;
          else
          echo '<span style="color:blue">Dentro do peso ideal:</span>'.$pi; }

    elseif($cbosexo=="Feminino"){  
         $pi=($altura*$altura)*22;
          
           if($peso>$pi)
           echo '<span style="color:red">Acima do peso.</span><br>Peso ideal para você é de:'.$pi;
           elseif($peso<$pi)
           echo '<span style="color:yellow">Abaixo do peso.</span><br>Peso ideal para você é de:'.$pi;
           else
           echo '<span style="color:blue">Dentro do peso ideal:</span>'.$pi;}
  ?> 
</body>
</html>