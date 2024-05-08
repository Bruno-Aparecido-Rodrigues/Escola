<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>nomsen.php</title>
</head>
<body>
  <?php
    $senha = $_POST['txtnom'];
    $nome = $_POST['txtsen'];
 
    if($nome=="ETE" && $senha=="ETE")
    echo 'Bem vindo ao Sistema';
    else
    echo 'Usuário ou senha inválidos!!, tente novamente!!!'
  ?> 
</body>
</html>