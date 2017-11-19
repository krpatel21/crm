$(function(){
    $('.crm-item label').click(function(){
        $(this).parent('form').submit();
    });
});