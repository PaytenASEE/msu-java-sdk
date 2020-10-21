package com.merchantsafeunipay.sdk.request.enumerated;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public enum Role {

    SSADM,

    SADMN,

    SSFU,

    MGSAD,

    MSADM,

    MADMN,

    MAPIU,

    SMAPIU,

    MREPR,

    CSGU,

    RGU,

    FUM,

    FU,

    OMVR,

    OMV,

    OMR,

    OMPA,

    OMVRP,

    GTA,

    ARU,
    /**
     * Zorlu Sales Dealer
     */
    SALES,
    /**
     * Zorlu Void/Refund Dealer
     */
    VDRF,
    /**
     * Zorlu Report Dealer
     */
    REPORT,
    /**
     * Merchant Group Api User
     */
    MGAPIU,
    /**
     * Merchant Marketing User
     */
    MMGU,
    /**
     * Merchant Sales User
     */
    MSLU,
    /**
     * Merchant Finance User
     */
    MFIU,
    /**
     * Merchant Credit/Risk User Basic
     */
    MCRU,
    /**
     * Merchant IT User
     */
    MITU,
    /**
     * Merchant Credit/Risk User Advanced
     */
    MCRUA,
    /**
     * Merchant Accounting User
     */
    MACCU,
    /**
     * Dealer Admin
     */
    DADM,
    /**
     * Dealer User
     */
    DU,
    /**
     * Merchant Super Admin Avrasya
     */
    MSADMA,
    /**
     * Asseco Sales User
     */
    ASAUS,

    /**
     * Login as Merchant User
     */
    LAMU,

    /**
     * Dealer Report User
     */
    SAGE,

    /**
     * Sale manager role
     */
    SLMNG;

    /**
     * Returns group user roles
     *
     * @return
     */
    public static List<Role> getMerchantGroupRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(Role.MGSAD);
        roles.add(Role.RGU);
        roles.add(Role.CSGU);
        roles.add(Role.GTA);
        return roles;
    }

    /**
     * Returns system roles
     *
     * @return
     */
    public static List<Role> getSystemRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(Role.SSADM);
        roles.add(Role.SADMN);
        roles.add(Role.SSFU);
        roles.add(Role.FUM);
        roles.add(Role.LAMU);
        return roles;
    }

    public static List<Role> getSystemRolesExcludingLAMU() {
        return getSystemRoles().stream().filter(r -> r != Role.LAMU).collect(Collectors.toList());
    }

    public static List<Role> getMerchantRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(Role.MADMN);
        roles.add(Role.MAPIU);
        roles.add(Role.MREPR);
        roles.add(Role.MSADM);
        roles.add(Role.OMPA);
        roles.add(Role.OMR);
        roles.add(Role.OMV);
        roles.add(Role.OMVR);
        roles.add(Role.OMVRP);
        roles.add(Role.ARU);
        roles.add(Role.SALES);
        roles.add(Role.VDRF);
        roles.add(Role.REPORT);
        roles.add(Role.MGAPIU);
        roles.add(Role.MMGU);
        roles.add(Role.MCRU);
        roles.add(Role.MFIU);
        roles.add(Role.MSLU);
        roles.add(Role.MITU);
        roles.add(Role.MCRUA);
        roles.add(Role.MACCU);
        roles.add(Role.MSADMA);
        roles.add(Role.ASAUS);
        roles.add(Role.SLMNG);
        roles.add(Role.SAGE);
        return roles;
    }

    public static List<Role> getMerchantRolesWithoutMGSAD() {
        List<Role> roles = new ArrayList<>();
        roles.add(Role.MADMN);
        roles.add(Role.MAPIU);
        roles.add(Role.MREPR);
        roles.add(Role.MSADM);
        roles.add(Role.MSADMA);
        return roles;
    }

    public static List<Role> getDealerRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(DADM);
        roles.add(DU);
        return roles;
    }

    public static List<Role> getMerchantDealerUserRoles() {
        List<Role> roles = new ArrayList<>();
        roles.add(DADM);
        roles.add(MSLU);
        roles.add(DU);
        return roles;
    }

    public static Role fromString(String input) {
        for (Role r : values()) {
            if (r.name().equals(input))
                return r;
        }
        return null;
    }
}
