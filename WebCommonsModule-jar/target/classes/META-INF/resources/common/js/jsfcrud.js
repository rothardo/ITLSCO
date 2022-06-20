function handleSubmit(args, dialogId, dialogWv) {
    var jqDialog = jQuery('#' + dialogId);
    if (args.validationFailed) {
        jqDialog.effect('shake', {times: 3}, 100);
        //PF(dialog).effect('shake', {times: 3}, 100);
    } else {
        PF(dialogWv).hide();
        //jqDialog.hide();
    }
}

function handleDialogSave(xhr, dialogId, dialogWv, args) {
    var jqDialog = jQuery('#' + dialogId);
    if (args.validationFailed || !args.editStatus) {
        //PF(jqDialog).jq.effect("shake", {times: 5}, 100);
        jqDialog.effect('shake', {times: 3}, 100);
    } else {
        PF(dialogWv).hide();
        //jqDialog.hide();
    }
}
