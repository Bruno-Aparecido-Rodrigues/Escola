<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Cliente;

class ClienteController extends Controller
{
    public function index(Request $req){
        $cliente = Cliente::all(); //dar um grande select
        return  view('pagina_cadastro')->with("cliente",$cliente); //fazer uma view e passar os dados para essa tela
    }

    public function listar(Request $req){
        $cliente = Cliente::all(); //dar um grande select
        return  view('listar')->with("cliente",$cliente); //fazer uma view e passar os dados para essa tela
    }

    public function adicionar(Request $req){ //tem um request que é todos os campos do formulario
        $cliente = new Cliente; //vai receber a classe de clinte que é um model que contemm todas as classes da entidade
        $cliente->nome = $req->nome; //atribuição de cada um dos campos de acordo com as recebições recebidas antes do igual itens do forms depois dele no banco
        $cliente->telefone = $req->telefone;
        $cliente->origem = $req->origem;
        $cliente->data_de_contato = $req->data_de_contato;
        $cliente->observacao = $req->observacao;
        $cliente->save();//sera feito um insert into nos rep
        return redirect()->back();//redirecionamento para a própria tela um F5
    }

    public function editar(Request $req){ // vai procurar na tabela o id e enviar tudo que tem nela para a tela, tipo um visualisar
        $cliente = Cliente::find($req->id);//ele vai procurar uma clausa um where, filtrar
        return view('editar')->with("cliente", $cliente);//vai levar para a página editar e levar todos os dados para ela
    }

    public function atualizar(Request $req){ // vai receber e atualizar os dados que foram mostrados e editados 
        $cliente = Cliente::find($req->id);
        $cliente->update(
            [
                "nome" => $req->nome, // o => só vai dar update caso os campos tiverem alteração
                "telefone" => $req->telefone,
                "origem" => $req->origem,
                "data_de_contato" => $req->data_de_contato,
                "observacao" => $req->observacao

            ]
         );
            return redirect()->back(); //volta para a própria tela com os dados atualizados

    }

    public function excluir(Request $req){//delete from com a clausula que eu passei, no caso o id
        $cliente = Cliente::find($req->id);
        $cliente->delete();
        return redirect()->back();
    }
}
