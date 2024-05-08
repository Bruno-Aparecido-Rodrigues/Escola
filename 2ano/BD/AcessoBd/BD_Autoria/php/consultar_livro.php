<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1> Consulta de livros Cadastrados </h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtlivro" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">Nome do Livro</label>
            </div>
 
            <div class='justify-center'>
            <button name="btnenviar" type="submit" value="Cadastrar">Consultar</button>
            <button name="limpar" type="reset" value="Cadastrar">Limpar</button>
            </div>

    
  </div>
  </div>

  </form>

  <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'Livro.php';
        $pro = new Livro();
        $pro -> setTitulo($txtlivro.'%');
        $pro_bd = $pro->consultar();
        foreach($pro_bd as $pro_mostrar)
        {
        ?> <br>                             
        <b> <?php echo "<font color='white'><center> Cod_Livro:" . $pro_mostrar[0] .  // como é matriz - posição 0 
        "&nbsp;&nbsp;&nbsp;&nbsp;Título: " . $pro_mostrar[1] . // como é matriz - posição 1 
        "&nbsp;&nbsp;&nbsp;&nbsp;Categoria: " . $pro_mostrar[2] . // como é matriz - posição 2
        "&nbsp;&nbsp;&nbsp;&nbsp;ISBN: " . $pro_mostrar[3] . // como é matriz - posição 3
        "&nbsp;&nbsp;&nbsp;&nbsp;Idioma: " . $pro_mostrar[4] . // como é matriz - posição 4
        "&nbsp;&nbsp;&nbsp;&nbsp;QtDePags: " . $pro_mostrar[5] . "</center></font>"; // como é matriz - posição 5 ?></b>
        <?php
        }
    }    
    ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>