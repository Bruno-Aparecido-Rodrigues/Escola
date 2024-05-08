</head>
<body>
<center><font face="Century Gothic" size="6"><b>Consulta de Produtos Cadastrados</b><font size="4">

<font face="Century Gothic" size="3"></center> <br>
<font size="4">

<form name="clients" method="POST" action="">
     <fieldset id="a">
        <legend><b> Informe o Nome do produto desejado: </b></legend>
           <p> Nome: <input name="txtnome" type="text" size="40" maxlength="40" placeholder="Nome do Produto">
            <br><br><center>
            <input name="btnenviar" type="submit" value="Consultar"> &nbsp;&nbsp; <input name="limpar" type="reset" value="Limpar" >
    </fieldset>

<br>

<fieldset id="b">
<legend><b> Resultado: </b></legend>

    <?php
    extract($_POST, EXTR_OVERWRITE);
    if(isset($btnenviar))
    {
        include_once 'Produto.php';
        $pro = new Produto();
        $pro -> setNome($txtnome.'%');
        $pro_bd = $pro->consultar();
        foreach($pro_bd as $pro_mostrar)
        {
        ?> <br>
         <b> <?php echo "ID: " . $pro_mostrar[0]; // como é matriz - posição 0 ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "Nome: " . $pro_mostrar[1]; // como é matriz - posição 1 ?></b>    &nbsp;&nbsp;&nbsp;&nbsp;
         <b> <?php echo "Estoque: " . $pro_mostrar[2]; // como é matriz - posição 2 ?></b>
        <?php
        }
    }    
    ?>
    </filedset>
          </form>
          <center>   <br><br><br><br>
          <button><a href = "../menu.html"> Voltar </a></button>
</body>
</html>