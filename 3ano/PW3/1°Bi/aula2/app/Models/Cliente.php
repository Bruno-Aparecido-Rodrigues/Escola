<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cliente extends Model
{
    use HasFactory;

    protected $fillable = [ //vai criar uma entidade que contenham essas variaveis
        'nome',
        'telefone',
        'origem',
        'data_de_contato',
        'observacao'
    ];
}
