<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1> Dados do Autor</h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtnome" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">Nome do Autor</label>
            </div>

            <div class="label-float">
               <input name="txtsobren" type="text" id="codli" placeholder=" " required>
               <label id="labelCategoria" for="categoria">Sobrenome</label>
            </div>

            <div class="label-float">
               <input name="txtemail" type="text" id="ne" placeholder=" " required>
               <label id="labelISBN" for="isbn">Email</label>
            </div>

            <div class="label-float">
               <input name="txtnasc" type="text" id="dtl" placeholder=" " required>
               <label id="labelIdioma" for="idioma">Nascimento</label>
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
         include_once 'Autor.php';
         $pro=new Autor();
         $pro->setNomeAutor($txtnome);
         $pro->setSobrenome($txtsobren);
         $pro->setemail($txtemail);
         $pro->setNasc($txtnasc);
          echo "<h3><br><br>" . $pro->salvar() . "</h3>";
      }
      ?>
      <br>
      <center>
      <button><a href = "../menu.html"> Voltar </a></button>
   </body>
</html>