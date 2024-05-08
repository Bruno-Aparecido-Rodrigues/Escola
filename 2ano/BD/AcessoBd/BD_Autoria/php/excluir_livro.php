<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1>Exclusão de Livros Cadastrados</h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtcod_livro" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">Código do Livro</label>
            </div>

            <div class='justify-center'>
            <button name="btnenviar" type="submit" value="Cadastrar">Excluir</button>
            <button name="limpar" type="reset" value="Cadastrar">Limpar</button>
            </div>

    
  </div>
  </div>

  </form>
  <?php

extract ($_POST, EXTR_OVERWRITE); 
if (isset($btnenviar))
{
    include_once 'Livro.php';
    $p= new Livro();
    $p->setCod_livro($txtcod_livro);
    echo "<h3>". $p->exclusao(). "</h3>"; //chamada de método - o Sp é o parâmetro enviado 
}
    ?> 
          </form>
          <center>   <br><br><br><br>
          <button><a href = "../menu.html"> Voltar </a></button>
</body>
</html>