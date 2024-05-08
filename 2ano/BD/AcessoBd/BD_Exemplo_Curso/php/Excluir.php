<html>
    <body>
     <form name="cliente"  method = "POST" action = "">
        <center><font face="Century Gothic" size="6"><b>Exclusão de Produtos Cadastrados</b><font size="4">

<font face="Century Gothic" size="3"><b>
 </b></center>
 <br>
 <font size="4">
    <form name="cliente" method="POST" action="">
        <fieldset id="a">
           <legend><b> Informe o ID do produto desejado: </b></legend>
           <p> Id: <input name="txtid" type="text" size="20" maxlength="5" placeholder="Id do Produto"> 
           <br><br><center>
           <input name="btnenviar" type="submit" value="Excluir" > &nbsp;&nbsp; 
           <input name="limpar" type="reset" value="Limpar" >
        </fieldset>
    </form>  

<fieldset id="b">
<legend><b> Resultado: </b></legend>
<?php

extract ($_POST, EXTR_OVERWRITE); 
if (isset($btnenviar))
{
    include_once 'Produto.php';
    $p= new Produto();
    $p->setId($txtid);
    echo "<h3>". $p->exclusao(). "</h3>"; //chamada de método - o Sp é o parâmetro enviado 
}
?>
</fieldset>

<center> <br><br><br><br>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>
