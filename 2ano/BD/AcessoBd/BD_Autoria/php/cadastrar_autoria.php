<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1> Dados Autoria</h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtcoda" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">Código do Autor</label>
            </div>

            <div class="label-float">
               <input name="txtcodl" type="text" id="codli" placeholder=" " required>
               <label id="labelCategoria" for="categoria">Código do Livro</label>
            </div>

            <div class="label-float">
               <input name="txtedit" type="text" id="ne" placeholder=" " required>
               <label id="labelISBN" for="isbn">Nome da Editora</label>
            </div>

            <div class="label-float">
               <input name="txtdatal" type="text" id="dtl" placeholder=" " required>
               <label id="labelIdioma" for="idioma">Data de Lançamento</label>
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
          include_once 'Autoria.php';
          $pro=new Autoria();
          $pro->setCod_autor($txtcoda);
          $pro->setCod_livro($txtcodl);
          $pro->setDatalancamento($txtdatal);
          $pro->setEditora($txtedit);
          echo "<h3><br><br>" . $pro->salvar() . "</h3>";
      }
      ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>