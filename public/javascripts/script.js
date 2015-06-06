function adicionarItemLista(){
	
	$<input type="text" class="form-control" name="contato[]" value="" required>
	
}

function removerItemLista(){
	$(this).parent().remove();
}

function moverItemLista(){

	var text = $(this).parent().value();
	alert('text');

}

$(function(){
	
	$("#btn").on('click', <input type="text" class="form-control" name="contato[]" value="" required>);

	//$(".delete").on('click', removerItemLista);

	$(".mover").on('click', moverItemLista);
});


$(this).keypress(function(event){
	if(event.which == 13){
		adicionarItemLista();	
	}
});

$(document).ready(function() {
    $(document).on('click', '.delete', function() {
        $(this).parent().remove();
    });
	
	$(document).on('click','.mover',function(){
	var address = $(this).parent().clone().children().remove().end().text();
	 $(this).parent().remove();

	$("#listaAprendida").append('<li>'+address+'</li>');
});
});


