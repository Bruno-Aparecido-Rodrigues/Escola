<html>
<head>   
<link rel="stylesheet" href="../css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
</head>

<body>
    <form name="cliente"  method = "POST" action = "calt_autoria2.php">
    <div class='container'>
  <div class='card'>
    <h1>Alteração de Autorias Cadastradas</h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtida" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">ID do Autor</label>
            </div>

            <div class="label-float">
               <input name="txtidl" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">ID do Livro</label>
            </div>
            
            <div class='justify-center'>
            <button name="btnenviar" type="submit" value="Consultar">Consultar</button>
            <button name="limpar" type="reset" value="Limpar">Limpar</button>
            </div>

    
  </div>
  </div>

  </form>
          <center>   <br><br><br><br>
          <button><a href = "../menu.html"> Voltar </a></button>
</body>
</html>