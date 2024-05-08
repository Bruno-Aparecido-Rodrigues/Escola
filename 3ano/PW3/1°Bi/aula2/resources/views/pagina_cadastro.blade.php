<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Laravel</title>

        <!-- Fonts -->

       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <link href="https://fonts.bunny.net/css2?family=Nunito:wght@400;600;700&display=swap" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>

        <style>
            body {
                font-family: 'Nunito', sans-serif;
            }
        </style>
    </head>
    <body class="antialiased">
    <div class="container">
        <div class="col">
            <div class="row">
                <nav class="navbar navbar-expand-lg bg-dark border-bottom border-body mb-3" data-bs-theme="dark">">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="#">Sistema Web</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                            <div class="navbar-nav">
                                <a class="nav-link active" aria-current="page" href="/">Cadastrar</a>
                                <a class="nav-link" href="/listar">Consultar</a>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
            <div class="row">
                <p>
                <h4>Cadastrar - agendamento de Potencias Clientes </h4>
                </p>
                <P>
                <h5>Sistema Utilizado para agendamento de serviços</h5>
                </P>
            </div>
    <form method="POST" action="/adicionarCliente">
     @csrf    
            <div class="row">
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Nome:</label>
                    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="" name="nome">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Telefone:</label>
                    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="" name="telefone">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Origem:</label>
                    <select class="form-select" aria-label="Default select example" name="origem">
                        <option value="nenhum foi selecionado">Selecionar</option>
                        <option value="Celular">Celular</option>
                        <option value="Telefone fixo">Telefone fixo</option>
                        <option value="Telefone empresarial">Telefone empresarial</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Data de Contato:</label>
                    <input type="date" class="form-control" id="exampleFormControlInput1" placeholder="" name="data_de_contato">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">Observação: </label>
                    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="observacao"></textarea>
                </div>
            </div>
            <div class="col">
            <button type="submit" class="btn btn-dark">Cadastrar</button>
            </div>
    </form>    
        </div>
    </div>
</body>
</html>
