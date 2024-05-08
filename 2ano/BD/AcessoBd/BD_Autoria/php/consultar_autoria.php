<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1> Consulta de editoras com livros publicados </h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtedit" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">Nome da Editora</label>
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
        include_once 'Autoria.php';
        $pro = new Autoria();
        $pro -> setEditora($txtedit.'%');
        $pro_bd = $pro->consultar();
        foreach($pro_bd as $pro_mostrar)
        {
        ?> <br>                                                                 
        <b> <?php echo "<font color='white'><center> Cod_Autor:" . $pro_mostrar[0] .  // como é matriz - posição 0 
        "&nbsp;&nbsp;&nbsp;&nbsp;Cod_Livro: " . $pro_mostrar[1] . // como é matriz - posição 1 
        "&nbsp;&nbsp;&nbsp;&nbsp;Data de lançamento: " . $pro_mostrar[2] . // como é matriz - posição 3
        "&nbsp;&nbsp;&nbsp;&nbsp;Editora: " . $pro_mostrar[3] . "</center></font>"; // como é matriz - posição 5 ?></b>

        <?php
        }
    }    
    ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>