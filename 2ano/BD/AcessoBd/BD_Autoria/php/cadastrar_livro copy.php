<html>
    <body>
     <form name="cliente"  method = "POST" action = "">
        <fieldset id="a">
           <legend><b> Dados do Livro: </b></legend>
               <p> Título: <input name="txtitle" type="text" size="40" maxlegth="40" placeholder="title">
               <p> Categoria: <input name="txtcate" type="text" size="40" maxlegth="40" placeholder="categoria">
               <p> ISBN: <input name="txtisbn" type="text" size="40" maxlegth="40" placeholder="isbn">
               <p> Idioma: <input name="txtidioma" type="text" size="40" maxlegth="40" placeholder="idioma">
               <p> QtdePag: <input name="txtqtpag" type="text" size="10" placeholder="0"> </p>

        </fieldset>
         <br>
      <fieldset id="b">
         <legend ><b> Opções: </b></legend>
         <br>
         <input name="btnenviar" type="submit" value="Cadastrar" > &nbsp;&nbsp;
         <input name="limpar" type="reset" value="Limpar" >
      </fieldset>

     </form>

     <?php
     extract($_POST, EXTR_OVERWRITE);
     if(isset($btnenviar))
      {
          include_once 'Livro.php';
          $pro=new Livro();
          $pro->setTitulo($txtitle);
          $pro->setCategoria($txtcate);
          $pro->setISBN($txtisbn);
          $pro->setIdioma($txtidioma);
          $pro->setQtdePag($txtqtpag);
          echo "<h3><br><br>" . $pro->salvar() . "</h3>";
      }
      ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>


