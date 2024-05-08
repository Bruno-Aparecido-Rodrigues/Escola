<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ClienteController;
/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get("/", [ClienteController::class, "index"]);
Route::post("/adicionarCliente", [ClienteController::class, "adicionar"]);
Route::get("/editar/{id}", [ClienteController::class,"editar"]);
Route::post("/atualizar/{id}", [ClienteController::class,"atualizar"]);
Route::get("/excluir/{id}", [ClienteController::class,"excluir"]);
Route::get("/listar", [ClienteController::class, "listar"]);