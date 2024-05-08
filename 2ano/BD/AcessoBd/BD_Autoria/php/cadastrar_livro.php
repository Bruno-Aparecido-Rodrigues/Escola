<html>
<head>
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1> Dados do Livro</h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtitle" type="text" id="titulo" placeholder=" " required>
               <label id="labelTitulo" for="titulo">Título</label>
            </div>

            <div class="label-float">
               <input name="txtcate" type="text" id="categoria" placeholder=" " required>
               <label id="labelCategoria" for="categoria">Categoria</label>
            </div>

            <div class="label-float">
               <input name="txtisbn" type="text" id="isbn" placeholder=" " required>
               <label id="labelISBN" for="isbn">ISBN</label>
            </div>

            <div class="label-float">
               <input name="txtidioma" type="text" id="idioma" placeholder=" " required>
               <label id="labelIdioma" for="idioma">Idioma</label>
            </div>

            <div class="label-float">
               <input name="txtqtpag" type="text" id="qtpag" placeholder=" " required>
               <label id="labelqtpag" for="qtpag">QtdePag</label>
            </div>
            

            
            <div class='justify-center'>
            <button name="btnenviar" type="submit" value="Cadastrar">Cadastrar</button>
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

