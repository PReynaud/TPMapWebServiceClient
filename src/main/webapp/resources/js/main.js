$("#paysSearch").submit(function () {
    window.location.href = "/pays/" + $("#champRecherche").val();
    return false;
});