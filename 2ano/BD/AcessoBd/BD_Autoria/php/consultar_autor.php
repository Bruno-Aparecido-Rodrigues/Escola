<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    CC
    <div class='container'>
  <div class='card'>
    <h1>Consulta de Autores Cadastrados</h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtautor" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">Nome do Autor</label>
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
        include_once 'Autor.php';
        $pro = new Autor();
        $pro -> setNomeAutor($txtautor.'%');
        $pro_bd = $pro->consultar();
        foreach($pro_bd as $pro_mostrar)
        {
        ?> <br>                                                     
        <b> <?php echo "<font color='white'><center> Cod_Autor:" . $pro_mostrar[0] .  // como é matriz - posição 0 
        "&nbsp;&nbsp;&nbsp;&nbsp;NomeAutor: " . $pro_mostrar[1] . // como é matriz - posição 1 
        "&nbsp;&nbsp;&nbsp;&nbsp;Sobrenome: " . $pro_mostrar[2] . // como é matriz - posição 3
        "&nbsp;&nbsp;&nbsp;&nbsp;email: " . $pro_mostrar[3] . // como é matriz - posição 4
        "&nbsp;&nbsp;&nbsp;&nbsp;Nascimento: " . $pro_mostrar[4] . "</center></font>"; // como é matriz - posição 5 ?></b>
        
        <?php
        }
    }   
    ?> 
          </form>
          <center>   <br><br><br><br>
          <button><a href = "../menu.html"> Voltar </a></button>
</body>
</html>